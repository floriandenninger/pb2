package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uky extends BroadcastReceiver {
    final /* synthetic */ uke a;
    final /* synthetic */ ukz b;

    public uky(ukz ukzVar, uke ukeVar) {
        this.b = ukzVar;
        this.a = ukeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        amkq.o(this.a.a(), new ukx(this), angq.a);
    }
}
