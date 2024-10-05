package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bakn extends bajf implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    @Override // defpackage.bajf
    public bajp A() {
        return balz.j(bajr.b);
    }

    @Override // defpackage.bajf
    public bajp B() {
        return balz.j(bajr.g);
    }

    @Override // defpackage.bajf
    public bajp C() {
        return balz.j(bajr.a);
    }

    @Override // defpackage.bajf
    public bajp D() {
        return balz.j(bajr.h);
    }

    @Override // defpackage.bajf
    public bajp E() {
        return balz.j(bajr.i);
    }

    @Override // defpackage.bajf
    public bajp F() {
        return balz.j(bajr.l);
    }

    @Override // defpackage.bajf
    public bajp G() {
        return balz.j(bajr.j);
    }

    @Override // defpackage.bajf
    public bajp H() {
        return balz.j(bajr.e);
    }

    @Override // defpackage.bajf
    public bajp I() {
        return balz.j(bajr.k);
    }

    @Override // defpackage.bajf
    public bajp J() {
        return balz.j(bajr.f);
    }

    @Override // defpackage.bajf
    public bajp K() {
        return balz.j(bajr.c);
    }

    @Override // defpackage.bajf
    public bajp L() {
        return balz.j(bajr.d);
    }

    @Override // defpackage.bajf
    public final int[] M(bakb bakbVar, long j) {
        int c = bakbVar.c();
        int[] iArr = new int[c];
        long j2 = 0;
        if (j != 0) {
            for (int i = 0; i < c; i++) {
                bajp a = bakbVar.d(i).a(this);
                if (a.g()) {
                    int a2 = a.a(j, j2);
                    j2 = a.b(j2, a2);
                    iArr[i] = a2;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.bajf
    public bajh c() {
        return baly.u(bajj.e, A());
    }

    @Override // defpackage.bajf
    public bajh d() {
        return baly.u(bajj.r, E());
    }

    @Override // defpackage.bajf
    public bajh e() {
        return baly.u(bajj.q, E());
    }

    @Override // defpackage.bajf
    public bajh f() {
        return baly.u(bajj.j, B());
    }

    @Override // defpackage.bajf
    public bajh g() {
        return baly.u(bajj.n, B());
    }

    @Override // defpackage.bajf
    public bajh h() {
        return baly.u(bajj.h, B());
    }

    @Override // defpackage.bajf
    public bajh i() {
        return baly.u(bajj.c, C());
    }

    @Override // defpackage.bajf
    public bajh j() {
        return baly.u(bajj.o, D());
    }

    @Override // defpackage.bajf
    public bajh k() {
        return baly.u(bajj.s, E());
    }

    @Override // defpackage.bajf
    public bajh l() {
        return baly.u(bajj.p, E());
    }

    @Override // defpackage.bajf
    public bajh m() {
        return baly.u(bajj.x, F());
    }

    @Override // defpackage.bajf
    public bajh n() {
        return baly.u(bajj.y, F());
    }

    @Override // defpackage.bajf
    public bajh o() {
        return baly.u(bajj.t, G());
    }

    @Override // defpackage.bajf
    public bajh p() {
        return baly.u(bajj.u, G());
    }

    @Override // defpackage.bajf
    public bajh q() {
        return baly.u(bajj.i, H());
    }

    @Override // defpackage.bajf
    public bajh r() {
        return baly.u(bajj.v, I());
    }

    @Override // defpackage.bajf
    public bajh s() {
        return baly.u(bajj.w, I());
    }

    @Override // defpackage.bajf
    public bajh t() {
        return baly.u(bajj.m, J());
    }

    @Override // defpackage.bajf
    public bajh u() {
        return baly.u(bajj.l, K());
    }

    @Override // defpackage.bajf
    public bajh v() {
        return baly.u(bajj.k, K());
    }

    @Override // defpackage.bajf
    public bajh w() {
        return baly.u(bajj.g, L());
    }

    @Override // defpackage.bajf
    public bajh x() {
        return baly.u(bajj.f, L());
    }

    @Override // defpackage.bajf
    public bajh y() {
        return baly.u(bajj.d, L());
    }
}
