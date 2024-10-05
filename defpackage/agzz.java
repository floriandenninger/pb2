package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agzz {
    private final SharedPreferences a;
    private final afsy b;

    public agzz(SharedPreferences sharedPreferences, afsy afsyVar) {
        this.a = sharedPreferences;
        this.b = afsyVar;
    }

    private static final String d(afsx afsxVar) {
        return yny.L("%s_uses_offline", afsxVar.d());
    }

    public final synchronized int a() {
        afsx c = this.b.c();
        if (c.z()) {
            return 2;
        }
        String d = d(c);
        if (this.a.contains(d)) {
            return this.a.getBoolean(d, false) ? 1 : 2;
        }
        return 0;
    }

    public final synchronized void b(boolean z) {
        afsx c = this.b.c();
        if (c.z()) {
            return;
        }
        this.a.edit().putBoolean(d(c), z).apply();
    }

    public final boolean c() {
        return a() != 2;
    }
}
