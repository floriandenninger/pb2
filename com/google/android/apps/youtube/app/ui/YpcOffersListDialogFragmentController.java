package com.google.android.apps.youtube.app.ui;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import defpackage.ajdg;
import defpackage.ajdh;
import defpackage.amkq;
import defpackage.apxf;
import defpackage.ci;
import defpackage.ixu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class YpcOffersListDialogFragmentController extends DialogFragmentController {
    private final ajdh a;
    private final ajdg b;

    public YpcOffersListDialogFragmentController(ci ciVar, ajdh ajdhVar) {
        super(ciVar, "YpcOffersListDialogFragment");
        this.b = new ajdg() { // from class: lyx
            @Override // defpackage.ajdg
            public final void lP() {
                YpcOffersListDialogFragmentController.this.k();
            }
        };
        this.a = ajdhVar;
    }

    public final void g(apxf apxfVar) {
        if (i() != null) {
            k();
        }
        apxfVar.getClass();
        ixu ixuVar = new ixu();
        Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", apxfVar.toByteArray());
        ixuVar.af(bundle);
        amkq.N(true);
        j(ixuVar);
    }

    public final void h(ixu ixuVar) {
        if (amkq.b(ixuVar, i())) {
            this.a.d(this.b);
            super.m();
        }
    }

    @Override // com.google.android.apps.youtube.app.common.dialog.DialogFragmentController
    public final void n() {
        this.a.a(this.b);
        super.n();
    }
}
