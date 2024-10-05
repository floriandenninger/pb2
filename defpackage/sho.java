package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sho extends ScheduledThreadPoolExecutor {
    public sho(ThreadFactory threadFactory) {
        super(1, threadFactory);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final RunnableScheduledFuture decorateTask(Runnable runnable, RunnableScheduledFuture runnableScheduledFuture) {
        return sir.b(runnableScheduledFuture);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final RunnableScheduledFuture decorateTask(Callable callable, RunnableScheduledFuture runnableScheduledFuture) {
        return sir.b(runnableScheduledFuture);
    }
}
