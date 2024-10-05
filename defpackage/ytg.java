package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ytg {
    private static final Object a = new Object();
    private final ExecutorService b;
    private boolean c;
    private boolean d;
    private Future e = anaf.O(false);

    public ytg(ExecutorService executorService) {
        this.b = executorService;
    }

    final void a() {
        synchronized (ytg.class) {
            if (this.e.isDone() || this.d) {
                return;
            }
            try {
                this.e.get(300L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException e) {
                zga.n("Timeout of 300 ms reached when loading GMS Cronet", e);
            } catch (Throwable th) {
                b(th);
            } finally {
                this.d = true;
            }
        }
    }

    final void b(Throwable th) {
        synchronized (a) {
            if (this.c) {
                return;
            }
            this.c = true;
            zga.d("Unexpected error when loading Cronet from GMS Core", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Context context) {
        try {
            this.e = this.b.submit(new sfk(context, 4));
        } catch (RejectedExecutionException e) {
            zga.d("Unable to schedule GMS Core Cronet loading task", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        if (!this.e.isDone() && !this.d) {
            a();
        }
        try {
            if (this.e.isDone()) {
                return ((Boolean) anaf.W(this.e)).booleanValue();
            }
            return false;
        } catch (Throwable th) {
            b(th);
            return false;
        }
    }
}
