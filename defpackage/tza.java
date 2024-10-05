package defpackage;

import android.os.PowerManager;
import com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tza implements Runnable {
    final /* synthetic */ PowerManager.WakeLock a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ ChimeExecutorApiService c;

    public tza(ChimeExecutorApiService chimeExecutorApiService, PowerManager.WakeLock wakeLock, Runnable runnable) {
        this.c = chimeExecutorApiService;
        this.a = wakeLock;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.acquire();
            this.b.run();
        } finally {
            this.a.release();
            uqq.l(new tyz(this));
        }
    }
}
