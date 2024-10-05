package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azpu extends AtomicInteger implements aypq, banx {
    private static final long serialVersionUID = -4945028590049415624L;
    final banw a;
    final azqf b = new azqf();
    final AtomicLong c = new AtomicLong();
    final AtomicReference d = new AtomicReference();
    final AtomicBoolean e = new AtomicBoolean();
    volatile boolean f;

    public azpu(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.f = true;
        ayeq.g(this.a, th, this, this.b);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        ayeq.h(this.a, obj, this, this.b);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (this.e.compareAndSet(false, true)) {
            this.a.f(this);
            azqb.j(this.d, this.c, banxVar);
        } else {
            banxVar.sd();
            sd();
            b(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        if (this.f) {
            return;
        }
        azqb.f(this.d);
    }

    @Override // defpackage.banw
    public final void sh() {
        this.f = true;
        ayeq.e(this.a, this, this.b);
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (j <= 0) {
            sd();
            StringBuilder sb = new StringBuilder(79);
            sb.append("§3.9 violated: positive request amount required but it was ");
            sb.append(j);
            b(new IllegalArgumentException(sb.toString()));
            return;
        }
        azqb.a(this.d, this.c, j);
    }
}
