package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.b;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.a;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.c;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.g;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.h;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.l;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.model.FragmentKeyData;
import com.google.android.apps.youtube.embeddedplayer.service.model.HotConfigData;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerStateCache;
import com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.i;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.j;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.e;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.youtube.R;
import defpackage.aors;
import defpackage.aqrt;
import defpackage.atzx;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class otp implements ypd {
    h A;
    l B;
    ypa C;
    ahfn D;
    adxr E;
    osu F;
    aaea G;
    c H;
    a I;

    /* renamed from: J, reason: collision with root package name */
    public zbw f253J;
    com.google.android.apps.youtube.embeddedplayer.service.csi.service.a K;
    BandaidConnectionOpenerController L;
    ysy M;
    b N;
    wno O;
    wyt P;
    wyn Q;
    acpj R;
    com.google.android.apps.youtube.embeddedplayer.service.hostappverification.b S;
    public com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.c T;
    public zgj U;
    ajut V;
    aigv W;
    aadw X;
    public com.google.android.apps.youtube.embeddedplayer.service.permissions.c Y;
    axzg Z;
    public final osv a;
    ajyw aa;
    private final oto ab;
    private final afkl ac;
    private final ahvc ad;
    private final ahxi ae;
    private final ayqw af;
    private aahd ag;
    private xhz ah;
    private xji ai;
    private j aj;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.b ak;
    private ahxv al;
    private ahyw am;
    private ahxg an;
    private LiveOverlayPresenter ao;
    private d ap;
    private e aq;
    private ahzg ar;
    private ahxz as;
    private SubtitlesOverlayPresenter at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.service.a ax;
    public final alux b;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c c;
    public boolean d;
    public PlaybackStartDescriptor e;
    public int f;
    public int g;
    public ainy i;
    ainl j;
    aioc k;
    aisn l;
    aiuy m;
    ahhc n;
    ajby o;
    ahuk p;
    wob q;
    xjl r;
    xls s;
    ajjz t;
    Executor u;
    ajae v;
    shf w;
    ScheduledExecutorService x;
    aisf y;
    f z;
    private int ay = 1;
    private int az = 1;
    public final ApiPlayerStateCache h = new ApiPlayerStateCache();

    private otp(osv osvVar, oto otoVar, alux aluxVar, com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar, afkl afklVar, ahvc ahvcVar, ahxi ahxiVar, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c cVar) {
        osvVar.getClass();
        this.a = osvVar;
        otoVar.getClass();
        this.ab = otoVar;
        aluxVar.getClass();
        this.b = aluxVar;
        aVar.getClass();
        this.ax = aVar;
        afklVar.getClass();
        this.ac = afklVar;
        ahvcVar.getClass();
        this.ad = ahvcVar;
        ahxiVar.getClass();
        this.ae = ahxiVar;
        cVar.getClass();
        this.c = cVar;
        this.af = new ayqw();
        ((otb) osvVar).f.a().a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static otp M(Context context, oto otoVar, osv osvVar, afkl afklVar, i iVar, xja xjaVar, ahvc ahvcVar, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b bVar, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c cVar, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b bVar2, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b bVar3, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b bVar4, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h hVar, rql rqlVar, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d dVar, ahxt ahxtVar, ahyu ahyuVar, ahxe ahxeVar, ahvy ahvyVar, ahxi ahxiVar, ahxw ahxwVar, ahza ahzaVar, com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar, zfi zfiVar, alux aluxVar, com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.a aVar2, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c cVar2) {
        Boolean bool;
        otp otpVar = new otp(osvVar, otoVar, aluxVar, aVar, afklVar, ahvcVar, ahxiVar, cVar2);
        bVar.getClass();
        cVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        bVar4.getClass();
        ahvyVar.getClass();
        ahxwVar.getClass();
        ahzaVar.getClass();
        final com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.b bVar5 = new com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.b(otpVar.ax, otpVar.R, ((otb) otpVar.a).c.a, otpVar.G);
        bVar5.a.a.Y(oqj.t).ab(azre.c()).B().ax(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.a
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                b.this.c = ((aqrt) obj).e;
            }
        });
        otpVar.C.g(bVar5);
        com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.f fVar = new com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.f(otpVar.ax);
        otpVar.C.g(fVar);
        otpVar.C.g(new com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.c(otpVar.M, otpVar.ax));
        final com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.e eVar = new com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.e(otpVar.ax, otpVar.G);
        eVar.b.a.Y(oqj.u).ab(azre.c()).B().ay(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.d
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                e eVar2 = e.this;
                eVar2.a.a(new HotConfigData((aqrt) obj));
            }
        }, oqu.c);
        otl otlVar = new otl(otpVar);
        otpVar.ag = new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.h(new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.f(context, new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.i(otlVar), new g(otlVar, fVar), new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.c(new otf(otpVar.ab), null), new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.d(new otf(otpVar.ab)), new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.b(aVar2), ((otb) otpVar.a).h), otpVar.z);
        final int i = 0;
        xhz xhzVar = new xhz(iVar, acra.l, otpVar.ag, new xhw[0]);
        otpVar.ah = xhzVar;
        otpVar.r.m(xhzVar);
        aqvj aqvjVar = otpVar.Z.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        final int i2 = 1;
        if (aqvjVar.a(45354952L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45354952L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45354952L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            otpVar.L.j();
        }
        otpVar.ai = new xji(ejz.n, otpVar.ag, xjaVar, otpVar.w, zfiVar, otpVar.s, otpVar.O, otpVar.P, otpVar.Q);
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.b bVar6 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.b(otpVar.ag, otpVar.a.f());
        bVar.B(bVar6);
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.b h = otpVar.a.i().h(otpVar.ag);
        cVar.t(h);
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b g = otpVar.a.h().g(otpVar.ag);
        bVar2.v(g);
        com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.b a = otpVar.a.e().a(otpVar.ag);
        bVar3.D(a);
        final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.b bVar7 = new com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.b(otpVar.z, rqlVar, context, null);
        bVar7.f.a(R.id.player_share_button, new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.a
            @Override // java.lang.Runnable
            public final void run() {
                b bVar8 = b.this;
                if (bVar8.e) {
                    return;
                }
                bVar8.t();
            }
        });
        otpVar.ak = bVar7;
        bVar4.pw(bVar7);
        otpVar.aj = new j(otpVar.i, otpVar.p, otpVar.ad, bVar, bVar6, cVar, h, bVar2, g, bVar3, a, otpVar.ak, otpVar.E, otpVar.x, otpVar.u, hVar, otpVar.ag, rqlVar, otpVar.z, otpVar.G, null);
        ahvc ahvcVar2 = otpVar.ad;
        ahvcVar2.h(otpVar.aa.b(ahvcVar2, ahxtVar));
        otpVar.al = new ahxv(otpVar.i, ahxtVar);
        otpVar.am = new ahyw(context.getResources(), otpVar.i, ahyuVar);
        otpVar.an = new ahxg(otpVar.i, otpVar.j, ahxeVar);
        otpVar.ao = new LiveOverlayPresenter(context, ahvyVar, otpVar.v, otpVar.u, otpVar.t, otpVar.x, otpVar.w, null, null);
        f fVar2 = otpVar.z;
        aahd aahdVar = otpVar.ag;
        d dVar2 = new d(context, fVar2, dVar, otpVar.ax);
        dVar2.c = new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service.c(dVar2.a, aahdVar, new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service.a(dVar2));
        com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service.c cVar3 = dVar2.c;
        cVar3.e = 0L;
        int b = dVar2.b.b(cVar3);
        cVar3.a = new SelectableItemKey(b, 1);
        final int i3 = 2;
        cVar3.b = new SelectableItemKey(b, 2);
        final int i4 = 3;
        cVar3.c = new SelectableItemKey(b, 3);
        otpVar.ap = dVar2;
        aypy U = dVar2.i.U();
        final e eVar2 = new e(otpVar.z, otpVar.ag, rqlVar, otpVar.N, dVar, otpVar.ax, null);
        eVar2.k.a(R.id.related_videos_screen_button, new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.b
            @Override // java.lang.Runnable
            public final void run() {
                if (i2 == 0) {
                    e eVar3 = eVar2;
                    atzx atzxVar = eVar3.c;
                    if (atzxVar == null || (atzxVar.c & 4) == 0) {
                        return;
                    }
                    eVar3.j.j(atzxVar.g.I());
                    return;
                }
                eVar2.c();
            }
        });
        eVar2.k.a(R.id.related_videos_screen_button, new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.b
            @Override // java.lang.Runnable
            public final void run() {
                if (i == 0) {
                    e eVar3 = eVar2;
                    atzx atzxVar = eVar3.c;
                    if (atzxVar == null || (atzxVar.c & 4) == 0) {
                        return;
                    }
                    eVar3.j.j(atzxVar.g.I());
                    return;
                }
                eVar2.c();
            }
        });
        eVar2.h.b = eVar2.f.b(eVar2.h);
        eVar2.i.b = eVar2.g.b(eVar2.i);
        eVar2.e.g(eVar2.d.B().ax(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                atzx atzxVar;
                int i5 = i;
                if (i5 == 0) {
                    eVar2.k.d(R.id.related_videos_screen_button, ((Boolean) obj).booleanValue());
                    return;
                }
                if (i5 == 1) {
                    eVar2.b((MutedAutoplayState) obj);
                    return;
                }
                if (i5 == 2) {
                    e eVar3 = eVar2;
                    if (!((Boolean) obj).booleanValue() || (atzxVar = eVar3.c) == null || (atzxVar.c & 4) == 0) {
                        return;
                    }
                    eVar3.j.q(atzxVar.g.I());
                    return;
                }
                eVar2.b(MutedAutoplayState.a);
            }
        }), eVar2.d.B().w(500L, TimeUnit.MILLISECONDS).ax(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                atzx atzxVar;
                int i5 = i3;
                if (i5 == 0) {
                    eVar2.k.d(R.id.related_videos_screen_button, ((Boolean) obj).booleanValue());
                    return;
                }
                if (i5 == 1) {
                    eVar2.b((MutedAutoplayState) obj);
                    return;
                }
                if (i5 == 2) {
                    e eVar3 = eVar2;
                    if (!((Boolean) obj).booleanValue() || (atzxVar = eVar3.c) == null || (atzxVar.c & 4) == 0) {
                        return;
                    }
                    eVar3.j.q(atzxVar.g.I());
                    return;
                }
                eVar2.b(MutedAutoplayState.a);
            }
        }), U.ay(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                atzx atzxVar;
                int i5 = i2;
                if (i5 == 0) {
                    eVar2.k.d(R.id.related_videos_screen_button, ((Boolean) obj).booleanValue());
                    return;
                }
                if (i5 == 1) {
                    eVar2.b((MutedAutoplayState) obj);
                    return;
                }
                if (i5 == 2) {
                    e eVar3 = eVar2;
                    if (!((Boolean) obj).booleanValue() || (atzxVar = eVar3.c) == null || (atzxVar.c & 4) == 0) {
                        return;
                    }
                    eVar3.j.q(atzxVar.g.I());
                    return;
                }
                eVar2.b(MutedAutoplayState.a);
            }
        }, new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                atzx atzxVar;
                int i5 = i4;
                if (i5 == 0) {
                    eVar2.k.d(R.id.related_videos_screen_button, ((Boolean) obj).booleanValue());
                    return;
                }
                if (i5 == 1) {
                    eVar2.b((MutedAutoplayState) obj);
                    return;
                }
                if (i5 == 2) {
                    e eVar3 = eVar2;
                    if (!((Boolean) obj).booleanValue() || (atzxVar = eVar3.c) == null || (atzxVar.c & 4) == 0) {
                        return;
                    }
                    eVar3.j.q(atzxVar.g.I());
                    return;
                }
                eVar2.b(MutedAutoplayState.a);
            }
        }));
        otpVar.aq = eVar2;
        otpVar.at = new SubtitlesOverlayPresenter(otpVar.ae, otpVar.l, otpVar.m, otpVar.y, otpVar.x, otpVar.u, otpVar.X);
        otpVar.as = new ahxz(ahxwVar, otpVar.t);
        otpVar.ar = new ahzg(ahzaVar, otpVar.ag, otpVar.V, ejz.o);
        final com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.c cVar4 = otpVar.T;
        final axze axzeVar = cVar4.l;
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        final byte[] bArr3 = null;
        final byte[] bArr4 = null;
        cVar4.i = axzeVar.a.a.Y(new ayrv(bArr, bArr2, bArr3, bArr4) { // from class: axza
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                aomf aomfVar;
                axze axzeVar2 = axze.this;
                aqvj aqvjVar2 = ((arfd) obj).A;
                if (aqvjVar2 == null) {
                    aqvjVar2 = aqvj.a;
                }
                if (aqvjVar2.a(45359532L)) {
                    try {
                        aoot aootVar2 = aqvjVar2.b;
                        if (aootVar2.containsKey(45359532L)) {
                            aqvk aqvkVar2 = (aqvk) aootVar2.get(45359532L);
                            if (aqvkVar2.b == 5) {
                                aomfVar = (aomf) aqvkVar2.c;
                            } else {
                                aomfVar = aomf.b;
                            }
                            return (aors) aonm.parseFrom(aors.a, aomfVar);
                        }
                        throw new IllegalArgumentException();
                    } catch (aoob e) {
                        String simpleName = axzeVar2.getClass().getSimpleName();
                        String valueOf = String.valueOf(e.getMessage());
                        Log.e(simpleName, valueOf.length() != 0 ? "Unable to parse proto typed experiment flag: ".concat(valueOf) : new String("Unable to parse proto typed experiment flag: "));
                    }
                }
                return aors.a;
            }
        }).B().ax(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.b
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                c.this.h = (aors) obj;
            }
        });
        otpVar.q();
        otpVar.N();
        otpVar.n.l();
        return otpVar;
    }

    private final void N() {
        if (this.aw) {
            return;
        }
        if (aifk.I(this.X)) {
            this.af.g(this.n.kI(this.k));
        } else {
            this.C.g(this.n);
        }
        if (aifk.K(this.X)) {
            this.af.g(this.ao.kI(this.k));
            this.af.g(this.D.kI(this.k));
        } else {
            this.C.g(this.ao);
            this.C.g(this.D);
        }
        if (aifk.J(this.X)) {
            this.af.g(this.as.kI(this.k));
            SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.at;
            if (subtitlesOverlayPresenter != null) {
                this.af.g(subtitlesOverlayPresenter.kI(this.k));
            }
            this.af.g(this.al.kI(this.k));
            this.af.g(this.am.kI(this.k));
            this.af.g(this.an.kI(this.k));
            ahzg ahzgVar = this.ar;
            if (ahzgVar != null) {
                this.af.g(ahzgVar.a.kI(this.k));
            }
            j jVar = this.aj;
            if (jVar != null) {
                this.af.g(jVar.O.kI(this.k));
            }
        } else {
            this.C.g(this.as);
            SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.at;
            if (subtitlesOverlayPresenter2 != null) {
                this.C.g(subtitlesOverlayPresenter2);
            }
            this.C.g(this.al);
            this.C.g(this.am);
            this.C.g(this.an);
            ahzg ahzgVar2 = this.ar;
            if (ahzgVar2 != null) {
                this.C.g(ahzgVar2.a);
            }
            j jVar2 = this.aj;
            if (jVar2 != null) {
                this.C.g(jVar2.O);
            }
        }
        j jVar3 = this.aj;
        if (jVar3 != null) {
            this.af.g(jVar3.b.kI(this.k));
        }
        xji xjiVar = this.ai;
        if (xjiVar != null) {
            this.af.g(xjiVar.kI(this.k));
        }
        this.C.g(this);
        this.C.g(this.W);
        ahzg ahzgVar3 = this.ar;
        if (ahzgVar3 != null) {
            this.C.g(ahzgVar3.b);
        }
        j jVar4 = this.aj;
        if (jVar4 != null) {
            this.C.g(jVar4.P);
        }
        this.C.g(this.ak);
        this.C.g(this.aq);
        this.C.g(this.ap);
        this.C.g(this.o);
        this.C.g(this.z);
        this.aw = true;
    }

    private final void O() {
        this.d = false;
    }

    private final void P(boolean z) {
        this.au = z;
        this.ab.b(z, a());
    }

    private final void Q(boolean z) {
        if (this.av != z) {
            this.av = z;
            this.ab.e(z);
        }
    }

    private final void R(PlayerResponseModel playerResponseModel, Optional optional) {
        if (playerResponseModel == null) {
            this.g = !I(optional) ? 1 : 0;
            return;
        }
        aryl arylVar = playerResponseModel.a.C;
        if (arylVar == null) {
            arylVar = aryl.a;
        }
        atyk atykVar = arylVar.c;
        if (atykVar == null) {
            atykVar = atyk.a;
        }
        this.g = (atykVar.b & 16) != 0 ? 2 : 1;
    }

    private final boolean S() {
        aqrt D = oba.D(this.G);
        return D != null && D.i;
    }

    private static final boolean U(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!TextUtils.isEmpty((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A(int i) {
        if (!T() && this.ay == 3) {
            this.i.U(i);
        }
    }

    public final void B(boolean z) {
        this.i.E(z);
        if (this.ay == 4) {
            Q(z);
        }
    }

    public final void C(boolean z) {
        this.i.h.i.a = z;
    }

    public final void D(boolean z) {
        this.aj.s.s(!z);
    }

    public final void E() {
        this.ad.pA();
    }

    public final void F() {
        if (!T() && this.ay == 3) {
            this.i.L();
        }
    }

    public final boolean G() {
        int i = this.ay;
        if (i == 3 || i == 2) {
            return this.j.j(aims.a);
        }
        return false;
    }

    public final boolean H() {
        int i = this.ay;
        if (i == 3 || i == 2) {
            return this.j.j(aims.b);
        }
        return false;
    }

    public final boolean I(Optional optional) {
        return S() ? optional.isPresent() && this.B.c((String) optional.get()) : this.A.a;
    }

    public final boolean J() {
        return this.i.S();
    }

    public final boolean K(int i, KeyEvent keyEvent) {
        return this.ad.onKeyDown(i, keyEvent);
    }

    public final boolean L(int i, KeyEvent keyEvent) {
        return this.ad.onKeyUp(i, keyEvent);
    }

    public final long a() {
        aixh o = this.i.o();
        if (this.ay != 3 || o == null) {
            return 0L;
        }
        return o.b();
    }

    public final long b() {
        if (this.ay == 3) {
            return this.i.h();
        }
        return 0L;
    }

    public final PlaybackServiceState c() {
        return this.i.l(false);
    }

    public final void d() {
        int i = this.ay;
        if (i != 5 && i == 4) {
            this.at = new SubtitlesOverlayPresenter(this.ae, this.l, this.m, this.y, this.x, this.u, this.X);
            q();
            N();
            this.r.m(this.ah);
            this.i.A();
            this.n.l();
            this.ay = this.az;
        }
    }

    public final void e(String str, int i, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            alta.C("No playlist ID provided.", new Object[0]);
            return;
        }
        PlaybackStartDescriptor v = oba.v(str, i, i2);
        v.p(true);
        k(v, i3);
    }

    public final void g(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            alta.C("No video ID provided.", new Object[0]);
            return;
        }
        PlaybackStartDescriptor w = oba.w(str, i);
        w.p(true);
        k(w, i2);
    }

    public final void h(List list, int i, int i2, int i3) {
        if (!U(list)) {
            alta.C("No video IDs provided.", new Object[0]);
            return;
        }
        PlaybackStartDescriptor x = oba.x(list, i, i2);
        x.p(true);
        k(x, i3);
    }

    public final void i(boolean z) {
        int i = this.ay;
        if (i == 5 || i == 4) {
            return;
        }
        O();
        this.ab.i(a());
        this.n.k();
        this.af.c();
        if (!aifk.I(this.X)) {
            this.C.m(this.n);
        }
        if (!aifk.K(this.X)) {
            this.C.m(this.ao);
            this.C.m(this.D);
        }
        if (!aifk.J(this.X)) {
            SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.at;
            if (subtitlesOverlayPresenter != null) {
                this.C.m(subtitlesOverlayPresenter);
            }
            this.C.m(this.as);
            this.C.m(this.al);
            this.C.m(this.am);
            this.C.m(this.an);
            ahzg ahzgVar = this.ar;
            if (ahzgVar != null) {
                this.C.m(ahzgVar.a);
            }
            j jVar = this.aj;
            if (jVar != null) {
                this.C.m(jVar.O);
            }
        }
        this.C.m(this);
        ahzg ahzgVar2 = this.ar;
        if (ahzgVar2 != null) {
            this.C.m(ahzgVar2.b);
        }
        j jVar2 = this.aj;
        if (jVar2 != null) {
            this.C.m(jVar2.P);
        }
        this.C.m(this.W);
        this.C.m(this.ak);
        this.C.m(this.aq);
        this.C.m(this.ap);
        this.C.m(this.o);
        this.C.m(this.z);
        if (this.L != null && aifk.D(this.G)) {
            this.L.h();
        }
        this.aw = false;
        this.r.d();
        this.i.z(z);
        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.at;
        if (subtitlesOverlayPresenter2 != null) {
            subtitlesOverlayPresenter2.o();
            this.at = null;
        }
        this.aj.c();
        this.az = this.ay;
        this.ay = 4;
    }

    public final void j() {
        if (!T() && this.ay == 3) {
            this.i.b();
        }
    }

    public final void k(PlaybackStartDescriptor playbackStartDescriptor, int i) {
        l(playbackStartDescriptor, false, i);
    }

    public final void l(final PlaybackStartDescriptor playbackStartDescriptor, final boolean z, final int i) {
        if (T()) {
            return;
        }
        aqrs E = oba.E(this.X);
        if (E == null || !E.b) {
            m(playbackStartDescriptor, z, i, Optional.empty());
        } else {
            ynm.k(this.S.a(), this.u, new ynk() { // from class: oth
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    final otp otpVar = otp.this;
                    final PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                    final boolean z2 = z;
                    final int i2 = i;
                    otpVar.F();
                    if (((com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e) th).a != 1) {
                        otpVar.c.n(false);
                    } else {
                        otpVar.c.m(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b() { // from class: otg
                            @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b
                            public final void a() {
                                otp otpVar2 = otp.this;
                                PlaybackStartDescriptor playbackStartDescriptor3 = playbackStartDescriptor2;
                                boolean z3 = z2;
                                int i3 = i2;
                                otpVar2.c.k();
                                otpVar2.l(playbackStartDescriptor3, z3, i3);
                            }
                        });
                        otpVar.c.n(true);
                    }
                }
            }, new ynl() { // from class: oti
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    otp otpVar = otp.this;
                    PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                    boolean z2 = z;
                    int i2 = i;
                    otpVar.c.k();
                    otpVar.m(playbackStartDescriptor2, z2, i2, Optional.of(((com.google.android.apps.youtube.embeddedplayer.service.hostappverification.d) obj).a));
                }
            });
        }
    }

    public final void m(PlaybackStartDescriptor playbackStartDescriptor, boolean z, int i, Optional optional) {
        String str;
        com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar = this.ax;
        com.google.android.apps.youtube.embeddedplayer.service.model.e b = FragmentKeyData.b();
        b.b(playbackStartDescriptor.l());
        aVar.a(b.a());
        this.f = i;
        f fVar = this.z;
        fVar.b = i;
        fVar.o(i, oba.y(playbackStartDescriptor));
        boolean equals = TextUtils.equals("", playbackStartDescriptor.k());
        aone builder = playbackStartDescriptor.a.toBuilder();
        builder.copyOnWrite();
        owi owiVar = (owi) builder.instance;
        owiVar.b |= 32768;
        owiVar.q = !equals;
        playbackStartDescriptor.a = (owi) builder.build();
        String a = this.b.a(playbackStartDescriptor.l());
        this.I.a = a;
        if (optional.isPresent()) {
            this.I.b = (String) optional.get();
        }
        this.H.a = a;
        if (S()) {
            str = playbackStartDescriptor.h(this.U);
            this.B.b(str, z);
        } else {
            this.A.a = z;
            str = null;
        }
        R(null, Optional.ofNullable(str));
        this.e = playbackStartDescriptor;
        this.K.h(Tick.MAIN_APP_SENDS_PLAYER_REQUEST);
        this.j.e(playbackStartDescriptor, this.K.a());
    }

    public final void n(String str, int i, int i2, boolean z, int i3) {
        if (TextUtils.isEmpty(str)) {
            alta.C("No playlist ID provided.", new Object[0]);
            return;
        }
        aifz e = oba.v(str, i, i2).e();
        e.d = !z;
        k(e.a(), i3);
    }

    public final void o(String str, boolean z, int i, boolean z2, int i2) {
        if (TextUtils.isEmpty(str)) {
            alta.C("No video ID provided.", new Object[0]);
            return;
        }
        aifz e = oba.w(str, i).e();
        boolean z3 = !z2;
        e.d = z3;
        e.f = z3;
        l(e.a(), z, i2);
    }

    public final void p(List list, int i, int i2, boolean z, int i3) {
        if (!U(list)) {
            alta.C("No video IDs provided.", new Object[0]);
            return;
        }
        aifz e = oba.x(list, i, i2).e();
        e.d = !z;
        k(e.a(), i3);
    }

    public final void q() {
        if (this.L != null && aifk.D(this.G)) {
            this.L.i();
        }
        j jVar = this.aj;
        if (jVar != null) {
            jVar.b();
        }
        this.i.x(this.ac, new aifp(aifq.a, aifq.a, aifq.a, aifq.a, null));
    }

    public final void r() {
        if (T()) {
            return;
        }
        if (!G()) {
            alta.C("Ignoring call to next() on YouTubePlayer as already at end of playlist.", new Object[0]);
            return;
        }
        this.ay = 2;
        this.C.f(aiew.NAVIGATION);
        this.j.a(aims.a);
    }

    public final void s(VisibilityChangeEventData visibilityChangeEventData) {
        xls xlsVar = this.s;
        yjk.f();
        if (xlsVar.d != null) {
            xlsVar.d.m(visibilityChangeEventData);
        }
        this.q.m(visibilityChangeEventData);
    }

    public final void t(PlaybackServiceState playbackServiceState) {
        this.j.f(playbackServiceState);
    }

    public final void u() {
        if (T()) {
            return;
        }
        int i = this.ay;
        if (i == 3 || i == 2) {
            this.i.a();
        }
    }

    public final void v() {
        if (T()) {
            return;
        }
        int i = this.ay;
        if (i == 3 || i == 2) {
            this.C.f(aiew.PLAYER_CONTROL);
            this.i.b();
        }
    }

    public final void w() {
        if (T()) {
            return;
        }
        if (!H()) {
            alta.C("Ignoring call to next() on YouTubePlayer as already at end of playlist.", new Object[0]);
            return;
        }
        this.ay = 2;
        this.C.f(aiew.NAVIGATION);
        this.j.a(aims.b);
    }

    public final void x(boolean z) {
        if (this.ay == 5) {
            return;
        }
        this.F.c();
        i(z);
        this.ac.D();
        j jVar = this.aj;
        jVar.c();
        jVar.N.a();
        this.T.i.qc();
        this.ay = 5;
    }

    public final void y(apxf apxfVar) {
        aahd aahdVar = this.ag;
        if (aahdVar != null) {
            aahc.a(aahdVar, apxfVar);
        } else {
            alta.B("Unable to resolve command", new Object[0]);
        }
    }

    public final void z(int i) {
        if (!T() && this.ay == 3) {
            this.i.ab(i, aupb.SEEK_SOURCE_UNKNOWN);
        }
    }

    private final boolean T() {
        int i = this.ay;
        if (i == 0) {
            throw null;
        }
        if (i == 5) {
            alta.C("This YouTubePlayer has been released - ignoring command.", new Object[0]);
            return true;
        }
        if (i != 4) {
            return false;
        }
        alta.C("This YouTubePlayer has been paused - ignoring command.", new Object[0]);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b6, code lost:
    
        if (r2 == 3) goto L36;
     */
    @Override // defpackage.ypd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class[] kz(java.lang.Class r24, java.lang.Object r25, int r26) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otp.kz(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
