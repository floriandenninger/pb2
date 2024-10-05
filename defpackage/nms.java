package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nms extends BroadcastReceiver {
    final /* synthetic */ nmt a;

    public nms(nmt nmtVar) {
        this.a = nmtVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c;
        Uri data = intent.getData();
        String encodedSchemeSpecificPart = data == null ? null : data.getEncodedSchemeSpecificPart();
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != 525384130) {
            if (hashCode == 1544582882 && action.equals("android.intent.action.PACKAGE_ADDED")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1 && "com.google.android.apps.youtube.vr".equals(encodedSchemeSpecificPart)) {
                this.a.a();
                return;
            }
            return;
        }
        if ("com.google.android.apps.youtube.vr".equals(encodedSchemeSpecificPart)) {
            this.a.b();
        }
    }
}
