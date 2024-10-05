package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abq implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public abq(int i) {
        this.b = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    public abq(Handler handler, int i) {
        this.b = i;
        this.a = handler;
    }

    public abq(Looper looper, int i) {
        this.b = i;
        this.a = new amcc(looper, (byte[]) null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            this.a.post(runnable);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.a.post(runnable);
                return;
            } else {
                this.a.post(runnable);
                return;
            }
        }
        Handler handler = this.a;
        gn.g(runnable);
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(this.a + " is shutting down");
    }

    public abq(int i, byte[] bArr) {
        this.b = i;
        this.a = new amcc(Looper.getMainLooper(), (byte[]) null);
    }
}
