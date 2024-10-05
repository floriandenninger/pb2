package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aznv extends AtomicReference implements Runnable, ayqk, ayqx {
    private static final long serialVersionUID = 37497744973048446L;
    final ayqk a;
    final AtomicReference b = new AtomicReference();
    final long c;
    final TimeUnit d;

    public aznv(ayqk ayqkVar, long j, TimeUnit timeUnit) {
        this.a = ayqkVar;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        ayqx ayqxVar = (ayqx) get();
        if (ayqxVar == ayrz.a || !compareAndSet(ayqxVar, ayrz.a)) {
            aynu.j(th);
        } else {
            ayrz.c(this.b);
            this.a.b(th);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
        ayrz.c(this.b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayqx ayqxVar = (ayqx) get();
        if (ayqxVar == ayrz.a || !compareAndSet(ayqxVar, ayrz.a)) {
            return;
        }
        if (ayqxVar != null) {
            ayqxVar.qc();
        }
        this.a.b(new TimeoutException(azqi.c(this.c, this.d)));
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        ayqx ayqxVar = (ayqx) get();
        if (ayqxVar == ayrz.a || !compareAndSet(ayqxVar, ayrz.a)) {
            return;
        }
        ayrz.c(this.b);
        this.a.sc(obj);
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }
}
