package com.google.android.libraries.youtube.notification.push.optoutdialog;

import android.content.Intent;
import android.os.Bundle;
import defpackage.aahd;
import defpackage.aazy;
import defpackage.abab;
import defpackage.agau;
import defpackage.agax;
import defpackage.agay;
import defpackage.agaz;
import defpackage.agba;
import defpackage.ajoy;
import defpackage.amlr;
import defpackage.ammv;
import defpackage.amna;
import defpackage.apxf;
import defpackage.atnh;
import defpackage.azrw;
import defpackage.whl;
import defpackage.zhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NotificationOptOutDialogActivity extends agau {
    public azrw b;
    public ammv c;
    private agba d;
    private agaz e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ammv ammvVar;
        super.onCreate(bundle);
        this.d = new agba((aahd) ((amna) this.c).a, new agax(this));
        ajoy ajoyVar = (ajoy) this.b.get();
        agba agbaVar = this.d;
        azrw azrwVar = ajoyVar.a;
        agbaVar.getClass();
        agaz agazVar = new agaz(azrwVar, agbaVar);
        this.e = agazVar;
        Intent intent = getIntent();
        agazVar.c = false;
        ajoy ajoyVar2 = (ajoy) agazVar.a.get();
        if (intent.getExtras() == null || !intent.hasExtra("notification_opt_out_dialog_command")) {
            ammvVar = amlr.a;
        } else {
            ammvVar = ammv.i(whl.H(intent.getExtras().getByteArray("notification_opt_out_dialog_command")));
        }
        apxf apxfVar = (apxf) ammvVar.c();
        agay agayVar = new agay(agazVar);
        if (apxfVar.pY(atnh.b)) {
            atnh atnhVar = (atnh) apxfVar.pX(atnh.b);
            if ((atnhVar.c & 1) != 0) {
                abab ababVar = (abab) ajoyVar2.a.get();
                aazy aazyVar = new aazy(ababVar.f, ababVar.a.c(), null, null, null);
                String str = atnhVar.d;
                zhq.m(str);
                aazyVar.a = str;
                aazyVar.l(apxfVar.c);
                ((abab) ajoyVar2.a.get()).i.e(aazyVar, agayVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.e.c = true;
    }
}
