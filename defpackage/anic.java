package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface anic extends ScheduledExecutorService, anib {
    ania b(Runnable runnable, long j, TimeUnit timeUnit);

    ania c(Callable callable, long j, TimeUnit timeUnit);

    ania d(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    ania e(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
