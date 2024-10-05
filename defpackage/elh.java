package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import com.google.android.apps.youtube.app.application.Shell_HomeActivity;
import com.google.android.apps.youtube.app.application.Shell_UrlActivity;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class elh implements MessageQueue.IdleHandler, elf, acso {
    private final Context a;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final azrr b = azrr.ab();

    public elh(Context context) {
        this.a = context;
    }

    private final boolean h(Intent intent, String str, Class cls) {
        String name = cls.getName();
        if (name.equals(str)) {
            return true;
        }
        ResolveInfo resolveActivity = this.a.getPackageManager().resolveActivity(intent, 65536);
        return (resolveActivity == null || resolveActivity.activityInfo == null || !name.equals(resolveActivity.activityInfo.targetActivity)) ? false : true;
    }

    @Override // defpackage.elf
    public final int a() {
        ActivityManager.RecentTaskInfo taskInfo;
        Intent intent;
        ComponentName component;
        int i = 0;
        if (!this.b.af()) {
            ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
            List<ActivityManager.AppTask> appTasks = activityManager == null ? null : activityManager.getAppTasks();
            if (appTasks != null) {
                if (appTasks.isEmpty()) {
                    i = 3;
                } else {
                    ActivityManager.AppTask appTask = appTasks.get(0);
                    if (appTask != null && (taskInfo = appTask.getTaskInfo()) != null && (intent = taskInfo.baseIntent) != null && (component = intent.getComponent()) != null) {
                        String className = component.getClassName();
                        if (h(intent, className, Shell_HomeActivity.class)) {
                            i = 1;
                        } else {
                            i = h(intent, className, Shell_UrlActivity.class) ? 2 : 5;
                        }
                    }
                }
            }
            if (i != 0) {
                this.b.sc(Integer.valueOf(i));
            }
            return i;
        }
        Integer num = (Integer) this.b.ac();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // defpackage.elf
    public final void b(int i) {
        this.b.sc(Integer.valueOf(i));
    }

    @Override // defpackage.acsn
    public final void c() {
        b(3);
    }

    @Override // defpackage.acso
    public final ayqj d() {
        return this.b.G(eoe.b);
    }

    @Override // defpackage.acso
    public final void e() {
        this.c.set(true);
    }

    @Override // defpackage.acso
    public final void f() {
        if (Build.VERSION.SDK_INT < 23) {
            yjk.f();
            Looper.myQueue().addIdleHandler(this);
        } else {
            Looper.getMainLooper().getQueue().addIdleHandler(this);
        }
    }

    @Override // defpackage.acso
    public final boolean g() {
        return true;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        if (this.c.get()) {
            return false;
        }
        b(3);
        return false;
    }
}
