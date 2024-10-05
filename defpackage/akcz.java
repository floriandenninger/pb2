package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akcz implements akbl {
    final /* synthetic */ avhy a;
    final /* synthetic */ akda b;

    public akcz(akda akdaVar, avhy avhyVar) {
        this.b = akdaVar;
        this.a = avhyVar;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
        apxf apxfVar = null;
        if (i == 1) {
            aufr aufrVar = this.a.c;
            if (aufrVar == null) {
                aufrVar = aufr.a;
            }
            if ((aufrVar.b & 4) != 0) {
                aufr aufrVar2 = this.a.c;
                if (aufrVar2 == null) {
                    aufrVar2 = aufr.a;
                }
                apxfVar = aufrVar2.e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            }
        } else {
            aufr aufrVar3 = this.a.c;
            if (aufrVar3 == null) {
                aufrVar3 = aufr.a;
            }
            if ((aufrVar3.b & 8) != 0) {
                aufr aufrVar4 = this.a.c;
                if (aufrVar4 == null) {
                    aufrVar4 = aufr.a;
                }
                apxfVar = aufrVar4.f;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            }
            avhy avhyVar = this.a;
            if ((avhyVar.b & 8192) != 0) {
                aahd aahdVar = this.b.b;
                apxf apxfVar2 = avhyVar.o;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar.c(apxfVar2, acrc.i(this.a, false));
            }
        }
        if (apxfVar == null || i == 2) {
            return;
        }
        this.b.b.c(apxfVar, acrc.i(this.a, true));
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        this.b.c.mM().u(new acqx(this.a.n), null);
        avhy avhyVar = this.a;
        if ((avhyVar.b & 1) != 0) {
            aahd aahdVar = this.b.b;
            aufr aufrVar = avhyVar.c;
            if (aufrVar == null) {
                aufrVar = aufr.a;
            }
            whl.J(aahdVar, aufrVar.d, acrc.i(this.a, false));
        }
    }
}
