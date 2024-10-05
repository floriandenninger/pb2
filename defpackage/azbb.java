package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azbb extends AtomicBoolean implements aypq, banx {
    private static final long serialVersionUID = -5636543848937116287L;
    final banw a;
    boolean c;
    banx d;
    final long b = 1;
    long e = 1;

    public azbb(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (!this.c) {
            this.c = true;
            this.d.sd();
            this.a.b(th);
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.c) {
            return;
        }
        long j = this.e;
        long j2 = (-1) + j;
        this.e = j2;
        if (j > 0) {
            this.a.c(obj);
            if (j2 == 0) {
                this.d.sd();
                sh();
            }
        }
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.d, banxVar)) {
            this.d = banxVar;
            if (this.b == 0) {
                banxVar.sd();
                this.c = true;
                azpy.b(this.a);
                return;
            }
            this.a.f(this);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.d.sd();
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.sh();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            if (get() || !compareAndSet(false, true) || j < this.b) {
                this.d.sj(j);
            } else {
                this.d.sj(Long.MAX_VALUE);
            }
        }
    }
}
