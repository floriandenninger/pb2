package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfw extends BroadcastReceiver {
    public final rki a;
    public boolean b;
    public boolean c;

    public rfw(rki rkiVar) {
        this.a = rkiVar;
    }

    public final Context a() {
        return this.a.b();
    }

    public final rfp b() {
        return this.a.aF();
    }

    public final void c() {
        this.a.x();
        this.a.v();
        this.a.v();
        if (this.b) {
            b().k.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                a().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                b().c.b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.x();
        String action = intent.getAction();
        b().k.b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean a = this.a.m().a();
            if (this.c != a) {
                this.c = a;
                this.a.aG().g(new rfv(this));
                return;
            }
            return;
        }
        b().f.b("NetworkBroadcastReceiver received unknown action", action);
    }
}
