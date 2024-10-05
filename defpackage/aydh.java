package defpackage;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aydh implements Executor {
    private final Thread.UncaughtExceptionHandler a;
    private final Queue b = new ConcurrentLinkedQueue();
    private final AtomicReference c = new AtomicReference();

    public aydh(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        uncaughtExceptionHandler.getClass();
        this.a = uncaughtExceptionHandler;
    }

    public final aydg a(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        aydf aydfVar = new aydf(runnable);
        return new aydg(aydfVar, scheduledExecutorService.schedule(new ayde(this, aydfVar, runnable), j, timeUnit));
    }

    public final void b() {
        while (this.c.compareAndSet(null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.c.set(null);
                    throw th2;
                }
            }
            this.c.set(null);
            if (this.b.isEmpty()) {
                return;
            }
        }
    }

    public final void c(Runnable runnable) {
        Queue queue = this.b;
        runnable.getClass();
        queue.add(runnable);
    }

    public final void d() {
        amkq.O(Thread.currentThread() == this.c.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable);
        b();
    }
}
