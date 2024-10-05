package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azlo implements ayqd {
    private final azln a;

    public azlo(azln azlnVar) {
        this.a = azlnVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        azln azlnVar = this.a;
        ayrz.c(azlnVar.c);
        azlnVar.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.a.lazySet(obj);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this.a.d, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
    }
}
