package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nyu implements oex {
    public boolean a;
    public nqg b;
    private final nzc c;
    private final nzo d;
    private final nzo e;
    private final nzo f;
    private final nzo g;
    private final nzo h;
    private final String i;
    private nzo j;

    public nyu(nzc nzcVar, aadw aadwVar) {
        nzo nzqVar;
        nyt nytVar = new nyt();
        nzi nziVar = new nzi();
        nzq nzqVar2 = new nzq();
        asvu asvuVar = aadwVar.b().e;
        if ((asvuVar == null ? asvu.a : asvuVar).cn) {
            nzqVar = new nzp(aadwVar);
        } else {
            nzqVar = new nzq();
        }
        nzh nzhVar = new nzh();
        this.c = nzcVar;
        this.d = nytVar;
        this.e = nziVar;
        this.f = nzqVar2;
        this.g = nzqVar;
        asvu asvuVar2 = aadwVar.b().e;
        this.i = (asvuVar2 == null ? asvu.a : asvuVar2).aD;
        this.h = nzhVar;
    }

    private final void c(nzo nzoVar) {
        nqg nqgVar;
        if (nzoVar == this.j) {
            return;
        }
        this.c.h(nzoVar);
        if (((nzoVar instanceof nyt) || (nzoVar instanceof nzp) || (nzoVar instanceof nzq)) && ((nqgVar = this.b) == null || !nqgVar.y())) {
            this.c.g(1, false);
        }
        this.j = nzoVar;
    }

    public final void b() {
        nqg nqgVar;
        aqts l;
        if (this.b != null) {
            if (TextUtils.isEmpty(this.i) || (nqgVar = this.b) == null || (l = nqgVar.l()) == null || !this.i.equals(oba.i(l))) {
                nqg nqgVar2 = this.b;
                if (nqgVar2 == null || !nqgVar2.u()) {
                    nqg nqgVar3 = this.b;
                    if (nqgVar3 == null || !nqgVar3.t()) {
                        c(this.d);
                        return;
                    } else {
                        c(this.h);
                        return;
                    }
                }
                c(this.e);
                return;
            }
            c(this.g);
            return;
        }
        if (!this.a) {
            this.j = null;
            nzo f = this.c.f(0);
            if ((f instanceof nzi) || (f instanceof nzq) || (f instanceof nzp) || (f instanceof nzh)) {
                this.c.g(0, false);
                return;
            }
            return;
        }
        c(this.f);
    }

    @Override // defpackage.oex
    public final void oY(ofa ofaVar, ofa ofaVar2) {
        b();
    }
}
