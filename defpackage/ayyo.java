package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayyo implements aypq, banx {
    final banw a;
    banx b;

    public ayyo(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.b, banxVar)) {
            this.b = banxVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.b.sd();
    }

    @Override // defpackage.banw
    public final void sh() {
        this.a.sh();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        this.b.sj(j);
    }
}
