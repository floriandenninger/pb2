package com.google.android.apps.youtube.app.player.overlay;

import defpackage.adjr;
import defpackage.adju;
import defpackage.any;
import defpackage.aok;
import defpackage.azrw;
import defpackage.kia;
import defpackage.kib;
import defpackage.yjk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ControlsOverlayAlwaysShownController implements any {
    public final azrw a;
    public boolean b;
    private kia c;
    private final adju d;
    private final kib e;

    public ControlsOverlayAlwaysShownController(adju adjuVar, azrw azrwVar, kia kiaVar) {
        this.d = adjuVar;
        this.a = azrwVar;
        this.c = kiaVar;
        kib kibVar = new kib(this);
        this.e = kibVar;
        adjuVar.h.add(kibVar);
        adjr adjrVar = adjuVar.g;
        if (adjrVar != null) {
            adjrVar.b(kibVar);
        }
    }

    public final void g() {
        yjk.f();
        boolean z = this.b;
        kia kiaVar = this.c;
        if (kiaVar != null) {
            kiaVar.o(z);
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
        adju adjuVar = this.d;
        kib kibVar = this.e;
        adjuVar.h.remove(kibVar);
        adjr adjrVar = adjuVar.g;
        if (adjrVar != null) {
            adjrVar.i.remove(kibVar);
        }
        this.c = null;
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
