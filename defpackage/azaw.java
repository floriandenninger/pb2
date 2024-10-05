package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azaw extends AtomicReference implements Runnable, aypq, banx {
    private static final long serialVersionUID = 8094547886072529208L;
    final banw a;
    final ayqh b;
    final AtomicReference c = new AtomicReference();
    final AtomicLong d = new AtomicLong();
    final boolean e;
    banv f;

    public azaw(banw banwVar, ayqh ayqhVar, banv banvVar, boolean z) {
        this.a = banwVar;
        this.b = ayqhVar;
        this.f = banvVar;
        this.e = !z;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.a.b(th);
        this.b.qc();
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.a.c(obj);
    }

    final void d(long j, banx banxVar) {
        if (this.e || Thread.currentThread() == get()) {
            banxVar.sj(j);
        } else {
            this.b.a(new azav(banxVar, j));
        }
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.g(this.c, banxVar)) {
            long andSet = this.d.getAndSet(0L);
            if (andSet != 0) {
                d(andSet, banxVar);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        banv banvVar = this.f;
        this.f = null;
        banvVar.ab(this);
    }

    @Override // defpackage.banx
    public final void sd() {
        azqb.f(this.c);
        this.b.qc();
    }

    @Override // defpackage.banw
    public final void sh() {
        this.a.sh();
        this.b.qc();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            banx banxVar = (banx) this.c.get();
            if (banxVar != null) {
                d(j, banxVar);
                return;
            }
            ayeq.j(this.d, j);
            banx banxVar2 = (banx) this.c.get();
            if (banxVar2 != null) {
                long andSet = this.d.getAndSet(0L);
                if (andSet != 0) {
                    d(andSet, banxVar2);
                }
            }
        }
    }
}
