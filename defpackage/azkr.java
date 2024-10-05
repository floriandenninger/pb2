package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azkr extends AtomicInteger implements ayqd, ayqx {
    private static final long serialVersionUID = 1418547743690811973L;
    final ayqd a;
    final AtomicReference b = new AtomicReference();
    final azkq c = new azkq(this);
    final azqf d = new azqf();

    public azkr(ayqd ayqdVar) {
        this.a = ayqdVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        ayrz.c(this.c);
        ayeq.f(this.a, th, this, this.d);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        ayqd ayqdVar = this.a;
        azqf azqfVar = this.d;
        if (get() == 0 && compareAndSet(0, 1)) {
            ayqdVar.c(obj);
            if (decrementAndGet() != 0) {
                Throwable d = azqi.d(azqfVar);
                if (d != null) {
                    ayqdVar.b(d);
                } else {
                    ayqdVar.sh();
                }
            }
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) this.b.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        ayrz.c(this.b);
        ayeq.d(this.a, this, this.d);
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this.b);
        ayrz.c(this.c);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this.b, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        ayrz.c(this.c);
        ayeq.d(this.a, this, this.d);
    }
}
