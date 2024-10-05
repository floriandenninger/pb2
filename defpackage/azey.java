package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azey implements ayqd, ayqx {
    static final azex a = new azex(null);
    final aypi b;
    final ayrv c;
    final azqf d = new azqf();
    final AtomicReference e = new AtomicReference();
    volatile boolean f;
    ayqx g;

    public azey(aypi aypiVar, ayrv ayrvVar) {
        this.b = aypiVar;
        this.c = ayrvVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (azqi.e(this.d, th)) {
            f();
            Throwable d = azqi.d(this.d);
            if (d != azqi.a) {
                this.b.b(d);
                return;
            }
            return;
        }
        aynu.j(th);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, aypk] */
    @Override // defpackage.ayqd
    public final void c(Object obj) {
        azex azexVar;
        try {
            ?? a2 = this.c.a(obj);
            azex azexVar2 = new azex(this);
            do {
                azexVar = (azex) this.e.get();
                if (azexVar == a) {
                    return;
                }
            } while (!this.e.compareAndSet(azexVar, azexVar2));
            if (azexVar != null) {
                ayrz.c(azexVar);
            }
            a2.U(azexVar2);
        } catch (Throwable th) {
            aynu.c(th);
            this.g.qc();
            b(th);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.e.get() == a;
    }

    final void f() {
        AtomicReference atomicReference = this.e;
        azex azexVar = a;
        azex azexVar2 = (azex) atomicReference.getAndSet(azexVar);
        if (azexVar2 == null || azexVar2 == azexVar) {
            return;
        }
        ayrz.c(azexVar2);
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.g.qc();
        f();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.g, ayqxVar)) {
            this.g = ayqxVar;
            this.b.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.f = true;
        if (this.e.get() == null) {
            Throwable d = azqi.d(this.d);
            if (d == null) {
                this.b.sh();
            } else {
                this.b.b(d);
            }
        }
    }
}
