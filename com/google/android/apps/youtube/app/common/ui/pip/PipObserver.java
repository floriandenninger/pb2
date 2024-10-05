package com.google.android.apps.youtube.app.common.ui.pip;

import android.app.Activity;
import android.os.Build;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqx;
import defpackage.ayrz;
import defpackage.azrh;
import defpackage.azrs;
import defpackage.glc;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PipObserver implements any {
    public final azrh a;
    public final azrs b;
    public ayqx c;

    public PipObserver(Activity activity, azrs azrsVar) {
        this.a = azrh.aN((Build.VERSION.SDK_INT < 26 || !activity.isInPictureInPictureMode()) ? glc.NOT_IN_PIP : glc.IN_PIP);
        this.b = azrsVar;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.a.sh();
        Object obj = this.c;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        if (this.a.aO() == glc.EXITING_PIP) {
            this.a.c(glc.NOT_IN_PIP);
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
