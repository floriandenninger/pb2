package defpackage;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amcb implements ExecutorService {
    public boolean b;
    public Runnable c;
    public final Deque a = new ArrayDeque();
    public int d = 1;
    private final amca f = new amca(this);
    private final boolean e = true;

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        int i;
        runnable.getClass();
        synchronized (this.a) {
            if (!this.b && (i = this.d) != 3 && i != 2) {
                this.a.add(runnable);
                Runnable f = amjk.f(this.f);
                this.c = f;
                uqq.l(f);
                this.d = 2;
            }
            this.a.add(runnable);
        }
        synchronized (this.a) {
            z = false;
            if (uqq.n() && this.e && !this.b && this.d != 3) {
                Runnable runnable2 = this.c;
                runnable2.getClass();
                uqq.m(runnable2);
                this.c = null;
                this.d = 2;
                z = true;
            }
        }
        if (z) {
            this.f.run();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return anaf.R(runnable, this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(final Runnable runnable, final Object obj) {
        return anaf.S(new Callable() { // from class: ambz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Runnable runnable2 = runnable;
                Object obj2 = obj;
                runnable2.run();
                return obj2;
            }
        }, this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return anaf.S(callable, this);
    }
}
