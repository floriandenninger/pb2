package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class oyz implements Choreographer.FrameCallback, Handler.Callback {
    public static final oyz a = new oyz();
    public volatile long b = -9223372036854775807L;
    public final Handler c;
    private final HandlerThread d;
    private Choreographer e;
    private int f;

    private oyz() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.d = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.c = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.b = j;
        this.e.postFrameCallbackDelayed(this, 500L);
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
                this.e.postFrameCallback(this);
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i3 = this.f - 1;
        this.f = i3;
        if (i3 == 0) {
            this.e.removeFrameCallback(this);
            this.b = -9223372036854775807L;
        }
        return true;
    }
}
