package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azbs implements aypq {
    private final azbt a;

    public azbs(azbt azbtVar) {
        this.a = azbtVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        azbt azbtVar = this.a;
        azqb.f(azbtVar.c);
        azbtVar.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.a.lazySet(obj);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.g(this.a.e, banxVar)) {
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.banw
    public final void sh() {
    }
}
