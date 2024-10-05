package com.google.android.libraries.notifications.entrypoints.accountchanged;

import android.content.Context;
import defpackage.txz;
import defpackage.tya;
import defpackage.tzb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountChangedReceiver extends txz {
    @Override // defpackage.txz
    public final tya a(Context context) {
        return (tya) tzb.a(context).im().get("accountchanged");
    }

    @Override // defpackage.txz
    public final boolean c() {
        return true;
    }
}
