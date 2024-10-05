package com.google.android.libraries.youtube.rendering.customtabs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CustomTabsReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.TEXT", dataString);
        Intent createChooser = Intent.createChooser(intent2, null);
        createChooser.setFlags(268435456);
        context.startActivity(createChooser);
    }
}
