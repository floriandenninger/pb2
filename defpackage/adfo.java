package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adfo implements adlr {
    final /* synthetic */ adfp a;

    public adfo(adfp adfpVar) {
        this.a = adfpVar;
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
        adfp adfpVar = this.a;
        adfpVar.b = true;
        adfpVar.b();
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        adfp adfpVar = this.a;
        adfpVar.b = false;
        adfpVar.b();
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
        this.a.b = true;
    }
}
