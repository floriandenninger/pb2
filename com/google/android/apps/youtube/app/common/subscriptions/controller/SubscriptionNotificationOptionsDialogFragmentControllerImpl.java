package com.google.android.apps.youtube.app.common.subscriptions.controller;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import defpackage.avae;
import defpackage.ci;
import defpackage.fvg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SubscriptionNotificationOptionsDialogFragmentControllerImpl extends DialogFragmentController {
    public SubscriptionNotificationOptionsDialogFragmentControllerImpl(ci ciVar) {
        super(ciVar, "SubscriptionNotificationOptionsDialogFragmentController");
    }

    public final void g(avae avaeVar) {
        k();
        if (i() == null) {
            fvg fvgVar = new fvg();
            Bundle bundle = new Bundle();
            bundle.putByteArray("model", avaeVar.toByteArray());
            fvgVar.af(bundle);
            j(fvgVar);
        }
        n();
    }
}
