package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uxa extends BroadcastReceiver {
    public static volatile boolean b;
    public static final Object a = new Object();
    static final uvs c = uvs.a();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        for (Map.Entry entry : c.entrySet()) {
            if (((String) ((ammw) entry.getKey()).a).equals(stringExtra)) {
                ((uwh) entry.getValue()).a.d();
            }
        }
    }
}
