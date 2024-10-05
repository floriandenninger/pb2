package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alyh {
    public static final amxj a = amxj.l("com/google/apps/tiktok/account/api/controller/Config");
    public final boolean b;
    public final amru c;

    public alyh() {
    }

    public alyh(boolean z, amru amruVar) {
        this.b = z;
        this.c = amruVar;
    }

    public static alyg a() {
        alyg alygVar = new alyg();
        alygVar.c(false);
        alygVar.b(amaq.class);
        return alygVar;
    }

    public static alyg b(Activity activity) {
        if (!c()) {
            Intent intent = activity.getIntent();
            Set<String> categories = intent.getCategories();
            ComponentName callingActivity = activity.getCallingActivity();
            if ((categories == null || categories.isEmpty()) && ((callingActivity == null || activity.getPackageName().equals(callingActivity.getPackageName())) && (intent.getFlags() & 268435456) == 0 && intent.getData() == null && intent.getClipData() == null && intent.getType() == null)) {
                ((amxh) ((amxh) a.g()).i("com/google/apps/tiktok/account/api/controller/Config", "forExternalActivity", 84, "Config.java")).s("External config used on invalid activity: %s", activity.getClass());
            }
        }
        alyg a2 = a();
        a2.c(true);
        return a2;
    }

    public static boolean c() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alyh) {
            alyh alyhVar = (alyh) obj;
            if (this.b == alyhVar.b && amkq.aV(this.c, alyhVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
    }

    public final String toString() {
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73 + "null".length());
        sb.append("Config{canSwitchAccounts=");
        sb.append(z);
        sb.append(", initialSelectors=");
        sb.append(valueOf);
        sb.append(", overrideRequirements=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
