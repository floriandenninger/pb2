package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azlb extends AtomicLong implements ayqd, ayqx {
    private static final long serialVersionUID = 3764492702657003550L;
    final ayqd a;
    final long b;
    final TimeUnit c;
    final ayqh d;
    final aysd e = new aysd();
    final AtomicReference f = new AtomicReference();

    public azlb(ayqd ayqdVar, long j, TimeUnit timeUnit, ayqh ayqhVar) {
        this.a = ayqdVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayqhVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            ayrz.c(this.e);
            this.a.b(th);
            this.d.qc();
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                ((ayqx) this.e.get()).qc();
                this.a.c(obj);
                f(j2);
            }
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) this.f.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(long j) {
        ayrz.i(this.e, this.d.c(new azlc(j, this), this.b, this.c));
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this.f);
        this.d.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this.f, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            ayrz.c(this.e);
            this.a.sh();
            this.d.qc();
        }
    }
}
