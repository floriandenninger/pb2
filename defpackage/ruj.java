package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ruj implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public ruj(int i) {
        this.b = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    public ruj(Handler handler, int i) {
        this.b = i;
        this.a = handler;
    }

    public ruj(int i, byte[] bArr) {
        this.b = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    public ruj(int i, char[] cArr) {
        this.b = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                runnable.run();
                return;
            } else {
                this.a.post(runnable);
                return;
            }
        }
        if (i == 1) {
            this.a.post(runnable);
            return;
        }
        if (i == 2) {
            this.a.post(runnable);
        } else if (i == 3) {
            this.a.post(runnable);
        } else {
            this.a.post(runnable);
        }
    }
}
