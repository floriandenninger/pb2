package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayyi implements ayqd, banx {
    final banw a;
    ayqx b;

    public ayyi(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.banx
    public final void sd() {
        this.b.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        this.b = ayqxVar;
        this.a.f(this);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.a.sh();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
    }
}
