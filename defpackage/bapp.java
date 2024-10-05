package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.RefCounted;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bapp implements RefCounted {
    private final AtomicInteger a = new AtomicInteger(1);
    private final Runnable b;

    public bapp(Runnable runnable) {
        this.b = runnable;
    }

    @Override // org.webrtc.RefCounted
    public final void release() {
        Runnable runnable;
        int decrementAndGet = this.a.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("release() called on an object with refcount < 1");
        }
        if (decrementAndGet != 0 || (runnable = this.b) == null) {
            return;
        }
        runnable.run();
    }

    @Override // org.webrtc.RefCounted
    public final void retain() {
        if (this.a.incrementAndGet() < 2) {
            throw new IllegalStateException("retain() called on an object with refcount < 1");
        }
    }
}
