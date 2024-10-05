package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cur extends Thread {
    public cur(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(9);
        super.run();
    }
}
