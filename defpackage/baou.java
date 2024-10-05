package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class baou extends Handler {
    private final Runnable a;

    public baou(Looper looper, Runnable runnable) {
        super(looper);
        this.a = runnable;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Exception e) {
            Logging.c("EglRenderer", "Exception on EglRenderer thread", e);
            this.a.run();
            throw e;
        }
    }
}
