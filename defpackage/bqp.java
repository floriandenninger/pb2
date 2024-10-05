package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bqp extends BroadcastReceiver {
    final /* synthetic */ bqs a;

    public bqp(bqs bqsVar) {
        this.a = bqsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a();
    }
}
