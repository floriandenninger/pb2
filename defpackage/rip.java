package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rip extends rdv {
    public volatile rij b;
    public volatile rij c;
    protected rij d;
    public final Map e;
    public Activity f;
    public volatile boolean g;
    public volatile rij h;
    public rij i;
    public boolean j;
    public final Object k;
    public String l;

    public rip(rgt rgtVar) {
        super(rgtVar);
        this.k = new Object();
        this.e = new ConcurrentHashMap();
    }

    @Override // defpackage.rdv
    protected final boolean d() {
        return false;
    }

    public final rij e(Activity activity) {
        qip.an(activity);
        rij rijVar = (rij) this.e.get(activity);
        if (rijVar == null) {
            rij rijVar2 = new rij(null, v(activity.getClass()), N().q());
            this.e.put(activity, rijVar2);
            rijVar = rijVar2;
        }
        return this.h != null ? this.h : rijVar;
    }

    public final rij o() {
        return p(false);
    }

    public final rij p(boolean z) {
        a();
        n();
        if (!z) {
            return this.d;
        }
        rij rijVar = this.d;
        return rijVar != null ? rijVar : this.i;
    }

    public final void q(Activity activity, rij rijVar, boolean z) {
        rij rijVar2;
        rij rijVar3 = this.b == null ? this.c : this.b;
        if (rijVar.b == null) {
            rijVar2 = new rij(rijVar.a, activity != null ? v(activity.getClass()) : null, rijVar.c, rijVar.e, rijVar.f);
        } else {
            rijVar2 = rijVar;
        }
        this.c = this.b;
        this.b = rijVar2;
        Q();
        aG().g(new ril(this, rijVar2, rijVar3, SystemClock.elapsedRealtime(), z));
    }

    public final void r(rij rijVar, rij rijVar2, long j, boolean z, Bundle bundle) {
        long j2;
        long j3;
        n();
        boolean z2 = false;
        boolean z3 = (rijVar2 != null && rijVar2.c == rijVar.c && rkm.ap(rijVar2.b, rijVar.b) && rkm.ap(rijVar2.a, rijVar.a)) ? false : true;
        if (z && this.d != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            rkm.D(rijVar, bundle2, true);
            if (rijVar2 != null) {
                String str = rijVar2.a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = rijVar2.b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", rijVar2.c);
            }
            if (z2) {
                long e = m().e(j);
                if (e > 0) {
                    N().C(bundle2, e);
                }
            }
            if (!J().r()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != rijVar.e ? "auto" : "app";
            Q();
            long currentTimeMillis = System.currentTimeMillis();
            if (rijVar.e) {
                j2 = currentTimeMillis;
                long j4 = rijVar.f;
                if (j4 != 0) {
                    j3 = j4;
                    j().w(str3, "_vs", j3, bundle2);
                }
            } else {
                j2 = currentTimeMillis;
            }
            j3 = j2;
            j().w(str3, "_vs", j3, bundle2);
        }
        if (z2) {
            t(this.d, true, j);
        }
        this.d = rijVar;
        if (rijVar.e) {
            this.i = rijVar;
        }
        l().x(rijVar);
    }

    public final void s(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!J().r() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.e.put(activity, new rij(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void t(rij rijVar, boolean z, long j) {
        rdt g = g();
        Q();
        g.e(SystemClock.elapsedRealtime());
        if (!m().p(rijVar != null && rijVar.d, z, j) || rijVar == null) {
            return;
        }
        rijVar.d = false;
    }

    public final void u(String str, rij rijVar) {
        n();
        synchronized (this) {
            String str2 = this.l;
            if (str2 == null || str2.equals(str) || rijVar != null) {
                this.l = str;
            }
        }
    }

    public final String v(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str = length > 0 ? split[length - 1] : "";
        int length2 = str.length();
        J();
        if (length2 <= 100) {
            return str;
        }
        J();
        return str.substring(0, 100);
    }
}
