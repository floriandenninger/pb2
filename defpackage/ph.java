package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ph implements pk {
    final /* synthetic */ pk c;
    final pi a = new pi();
    private final Executor d = AsyncTask.THREAD_POOL_EXECUTOR;
    final AtomicBoolean b = new AtomicBoolean(false);
    private final Runnable e = new pg(this);

    public ph(pk pkVar) {
        this.c = pkVar;
    }

    private final void d() {
        if (this.b.compareAndSet(false, true)) {
            this.d.execute(this.e);
        }
    }

    public final void a(pj pjVar) {
        this.a.c(pjVar);
        d();
    }

    @Override // defpackage.pk
    public final void b(pm pmVar) {
        a(pj.b(4, 0, pmVar));
    }

    public final void c(pj pjVar) {
        this.a.d(pjVar);
        d();
    }
}
