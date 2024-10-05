package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class azoz extends ayqh implements ayqx {
    public final ScheduledExecutorService b;
    public volatile boolean c;

    public azoz(ThreadFactory threadFactory) {
        this.b = azph.a(threadFactory);
    }

    @Override // defpackage.ayqh
    public final ayqx a(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // defpackage.ayqh
    public final ayqx c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.c ? aysa.INSTANCE : i(runnable, j, timeUnit, null);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c;
    }

    public final ayqx g(Runnable runnable, long j, TimeUnit timeUnit) {
        Future schedule;
        aynu.k(runnable);
        azpd azpdVar = new azpd(runnable);
        try {
            if (j <= 0) {
                schedule = this.b.submit(azpdVar);
            } else {
                schedule = this.b.schedule(azpdVar, j, timeUnit);
            }
            azpdVar.a(schedule);
            return azpdVar;
        } catch (RejectedExecutionException e) {
            aynu.j(e);
            return aysa.INSTANCE;
        }
    }

    public final ayqx h(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future schedule;
        aynu.k(runnable);
        if (j2 <= 0) {
            azot azotVar = new azot(runnable, this.b);
            try {
                if (j <= 0) {
                    schedule = this.b.submit(azotVar);
                } else {
                    schedule = this.b.schedule(azotVar, j, timeUnit);
                }
                azotVar.a(schedule);
                return azotVar;
            } catch (RejectedExecutionException e) {
                aynu.j(e);
                return aysa.INSTANCE;
            }
        }
        azpc azpcVar = new azpc(runnable);
        try {
            azpcVar.a(this.b.scheduleAtFixedRate(azpcVar, j, j2, timeUnit));
            return azpcVar;
        } catch (RejectedExecutionException e2) {
            aynu.j(e2);
            return aysa.INSTANCE;
        }
    }

    public final azpe i(Runnable runnable, long j, TimeUnit timeUnit, ayry ayryVar) {
        Future schedule;
        aynu.k(runnable);
        azpe azpeVar = new azpe(runnable, ayryVar);
        if (ayryVar != null && !ayryVar.d(azpeVar)) {
            return azpeVar;
        }
        try {
            if (j <= 0) {
                schedule = this.b.submit((Callable) azpeVar);
            } else {
                schedule = this.b.schedule((Callable) azpeVar, j, timeUnit);
            }
            azpeVar.a(schedule);
        } catch (RejectedExecutionException e) {
            if (ayryVar != null) {
                ayryVar.i(azpeVar);
            }
            aynu.j(e);
        }
        return azpeVar;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.shutdownNow();
    }
}
