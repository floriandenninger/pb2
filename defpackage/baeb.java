package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.base.PowerMonitor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baeb extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PowerMonitor.b(intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED"));
    }
}
