package com.google.android.apps.youtube.app.common.ui.systemui;

import android.os.Build;
import defpackage.any;
import defpackage.aok;
import defpackage.azrw;
import defpackage.fav;
import defpackage.fgp;
import defpackage.fgq;
import defpackage.fhg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PipWindowInsetsHelper implements fgp, any {
    public boolean a;
    private final azrw b;

    public PipWindowInsetsHelper(azrw azrwVar) {
        this.b = azrwVar;
    }

    public static final boolean g() {
        return Build.VERSION.SDK_INT == 28;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        if (g()) {
            ((fgq) this.b.get()).j(this);
        }
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (fhgVar.e()) {
            this.a = true;
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (g()) {
            ((fgq) this.b.get()).i(this);
        }
    }
}
