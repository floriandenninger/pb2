package defpackage;

import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dnw {
    public final AtomicReference a = new AtomicReference();
    private Runnable b;
    private Choreographer.FrameCallback c;

    public final Choreographer.FrameCallback a() {
        if (this.c == null) {
            this.c = new dnu(this);
        }
        return this.c;
    }

    public final Runnable b() {
        if (this.b == null) {
            this.b = new dnv(this);
        }
        return this.b;
    }

    public abstract void c(long j);

    public final void d(long j) {
        this.a.getAndSet(null);
        dmz dmzVar = did.m;
        try {
            c(j);
        } finally {
        }
    }
}
