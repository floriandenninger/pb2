package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class my extends BroadcastReceiver {
    final /* synthetic */ mz a;

    public my(mz mzVar) {
        this.a = mzVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.b();
    }
}
