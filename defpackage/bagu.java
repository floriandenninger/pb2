package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bagu implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bagv b;

    public bagu(bagv bagvVar, Runnable runnable) {
        this.b = bagvVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(this.b.a);
        this.a.run();
    }
}
