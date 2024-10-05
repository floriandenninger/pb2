package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azgb extends AtomicInteger implements aypz {
    private static final long serialVersionUID = 4883307006032401862L;
    public final aypz a;
    final azqf b = new azqf();
    final azoh c = new azoh(16);
    public volatile boolean d;

    public azgb(aypz aypzVar) {
        this.a = aypzVar;
    }

    @Override // defpackage.aypm
    public final void a() {
        throw null;
    }

    public final void b() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    @Override // defpackage.aypm
    public final void c(Throwable th) {
        throw null;
    }

    @Override // defpackage.aypm
    public final void d(Object obj) {
        if (this.a.e() || this.d) {
            return;
        }
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (g(nullPointerException)) {
                return;
            }
            aynu.j(nullPointerException);
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            this.a.d(obj);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            azoh azohVar = this.c;
            synchronized (azohVar) {
                azohVar.k(obj);
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        h();
    }

    @Override // defpackage.aypz, defpackage.ayqx
    public final boolean e() {
        throw null;
    }

    @Override // defpackage.aypz
    public final void f(ayrr ayrrVar) {
        throw null;
    }

    @Override // defpackage.aypz
    public final boolean g(Throwable th) {
        if (this.a.e() || this.d || !azqi.e(this.b, th)) {
            return false;
        }
        this.d = true;
        b();
        return true;
    }

    final void h() {
        aypz aypzVar = this.a;
        azoh azohVar = this.c;
        azqf azqfVar = this.b;
        int i = 1;
        while (!aypzVar.e()) {
            if (azqfVar.get() == null) {
                boolean z = this.d;
                Object sg = azohVar.sg();
                if (z) {
                    if (sg == null) {
                        aypzVar.a();
                        return;
                    }
                } else if (sg == null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                aypzVar.d(sg);
            } else {
                azohVar.d();
                aypzVar.c(azqi.d(azqfVar));
                return;
            }
        }
        azohVar.d();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.a.toString();
    }
}
