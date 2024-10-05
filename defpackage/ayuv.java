package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayuv extends AtomicInteger implements aypq, ayqx {
    private static final long serialVersionUID = -2108443387387077490L;
    final aypi a;
    banx f;
    final int b = Integer.MAX_VALUE;
    final boolean c = true;
    final ayqw e = new ayqw();
    final azqf d = new azqf();

    public ayuv(aypi aypiVar) {
        this.a = aypiVar;
        lazySet(1);
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (!this.c) {
            this.e.qc();
            if (azqi.e(this.d, th)) {
                if (getAndSet(0) > 0) {
                    this.a.b(azqi.d(this.d));
                    return;
                }
                return;
            }
            aynu.j(th);
            return;
        }
        if (azqi.e(this.d, th)) {
            if (decrementAndGet() == 0) {
                this.a.b(azqi.d(this.d));
                return;
            }
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.banw
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        getAndIncrement();
        ayuu ayuuVar = new ayuu(this);
        this.e.d(ayuuVar);
        ((aypk) obj).U(ayuuVar);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.e.b;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.f, banxVar)) {
            this.f = banxVar;
            this.a.se(this);
            int i = this.b;
            if (i == Integer.MAX_VALUE) {
                banxVar.sj(Long.MAX_VALUE);
            } else {
                banxVar.sj(i);
            }
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.f.sd();
        this.e.qc();
    }

    @Override // defpackage.banw
    public final void sh() {
        if (decrementAndGet() == 0) {
            if (((Throwable) this.d.get()) != null) {
                this.a.b(azqi.d(this.d));
            } else {
                this.a.sh();
            }
        }
    }
}
