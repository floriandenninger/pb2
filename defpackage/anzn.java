package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anzn extends BroadcastReceiver {
    final /* synthetic */ anzo a;
    private anzo b;

    public anzn(anzo anzoVar, anzo anzoVar2) {
        this.a = anzoVar;
        this.b = anzoVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        anzo anzoVar = this.b;
        if (anzoVar == null) {
            return;
        }
        if (anzoVar.a()) {
            anzo anzoVar2 = this.b;
            anzoVar2.b.d(anzoVar2, 0L);
            context.unregisterReceiver(this);
            this.b = null;
        }
    }
}
