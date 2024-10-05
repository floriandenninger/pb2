package com.google.android.apps.youtube.app.player.overlay.accessibility;

import com.google.android.apps.youtube.app.player.overlay.accessibility.TimebarAccessibilityController;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import defpackage.ahui;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.fhg;
import defpackage.fna;
import defpackage.kig;
import defpackage.kih;
import defpackage.zcp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TimebarAccessibilityController implements any, kig {
    public boolean a;
    private final ayqw b = new ayqw();
    private final fna c;
    private final ahui d;
    private boolean e;

    public TimebarAccessibilityController(fna fnaVar, ahui ahuiVar, kih kihVar) {
        this.c = fnaVar;
        this.d = ahuiVar;
        kihVar.a(this);
    }

    @Override // defpackage.kig
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        boolean z = this.e;
        boolean z2 = controlsOverlayStyle.s;
        if (z != z2) {
            this.e = z2;
            t();
        }
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

    @Override // defpackage.kig
    public final /* synthetic */ void m(fhg fhgVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nF(ControlsState controlsState) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nY(boolean z) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.b.c();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nz(boolean z) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.b.d(this.d.a().n().X(new ayrs() { // from class: kqn
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                TimebarAccessibilityController timebarAccessibilityController = TimebarAccessibilityController.this;
                boolean z = timebarAccessibilityController.a;
                boolean z2 = ((ahuh) obj).a;
                if (z != z2) {
                    timebarAccessibilityController.a = z2;
                    timebarAccessibilityController.t();
                }
            }
        }));
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void s(boolean z) {
    }

    public final void t() {
        fna fnaVar = this.c;
        boolean z = false;
        if (this.e && this.a) {
            z = true;
        }
        fnaVar.setClickable(z);
    }
}
