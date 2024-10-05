package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azll extends AtomicInteger implements Runnable, ayqd, ayqx {
    static final Object a = new Object();
    private static final long serialVersionUID = 2233020065421370272L;
    final ayqd b;
    final int c;
    final azlk d = new azlk(this);
    final AtomicReference e = new AtomicReference();
    final AtomicInteger f = new AtomicInteger(1);
    final azof g = new azof();
    final azqf h = new azqf();
    final AtomicBoolean i = new AtomicBoolean();
    volatile boolean j;
    azru k;

    public azll(ayqd ayqdVar, int i) {
        this.b = ayqdVar;
        this.c = i;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.d.qc();
        if (azqi.e(this.h, th)) {
            this.j = true;
            f();
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.g.k(obj);
        f();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.i.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (getAndIncrement() != 0) {
            return;
        }
        ayqd ayqdVar = this.b;
        azof azofVar = this.g;
        azqf azqfVar = this.h;
        int i = 1;
        while (this.f.get() != 0) {
            azru azruVar = this.k;
            boolean z = this.j;
            if (!z || azqfVar.get() == null) {
                Object sg = azofVar.sg();
                if (z) {
                    if (sg == null) {
                        Throwable d = azqi.d(azqfVar);
                        if (d == null) {
                            if (azruVar != null) {
                                this.k = null;
                                azruVar.sh();
                            }
                            ayqdVar.sh();
                            return;
                        }
                        if (azruVar != null) {
                            this.k = null;
                            azruVar.b(d);
                        }
                        ayqdVar.b(d);
                        return;
                    }
                } else if (sg == null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                if (sg != a) {
                    azruVar.c(sg);
                } else {
                    if (azruVar != null) {
                        this.k = null;
                        azruVar.sh();
                    }
                    if (!this.i.get()) {
                        azru azruVar2 = new azru(this.c, this);
                        this.k = azruVar2;
                        this.f.getAndIncrement();
                        ayqdVar.c(azruVar2);
                    }
                }
            } else {
                azofVar.d();
                Throwable d2 = azqi.d(azqfVar);
                if (azruVar != null) {
                    this.k = null;
                    azruVar.b(d2);
                }
                ayqdVar.b(d2);
                return;
            }
        }
        azofVar.d();
        this.k = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.g.k(a);
        f();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.i.compareAndSet(false, true)) {
            this.d.qc();
            if (this.f.decrementAndGet() == 0) {
                ayrz.c(this.e);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f.decrementAndGet() == 0) {
            ayrz.c(this.e);
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this.e, ayqxVar)) {
            g();
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.d.qc();
        this.j = true;
        f();
    }
}
