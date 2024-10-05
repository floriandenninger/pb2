package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczi implements adlr {
    public final adlt a;
    private final sxd b;

    public aczi(adlt adltVar, sxd sxdVar) {
        this.a = adltVar;
        this.b = sxdVar;
    }

    public final void a(boolean z) {
        aone createBuilder = atbb.a.createBuilder();
        int i = true != z ? 2 : 4;
        createBuilder.copyOnWrite();
        atbb atbbVar = (atbb) createBuilder.instance;
        atbbVar.c = i - 1;
        atbbVar.b |= 1;
        this.b.b("/app/mdx", ((atbb) createBuilder.build()).toByteArray());
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
        a(true);
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        a(false);
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
    }
}
