package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class admy extends BroadcastReceiver {
    final /* synthetic */ adnd a;

    public admy(adnd adndVar) {
        this.a = adndVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        adfr b = adfr.b(intent.getAction());
        adgf adgfVar = adgf.ADD_VIDEO;
        int ordinal = b.ordinal();
        if (ordinal == 7) {
            this.a.aE(adkw.NETWORK, atbi.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE, 0);
            return;
        }
        if (ordinal != 11) {
            return;
        }
        if (!this.a.l.p()) {
            this.a.aE(adkw.NETWORK, atbi.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE, 0);
            return;
        }
        adnd adndVar = this.a;
        if (!adndVar.r.g(adndVar.aq.i)) {
            this.a.aE(adkw.NETWORK, atbi.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED, 0);
        } else {
            this.a.aE(adkw.LOUNGE_SERVER_CONNECTION_ERROR, atbi.MDX_SESSION_DISCONNECT_REASON_NETWORK, 2);
        }
    }
}
