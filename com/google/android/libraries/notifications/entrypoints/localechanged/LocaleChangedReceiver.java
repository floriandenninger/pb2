package com.google.android.libraries.notifications.entrypoints.localechanged;

import android.content.Context;
import defpackage.txz;
import defpackage.tya;
import defpackage.tzb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LocaleChangedReceiver extends txz {
    @Override // defpackage.txz
    public final tya a(Context context) {
        return (tya) tzb.a(context).im().get("localechanged");
    }

    @Override // defpackage.txz
    public final boolean c() {
        return true;
    }
}
