package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abao implements ajcf {
    private final arsp a;
    private Object b;

    public abao(arsp arspVar) {
        this.a = arspVar;
    }

    @Override // defpackage.ajcf
    public final aulp a() {
        arsp arspVar = this.a;
        if ((arspVar.b & 4) == 0) {
            return null;
        }
        aulp aulpVar = arspVar.e;
        return aulpVar == null ? aulp.a : aulpVar;
    }

    @Override // defpackage.ajcf
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.ajcf
    public final void c(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.ajcf
    public final byte[] d() {
        return this.a.f.I();
    }
}
