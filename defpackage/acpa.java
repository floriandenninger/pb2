package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpa implements aftc {
    public final SharedPreferences a;

    public acpa(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }

    static final String d(afsx afsxVar) {
        String d = afsxVar.d();
        return d.length() != 0 ? "client_event_id_manager_client_count_identity_".concat(d) : new String("client_event_id_manager_client_count_identity_");
    }

    public static final String e(afsx afsxVar) {
        String d = afsxVar.d();
        return d.length() != 0 ? "client_event_id_manager_event_id_for_identity_".concat(d) : new String("client_event_id_manager_event_id_for_identity_");
    }

    private final synchronized void f(afsx afsxVar) {
        if (afsxVar == null) {
            return;
        }
        String d = d(afsxVar);
        if (this.a.contains(d)) {
            this.a.edit().remove(d).apply();
        }
        String e = e(afsxVar);
        if (this.a.contains(e)) {
            this.a.edit().remove(e).apply();
        }
    }

    public final synchronized long a(afsx afsxVar) {
        String d = d(afsxVar);
        long j = this.a.getLong(d, -1L);
        if (j == -1) {
            return j;
        }
        this.a.edit().putLong(d, j < 65535 ? 1 + j : 1L).apply();
        return j;
    }

    @Override // defpackage.aftc
    public final void b(afsx afsxVar) {
        f(afsxVar);
    }

    public final synchronized void c(afsx afsxVar) {
        String d = d(afsxVar);
        if (this.a.contains(d)) {
            return;
        }
        this.a.edit().putLong(d, 1L).apply();
    }
}
