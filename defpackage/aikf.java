package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aikf extends BroadcastReceiver {
    final /* synthetic */ aivo a;
    final /* synthetic */ aikp b;
    final /* synthetic */ aiki c;

    public aikf(aiki aikiVar, aivo aivoVar, aikp aikpVar) {
        this.c = aikiVar;
        this.a = aivoVar;
        this.b = aikpVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || "noop".equals(action)) {
            return;
        }
        if ("com.google.android.libraries.youtube.player.action.controller_notification_delete".equals(action)) {
            this.a.b();
        } else if ("android.intent.action.MAIN".equals(action)) {
            this.b.d();
        }
        for (aikb aikbVar : this.c.b) {
            if (aikbVar.i(action)) {
                this.b.b(aikbVar);
            }
        }
    }
}
