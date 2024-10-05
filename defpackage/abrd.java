package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abrd implements abrp {
    public boolean a;
    public abrr b;
    private final abrp c;
    private final abrr d = new abrc(this);

    public abrd(abrp abrpVar) {
        this.c = abrpVar;
    }

    @Override // defpackage.abrp
    public final void c(abqu abquVar) {
        this.c.c(abquVar);
    }

    @Override // defpackage.abrp
    public final boolean e(boolean z, abrr abrrVar, abqu abquVar) {
        this.b = abrrVar;
        return this.c.e(z, this.d, abquVar);
    }
}
