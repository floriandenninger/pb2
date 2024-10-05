package defpackage;

import android.content.BroadcastReceiver;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tyw implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ PowerManager.WakeLock b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ boolean d;
    final /* synthetic */ tyt e;
    final /* synthetic */ boolean f;
    final /* synthetic */ BroadcastReceiver.PendingResult g;

    public tyw(int i, PowerManager.WakeLock wakeLock, Runnable runnable, boolean z, tyt tytVar, boolean z2, BroadcastReceiver.PendingResult pendingResult) {
        this.a = i;
        this.b = wakeLock;
        this.c = runnable;
        this.d = z;
        this.e = tytVar;
        this.f = z2;
        this.g = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            tzk.d("ChimeExecutorApiImpl", "Started Broadcast execution [%d].", Integer.valueOf(this.a));
            this.b.acquire();
            this.c.run();
            this.b.release();
            if (this.d) {
                this.e.a();
            } else {
                if (this.f) {
                    this.g.setResultCode(-1);
                }
                this.g.finish();
            }
            tzk.d("ChimeExecutorApiImpl", "Finished Broadcast execution [%d].", Integer.valueOf(this.a));
        } catch (Throwable th) {
            this.b.release();
            if (this.d) {
                this.e.a();
            } else {
                if (this.f) {
                    this.g.setResultCode(-1);
                }
                this.g.finish();
            }
            tzk.d("ChimeExecutorApiImpl", "Finished Broadcast execution [%d].", Integer.valueOf(this.a));
            throw th;
        }
    }
}
