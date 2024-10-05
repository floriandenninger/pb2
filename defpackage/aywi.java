package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aywi extends aywe {
    private static final long serialVersionUID = 4023437720691792495L;
    final AtomicReference c;
    Throwable d;
    volatile boolean e;
    final AtomicInteger f;

    public aywi(banw banwVar) {
        super(banwVar);
        this.c = new AtomicReference();
        this.f = new AtomicInteger();
    }

    @Override // defpackage.aypm
    public final void d(Object obj) {
        if (this.e || j()) {
            return;
        }
        if (obj == null) {
            c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.c.set(obj);
            l();
        }
    }

    @Override // defpackage.aywe
    public final void g() {
        l();
    }

    @Override // defpackage.aywe
    public final void h() {
        if (this.f.getAndIncrement() == 0) {
            this.c.lazySet(null);
        }
    }

    @Override // defpackage.aywe
    public final boolean k(Throwable th) {
        if (this.e || j()) {
            return false;
        }
        this.d = th;
        this.e = true;
        l();
        return true;
    }

    final void l() {
        if (this.f.getAndIncrement() != 0) {
            return;
        }
        banw banwVar = this.a;
        AtomicReference atomicReference = this.c;
        int i = 1;
        do {
            long j = get();
            long j2 = 0;
            while (j2 != j) {
                if (!j()) {
                    boolean z = this.e;
                    Object andSet = atomicReference.getAndSet(null);
                    if (z) {
                        if (andSet == null) {
                            Throwable th = this.d;
                            if (th != null) {
                                i(th);
                                return;
                            } else {
                                f();
                                return;
                            }
                        }
                    } else if (andSet == null) {
                        break;
                    }
                    banwVar.c(andSet);
                    j2++;
                } else {
                    atomicReference.lazySet(null);
                    return;
                }
            }
            if (j2 == j) {
                if (!j()) {
                    boolean z2 = this.e;
                    Object obj = atomicReference.get();
                    if (z2 && obj == null) {
                        Throwable th2 = this.d;
                        if (th2 != null) {
                            i(th2);
                            return;
                        } else {
                            f();
                            return;
                        }
                    }
                } else {
                    atomicReference.lazySet(null);
                    return;
                }
            }
            if (j2 != 0) {
                ayeq.n(this, j2);
            }
            i = this.f.addAndGet(-i);
        } while (i != 0);
    }
}
