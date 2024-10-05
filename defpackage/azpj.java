package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azpj extends ayqi {
    static final azpb b;
    static final ScheduledExecutorService c;
    final AtomicReference d;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        b = new azpb("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public azpj() {
        azpb azpbVar = b;
        AtomicReference atomicReference = new AtomicReference();
        this.d = atomicReference;
        atomicReference.lazySet(azph.a(azpbVar));
    }

    @Override // defpackage.ayqi
    public final ayqh a() {
        return new azpi((ScheduledExecutorService) this.d.get());
    }

    @Override // defpackage.ayqi
    public final ayqx c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future schedule;
        aynu.k(runnable);
        azpd azpdVar = new azpd(runnable);
        try {
            if (j <= 0) {
                schedule = ((ScheduledExecutorService) this.d.get()).submit(azpdVar);
            } else {
                schedule = ((ScheduledExecutorService) this.d.get()).schedule(azpdVar, j, timeUnit);
            }
            azpdVar.a(schedule);
            return azpdVar;
        } catch (RejectedExecutionException e) {
            aynu.j(e);
            return aysa.INSTANCE;
        }
    }

    @Override // defpackage.ayqi
    public final ayqx d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future schedule;
        aynu.k(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.get();
            azot azotVar = new azot(runnable, scheduledExecutorService);
            try {
                if (j <= 0) {
                    schedule = scheduledExecutorService.submit(azotVar);
                } else {
                    schedule = scheduledExecutorService.schedule(azotVar, j, timeUnit);
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
            azpcVar.a(((ScheduledExecutorService) this.d.get()).scheduleAtFixedRate(azpcVar, j, j2, timeUnit));
            return azpcVar;
        } catch (RejectedExecutionException e2) {
            aynu.j(e2);
            return aysa.INSTANCE;
        }
    }
}
