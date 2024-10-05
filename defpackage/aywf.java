package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aywf extends aywe {
    private static final long serialVersionUID = 2427151001689639875L;
    final azoh c;
    Throwable d;
    volatile boolean e;
    final AtomicInteger f;

    public aywf(banw banwVar, int i) {
        super(banwVar);
        this.c = new azoh(i);
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
            this.c.k(obj);
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
            this.c.d();
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
        azoh azohVar = this.c;
        int i = 1;
        do {
            long j = get();
            long j2 = 0;
            while (j2 != j) {
                if (!j()) {
                    boolean z = this.e;
                    Object sg = azohVar.sg();
                    if (z) {
                        if (sg == null) {
                            Throwable th = this.d;
                            if (th != null) {
                                i(th);
                                return;
                            } else {
                                f();
                                return;
                            }
                        }
                    } else if (sg == null) {
                        break;
                    }
                    banwVar.c(sg);
                    j2++;
                } else {
                    azohVar.d();
                    return;
                }
            }
            if (j2 == j) {
                if (!j()) {
                    boolean z2 = this.e;
                    boolean j3 = azohVar.j();
                    if (z2 && j3) {
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
                    azohVar.d();
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
