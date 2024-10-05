package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavx implements ajcf {
    private final arlw a;
    private Object b;

    public aavx(arlw arlwVar) {
        this.a = arlwVar;
    }

    @Override // defpackage.ajcf
    public final aulp a() {
        aulp aulpVar = this.a.c;
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
        return this.a.d.I();
    }
}
