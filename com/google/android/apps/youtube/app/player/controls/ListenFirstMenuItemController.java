package com.google.android.apps.youtube.app.player.controls;

import android.app.Activity;
import defpackage.aadw;
import defpackage.aahd;
import defpackage.any;
import defpackage.aok;
import defpackage.asvu;
import defpackage.fav;
import defpackage.fgp;
import defpackage.fgq;
import defpackage.fhg;
import defpackage.kem;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ListenFirstMenuItemController implements fgp, any {
    public final Activity a;
    public final aahd b;
    public final fgq c;
    public kem d;
    private final boolean e;

    public ListenFirstMenuItemController(Activity activity, aahd aahdVar, fgq fgqVar, aadw aadwVar) {
        this.a = activity;
        this.b = aahdVar;
        this.c = fgqVar;
        asvu asvuVar = aadwVar.b().e;
        this.e = (asvuVar == null ? asvu.a : asvuVar).bS;
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
        this.c.j(this);
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        kem kemVar = this.d;
        if (kemVar == null) {
            return;
        }
        boolean z = false;
        if (this.e && !fhgVar.b()) {
            z = true;
        }
        kemVar.g(z);
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
