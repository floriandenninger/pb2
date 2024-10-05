package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayym extends azpv implements banv {
    private static final long serialVersionUID = -3852313036005250360L;
    final Object a;
    public final azoh b;
    final ayyl c;
    public volatile boolean e;
    public Throwable f;
    boolean j;
    int k;
    final AtomicLong d = new AtomicLong();
    final AtomicBoolean g = new AtomicBoolean();
    final AtomicReference h = new AtomicReference();
    final AtomicBoolean i = new AtomicBoolean();

    public ayym(int i, ayyl ayylVar, Object obj) {
        this.b = new azoh(i);
        this.c = ayylVar;
        this.a = obj;
    }

    @Override // defpackage.banv
    public final void ab(banw banwVar) {
        if (this.i.compareAndSet(false, true)) {
            banwVar.f(this);
            this.h.lazySet(banwVar);
            b();
            return;
        }
        azpy.f(new IllegalStateException("Only one Subscriber allowed!"), banwVar);
    }

    public final void b() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        int i = 1;
        if (!this.j) {
            azoh azohVar = this.b;
            banw banwVar = (banw) this.h.get();
            int i2 = 1;
            while (true) {
                if (banwVar != null) {
                    long j = this.d.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.e;
                        Object sg = azohVar.sg();
                        boolean z2 = sg == null;
                        if (f(z, z2, banwVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        banwVar.c(sg);
                        j2++;
                    }
                    if (j2 == j && f(this.e, azohVar.j(), banwVar)) {
                        return;
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            this.d.addAndGet(-j2);
                        }
                        this.c.g.sj(j2);
                    }
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
                if (banwVar == null) {
                    banwVar = (banw) this.h.get();
                }
            }
        } else {
            azoh azohVar2 = this.b;
            banw banwVar2 = (banw) this.h.get();
            while (true) {
                if (banwVar2 != null) {
                    if (this.g.get()) {
                        azohVar2.d();
                        return;
                    }
                    boolean z3 = this.e;
                    if (!z3 || (th = this.f) == null) {
                        banwVar2.c(null);
                        if (z3) {
                            Throwable th2 = this.f;
                            if (th2 != null) {
                                banwVar2.b(th2);
                                return;
                            } else {
                                banwVar2.sh();
                                return;
                            }
                        }
                    } else {
                        azohVar2.d();
                        banwVar2.b(th);
                        return;
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                if (banwVar2 == null) {
                    banwVar2 = (banw) this.h.get();
                }
            }
        }
    }

    @Override // defpackage.aytf
    public final void d() {
        this.b.d();
    }

    final boolean f(boolean z, boolean z2, banw banwVar) {
        if (this.g.get()) {
            this.b.d();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.f;
        if (th != null) {
            this.b.d();
            banwVar.b(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        banwVar.sh();
        return true;
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return this.b.j();
    }

    @Override // defpackage.banx
    public final void sd() {
        if (this.g.compareAndSet(false, true)) {
            ayyl ayylVar = this.c;
            Object obj = this.a;
            if (obj == null) {
                obj = ayyl.a;
            }
            ayylVar.e.remove(obj);
            if (ayylVar.j.decrementAndGet() == 0) {
                ayylVar.g.sd();
                if (ayylVar.getAndIncrement() == 0) {
                    ayylVar.f.d();
                }
            }
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.j = true;
        return 2;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        Object sg = this.b.sg();
        if (sg != null) {
            this.k++;
            return sg;
        }
        int i = this.k;
        if (i == 0) {
            return null;
        }
        this.k = 0;
        this.c.g.sj(i);
        return null;
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.d, j);
            b();
        }
    }
}
