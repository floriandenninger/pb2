package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azaq implements aypq, banx {
    final banw a;
    long b = 1;
    banx c;

    public azaq(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
        } else {
            this.a.c(obj);
        }
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.c, banxVar)) {
            long j = this.b;
            this.c = banxVar;
            this.a.f(this);
            banxVar.sj(j);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.c.sd();
    }

    @Override // defpackage.banw
    public final void sh() {
        this.a.sh();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        this.c.sj(j);
    }
}
