package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
class azoi extends AtomicReference implements ayqx {
    protected static final FutureTask a = new FutureTask(aysu.b, null);
    protected static final FutureTask b = new FutureTask(aysu.b, null);
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable c;
    protected Thread d;

    public azoi(Runnable runnable) {
        this.c = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == a) {
                return;
            }
            if (future2 == b) {
                future.cancel(this.d != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        Future future = (Future) get();
        return future == a || future == b;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == a || future == (futureTask = b) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.d != Thread.currentThread());
    }
}
