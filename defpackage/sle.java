package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sle extends BroadcastReceiver {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Runnable b;

    public sle(AtomicBoolean atomicBoolean, Runnable runnable) {
        this.a = atomicBoolean;
        this.b = runnable;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            context.unregisterReceiver(this);
            this.b.run();
        }
    }
}
