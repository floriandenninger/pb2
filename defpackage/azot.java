package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azot implements Callable, ayqx {
    static final FutureTask a = new FutureTask(aysu.b, null);
    final Runnable b;
    final ExecutorService e;
    Thread f;
    final AtomicReference d = new AtomicReference();
    final AtomicReference c = new AtomicReference();

    public azot(Runnable runnable, ExecutorService executorService) {
        this.b = runnable;
        this.e = executorService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) this.d.get();
            if (future2 == a) {
                future.cancel(this.f != Thread.currentThread());
                return;
            }
        } while (!this.d.compareAndSet(future2, future));
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f = Thread.currentThread();
        try {
            this.b.run();
            Future submit = this.e.submit(this);
            while (true) {
                Future future = (Future) this.c.get();
                if (future != a) {
                    if (this.c.compareAndSet(future, submit)) {
                        break;
                    }
                } else {
                    submit.cancel(this.f != Thread.currentThread());
                }
            }
            this.f = null;
        } catch (Throwable th) {
            this.f = null;
            aynu.j(th);
        }
        return null;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d.get() == a;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        AtomicReference atomicReference = this.d;
        FutureTask futureTask = a;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f != Thread.currentThread());
        }
        Future future2 = (Future) this.c.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f != Thread.currentThread());
    }
}
