package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class antb extends BroadcastReceiver {
    public static final AtomicReference a = new AtomicReference();
    private final Context b;

    public antb(Context context) {
        this.b = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (antc.a) {
            Iterator it = antc.b.values().iterator();
            while (it.hasNext()) {
                ((antc) it.next()).i();
            }
        }
        this.b.unregisterReceiver(this);
    }
}
