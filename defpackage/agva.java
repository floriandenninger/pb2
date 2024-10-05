package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agva extends BroadcastReceiver {
    private volatile boolean b = Environment.getExternalStorageState().equals("mounted");
    aguz a = null;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.b = "android.intent.action.MEDIA_MOUNTED".equals(intent.getAction());
        aguz aguzVar = this.a;
        if (aguzVar != null) {
            aguzVar.r();
        }
    }
}
