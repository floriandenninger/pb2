package defpackage;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bba implements bby, aym {
    final /* synthetic */ bbc a;
    private final Object b;
    private bbx c;
    private bbx d;

    public bba(bbc bbcVar, Object obj) {
        this.a = bbcVar;
        this.c = bbcVar.n(null);
        this.d = bbcVar.q(null);
        this.b = obj;
    }

    private final boolean a(int i, ash ashVar) {
        ash ashVar2;
        if (ashVar != null) {
            ashVar2 = this.a.z(this.b, ashVar);
            if (ashVar2 == null) {
                return false;
            }
        } else {
            ashVar2 = null;
        }
        int w = this.a.w(this.b, i);
        bbx bbxVar = this.c;
        if (bbxVar.a != w || !pts.R(bbxVar.c, ashVar2)) {
            this.c = this.a.b.i(w, ashVar2);
        }
        bbx bbxVar2 = this.d;
        if (bbxVar2.a == w && pts.R(bbxVar2.c, ashVar2)) {
            return true;
        }
        this.d = this.a.c.v(w, ashVar2);
        return true;
    }

    @Override // defpackage.bby
    public final void J(int i, ash ashVar, bbn bbnVar) {
        if (a(i, ashVar)) {
            this.c.b(bbnVar);
        }
    }

    @Override // defpackage.aym
    public final void K(int i, ash ashVar) {
        if (a(i, ashVar)) {
            this.d.p();
        }
    }

    @Override // defpackage.aym
    public final void L(int i, ash ashVar) {
        if (a(i, ashVar)) {
            this.d.q();
        }
    }

    @Override // defpackage.aym
    public final void M(int i, ash ashVar) {
        if (a(i, ashVar)) {
            this.d.r();
        }
    }

    @Override // defpackage.aym
    public final void N(int i, ash ashVar, int i2) {
        if (a(i, ashVar)) {
            this.d.s(i2);
        }
    }

    @Override // defpackage.aym
    public final void O(int i, ash ashVar, Exception exc) {
        if (a(i, ashVar)) {
            this.d.t(exc);
        }
    }

    @Override // defpackage.aym
    public final void P(int i, ash ashVar) {
        if (a(i, ashVar)) {
            this.d.u();
        }
    }

    @Override // defpackage.bby
    public final void Q(int i, ash ashVar, bbi bbiVar, bbn bbnVar) {
        if (a(i, ashVar)) {
            this.c.d(bbiVar, bbnVar);
        }
    }

    @Override // defpackage.bby
    public final void R(int i, ash ashVar, bbi bbiVar, bbn bbnVar) {
        if (a(i, ashVar)) {
            this.c.e(bbiVar, bbnVar);
        }
    }

    @Override // defpackage.bby
    public final void S(int i, ash ashVar, bbi bbiVar, bbn bbnVar, IOException iOException, boolean z) {
        if (a(i, ashVar)) {
            this.c.f(bbiVar, bbnVar, iOException, z);
        }
    }

    @Override // defpackage.bby
    public final void T(int i, ash ashVar, bbi bbiVar, bbn bbnVar) {
        if (a(i, ashVar)) {
            this.c.g(bbiVar, bbnVar);
        }
    }

    @Override // defpackage.bby
    public final void U(int i, ash ashVar, bbn bbnVar) {
        if (a(i, ashVar)) {
            this.c.h(bbnVar);
        }
    }

    @Override // defpackage.aym
    public final /* synthetic */ void Z() {
    }
}
