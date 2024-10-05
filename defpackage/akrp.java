package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akrp extends BroadcastReceiver {
    final /* synthetic */ akrq a;

    public akrp(akrq akrqVar) {
        this.a = akrqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        synchronized (this.a) {
            if (this.a.a && intent != null && (action = intent.getAction()) != null) {
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    ((akqo) this.a.c.get()).a = true;
                } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                    ((akqo) this.a.c.get()).a = false;
                } else if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                    ((akqo) this.a.c.get()).a(intent);
                    akrr akrrVar = (akrr) this.a.d.get();
                    synchronized (akrrVar.a) {
                        for (akqj akqjVar : akrrVar.e.values()) {
                            if (akqjVar.e()) {
                                akqjVar.a();
                            }
                        }
                    }
                }
            }
        }
    }
}
