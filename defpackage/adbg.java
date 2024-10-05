package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adbg extends BroadcastReceiver {
    final /* synthetic */ adbi a;

    public adbg(adbi adbiVar) {
        this.a = adbiVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.d();
        this.a.c();
    }
}
