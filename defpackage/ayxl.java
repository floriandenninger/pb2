package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayxl extends AtomicReference implements aypq, ayqx {
    private static final long serialVersionUID = -4606175640614850599L;
    final long a;
    final ayxm b;
    final int c;
    final int d;
    volatile boolean e;
    volatile aytf f;
    long g;
    int h;

    public ayxl(ayxm ayxmVar, long j) {
        this.a = j;
        this.b = ayxmVar;
        int i = ayxmVar.f;
        this.d = i;
        this.c = i >> 2;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        lazySet(azqb.a);
        ayxm ayxmVar = this.b;
        if (azqi.e(ayxmVar.i, th)) {
            this.e = true;
            ayxmVar.m.sd();
            for (ayxl ayxlVar : (ayxl[]) ayxmVar.k.getAndSet(ayxm.b)) {
                azqb.f(ayxlVar);
            }
            ayxmVar.h();
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.h == 2) {
            this.b.h();
            return;
        }
        ayxm ayxmVar = this.b;
        if (ayxmVar.get() == 0 && ayxmVar.compareAndSet(0, 1)) {
            long j = ayxmVar.l.get();
            aytf aytfVar = this.f;
            if (j == 0 || !(aytfVar == null || aytfVar.j())) {
                if (aytfVar == null && (aytfVar = this.f) == null) {
                    aytfVar = new azog(ayxmVar.f);
                    this.f = aytfVar;
                }
                if (!aytfVar.k(obj)) {
                    ayxmVar.b(new ayrg("Inner queue full?!"));
                    return;
                }
            } else {
                ayxmVar.c.c(obj);
                if (j != Long.MAX_VALUE) {
                    ayxmVar.l.decrementAndGet();
                }
                d(1L);
            }
            if (ayxmVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            aytf aytfVar2 = this.f;
            if (aytfVar2 == null) {
                aytfVar2 = new azog(ayxmVar.f);
                this.f = aytfVar2;
            }
            if (!aytfVar2.k(obj)) {
                ayxmVar.b(new ayrg("Inner queue full?!"));
                return;
            } else if (ayxmVar.getAndIncrement() != 0) {
                return;
            }
        }
        ayxmVar.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(long j) {
        if (this.h != 1) {
            long j2 = this.g + j;
            if (j2 < this.c) {
                this.g = j2;
            } else {
                this.g = 0L;
                ((banx) get()).sj(j2);
            }
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == azqb.a;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.g(this, banxVar)) {
            if (banxVar instanceof aytc) {
                aytc aytcVar = (aytc) banxVar;
                int sf = aytcVar.sf(7);
                if (sf == 1) {
                    this.h = 1;
                    this.f = aytcVar;
                    this.e = true;
                    this.b.h();
                    return;
                }
                if (sf == 2) {
                    this.h = 2;
                    this.f = aytcVar;
                }
            }
            banxVar.sj(this.d);
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        azqb.f(this);
    }

    @Override // defpackage.banw
    public final void sh() {
        this.e = true;
        this.b.h();
    }
}
