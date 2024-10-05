package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayyq implements aypq, aytc {
    final banw a;
    banx b;

    public ayyq(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
    }

    @Override // defpackage.aytf
    public final void d() {
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.b, banxVar)) {
            this.b = banxVar;
            this.a.f(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aytf
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.banx
    public final void sd() {
        this.b.sd();
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return i & 2;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        return null;
    }

    @Override // defpackage.banw
    public final void sh() {
        this.a.sh();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
    }
}
