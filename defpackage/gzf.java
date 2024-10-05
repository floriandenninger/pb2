package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gzf {
    private static final long a = TimeUnit.HOURS.toMillis(48);
    private final Context b;
    private final SharedPreferences c;
    private final shf d;

    public gzf(Context context, SharedPreferences sharedPreferences, shf shfVar) {
        this.b = context;
        this.c = sharedPreferences;
        this.d = shfVar;
    }

    public final void a() {
        long j;
        if (b()) {
            return;
        }
        long c = this.d.c();
        long j2 = this.c.getLong("lens_last_check_time", 0L);
        if (j2 <= 0 || c - j2 >= a) {
            try {
                PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    j = packageInfo.getLongVersionCode();
                } else {
                    j = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                j = -1;
            }
            this.c.edit().putBoolean("lens_available", j >= 301130682).putLong("lens_last_check_time", c).apply();
        }
    }

    public final boolean b() {
        return this.c.getBoolean("lens_available", false);
    }
}
