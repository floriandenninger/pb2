package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anhe extends amqt implements Future, anhy {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return f().cancel(z);
    }

    @Override // defpackage.anhy
    public final void d(Runnable runnable, Executor executor) {
        e().d(runnable, executor);
    }

    protected abstract anhy e();

    protected /* bridge */ /* synthetic */ Future f() {
        throw null;
    }

    @Override // defpackage.amqt
    protected /* bridge */ /* synthetic */ Object g() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return f().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return f().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return f().isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return f().get(j, timeUnit);
    }
}
