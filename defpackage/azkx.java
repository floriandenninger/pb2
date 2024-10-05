package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azkx extends AtomicInteger implements Runnable, ayqd, ayqx {
    private static final long serialVersionUID = -8296689127439125014L;
    final ayqd a;
    final TimeUnit c;
    final ayqh d;
    ayqx g;
    volatile boolean h;
    Throwable i;
    volatile boolean j;
    volatile boolean k;
    boolean l;
    final long b = 500;
    final boolean e = true;
    final AtomicReference f = new AtomicReference();

    public azkx(ayqd ayqdVar, TimeUnit timeUnit, ayqh ayqhVar) {
        this.a = ayqdVar;
        this.c = timeUnit;
        this.d = ayqhVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.i = th;
        this.h = true;
        f();
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.f.set(obj);
        f();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.j;
    }

    final void f() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.f;
        ayqd ayqdVar = this.a;
        int i = 1;
        while (!this.j) {
            boolean z = this.h;
            if (!z || this.i == null) {
                Object obj = atomicReference.get();
                if (z) {
                    Object andSet = atomicReference.getAndSet(null);
                    if (obj != null && this.e) {
                        ayqdVar.c(andSet);
                    }
                    ayqdVar.sh();
                    this.d.qc();
                    return;
                }
                if (obj == null) {
                    if (this.k) {
                        this.l = false;
                        this.k = false;
                    }
                } else if (!this.l || this.k) {
                    ayqdVar.c(atomicReference.getAndSet(null));
                    this.k = false;
                    this.l = true;
                    this.d.c(this, this.b, this.c);
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                atomicReference.lazySet(null);
                ayqdVar.b(this.i);
                this.d.qc();
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.j = true;
        this.g.qc();
        this.d.qc();
        if (getAndIncrement() == 0) {
            this.f.lazySet(null);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.k = true;
        f();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.g, ayqxVar)) {
            this.g = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.h = true;
        f();
    }
}
