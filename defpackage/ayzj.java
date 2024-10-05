package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayzj extends AtomicLong implements aypq, banx {
    private static final long serialVersionUID = -3176480756392482682L;
    final banw a;
    banx b;
    boolean c;

    public ayzj(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.c) {
            aynu.j(th);
        } else {
            this.c = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.c) {
            return;
        }
        if (get() != 0) {
            this.a.c(obj);
            ayeq.n(this, 1L);
        } else {
            b(new ayrg("could not emit value due to lack of requests"));
        }
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.b, banxVar)) {
            this.b = banxVar;
            this.a.f(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.b.sd();
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
            ayeq.j(this, j);
        }
    }
}
