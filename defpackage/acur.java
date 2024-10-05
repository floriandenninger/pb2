package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acur implements adlr {
    final /* synthetic */ acuu a;

    public acur(acuu acuuVar) {
        this.a = acuuVar;
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
        acuu acuuVar = this.a;
        if (acuuVar.n != null) {
            acuuVar.g.d();
            acuuVar.g.a();
            acvb acvbVar = acuuVar.k;
            acvd acvdVar = acuuVar.n;
            acvbVar.a(3, acvdVar.e, acuuVar.p, acvdVar.d.e);
            acuuVar.a();
        }
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        acuu acuuVar = this.a;
        if (acuuVar.n == null || acuuVar.r) {
            return;
        }
        acuuVar.d(3, adlmVar);
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
        acuu acuuVar = this.a;
        if (acuuVar.n == null) {
            adlmVar = null;
        }
        acuuVar.q = adlmVar;
    }
}
