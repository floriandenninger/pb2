package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aazf implements ajcf {
    private final arul a;
    private Object b;

    public aazf(arul arulVar) {
        arulVar.getClass();
        this.a = arulVar;
    }

    @Override // defpackage.ajcf
    public final aulp a() {
        arul arulVar = this.a;
        if ((arulVar.b & 4) == 0) {
            return null;
        }
        aulp aulpVar = arulVar.e;
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
