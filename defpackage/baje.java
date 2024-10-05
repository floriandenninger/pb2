package defpackage;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class baje implements Executor {
    private final BlockingQueue a = new LinkedBlockingQueue();
    private boolean b;
    private boolean c;
    private InterruptedIOException d;
    private RuntimeException e;

    private final Runnable d(boolean z, long j) {
        Runnable runnable;
        try {
            if (!z) {
                runnable = (Runnable) this.a.take();
            } else {
                runnable = (Runnable) this.a.poll(j, TimeUnit.NANOSECONDS);
            }
            if (runnable != null) {
                return runnable;
            }
            throw new SocketTimeoutException();
        } catch (InterruptedException e) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        }
    }

    public final void a() {
        b(0);
    }

    public final void b(int i) {
        long nanoTime = System.nanoTime();
        long convert = TimeUnit.NANOSECONDS.convert(i, TimeUnit.MILLISECONDS);
        if (this.c) {
            InterruptedIOException interruptedIOException = this.d;
            if (interruptedIOException != null) {
                throw interruptedIOException;
            }
            throw this.e;
        }
        if (!this.b) {
            this.b = true;
            while (this.b) {
                if (i == 0) {
                    try {
                        d(false, 0L).run();
                    } catch (InterruptedIOException e) {
                        this.b = false;
                        this.c = true;
                        this.d = e;
                        throw e;
                    } catch (RuntimeException e2) {
                        this.b = false;
                        this.c = true;
                        this.e = e2;
                        throw e2;
                    }
                } else {
                    d(true, (convert - System.nanoTime()) + nanoTime).run();
                }
            }
            return;
        }
        throw new IllegalStateException("Cannot run loop when it is already running.");
    }

    public final void c() {
        this.b = false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.a.put(runnable);
        } catch (InterruptedException e) {
            throw new RejectedExecutionException(e);
        }
    }
}
