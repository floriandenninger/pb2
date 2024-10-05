package defpackage;

import android.accounts.AccountManagerCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class baet extends BroadcastReceiver {
    final /* synthetic */ Context a;
    final /* synthetic */ baeu b;

    public baet(baeu baeuVar, Context context) {
        this.b = baeuVar;
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.unregisterReceiver(this);
        baeu baeuVar = this.b;
        baev baevVar = baeuVar.a;
        baevVar.b.getAuthToken(baevVar.e, baevVar.d, baevVar.c, true, (AccountManagerCallback<Bundle>) new baeu(baeuVar.b, baevVar, 0), (Handler) null);
    }
}
