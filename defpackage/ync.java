package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ync extends ScheduledThreadPoolExecutor {
    public ync(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
    }

    static final long a(long j, TimeUnit timeUnit) {
        return j > timeUnit.convert(33554432L, TimeUnit.SECONDS) ? timeUnit.convert(33554432L, TimeUnit.SECONDS) : j;
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return super.schedule(runnable, a(j, timeUnit), timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleAtFixedRate(runnable, a(j, timeUnit), a(j2, timeUnit), timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleWithFixedDelay(runnable, a(j, timeUnit), a(j2, timeUnit), timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return super.schedule(callable, a(j, timeUnit), timeUnit);
    }
}
