package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
class fhp extends BroadcastReceiver {
    private volatile boolean a = false;
    private final Object b = new Object();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((fhs) ayaw.t(context)).ji((fhr) this);
                this.a = true;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
    }
}
