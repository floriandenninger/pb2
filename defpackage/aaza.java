package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaza implements ajcf {
    final /* synthetic */ aruj a;
    private Object b;

    public aaza(aruj arujVar) {
        this.a = arujVar;
    }

    @Override // defpackage.ajcf
    public final aulp a() {
        aruj arujVar = this.a;
        if ((arujVar.b & 4) == 0) {
            return null;
        }
        aulp aulpVar = arujVar.d;
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
        return this.a.e.I();
    }
}
