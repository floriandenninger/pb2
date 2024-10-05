package defpackage;

import android.os.Looper;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aks {
    private final Choreographer b = Choreographer.getInstance();
    public final Looper a = Looper.myLooper();

    public final void a(final Runnable runnable) {
        this.b.postFrameCallback(new Choreographer.FrameCallback() { // from class: akr
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
