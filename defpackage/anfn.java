package defpackage;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anfn extends AbstractExecutorService implements anib {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return aniu.h(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: pZ, reason: merged with bridge method [inline-methods] */
    public final anhy submit(Runnable runnable) {
        return (anhy) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: qa, reason: merged with bridge method [inline-methods] */
    public anhy submit(Callable callable) {
        return (anhy) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: qb, reason: merged with bridge method [inline-methods] */
    public final anhy submit(Runnable runnable, Object obj) {
        return (anhy) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return aniu.g(callable);
    }
}
