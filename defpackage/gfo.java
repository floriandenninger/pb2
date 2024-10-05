package defpackage;

import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gfo {
    static final tfq c = new tfq(null, null);
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final Choreographer.FrameCallback b = new Choreographer.FrameCallback() { // from class: gfn
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            gfo.c.a++;
            if (gfo.a.get()) {
                Choreographer.getInstance().postFrameCallback(gfo.b);
            }
        }
    };

    public static void a() {
        yjk.f();
        if (a.compareAndSet(false, true)) {
            Choreographer.getInstance().postFrameCallback(b);
        }
    }

    public static void b() {
        yjk.f();
        if (a.compareAndSet(true, false)) {
            Choreographer.getInstance().removeFrameCallback(b);
        }
    }
}
