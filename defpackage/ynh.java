package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ynh extends ync {
    public static final List a = new CopyOnWriteArrayList();
    public final vak b;

    public ynh(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
        this.b = new vak((char[]) null);
        a.add(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        vak vakVar = this.b;
        if (th == null && (runnable instanceof Future)) {
            try {
                Future future = (Future) runnable;
                if (future.isDone() && !future.isCancelled()) {
                    future.get();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                th = e.getCause();
            }
        }
        if (vakVar.a.isEmpty()) {
            return;
        }
        Iterator it = vakVar.a.iterator();
        while (it.hasNext()) {
            ((ynf) it.next()).e(th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        vak vakVar = this.b;
        if (vakVar.a.isEmpty()) {
            return;
        }
        Iterator it = vakVar.a.iterator();
        while (it.hasNext()) {
            ((ynf) it.next()).d();
        }
    }

    @Override // defpackage.ync, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return super.schedule(this.b.e(runnable), j, timeUnit);
    }

    @Override // defpackage.ync, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleAtFixedRate(this.b.e(runnable), j, j2, timeUnit);
    }

    @Override // defpackage.ync, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleWithFixedDelay(this.b.e(runnable), j, j2, timeUnit);
    }

    @Override // defpackage.ync, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        vak vakVar = this.b;
        if (!vakVar.a.isEmpty()) {
            Iterator it = vakVar.a.iterator();
            while (it.hasNext()) {
                callable = ((ynf) it.next()).b(callable);
            }
        }
        return super.schedule(callable, j, timeUnit);
    }
}
