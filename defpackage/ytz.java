package defpackage;

import java.net.SocketTimeoutException;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ytz implements Executor {
    public final long a;
    public final long b;
    public boolean c;
    private final BlockingQueue d = new LinkedBlockingDeque();

    public ytz(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(UrlRequest urlRequest) {
        c(urlRequest, this.b);
    }

    public final void c(UrlRequest urlRequest, long j) {
        try {
            Runnable runnable = (Runnable) this.d.poll(j, TimeUnit.MILLISECONDS);
            if (runnable == null) {
                urlRequest.cancel();
                throw new SocketTimeoutException();
            }
            runnable.run();
        } catch (InterruptedException e) {
            urlRequest.cancel();
            ClosedByInterruptException closedByInterruptException = new ClosedByInterruptException();
            closedByInterruptException.initCause(e);
            throw closedByInterruptException;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        if (!this.d.offer(runnable)) {
            throw new RejectedExecutionException();
        }
    }
}
