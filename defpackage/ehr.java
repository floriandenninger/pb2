package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ehr implements amen, axqj {
    public final Activity a;
    public final efz b;
    public azrw c;
    public azrw d;
    public azrw e;
    public azrw f;
    public azrw g;
    public azrw h;
    public azrw i;
    public azrw j;
    public azrw k;
    public azrw l;
    public azrw m;
    public azrw n;
    public azrw o;
    public azrw p;
    public azrw q;
    public azrw r;
    public final ames s;
    private final ehy t;
    private final ehs u;
    private final ehr v;

    public ehr(efz efzVar, ehy ehyVar, ehs ehsVar, Activity activity, ames amesVar) {
        this.v = this;
        this.b = efzVar;
        this.t = ehyVar;
        this.u = ehsVar;
        this.a = activity;
        this.s = amesVar;
        this.c = axqx.a(new edz(this, 0));
        this.d = new edz(this, 2);
        this.e = axqx.a(new edz(this, 4));
        this.f = axqx.a(new edz(this, 5));
        this.g = axqx.a(new edz(this, 6));
        this.h = axqx.a(new edz(this, 7));
        this.i = axqx.a(new edz(this, 9));
        this.j = axqx.a(new edz(this, 8));
        this.k = new axqp();
        this.l = new edz(this, 12);
        this.m = axqx.a(new edz(this, 11));
        this.n = axqx.a(new edz(this, 10));
        this.o = axqx.a(new edz(this, 13));
        this.p = axqx.a(new edz(this, 14));
        this.q = axqx.a(new edz(this, 15));
        this.r = new edz(this, 3);
        axqp.a(this.k, axqq.b(new edz(this, 1)));
    }

    public final Activity a() {
        Activity activity = this.a;
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Attempted use of the activity when it is null");
    }

    public final hav b() {
        hav cf = ((had) ((axqk) ((ames) this.c.get()).a()).lM()).cf();
        ayaw.k(cf);
        return cf;
    }

    public final iip c() {
        iip cK = ((ifs) ((axqk) ((ames) this.c.get()).a()).lM()).cK();
        ayaw.k(cK);
        return cK;
    }

    public final SettingsDataAccess d() {
        SettingsDataAccess ei = ((lly) ((axqk) ((ames) this.c.get()).a()).lM()).ei();
        ayaw.k(ei);
        return ei;
    }

    public final aahd e() {
        aahd hD = ((aahl) ((axqk) ((ames) this.c.get()).a()).lM()).hD();
        ayaw.k(hD);
        return hD;
    }

    public final acqz f() {
        acqz iw = ((iys) ((axqk) ((ames) this.c.get()).a()).lM()).iw();
        ayaw.k(iw);
        return iw;
    }

    public final acra g() {
        acra iz = ((iys) ((axqk) ((ames) this.c.get()).a()).lM()).iz();
        ayaw.k(iz);
        return iz;
    }

    @Override // defpackage.amen
    public final eel h() {
        return new eel(this.b, this.t, this.u, this.v);
    }

    public ehr() {
    }
}
