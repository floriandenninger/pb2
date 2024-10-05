package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cgh extends FutureTask {
    final /* synthetic */ cgi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgh(cgi cgiVar, Callable callable) {
        super(callable);
        this.a = cgiVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (isCancelled()) {
            return;
        }
        try {
            this.a.c((cgf) get());
        } catch (InterruptedException | ExecutionException e) {
            this.a.c(new cgf(e));
        }
    }
}
