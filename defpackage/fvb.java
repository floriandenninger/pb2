package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fvb extends fhe {
    private final ftw a;

    public fvb(ftw ftwVar) {
        this.a = ftwVar;
    }

    @Override // defpackage.fhe
    public final void C() {
        this.a.c();
    }

    @Override // defpackage.fhe
    public final void D(apmp apmpVar) {
        ftw ftwVar = this.a;
        apmp apmpVar2 = ftwVar.d;
        if (apmpVar == null || apmpVar2 == null || apmpVar.e == apmpVar2.e) {
            return;
        }
        ftwVar.c();
    }
}
