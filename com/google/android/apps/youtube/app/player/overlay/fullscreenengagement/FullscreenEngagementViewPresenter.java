package com.google.android.apps.youtube.app.player.overlay.fullscreenengagement;

import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.FullscreenEngagementViewPresenter;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FullscreenEngagementOverlayRendererOuterClass;
import defpackage.aicz;
import defpackage.aida;
import defpackage.aioc;
import defpackage.amkq;
import defpackage.any;
import defpackage.aok;
import defpackage.aqzj;
import defpackage.aqzn;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.ejt;
import defpackage.fgk;
import defpackage.fhf;
import defpackage.kfe;
import defpackage.krr;
import defpackage.kse;
import defpackage.ksg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FullscreenEngagementViewPresenter implements aida, any, fgk, kse {
    public final ksg a;
    public final aicz b;
    private final int c;
    private final ayqw d = new ayqw();
    private final ejt e;
    private final aioc f;
    private aqzn g;
    private boolean h;

    public FullscreenEngagementViewPresenter(ksg ksgVar, aicz aiczVar, ejt ejtVar, aioc aiocVar) {
        this.a = ksgVar;
        this.b = aiczVar;
        this.c = aiczVar.getContext().getResources().getDimensionPixelSize(R.dimen.fullscreen_engagement_action_bar_height);
        this.e = ejtVar;
        this.f = aiocVar;
    }

    private final void i() {
        aqzn aqznVar = this.g;
        boolean z = aqznVar != null && this.h;
        if (aqznVar == null || !this.b.c.d()) {
            if (this.g == null) {
                this.a.g(null);
            }
            this.a.h(false, z, (this.g == null || this.b.c.e()) ? false : true);
        } else {
            this.a.g(this.g);
            this.a.h(true, z, true);
        }
    }

    @Override // defpackage.aida
    public final void d(int i, int i2, int i3) {
        if (i == i2 && this.h == i3) {
            return;
        }
        this.h = 1 == i3;
        i();
    }

    @Override // defpackage.fgk
    public final void g(fhf fhfVar) {
        h(null, false);
    }

    public final void h(aqzn aqznVar, boolean z) {
        if (amkq.b(aqznVar, this.g)) {
            return;
        }
        this.g = aqznVar;
        if (z) {
            aqzj b = krr.b(aqznVar);
            boolean z2 = b != null && b.b.size() > 0;
            aicz aiczVar = this.b;
            int i = z2 ? this.c : 0;
            if (aiczVar.h != i) {
                aiczVar.h = i;
                aiczVar.h();
            }
        }
        i();
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

    @Override // defpackage.aida
    public final void nW(float f, boolean z) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.d.c();
        this.e.a = null;
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.d.c();
        this.d.d(this.f.ao().G().E(ayqr.a()).Y(new ayrs() { // from class: ksh
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                WatchNextResponseModel a;
                atzr atzrVar;
                atzr atzrVar2;
                aqzn aqznVar;
                FullscreenEngagementViewPresenter fullscreenEngagementViewPresenter = FullscreenEngagementViewPresenter.this;
                ahdv ahdvVar = (ahdv) obj;
                if (ahdvVar.a() == null || (a = ahdvVar.a()) == null) {
                    return;
                }
                asfc asfcVar = a.a;
                aseo aseoVar = asfcVar.f;
                if (aseoVar == null) {
                    aseoVar = aseo.a;
                }
                if (aseoVar.b == 78882851) {
                    atzrVar = (atzr) aseoVar.c;
                } else {
                    atzrVar = atzr.a;
                }
                aulq aulqVar = atzrVar.k;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementOverlayRenderer)) {
                    aseo aseoVar2 = asfcVar.f;
                    if (aseoVar2 == null) {
                        aseoVar2 = aseo.a;
                    }
                    if (aseoVar2.b == 78882851) {
                        atzrVar2 = (atzr) aseoVar2.c;
                    } else {
                        atzrVar2 = atzr.a;
                    }
                    aulq aulqVar2 = atzrVar2.k;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    aqznVar = (aqzn) aulqVar2.pX(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementOverlayRenderer);
                } else {
                    aqznVar = null;
                }
                fullscreenEngagementViewPresenter.h(aqznVar, true);
            }
        }, kfe.u));
        this.e.a = this.a;
    }
}
