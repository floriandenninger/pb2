package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ango extends anhx {
    private final Executor a;
    final /* synthetic */ angp b;

    public ango(angp angpVar, Executor executor) {
        this.b = angpVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.anhx
    public final void d(Throwable th) {
        this.b.c = null;
        if (th instanceof ExecutionException) {
            this.b.e(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.b.cancel(false);
        } else {
            this.b.e(th);
        }
    }

    @Override // defpackage.anhx
    public final void e(Object obj) {
        this.b.c = null;
        c(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.e(e);
        }
    }

    @Override // defpackage.anhx
    public final boolean g() {
        return this.b.isDone();
    }
}
