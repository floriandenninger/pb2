package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anii extends anif implements anic {
    final ScheduledExecutorService a;

    public anii(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final ania schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        aniu h = aniu.h(runnable, null);
        return new anig(h, this.a.schedule(h, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final ania schedule(Callable callable, long j, TimeUnit timeUnit) {
        aniu g = aniu.g(callable);
        return new anig(g, this.a.schedule(g, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final ania scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        anih anihVar = new anih(runnable);
        return new anig(anihVar, this.a.scheduleAtFixedRate(anihVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final ania scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        anih anihVar = new anih(runnable);
        return new anig(anihVar, this.a.scheduleWithFixedDelay(anihVar, j, j2, timeUnit));
    }
}
