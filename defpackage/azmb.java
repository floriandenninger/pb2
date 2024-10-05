package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class azmb extends AtomicInteger implements Runnable, aypq, banx {
    private static final long serialVersionUID = 9222303586456402150L;
    final int a;
    final int b;
    final azog c;
    final ayqh d;
    banx e;
    volatile boolean f;
    Throwable g;
    final AtomicLong h = new AtomicLong();
    volatile boolean i;
    int j;

    public azmb(int i, azog azogVar, ayqh ayqhVar) {
        this.a = i;
        this.c = azogVar;
        this.b = i - (i >> 2);
        this.d = ayqhVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.f) {
            aynu.j(th);
            return;
        }
        this.g = th;
        this.f = true;
        d();
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.f) {
            return;
        }
        if (!this.c.k(obj)) {
            this.e.sd();
            b(new ayrg("Queue is full?!"));
        } else {
            d();
        }
    }

    final void d() {
        if (getAndIncrement() == 0) {
            this.d.a(this);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.e.sd();
        this.d.qc();
        if (getAndIncrement() == 0) {
            this.c.d();
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.f) {
            return;
        }
        this.f = true;
        d();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.h, j);
            d();
        }
    }
}
