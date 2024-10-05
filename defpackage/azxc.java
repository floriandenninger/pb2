package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azxc extends azxb {
    private final Executor b;

    public azxc(Executor executor) {
        this.b = executor;
        azzk.a(executor);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof azxc) && ((azxc) obj).b == this.b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    @Override // defpackage.azwj
    public final void so(azsv azsvVar, Runnable runnable) {
        azsvVar.getClass();
        try {
            this.b.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            azuj.f(azsvVar, cancellationException);
            azwv.b.so(azsvVar, runnable);
        }
    }

    @Override // defpackage.azwj
    public final String toString() {
        return this.b.toString();
    }
}
