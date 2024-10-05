package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azbk implements aypq, banx {
    final banw a;
    final TimeUnit b;
    banx c;
    long d;

    public azbk(banw banwVar, TimeUnit timeUnit) {
        this.a = banwVar;
        this.b = timeUnit;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        long e = ayqi.e(this.b);
        long j = this.d;
        this.d = e;
        this.a.c(new azrf(obj, e - j, this.b));
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.c, banxVar)) {
            this.d = ayqi.e(this.b);
            this.c = banxVar;
            this.a.f(this);
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
