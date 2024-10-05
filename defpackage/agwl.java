package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agwl implements aguf {
    private final Object a = new Object();

    @Override // defpackage.aguf
    public final void a(int i) {
        synchronized (this.a) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        synchronized (this.a) {
        }
    }
}
