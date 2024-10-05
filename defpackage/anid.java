package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anid implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ anfm b;

    public anid(Executor executor, anfm anfmVar) {
        this.a = executor;
        this.b = anfmVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.e(e);
        }
    }
}
