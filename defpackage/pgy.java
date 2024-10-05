package defpackage;

import android.os.HandlerThread;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pgy extends HandlerThread {
    private final int a;

    public pgy() {
        super("ExoPlayerImplInternal:Handler");
        this.a = -16;
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
