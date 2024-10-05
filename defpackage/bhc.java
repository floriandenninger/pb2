package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhc implements Choreographer.FrameCallback, Handler.Callback {
    public static final bhc a = new bhc();
    public volatile long b = -9223372036854775807L;
    public final Handler c;
    private final HandlerThread d;
    private Choreographer e;
    private int f;

    private bhc() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.d = handlerThread;
        handlerThread.start();
        Handler w = pts.w(handlerThread.getLooper(), this);
        this.c = w;
        w.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.b = j;
        Choreographer choreographer = this.e;
        pse.c(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.e = Choreographer.getInstance();
            return true;
        }
        if (i == 1) {
            int i2 = this.f + 1;
            this.f = i2;
            if (i2 == 1) {
                Choreographer choreographer = this.e;
                pse.c(choreographer);
                choreographer.postFrameCallback(this);
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i3 = this.f - 1;
        this.f = i3;
        if (i3 == 0) {
            Choreographer choreographer2 = this.e;
            pse.c(choreographer2);
            choreographer2.removeFrameCallback(this);
            this.b = -9223372036854775807L;
        }
        return true;
    }
}
