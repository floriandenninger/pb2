package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class siw extends anfn implements anic {
    public static final /* synthetic */ int b = 0;
    public final shf a;

    public siw(shf shfVar) {
        this.a = shfVar;
    }

    public static int a(Delayed delayed, Delayed delayed2) {
        long delay = delayed2.getDelay(TimeUnit.MILLISECONDS);
        long delay2 = delayed.getDelay(TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        return delay == delay2 ? 0 : 1;
    }

    private final ania i(Runnable runnable, long j, long j2, TimeUnit timeUnit, boolean z) {
        long millis = timeUnit.toMillis(j);
        siu siuVar = new siu(this, runnable, millis + this.a.d(), timeUnit.toMillis(j2), z);
        uqq.k(siuVar, millis);
        j(siuVar, siuVar);
        return siuVar;
    }

    private static final void j(anhy anhyVar, Runnable runnable) {
        anhyVar.d(new iiz(runnable, 3), angq.a);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final ania schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final ania schedule(Callable callable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        siv sivVar = new siv(this, callable, this.a.d() + millis);
        uqq.k(sivVar, millis);
        j(sivVar, sivVar);
        return sivVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final ania scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, true);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final ania scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        uqq.l(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // defpackage.anfn, defpackage.anib
    /* renamed from: qa */
    public final anhy submit(final Callable callable) {
        final SettableFuture f = SettableFuture.f();
        uqq.l(new Runnable() { // from class: sit
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture = SettableFuture.this;
                Callable callable2 = callable;
                int i = siw.b;
                try {
                    settableFuture.o(callable2.call());
                } catch (Exception e) {
                    settableFuture.e(e);
                    throw new RuntimeException(e);
                }
            }
        });
        return f;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.anfn, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        return submit(callable);
    }
}
