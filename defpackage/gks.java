package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gks extends BroadcastReceiver {
    final /* synthetic */ gku a;

    public gks(gku gkuVar) {
        this.a = gkuVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Runnable runnable;
        gkj gkjVar = (gkj) this.a.f.get(intent.getAction());
        if (gkjVar == null || (runnable = gkjVar.b) == null) {
            return;
        }
        runnable.run();
    }
}
