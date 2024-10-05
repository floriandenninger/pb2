package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import defpackage.ajbh;
import defpackage.caj;
import defpackage.cas;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = ajbh.S("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ajbh X = ajbh.X();
        String.format("Received intent %s", intent);
        X.T(new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                caj h = caj.h(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                synchronized (caj.a) {
                    h.h = goAsync;
                    if (h.g) {
                        h.h.finish();
                        h.h = null;
                    }
                }
                return;
            } catch (IllegalStateException e) {
                ajbh.X();
                ajbh.U(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
                return;
            }
        }
        context.startService(cas.e(context));
    }
}
