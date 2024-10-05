package com.google.android.apps.youtube.app.common.util;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import defpackage.any;
import defpackage.aok;
import defpackage.azrw;
import defpackage.gor;
import defpackage.yny;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NfcHelper implements any {
    private final Activity a;
    private final NfcAdapter b;
    private final Executor c;
    private final azrw d;

    public NfcHelper(Activity activity, Executor executor, azrw azrwVar) {
        this.a = activity;
        this.c = executor;
        this.d = azrwVar;
        this.b = NfcAdapter.getDefaultAdapter(activity);
        IntentFilter intentFilter = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
        intentFilter.addAction("android.nfc.action.TECH_DISCOVERED");
        intentFilter.addAction("android.nfc.action.TAG_DISCOVERED");
        Intent intent = new Intent("android.nfc.action.NDEF_DISCOVERED");
        intent.setPackage(activity.getPackageName());
        PendingIntent.getActivity(activity, 0, intent, yny.M());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        if (this.b != null) {
            gor gorVar = new gor(this.d, this.c);
            this.b.setNdefPushMessageCallback(gorVar, this.a, new Activity[0]);
            this.b.setOnNdefPushCompleteCallback(gorVar, this.a, new Activity[0]);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
