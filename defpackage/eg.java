package defpackage;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eg {
    private static String b;
    private static ef e;
    private final Context f;
    private final NotificationManager g;
    private static final Object a = new Object();
    private static Set c = new HashSet();
    private static final Object d = new Object();

    private eg(Context context) {
        this.f = context;
        this.g = (NotificationManager) context.getSystemService("notification");
    }

    public static eg a(Context context) {
        return new eg(context);
    }

    public static Set b(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (a) {
            if (string != null) {
                if (!string.equals(b)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    c = hashSet;
                    b = string;
                }
            }
            set = c;
        }
        return set;
    }

    public final void c(int i) {
        d(null, i);
    }

    public final void d(String str, int i) {
        this.g.cancel(str, i);
    }

    public final void e(int i, Notification notification) {
        f(null, i, notification);
    }

    public final void f(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.g.notify(str, i, notification);
            return;
        }
        ec ecVar = new ec(this.f.getPackageName(), i, str, notification);
        synchronized (d) {
            if (e == null) {
                e = new ef(this.f.getApplicationContext());
            }
            e.a.obtainMessage(0, ecVar).sendToTarget();
        }
        this.g.cancel(str, i);
    }

    public final boolean g() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.g.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f.getApplicationInfo();
        String packageName = this.f.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            return ((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
