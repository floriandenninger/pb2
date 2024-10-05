package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sjh extends AbstractExecutorService {
    public final sjo a;
    public final sjq b;
    public final sjr c;
    public final boolean d;
    public final anic e;
    private final AtomicInteger f = new AtomicInteger(1000);
    private final ExecutorService g;
    private final sjj h;

    public sjh(sjq sjqVar, sjr sjrVar, boolean z, anic anicVar, sjo sjoVar, ExecutorService executorService, sjj sjjVar) {
        this.a = sjoVar;
        this.g = executorService;
        this.h = sjjVar;
        this.b = sjqVar;
        this.c = sjrVar;
        this.d = z;
        this.e = anicVar;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.g.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.c();
        if (sjp.c()) {
            this.g.execute(new sjg(this, runnable));
        } else {
            this.g.execute(runnable);
        }
        this.c.a();
        if (!sjp.c()) {
            return;
        }
        int a = this.h.a();
        this.c.b();
        if (a < 1000) {
            return;
        }
        while (true) {
            int i = this.f.get();
            if (a < i) {
                return;
            }
            if (this.f.compareAndSet(i, i + i)) {
                this.c.b();
                StringBuilder sb = new StringBuilder(69);
                sb.append("Queue size of ");
                sb.append(a);
                sb.append(" exceeds starvation threshold of 1000");
                sjp.b(this.b, this.a.a(), new sjk(sb.toString()));
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.g.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.g.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.g.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.g.shutdownNow();
    }

    public final String toString() {
        String obj = this.g.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 12);
        sb.append("Monitoring[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
