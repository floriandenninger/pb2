package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
import defpackage.aahd;
import defpackage.ahut;
import defpackage.ahuu;
import defpackage.ahwj;
import defpackage.ahxn;
import defpackage.ahya;
import defpackage.ahyz;
import defpackage.aick;
import defpackage.aivi;
import defpackage.alta;
import defpackage.alux;
import defpackage.aqrt;
import defpackage.aypy;
import defpackage.ayqr;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azre;
import defpackage.azrh;
import defpackage.azrr;
import defpackage.oba;
import defpackage.rql;
import defpackage.xie;
import defpackage.zbg;
import defpackage.zfi;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bn {
    public static final /* synthetic */ int W = 0;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c A;
    public final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.h B;
    public final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c C;
    public final azrr D;
    public final ayqx E;
    public boolean F;
    public final com.google.android.apps.youtube.embeddedplayer.service.jar.l G;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b H;
    public final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e I;

    /* renamed from: J, reason: collision with root package name */
    public final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b f165J;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b K;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b L;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b M;
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e N;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b O;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b P;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b Q;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b R;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e S;
    public final com.google.android.apps.youtube.embeddedplayer.service.databus.shared.b T;
    public final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e U;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.g V;
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.d X;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.g Y;
    private final com.google.android.apps.youtube.embeddedplayer.service.jar.c Z;
    public Context a;
    private final rql aa;
    public aahd b;
    public com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c d;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d e;
    public com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d f;
    public final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.i g;
    public final alux h;
    public boolean j;
    public boolean k;
    public boolean l;
    public final Handler m;
    public final FrameLayout n;
    protected final aivi o;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ak p;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.n q;
    protected final xie r;
    protected final ahwj s;
    protected final ahxn t;
    protected final ahya u;
    protected final ahyz v;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.d w;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.m x;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.j y;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.f z;
    public IApiPlayerService c = new DisconnectedApiPlayerService();
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b i = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;

    static {
        zga.k("YouTubeAndroidPlayerAPI");
    }

    public bn(Context context, com.google.android.apps.youtube.embeddedplayer.service.jar.a aVar, com.google.android.apps.youtube.embeddedplayer.service.jar.l lVar, com.google.android.apps.youtube.embeddedplayer.service.jar.k kVar, com.google.android.apps.youtube.embeddedplayer.service.jar.e eVar, com.google.android.apps.youtube.embeddedplayer.service.jar.o oVar, com.google.android.apps.youtube.embeddedplayer.service.jar.k kVar2, final aypy aypyVar, alux aluxVar, byte[] bArr) {
        azrr ab = azrr.ab();
        this.D = ab;
        this.a = context;
        aVar.getClass();
        lVar.getClass();
        this.G = lVar;
        aluxVar.getClass();
        this.h = aluxVar;
        aivi aiviVar = new aivi(context);
        this.o = aiviVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.addView(aiviVar);
        Handler handler = new Handler(context.getMainLooper());
        this.m = handler;
        com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.d dVar = new com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.d(handler);
        this.X = dVar;
        this.U = new com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e(handler);
        com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.g gVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.g(0);
        this.Y = gVar;
        com.google.android.apps.youtube.embeddedplayer.service.jar.c cVar = com.google.android.apps.youtube.embeddedplayer.service.jar.c.a;
        this.Z = cVar;
        this.E = cVar.b.ai(azre.c()).ab(ayqr.a()).ax(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.bb
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ak akVar;
                bn bnVar = bn.this;
                aqrt aqrtVar = (aqrt) obj;
                if (aqrtVar == null || (akVar = bnVar.p) == null) {
                    return;
                }
                boolean z = aqrtVar.f;
                akVar.x = z;
                aick aickVar = akVar.w;
                if (aickVar != null) {
                    aickVar.c(z);
                }
            }
        });
        com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.g gVar2 = new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.g(1, null);
        this.V = gVar2;
        com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.d dVar2 = new com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.d(aiviVar, new bc(this));
        this.C = dVar2;
        com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.h b = com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.h.b(aiviVar, aVar, new bm(this), dVar2);
        this.B = b;
        b.p.d(gVar.a.B().ax(new com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.e(b, 1)));
        final zbg zbgVar = new zbg(aVar.d(), aVar.c(), aiviVar);
        com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c cVar2 = new com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c(context, aVar, new bl(this), zbgVar);
        cVar2.b.e(cVar2);
        aiviVar.g(cVar2.b);
        this.A = cVar2;
        rql rqlVar = new rql();
        this.aa = rqlVar;
        this.N = com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e.d(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ak.a, handler, rqlVar);
        final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.m mVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.m(context);
        mVar.f = com.google.android.apps.youtube.embeddedplayer.service.jar.c.a.b.ai(azre.c()).ab(ayqr.a()).ax(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.k
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                final m mVar2 = m.this;
                aypy aypyVar2 = aypyVar;
                mVar2.g = ((aqrt) obj).l;
                if (mVar2.d == null) {
                    mVar2.d = aypyVar2.B().ab(ayqr.a()).ax(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.j
                        @Override // defpackage.ayrs
                        public final void a(Object obj2) {
                            m mVar3 = m.this;
                            mVar3.e = (com.google.android.apps.youtube.embeddedplayer.service.model.d) obj2;
                            mVar3.Y();
                        }
                    });
                }
            }
        });
        this.x = mVar;
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ak F = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ak.F(context, b, new com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.e(rqlVar, null), gVar2.a, ab, oba.G(context, handler, ab.l(), aiviVar));
        this.p = F;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.aw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bn bnVar = bn.this;
                bnVar.x.m();
                bnVar.p.ng();
            }
        };
        azrh azrhVar = gVar.a;
        azrh azrhVar2 = gVar2.a;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.d dVar3 = new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.d(context, onClickListener);
        dVar3.l = MutedAutoplayState.a;
        dVar3.m = 0;
        dVar3.e = new Handler(new Handler.Callback() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.a
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                d dVar4 = d.this;
                if (message.what != 1) {
                    return false;
                }
                if (!dVar4.np()) {
                    return true;
                }
                dVar4.a.setVisibility(8);
                return true;
            }
        });
        dVar3.c.g(azrhVar.B().ax(new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.c(dVar3, 1)), azrhVar2.B().ax(new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.c(dVar3, 0)));
        this.w = dVar3;
        com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.j jVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.j(context);
        this.y = jVar;
        try {
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.n nVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.n(context);
            this.q = nVar;
            nVar.k(ab);
            xie xieVar = new xie(context);
            this.r = xieVar;
            ahwj ahwjVar = new ahwj(context);
            this.s = ahwjVar;
            ahxn ahxnVar = new ahxn(context);
            this.t = ahxnVar;
            ahya ahyaVar = new ahya(context);
            this.u = ahyaVar;
            ahyz ahyzVar = new ahyz(context);
            this.v = ahyzVar;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.f fVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.f(context);
            this.z = fVar;
            aiviVar.pE(ahyaVar, ahxnVar, ahyzVar, xieVar, ahwjVar);
            aiviVar.setFocusable(true);
            com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.i i = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.i.i(context, new bf(this));
            this.g = i;
            this.I = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e(i, context, handler);
            aiviVar.h(i);
            this.H = new com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b(new zfi() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ay
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    zbg zbgVar2 = zbg.this;
                    Boolean bool = (Boolean) obj;
                    int i2 = bn.W;
                    if (bool != null) {
                        zbgVar2.j(bool.booleanValue());
                    }
                }
            }, aiviVar, handler);
            this.f165J = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b(i, handler);
            this.K = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b(nVar, handler);
            this.L = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b(xieVar, handler);
            this.M = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b(F, F, F, F, F, F, F, F, F, F, handler);
            this.O = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b(ahwjVar, handler);
            this.P = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b(ahxnVar, handler);
            this.Q = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b(ahyaVar, handler);
            this.R = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b(ahyzVar, handler);
            this.S = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e(fVar, handler);
            this.T = new com.google.android.apps.youtube.embeddedplayer.service.databus.shared.b(dVar);
            final int i2 = 1;
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.AD_EVENT_DATA, eVar);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.RELATED_VIDEOS_SCREEN, jVar);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.MUTED_AUTOPLAY_STATE, gVar);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.FRAGMENT_KEY_DATA, kVar);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.PLAYBACK_EVENT_DATA, oVar);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.ERROR_DATA, kVar2);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.HOT_CONFIG_DATA, cVar);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.PLAYER_VIEW_MODE, gVar2);
            eVar.a = new be(this);
            mVar.mZ(new ahut(this) { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ba
                public final /* synthetic */ bn a;

                {
                    this.a = this;
                }

                @Override // defpackage.ahut
                public final void d(ahuu ahuuVar, View view) {
                    int i3 = i2;
                    if (i3 == 0) {
                        bn bnVar = this.a;
                        bnVar.o.addView(view, bnVar.q.c());
                        return;
                    }
                    if (i3 == 1) {
                        bn bnVar2 = this.a;
                        bnVar2.o.addView(view, 1, bnVar2.x.c());
                        return;
                    }
                    if (i3 == 2) {
                        bn bnVar3 = this.a;
                        bnVar3.o.addView(view, bnVar3.w.c());
                        return;
                    }
                    if (i3 != 3) {
                        if (i3 != 4) {
                            bn bnVar4 = this.a;
                            bnVar4.o.addView(view, bnVar4.z.c());
                            return;
                        } else {
                            bn bnVar5 = this.a;
                            bnVar5.o.addView(view, bnVar5.y.c());
                            return;
                        }
                    }
                    bn bnVar6 = this.a;
                    int childCount = bnVar6.o.getChildCount();
                    if (bnVar6.q.np()) {
                        childCount = Math.min(childCount, bnVar6.o.indexOfChild(bnVar6.q.ld()));
                    }
                    if (bnVar6.y.np()) {
                        childCount = Math.min(childCount, bnVar6.o.indexOfChild(bnVar6.y.ld()));
                    }
                    bnVar6.o.addView(view, childCount, bnVar6.p.c());
                    if (bnVar6.p.np()) {
                        bnVar6.q.q(bnVar6.p.A());
                        bnVar6.q.s(bnVar6.p.G());
                    }
                }
            });
            final int i3 = 0;
            nVar.mZ(new ahut(this) { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ba
                public final /* synthetic */ bn a;

                {
                    this.a = this;
                }

                @Override // defpackage.ahut
                public final void d(ahuu ahuuVar, View view) {
                    int i32 = i3;
                    if (i32 == 0) {
                        bn bnVar = this.a;
                        bnVar.o.addView(view, bnVar.q.c());
                        return;
                    }
                    if (i32 == 1) {
                        bn bnVar2 = this.a;
                        bnVar2.o.addView(view, 1, bnVar2.x.c());
                        return;
                    }
                    if (i32 == 2) {
                        bn bnVar3 = this.a;
                        bnVar3.o.addView(view, bnVar3.w.c());
                        return;
                    }
                    if (i32 != 3) {
                        if (i32 != 4) {
                            bn bnVar4 = this.a;
                            bnVar4.o.addView(view, bnVar4.z.c());
                            return;
                        } else {
                            bn bnVar5 = this.a;
                            bnVar5.o.addView(view, bnVar5.y.c());
                            return;
                        }
                    }
                    bn bnVar6 = this.a;
                    int childCount = bnVar6.o.getChildCount();
                    if (bnVar6.q.np()) {
                        childCount = Math.min(childCount, bnVar6.o.indexOfChild(bnVar6.q.ld()));
                    }
                    if (bnVar6.y.np()) {
                        childCount = Math.min(childCount, bnVar6.o.indexOfChild(bnVar6.y.ld()));
                    }
                    bnVar6.o.addView(view, childCount, bnVar6.p.c());
                    if (bnVar6.p.np()) {
                        bnVar6.q.q(bnVar6.p.A());
                        bnVar6.q.s(bnVar6.p.G());
                    }
                }
            });
            final int i4 = 2;
            dVar3.mZ(new ahut(this) { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ba
                public final /* synthetic */ bn a;

                {
                    this.a = this;
                }

                @Override // defpackage.ahut
                public final void d(ahuu ahuuVar, View view) {
                    int i32 = i4;
                    if (i32 == 0) {
                        bn bnVar = this.a;
                        bnVar.o.addView(view, bnVar.q.c());
                        return;
                    }
                    if (i32 == 1) {
                        bn bnVar2 = this.a;
                        bnVar2.o.addView(view, 1, bnVar2.x.c());
                        return;
                    }
                    if (i32 == 2) {
                        bn bnVar3 = this.a;
                        bnVar3.o.addView(view, bnVar3.w.c());
                        return;
                    }
                    if (i32 != 3) {
                        if (i32 != 4) {
                            bn bnVar4 = this.a;
                            bnVar4.o.addView(view, bnVar4.z.c());
                            return;
                        } else {
                            bn bnVar5 = this.a;
                            bnVar5.o.addView(view, bnVar5.y.c());
                            return;
                        }
                    }
                    bn bnVar6 = this.a;
                    int childCount = bnVar6.o.getChildCount();
                    if (bnVar6.q.np()) {
                        childCount = Math.min(childCount, bnVar6.o.indexOfChild(bnVar6.q.ld()));
                    }
                    if (bnVar6.y.np()) {
                        childCount = Math.min(childCount, bnVar6.o.indexOfChild(bnVar6.y.ld()));
                    }
                    bnVar6.o.addView(view, childCount, bnVar6.p.c());
                    if (bnVar6.p.np()) {
                        bnVar6.q.q(bnVar6.p.A());
                        bnVar6.q.s(bnVar6.p.G());
                    }
                }
            });
            final int i5 = 3;
            F.mZ(new ahut(this) { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ba
                public final /* synthetic */ bn a;

                {
                    this.a = this;
                }

                @Override // defpackage.ahut
                public final void d(ahuu ahuuVar, View view) {
                    int i32 = i5;
                    if (i32 == 0) {
                        bn bnVar = this.a;
                        bnVar.o.addView(view, bnVar.q.c());
                        return;
                    }
                    if (i32 == 1) {
                        bn bnVar2 = this.a;
                        bnVar2.o.addView(view, 1, bnVar2.x.c());
                        return;
                    }
                    if (i32 == 2) {
                        bn bnVar3 = this.a;
                        bnVar3.o.addView(view, bnVar3.w.c());
                        return;
                    }
                    if (i32 != 3) {
                        if (i32 != 4) {
                            bn bnVar4 = this.a;
                            bnVar4.o.addView(view, bnVar4.z.c());
                            return;
                        } else {
                            bn bnVar5 = this.a;
                            bnVar5.o.addView(view, bnVar5.y.c());
                            return;
                        }
                    }
                    bn bnVar6 = this.a;
                    int childCount = bnVar6.o.getChildCount();
                    if (bnVar6.q.np()) {
                        childCount = Math.min(childCount, bnVar6.o.indexOfChild(bnVar6.q.ld()));
                    }
                    if (bnVar6.y.np()) {
                        childCount = Math.min(childCount, bnVar6.o.indexOfChild(bnVar6.y.ld()));
                    }
                    bnVar6.o.addView(view, childCount, bnVar6.p.c());
                    if (bnVar6.p.np()) {
                        bnVar6.q.q(bnVar6.p.A());
                        bnVar6.q.s(bnVar6.p.G());
                    }
                }
            });
            final int i6 = 4;
            jVar.mZ(new ahut(this) { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ba
                public final /* synthetic */ bn a;

                {
                    this.a = this;
                }

                @Override // defpackage.ahut
                public final void d(ahuu ahuuVar, View view) {
                    int i32 = i6;
                    if (i32 == 0) {
                        bn bnVar = this.a;
                        bnVar.o.addView(view, bnVar.q.c());
                        return;
                    }
                    if (i32 == 1) {
                        bn bnVar2 = this.a;
                        bnVar2.o.addView(view, 1, bnVar2.x.c());
                        return;
                    }
                    if (i32 == 2) {
                        bn bnVar3 = this.a;
                        bnVar3.o.addView(view, bnVar3.w.c());
                        return;
                    }
                    if (i32 != 3) {
                        if (i32 != 4) {
                            bn bnVar4 = this.a;
                            bnVar4.o.addView(view, bnVar4.z.c());
                            return;
                        } else {
                            bn bnVar5 = this.a;
                            bnVar5.o.addView(view, bnVar5.y.c());
                            return;
                        }
                    }
                    bn bnVar6 = this.a;
                    int childCount = bnVar6.o.getChildCount();
                    if (bnVar6.q.np()) {
                        childCount = Math.min(childCount, bnVar6.o.indexOfChild(bnVar6.q.ld()));
                    }
                    if (bnVar6.y.np()) {
                        childCount = Math.min(childCount, bnVar6.o.indexOfChild(bnVar6.y.ld()));
                    }
                    bnVar6.o.addView(view, childCount, bnVar6.p.c());
                    if (bnVar6.p.np()) {
                        bnVar6.q.q(bnVar6.p.A());
                        bnVar6.q.s(bnVar6.p.G());
                    }
                }
            });
            final int i7 = 5;
            fVar.mZ(new ahut(this) { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ba
                public final /* synthetic */ bn a;

                {
                    this.a = this;
                }

                @Override // defpackage.ahut
                public final void d(ahuu ahuuVar, View view) {
                    int i32 = i7;
                    if (i32 == 0) {
                        bn bnVar = this.a;
                        bnVar.o.addView(view, bnVar.q.c());
                        return;
                    }
                    if (i32 == 1) {
                        bn bnVar2 = this.a;
                        bnVar2.o.addView(view, 1, bnVar2.x.c());
                        return;
                    }
                    if (i32 == 2) {
                        bn bnVar3 = this.a;
                        bnVar3.o.addView(view, bnVar3.w.c());
                        return;
                    }
                    if (i32 != 3) {
                        if (i32 != 4) {
                            bn bnVar4 = this.a;
                            bnVar4.o.addView(view, bnVar4.z.c());
                            return;
                        } else {
                            bn bnVar5 = this.a;
                            bnVar5.o.addView(view, bnVar5.y.c());
                            return;
                        }
                    }
                    bn bnVar6 = this.a;
                    int childCount = bnVar6.o.getChildCount();
                    if (bnVar6.q.np()) {
                        childCount = Math.min(childCount, bnVar6.o.indexOfChild(bnVar6.q.ld()));
                    }
                    if (bnVar6.y.np()) {
                        childCount = Math.min(childCount, bnVar6.o.indexOfChild(bnVar6.y.ld()));
                    }
                    bnVar6.o.addView(view, childCount, bnVar6.p.c());
                    if (bnVar6.p.np()) {
                        bnVar6.q.q(bnVar6.p.A());
                        bnVar6.q.s(bnVar6.p.G());
                    }
                }
            });
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public final void a() {
        if (f()) {
            if (!f()) {
                oba.C();
            } else if (this.j) {
                d();
                this.B.c();
            }
        }
    }

    public final void b() {
        if (!this.k) {
            this.l = true;
            return;
        }
        try {
            this.l = false;
            this.c.n();
        } catch (RemoteException e) {
            oba.B(e);
        }
    }

    public final void c(Tick tick) {
        try {
            com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b.e(tick, System.currentTimeMillis());
        } catch (RemoteException unused) {
            alta.C("Csi controller service is disconnected", new Object[0]);
        }
    }

    public final void d() {
        if (!f()) {
            oba.C();
            return;
        }
        try {
            this.c.x();
        } catch (RemoteException e) {
            oba.B(e);
        }
    }

    public final void e(boolean z) {
        if (f()) {
            try {
                this.c.G(z);
                return;
            } catch (RemoteException e) {
                oba.B(e);
                return;
            }
        }
        oba.C();
    }

    public final boolean f() {
        return !(this.c instanceof DisconnectedApiPlayerService);
    }
}
