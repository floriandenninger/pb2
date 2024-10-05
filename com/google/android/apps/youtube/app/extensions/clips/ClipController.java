package com.google.android.apps.youtube.app.extensions.clips;

import com.google.android.apps.youtube.app.extensions.clips.ClipController;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import defpackage.aahd;
import defpackage.ahbw;
import defpackage.ahsq;
import defpackage.ahyo;
import defpackage.ahyp;
import defpackage.aiee;
import defpackage.ainy;
import defpackage.aiqu;
import defpackage.aixv;
import defpackage.aixx;
import defpackage.amru;
import defpackage.any;
import defpackage.aok;
import defpackage.aone;
import defpackage.aong;
import defpackage.apwo;
import defpackage.apxf;
import defpackage.awdg;
import defpackage.awdp;
import defpackage.axpg;
import defpackage.axzb;
import defpackage.axze;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.azqb;
import defpackage.azrw;
import defpackage.fhd;
import defpackage.gbr;
import defpackage.ggk;
import defpackage.gxj;
import defpackage.gxn;
import defpackage.gxo;
import defpackage.gxr;
import defpackage.gys;
import defpackage.gzd;
import defpackage.kvl;
import defpackage.nnh;
import defpackage.ojc;
import defpackage.ypa;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ClipController implements nnh, any, gxo, gxr, gxj {
    private final azrw A;
    private final azrw B;
    private final azrw C;
    private final azrw D;
    private ayqx E;
    private ayqx F;
    private ayqx G;
    private ayqx H;
    private ayqx I;

    /* renamed from: J, reason: collision with root package name */
    private ayqx f156J;
    private ayqx K;
    private ayqx L;
    private ayqx M;
    private ayqx N;
    private ayqx O;
    private ayqx P;
    private ayqx Q;
    public final ypa a;
    public final azrw b;
    public final axpg c;
    public final azrw d;
    public gys f;
    public String h;
    public int i;
    public boolean j;
    public apwo u;
    private final azrw z;
    public apxf e = null;
    public aixx g = new aixv();
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    private boolean R = false;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public String s = "";
    public long t = Long.MAX_VALUE;
    public WeakReference v = new WeakReference(null);
    public WeakReference w = new WeakReference(null);
    private long S = 0;
    public boolean x = false;
    public String y = "";

    public ClipController(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, axpg axpgVar, azrw azrwVar6, ypa ypaVar, azrw azrwVar7) {
        this.z = azrwVar;
        this.b = azrwVar2;
        this.A = azrwVar3;
        this.B = azrwVar4;
        this.C = azrwVar5;
        this.c = axpgVar;
        this.d = azrwVar6;
        this.a = ypaVar;
        this.D = azrwVar7;
    }

    private final void v(boolean z) {
        gzd gzdVar;
        this.k = z;
        if (z) {
            r();
        } else {
            ((ahsq) this.z.get()).a();
        }
        gys gysVar = this.f;
        if (gysVar == null || z || (gzdVar = gysVar.q) == null) {
            return;
        }
        gzdVar.ao();
    }

    @Override // defpackage.nnh
    public final void aK(fhd fhdVar) {
        PlaybackStartDescriptor playbackStartDescriptor = fhdVar.a.a;
        apxf apxfVar = playbackStartDescriptor.b;
        if (apxfVar == null || !apxfVar.pY(WatchEndpointOuterClass.watchEndpoint)) {
            return;
        }
        awdp awdpVar = (awdp) playbackStartDescriptor.b.pX(WatchEndpointOuterClass.watchEndpoint);
        if ((awdpVar.b & 33554432) == 0) {
            this.u = null;
            return;
        }
        awdg awdgVar = awdpVar.t;
        if (awdgVar == null) {
            awdgVar = awdg.a;
        }
        apwo apwoVar = awdgVar.b;
        if (apwoVar == null) {
            apwoVar = apwo.a;
        }
        this.u = apwoVar;
    }

    @Override // defpackage.nnh
    public final void aM() {
    }

    public final long g(long j) {
        long g = this.g.g();
        if (!this.j) {
            g -= j / 2;
        }
        long j2 = j / 2;
        if (g - j2 < 0) {
            g = 0;
        }
        long f = this.g.f();
        return j2 + g > f ? f - j : g;
    }

    @Override // defpackage.gxr
    public final String h() {
        return this.y;
    }

    public final void i() {
        if (((aiqu) this.v.get()) != null) {
            ((aiqu) this.v.get()).b(null);
        }
        this.e = null;
        this.u = null;
        this.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.q()));
    }

    public final void j(apwo apwoVar, String str) {
        if (this.i != 0 || str.equals(this.s)) {
            return;
        }
        ((ahsq) this.z.get()).b(apwoVar.e, apwoVar.f);
        if ((apwoVar.b & 16) != 0) {
            apxf apxfVar = apwoVar.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            this.e = apxfVar;
        }
        this.s = str;
        this.t = apwoVar.e;
        this.R = false;
        ayrz.c((AtomicReference) this.M);
        this.y = (apwoVar.b & 2) != 0 ? apwoVar.d : "";
    }

    public final void k(String... strArr) {
        for (String str : strArr) {
            aone createBuilder = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a.createBuilder();
            createBuilder.copyOnWrite();
            HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.instance;
            str.getClass();
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = str;
            HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2 = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.build();
            aahd aahdVar = (aahd) this.b.get();
            if (aahdVar != null) {
                aong aongVar = (aong) apxf.a.createBuilder();
                aongVar.e(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2);
                aahdVar.a((apxf) aongVar.build());
            }
        }
        i();
    }

    @Override // defpackage.gxj
    public final void l() {
        this.R = true;
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

    @Override // defpackage.gxo
    public final void m() {
        v(false);
        if (this.x) {
            ((ainy) this.C.get()).U(this.S);
        }
    }

    @Override // defpackage.gxo
    public final void n() {
        v(true);
        if (this.x) {
            if (this.g.g() + 1000 >= this.g.f()) {
                this.S = Long.MAX_VALUE;
            } else {
                this.S = this.g.g();
            }
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        i();
        azqb.f((AtomicReference) this.E);
        azqb.f((AtomicReference) this.F);
        azqb.f((AtomicReference) this.G);
        azqb.f((AtomicReference) this.H);
        azqb.f((AtomicReference) this.K);
        azqb.f((AtomicReference) this.f156J);
        azqb.f((AtomicReference) this.I);
        ((ojc) this.B.get()).d(this);
        ayrz.c((AtomicReference) this.L);
        ayrz.c((AtomicReference) this.M);
        ayrz.c((AtomicReference) this.N);
        ayrz.c((AtomicReference) this.O);
        ayrz.c((AtomicReference) this.P);
        ayrz.c((AtomicReference) this.Q);
        ((aiee) this.c.get()).n.c();
    }

    @Override // defpackage.gxr
    public final void o() {
        this.l = false;
        ((ahsq) this.z.get()).a();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        kvl kvlVar = (kvl) this.A.get();
        final int i = 1;
        final int i2 = 5;
        this.E = kvlVar.ae(gbr.j, gbr.k).h(ahbw.e(1)).Y(new ayrs(this) { // from class: gxg
            public final /* synthetic */ ClipController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gys gysVar;
                gys gysVar2;
                final int i3 = 2;
                final int i4 = 0;
                char c = 1;
                switch (i2) {
                    case 0:
                        this.a.q = ((Boolean) obj).booleanValue();
                        return;
                    case 1:
                        this.a.p = ((Boolean) obj).booleanValue();
                        return;
                    case 2:
                        this.a.r = ((Boolean) obj).booleanValue();
                        return;
                    case 3:
                        ClipController clipController = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        clipController.o = booleanValue;
                        gys gysVar3 = clipController.f;
                        if (gysVar3 != null) {
                            gysVar3.r(booleanValue);
                            return;
                        }
                        return;
                    case 4:
                        ClipController clipController2 = this.a;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        clipController2.n = booleanValue2;
                        gys gysVar4 = clipController2.f;
                        if (gysVar4 != null) {
                            gysVar4.q(booleanValue2);
                            return;
                        }
                        return;
                    case 5:
                        ClipController clipController3 = this.a;
                        ahdp ahdpVar = (ahdp) obj;
                        apwo o = ahdpVar.a().o();
                        if (o != null) {
                            clipController3.j(o, ahdpVar.b());
                            return;
                        }
                        apwo apwoVar = clipController3.u;
                        if (apwoVar == null || (2 & apwoVar.b) == 0) {
                            clipController3.y = "";
                            return;
                        } else {
                            clipController3.j(apwoVar, ahdpVar.b());
                            return;
                        }
                    case 6:
                        ClipController clipController4 = this.a;
                        ahef ahefVar = (ahef) obj;
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || ahefVar.b() == null) {
                            return;
                        }
                        clipController4.h = ahefVar.b().y();
                        return;
                    case 7:
                        ClipController clipController5 = this.a;
                        aheg ahegVar = (aheg) obj;
                        boolean z = !clipController5.u();
                        clipController5.g = ahegVar;
                        if (clipController5.k && (gysVar = clipController5.f) != null) {
                            gysVar.t(ahegVar.e());
                            if (z && clipController5.u()) {
                                clipController5.r();
                            }
                        }
                        boolean z2 = clipController5.t >= ahegVar.h();
                        clipController5.m = z2;
                        if (!clipController5.l || z2) {
                            return;
                        }
                        clipController5.k("engagement-panel-clip-view");
                        return;
                    case 8:
                        this.a.j = ((ahej) obj).e();
                        return;
                    case 9:
                        ClipController clipController6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        ajbl a = ahelVar.a();
                        if (ahelVar == clipController6.w.get()) {
                            return;
                        }
                        clipController6.w = new WeakReference(ahelVar);
                        if (a.c() != null) {
                            clipController6.i();
                            clipController6.h = a.c().y();
                            clipController6.i = ahelVar.a().a();
                            clipController6.g = a.p();
                            gys gysVar5 = clipController6.f;
                            if (gysVar5 != null) {
                                gysVar5.o(clipController6.h, clipController6.i);
                            }
                            clipController6.v = new WeakReference(ahelVar.a().k());
                            if (a.c().o() != null) {
                                ((aiqu) clipController6.v.get()).b(a.c().o().d);
                            }
                            String f = aalt.f(aoyo.b.a(), "ad_state_id");
                            aone createBuilder = aoyo.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar = (aoyo) createBuilder.instance;
                            f.getClass();
                            aoyoVar.c |= 1;
                            aoyoVar.d = f;
                            boolean z3 = clipController6.i != 0;
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar2 = (aoyo) createBuilder.instance;
                            aoyoVar2.c |= 2;
                            aoyoVar2.e = z3;
                            ((sxd) clipController6.d.get()).b(f, ((aoyo) createBuilder.build()).toByteArray());
                            if (clipController6.r) {
                                String f2 = aalt.f(audv.b.a(), "clip_engagement_panel_ad_state_entity_key");
                                aone createBuilder2 = audv.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                audv audvVar = (audv) createBuilder2.instance;
                                f2.getClass();
                                audvVar.c |= 1;
                                audvVar.d = f2;
                                boolean z4 = clipController6.i != 0;
                                createBuilder2.copyOnWrite();
                                audv audvVar2 = (audv) createBuilder2.instance;
                                audvVar2.c = 2 | audvVar2.c;
                                audvVar2.e = z4;
                                ((sxd) clipController6.d.get()).b(f2, ((audv) createBuilder2.build()).toByteArray());
                            }
                            if (clipController6.i == 0) {
                                if (!clipController6.q) {
                                    clipController6.r();
                                    return;
                                }
                                if (!clipController6.k || (gysVar2 = clipController6.f) == null) {
                                    return;
                                }
                                aixx aixxVar = clipController6.g;
                                aixx aixxVar2 = gysVar2.F;
                                if (aixxVar2 == null || aixxVar2.h() != aixxVar.h() || aixxVar2.f() != aixxVar.f()) {
                                    gysVar2.s(aixxVar);
                                    return;
                                } else {
                                    gysVar2.h.execute(new gyn(gysVar2, 0));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 10:
                        final ClipController clipController7 = this.a;
                        ahsp ahspVar = (ahsp) obj;
                        if (ahspVar.a() == 3) {
                            clipController7.s = "";
                            return;
                        }
                        if (clipController7.p && clipController7.i == 1) {
                            return;
                        }
                        if (ahspVar.a() == 0 && clipController7.e != null) {
                            bqc bqcVar = bqc.c;
                            final char c2 = c == true ? 1 : 0;
                            clipController7.q(bqcVar, new Runnable() { // from class: gxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i5 = c2;
                                    if (i5 == 0) {
                                        clipController7.k("engagement-panel-clip-view");
                                    } else if (i5 != 1) {
                                        clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                    } else {
                                        ClipController clipController8 = clipController7;
                                        ((aahd) clipController8.b.get()).a(clipController8.e);
                                    }
                                }
                            });
                        }
                        if (ahspVar.a() == 2) {
                            clipController7.i();
                            return;
                        }
                        if (ahspVar.a() == 1) {
                            clipController7.m = false;
                        }
                        clipController7.q(new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i4;
                                if (i5 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i5 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        }, new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i3;
                                if (i5 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i5 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        });
                        return;
                    case 11:
                        ClipController clipController8 = this.a;
                        ahta ahtaVar = (ahta) obj;
                        long h = clipController8.g.h();
                        clipController8.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.r(new TimelineMarker(ahtaVar.b() - h, ahtaVar.a() - h))));
                        return;
                    default:
                        this.a.x = ((Boolean) obj).booleanValue();
                        return;
                }
            }
        }, ggk.n);
        final int i3 = 10;
        this.F = kvlVar.X().Y(new ayrs(this) { // from class: gxg
            public final /* synthetic */ ClipController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gys gysVar;
                gys gysVar2;
                final int i32 = 2;
                final int i4 = 0;
                char c = 1;
                switch (i3) {
                    case 0:
                        this.a.q = ((Boolean) obj).booleanValue();
                        return;
                    case 1:
                        this.a.p = ((Boolean) obj).booleanValue();
                        return;
                    case 2:
                        this.a.r = ((Boolean) obj).booleanValue();
                        return;
                    case 3:
                        ClipController clipController = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        clipController.o = booleanValue;
                        gys gysVar3 = clipController.f;
                        if (gysVar3 != null) {
                            gysVar3.r(booleanValue);
                            return;
                        }
                        return;
                    case 4:
                        ClipController clipController2 = this.a;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        clipController2.n = booleanValue2;
                        gys gysVar4 = clipController2.f;
                        if (gysVar4 != null) {
                            gysVar4.q(booleanValue2);
                            return;
                        }
                        return;
                    case 5:
                        ClipController clipController3 = this.a;
                        ahdp ahdpVar = (ahdp) obj;
                        apwo o = ahdpVar.a().o();
                        if (o != null) {
                            clipController3.j(o, ahdpVar.b());
                            return;
                        }
                        apwo apwoVar = clipController3.u;
                        if (apwoVar == null || (2 & apwoVar.b) == 0) {
                            clipController3.y = "";
                            return;
                        } else {
                            clipController3.j(apwoVar, ahdpVar.b());
                            return;
                        }
                    case 6:
                        ClipController clipController4 = this.a;
                        ahef ahefVar = (ahef) obj;
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || ahefVar.b() == null) {
                            return;
                        }
                        clipController4.h = ahefVar.b().y();
                        return;
                    case 7:
                        ClipController clipController5 = this.a;
                        aheg ahegVar = (aheg) obj;
                        boolean z = !clipController5.u();
                        clipController5.g = ahegVar;
                        if (clipController5.k && (gysVar = clipController5.f) != null) {
                            gysVar.t(ahegVar.e());
                            if (z && clipController5.u()) {
                                clipController5.r();
                            }
                        }
                        boolean z2 = clipController5.t >= ahegVar.h();
                        clipController5.m = z2;
                        if (!clipController5.l || z2) {
                            return;
                        }
                        clipController5.k("engagement-panel-clip-view");
                        return;
                    case 8:
                        this.a.j = ((ahej) obj).e();
                        return;
                    case 9:
                        ClipController clipController6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        ajbl a = ahelVar.a();
                        if (ahelVar == clipController6.w.get()) {
                            return;
                        }
                        clipController6.w = new WeakReference(ahelVar);
                        if (a.c() != null) {
                            clipController6.i();
                            clipController6.h = a.c().y();
                            clipController6.i = ahelVar.a().a();
                            clipController6.g = a.p();
                            gys gysVar5 = clipController6.f;
                            if (gysVar5 != null) {
                                gysVar5.o(clipController6.h, clipController6.i);
                            }
                            clipController6.v = new WeakReference(ahelVar.a().k());
                            if (a.c().o() != null) {
                                ((aiqu) clipController6.v.get()).b(a.c().o().d);
                            }
                            String f = aalt.f(aoyo.b.a(), "ad_state_id");
                            aone createBuilder = aoyo.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar = (aoyo) createBuilder.instance;
                            f.getClass();
                            aoyoVar.c |= 1;
                            aoyoVar.d = f;
                            boolean z3 = clipController6.i != 0;
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar2 = (aoyo) createBuilder.instance;
                            aoyoVar2.c |= 2;
                            aoyoVar2.e = z3;
                            ((sxd) clipController6.d.get()).b(f, ((aoyo) createBuilder.build()).toByteArray());
                            if (clipController6.r) {
                                String f2 = aalt.f(audv.b.a(), "clip_engagement_panel_ad_state_entity_key");
                                aone createBuilder2 = audv.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                audv audvVar = (audv) createBuilder2.instance;
                                f2.getClass();
                                audvVar.c |= 1;
                                audvVar.d = f2;
                                boolean z4 = clipController6.i != 0;
                                createBuilder2.copyOnWrite();
                                audv audvVar2 = (audv) createBuilder2.instance;
                                audvVar2.c = 2 | audvVar2.c;
                                audvVar2.e = z4;
                                ((sxd) clipController6.d.get()).b(f2, ((audv) createBuilder2.build()).toByteArray());
                            }
                            if (clipController6.i == 0) {
                                if (!clipController6.q) {
                                    clipController6.r();
                                    return;
                                }
                                if (!clipController6.k || (gysVar2 = clipController6.f) == null) {
                                    return;
                                }
                                aixx aixxVar = clipController6.g;
                                aixx aixxVar2 = gysVar2.F;
                                if (aixxVar2 == null || aixxVar2.h() != aixxVar.h() || aixxVar2.f() != aixxVar.f()) {
                                    gysVar2.s(aixxVar);
                                    return;
                                } else {
                                    gysVar2.h.execute(new gyn(gysVar2, 0));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 10:
                        final ClipController clipController7 = this.a;
                        ahsp ahspVar = (ahsp) obj;
                        if (ahspVar.a() == 3) {
                            clipController7.s = "";
                            return;
                        }
                        if (clipController7.p && clipController7.i == 1) {
                            return;
                        }
                        if (ahspVar.a() == 0 && clipController7.e != null) {
                            bqc bqcVar = bqc.c;
                            final int c2 = c == true ? 1 : 0;
                            clipController7.q(bqcVar, new Runnable() { // from class: gxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i5 = c2;
                                    if (i5 == 0) {
                                        clipController7.k("engagement-panel-clip-view");
                                    } else if (i5 != 1) {
                                        clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                    } else {
                                        ClipController clipController8 = clipController7;
                                        ((aahd) clipController8.b.get()).a(clipController8.e);
                                    }
                                }
                            });
                        }
                        if (ahspVar.a() == 2) {
                            clipController7.i();
                            return;
                        }
                        if (ahspVar.a() == 1) {
                            clipController7.m = false;
                        }
                        clipController7.q(new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i4;
                                if (i5 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i5 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        }, new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i32;
                                if (i5 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i5 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        });
                        return;
                    case 11:
                        ClipController clipController8 = this.a;
                        ahta ahtaVar = (ahta) obj;
                        long h = clipController8.g.h();
                        clipController8.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.r(new TimelineMarker(ahtaVar.b() - h, ahtaVar.a() - h))));
                        return;
                    default:
                        this.a.x = ((Boolean) obj).booleanValue();
                        return;
                }
            }
        }, ggk.n);
        final int i4 = 11;
        this.G = kvlVar.Y().Y(new ayrs(this) { // from class: gxg
            public final /* synthetic */ ClipController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gys gysVar;
                gys gysVar2;
                final int i32 = 2;
                final int i42 = 0;
                char c = 1;
                switch (i4) {
                    case 0:
                        this.a.q = ((Boolean) obj).booleanValue();
                        return;
                    case 1:
                        this.a.p = ((Boolean) obj).booleanValue();
                        return;
                    case 2:
                        this.a.r = ((Boolean) obj).booleanValue();
                        return;
                    case 3:
                        ClipController clipController = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        clipController.o = booleanValue;
                        gys gysVar3 = clipController.f;
                        if (gysVar3 != null) {
                            gysVar3.r(booleanValue);
                            return;
                        }
                        return;
                    case 4:
                        ClipController clipController2 = this.a;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        clipController2.n = booleanValue2;
                        gys gysVar4 = clipController2.f;
                        if (gysVar4 != null) {
                            gysVar4.q(booleanValue2);
                            return;
                        }
                        return;
                    case 5:
                        ClipController clipController3 = this.a;
                        ahdp ahdpVar = (ahdp) obj;
                        apwo o = ahdpVar.a().o();
                        if (o != null) {
                            clipController3.j(o, ahdpVar.b());
                            return;
                        }
                        apwo apwoVar = clipController3.u;
                        if (apwoVar == null || (2 & apwoVar.b) == 0) {
                            clipController3.y = "";
                            return;
                        } else {
                            clipController3.j(apwoVar, ahdpVar.b());
                            return;
                        }
                    case 6:
                        ClipController clipController4 = this.a;
                        ahef ahefVar = (ahef) obj;
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || ahefVar.b() == null) {
                            return;
                        }
                        clipController4.h = ahefVar.b().y();
                        return;
                    case 7:
                        ClipController clipController5 = this.a;
                        aheg ahegVar = (aheg) obj;
                        boolean z = !clipController5.u();
                        clipController5.g = ahegVar;
                        if (clipController5.k && (gysVar = clipController5.f) != null) {
                            gysVar.t(ahegVar.e());
                            if (z && clipController5.u()) {
                                clipController5.r();
                            }
                        }
                        boolean z2 = clipController5.t >= ahegVar.h();
                        clipController5.m = z2;
                        if (!clipController5.l || z2) {
                            return;
                        }
                        clipController5.k("engagement-panel-clip-view");
                        return;
                    case 8:
                        this.a.j = ((ahej) obj).e();
                        return;
                    case 9:
                        ClipController clipController6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        ajbl a = ahelVar.a();
                        if (ahelVar == clipController6.w.get()) {
                            return;
                        }
                        clipController6.w = new WeakReference(ahelVar);
                        if (a.c() != null) {
                            clipController6.i();
                            clipController6.h = a.c().y();
                            clipController6.i = ahelVar.a().a();
                            clipController6.g = a.p();
                            gys gysVar5 = clipController6.f;
                            if (gysVar5 != null) {
                                gysVar5.o(clipController6.h, clipController6.i);
                            }
                            clipController6.v = new WeakReference(ahelVar.a().k());
                            if (a.c().o() != null) {
                                ((aiqu) clipController6.v.get()).b(a.c().o().d);
                            }
                            String f = aalt.f(aoyo.b.a(), "ad_state_id");
                            aone createBuilder = aoyo.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar = (aoyo) createBuilder.instance;
                            f.getClass();
                            aoyoVar.c |= 1;
                            aoyoVar.d = f;
                            boolean z3 = clipController6.i != 0;
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar2 = (aoyo) createBuilder.instance;
                            aoyoVar2.c |= 2;
                            aoyoVar2.e = z3;
                            ((sxd) clipController6.d.get()).b(f, ((aoyo) createBuilder.build()).toByteArray());
                            if (clipController6.r) {
                                String f2 = aalt.f(audv.b.a(), "clip_engagement_panel_ad_state_entity_key");
                                aone createBuilder2 = audv.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                audv audvVar = (audv) createBuilder2.instance;
                                f2.getClass();
                                audvVar.c |= 1;
                                audvVar.d = f2;
                                boolean z4 = clipController6.i != 0;
                                createBuilder2.copyOnWrite();
                                audv audvVar2 = (audv) createBuilder2.instance;
                                audvVar2.c = 2 | audvVar2.c;
                                audvVar2.e = z4;
                                ((sxd) clipController6.d.get()).b(f2, ((audv) createBuilder2.build()).toByteArray());
                            }
                            if (clipController6.i == 0) {
                                if (!clipController6.q) {
                                    clipController6.r();
                                    return;
                                }
                                if (!clipController6.k || (gysVar2 = clipController6.f) == null) {
                                    return;
                                }
                                aixx aixxVar = clipController6.g;
                                aixx aixxVar2 = gysVar2.F;
                                if (aixxVar2 == null || aixxVar2.h() != aixxVar.h() || aixxVar2.f() != aixxVar.f()) {
                                    gysVar2.s(aixxVar);
                                    return;
                                } else {
                                    gysVar2.h.execute(new gyn(gysVar2, 0));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 10:
                        final ClipController clipController7 = this.a;
                        ahsp ahspVar = (ahsp) obj;
                        if (ahspVar.a() == 3) {
                            clipController7.s = "";
                            return;
                        }
                        if (clipController7.p && clipController7.i == 1) {
                            return;
                        }
                        if (ahspVar.a() == 0 && clipController7.e != null) {
                            bqc bqcVar = bqc.c;
                            final int c2 = c == true ? 1 : 0;
                            clipController7.q(bqcVar, new Runnable() { // from class: gxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i5 = c2;
                                    if (i5 == 0) {
                                        clipController7.k("engagement-panel-clip-view");
                                    } else if (i5 != 1) {
                                        clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                    } else {
                                        ClipController clipController8 = clipController7;
                                        ((aahd) clipController8.b.get()).a(clipController8.e);
                                    }
                                }
                            });
                        }
                        if (ahspVar.a() == 2) {
                            clipController7.i();
                            return;
                        }
                        if (ahspVar.a() == 1) {
                            clipController7.m = false;
                        }
                        clipController7.q(new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i42;
                                if (i5 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i5 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        }, new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i32;
                                if (i5 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i5 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        });
                        return;
                    case 11:
                        ClipController clipController8 = this.a;
                        ahta ahtaVar = (ahta) obj;
                        long h = clipController8.g.h();
                        clipController8.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.r(new TimelineMarker(ahtaVar.b() - h, ahtaVar.a() - h))));
                        return;
                    default:
                        this.a.x = ((Boolean) obj).booleanValue();
                        return;
                }
            }
        }, ggk.n);
        final int i5 = 9;
        this.H = kvlVar.V().Y(new ayrs(this) { // from class: gxg
            public final /* synthetic */ ClipController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gys gysVar;
                gys gysVar2;
                final int i32 = 2;
                final int i42 = 0;
                char c = 1;
                switch (i5) {
                    case 0:
                        this.a.q = ((Boolean) obj).booleanValue();
                        return;
                    case 1:
                        this.a.p = ((Boolean) obj).booleanValue();
                        return;
                    case 2:
                        this.a.r = ((Boolean) obj).booleanValue();
                        return;
                    case 3:
                        ClipController clipController = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        clipController.o = booleanValue;
                        gys gysVar3 = clipController.f;
                        if (gysVar3 != null) {
                            gysVar3.r(booleanValue);
                            return;
                        }
                        return;
                    case 4:
                        ClipController clipController2 = this.a;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        clipController2.n = booleanValue2;
                        gys gysVar4 = clipController2.f;
                        if (gysVar4 != null) {
                            gysVar4.q(booleanValue2);
                            return;
                        }
                        return;
                    case 5:
                        ClipController clipController3 = this.a;
                        ahdp ahdpVar = (ahdp) obj;
                        apwo o = ahdpVar.a().o();
                        if (o != null) {
                            clipController3.j(o, ahdpVar.b());
                            return;
                        }
                        apwo apwoVar = clipController3.u;
                        if (apwoVar == null || (2 & apwoVar.b) == 0) {
                            clipController3.y = "";
                            return;
                        } else {
                            clipController3.j(apwoVar, ahdpVar.b());
                            return;
                        }
                    case 6:
                        ClipController clipController4 = this.a;
                        ahef ahefVar = (ahef) obj;
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || ahefVar.b() == null) {
                            return;
                        }
                        clipController4.h = ahefVar.b().y();
                        return;
                    case 7:
                        ClipController clipController5 = this.a;
                        aheg ahegVar = (aheg) obj;
                        boolean z = !clipController5.u();
                        clipController5.g = ahegVar;
                        if (clipController5.k && (gysVar = clipController5.f) != null) {
                            gysVar.t(ahegVar.e());
                            if (z && clipController5.u()) {
                                clipController5.r();
                            }
                        }
                        boolean z2 = clipController5.t >= ahegVar.h();
                        clipController5.m = z2;
                        if (!clipController5.l || z2) {
                            return;
                        }
                        clipController5.k("engagement-panel-clip-view");
                        return;
                    case 8:
                        this.a.j = ((ahej) obj).e();
                        return;
                    case 9:
                        ClipController clipController6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        ajbl a = ahelVar.a();
                        if (ahelVar == clipController6.w.get()) {
                            return;
                        }
                        clipController6.w = new WeakReference(ahelVar);
                        if (a.c() != null) {
                            clipController6.i();
                            clipController6.h = a.c().y();
                            clipController6.i = ahelVar.a().a();
                            clipController6.g = a.p();
                            gys gysVar5 = clipController6.f;
                            if (gysVar5 != null) {
                                gysVar5.o(clipController6.h, clipController6.i);
                            }
                            clipController6.v = new WeakReference(ahelVar.a().k());
                            if (a.c().o() != null) {
                                ((aiqu) clipController6.v.get()).b(a.c().o().d);
                            }
                            String f = aalt.f(aoyo.b.a(), "ad_state_id");
                            aone createBuilder = aoyo.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar = (aoyo) createBuilder.instance;
                            f.getClass();
                            aoyoVar.c |= 1;
                            aoyoVar.d = f;
                            boolean z3 = clipController6.i != 0;
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar2 = (aoyo) createBuilder.instance;
                            aoyoVar2.c |= 2;
                            aoyoVar2.e = z3;
                            ((sxd) clipController6.d.get()).b(f, ((aoyo) createBuilder.build()).toByteArray());
                            if (clipController6.r) {
                                String f2 = aalt.f(audv.b.a(), "clip_engagement_panel_ad_state_entity_key");
                                aone createBuilder2 = audv.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                audv audvVar = (audv) createBuilder2.instance;
                                f2.getClass();
                                audvVar.c |= 1;
                                audvVar.d = f2;
                                boolean z4 = clipController6.i != 0;
                                createBuilder2.copyOnWrite();
                                audv audvVar2 = (audv) createBuilder2.instance;
                                audvVar2.c = 2 | audvVar2.c;
                                audvVar2.e = z4;
                                ((sxd) clipController6.d.get()).b(f2, ((audv) createBuilder2.build()).toByteArray());
                            }
                            if (clipController6.i == 0) {
                                if (!clipController6.q) {
                                    clipController6.r();
                                    return;
                                }
                                if (!clipController6.k || (gysVar2 = clipController6.f) == null) {
                                    return;
                                }
                                aixx aixxVar = clipController6.g;
                                aixx aixxVar2 = gysVar2.F;
                                if (aixxVar2 == null || aixxVar2.h() != aixxVar.h() || aixxVar2.f() != aixxVar.f()) {
                                    gysVar2.s(aixxVar);
                                    return;
                                } else {
                                    gysVar2.h.execute(new gyn(gysVar2, 0));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 10:
                        final ClipController clipController7 = this.a;
                        ahsp ahspVar = (ahsp) obj;
                        if (ahspVar.a() == 3) {
                            clipController7.s = "";
                            return;
                        }
                        if (clipController7.p && clipController7.i == 1) {
                            return;
                        }
                        if (ahspVar.a() == 0 && clipController7.e != null) {
                            bqc bqcVar = bqc.c;
                            final int c2 = c == true ? 1 : 0;
                            clipController7.q(bqcVar, new Runnable() { // from class: gxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i52 = c2;
                                    if (i52 == 0) {
                                        clipController7.k("engagement-panel-clip-view");
                                    } else if (i52 != 1) {
                                        clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                    } else {
                                        ClipController clipController8 = clipController7;
                                        ((aahd) clipController8.b.get()).a(clipController8.e);
                                    }
                                }
                            });
                        }
                        if (ahspVar.a() == 2) {
                            clipController7.i();
                            return;
                        }
                        if (ahspVar.a() == 1) {
                            clipController7.m = false;
                        }
                        clipController7.q(new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i42;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        }, new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i32;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        });
                        return;
                    case 11:
                        ClipController clipController8 = this.a;
                        ahta ahtaVar = (ahta) obj;
                        long h = clipController8.g.h();
                        clipController8.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.r(new TimelineMarker(ahtaVar.b() - h, ahtaVar.a() - h))));
                        return;
                    default:
                        this.a.x = ((Boolean) obj).booleanValue();
                        return;
                }
            }
        }, ggk.n);
        final int i6 = 7;
        this.K = kvlVar.G().d.Y(new ayrs(this) { // from class: gxg
            public final /* synthetic */ ClipController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gys gysVar;
                gys gysVar2;
                final int i32 = 2;
                final int i42 = 0;
                char c = 1;
                switch (i6) {
                    case 0:
                        this.a.q = ((Boolean) obj).booleanValue();
                        return;
                    case 1:
                        this.a.p = ((Boolean) obj).booleanValue();
                        return;
                    case 2:
                        this.a.r = ((Boolean) obj).booleanValue();
                        return;
                    case 3:
                        ClipController clipController = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        clipController.o = booleanValue;
                        gys gysVar3 = clipController.f;
                        if (gysVar3 != null) {
                            gysVar3.r(booleanValue);
                            return;
                        }
                        return;
                    case 4:
                        ClipController clipController2 = this.a;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        clipController2.n = booleanValue2;
                        gys gysVar4 = clipController2.f;
                        if (gysVar4 != null) {
                            gysVar4.q(booleanValue2);
                            return;
                        }
                        return;
                    case 5:
                        ClipController clipController3 = this.a;
                        ahdp ahdpVar = (ahdp) obj;
                        apwo o = ahdpVar.a().o();
                        if (o != null) {
                            clipController3.j(o, ahdpVar.b());
                            return;
                        }
                        apwo apwoVar = clipController3.u;
                        if (apwoVar == null || (2 & apwoVar.b) == 0) {
                            clipController3.y = "";
                            return;
                        } else {
                            clipController3.j(apwoVar, ahdpVar.b());
                            return;
                        }
                    case 6:
                        ClipController clipController4 = this.a;
                        ahef ahefVar = (ahef) obj;
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || ahefVar.b() == null) {
                            return;
                        }
                        clipController4.h = ahefVar.b().y();
                        return;
                    case 7:
                        ClipController clipController5 = this.a;
                        aheg ahegVar = (aheg) obj;
                        boolean z = !clipController5.u();
                        clipController5.g = ahegVar;
                        if (clipController5.k && (gysVar = clipController5.f) != null) {
                            gysVar.t(ahegVar.e());
                            if (z && clipController5.u()) {
                                clipController5.r();
                            }
                        }
                        boolean z2 = clipController5.t >= ahegVar.h();
                        clipController5.m = z2;
                        if (!clipController5.l || z2) {
                            return;
                        }
                        clipController5.k("engagement-panel-clip-view");
                        return;
                    case 8:
                        this.a.j = ((ahej) obj).e();
                        return;
                    case 9:
                        ClipController clipController6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        ajbl a = ahelVar.a();
                        if (ahelVar == clipController6.w.get()) {
                            return;
                        }
                        clipController6.w = new WeakReference(ahelVar);
                        if (a.c() != null) {
                            clipController6.i();
                            clipController6.h = a.c().y();
                            clipController6.i = ahelVar.a().a();
                            clipController6.g = a.p();
                            gys gysVar5 = clipController6.f;
                            if (gysVar5 != null) {
                                gysVar5.o(clipController6.h, clipController6.i);
                            }
                            clipController6.v = new WeakReference(ahelVar.a().k());
                            if (a.c().o() != null) {
                                ((aiqu) clipController6.v.get()).b(a.c().o().d);
                            }
                            String f = aalt.f(aoyo.b.a(), "ad_state_id");
                            aone createBuilder = aoyo.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar = (aoyo) createBuilder.instance;
                            f.getClass();
                            aoyoVar.c |= 1;
                            aoyoVar.d = f;
                            boolean z3 = clipController6.i != 0;
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar2 = (aoyo) createBuilder.instance;
                            aoyoVar2.c |= 2;
                            aoyoVar2.e = z3;
                            ((sxd) clipController6.d.get()).b(f, ((aoyo) createBuilder.build()).toByteArray());
                            if (clipController6.r) {
                                String f2 = aalt.f(audv.b.a(), "clip_engagement_panel_ad_state_entity_key");
                                aone createBuilder2 = audv.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                audv audvVar = (audv) createBuilder2.instance;
                                f2.getClass();
                                audvVar.c |= 1;
                                audvVar.d = f2;
                                boolean z4 = clipController6.i != 0;
                                createBuilder2.copyOnWrite();
                                audv audvVar2 = (audv) createBuilder2.instance;
                                audvVar2.c = 2 | audvVar2.c;
                                audvVar2.e = z4;
                                ((sxd) clipController6.d.get()).b(f2, ((audv) createBuilder2.build()).toByteArray());
                            }
                            if (clipController6.i == 0) {
                                if (!clipController6.q) {
                                    clipController6.r();
                                    return;
                                }
                                if (!clipController6.k || (gysVar2 = clipController6.f) == null) {
                                    return;
                                }
                                aixx aixxVar = clipController6.g;
                                aixx aixxVar2 = gysVar2.F;
                                if (aixxVar2 == null || aixxVar2.h() != aixxVar.h() || aixxVar2.f() != aixxVar.f()) {
                                    gysVar2.s(aixxVar);
                                    return;
                                } else {
                                    gysVar2.h.execute(new gyn(gysVar2, 0));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 10:
                        final ClipController clipController7 = this.a;
                        ahsp ahspVar = (ahsp) obj;
                        if (ahspVar.a() == 3) {
                            clipController7.s = "";
                            return;
                        }
                        if (clipController7.p && clipController7.i == 1) {
                            return;
                        }
                        if (ahspVar.a() == 0 && clipController7.e != null) {
                            bqc bqcVar = bqc.c;
                            final int c2 = c == true ? 1 : 0;
                            clipController7.q(bqcVar, new Runnable() { // from class: gxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i52 = c2;
                                    if (i52 == 0) {
                                        clipController7.k("engagement-panel-clip-view");
                                    } else if (i52 != 1) {
                                        clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                    } else {
                                        ClipController clipController8 = clipController7;
                                        ((aahd) clipController8.b.get()).a(clipController8.e);
                                    }
                                }
                            });
                        }
                        if (ahspVar.a() == 2) {
                            clipController7.i();
                            return;
                        }
                        if (ahspVar.a() == 1) {
                            clipController7.m = false;
                        }
                        clipController7.q(new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i42;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        }, new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i32;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        });
                        return;
                    case 11:
                        ClipController clipController8 = this.a;
                        ahta ahtaVar = (ahta) obj;
                        long h = clipController8.g.h();
                        clipController8.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.r(new TimelineMarker(ahtaVar.b() - h, ahtaVar.a() - h))));
                        return;
                    default:
                        this.a.x = ((Boolean) obj).booleanValue();
                        return;
                }
            }
        }, ggk.n);
        final int i7 = 8;
        this.f156J = kvlVar.G().i.Y(new ayrs(this) { // from class: gxg
            public final /* synthetic */ ClipController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gys gysVar;
                gys gysVar2;
                final int i32 = 2;
                final int i42 = 0;
                char c = 1;
                switch (i7) {
                    case 0:
                        this.a.q = ((Boolean) obj).booleanValue();
                        return;
                    case 1:
                        this.a.p = ((Boolean) obj).booleanValue();
                        return;
                    case 2:
                        this.a.r = ((Boolean) obj).booleanValue();
                        return;
                    case 3:
                        ClipController clipController = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        clipController.o = booleanValue;
                        gys gysVar3 = clipController.f;
                        if (gysVar3 != null) {
                            gysVar3.r(booleanValue);
                            return;
                        }
                        return;
                    case 4:
                        ClipController clipController2 = this.a;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        clipController2.n = booleanValue2;
                        gys gysVar4 = clipController2.f;
                        if (gysVar4 != null) {
                            gysVar4.q(booleanValue2);
                            return;
                        }
                        return;
                    case 5:
                        ClipController clipController3 = this.a;
                        ahdp ahdpVar = (ahdp) obj;
                        apwo o = ahdpVar.a().o();
                        if (o != null) {
                            clipController3.j(o, ahdpVar.b());
                            return;
                        }
                        apwo apwoVar = clipController3.u;
                        if (apwoVar == null || (2 & apwoVar.b) == 0) {
                            clipController3.y = "";
                            return;
                        } else {
                            clipController3.j(apwoVar, ahdpVar.b());
                            return;
                        }
                    case 6:
                        ClipController clipController4 = this.a;
                        ahef ahefVar = (ahef) obj;
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || ahefVar.b() == null) {
                            return;
                        }
                        clipController4.h = ahefVar.b().y();
                        return;
                    case 7:
                        ClipController clipController5 = this.a;
                        aheg ahegVar = (aheg) obj;
                        boolean z = !clipController5.u();
                        clipController5.g = ahegVar;
                        if (clipController5.k && (gysVar = clipController5.f) != null) {
                            gysVar.t(ahegVar.e());
                            if (z && clipController5.u()) {
                                clipController5.r();
                            }
                        }
                        boolean z2 = clipController5.t >= ahegVar.h();
                        clipController5.m = z2;
                        if (!clipController5.l || z2) {
                            return;
                        }
                        clipController5.k("engagement-panel-clip-view");
                        return;
                    case 8:
                        this.a.j = ((ahej) obj).e();
                        return;
                    case 9:
                        ClipController clipController6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        ajbl a = ahelVar.a();
                        if (ahelVar == clipController6.w.get()) {
                            return;
                        }
                        clipController6.w = new WeakReference(ahelVar);
                        if (a.c() != null) {
                            clipController6.i();
                            clipController6.h = a.c().y();
                            clipController6.i = ahelVar.a().a();
                            clipController6.g = a.p();
                            gys gysVar5 = clipController6.f;
                            if (gysVar5 != null) {
                                gysVar5.o(clipController6.h, clipController6.i);
                            }
                            clipController6.v = new WeakReference(ahelVar.a().k());
                            if (a.c().o() != null) {
                                ((aiqu) clipController6.v.get()).b(a.c().o().d);
                            }
                            String f = aalt.f(aoyo.b.a(), "ad_state_id");
                            aone createBuilder = aoyo.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar = (aoyo) createBuilder.instance;
                            f.getClass();
                            aoyoVar.c |= 1;
                            aoyoVar.d = f;
                            boolean z3 = clipController6.i != 0;
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar2 = (aoyo) createBuilder.instance;
                            aoyoVar2.c |= 2;
                            aoyoVar2.e = z3;
                            ((sxd) clipController6.d.get()).b(f, ((aoyo) createBuilder.build()).toByteArray());
                            if (clipController6.r) {
                                String f2 = aalt.f(audv.b.a(), "clip_engagement_panel_ad_state_entity_key");
                                aone createBuilder2 = audv.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                audv audvVar = (audv) createBuilder2.instance;
                                f2.getClass();
                                audvVar.c |= 1;
                                audvVar.d = f2;
                                boolean z4 = clipController6.i != 0;
                                createBuilder2.copyOnWrite();
                                audv audvVar2 = (audv) createBuilder2.instance;
                                audvVar2.c = 2 | audvVar2.c;
                                audvVar2.e = z4;
                                ((sxd) clipController6.d.get()).b(f2, ((audv) createBuilder2.build()).toByteArray());
                            }
                            if (clipController6.i == 0) {
                                if (!clipController6.q) {
                                    clipController6.r();
                                    return;
                                }
                                if (!clipController6.k || (gysVar2 = clipController6.f) == null) {
                                    return;
                                }
                                aixx aixxVar = clipController6.g;
                                aixx aixxVar2 = gysVar2.F;
                                if (aixxVar2 == null || aixxVar2.h() != aixxVar.h() || aixxVar2.f() != aixxVar.f()) {
                                    gysVar2.s(aixxVar);
                                    return;
                                } else {
                                    gysVar2.h.execute(new gyn(gysVar2, 0));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 10:
                        final ClipController clipController7 = this.a;
                        ahsp ahspVar = (ahsp) obj;
                        if (ahspVar.a() == 3) {
                            clipController7.s = "";
                            return;
                        }
                        if (clipController7.p && clipController7.i == 1) {
                            return;
                        }
                        if (ahspVar.a() == 0 && clipController7.e != null) {
                            bqc bqcVar = bqc.c;
                            final int c2 = c == true ? 1 : 0;
                            clipController7.q(bqcVar, new Runnable() { // from class: gxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i52 = c2;
                                    if (i52 == 0) {
                                        clipController7.k("engagement-panel-clip-view");
                                    } else if (i52 != 1) {
                                        clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                    } else {
                                        ClipController clipController8 = clipController7;
                                        ((aahd) clipController8.b.get()).a(clipController8.e);
                                    }
                                }
                            });
                        }
                        if (ahspVar.a() == 2) {
                            clipController7.i();
                            return;
                        }
                        if (ahspVar.a() == 1) {
                            clipController7.m = false;
                        }
                        clipController7.q(new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i42;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        }, new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i32;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        });
                        return;
                    case 11:
                        ClipController clipController8 = this.a;
                        ahta ahtaVar = (ahta) obj;
                        long h = clipController8.g.h();
                        clipController8.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.r(new TimelineMarker(ahtaVar.b() - h, ahtaVar.a() - h))));
                        return;
                    default:
                        this.a.x = ((Boolean) obj).booleanValue();
                        return;
                }
            }
        }, ggk.n);
        final int i8 = 6;
        this.I = kvlVar.G().a.Y(new ayrs(this) { // from class: gxg
            public final /* synthetic */ ClipController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gys gysVar;
                gys gysVar2;
                final int i32 = 2;
                final int i42 = 0;
                char c = 1;
                switch (i8) {
                    case 0:
                        this.a.q = ((Boolean) obj).booleanValue();
                        return;
                    case 1:
                        this.a.p = ((Boolean) obj).booleanValue();
                        return;
                    case 2:
                        this.a.r = ((Boolean) obj).booleanValue();
                        return;
                    case 3:
                        ClipController clipController = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        clipController.o = booleanValue;
                        gys gysVar3 = clipController.f;
                        if (gysVar3 != null) {
                            gysVar3.r(booleanValue);
                            return;
                        }
                        return;
                    case 4:
                        ClipController clipController2 = this.a;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        clipController2.n = booleanValue2;
                        gys gysVar4 = clipController2.f;
                        if (gysVar4 != null) {
                            gysVar4.q(booleanValue2);
                            return;
                        }
                        return;
                    case 5:
                        ClipController clipController3 = this.a;
                        ahdp ahdpVar = (ahdp) obj;
                        apwo o = ahdpVar.a().o();
                        if (o != null) {
                            clipController3.j(o, ahdpVar.b());
                            return;
                        }
                        apwo apwoVar = clipController3.u;
                        if (apwoVar == null || (2 & apwoVar.b) == 0) {
                            clipController3.y = "";
                            return;
                        } else {
                            clipController3.j(apwoVar, ahdpVar.b());
                            return;
                        }
                    case 6:
                        ClipController clipController4 = this.a;
                        ahef ahefVar = (ahef) obj;
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || ahefVar.b() == null) {
                            return;
                        }
                        clipController4.h = ahefVar.b().y();
                        return;
                    case 7:
                        ClipController clipController5 = this.a;
                        aheg ahegVar = (aheg) obj;
                        boolean z = !clipController5.u();
                        clipController5.g = ahegVar;
                        if (clipController5.k && (gysVar = clipController5.f) != null) {
                            gysVar.t(ahegVar.e());
                            if (z && clipController5.u()) {
                                clipController5.r();
                            }
                        }
                        boolean z2 = clipController5.t >= ahegVar.h();
                        clipController5.m = z2;
                        if (!clipController5.l || z2) {
                            return;
                        }
                        clipController5.k("engagement-panel-clip-view");
                        return;
                    case 8:
                        this.a.j = ((ahej) obj).e();
                        return;
                    case 9:
                        ClipController clipController6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        ajbl a = ahelVar.a();
                        if (ahelVar == clipController6.w.get()) {
                            return;
                        }
                        clipController6.w = new WeakReference(ahelVar);
                        if (a.c() != null) {
                            clipController6.i();
                            clipController6.h = a.c().y();
                            clipController6.i = ahelVar.a().a();
                            clipController6.g = a.p();
                            gys gysVar5 = clipController6.f;
                            if (gysVar5 != null) {
                                gysVar5.o(clipController6.h, clipController6.i);
                            }
                            clipController6.v = new WeakReference(ahelVar.a().k());
                            if (a.c().o() != null) {
                                ((aiqu) clipController6.v.get()).b(a.c().o().d);
                            }
                            String f = aalt.f(aoyo.b.a(), "ad_state_id");
                            aone createBuilder = aoyo.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar = (aoyo) createBuilder.instance;
                            f.getClass();
                            aoyoVar.c |= 1;
                            aoyoVar.d = f;
                            boolean z3 = clipController6.i != 0;
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar2 = (aoyo) createBuilder.instance;
                            aoyoVar2.c |= 2;
                            aoyoVar2.e = z3;
                            ((sxd) clipController6.d.get()).b(f, ((aoyo) createBuilder.build()).toByteArray());
                            if (clipController6.r) {
                                String f2 = aalt.f(audv.b.a(), "clip_engagement_panel_ad_state_entity_key");
                                aone createBuilder2 = audv.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                audv audvVar = (audv) createBuilder2.instance;
                                f2.getClass();
                                audvVar.c |= 1;
                                audvVar.d = f2;
                                boolean z4 = clipController6.i != 0;
                                createBuilder2.copyOnWrite();
                                audv audvVar2 = (audv) createBuilder2.instance;
                                audvVar2.c = 2 | audvVar2.c;
                                audvVar2.e = z4;
                                ((sxd) clipController6.d.get()).b(f2, ((audv) createBuilder2.build()).toByteArray());
                            }
                            if (clipController6.i == 0) {
                                if (!clipController6.q) {
                                    clipController6.r();
                                    return;
                                }
                                if (!clipController6.k || (gysVar2 = clipController6.f) == null) {
                                    return;
                                }
                                aixx aixxVar = clipController6.g;
                                aixx aixxVar2 = gysVar2.F;
                                if (aixxVar2 == null || aixxVar2.h() != aixxVar.h() || aixxVar2.f() != aixxVar.f()) {
                                    gysVar2.s(aixxVar);
                                    return;
                                } else {
                                    gysVar2.h.execute(new gyn(gysVar2, 0));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 10:
                        final ClipController clipController7 = this.a;
                        ahsp ahspVar = (ahsp) obj;
                        if (ahspVar.a() == 3) {
                            clipController7.s = "";
                            return;
                        }
                        if (clipController7.p && clipController7.i == 1) {
                            return;
                        }
                        if (ahspVar.a() == 0 && clipController7.e != null) {
                            bqc bqcVar = bqc.c;
                            final int c2 = c == true ? 1 : 0;
                            clipController7.q(bqcVar, new Runnable() { // from class: gxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i52 = c2;
                                    if (i52 == 0) {
                                        clipController7.k("engagement-panel-clip-view");
                                    } else if (i52 != 1) {
                                        clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                    } else {
                                        ClipController clipController8 = clipController7;
                                        ((aahd) clipController8.b.get()).a(clipController8.e);
                                    }
                                }
                            });
                        }
                        if (ahspVar.a() == 2) {
                            clipController7.i();
                            return;
                        }
                        if (ahspVar.a() == 1) {
                            clipController7.m = false;
                        }
                        clipController7.q(new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i42;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        }, new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i32;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        });
                        return;
                    case 11:
                        ClipController clipController8 = this.a;
                        ahta ahtaVar = (ahta) obj;
                        long h = clipController8.g.h();
                        clipController8.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.r(new TimelineMarker(ahtaVar.b() - h, ahtaVar.a() - h))));
                        return;
                    default:
                        this.a.x = ((Boolean) obj).booleanValue();
                        return;
                }
            }
        }, ggk.n);
        ((ojc) this.B.get()).a(this);
        ((aiee) this.c.get()).g();
        final int i9 = 4;
        this.L = ((axze) this.D.get()).a.a.Y(axzb.l).B().ay(new ayrs(this) { // from class: gxg
            public final /* synthetic */ ClipController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gys gysVar;
                gys gysVar2;
                final int i32 = 2;
                final int i42 = 0;
                char c = 1;
                switch (i9) {
                    case 0:
                        this.a.q = ((Boolean) obj).booleanValue();
                        return;
                    case 1:
                        this.a.p = ((Boolean) obj).booleanValue();
                        return;
                    case 2:
                        this.a.r = ((Boolean) obj).booleanValue();
                        return;
                    case 3:
                        ClipController clipController = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        clipController.o = booleanValue;
                        gys gysVar3 = clipController.f;
                        if (gysVar3 != null) {
                            gysVar3.r(booleanValue);
                            return;
                        }
                        return;
                    case 4:
                        ClipController clipController2 = this.a;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        clipController2.n = booleanValue2;
                        gys gysVar4 = clipController2.f;
                        if (gysVar4 != null) {
                            gysVar4.q(booleanValue2);
                            return;
                        }
                        return;
                    case 5:
                        ClipController clipController3 = this.a;
                        ahdp ahdpVar = (ahdp) obj;
                        apwo o = ahdpVar.a().o();
                        if (o != null) {
                            clipController3.j(o, ahdpVar.b());
                            return;
                        }
                        apwo apwoVar = clipController3.u;
                        if (apwoVar == null || (2 & apwoVar.b) == 0) {
                            clipController3.y = "";
                            return;
                        } else {
                            clipController3.j(apwoVar, ahdpVar.b());
                            return;
                        }
                    case 6:
                        ClipController clipController4 = this.a;
                        ahef ahefVar = (ahef) obj;
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || ahefVar.b() == null) {
                            return;
                        }
                        clipController4.h = ahefVar.b().y();
                        return;
                    case 7:
                        ClipController clipController5 = this.a;
                        aheg ahegVar = (aheg) obj;
                        boolean z = !clipController5.u();
                        clipController5.g = ahegVar;
                        if (clipController5.k && (gysVar = clipController5.f) != null) {
                            gysVar.t(ahegVar.e());
                            if (z && clipController5.u()) {
                                clipController5.r();
                            }
                        }
                        boolean z2 = clipController5.t >= ahegVar.h();
                        clipController5.m = z2;
                        if (!clipController5.l || z2) {
                            return;
                        }
                        clipController5.k("engagement-panel-clip-view");
                        return;
                    case 8:
                        this.a.j = ((ahej) obj).e();
                        return;
                    case 9:
                        ClipController clipController6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        ajbl a = ahelVar.a();
                        if (ahelVar == clipController6.w.get()) {
                            return;
                        }
                        clipController6.w = new WeakReference(ahelVar);
                        if (a.c() != null) {
                            clipController6.i();
                            clipController6.h = a.c().y();
                            clipController6.i = ahelVar.a().a();
                            clipController6.g = a.p();
                            gys gysVar5 = clipController6.f;
                            if (gysVar5 != null) {
                                gysVar5.o(clipController6.h, clipController6.i);
                            }
                            clipController6.v = new WeakReference(ahelVar.a().k());
                            if (a.c().o() != null) {
                                ((aiqu) clipController6.v.get()).b(a.c().o().d);
                            }
                            String f = aalt.f(aoyo.b.a(), "ad_state_id");
                            aone createBuilder = aoyo.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar = (aoyo) createBuilder.instance;
                            f.getClass();
                            aoyoVar.c |= 1;
                            aoyoVar.d = f;
                            boolean z3 = clipController6.i != 0;
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar2 = (aoyo) createBuilder.instance;
                            aoyoVar2.c |= 2;
                            aoyoVar2.e = z3;
                            ((sxd) clipController6.d.get()).b(f, ((aoyo) createBuilder.build()).toByteArray());
                            if (clipController6.r) {
                                String f2 = aalt.f(audv.b.a(), "clip_engagement_panel_ad_state_entity_key");
                                aone createBuilder2 = audv.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                audv audvVar = (audv) createBuilder2.instance;
                                f2.getClass();
                                audvVar.c |= 1;
                                audvVar.d = f2;
                                boolean z4 = clipController6.i != 0;
                                createBuilder2.copyOnWrite();
                                audv audvVar2 = (audv) createBuilder2.instance;
                                audvVar2.c = 2 | audvVar2.c;
                                audvVar2.e = z4;
                                ((sxd) clipController6.d.get()).b(f2, ((audv) createBuilder2.build()).toByteArray());
                            }
                            if (clipController6.i == 0) {
                                if (!clipController6.q) {
                                    clipController6.r();
                                    return;
                                }
                                if (!clipController6.k || (gysVar2 = clipController6.f) == null) {
                                    return;
                                }
                                aixx aixxVar = clipController6.g;
                                aixx aixxVar2 = gysVar2.F;
                                if (aixxVar2 == null || aixxVar2.h() != aixxVar.h() || aixxVar2.f() != aixxVar.f()) {
                                    gysVar2.s(aixxVar);
                                    return;
                                } else {
                                    gysVar2.h.execute(new gyn(gysVar2, 0));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 10:
                        final ClipController clipController7 = this.a;
                        ahsp ahspVar = (ahsp) obj;
                        if (ahspVar.a() == 3) {
                            clipController7.s = "";
                            return;
                        }
                        if (clipController7.p && clipController7.i == 1) {
                            return;
                        }
                        if (ahspVar.a() == 0 && clipController7.e != null) {
                            bqc bqcVar = bqc.c;
                            final int c2 = c == true ? 1 : 0;
                            clipController7.q(bqcVar, new Runnable() { // from class: gxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i52 = c2;
                                    if (i52 == 0) {
                                        clipController7.k("engagement-panel-clip-view");
                                    } else if (i52 != 1) {
                                        clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                    } else {
                                        ClipController clipController8 = clipController7;
                                        ((aahd) clipController8.b.get()).a(clipController8.e);
                                    }
                                }
                            });
                        }
                        if (ahspVar.a() == 2) {
                            clipController7.i();
                            return;
                        }
                        if (ahspVar.a() == 1) {
                            clipController7.m = false;
                        }
                        clipController7.q(new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i42;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        }, new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i32;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        });
                        return;
                    case 11:
                        ClipController clipController8 = this.a;
                        ahta ahtaVar = (ahta) obj;
                        long h = clipController8.g.h();
                        clipController8.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.r(new TimelineMarker(ahtaVar.b() - h, ahtaVar.a() - h))));
                        return;
                    default:
                        this.a.x = ((Boolean) obj).booleanValue();
                        return;
                }
            }
        }, ggk.n);
        final int i10 = 3;
        this.M = ((axze) this.D.get()).a.a.Y(axzb.m).B().ay(new ayrs(this) { // from class: gxg
            public final /* synthetic */ ClipController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gys gysVar;
                gys gysVar2;
                final int i32 = 2;
                final int i42 = 0;
                char c = 1;
                switch (i10) {
                    case 0:
                        this.a.q = ((Boolean) obj).booleanValue();
                        return;
                    case 1:
                        this.a.p = ((Boolean) obj).booleanValue();
                        return;
                    case 2:
                        this.a.r = ((Boolean) obj).booleanValue();
                        return;
                    case 3:
                        ClipController clipController = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        clipController.o = booleanValue;
                        gys gysVar3 = clipController.f;
                        if (gysVar3 != null) {
                            gysVar3.r(booleanValue);
                            return;
                        }
                        return;
                    case 4:
                        ClipController clipController2 = this.a;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        clipController2.n = booleanValue2;
                        gys gysVar4 = clipController2.f;
                        if (gysVar4 != null) {
                            gysVar4.q(booleanValue2);
                            return;
                        }
                        return;
                    case 5:
                        ClipController clipController3 = this.a;
                        ahdp ahdpVar = (ahdp) obj;
                        apwo o = ahdpVar.a().o();
                        if (o != null) {
                            clipController3.j(o, ahdpVar.b());
                            return;
                        }
                        apwo apwoVar = clipController3.u;
                        if (apwoVar == null || (2 & apwoVar.b) == 0) {
                            clipController3.y = "";
                            return;
                        } else {
                            clipController3.j(apwoVar, ahdpVar.b());
                            return;
                        }
                    case 6:
                        ClipController clipController4 = this.a;
                        ahef ahefVar = (ahef) obj;
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || ahefVar.b() == null) {
                            return;
                        }
                        clipController4.h = ahefVar.b().y();
                        return;
                    case 7:
                        ClipController clipController5 = this.a;
                        aheg ahegVar = (aheg) obj;
                        boolean z = !clipController5.u();
                        clipController5.g = ahegVar;
                        if (clipController5.k && (gysVar = clipController5.f) != null) {
                            gysVar.t(ahegVar.e());
                            if (z && clipController5.u()) {
                                clipController5.r();
                            }
                        }
                        boolean z2 = clipController5.t >= ahegVar.h();
                        clipController5.m = z2;
                        if (!clipController5.l || z2) {
                            return;
                        }
                        clipController5.k("engagement-panel-clip-view");
                        return;
                    case 8:
                        this.a.j = ((ahej) obj).e();
                        return;
                    case 9:
                        ClipController clipController6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        ajbl a = ahelVar.a();
                        if (ahelVar == clipController6.w.get()) {
                            return;
                        }
                        clipController6.w = new WeakReference(ahelVar);
                        if (a.c() != null) {
                            clipController6.i();
                            clipController6.h = a.c().y();
                            clipController6.i = ahelVar.a().a();
                            clipController6.g = a.p();
                            gys gysVar5 = clipController6.f;
                            if (gysVar5 != null) {
                                gysVar5.o(clipController6.h, clipController6.i);
                            }
                            clipController6.v = new WeakReference(ahelVar.a().k());
                            if (a.c().o() != null) {
                                ((aiqu) clipController6.v.get()).b(a.c().o().d);
                            }
                            String f = aalt.f(aoyo.b.a(), "ad_state_id");
                            aone createBuilder = aoyo.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar = (aoyo) createBuilder.instance;
                            f.getClass();
                            aoyoVar.c |= 1;
                            aoyoVar.d = f;
                            boolean z3 = clipController6.i != 0;
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar2 = (aoyo) createBuilder.instance;
                            aoyoVar2.c |= 2;
                            aoyoVar2.e = z3;
                            ((sxd) clipController6.d.get()).b(f, ((aoyo) createBuilder.build()).toByteArray());
                            if (clipController6.r) {
                                String f2 = aalt.f(audv.b.a(), "clip_engagement_panel_ad_state_entity_key");
                                aone createBuilder2 = audv.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                audv audvVar = (audv) createBuilder2.instance;
                                f2.getClass();
                                audvVar.c |= 1;
                                audvVar.d = f2;
                                boolean z4 = clipController6.i != 0;
                                createBuilder2.copyOnWrite();
                                audv audvVar2 = (audv) createBuilder2.instance;
                                audvVar2.c = 2 | audvVar2.c;
                                audvVar2.e = z4;
                                ((sxd) clipController6.d.get()).b(f2, ((audv) createBuilder2.build()).toByteArray());
                            }
                            if (clipController6.i == 0) {
                                if (!clipController6.q) {
                                    clipController6.r();
                                    return;
                                }
                                if (!clipController6.k || (gysVar2 = clipController6.f) == null) {
                                    return;
                                }
                                aixx aixxVar = clipController6.g;
                                aixx aixxVar2 = gysVar2.F;
                                if (aixxVar2 == null || aixxVar2.h() != aixxVar.h() || aixxVar2.f() != aixxVar.f()) {
                                    gysVar2.s(aixxVar);
                                    return;
                                } else {
                                    gysVar2.h.execute(new gyn(gysVar2, 0));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 10:
                        final ClipController clipController7 = this.a;
                        ahsp ahspVar = (ahsp) obj;
                        if (ahspVar.a() == 3) {
                            clipController7.s = "";
                            return;
                        }
                        if (clipController7.p && clipController7.i == 1) {
                            return;
                        }
                        if (ahspVar.a() == 0 && clipController7.e != null) {
                            bqc bqcVar = bqc.c;
                            final int c2 = c == true ? 1 : 0;
                            clipController7.q(bqcVar, new Runnable() { // from class: gxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i52 = c2;
                                    if (i52 == 0) {
                                        clipController7.k("engagement-panel-clip-view");
                                    } else if (i52 != 1) {
                                        clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                    } else {
                                        ClipController clipController8 = clipController7;
                                        ((aahd) clipController8.b.get()).a(clipController8.e);
                                    }
                                }
                            });
                        }
                        if (ahspVar.a() == 2) {
                            clipController7.i();
                            return;
                        }
                        if (ahspVar.a() == 1) {
                            clipController7.m = false;
                        }
                        clipController7.q(new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i42;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        }, new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i32;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        });
                        return;
                    case 11:
                        ClipController clipController8 = this.a;
                        ahta ahtaVar = (ahta) obj;
                        long h = clipController8.g.h();
                        clipController8.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.r(new TimelineMarker(ahtaVar.b() - h, ahtaVar.a() - h))));
                        return;
                    default:
                        this.a.x = ((Boolean) obj).booleanValue();
                        return;
                }
            }
        }, ggk.n);
        final int i11 = 12;
        this.N = ((axze) this.D.get()).a.a.Y(axzb.o).B().ay(new ayrs(this) { // from class: gxg
            public final /* synthetic */ ClipController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gys gysVar;
                gys gysVar2;
                final int i32 = 2;
                final int i42 = 0;
                char c = 1;
                switch (i11) {
                    case 0:
                        this.a.q = ((Boolean) obj).booleanValue();
                        return;
                    case 1:
                        this.a.p = ((Boolean) obj).booleanValue();
                        return;
                    case 2:
                        this.a.r = ((Boolean) obj).booleanValue();
                        return;
                    case 3:
                        ClipController clipController = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        clipController.o = booleanValue;
                        gys gysVar3 = clipController.f;
                        if (gysVar3 != null) {
                            gysVar3.r(booleanValue);
                            return;
                        }
                        return;
                    case 4:
                        ClipController clipController2 = this.a;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        clipController2.n = booleanValue2;
                        gys gysVar4 = clipController2.f;
                        if (gysVar4 != null) {
                            gysVar4.q(booleanValue2);
                            return;
                        }
                        return;
                    case 5:
                        ClipController clipController3 = this.a;
                        ahdp ahdpVar = (ahdp) obj;
                        apwo o = ahdpVar.a().o();
                        if (o != null) {
                            clipController3.j(o, ahdpVar.b());
                            return;
                        }
                        apwo apwoVar = clipController3.u;
                        if (apwoVar == null || (2 & apwoVar.b) == 0) {
                            clipController3.y = "";
                            return;
                        } else {
                            clipController3.j(apwoVar, ahdpVar.b());
                            return;
                        }
                    case 6:
                        ClipController clipController4 = this.a;
                        ahef ahefVar = (ahef) obj;
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || ahefVar.b() == null) {
                            return;
                        }
                        clipController4.h = ahefVar.b().y();
                        return;
                    case 7:
                        ClipController clipController5 = this.a;
                        aheg ahegVar = (aheg) obj;
                        boolean z = !clipController5.u();
                        clipController5.g = ahegVar;
                        if (clipController5.k && (gysVar = clipController5.f) != null) {
                            gysVar.t(ahegVar.e());
                            if (z && clipController5.u()) {
                                clipController5.r();
                            }
                        }
                        boolean z2 = clipController5.t >= ahegVar.h();
                        clipController5.m = z2;
                        if (!clipController5.l || z2) {
                            return;
                        }
                        clipController5.k("engagement-panel-clip-view");
                        return;
                    case 8:
                        this.a.j = ((ahej) obj).e();
                        return;
                    case 9:
                        ClipController clipController6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        ajbl a = ahelVar.a();
                        if (ahelVar == clipController6.w.get()) {
                            return;
                        }
                        clipController6.w = new WeakReference(ahelVar);
                        if (a.c() != null) {
                            clipController6.i();
                            clipController6.h = a.c().y();
                            clipController6.i = ahelVar.a().a();
                            clipController6.g = a.p();
                            gys gysVar5 = clipController6.f;
                            if (gysVar5 != null) {
                                gysVar5.o(clipController6.h, clipController6.i);
                            }
                            clipController6.v = new WeakReference(ahelVar.a().k());
                            if (a.c().o() != null) {
                                ((aiqu) clipController6.v.get()).b(a.c().o().d);
                            }
                            String f = aalt.f(aoyo.b.a(), "ad_state_id");
                            aone createBuilder = aoyo.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar = (aoyo) createBuilder.instance;
                            f.getClass();
                            aoyoVar.c |= 1;
                            aoyoVar.d = f;
                            boolean z3 = clipController6.i != 0;
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar2 = (aoyo) createBuilder.instance;
                            aoyoVar2.c |= 2;
                            aoyoVar2.e = z3;
                            ((sxd) clipController6.d.get()).b(f, ((aoyo) createBuilder.build()).toByteArray());
                            if (clipController6.r) {
                                String f2 = aalt.f(audv.b.a(), "clip_engagement_panel_ad_state_entity_key");
                                aone createBuilder2 = audv.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                audv audvVar = (audv) createBuilder2.instance;
                                f2.getClass();
                                audvVar.c |= 1;
                                audvVar.d = f2;
                                boolean z4 = clipController6.i != 0;
                                createBuilder2.copyOnWrite();
                                audv audvVar2 = (audv) createBuilder2.instance;
                                audvVar2.c = 2 | audvVar2.c;
                                audvVar2.e = z4;
                                ((sxd) clipController6.d.get()).b(f2, ((audv) createBuilder2.build()).toByteArray());
                            }
                            if (clipController6.i == 0) {
                                if (!clipController6.q) {
                                    clipController6.r();
                                    return;
                                }
                                if (!clipController6.k || (gysVar2 = clipController6.f) == null) {
                                    return;
                                }
                                aixx aixxVar = clipController6.g;
                                aixx aixxVar2 = gysVar2.F;
                                if (aixxVar2 == null || aixxVar2.h() != aixxVar.h() || aixxVar2.f() != aixxVar.f()) {
                                    gysVar2.s(aixxVar);
                                    return;
                                } else {
                                    gysVar2.h.execute(new gyn(gysVar2, 0));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 10:
                        final ClipController clipController7 = this.a;
                        ahsp ahspVar = (ahsp) obj;
                        if (ahspVar.a() == 3) {
                            clipController7.s = "";
                            return;
                        }
                        if (clipController7.p && clipController7.i == 1) {
                            return;
                        }
                        if (ahspVar.a() == 0 && clipController7.e != null) {
                            bqc bqcVar = bqc.c;
                            final int c2 = c == true ? 1 : 0;
                            clipController7.q(bqcVar, new Runnable() { // from class: gxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i52 = c2;
                                    if (i52 == 0) {
                                        clipController7.k("engagement-panel-clip-view");
                                    } else if (i52 != 1) {
                                        clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                    } else {
                                        ClipController clipController8 = clipController7;
                                        ((aahd) clipController8.b.get()).a(clipController8.e);
                                    }
                                }
                            });
                        }
                        if (ahspVar.a() == 2) {
                            clipController7.i();
                            return;
                        }
                        if (ahspVar.a() == 1) {
                            clipController7.m = false;
                        }
                        clipController7.q(new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i42;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        }, new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i32;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        });
                        return;
                    case 11:
                        ClipController clipController8 = this.a;
                        ahta ahtaVar = (ahta) obj;
                        long h = clipController8.g.h();
                        clipController8.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.r(new TimelineMarker(ahtaVar.b() - h, ahtaVar.a() - h))));
                        return;
                    default:
                        this.a.x = ((Boolean) obj).booleanValue();
                        return;
                }
            }
        }, ggk.n);
        this.O = ((axze) this.D.get()).a.a.Y(axzb.j).B().ay(new ayrs(this) { // from class: gxg
            public final /* synthetic */ ClipController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gys gysVar;
                gys gysVar2;
                final int i32 = 2;
                final int i42 = 0;
                char c = 1;
                switch (i) {
                    case 0:
                        this.a.q = ((Boolean) obj).booleanValue();
                        return;
                    case 1:
                        this.a.p = ((Boolean) obj).booleanValue();
                        return;
                    case 2:
                        this.a.r = ((Boolean) obj).booleanValue();
                        return;
                    case 3:
                        ClipController clipController = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        clipController.o = booleanValue;
                        gys gysVar3 = clipController.f;
                        if (gysVar3 != null) {
                            gysVar3.r(booleanValue);
                            return;
                        }
                        return;
                    case 4:
                        ClipController clipController2 = this.a;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        clipController2.n = booleanValue2;
                        gys gysVar4 = clipController2.f;
                        if (gysVar4 != null) {
                            gysVar4.q(booleanValue2);
                            return;
                        }
                        return;
                    case 5:
                        ClipController clipController3 = this.a;
                        ahdp ahdpVar = (ahdp) obj;
                        apwo o = ahdpVar.a().o();
                        if (o != null) {
                            clipController3.j(o, ahdpVar.b());
                            return;
                        }
                        apwo apwoVar = clipController3.u;
                        if (apwoVar == null || (2 & apwoVar.b) == 0) {
                            clipController3.y = "";
                            return;
                        } else {
                            clipController3.j(apwoVar, ahdpVar.b());
                            return;
                        }
                    case 6:
                        ClipController clipController4 = this.a;
                        ahef ahefVar = (ahef) obj;
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || ahefVar.b() == null) {
                            return;
                        }
                        clipController4.h = ahefVar.b().y();
                        return;
                    case 7:
                        ClipController clipController5 = this.a;
                        aheg ahegVar = (aheg) obj;
                        boolean z = !clipController5.u();
                        clipController5.g = ahegVar;
                        if (clipController5.k && (gysVar = clipController5.f) != null) {
                            gysVar.t(ahegVar.e());
                            if (z && clipController5.u()) {
                                clipController5.r();
                            }
                        }
                        boolean z2 = clipController5.t >= ahegVar.h();
                        clipController5.m = z2;
                        if (!clipController5.l || z2) {
                            return;
                        }
                        clipController5.k("engagement-panel-clip-view");
                        return;
                    case 8:
                        this.a.j = ((ahej) obj).e();
                        return;
                    case 9:
                        ClipController clipController6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        ajbl a = ahelVar.a();
                        if (ahelVar == clipController6.w.get()) {
                            return;
                        }
                        clipController6.w = new WeakReference(ahelVar);
                        if (a.c() != null) {
                            clipController6.i();
                            clipController6.h = a.c().y();
                            clipController6.i = ahelVar.a().a();
                            clipController6.g = a.p();
                            gys gysVar5 = clipController6.f;
                            if (gysVar5 != null) {
                                gysVar5.o(clipController6.h, clipController6.i);
                            }
                            clipController6.v = new WeakReference(ahelVar.a().k());
                            if (a.c().o() != null) {
                                ((aiqu) clipController6.v.get()).b(a.c().o().d);
                            }
                            String f = aalt.f(aoyo.b.a(), "ad_state_id");
                            aone createBuilder = aoyo.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar = (aoyo) createBuilder.instance;
                            f.getClass();
                            aoyoVar.c |= 1;
                            aoyoVar.d = f;
                            boolean z3 = clipController6.i != 0;
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar2 = (aoyo) createBuilder.instance;
                            aoyoVar2.c |= 2;
                            aoyoVar2.e = z3;
                            ((sxd) clipController6.d.get()).b(f, ((aoyo) createBuilder.build()).toByteArray());
                            if (clipController6.r) {
                                String f2 = aalt.f(audv.b.a(), "clip_engagement_panel_ad_state_entity_key");
                                aone createBuilder2 = audv.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                audv audvVar = (audv) createBuilder2.instance;
                                f2.getClass();
                                audvVar.c |= 1;
                                audvVar.d = f2;
                                boolean z4 = clipController6.i != 0;
                                createBuilder2.copyOnWrite();
                                audv audvVar2 = (audv) createBuilder2.instance;
                                audvVar2.c = 2 | audvVar2.c;
                                audvVar2.e = z4;
                                ((sxd) clipController6.d.get()).b(f2, ((audv) createBuilder2.build()).toByteArray());
                            }
                            if (clipController6.i == 0) {
                                if (!clipController6.q) {
                                    clipController6.r();
                                    return;
                                }
                                if (!clipController6.k || (gysVar2 = clipController6.f) == null) {
                                    return;
                                }
                                aixx aixxVar = clipController6.g;
                                aixx aixxVar2 = gysVar2.F;
                                if (aixxVar2 == null || aixxVar2.h() != aixxVar.h() || aixxVar2.f() != aixxVar.f()) {
                                    gysVar2.s(aixxVar);
                                    return;
                                } else {
                                    gysVar2.h.execute(new gyn(gysVar2, 0));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 10:
                        final ClipController clipController7 = this.a;
                        ahsp ahspVar = (ahsp) obj;
                        if (ahspVar.a() == 3) {
                            clipController7.s = "";
                            return;
                        }
                        if (clipController7.p && clipController7.i == 1) {
                            return;
                        }
                        if (ahspVar.a() == 0 && clipController7.e != null) {
                            bqc bqcVar = bqc.c;
                            final int c2 = c == true ? 1 : 0;
                            clipController7.q(bqcVar, new Runnable() { // from class: gxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i52 = c2;
                                    if (i52 == 0) {
                                        clipController7.k("engagement-panel-clip-view");
                                    } else if (i52 != 1) {
                                        clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                    } else {
                                        ClipController clipController8 = clipController7;
                                        ((aahd) clipController8.b.get()).a(clipController8.e);
                                    }
                                }
                            });
                        }
                        if (ahspVar.a() == 2) {
                            clipController7.i();
                            return;
                        }
                        if (ahspVar.a() == 1) {
                            clipController7.m = false;
                        }
                        clipController7.q(new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i42;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        }, new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i32;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        });
                        return;
                    case 11:
                        ClipController clipController8 = this.a;
                        ahta ahtaVar = (ahta) obj;
                        long h = clipController8.g.h();
                        clipController8.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.r(new TimelineMarker(ahtaVar.b() - h, ahtaVar.a() - h))));
                        return;
                    default:
                        this.a.x = ((Boolean) obj).booleanValue();
                        return;
                }
            }
        }, ggk.n);
        final int i12 = 0;
        this.P = ((axze) this.D.get()).a.a.Y(axzb.i).B().ay(new ayrs(this) { // from class: gxg
            public final /* synthetic */ ClipController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gys gysVar;
                gys gysVar2;
                final int i32 = 2;
                final int i42 = 0;
                char c = 1;
                switch (i12) {
                    case 0:
                        this.a.q = ((Boolean) obj).booleanValue();
                        return;
                    case 1:
                        this.a.p = ((Boolean) obj).booleanValue();
                        return;
                    case 2:
                        this.a.r = ((Boolean) obj).booleanValue();
                        return;
                    case 3:
                        ClipController clipController = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        clipController.o = booleanValue;
                        gys gysVar3 = clipController.f;
                        if (gysVar3 != null) {
                            gysVar3.r(booleanValue);
                            return;
                        }
                        return;
                    case 4:
                        ClipController clipController2 = this.a;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        clipController2.n = booleanValue2;
                        gys gysVar4 = clipController2.f;
                        if (gysVar4 != null) {
                            gysVar4.q(booleanValue2);
                            return;
                        }
                        return;
                    case 5:
                        ClipController clipController3 = this.a;
                        ahdp ahdpVar = (ahdp) obj;
                        apwo o = ahdpVar.a().o();
                        if (o != null) {
                            clipController3.j(o, ahdpVar.b());
                            return;
                        }
                        apwo apwoVar = clipController3.u;
                        if (apwoVar == null || (2 & apwoVar.b) == 0) {
                            clipController3.y = "";
                            return;
                        } else {
                            clipController3.j(apwoVar, ahdpVar.b());
                            return;
                        }
                    case 6:
                        ClipController clipController4 = this.a;
                        ahef ahefVar = (ahef) obj;
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || ahefVar.b() == null) {
                            return;
                        }
                        clipController4.h = ahefVar.b().y();
                        return;
                    case 7:
                        ClipController clipController5 = this.a;
                        aheg ahegVar = (aheg) obj;
                        boolean z = !clipController5.u();
                        clipController5.g = ahegVar;
                        if (clipController5.k && (gysVar = clipController5.f) != null) {
                            gysVar.t(ahegVar.e());
                            if (z && clipController5.u()) {
                                clipController5.r();
                            }
                        }
                        boolean z2 = clipController5.t >= ahegVar.h();
                        clipController5.m = z2;
                        if (!clipController5.l || z2) {
                            return;
                        }
                        clipController5.k("engagement-panel-clip-view");
                        return;
                    case 8:
                        this.a.j = ((ahej) obj).e();
                        return;
                    case 9:
                        ClipController clipController6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        ajbl a = ahelVar.a();
                        if (ahelVar == clipController6.w.get()) {
                            return;
                        }
                        clipController6.w = new WeakReference(ahelVar);
                        if (a.c() != null) {
                            clipController6.i();
                            clipController6.h = a.c().y();
                            clipController6.i = ahelVar.a().a();
                            clipController6.g = a.p();
                            gys gysVar5 = clipController6.f;
                            if (gysVar5 != null) {
                                gysVar5.o(clipController6.h, clipController6.i);
                            }
                            clipController6.v = new WeakReference(ahelVar.a().k());
                            if (a.c().o() != null) {
                                ((aiqu) clipController6.v.get()).b(a.c().o().d);
                            }
                            String f = aalt.f(aoyo.b.a(), "ad_state_id");
                            aone createBuilder = aoyo.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar = (aoyo) createBuilder.instance;
                            f.getClass();
                            aoyoVar.c |= 1;
                            aoyoVar.d = f;
                            boolean z3 = clipController6.i != 0;
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar2 = (aoyo) createBuilder.instance;
                            aoyoVar2.c |= 2;
                            aoyoVar2.e = z3;
                            ((sxd) clipController6.d.get()).b(f, ((aoyo) createBuilder.build()).toByteArray());
                            if (clipController6.r) {
                                String f2 = aalt.f(audv.b.a(), "clip_engagement_panel_ad_state_entity_key");
                                aone createBuilder2 = audv.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                audv audvVar = (audv) createBuilder2.instance;
                                f2.getClass();
                                audvVar.c |= 1;
                                audvVar.d = f2;
                                boolean z4 = clipController6.i != 0;
                                createBuilder2.copyOnWrite();
                                audv audvVar2 = (audv) createBuilder2.instance;
                                audvVar2.c = 2 | audvVar2.c;
                                audvVar2.e = z4;
                                ((sxd) clipController6.d.get()).b(f2, ((audv) createBuilder2.build()).toByteArray());
                            }
                            if (clipController6.i == 0) {
                                if (!clipController6.q) {
                                    clipController6.r();
                                    return;
                                }
                                if (!clipController6.k || (gysVar2 = clipController6.f) == null) {
                                    return;
                                }
                                aixx aixxVar = clipController6.g;
                                aixx aixxVar2 = gysVar2.F;
                                if (aixxVar2 == null || aixxVar2.h() != aixxVar.h() || aixxVar2.f() != aixxVar.f()) {
                                    gysVar2.s(aixxVar);
                                    return;
                                } else {
                                    gysVar2.h.execute(new gyn(gysVar2, 0));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 10:
                        final ClipController clipController7 = this.a;
                        ahsp ahspVar = (ahsp) obj;
                        if (ahspVar.a() == 3) {
                            clipController7.s = "";
                            return;
                        }
                        if (clipController7.p && clipController7.i == 1) {
                            return;
                        }
                        if (ahspVar.a() == 0 && clipController7.e != null) {
                            bqc bqcVar = bqc.c;
                            final int c2 = c == true ? 1 : 0;
                            clipController7.q(bqcVar, new Runnable() { // from class: gxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i52 = c2;
                                    if (i52 == 0) {
                                        clipController7.k("engagement-panel-clip-view");
                                    } else if (i52 != 1) {
                                        clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                    } else {
                                        ClipController clipController8 = clipController7;
                                        ((aahd) clipController8.b.get()).a(clipController8.e);
                                    }
                                }
                            });
                        }
                        if (ahspVar.a() == 2) {
                            clipController7.i();
                            return;
                        }
                        if (ahspVar.a() == 1) {
                            clipController7.m = false;
                        }
                        clipController7.q(new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i42;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        }, new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i32;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        });
                        return;
                    case 11:
                        ClipController clipController8 = this.a;
                        ahta ahtaVar = (ahta) obj;
                        long h = clipController8.g.h();
                        clipController8.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.r(new TimelineMarker(ahtaVar.b() - h, ahtaVar.a() - h))));
                        return;
                    default:
                        this.a.x = ((Boolean) obj).booleanValue();
                        return;
                }
            }
        }, ggk.n);
        final int i13 = 2;
        this.Q = ((axze) this.D.get()).a.a.Y(axzb.n).B().ay(new ayrs(this) { // from class: gxg
            public final /* synthetic */ ClipController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gys gysVar;
                gys gysVar2;
                final int i32 = 2;
                final int i42 = 0;
                char c = 1;
                switch (i13) {
                    case 0:
                        this.a.q = ((Boolean) obj).booleanValue();
                        return;
                    case 1:
                        this.a.p = ((Boolean) obj).booleanValue();
                        return;
                    case 2:
                        this.a.r = ((Boolean) obj).booleanValue();
                        return;
                    case 3:
                        ClipController clipController = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        clipController.o = booleanValue;
                        gys gysVar3 = clipController.f;
                        if (gysVar3 != null) {
                            gysVar3.r(booleanValue);
                            return;
                        }
                        return;
                    case 4:
                        ClipController clipController2 = this.a;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        clipController2.n = booleanValue2;
                        gys gysVar4 = clipController2.f;
                        if (gysVar4 != null) {
                            gysVar4.q(booleanValue2);
                            return;
                        }
                        return;
                    case 5:
                        ClipController clipController3 = this.a;
                        ahdp ahdpVar = (ahdp) obj;
                        apwo o = ahdpVar.a().o();
                        if (o != null) {
                            clipController3.j(o, ahdpVar.b());
                            return;
                        }
                        apwo apwoVar = clipController3.u;
                        if (apwoVar == null || (2 & apwoVar.b) == 0) {
                            clipController3.y = "";
                            return;
                        } else {
                            clipController3.j(apwoVar, ahdpVar.b());
                            return;
                        }
                    case 6:
                        ClipController clipController4 = this.a;
                        ahef ahefVar = (ahef) obj;
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || ahefVar.b() == null) {
                            return;
                        }
                        clipController4.h = ahefVar.b().y();
                        return;
                    case 7:
                        ClipController clipController5 = this.a;
                        aheg ahegVar = (aheg) obj;
                        boolean z = !clipController5.u();
                        clipController5.g = ahegVar;
                        if (clipController5.k && (gysVar = clipController5.f) != null) {
                            gysVar.t(ahegVar.e());
                            if (z && clipController5.u()) {
                                clipController5.r();
                            }
                        }
                        boolean z2 = clipController5.t >= ahegVar.h();
                        clipController5.m = z2;
                        if (!clipController5.l || z2) {
                            return;
                        }
                        clipController5.k("engagement-panel-clip-view");
                        return;
                    case 8:
                        this.a.j = ((ahej) obj).e();
                        return;
                    case 9:
                        ClipController clipController6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        ajbl a = ahelVar.a();
                        if (ahelVar == clipController6.w.get()) {
                            return;
                        }
                        clipController6.w = new WeakReference(ahelVar);
                        if (a.c() != null) {
                            clipController6.i();
                            clipController6.h = a.c().y();
                            clipController6.i = ahelVar.a().a();
                            clipController6.g = a.p();
                            gys gysVar5 = clipController6.f;
                            if (gysVar5 != null) {
                                gysVar5.o(clipController6.h, clipController6.i);
                            }
                            clipController6.v = new WeakReference(ahelVar.a().k());
                            if (a.c().o() != null) {
                                ((aiqu) clipController6.v.get()).b(a.c().o().d);
                            }
                            String f = aalt.f(aoyo.b.a(), "ad_state_id");
                            aone createBuilder = aoyo.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar = (aoyo) createBuilder.instance;
                            f.getClass();
                            aoyoVar.c |= 1;
                            aoyoVar.d = f;
                            boolean z3 = clipController6.i != 0;
                            createBuilder.copyOnWrite();
                            aoyo aoyoVar2 = (aoyo) createBuilder.instance;
                            aoyoVar2.c |= 2;
                            aoyoVar2.e = z3;
                            ((sxd) clipController6.d.get()).b(f, ((aoyo) createBuilder.build()).toByteArray());
                            if (clipController6.r) {
                                String f2 = aalt.f(audv.b.a(), "clip_engagement_panel_ad_state_entity_key");
                                aone createBuilder2 = audv.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                audv audvVar = (audv) createBuilder2.instance;
                                f2.getClass();
                                audvVar.c |= 1;
                                audvVar.d = f2;
                                boolean z4 = clipController6.i != 0;
                                createBuilder2.copyOnWrite();
                                audv audvVar2 = (audv) createBuilder2.instance;
                                audvVar2.c = 2 | audvVar2.c;
                                audvVar2.e = z4;
                                ((sxd) clipController6.d.get()).b(f2, ((audv) createBuilder2.build()).toByteArray());
                            }
                            if (clipController6.i == 0) {
                                if (!clipController6.q) {
                                    clipController6.r();
                                    return;
                                }
                                if (!clipController6.k || (gysVar2 = clipController6.f) == null) {
                                    return;
                                }
                                aixx aixxVar = clipController6.g;
                                aixx aixxVar2 = gysVar2.F;
                                if (aixxVar2 == null || aixxVar2.h() != aixxVar.h() || aixxVar2.f() != aixxVar.f()) {
                                    gysVar2.s(aixxVar);
                                    return;
                                } else {
                                    gysVar2.h.execute(new gyn(gysVar2, 0));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    case 10:
                        final ClipController clipController7 = this.a;
                        ahsp ahspVar = (ahsp) obj;
                        if (ahspVar.a() == 3) {
                            clipController7.s = "";
                            return;
                        }
                        if (clipController7.p && clipController7.i == 1) {
                            return;
                        }
                        if (ahspVar.a() == 0 && clipController7.e != null) {
                            bqc bqcVar = bqc.c;
                            final int c2 = c == true ? 1 : 0;
                            clipController7.q(bqcVar, new Runnable() { // from class: gxh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i52 = c2;
                                    if (i52 == 0) {
                                        clipController7.k("engagement-panel-clip-view");
                                    } else if (i52 != 1) {
                                        clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                    } else {
                                        ClipController clipController8 = clipController7;
                                        ((aahd) clipController8.b.get()).a(clipController8.e);
                                    }
                                }
                            });
                        }
                        if (ahspVar.a() == 2) {
                            clipController7.i();
                            return;
                        }
                        if (ahspVar.a() == 1) {
                            clipController7.m = false;
                        }
                        clipController7.q(new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i42;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        }, new Runnable() { // from class: gxh
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i32;
                                if (i52 == 0) {
                                    clipController7.k("engagement-panel-clip-view");
                                } else if (i52 != 1) {
                                    clipController7.k("engagement-panel-clip-view", "engagement-panel-clip-create");
                                } else {
                                    ClipController clipController8 = clipController7;
                                    ((aahd) clipController8.b.get()).a(clipController8.e);
                                }
                            }
                        });
                        return;
                    case 11:
                        ClipController clipController8 = this.a;
                        ahta ahtaVar = (ahta) obj;
                        long h = clipController8.g.h();
                        clipController8.a.d(new ahyp(ahyo.CLIP_VIEWING, amru.r(new TimelineMarker(ahtaVar.b() - h, ahtaVar.a() - h))));
                        return;
                    default:
                        this.a.x = ((Boolean) obj).booleanValue();
                        return;
                }
            }
        }, ggk.n);
    }

    @Override // defpackage.gxr
    public final void p() {
        this.l = true;
    }

    public final void r() {
        gys gysVar;
        if (!this.k || (gysVar = this.f) == null) {
            return;
        }
        gysVar.s(gxn.e(g(gysVar.d), this.g.h(), this.g.f()));
    }

    @Override // defpackage.gxr
    public final boolean s() {
        return this.R;
    }

    @Override // defpackage.gxr
    public final boolean t() {
        return this.m;
    }

    public final boolean u() {
        return this.g.f() > 0;
    }

    public final void q(Runnable runnable, Runnable runnable2) {
        gys gysVar;
        if (this.n && (gysVar = this.f) != null && (gysVar.D || gysVar.E)) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }
}
