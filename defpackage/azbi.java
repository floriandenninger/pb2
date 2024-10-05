package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azbi extends AtomicInteger implements Runnable, aypq, banx {
    private static final long serialVersionUID = -8296689127439125014L;
    final banw a;
    final TimeUnit c;
    final ayqh d;
    banx h;
    volatile boolean i;
    Throwable j;
    volatile boolean k;
    volatile boolean l;
    long m;
    boolean n;
    final long b = 500;
    final boolean e = true;
    final AtomicReference f = new AtomicReference();
    final AtomicLong g = new AtomicLong();

    public azbi(banw banwVar, TimeUnit timeUnit, ayqh ayqhVar) {
        this.a = banwVar;
        this.c = timeUnit;
        this.d = ayqhVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.j = th;
        this.i = true;
        d();
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.f.set(obj);
        d();
    }

    final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.f;
        AtomicLong atomicLong = this.g;
        banw banwVar = this.a;
        int i = 1;
        while (!this.k) {
            boolean z = this.i;
            if (!z || this.j == null) {
                Object obj = atomicReference.get();
                if (z) {
                    if (obj == null || !this.e) {
                        atomicReference.lazySet(null);
                        banwVar.sh();
                    } else {
                        Object andSet = atomicReference.getAndSet(null);
                        long j = this.m;
                        if (j != atomicLong.get()) {
                            this.m = j + 1;
                            banwVar.c(andSet);
                            banwVar.sh();
                        } else {
                            banwVar.b(new ayrg("Could not emit final value due to lack of requests"));
                        }
                    }
                    this.d.qc();
                    return;
                }
                if (obj != null) {
                    if (!this.n || this.l) {
                        Object andSet2 = atomicReference.getAndSet(null);
                        long j2 = this.m;
                        if (j2 != atomicLong.get()) {
                            banwVar.c(andSet2);
                            this.m = j2 + 1;
                            this.l = false;
                            this.n = true;
                            this.d.c(this, this.b, this.c);
                        } else {
                            this.h.sd();
                            banwVar.b(new ayrg("Could not emit value due to lack of requests"));
                            this.d.qc();
                            return;
                        }
                    }
                } else if (this.l) {
                    this.n = false;
                    this.l = false;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                atomicReference.lazySet(null);
                banwVar.b(this.j);
                this.d.qc();
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.h, banxVar)) {
            this.h = banxVar;
            this.a.f(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.l = true;
        d();
    }

    @Override // defpackage.banx
    public final void sd() {
        this.k = true;
        this.h.sd();
        this.d.qc();
        if (getAndIncrement() == 0) {
            this.f.lazySet(null);
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        this.i = true;
        d();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.g, j);
        }
    }
}
