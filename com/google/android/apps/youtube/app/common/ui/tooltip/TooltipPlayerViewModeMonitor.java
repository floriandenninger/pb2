package com.google.android.apps.youtube.app.common.ui.tooltip;

import defpackage.akcy;
import defpackage.any;
import defpackage.aok;
import defpackage.fav;
import defpackage.fgp;
import defpackage.fgq;
import defpackage.fhg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TooltipPlayerViewModeMonitor implements any, fgp {
    private final akcy a;
    private final fgq b;

    public TooltipPlayerViewModeMonitor(akcy akcyVar, fgq fgqVar) {
        this.a = akcyVar;
        this.b = fgqVar;
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
        this.b.j(this);
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (!fhgVar.f() || fhgVar.d() || fhgVar.k()) {
            return;
        }
        this.a.f();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.b.i(this);
    }
}
