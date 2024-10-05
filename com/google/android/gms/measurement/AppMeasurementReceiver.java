package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import defpackage.ans;
import defpackage.ansv;
import defpackage.rfp;
import defpackage.rgg;
import defpackage.rgt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends ans {
    private rgg c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new rgg(this);
        }
        rgg rggVar = this.c;
        rgt i = rgt.i(context);
        rfp aF = i.aF();
        if (intent == null) {
            aF.f.a("Receiver called with null intent");
            return;
        }
        ansv ansvVar = i.z;
        String action = intent.getAction();
        aF.k.b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            aF.k.a("Starting wakeful intent.");
            AppMeasurementReceiver appMeasurementReceiver = rggVar.a;
            synchronized (ans.a) {
                int i2 = ans.b;
                ans.b++;
                if (ans.b <= 0) {
                    ans.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i2);
                className.putExtra("android.support.content.wakelockid", i2);
                ComponentName startService = context.startService(className);
                if (startService == null) {
                    return;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                ans.a.put(i2, newWakeLock);
                return;
            }
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            aF.f.a("Install Referrer Broadcasts are deprecated");
        }
    }
}
