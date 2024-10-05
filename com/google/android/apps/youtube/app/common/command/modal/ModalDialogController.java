package com.google.android.apps.youtube.app.common.command.modal;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import defpackage.acqz;
import defpackage.ainy;
import defpackage.ajck;
import defpackage.ajrv;
import defpackage.ajyd;
import defpackage.ajyg;
import defpackage.any;
import defpackage.aok;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ModalDialogController implements any {
    public final Context a;
    public final ajck b;
    public final acqz c;
    public final ajyg d;
    public final ainy e;
    public AlertDialog f;
    public View g;
    public TextView h;
    public ajyd i;
    public ajyd j;
    public boolean k;

    public ModalDialogController(Context context, ajrv ajrvVar, acqz acqzVar, ajyg ajygVar, ainy ainyVar) {
        this.a = context;
        this.b = ajrvVar;
        this.c = acqzVar;
        this.d = ajygVar;
        this.e = ainyVar;
    }

    public final void g() {
        AlertDialog alertDialog = this.f;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        g();
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
