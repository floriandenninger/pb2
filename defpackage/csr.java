package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csr {
    public final cso a;
    public final ctg b;
    public final csm c;
    public final crv d;
    public final cuk e;
    public final gm f;
    public final amsj g;
    private final csp h;

    public csr(cuk cukVar, cub cubVar, cuv cuvVar, cuv cuvVar2, cuv cuvVar3, boolean z) {
        this.e = cukVar;
        csp cspVar = new csp(cubVar);
        this.h = cspVar;
        crv crvVar = new crv(z);
        this.d = crvVar;
        synchronized (this) {
            synchronized (crvVar) {
                crvVar.e = this;
            }
        }
        this.f = new gm();
        this.g = new amsj((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
        this.a = new cso(cuvVar, cuvVar2, cuvVar3, this, this);
        this.c = new csm(cspVar);
        this.b = new ctg();
        cukVar.a = this;
    }

    public final synchronized void a(csv csvVar, cqi cqiVar) {
        this.g.B(cqiVar, csvVar);
    }

    public final synchronized void b(csv csvVar, cqi cqiVar, csx csxVar) {
        if (csxVar != null) {
            if (csxVar.a) {
                this.d.b(cqiVar, csxVar);
            }
        }
        this.g.B(cqiVar, csvVar);
    }

    public final void c(cqi cqiVar, csx csxVar) {
        this.d.d(cqiVar);
        if (csxVar.a) {
            this.e.d(cqiVar, csxVar);
        } else {
            this.b.a(csxVar, false);
        }
    }
}
