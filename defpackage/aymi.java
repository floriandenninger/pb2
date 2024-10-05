package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aymi {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final amnp g;

    public aymi(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, amnp amnpVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = amnpVar;
        amnpVar.f();
    }

    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}
