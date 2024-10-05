package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cez implements Executor {
    final /* synthetic */ cfa a;

    public cez(cfa cfaVar) {
        this.a = cfaVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.b.post(runnable);
    }
}
