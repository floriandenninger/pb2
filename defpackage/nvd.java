package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nvd implements nun, nqn {
    public final axpg a;
    public final ayqj b;
    public final ayqj c;
    public final ayqw d = new ayqw();
    public nvc e;
    public nvc f;
    private final nuv g;
    private final axpg h;
    private nqg i;

    public nvd(axpg axpgVar, axpg axpgVar2, nuv nuvVar, ayqj ayqjVar, ayqj ayqjVar2) {
        this.g = nuvVar;
        this.h = axpgVar2;
        this.a = axpgVar;
        this.b = ayqjVar;
        this.c = ayqjVar2;
    }

    @Override // defpackage.nun
    public final void g(nqg nqgVar) {
        nvc nvcVar = this.g.b == nuu.LANDSCAPE_PLAYER_OVERLAY ? this.f : this.e;
        if (nvcVar != null) {
            nqg nqgVar2 = this.i;
            nsa nsaVar = (nsa) this.h.get();
            if (nqgVar == null && nqgVar2 != null) {
                nvcVar.x(false, nsaVar.a(nqgVar2));
            } else if (nqgVar != null && nqgVar2 == null) {
                nvcVar.x(true, nsaVar.a(nqgVar));
            }
        }
        this.i = nqgVar;
    }

    @Override // defpackage.nqn
    public final void h(nqg nqgVar) {
        nvc nvcVar = this.e;
        if (nvcVar != null) {
            nvcVar.y(nqgVar);
        }
        this.i = nqgVar;
    }

    @Override // defpackage.nqn
    public final void i(nqg nqgVar) {
        nvc nvcVar = this.e;
        if (nvcVar != null) {
            nvcVar.z(nqgVar);
        }
        this.i = nqgVar;
    }
}
