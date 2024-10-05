package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tvi extends BroadcastReceiver {
    final /* synthetic */ amnv a;

    public tvi(amnv amnvVar) {
        this.a = amnvVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [tve, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ?? r1 = this.a.get();
        if (r1 != 0) {
            r1.i();
        }
    }
}
