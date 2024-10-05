package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azos extends ayqi {
    static final ayqi b;
    final Executor c;

    static {
        ayqi ayqiVar = azre.a;
        ayrv ayrvVar = aynu.h;
        b = ayqiVar;
    }

    public azos(Executor executor) {
        this.c = executor;
    }

    @Override // defpackage.ayqi
    public final ayqh a() {
        return new azor(this.c);
    }

    @Override // defpackage.ayqi
    public final ayqx c(Runnable runnable, long j, TimeUnit timeUnit) {
        aynu.k(runnable);
        if (this.c instanceof ScheduledExecutorService) {
            try {
                azpd azpdVar = new azpd(runnable);
                azpdVar.a(((ScheduledExecutorService) this.c).schedule(azpdVar, j, timeUnit));
                return azpdVar;
            } catch (RejectedExecutionException e) {
                aynu.j(e);
                return aysa.INSTANCE;
            }
        }
        azoo azooVar = new azoo(runnable);
        ayrz.i(azooVar.a, b.c(new azon(this, azooVar), j, timeUnit));
        return azooVar;
    }

    @Override // defpackage.ayqi
    public final ayqx d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (this.c instanceof ScheduledExecutorService) {
            aynu.k(runnable);
            try {
                azpc azpcVar = new azpc(runnable);
                azpcVar.a(((ScheduledExecutorService) this.c).scheduleAtFixedRate(azpcVar, j, j2, timeUnit));
                return azpcVar;
            } catch (RejectedExecutionException e) {
                aynu.j(e);
                return aysa.INSTANCE;
            }
        }
        return super.d(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.ayqi
    public final ayqx f(Runnable runnable) {
        aynu.k(runnable);
        try {
            if (!(this.c instanceof ExecutorService)) {
                azop azopVar = new azop(runnable);
                this.c.execute(azopVar);
                return azopVar;
            }
            azpd azpdVar = new azpd(runnable);
            azpdVar.a(((ExecutorService) this.c).submit(azpdVar));
            return azpdVar;
        } catch (RejectedExecutionException e) {
            aynu.j(e);
            return aysa.INSTANCE;
        }
    }
}
