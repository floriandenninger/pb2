package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayqu extends ayqi {
    private final Handler b;

    public ayqu(Handler handler) {
        this.b = handler;
    }

    @Override // defpackage.ayqi
    public final ayqh a() {
        return new ayqs(this.b);
    }

    @Override // defpackage.ayqi
    public final ayqx c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        aynu.k(runnable);
        ayqt ayqtVar = new ayqt(this.b, runnable);
        this.b.sendMessageDelayed(Message.obtain(this.b, ayqtVar), timeUnit.toMillis(j));
        return ayqtVar;
    }
}
