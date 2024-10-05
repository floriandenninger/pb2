package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qvi extends Thread {
    public qvi(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
