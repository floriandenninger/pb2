package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import defpackage.anaf;
import defpackage.angq;
import defpackage.fjz;
import defpackage.uvi;
import defpackage.uwo;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("accountType");
            if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                final String string = intent.getExtras().getString("authAccount");
                final BroadcastReceiver.PendingResult goAsync = goAsync();
                uvi a = uvi.a(context);
                anaf.I(uwo.a(a).b(new fjz(string, 18), a.c()), a.c().submit(new Runnable() { // from class: uwb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str = string;
                        SharedPreferences a2 = uwt.a(context2);
                        SharedPreferences.Editor editor = null;
                        for (Map.Entry<String, ?> entry : a2.getAll().entrySet()) {
                            if ((entry.getValue() instanceof String) && entry.getValue().equals(str)) {
                                if (editor == null) {
                                    editor = a2.edit();
                                }
                                editor.remove(entry.getKey());
                            }
                        }
                        if (editor != null) {
                            editor.commit();
                        }
                    }
                })).a(new Callable() { // from class: uwc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        goAsync.finish();
                        return null;
                    }
                }, angq.a);
            }
        }
    }
}
