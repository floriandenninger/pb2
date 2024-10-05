package defpackage;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pnm implements bby, aym {
    final /* synthetic */ pnq a;
    private final pno b;
    private bbx c;
    private bbx d;

    public pnm(pnq pnqVar, pno pnoVar) {
        this.a = pnqVar;
        this.c = pnqVar.e;
        this.d = pnqVar.k;
        this.b = pnoVar;
    }

    private final boolean a(int i, ash ashVar) {
        ash ashVar2 = null;
        if (ashVar != null) {
            pno pnoVar = this.b;
            int i2 = 0;
            while (true) {
                if (i2 >= pnoVar.c.size()) {
                    break;
                }
                if (((ash) pnoVar.c.get(i2)).d == ashVar.d) {
                    ashVar2 = ashVar.b(Pair.create(pnoVar.b, ashVar.a));
                    break;
                }
                i2++;
            }
            if (ashVar2 == null) {
                return false;
            }
        }
        int i3 = i + this.b.d;
        bbx bbxVar = this.c;
        if (bbxVar.a != i3 || !pts.R(bbxVar.c, ashVar2)) {
            this.c = this.a.e.i(i3, ashVar2);
        }
        bbx bbxVar2 = this.d;
        if (bbxVar2.a == i3 && pts.R(bbxVar2.c, ashVar2)) {
            return true;
        }
        this.d = this.a.k.v(i3, ashVar2);
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
