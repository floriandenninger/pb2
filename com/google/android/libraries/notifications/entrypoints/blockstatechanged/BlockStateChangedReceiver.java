package com.google.android.libraries.notifications.entrypoints.blockstatechanged;

import android.content.Context;
import defpackage.txz;
import defpackage.tya;
import defpackage.tzb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BlockStateChangedReceiver extends txz {
    @Override // defpackage.txz
    public final tya a(Context context) {
        return (tya) tzb.a(context).im().get("blockstatechanged");
    }

    @Override // defpackage.txz
    public final boolean c() {
        return true;
    }
}
