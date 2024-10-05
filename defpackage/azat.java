package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azat extends AtomicInteger implements aysx, banx {
    private static final long serialVersionUID = -6270983465606289181L;
    final banw a;
    final AtomicReference b = new AtomicReference();
    final AtomicLong c = new AtomicLong();
    final azas d = new azas(this);
    final azqf e = new azqf();
    volatile boolean f;

    public azat(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        azqb.f(this.d);
        ayeq.g(this.a, th, this, this.e);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (e(obj)) {
            return;
        }
        ((banx) this.b.get()).sj(1L);
    }

    @Override // defpackage.aysx
    public final boolean e(Object obj) {
        if (!this.f) {
            return false;
        }
        ayeq.h(this.a, obj, this, this.e);
        return true;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        azqb.j(this.b, this.c, banxVar);
    }

    @Override // defpackage.banx
    public final void sd() {
        azqb.f(this.b);
        azqb.f(this.d);
    }

    @Override // defpackage.banw
    public final void sh() {
        azqb.f(this.d);
        ayeq.e(this.a, this, this.e);
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        azqb.a(this.b, this.c, j);
    }
}
