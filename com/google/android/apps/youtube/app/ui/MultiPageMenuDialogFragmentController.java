package com.google.android.apps.youtube.app.ui;

import android.content.res.Configuration;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import defpackage.bv;
import defpackage.ci;
import defpackage.fxh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MultiPageMenuDialogFragmentController extends DialogFragmentController implements fxh {
    public MultiPageMenuDialogFragmentController(ci ciVar) {
        super(ciVar, "MultiPageMenuDialogFragmentController");
    }

    @Override // defpackage.fxh
    public final void e(Configuration configuration) {
        bv i = i();
        if (i == null || !i.av()) {
            return;
        }
        i.onConfigurationChanged(configuration);
    }
}
