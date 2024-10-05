package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abaj implements ajcf {
    public final attf a;
    private Object b;

    public abaj(attf attfVar) {
        this.a = attfVar;
    }

    @Override // defpackage.ajcf
    public final aulp a() {
        aulp aulpVar = this.a.d;
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
