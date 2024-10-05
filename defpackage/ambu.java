package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ambu implements Runnable {
    public anfy a;
    public Executor b;

    public ambu(anfy anfyVar, Executor executor) {
        anfyVar.getClass();
        this.a = anfyVar;
        executor.getClass();
        this.b = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = null;
        this.b = null;
    }
}
