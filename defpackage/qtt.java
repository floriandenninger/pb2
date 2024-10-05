package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qtt implements Runnable {
    private final Runnable a;

    public qtt(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
