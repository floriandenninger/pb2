package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avk implements pny, awb, bhn, bby, bex, aym {
    public final psf a;
    public final avj b;
    public final SparseArray c;
    public psv d;
    public poa e;
    public pso f;
    public boolean g;
    private final pos h;
    private final pot i;

    public avk(psf psfVar) {
        this.a = psfVar;
        this.d = new psv(pts.z(), psfVar, plx.a);
        pos posVar = new pos();
        this.h = posVar;
        this.i = new pot();
        this.b = new avj(posVar);
        this.c = new SparseArray();
    }

    private final avl ar() {
        return at(this.b.d);
    }

    private final avl as() {
        return at(this.b.e);
    }

    private final avl at(ash ashVar) {
        pse.c(this.e);
        pou c = ashVar == null ? null : this.b.c(ashVar);
        if (ashVar == null || c == null) {
            int k = this.e.k();
            pou s = this.e.s();
            if (k >= s.h()) {
                s = pou.d;
            }
            return I(s, k, null);
        }
        return I(c, c.jH(ashVar.a, this.h).c, ashVar);
    }

    private final avl au(int i, ash ashVar) {
        pse.c(this.e);
        if (ashVar != null) {
            if (this.b.c(ashVar) != null) {
                return at(ashVar);
            }
            return I(pou.d, i, ashVar);
        }
        pou s = this.e.s();
        if (i >= s.h()) {
            s = pou.d;
        }
        return I(s, i, null);
    }

    @Override // defpackage.bhn
    public final void A(String str) {
        H(as(), 1024, new avd(1));
    }

    @Override // defpackage.bhn
    public final void B(auj aujVar) {
        avl ar = ar();
        H(ar, 1025, new aut(ar, aujVar, 2));
    }

    @Override // defpackage.bhn
    public final void C(auj aujVar) {
        avl as = as();
        H(as, 1020, new aut(as, aujVar, 3));
    }

    @Override // defpackage.bhn
    public final void D(long j, int i) {
        H(ar(), 1026, new aul(5));
    }

    @Override // defpackage.bhn
    public final void E(final pms pmsVar, final auk aukVar) {
        final avl as = as();
        H(as, 1022, new pss() { // from class: aux
            @Override // defpackage.pss
            public final void a(Object obj) {
                avl avlVar = avl.this;
                pms pmsVar2 = pmsVar;
                auk aukVar2 = aukVar;
                avm avmVar = (avm) obj;
                avmVar.al();
                avmVar.am(avlVar, aukVar2);
                avmVar.f(avlVar, 2, pmsVar2);
            }
        });
    }

    @Override // defpackage.pny, defpackage.bhn
    public final void F(final aso asoVar) {
        final avl as = as();
        H(as, 1028, new pss() { // from class: aus
            @Override // defpackage.pss
            public final void a(Object obj) {
                avl avlVar = avl.this;
                aso asoVar2 = asoVar;
                avm avmVar = (avm) obj;
                avmVar.an();
                int i = asoVar2.a;
                int i2 = asoVar2.b;
                int i3 = asoVar2.c;
                avmVar.ap(avlVar, i, i2, asoVar2.d);
            }
        });
    }

    public final void G(avm avmVar) {
        this.d.e(avmVar);
    }

    public final void H(avl avlVar, int i, pss pssVar) {
        this.c.put(i, avlVar);
        this.d.f(i, pssVar);
    }

    protected final avl I(pou pouVar, int i, ash ashVar) {
        ash ashVar2 = true == pouVar.z() ? null : ashVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = pouVar.equals(this.e.s()) && i == this.e.k();
        long j = 0;
        if (ashVar2 == null || !ashVar2.a()) {
            if (!z) {
                if (!pouVar.z()) {
                    j = pouVar.y(i, this.i).a();
                }
            } else {
                pom pomVar = (pom) this.e;
                pomVar.Q();
                j = pomVar.c.o();
            }
        } else if (z && this.e.S() == ashVar2.b && this.e.j() == ashVar2.c) {
            j = this.e.p();
        }
        ash ashVar3 = this.b.c;
        pou s = this.e.s();
        int k = this.e.k();
        long p = this.e.p();
        pom pomVar2 = (pom) this.e;
        pomVar2.Q();
        return new avl(elapsedRealtime, pouVar, i, ashVar2, j, s, k, ashVar3, p, plh.d(pomVar2.c.u.p));
    }

    @Override // defpackage.bby
    public final void J(int i, ash ashVar, final bbn bbnVar) {
        final avl au = au(i, ashVar);
        H(au, 1004, new pss() { // from class: auv
            @Override // defpackage.pss
            public final void a(Object obj) {
                ((avm) obj).g(avl.this, bbnVar);
            }
        });
    }

    @Override // defpackage.aym
    public final void K(int i, ash ashVar) {
        H(au(i, ashVar), 1031, new aul(4));
    }

    @Override // defpackage.aym
    public final void L(int i, ash ashVar) {
        H(au(i, ashVar), 1034, new aul(7));
    }

    @Override // defpackage.aym
    public final void M(int i, ash ashVar) {
        H(au(i, ashVar), 1033, new aul(13));
    }

    @Override // defpackage.aym
    public final void N(int i, ash ashVar, int i2) {
        H(au(i, ashVar), 1030, new avd(5));
    }

    @Override // defpackage.aym
    public final void O(int i, ash ashVar, Exception exc) {
        avl au = au(i, ashVar);
        H(au, 1032, new ava(au, exc, 1));
    }

    @Override // defpackage.aym
    public final void P(int i, ash ashVar) {
        H(au(i, ashVar), 1035, new aul(19));
    }

    @Override // defpackage.bby
    public final void Q(int i, ash ashVar, bbi bbiVar, bbn bbnVar) {
        H(au(i, ashVar), 1002, new aul(8));
    }

    @Override // defpackage.bby
    public final void R(int i, ash ashVar, bbi bbiVar, bbn bbnVar) {
        H(au(i, ashVar), 1001, new aul(9));
    }

    @Override // defpackage.bby
    public final void S(int i, ash ashVar, final bbi bbiVar, final bbn bbnVar, final IOException iOException, final boolean z) {
        final avl au = au(i, ashVar);
        H(au, 1003, new pss() { // from class: auu
            @Override // defpackage.pss
            public final void a(Object obj) {
                ((avm) obj).j(avl.this, bbiVar, bbnVar, iOException, z);
            }
        });
    }

    @Override // defpackage.bby
    public final void T(int i, ash ashVar, bbi bbiVar, bbn bbnVar) {
        H(au(i, ashVar), 1000, new aul(10));
    }

    @Override // defpackage.bby
    public final void U(int i, ash ashVar, bbn bbnVar) {
        H(au(i, ashVar), 1005, new aul(11));
    }

    @Override // defpackage.awb
    public final /* synthetic */ void V() {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void W() {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void X() {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void Y() {
    }

    @Override // defpackage.aym
    public final /* synthetic */ void Z() {
    }

    public final avl a() {
        return at(this.b.c);
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.pnw
    public final void ae(final int i) {
        avj avjVar = this.b;
        poa poaVar = this.e;
        pse.c(poaVar);
        avjVar.c = avj.b(poaVar, avjVar.b, avjVar.d, avjVar.a);
        avjVar.a(poaVar.s());
        final avl a = a();
        H(a, 0, new pss() { // from class: aum
            @Override // defpackage.pss
            public final void a(Object obj) {
                ((avm) obj).t(avl.this, i);
            }
        });
    }

    @Override // defpackage.bhn
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.pny
    public final void ag() {
        H(as(), 1016, new aul(6));
    }

    @Override // defpackage.pnw
    public final void ah() {
        H(a(), 13, new aul(15));
    }

    @Override // defpackage.pnw
    public final void ai() {
        H(a(), 1, new aul(12));
    }

    @Override // defpackage.pnw
    public final void aj() {
        H(a(), 14, new aul(14));
    }

    @Override // defpackage.pny
    public final void ak() {
        H(a(), 1007, new aul(16));
    }

    @Override // defpackage.pnw
    public final void al() {
        H(a(), 5, new avd(2));
    }

    @Override // defpackage.pnw
    public final void am() {
        H(a(), 6, new aul(1));
    }

    @Override // defpackage.pnw
    public final void an() {
        H(a(), 8, new aul(0));
    }

    @Override // defpackage.pny
    public final void ao() {
        H(as(), 1029, new aul(2));
    }

    @Override // defpackage.pnw
    public final void ap(final asj asjVar) {
        H(a(), 2, new pss() { // from class: aur
            @Override // defpackage.pss
            public final void a(Object obj) {
                ((avm) obj).ae(asj.this);
            }
        });
    }

    @Override // defpackage.pny
    public final void aq() {
        H(as(), 1019, new avd(4));
    }

    public final void b(avm avmVar) {
        pse.c(avmVar);
        this.d.a(avmVar);
    }

    @Override // defpackage.awb
    public final void c(Exception exc) {
        H(as(), 1037, new aul(17));
    }

    @Override // defpackage.awb
    public final void d(String str, long j, long j2) {
        avl as = as();
        H(as, 1009, new avc(as, str, j2, j, 1));
    }

    @Override // defpackage.awb
    public final void e(String str) {
        H(as(), 1013, new aul(20));
    }

    @Override // defpackage.awb
    public final void f(auj aujVar) {
        avl ar = ar();
        H(ar, 1014, new aut(ar, aujVar, 1));
    }

    @Override // defpackage.awb
    public final void g(auj aujVar) {
        avl as = as();
        H(as, 1008, new aut(as, aujVar, 0));
    }

    @Override // defpackage.awb
    public final void h(final pms pmsVar, auk aukVar) {
        final avl as = as();
        H(as, 1010, new pss() { // from class: auw
            @Override // defpackage.pss
            public final void a(Object obj) {
                avl avlVar = avl.this;
                pms pmsVar2 = pmsVar;
                avm avmVar = (avm) obj;
                avmVar.C();
                avmVar.D();
                avmVar.f(avlVar, 1, pmsVar2);
            }
        });
    }

    @Override // defpackage.awb
    public final void i(final long j) {
        final avl as = as();
        H(as, 1011, new pss() { // from class: auq
            @Override // defpackage.pss
            public final void a(Object obj) {
                ((avm) obj).b(avl.this, j);
            }
        });
    }

    @Override // defpackage.awb
    public final void j(Exception exc) {
        H(as(), 1018, new aul(18));
    }

    @Override // defpackage.awb
    public final void k(final int i, final long j, final long j2) {
        final avl as = as();
        H(as, 1012, new pss() { // from class: auo
            @Override // defpackage.pss
            public final void a(Object obj) {
                ((avm) obj).c(avl.this, i, j, j2);
            }
        });
    }

    @Override // defpackage.bex
    public final void l(int i, long j, long j2) {
        avj avjVar = this.b;
        H(at(avjVar.b.isEmpty() ? null : (ash) amkq.bj(avjVar.b)), 1006, new aul(3));
    }

    @Override // defpackage.bhn
    public final void m(final int i, final long j) {
        final avl ar = ar();
        H(ar, 1023, new pss() { // from class: aun
            @Override // defpackage.pss
            public final void a(Object obj) {
                ((avm) obj).i(avl.this, i, j);
            }
        });
    }

    @Override // defpackage.pnw
    public final void n(boolean z) {
        avl a = a();
        H(a, 3, new ave(a, z, 1));
    }

    @Override // defpackage.pnw
    public final void o(boolean z) {
        H(a(), 7, new avd(0));
    }

    @Override // defpackage.pnw
    public final void p(final pnu pnuVar) {
        final avl a = a();
        H(a, 12, new pss() { // from class: auz
            @Override // defpackage.pss
            public final void a(Object obj) {
                ((avm) obj).l(avl.this, pnuVar);
            }
        });
    }

    @Override // defpackage.pnw
    public final void q(int i) {
        H(a(), 4, new plw(i, 1));
    }

    @Override // defpackage.pnw
    public final void r(final pns pnsVar) {
        ash ashVar;
        final avl avlVar = null;
        if ((pnsVar instanceof plp) && (ashVar = ((plp) pnsVar).f) != null) {
            avlVar = at(new ash(ashVar));
        }
        if (avlVar == null) {
            avlVar = a();
        }
        H(avlVar, 10, new pss() { // from class: auy
            @Override // defpackage.pss
            public final void a(Object obj) {
                ((avm) obj).m(avl.this, pnsVar);
            }
        });
    }

    @Override // defpackage.pnw
    public final void s(final boolean z, final int i) {
        final avl a = a();
        H(a, -1, new pss() { // from class: avg
            @Override // defpackage.pss
            public final void a(Object obj) {
                ((avm) obj).n(avl.this, z, i);
            }
        });
    }

    @Override // defpackage.pnw
    public final void t(final pnz pnzVar, final pnz pnzVar2, final int i) {
        if (i == 1) {
            this.g = false;
            i = 1;
        }
        avj avjVar = this.b;
        poa poaVar = this.e;
        pse.c(poaVar);
        avjVar.c = avj.b(poaVar, avjVar.b, avjVar.d, avjVar.a);
        final avl a = a();
        H(a, 11, new pss() { // from class: aup
            @Override // defpackage.pss
            public final void a(Object obj) {
                avl avlVar = avl.this;
                int i2 = i;
                pnz pnzVar3 = pnzVar;
                pnz pnzVar4 = pnzVar2;
                avm avmVar = (avm) obj;
                avmVar.ab();
                avmVar.o(avlVar, pnzVar3, pnzVar4, i2);
            }
        });
    }

    @Override // defpackage.pny
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.bhn
    public final void v(final Object obj, final long j) {
        final avl as = as();
        H(as, 1027, new pss() { // from class: avb
            @Override // defpackage.pss
            public final void a(Object obj2) {
                ((avm) obj2).p(avl.this, obj, j);
            }
        });
    }

    @Override // defpackage.pnw
    public final void w() {
        avl a = a();
        H(a, -1, new avf(a, 0));
    }

    @Override // defpackage.pny, defpackage.awb
    public final void x(boolean z) {
        avl as = as();
        H(as, 1017, new ave(as, z, 0));
    }

    @Override // defpackage.bhn
    public final void y(Exception exc) {
        avl as = as();
        H(as, 1038, new ava(as, exc, 0));
    }

    @Override // defpackage.bhn
    public final void z(String str, long j, long j2) {
        avl as = as();
        H(as, 1021, new avc(as, str, j2, j, 0));
    }
}
