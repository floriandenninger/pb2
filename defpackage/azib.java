package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azib implements aypq, ayqx {
    final ayqd a;
    banx b;

    public azib(ayqd ayqdVar) {
        this.a = ayqdVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b == azqb.a;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.b, banxVar)) {
            this.b = banxVar;
            this.a.se(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.b.sd();
        this.b = azqb.a;
    }

    @Override // defpackage.banw
    public final void sh() {
        this.a.sh();
    }
}
