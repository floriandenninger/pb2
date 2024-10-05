package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayqs extends ayqh {
    private final Handler a;
    private volatile boolean b;

    public ayqs(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.b = true;
        this.a.removeCallbacksAndMessages(this);
    }

    @Override // defpackage.ayqh
    public final ayqx c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit != null) {
            if (this.b) {
                return aysa.INSTANCE;
            }
            aynu.k(runnable);
            ayqt ayqtVar = new ayqt(this.a, runnable);
            Message obtain = Message.obtain(this.a, ayqtVar);
            obtain.obj = this;
            this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.b) {
                return ayqtVar;
            }
            this.a.removeCallbacks(ayqtVar);
            return aysa.INSTANCE;
        }
        throw new NullPointerException("unit == null");
    }
}
