package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayzl extends AtomicInteger implements aypq, banx {
    private static final long serialVersionUID = 163080509307634843L;
    final banw a;
    banx b;
    volatile boolean c;
    Throwable d;
    volatile boolean e;
    final AtomicLong f = new AtomicLong();
    final AtomicReference g = new AtomicReference();

    public ayzl(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.d = th;
        this.c = true;
        d();
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.g.lazySet(obj);
        d();
    }

    final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        banw banwVar = this.a;
        AtomicLong atomicLong = this.f;
        AtomicReference atomicReference = this.g;
        int i = 1;
        do {
            long j = 0;
            while (true) {
                if (j == atomicLong.get()) {
                    break;
                }
                boolean z = this.c;
                Object andSet = atomicReference.getAndSet(null);
                boolean z2 = andSet == null;
                if (g(z, z2, banwVar, atomicReference)) {
                    return;
                }
                if (z2) {
                    break;
                }
                banwVar.c(andSet);
                j++;
            }
            if (j == atomicLong.get()) {
                if (g(this.c, atomicReference.get() == null, banwVar, atomicReference)) {
                    return;
                }
            }
            if (j != 0) {
                ayeq.n(atomicLong, j);
            }
            i = addAndGet(-i);
        } while (i != 0);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.b, banxVar)) {
            this.b = banxVar;
            this.a.f(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    final boolean g(boolean z, boolean z2, banw banwVar, AtomicReference atomicReference) {
        if (this.e) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.d;
        if (th != null) {
            atomicReference.lazySet(null);
            banwVar.b(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        banwVar.sh();
        return true;
    }

    @Override // defpackage.banx
    public final void sd() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.sd();
        if (getAndIncrement() == 0) {
            this.g.lazySet(null);
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        this.c = true;
        d();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.f, j);
            d();
        }
    }
}
