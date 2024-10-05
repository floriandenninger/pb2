package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yno implements ynn {
    private final ScheduledExecutorService a;
    private final Executor b;
    private final Executor c;
    private final Executor d;

    public yno(yxx yxxVar, ScheduledExecutorService scheduledExecutorService, Executor executor, azrw azrwVar, azrw azrwVar2) {
        long f = yxxVar.f(yxx.U);
        if ((1 & f) != 0) {
            this.a = (ScheduledExecutorService) azrwVar.get();
            this.b = anaf.E((Executor) azrwVar2.get());
        } else {
            this.a = scheduledExecutorService;
            this.b = anaf.E(executor);
        }
        if ((32 & f) != 0) {
            this.c = executor;
        } else {
            this.c = new qmq(4);
        }
        this.d = executor;
    }

    @Override // defpackage.ynn
    public final void a(int i, Runnable runnable) {
        int i2 = i - 1;
        if (i2 == 0) {
            this.a.execute(runnable);
            return;
        }
        if (i2 == 1) {
            this.b.execute(runnable);
        } else if (i2 != 2) {
            this.c.execute(runnable);
        } else {
            this.d.execute(runnable);
        }
    }

    @Override // defpackage.ynn
    public final ScheduledFuture b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.a.schedule(runnable, j, timeUnit);
    }
}
