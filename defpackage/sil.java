package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sil extends AbstractExecutorService {
    private final ExecutorService a;
    private final nbq b;

    private sil(ExecutorService executorService, nbq nbqVar, byte[] bArr, byte[] bArr2) {
        this.a = executorService;
        this.b = nbqVar;
    }

    public static ExecutorService a(ammv ammvVar, ExecutorService executorService) {
        return ammvVar.h() ? new sil(executorService, (nbq) ammvVar.c(), null, null) : executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        yyp a;
        final yyz yyzVar = null;
        if (!this.b.a && (a = yyr.a()) != null) {
            yyzVar = new yyz(a);
        }
        ExecutorService executorService = this.a;
        if (yyzVar == null) {
            executorService.execute(runnable);
        } else {
            executorService.execute(new Runnable() { // from class: sik
                @Override // java.lang.Runnable
                public final void run() {
                    yyz yyzVar2 = yyz.this;
                    Runnable runnable2 = runnable;
                    yyr.k(yyzVar2.a);
                    yyzVar2.b.b();
                    try {
                        runnable2.run();
                        yyzVar2.close();
                    } catch (Throwable th) {
                        try {
                            yyzVar2.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                }
            });
        }
    }
}
