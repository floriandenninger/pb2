package com.google.android.libraries.youtube.mdx.background;

import android.content.Context;
import android.content.Intent;
import defpackage.acuy;
import defpackage.acvn;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdxBackgroundScanBootReceiver extends acuy {
    private static final String b = zga.a("MDX.BootReceiver");
    public acvn a;

    @Override // defpackage.acuy, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context);
        zga.h(b, "MdxBackgroundScanBootReceiver: onReceive");
        this.a.a();
    }
}
