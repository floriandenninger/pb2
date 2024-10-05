package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aytr extends CountDownLatch implements Future, ayqk, ayqx {
    Object a;
    Throwable b;
    final AtomicReference c;

    public aytr() {
        super(1);
        this.c = new AtomicReference();
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        ayqx ayqxVar;
        do {
            ayqxVar = (ayqx) this.c.get();
            if (ayqxVar == ayrz.a) {
                aynu.j(th);
                return;
            }
            this.b = th;
        } while (!this.c.compareAndSet(ayqxVar, this));
        countDown();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ayqx ayqxVar;
        do {
            ayqxVar = (ayqx) this.c.get();
            if (ayqxVar == this || ayqxVar == ayrz.a) {
                return false;
            }
        } while (!this.c.compareAndSet(ayqxVar, ayrz.a));
        if (ayqxVar != null) {
            ayqxVar.qc();
        }
        countDown();
        return true;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        if (getCount() != 0) {
            boolean z = aynu.x;
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.b;
            if (th == null) {
                return this.a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return ayrz.d((ayqx) this.c.get());
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // defpackage.ayqx
    public final void qc() {
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        ayqx ayqxVar = (ayqx) this.c.get();
        if (ayqxVar == ayrz.a) {
            return;
        }
        this.a = obj;
        this.c.compareAndSet(ayqxVar, this);
        countDown();
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this.c, ayqxVar);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        if (getCount() != 0) {
            boolean z = aynu.x;
            if (!await(j, timeUnit)) {
                throw new TimeoutException(azqi.c(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.b;
            if (th != null) {
                throw new ExecutionException(th);
            }
            return this.a;
        }
        throw new CancellationException();
    }
}
