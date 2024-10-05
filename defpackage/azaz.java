package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azaz extends AtomicInteger implements aypq, banx {
    static final azay a;
    private static final long serialVersionUID = -3491074160481096299L;
    final banw b;
    final ayrv c;
    final int d;
    volatile boolean f;
    volatile boolean h;
    banx i;
    volatile long l;
    final AtomicReference j = new AtomicReference();
    final AtomicLong k = new AtomicLong();
    final boolean e = false;
    final azqf g = new azqf();

    static {
        azay azayVar = new azay(null, -1L, 1);
        a = azayVar;
        azqb.f(azayVar);
    }

    public azaz(banw banwVar, ayrv ayrvVar, int i) {
        this.b = banwVar;
        this.c = ayrvVar;
        this.d = i;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.f || !azqi.e(this.g, th)) {
            aynu.j(th);
            return;
        }
        d();
        this.f = true;
        g();
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        azay azayVar;
        if (this.f) {
            return;
        }
        long j = this.l + 1;
        this.l = j;
        azay azayVar2 = (azay) this.j.get();
        if (azayVar2 != null) {
            azqb.f(azayVar2);
        }
        try {
            banv banvVar = (banv) this.c.a(obj);
            aysw.b(banvVar, "The publisher returned is null");
            azay azayVar3 = new azay(this, j, this.d);
            do {
                azayVar = (azay) this.j.get();
                if (azayVar == a) {
                    return;
                }
            } while (!this.j.compareAndSet(azayVar, azayVar3));
            banvVar.ab(azayVar3);
        } catch (Throwable th) {
            aynu.c(th);
            this.i.sd();
            b(th);
        }
    }

    final void d() {
        azay azayVar;
        azay azayVar2 = (azay) this.j.get();
        azay azayVar3 = a;
        if (azayVar2 == azayVar3 || (azayVar = (azay) this.j.getAndSet(azayVar3)) == azayVar3 || azayVar == null) {
            return;
        }
        azqb.f(azayVar);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.i, banxVar)) {
            this.i = banxVar;
            this.b.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        boolean z;
        Object obj;
        if (getAndIncrement() != 0) {
            return;
        }
        banw banwVar = this.b;
        int i = 1;
        while (!this.h) {
            if (this.f) {
                if (((Throwable) this.g.get()) == null) {
                    if (this.j.get() == null) {
                        banwVar.sh();
                        return;
                    }
                } else {
                    d();
                    banwVar.b(azqi.d(this.g));
                    return;
                }
            }
            azay azayVar = (azay) this.j.get();
            aytf aytfVar = azayVar != null ? azayVar.d : null;
            if (aytfVar != null) {
                if (azayVar.e) {
                    if (((Throwable) this.g.get()) == null) {
                        if (aytfVar.j()) {
                            this.j.compareAndSet(azayVar, null);
                        }
                    } else {
                        d();
                        banwVar.b(azqi.d(this.g));
                        return;
                    }
                }
                long j = this.k.get();
                long j2 = 0;
                while (j2 != j) {
                    if (!this.h) {
                        boolean z2 = azayVar.e;
                        try {
                            obj = aytfVar.sg();
                        } catch (Throwable th) {
                            aynu.c(th);
                            azqb.f(azayVar);
                            azqi.e(this.g, th);
                            obj = null;
                            z2 = true;
                        }
                        if (azayVar == this.j.get()) {
                            if (z2) {
                                if (((Throwable) this.g.get()) != null) {
                                    banwVar.b(azqi.d(this.g));
                                    return;
                                } else if (obj == null) {
                                    this.j.compareAndSet(azayVar, null);
                                }
                            } else if (obj == null) {
                                break;
                            }
                            banwVar.c(obj);
                            j2++;
                        }
                        z = true;
                        break;
                    }
                    return;
                }
                z = false;
                if (j2 != 0 && !this.h) {
                    if (j != Long.MAX_VALUE) {
                        this.k.addAndGet(-j2);
                    }
                    if (azayVar.f != 1) {
                        ((banx) azayVar.get()).sj(j2);
                    }
                }
                if (z) {
                    continue;
                }
            }
            i = addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
        this.j.lazySet(null);
    }

    @Override // defpackage.banx
    public final void sd() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.i.sd();
        d();
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.f) {
            return;
        }
        this.f = true;
        g();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.k, j);
            if (this.l == 0) {
                this.i.sj(Long.MAX_VALUE);
            } else {
                g();
            }
        }
    }
}
