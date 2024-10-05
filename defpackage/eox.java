package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eox extends BroadcastReceiver {
    public final Context a;
    public boolean b = false;
    private final eqa c;

    public eox(Context context, eqa eqaVar) {
        this.c = eqaVar;
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.c.b();
    }
}
