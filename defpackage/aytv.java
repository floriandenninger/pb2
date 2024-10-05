package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aytv implements aypi, banx {
    final banw a;
    ayqx b;

    public aytv(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.banx
    public final void sd() {
        this.b.qc();
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.b, ayqxVar)) {
            this.b = ayqxVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        this.a.sh();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
    }
}
