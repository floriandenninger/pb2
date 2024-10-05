package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.ajbh;
import defpackage.byz;
import defpackage.caj;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = ajbh.S("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        ajbh.X().T(new Throwable[0]);
        try {
            caj.h(context).a(new byz(DiagnosticsWorker.class).b());
        } catch (IllegalStateException e) {
            ajbh.X();
            ajbh.U(a, "WorkManager is not initialized", e);
        }
    }
}
