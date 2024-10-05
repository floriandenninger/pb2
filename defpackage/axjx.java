package defpackage;

import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axjx {
    public final Object a = new Object();
    public int b;

    public final void a() {
        boolean z;
        synchronized (this.a) {
            z = false;
            while (this.b > 0) {
                try {
                    this.a.wait();
                } catch (InterruptedException e) {
                    Logging.c("IMCVideoEncoder", "Interrupted while waiting on busy count", e);
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
