package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayvj implements aypi {
    private final ayqw a;
    private final AtomicBoolean b;
    private final aypi c;

    public ayvj(ayqw ayqwVar, AtomicBoolean atomicBoolean, aypi aypiVar) {
        this.a = ayqwVar;
        this.b = atomicBoolean;
        this.c = aypiVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        if (this.b.compareAndSet(false, true)) {
            this.a.qc();
            this.c.b(th);
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        this.a.d(ayqxVar);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        if (this.b.compareAndSet(false, true)) {
            this.a.qc();
            this.c.sh();
        }
    }
}
