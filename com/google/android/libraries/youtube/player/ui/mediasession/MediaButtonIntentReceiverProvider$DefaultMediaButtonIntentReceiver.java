package com.google.android.libraries.youtube.player.ui.mediasession;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import defpackage.aiwi;
import defpackage.hb;
import defpackage.hd;
import defpackage.hn;
import defpackage.yjj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MediaButtonIntentReceiverProvider$DefaultMediaButtonIntentReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        hd hdVar;
        KeyEvent keyEvent;
        hn hnVar = ((aiwi) yjj.p(context, aiwi.class)).gf().b;
        if (hnVar == null || (hdVar = hnVar.c) == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null) {
            return;
        }
        ((hb) hdVar.a).a.dispatchMediaButtonEvent(keyEvent);
    }
}
