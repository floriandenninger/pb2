package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baap {
    public static final long a;
    public static final int b;
    public static final int c;
    public static final long d;

    static {
        long u;
        long u2;
        u = ayep.u("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        a = u;
        ayep.w("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12);
        int w = ayep.w("kotlinx.coroutines.scheduler.core.pool.size", azuj.c(baad.a, 2), 1, 0, 8);
        b = w;
        c = ayep.w("kotlinx.coroutines.scheduler.max.pool.size", azuj.e(baad.a * 128, w, 2097150), 0, 2097150, 4);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        u2 = ayep.u("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE);
        d = timeUnit.toNanos(u2);
    }
}
