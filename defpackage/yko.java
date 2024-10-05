package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yko extends yky {
    private final Executor b;

    private yko(Executor executor, ykl yklVar) {
        super(yklVar);
        executor.getClass();
        this.b = executor;
    }

    public static yko c(Executor executor, ykl yklVar) {
        return new yko(executor, yklVar);
    }

    @Override // defpackage.yky
    protected final void d(Runnable runnable) {
        this.b.execute(runnable);
    }
}
