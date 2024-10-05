package com.google.android.apps.youtube.app.application.system;

import android.content.Context;
import android.content.Intent;
import defpackage.enr;
import defpackage.ylf;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LocaleUpdatedReceiver extends enr {
    public ylf a;

    @Override // defpackage.enr, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context);
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            this.a.e("locale_update_runner", 1L, true, 0, null, null, false);
        } else {
            zga.b("Received a malicious intent with unexpected action.");
        }
    }
}
