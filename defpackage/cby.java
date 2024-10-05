package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cby extends BroadcastReceiver {
    final /* synthetic */ cca a;

    public cby(cca ccaVar) {
        this.a = ccaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            return;
        }
        ajbh X = ajbh.X();
        int i = cca.g;
        X.T(new Throwable[0]);
        cca ccaVar = this.a;
        ccaVar.g(ccaVar.b());
    }
}
