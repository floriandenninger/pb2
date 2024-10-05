package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azmn implements ayqk {
    final ayqk a;
    final /* synthetic */ azmo b;
    private final aysd c;

    public azmn(azmo azmoVar, aysd aysdVar, ayqk ayqkVar) {
        this.b = azmoVar;
        this.c = aysdVar;
        this.a = ayqkVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        ayrz.i(this.c, this.b.c.c(new azml(this, th), 0L, this.b.b));
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        ayrz.i(this.c, this.b.c.c(new azmm(this, obj), 15L, this.b.b));
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.i(this.c, ayqxVar);
    }
}
