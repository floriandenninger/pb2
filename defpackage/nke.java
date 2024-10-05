package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nke implements fxi {
    final /* synthetic */ nkg a;

    public nke(nkg nkgVar) {
        this.a = nkgVar;
    }

    @Override // defpackage.fxi
    public final void a() {
        nkg nkgVar = this.a;
        nkgVar.g.j(nkgVar);
    }

    @Override // defpackage.fxi
    public final void b() {
        nkg nkgVar = this.a;
        nkgVar.g.i(nkgVar);
        nkg nkgVar2 = this.a;
        if (nkgVar2.l == null || nkgVar2.q == null) {
            return;
        }
        boolean z = false;
        if (nkgVar2.k.g() && nkgVar2.q.ar()) {
            z = true;
        }
        nkgVar2.s(z);
    }
}
