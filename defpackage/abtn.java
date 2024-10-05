package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abtn extends BroadcastReceiver {
    final /* synthetic */ abtp a;

    public abtn(abtp abtpVar) {
        this.a = abtpVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.DEVICE_STORAGE_LOW".equals(action) || "android.intent.action.DEVICE_STORAGE_OK".equals(action)) {
            abtp abtpVar = this.a;
            abtpVar.c.post(abtpVar.h);
            return;
        }
        if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
            abtp abtpVar2 = this.a;
            long nanoTime = System.nanoTime();
            if (nanoTime - abtpVar2.e > abtp.a) {
                abtpVar2.e = nanoTime;
                int intExtra = intent.getIntExtra("level", -1);
                int intExtra2 = intent.getIntExtra("scale", -1);
                if (intExtra >= 0 && intExtra2 >= 0) {
                    int i = (intExtra * 100) / intExtra2;
                    if (i <= 10) {
                        abtpVar2.c.post(abtpVar2.j);
                    } else {
                        abtpVar2.c.post(abtpVar2.k);
                    }
                    abtpVar2.f = i;
                } else {
                    abtpVar2.f = -1;
                }
                abtpVar2.g = intent.getIntExtra("status", -1);
            }
        }
    }
}
