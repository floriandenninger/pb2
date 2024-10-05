package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azpi extends ayqh {
    final ScheduledExecutorService a;
    final ayqw b = new ayqw();
    volatile boolean c;

    public azpi(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.ayqh
    public final ayqx c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future schedule;
        if (this.c) {
            return aysa.INSTANCE;
        }
        aynu.k(runnable);
        azpe azpeVar = new azpe(runnable, this.b);
        this.b.d(azpeVar);
        try {
            if (j <= 0) {
                schedule = this.a.submit((Callable) azpeVar);
            } else {
                schedule = this.a.schedule((Callable) azpeVar, j, timeUnit);
            }
            azpeVar.a(schedule);
            return azpeVar;
        } catch (RejectedExecutionException e) {
            qc();
            aynu.j(e);
            return aysa.INSTANCE;
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.qc();
    }
}
