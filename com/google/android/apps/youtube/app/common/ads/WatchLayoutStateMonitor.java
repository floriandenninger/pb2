package com.google.android.apps.youtube.app.common.ads;

import android.content.Context;
import defpackage.any;
import defpackage.aok;
import defpackage.obo;
import defpackage.oel;
import defpackage.wob;
import defpackage.xjl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchLayoutStateMonitor implements any {
    private final oel a;
    private final obo b;

    public WatchLayoutStateMonitor(final wob wobVar, final xjl xjlVar, final Context context, oel oelVar) {
        this.a = oelVar;
        this.b = new obo() { // from class: eum
            @Override // defpackage.obo
            public final void pa(obp obpVar) {
                wob wobVar2 = wob.this;
                Context context2 = context;
                xjl xjlVar2 = xjlVar;
                wobVar2.n(context2.getResources().getDisplayMetrics(), obpVar.t(), obpVar.v());
                xjlVar2.j(context2.getResources().getDisplayMetrics(), obpVar.t(), obpVar.v());
            }
        };
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
        this.a.k(this.b);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.a.h(this.b);
    }
}
