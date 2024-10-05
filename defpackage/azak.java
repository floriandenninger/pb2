package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azak extends AtomicInteger implements aypq, banx {
    private static final long serialVersionUID = -1776795561228106469L;
    final banw a;
    final ayro b;
    final ayte c;
    final AtomicLong d;
    final int e;
    final int f;
    volatile boolean g;
    volatile boolean h;
    Throwable i;
    banx j;
    Object k;
    int l;

    public azak(banw banwVar, ayro ayroVar, Object obj, int i) {
        this.a = banwVar;
        this.b = ayroVar;
        this.k = obj;
        this.e = i;
        this.f = i - (i >> 2);
        azog azogVar = new azog(i);
        this.c = azogVar;
        azogVar.k(obj);
        this.d = new AtomicLong();
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.h) {
            aynu.j(th);
            return;
        }
        this.i = th;
        this.h = true;
        d();
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.h) {
            return;
        }
        try {
            Object a = this.b.a(this.k, obj);
            aysw.b(a, "The accumulator returned a null value");
            this.k = a;
            this.c.k(a);
            d();
        } catch (Throwable th) {
            aynu.c(th);
            this.j.sd();
            b(th);
        }
    }

    final void d() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        banw banwVar = this.a;
        ayte ayteVar = this.c;
        int i = this.f;
        int i2 = this.l;
        int i3 = 1;
        do {
            long j = this.d.get();
            long j2 = 0;
            while (j2 != j) {
                if (this.g) {
                    ayteVar.d();
                    return;
                }
                boolean z = this.h;
                if (!z || (th = this.i) == null) {
                    Object sg = ayteVar.sg();
                    if (!z) {
                        if (sg == null) {
                            break;
                        }
                    } else if (sg == null) {
                        banwVar.sh();
                        return;
                    }
                    banwVar.c(sg);
                    j2++;
                    i2++;
                    if (i2 == i) {
                        this.j.sj(i);
                        i2 = 0;
                    }
                } else {
                    ayteVar.d();
                    banwVar.b(th);
                    return;
                }
            }
            if (j2 == j && this.h) {
                Throwable th2 = this.i;
                if (th2 == null) {
                    if (ayteVar.j()) {
                        banwVar.sh();
                        return;
                    }
                } else {
                    ayteVar.d();
                    banwVar.b(th2);
                    return;
                }
            }
            if (j2 != 0) {
                ayeq.n(this.d, j2);
            }
            this.l = i2;
            i3 = addAndGet(-i3);
        } while (i3 != 0);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.j, banxVar)) {
            this.j = banxVar;
            this.a.f(this);
            banxVar.sj(this.e - 1);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.g = true;
        this.j.sd();
        if (getAndIncrement() == 0) {
            this.c.d();
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.h) {
            return;
        }
        this.h = true;
        d();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.d, j);
            d();
        }
    }
}
