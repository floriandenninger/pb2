package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azru extends azrs {
    final azoh a;
    final AtomicReference b;
    final AtomicReference c;
    volatile boolean d;
    volatile boolean e;
    Throwable f;
    final AtomicBoolean g;
    final ayth h;
    boolean i;

    public azru(int i, Runnable runnable) {
        aysw.c(i, "capacityHint");
        this.a = new azoh(i);
        this.c = new AtomicReference(runnable);
        this.b = new AtomicReference();
        this.g = new AtomicBoolean();
        this.h = new azrt(this);
    }

    final void aN() {
        if (this.h.getAndIncrement() != 0) {
            return;
        }
        ayqd ayqdVar = (ayqd) this.b.get();
        int i = 1;
        int i2 = 1;
        while (ayqdVar == null) {
            i2 = this.h.addAndGet(-i2);
            if (i2 == 0) {
                return;
            } else {
                ayqdVar = (ayqd) this.b.get();
            }
        }
        if (!this.i) {
            azoh azohVar = this.a;
            while (!this.d) {
                boolean z = this.e;
                Object sg = this.a.sg();
                if (z) {
                    if (sg == null) {
                        aO(ayqdVar);
                        return;
                    }
                } else if (sg == null) {
                    i = this.h.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                ayqdVar.c(sg);
            }
            this.b.lazySet(null);
            azohVar.d();
            return;
        }
        azoh azohVar2 = this.a;
        while (!this.d) {
            boolean z2 = this.e;
            ayqdVar.c(null);
            if (!z2) {
                i = this.h.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                aO(ayqdVar);
                return;
            }
        }
        this.b.lazySet(null);
        azohVar2.d();
    }

    final void aO(ayqd ayqdVar) {
        this.b.lazySet(null);
        Throwable th = this.f;
        if (th != null) {
            ayqdVar.b(th);
        } else {
            ayqdVar.sh();
        }
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        aysw.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.e || this.d) {
            aynu.j(th);
            return;
        }
        this.f = th;
        this.e = true;
        e();
        aN();
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        aysw.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.e || this.d) {
            return;
        }
        this.a.k(obj);
        aN();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        Runnable runnable = (Runnable) this.c.get();
        if (runnable == null || !this.c.compareAndSet(runnable, null)) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        if (this.g.get() || !this.g.compareAndSet(false, true)) {
            aysa.h(new IllegalStateException("Only a single observer allowed."), ayqdVar);
            return;
        }
        ayqdVar.se(this.h);
        this.b.lazySet(ayqdVar);
        if (this.d) {
            this.b.lazySet(null);
        } else {
            aN();
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (this.e || this.d) {
            ayqxVar.qc();
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.e || this.d) {
            return;
        }
        this.e = true;
        e();
        aN();
    }
}
