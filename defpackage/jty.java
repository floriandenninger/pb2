package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jty implements ajcf {
    public final aamd a;
    private final aalz b;
    private final aulp c;

    @Override // defpackage.ajcf
    public final aulp a() {
        return this.c;
    }

    @Override // defpackage.ajcf
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.ajcf
    public final void c(Object obj) {
    }

    @Override // defpackage.ajcf
    public final byte[] d() {
        return aaef.b;
    }

    public jty(auov auovVar, askd askdVar) {
        aulp aulpVar = null;
        this.a = auovVar == null ? null : new aamd(auovVar);
        this.b = askdVar == null ? null : new aalz(askdVar);
        if (askdVar != null) {
            aong aongVar = (aong) aulp.a.createBuilder();
            aongVar.e(askd.b, askdVar);
            aulpVar = (aulp) aongVar.build();
        }
        this.c = aulpVar;
    }
}
