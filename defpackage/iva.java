package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iva implements ajtt {
    final /* synthetic */ ivj a;

    public iva(ivj ivjVar) {
        this.a = ivjVar;
    }

    @Override // defpackage.ajtt
    public final void a(cnq cnqVar, ajce ajceVar) {
        evr.bX(this.a.mM(), this.a.aI.a(cnqVar).b);
        if (cnqVar instanceof cng) {
            this.a.aY.b();
        }
        mbn mbnVar = this.a.bA;
        if (mbnVar != null && mbnVar.m()) {
            this.a.bA.j();
        }
        this.a.bC.g(false);
        zgi zgiVar = this.a.bM;
        String valueOf = String.valueOf(cnqVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Continuation request failed. Error: ");
        sb.append(valueOf);
        zgiVar.b(sb.toString());
    }
}
