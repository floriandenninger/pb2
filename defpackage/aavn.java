package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavn implements ajcf {
    private final arky a;
    private Object b;

    public aavn(arky arkyVar) {
        arkyVar.getClass();
        this.a = arkyVar;
    }

    @Override // defpackage.ajcf
    public final aulp a() {
        arky arkyVar = this.a;
        if ((arkyVar.b & 8) == 0) {
            return null;
        }
        aulp aulpVar = arkyVar.d;
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
