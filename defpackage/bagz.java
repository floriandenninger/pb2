package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bagz implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ bahe b;

    public bagz(bahe baheVar, Executor executor) {
        this.b = baheVar;
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.f(e);
        }
    }
}
