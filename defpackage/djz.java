package defpackage;

import android.os.Looper;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class djz implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ dka b;

    public djz(dka dkaVar, Runnable runnable) {
        this.b = dkaVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        try {
            Process.setThreadPriority(this.b.a);
        } catch (SecurityException unused) {
            Process.setThreadPriority(this.b.a + 1);
        }
        this.a.run();
    }
}
