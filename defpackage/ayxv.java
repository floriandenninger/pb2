package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayxv extends AtomicInteger implements aypq, banx {
    private static final long serialVersionUID = 8600231336733376951L;
    final banw a;
    final ayrv g;
    banx i;
    volatile boolean j;
    final int b = Integer.MAX_VALUE;
    final AtomicLong c = new AtomicLong();
    final ayqw d = new ayqw();
    final azqf f = new azqf();
    final AtomicInteger e = new AtomicInteger(1);
    final AtomicReference h = new AtomicReference();

    public ayxv(banw banwVar, ayrv ayrvVar) {
        this.a = banwVar;
        this.g = ayrvVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.e.decrementAndGet();
        if (azqi.e(this.f, th)) {
            this.d.qc();
            h();
        } else {
            aynu.j(th);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ayqm, java.lang.Object] */
    @Override // defpackage.banw
    public final void c(Object obj) {
        try {
            ?? a = this.g.a(obj);
            this.e.getAndIncrement();
            ayxu ayxuVar = new ayxu(this);
            if (this.j || !this.d.d(ayxuVar)) {
                return;
            }
            a.Z(ayxuVar);
        } catch (Throwable th) {
            aynu.c(th);
            this.i.sd();
            b(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final azoh d() {
        azoh azohVar;
        do {
            azoh azohVar2 = (azoh) this.h.get();
            if (azohVar2 != null) {
                return azohVar2;
            }
            azohVar = new azoh(aypn.a);
        } while (!this.h.compareAndSet(null, azohVar));
        return azohVar;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.i, banxVar)) {
            this.i = banxVar;
            this.a.f(this);
            int i = this.b;
            if (i == Integer.MAX_VALUE) {
                banxVar.sj(Long.MAX_VALUE);
            } else {
                banxVar.sj(i);
            }
        }
    }

    final void g() {
        azoh azohVar = (azoh) this.h.get();
        if (azohVar != null) {
            azohVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        if (getAndIncrement() == 0) {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        banw banwVar = this.a;
        AtomicInteger atomicInteger = this.e;
        AtomicReference atomicReference = this.h;
        int i = 1;
        do {
            long j = this.c.get();
            long j2 = 0;
            while (j2 != j) {
                if (!this.j) {
                    if (((Throwable) this.f.get()) == null) {
                        int i2 = atomicInteger.get();
                        azoh azohVar = (azoh) atomicReference.get();
                        Object sg = azohVar != null ? azohVar.sg() : null;
                        if (i2 == 0) {
                            if (sg == null) {
                                Throwable d = azqi.d(this.f);
                                if (d != null) {
                                    banwVar.b(d);
                                    return;
                                } else {
                                    banwVar.sh();
                                    return;
                                }
                            }
                        } else if (sg == null) {
                            break;
                        }
                        banwVar.c(sg);
                        j2++;
                    } else {
                        Throwable d2 = azqi.d(this.f);
                        g();
                        banwVar.b(d2);
                        return;
                    }
                } else {
                    g();
                    return;
                }
            }
            if (j2 == j) {
                if (!this.j) {
                    if (((Throwable) this.f.get()) == null) {
                        int i3 = atomicInteger.get();
                        azoh azohVar2 = (azoh) atomicReference.get();
                        boolean z = azohVar2 == null || azohVar2.j();
                        if (i3 == 0 && z) {
                            Throwable d3 = azqi.d(this.f);
                            if (d3 != null) {
                                banwVar.b(d3);
                                return;
                            } else {
                                banwVar.sh();
                                return;
                            }
                        }
                    } else {
                        Throwable d4 = azqi.d(this.f);
                        g();
                        banwVar.b(d4);
                        return;
                    }
                } else {
                    g();
                    return;
                }
            }
            if (j2 != 0) {
                ayeq.n(this.c, j2);
                if (this.b != Integer.MAX_VALUE) {
                    this.i.sj(j2);
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
    }

    @Override // defpackage.banx
    public final void sd() {
        this.j = true;
        this.i.sd();
        this.d.qc();
    }

    @Override // defpackage.banw
    public final void sh() {
        this.e.decrementAndGet();
        h();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.c, j);
            h();
        }
    }
}
