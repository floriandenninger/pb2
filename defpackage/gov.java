package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gov {
    private final SharedPreferences a;
    private final shf b;
    private final String c;
    private final long d;

    public gov(SharedPreferences sharedPreferences, shf shfVar, String str, long j, TimeUnit timeUnit) {
        this.a = sharedPreferences;
        this.c = str;
        this.b = shfVar;
        this.d = timeUnit.toMillis(j);
    }

    public static boolean c(SharedPreferences sharedPreferences, long j, long j2, long j3) {
        return sharedPreferences.getBoolean("bypass_rate_limit", false) || j + j2 <= j3;
    }

    public static boolean d(SharedPreferences sharedPreferences, String str, long j, long j2) {
        return c(sharedPreferences, sharedPreferences.getLong(str, 0L), j, j2);
    }

    public final void a() {
        this.a.edit().putLong(this.c, this.b.c()).apply();
    }

    public final boolean b() {
        return d(this.a, this.c, this.d, this.b.c());
    }
}
