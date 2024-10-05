package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anhm {
    private final boolean a;
    private final amru b;

    public anhm(boolean z, amru amruVar) {
        this.a = z;
        this.b = amruVar;
    }

    public final anhy a(Callable callable, Executor executor) {
        return new angp(this.b, this.a, executor, callable);
    }

    public final anhy b(anfy anfyVar, Executor executor) {
        return new angp(this.b, this.a, executor, anfyVar);
    }

    public final anhy c(Runnable runnable, Executor executor) {
        return a(new baqn(runnable, 1), executor);
    }
}
