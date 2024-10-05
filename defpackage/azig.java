package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azig extends AtomicInteger implements ayqx, ayqb {
    private static final long serialVersionUID = -3852313036005250360L;
    final Object a;
    public final azoh b;
    final azif c;
    public volatile boolean d;
    public Throwable e;
    final AtomicBoolean f = new AtomicBoolean();
    final AtomicBoolean g = new AtomicBoolean();
    final AtomicReference h = new AtomicReference();

    public azig(int i, azif azifVar, Object obj) {
        this.b = new azoh(i);
        this.c = azifVar;
        this.a = obj;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        azoh azohVar = this.b;
        ayqd ayqdVar = (ayqd) this.h.get();
        int i = 1;
        while (true) {
            if (ayqdVar != null) {
                while (true) {
                    boolean z = this.d;
                    Object sg = azohVar.sg();
                    if (this.f.get()) {
                        this.b.d();
                        this.c.f(this.a);
                        this.h.lazySet(null);
                        return;
                    }
                    if (z) {
                        Throwable th = this.e;
                        if (th != null) {
                            this.b.d();
                            this.h.lazySet(null);
                            ayqdVar.b(th);
                            return;
                        } else if (sg == null) {
                            this.h.lazySet(null);
                            ayqdVar.sh();
                            return;
                        }
                    }
                    if (sg == null) {
                        break;
                    } else {
                        ayqdVar.c(sg);
                    }
                }
            }
            i = addAndGet(-i);
            if (i == 0) {
                return;
            }
            if (ayqdVar == null) {
                ayqdVar = (ayqd) this.h.get();
            }
        }
    }

    @Override // defpackage.ayqb
    public final void aE(ayqd ayqdVar) {
        if (this.g.compareAndSet(false, true)) {
            ayqdVar.se(this);
            this.h.lazySet(ayqdVar);
            if (this.f.get()) {
                this.h.lazySet(null);
                return;
            } else {
                a();
                return;
            }
        }
        aysa.h(new IllegalStateException("Only one Observer allowed!"), ayqdVar);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.f.get();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.f.compareAndSet(false, true) && getAndIncrement() == 0) {
            this.h.lazySet(null);
            this.c.f(this.a);
        }
    }
}
