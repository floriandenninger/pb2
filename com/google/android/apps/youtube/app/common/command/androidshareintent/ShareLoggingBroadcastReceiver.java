package com.google.android.apps.youtube.app.common.command.androidshareintent;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import defpackage.acqx;
import defpackage.acrt;
import defpackage.aomf;
import defpackage.aone;
import defpackage.aong;
import defpackage.apvd;
import defpackage.apve;
import defpackage.apvo;
import defpackage.asht;
import defpackage.ashy;
import defpackage.asuh;
import defpackage.ewi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShareLoggingBroadcastReceiver extends ewi {
    public acrt a;

    @Override // defpackage.ewi, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context);
        if (Build.VERSION.SDK_INT < 22 || !intent.hasExtra("YTShare_Logging_Share_Entity")) {
            return;
        }
        String stringExtra = intent.getStringExtra("YTShare_Logging_Share_Entity");
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        if (componentName == null || stringExtra == null) {
            return;
        }
        acrt acrtVar = this.a;
        aong aongVar = (aong) asuh.b.createBuilder();
        aone createBuilder = apvd.a.createBuilder();
        createBuilder.copyOnWrite();
        apvd apvdVar = (apvd) createBuilder.instance;
        apvdVar.b |= 1;
        apvdVar.c = 134792;
        aone createBuilder2 = apve.a.createBuilder();
        aone createBuilder3 = apvo.a.createBuilder();
        aomf z = aomf.z(stringExtra);
        createBuilder3.copyOnWrite();
        apvo apvoVar = (apvo) createBuilder3.instance;
        apvoVar.b |= 1;
        apvoVar.c = z;
        apvo apvoVar2 = (apvo) createBuilder3.build();
        createBuilder2.copyOnWrite();
        apve apveVar = (apve) createBuilder2.instance;
        apvoVar2.getClass();
        apveVar.m = apvoVar2;
        apveVar.b |= 1024;
        apve apveVar2 = (apve) createBuilder2.build();
        createBuilder.copyOnWrite();
        apvd apvdVar2 = (apvd) createBuilder.instance;
        apveVar2.getClass();
        apvdVar2.f = apveVar2;
        apvdVar2.b |= 8;
        apvd apvdVar3 = (apvd) createBuilder.build();
        aongVar.copyOnWrite();
        asuh asuhVar = (asuh) aongVar.instance;
        apvdVar3.getClass();
        asuhVar.h = apvdVar3;
        asuhVar.c |= 8;
        acqx acqxVar = new acqx((asuh) aongVar.build());
        String packageName = componentName.getPackageName();
        String className = componentName.getClassName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(className).length());
        sb.append(packageName);
        sb.append("/");
        sb.append(className);
        String sb2 = sb.toString();
        aone createBuilder4 = asht.a.createBuilder();
        aone createBuilder5 = ashy.a.createBuilder();
        createBuilder5.copyOnWrite();
        ashy ashyVar = (ashy) createBuilder5.instance;
        sb2.getClass();
        ashyVar.b |= 1;
        ashyVar.c = sb2;
        ashy ashyVar2 = (ashy) createBuilder5.build();
        createBuilder4.copyOnWrite();
        asht ashtVar = (asht) createBuilder4.instance;
        ashyVar2.getClass();
        ashtVar.i = ashyVar2;
        ashtVar.b |= 32;
        acrtVar.I(3, acqxVar, (asht) createBuilder4.build());
    }
}
