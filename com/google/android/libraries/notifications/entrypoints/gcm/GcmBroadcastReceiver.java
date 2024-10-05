package com.google.android.libraries.notifications.entrypoints.gcm;

import android.content.Context;
import defpackage.txz;
import defpackage.tya;
import defpackage.tzb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GcmBroadcastReceiver extends txz {
    @Override // defpackage.txz
    public final tya a(Context context) {
        return (tya) tzb.a(context).im().get("gcm");
    }

    @Override // defpackage.txz
    public final boolean c() {
        return true;
    }
}
