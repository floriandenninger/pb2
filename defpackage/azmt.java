package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azmt implements ayqk {
    final /* synthetic */ azmu a;
    private final ayqk b;

    public azmt(azmu azmuVar, ayqk ayqkVar) {
        this.a = azmuVar;
        this.b = ayqkVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        try {
            this.a.b.a(th);
        } catch (Throwable th2) {
            aynu.c(th2);
            th = new ayrf(th, th2);
        }
        this.b.b(th);
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        this.b.sc(obj);
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        this.b.se(ayqxVar);
    }
}
