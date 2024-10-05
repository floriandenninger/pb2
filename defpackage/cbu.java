package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cbu extends BroadcastReceiver {
    final /* synthetic */ cbv a;

    public cbu(cbv cbvVar) {
        this.a = cbvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            this.a.c(intent);
        }
    }
}
