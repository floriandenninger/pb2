package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayqi {
    static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public static final long e(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public abstract ayqh a();

    public ayqx c(Runnable runnable, long j, TimeUnit timeUnit) {
        ayqh a2 = a();
        aynu.k(runnable);
        ayqe ayqeVar = new ayqe(runnable, a2);
        a2.c(ayqeVar, j, timeUnit);
        return ayqeVar;
    }

    public ayqx d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ayqh a2 = a();
        aynu.k(runnable);
        ayqf ayqfVar = new ayqf(runnable, a2);
        ayqx d = a2.d(ayqfVar, j, j2, timeUnit);
        return d == aysa.INSTANCE ? d : ayqfVar;
    }

    public ayqx f(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }
}
