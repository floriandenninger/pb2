package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abto extends BroadcastReceiver {
    final /* synthetic */ abtp a;

    public abto(abtp abtpVar) {
        this.a = abtpVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        abtp abtpVar = this.a;
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            abtpVar.c.postDelayed(abtpVar.l, 5000L);
        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
            abtpVar.c.removeCallbacks(abtpVar.l);
        }
    }
}
