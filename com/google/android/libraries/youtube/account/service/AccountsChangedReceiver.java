package com.google.android.libraries.youtube.account.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountsChangedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            zga.l("AccountsChangedReceiver: null intent received. Ignoring.");
        } else {
            AccountsChangedJobIntentService.d(context, AccountsChangedJobIntentService.class, intent);
        }
    }
}
