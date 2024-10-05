package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayzd extends azpv implements aypq {
    private static final long serialVersionUID = -2514538129242366402L;
    final banw a;
    final ayte b;
    banx c;
    volatile boolean d;
    volatile boolean e;
    Throwable f;
    final AtomicLong g = new AtomicLong();
    boolean h;

    public ayzd(banw banwVar, int i) {
        this.a = banwVar;
        this.b = new azoh(i);
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.f = th;
        this.e = true;
        if (this.h) {
            this.a.b(th);
        } else {
            g();
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.b.k(obj);
        if (this.h) {
            this.a.c(null);
        } else {
            g();
        }
    }

    @Override // defpackage.aytf
    public final void d() {
        this.b.d();
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.c, banxVar)) {
            this.c = banxVar;
            this.a.f(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    final void g() {
        if (getAndIncrement() == 0) {
            ayte ayteVar = this.b;
            banw banwVar = this.a;
            int i = 1;
            while (!h(this.e, ayteVar.j(), banwVar)) {
                long j = this.g.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.e;
                    Object sg = ayteVar.sg();
                    boolean z2 = sg == null;
                    if (h(z, z2, banwVar)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    banwVar.c(sg);
                    j2++;
                }
                if (j2 == j && h(this.e, ayteVar.j(), banwVar)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.g.addAndGet(-j2);
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    final boolean h(boolean z, boolean z2, banw banwVar) {
        if (this.d) {
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
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.sd();
        if (getAndIncrement() == 0) {
            this.b.d();
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.h = true;
        return 2;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        return this.b.sg();
    }

    @Override // defpackage.banw
    public final void sh() {
        this.e = true;
        if (this.h) {
            this.a.sh();
        } else {
            g();
        }
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (this.h || !azqb.h(j)) {
            return;
        }
        ayeq.j(this.g, j);
        g();
    }
}
