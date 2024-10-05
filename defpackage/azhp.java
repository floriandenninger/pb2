package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azhp extends AtomicInteger implements ayqd, ayqx {
    private static final long serialVersionUID = 8600231336733376951L;
    final ayqd a;
    final ayrv e;
    ayqx g;
    volatile boolean h;
    final ayqw b = new ayqw();
    final azqf d = new azqf();
    final AtomicInteger c = new AtomicInteger(1);
    final AtomicReference f = new AtomicReference();

    public azhp(ayqd ayqdVar, ayrv ayrvVar) {
        this.a = ayqdVar;
        this.e = ayrvVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.c.decrementAndGet();
        if (azqi.e(this.d, th)) {
            this.b.qc();
            g();
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        try {
            aypv aypvVar = (aypv) this.e.a(obj);
            aysw.b(aypvVar, "The mapper returned a null MaybeSource");
            this.c.getAndIncrement();
            azho azhoVar = new azho(this);
            if (this.h || !this.b.d(azhoVar)) {
                return;
            }
            aypvVar.Y(azhoVar);
        } catch (Throwable th) {
            aynu.c(th);
            this.g.qc();
            b(th);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.h;
    }

    final void f() {
        azoh azohVar = (azoh) this.f.get();
        if (azohVar != null) {
            azohVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.h = true;
        this.g.qc();
        this.b.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.g, ayqxVar)) {
            this.g = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.c.decrementAndGet();
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        ayqd ayqdVar = this.a;
        AtomicInteger atomicInteger = this.c;
        AtomicReference atomicReference = this.f;
        int i = 1;
        while (!this.h) {
            if (((Throwable) this.d.get()) == null) {
                int i2 = atomicInteger.get();
                azoh azohVar = (azoh) atomicReference.get();
                Object sg = azohVar != null ? azohVar.sg() : null;
                if (i2 == 0) {
                    if (sg == null) {
                        Throwable d = azqi.d(this.d);
                        if (d != null) {
                            ayqdVar.b(d);
                            return;
                        } else {
                            ayqdVar.sh();
                            return;
                        }
                    }
                } else if (sg == null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                ayqdVar.c(sg);
            } else {
                Throwable d2 = azqi.d(this.d);
                f();
                ayqdVar.b(d2);
                return;
            }
        }
        f();
    }
}
