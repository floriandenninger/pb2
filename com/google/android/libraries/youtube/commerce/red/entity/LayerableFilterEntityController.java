package com.google.android.libraries.youtube.commerce.red.entity;

import defpackage.amlr;
import defpackage.ammv;
import defpackage.any;
import defpackage.aok;
import defpackage.sxd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LayerableFilterEntityController implements any {
    public ammv a = amlr.a;
    public ammv b = amlr.a;
    private final sxd c;

    public LayerableFilterEntityController(sxd sxdVar) {
        this.c = sxdVar;
    }

    public final void g() {
        if (this.a.h() && this.b.h() && ((String) this.b.c()).equals("FEwhat_to_watch")) {
            this.c.d((String) this.a.c());
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
