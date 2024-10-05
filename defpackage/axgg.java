package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axgg implements Choreographer.FrameCallback, Handler.Callback {
    private static final String d = "axgg";
    public Handler b;
    public boolean c;
    private final Choreographer.FrameCallback e;
    private Choreographer f = null;
    public final HandlerThread a = new HandlerThread("FrameMonitor");

    public axgg(Choreographer.FrameCallback frameCallback) {
        this.e = frameCallback;
    }

    public final void a() {
        if (this.c) {
            this.c = false;
            this.b.sendEmptyMessage(2);
        }
    }

    public final void b() {
        a();
        this.a.quitSafely();
        try {
            this.a.join();
        } catch (InterruptedException e) {
            String str = d;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Interrupted when shutting down FrameMonitor: ");
            sb.append(valueOf);
            Log.e(str, sb.toString());
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.e.doFrame(j);
        this.f.postFrameCallback(this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            if (this.f == null) {
                this.f = Choreographer.getInstance();
            }
            return true;
        }
        if (i == 1) {
            this.f.postFrameCallback(this);
            return true;
        }
        if (i != 2) {
            return false;
        }
        this.f.removeFrameCallback(this);
        return true;
    }
}
