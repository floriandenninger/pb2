package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayux extends AtomicInteger implements aypi {
    private static final long serialVersionUID = -8360547806504310570L;
    final aypi a;
    final AtomicBoolean b;
    final ayqw c;

    public ayux(aypi aypiVar, AtomicBoolean atomicBoolean, ayqw ayqwVar) {
        this.a = aypiVar;
        this.b = atomicBoolean;
        this.c = ayqwVar;
        lazySet(3);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.c.qc();
        if (this.b.compareAndSet(false, true)) {
            this.a.b(th);
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        this.c.d(ayqxVar);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        if (decrementAndGet() == 0 && this.b.compareAndSet(false, true)) {
            this.a.sh();
        }
    }
}
