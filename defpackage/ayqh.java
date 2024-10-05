package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayqh implements ayqx {
    public static final long f(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public ayqx a(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public abstract ayqx c(Runnable runnable, long j, TimeUnit timeUnit);

    public final ayqx d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        aysd aysdVar = new aysd();
        aysd aysdVar2 = new aysd(aysdVar);
        aynu.k(runnable);
        long nanos = timeUnit.toNanos(j2);
        long f = f(TimeUnit.NANOSECONDS);
        ayqx c = c(new ayqg(this, f + timeUnit.toNanos(j), runnable, f, aysdVar2, nanos), j, timeUnit);
        if (c == aysa.INSTANCE) {
            return c;
        }
        ayrz.i(aysdVar, c);
        return aysdVar2;
    }
}
