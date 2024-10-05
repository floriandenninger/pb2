package com.google.android.apps.youtube.app.watch.engagementpanel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.watch.engagementpanel.AppEngagementPanelControllerInitializer;
import com.google.android.apps.youtube.app.watch.engagementpanel.size.EngagementPanelSizeBehavior;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.youtube.R;
import defpackage.ahh;
import defpackage.any;
import defpackage.aok;
import defpackage.axzf;
import defpackage.aypn;
import defpackage.ayqi;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.fgq;
import defpackage.gjd;
import defpackage.gje;
import defpackage.gpm;
import defpackage.mmt;
import defpackage.muf;
import defpackage.nox;
import defpackage.nqm;
import defpackage.nqp;
import defpackage.ntv;
import defpackage.nvs;
import defpackage.ogt;
import defpackage.oor;
import defpackage.whu;
import defpackage.yny;
import defpackage.yzr;
import defpackage.zch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppEngagementPanelControllerInitializer implements any, zch {
    public final nqp a;
    public final oor b;
    public final boolean c;
    public yzr d;
    private final ViewGroup e;
    private final fgq f;
    private final gje g;
    private final ayqw h = new ayqw();
    private final gjd i;
    private final ayqi j;
    private final ntv k;

    public AppEngagementPanelControllerInitializer(ViewGroup viewGroup, final nqp nqpVar, fgq fgqVar, gje gjeVar, oor oorVar, ayqi ayqiVar, nqm nqmVar, axzf axzfVar, byte[] bArr, byte[] bArr2) {
        this.e = viewGroup;
        this.a = nqpVar;
        this.f = fgqVar;
        this.g = gjeVar;
        this.b = oorVar;
        this.j = ayqiVar;
        this.k = nqmVar.b();
        this.c = axzfVar.e().booleanValue();
        this.i = new gjd() { // from class: now
            @Override // defpackage.gjd
            public final void aJ(gjf gjfVar) {
                nqp.this.s();
            }
        };
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        final AccessibilityLayerLayout accessibilityLayerLayout = (AccessibilityLayerLayout) this.e.findViewById(R.id.accessibility_layer_container);
        final View findViewById = accessibilityLayerLayout.findViewById(R.id.app_engagement_panel_wrapper);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById.findViewById(R.id.app_engagement_panel);
        relativeLayout.getClass();
        View findViewById2 = findViewById.findViewById(R.id.scrim);
        findViewById2.getClass();
        final ogt x = muf.x(new yzr(findViewById2));
        x.a(this.a);
        final nvs nvsVar = new nvs(relativeLayout);
        this.a.j(relativeLayout, null);
        EngagementPanelSizeBehavior engagementPanelSizeBehavior = this.a.h().b;
        engagementPanelSizeBehavior.z(this.a.h(), relativeLayout);
        yny.z(relativeLayout, yny.l(engagementPanelSizeBehavior), ahh.class);
        final int i = 0;
        if (this.c) {
            findViewById2.setOnTouchListener(gpm.b);
            final int i2 = 1;
            this.h.d(whu.A(accessibilityLayerLayout, this.j).B().ax(new ayrs() { // from class: npa
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i3 = i2;
                    if (i3 == 0) {
                        nvs nvsVar2 = nvsVar;
                        int intValue = ((Integer) obj).intValue();
                        ahh ahhVar = (ahh) nvsVar2.d.getLayoutParams();
                        ahhVar.c = intValue;
                        nvsVar2.d.setLayoutParams(ahhVar);
                        return;
                    }
                    if (i3 == 1) {
                        nvs nvsVar3 = nvsVar;
                        int width = ((Rect) obj).width();
                        int i4 = nvsVar3.b;
                        if (width < i4) {
                            i4 = -1;
                        } else if (width >= nvsVar3.c) {
                            double d = width;
                            Double.isNaN(d);
                            i4 = Math.min((int) (d * 0.67d), nvsVar3.a);
                        }
                        yny.z(nvsVar3.d, yny.y(i4, -1), ViewGroup.LayoutParams.class);
                        return;
                    }
                    yny.z(nvsVar.d, yny.v(((Integer) obj).intValue()), ViewGroup.MarginLayoutParams.class);
                }
            }));
            this.h.d(aypn.z(17).j(this.k.b.A(mmt.h).n()).X(new ayrs() { // from class: npa
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i3 = i;
                    if (i3 == 0) {
                        nvs nvsVar2 = nvsVar;
                        int intValue = ((Integer) obj).intValue();
                        ahh ahhVar = (ahh) nvsVar2.d.getLayoutParams();
                        ahhVar.c = intValue;
                        nvsVar2.d.setLayoutParams(ahhVar);
                        return;
                    }
                    if (i3 == 1) {
                        nvs nvsVar3 = nvsVar;
                        int width = ((Rect) obj).width();
                        int i4 = nvsVar3.b;
                        if (width < i4) {
                            i4 = -1;
                        } else if (width >= nvsVar3.c) {
                            double d = width;
                            Double.isNaN(d);
                            i4 = Math.min((int) (d * 0.67d), nvsVar3.a);
                        }
                        yny.z(nvsVar3.d, yny.y(i4, -1), ViewGroup.LayoutParams.class);
                        return;
                    }
                    yny.z(nvsVar.d, yny.v(((Integer) obj).intValue()), ViewGroup.MarginLayoutParams.class);
                }
            }));
            final int i3 = 2;
            this.h.d(this.a.h().m.X(new ayrs() { // from class: npa
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i32 = i3;
                    if (i32 == 0) {
                        nvs nvsVar2 = nvsVar;
                        int intValue = ((Integer) obj).intValue();
                        ahh ahhVar = (ahh) nvsVar2.d.getLayoutParams();
                        ahhVar.c = intValue;
                        nvsVar2.d.setLayoutParams(ahhVar);
                        return;
                    }
                    if (i32 == 1) {
                        nvs nvsVar3 = nvsVar;
                        int width = ((Rect) obj).width();
                        int i4 = nvsVar3.b;
                        if (width < i4) {
                            i4 = -1;
                        } else if (width >= nvsVar3.c) {
                            double d = width;
                            Double.isNaN(d);
                            i4 = Math.min((int) (d * 0.67d), nvsVar3.a);
                        }
                        yny.z(nvsVar3.d, yny.y(i4, -1), ViewGroup.LayoutParams.class);
                        return;
                    }
                    yny.z(nvsVar.d, yny.v(((Integer) obj).intValue()), ViewGroup.MarginLayoutParams.class);
                }
            }));
        } else {
            this.h.d(this.a.h().m.X(new nox(relativeLayout, 0)));
        }
        yzr C = this.a.C();
        this.d = C;
        C.h(this);
        this.h.d(this.a.g().c.X(new ayrs() { // from class: noz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                AppEngagementPanelControllerInitializer appEngagementPanelControllerInitializer = AppEngagementPanelControllerInitializer.this;
                ogt ogtVar = x;
                AccessibilityLayerLayout accessibilityLayerLayout2 = accessibilityLayerLayout;
                View view = findViewById;
                ammv ammvVar = (ammv) obj;
                if (ammvVar.h()) {
                    whu.I(view, true);
                    if (appEngagementPanelControllerInitializer.c) {
                        appEngagementPanelControllerInitializer.d.l(appEngagementPanelControllerInitializer.a.h().a.b((nqg) ammvVar.c()));
                    }
                }
                appEngagementPanelControllerInitializer.d.a(ammvVar.h(), true);
                appEngagementPanelControllerInitializer.b.g(ammvVar.h());
                accessibilityLayerLayout2.b(!ammvVar.h());
                ogtVar.b(false, ammvVar.h());
            }
        }));
        this.h.d(this.f.h().ax(new ayrs() { // from class: noy
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                AppEngagementPanelControllerInitializer appEngagementPanelControllerInitializer = AppEngagementPanelControllerInitializer.this;
                if (((fhg) obj).i()) {
                    while (appEngagementPanelControllerInitializer.a.x()) {
                        appEngagementPanelControllerInitializer.a.n(ammz.ALWAYS_TRUE, false);
                    }
                }
            }
        }));
        this.g.m(this.i);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.d.j(this);
        this.g.x(this.i);
        this.h.c();
    }

    @Override // defpackage.zch
    public final void nE(int i, yzr yzrVar) {
        if (i == 0) {
            whu.I(this.e.findViewById(R.id.app_engagement_panel_wrapper), false);
        }
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
