package com.google.android.apps.youtube.app.watch.panel.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;
import com.google.android.apps.youtube.app.common.ui.ScrollToTopLinearLayoutManager;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.apps.youtube.app.ui.presenter.ads.webview.AdsWebViewCacheController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import defpackage.aabn;
import defpackage.aabq;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.aahd;
import defpackage.aamd;
import defpackage.abhc;
import defpackage.abht;
import defpackage.abic;
import defpackage.acra;
import defpackage.acrt;
import defpackage.acry;
import defpackage.acsx;
import defpackage.adlt;
import defpackage.aeb;
import defpackage.afsi;
import defpackage.agqo;
import defpackage.ahe;
import defpackage.ahey;
import defpackage.ahh;
import defpackage.ahqo;
import defpackage.ahqp;
import defpackage.ahqr;
import defpackage.aigr;
import defpackage.ainy;
import defpackage.aioc;
import defpackage.aixh;
import defpackage.ajfh;
import defpackage.ajgq;
import defpackage.ajhb;
import defpackage.ajhj;
import defpackage.ajjz;
import defpackage.ajlx;
import defpackage.ajos;
import defpackage.ajoy;
import defpackage.ajpd;
import defpackage.ajti;
import defpackage.ajvb;
import defpackage.ajvq;
import defpackage.ajwi;
import defpackage.ajwk;
import defpackage.ajxa;
import defpackage.ajyw;
import defpackage.akdd;
import defpackage.akht;
import defpackage.amkq;
import defpackage.ammv;
import defpackage.any;
import defpackage.aoae;
import defpackage.aok;
import defpackage.aoot;
import defpackage.aqvj;
import defpackage.aqvk;
import defpackage.asvu;
import defpackage.axpg;
import defpackage.axzg;
import defpackage.aypn;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.ayro;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.azrw;
import defpackage.ejn;
import defpackage.ejo;
import defpackage.ejq;
import defpackage.etx;
import defpackage.euc;
import defpackage.eug;
import defpackage.evr;
import defpackage.fav;
import defpackage.fgp;
import defpackage.fgq;
import defpackage.fhg;
import defpackage.fku;
import defpackage.flh;
import defpackage.fma;
import defpackage.fnt;
import defpackage.fot;
import defpackage.fou;
import defpackage.frp;
import defpackage.frq;
import defpackage.fwo;
import defpackage.fxj;
import defpackage.fxu;
import defpackage.fyx;
import defpackage.fyy;
import defpackage.fyz;
import defpackage.gii;
import defpackage.gjz;
import defpackage.gmk;
import defpackage.gna;
import defpackage.gnc;
import defpackage.gpe;
import defpackage.gpg;
import defpackage.jas;
import defpackage.jau;
import defpackage.jbe;
import defpackage.ldg;
import defpackage.lwk;
import defpackage.mee;
import defpackage.muf;
import defpackage.nkx;
import defpackage.nqg;
import defpackage.nqn;
import defpackage.nqp;
import defpackage.nsa;
import defpackage.nua;
import defpackage.nun;
import defpackage.nuv;
import defpackage.nxb;
import defpackage.nyk;
import defpackage.nyu;
import defpackage.nyw;
import defpackage.nyy;
import defpackage.nzc;
import defpackage.nze;
import defpackage.nzl;
import defpackage.nzm;
import defpackage.oad;
import defpackage.oal;
import defpackage.oam;
import defpackage.oan;
import defpackage.oas;
import defpackage.oex;
import defpackage.oez;
import defpackage.ofa;
import defpackage.ofc;
import defpackage.ofd;
import defpackage.ofe;
import defpackage.off;
import defpackage.ofq;
import defpackage.ofs;
import defpackage.ofz;
import defpackage.ogc;
import defpackage.ogd;
import defpackage.oge;
import defpackage.ogg;
import defpackage.ogn;
import defpackage.ogr;
import defpackage.ogt;
import defpackage.ogx;
import defpackage.oha;
import defpackage.ohb;
import defpackage.ohf;
import defpackage.ohg;
import defpackage.ohh;
import defpackage.ohj;
import defpackage.ohx;
import defpackage.ohy;
import defpackage.ohz;
import defpackage.oib;
import defpackage.oic;
import defpackage.oid;
import defpackage.oif;
import defpackage.oii;
import defpackage.oik;
import defpackage.oil;
import defpackage.oim;
import defpackage.oin;
import defpackage.oip;
import defpackage.oir;
import defpackage.oiy;
import defpackage.ojb;
import defpackage.sqq;
import defpackage.sxw;
import defpackage.syd;
import defpackage.vw;
import defpackage.wbs;
import defpackage.whu;
import defpackage.wmw;
import defpackage.wmy;
import defpackage.wmz;
import defpackage.wnb;
import defpackage.wnc;
import defpackage.woo;
import defpackage.wox;
import defpackage.wpe;
import defpackage.wtt;
import defpackage.wtu;
import defpackage.wxm;
import defpackage.wzq;
import defpackage.xjl;
import defpackage.xls;
import defpackage.yjk;
import defpackage.ypa;
import defpackage.yzr;
import defpackage.zaw;
import defpackage.zcg;
import j$.util.function.Supplier;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DefaultWatchPanelViewController implements ojb, ofc, oez, oex, ofd, fgp, any, nqn {
    public acsx A;
    private final ypa B;
    private final ajjz C;
    private final jau D;
    private final jas E;
    private final aioc F;
    private final ayqw G;
    private final wox H;
    private final xls I;

    /* renamed from: J, reason: collision with root package name */
    private final ejo f164J;
    private final wpe K;
    private final wzq L;
    private final fwo M;
    private final flh N;
    private final azrw O;
    private final ohg P;
    private final oii Q;
    private final fyx R;
    private final oic S;
    private final axpg T;
    private final fgq U;
    private final nuv V;
    private final ajoy W;
    private final ohj X;
    private final oid Y;
    private final fma Z;
    public final Activity a;
    private oik aA;
    private Runnable aB;
    private ayqx aC;
    private ayqx aD;
    private final aadw aE;
    private final ohx aF;
    private final ahey aG;
    private final c aH;
    private final axzg aI;
    private final lwk aJ;
    private final akht aK;
    private final akht aL;
    private final ajyw aM;
    private final ajoy aN;
    private final ajoy aO;
    private final aoae aP;
    private final aoae aQ;
    private final ActiveStateScrollSelectionController aa;
    private final ogg ab;
    private final jbe ac;
    private final eug ad;
    private final oal ae;
    private final aaea af;
    private final gpg ag;
    private final wmw ah;
    private final ofe ai;
    private final ajlx aj;
    private final AdsWebViewCacheController ak;
    private final nyk al;
    private final sxw am;
    private final ArrayList an;
    private final ArrayList ao;
    private nzm ap;
    private nyy aq;
    private oir ar;
    private nun as;
    private TextView at;
    private View au;
    private View av;
    private View aw;
    private off ay;
    private ohb az;
    public final aahd b;
    public final nkx c;
    public final acra d;
    public final nqp e;
    public final nsa f;
    public final String g;
    public final boolean h;
    public nzc i;
    public oan j;
    public nyw k;
    public nyu l;
    public nqg m;
    public oip n;
    public CoordinatorLayout o;
    public RecyclerView p;
    public ScrollToTopLinearLayoutManager q;
    public ajwi r;
    public ajti s;
    public ajti t;
    public oha u;
    public wnc v;
    public gna w;
    public Configuration y;
    public boolean z;
    public ahqo x = ahqo.NEW;
    private oil ax = new ogr();

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultWatchPanelViewController(Activity activity, ypa ypaVar, ajjz ajjzVar, jas jasVar, jau jauVar, aioc aiocVar, aoae aoaeVar, wox woxVar, aoae aoaeVar2, xls xlsVar, ejo ejoVar, wpe wpeVar, wzq wzqVar, fma fmaVar, fwo fwoVar, aahd aahdVar, flh flhVar, nkx nkxVar, fgq fgqVar, akht akhtVar, ohg ohgVar, ajyw ajywVar, acra acraVar, fyx fyxVar, axpg axpgVar, ActiveStateScrollSelectionController activeStateScrollSelectionController, jbe jbeVar, oii oiiVar, oic oicVar, ajoy ajoyVar, ahey aheyVar, akht akhtVar2, ohj ohjVar, oid oidVar, ajoy ajoyVar2, c cVar, fxj fxjVar, eug eugVar, oal oalVar, aadw aadwVar, aaea aaeaVar, wmw wmwVar, ajlx ajlxVar, ajoy ajoyVar3, gpg gpgVar, lwk lwkVar, AdsWebViewCacheController adsWebViewCacheController, azrw azrwVar, nqp nqpVar, nsa nsaVar, sxw sxwVar, nyk nykVar, ohx ohxVar, ahqr ahqrVar, axzg axzgVar, axzg axzgVar2, nuv nuvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        Boolean bool;
        this.a = activity;
        this.B = ypaVar;
        this.C = ajjzVar;
        this.E = jasVar;
        this.D = jauVar;
        this.F = aiocVar;
        this.aP = aoaeVar;
        this.H = woxVar;
        this.aQ = aoaeVar2;
        this.I = xlsVar;
        this.f164J = ejoVar;
        this.K = wpeVar;
        this.L = wzqVar;
        this.M = fwoVar;
        this.b = aahdVar;
        this.N = flhVar;
        this.O = azrwVar;
        this.c = nkxVar;
        this.P = ohgVar;
        this.aF = ohxVar;
        this.aM = ajywVar;
        this.ak = adsWebViewCacheController;
        this.d = acraVar;
        this.R = fyxVar;
        this.T = axpgVar;
        this.ac = jbeVar;
        this.aL = akhtVar;
        this.f = nsaVar;
        this.e = nqpVar;
        this.Q = oiiVar;
        this.S = oicVar;
        this.U = fgqVar;
        this.W = ajoyVar;
        this.aG = aheyVar;
        this.aK = akhtVar2;
        this.X = ohjVar;
        this.Y = oidVar;
        this.aO = ajoyVar2;
        this.aH = cVar;
        this.ad = eugVar;
        this.ag = gpgVar;
        this.aa = activeStateScrollSelectionController;
        this.ae = oalVar;
        this.aE = aadwVar;
        this.af = aaeaVar;
        this.aI = axzgVar;
        this.ah = wmwVar;
        this.aj = ajlxVar;
        this.Z = fmaVar;
        this.aN = ajoyVar3;
        this.aJ = lwkVar;
        this.am = sxwVar;
        this.al = nykVar;
        this.V = nuvVar;
        asvu asvuVar = aadwVar.b().e;
        this.g = (asvuVar == null ? asvu.a : asvuVar).aD;
        aqvj aqvjVar = axzgVar2.b.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45358786L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45358786L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45358786L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        this.h = bool.booleanValue();
        ahqrVar.h(new ahqp() { // from class: ofy
            @Override // defpackage.ahqp
            public final void a(ahqo ahqoVar) {
                DefaultWatchPanelViewController defaultWatchPanelViewController = DefaultWatchPanelViewController.this;
                defaultWatchPanelViewController.x = ahqoVar;
                defaultWatchPanelViewController.t();
            }
        });
        ofe ofeVar = new ofe(fxjVar, this);
        this.ai = ofeVar;
        ofeVar.c(this);
        ofeVar.d(this);
        this.ab = new ogg(this);
        this.G = new ayqw();
        this.an = new ArrayList();
        this.ao = new ArrayList();
        this.y = activity.getResources().getConfiguration();
        if (activity instanceof euc) {
            ((euc) activity).getLifecycle().b(this);
        }
    }

    private final void A(akdd akddVar) {
        ArrayList arrayList = this.ao;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((LoadingFrameLayout) arrayList.get(i)).f(akddVar);
        }
        ArrayList arrayList2 = this.an;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((oif) arrayList2.get(i2)).a = akddVar;
        }
    }

    private final void C(fnt fntVar) {
        ohb ohbVar = this.az;
        if (ohbVar != null) {
            ohbVar.j(fntVar);
        }
        this.v.c();
        this.D.b();
        this.at.setVisibility(8);
        ArrayList arrayList = this.ao;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((LoadingFrameLayout) arrayList.get(i)).c();
        }
        if (!evr.aI(this.aE)) {
            this.e.s();
        }
        this.ak.g();
        this.ay.j();
        oil oilVar = this.ax;
        if (oilVar != null) {
            oilVar.c();
        }
        oik oikVar = this.aA;
        if (oikVar != null) {
            oikVar.a.r();
        }
    }

    private final void v(LoadingFrameLayout loadingFrameLayout) {
        this.ao.add(loadingFrameLayout);
    }

    private final void w(WatchNextResponseModel watchNextResponseModel) {
        this.q.c = false;
        aamd aamdVar = watchNextResponseModel.e;
        if (aamdVar != null) {
            this.r.N(aamdVar, null);
            ArrayList arrayList = this.ao;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((LoadingFrameLayout) arrayList.get(i)).a();
            }
        }
        r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [xjj, oan, adue, fgp] */
    @Override // defpackage.ofd
    public final void e(int i, int i2) {
        int i3 = 1;
        if (i2 == 3) {
            ayqw ayqwVar = this.G;
            wnc wncVar = this.v;
            aioc aiocVar = this.F;
            this.B.g(wncVar);
            ayqwVar.g(wncVar.kI(aiocVar));
            if (evr.au(this.aE)) {
                this.G.g(this.Q.kI(this.F));
            } else {
                this.B.g(this.Q);
            }
            this.B.g(this.ad);
            this.G.d(this.F.V().A(nxb.u).Y(new ofs(this, i3), nua.p));
            ejo ejoVar = this.f164J;
            wtt wttVar = ejoVar.a;
            ejn ejnVar = ejoVar.b;
            ejn ejnVar2 = wttVar.a;
            if (ejnVar2 != null && !amkq.b(ejnVar2, ejnVar)) {
                whu whuVar = wttVar.b;
                whu.l(null, "Received mismatching registration request for adsEngagementPanelApi");
            }
            wttVar.a = ejnVar;
            wpe wpeVar = this.K;
            woo wooVar = wpeVar.a;
            if (wooVar != null) {
                wtu wtuVar = wpeVar.b;
                woo wooVar2 = wtuVar.a;
                if (wooVar2 != null && !amkq.b(wooVar2, wooVar)) {
                    whu whuVar2 = wtuVar.b;
                    whu.l(null, "Received mismatching registration request for companionApi");
                }
                wtuVar.a = wooVar;
            }
            this.H.c = this.d;
            B();
        } else if (i2 == 1) {
            B();
            i2 = 1;
        }
        if (i == 3) {
            this.G.c();
            this.B.m(this.v);
            if (!evr.au(this.aE)) {
                this.B.m(this.Q);
            }
            this.B.m(this.ad);
            ?? r0 = this.j;
            if (r0 != 0) {
                oad oadVar = (oad) r0;
                if (oadVar.C) {
                    oadVar.C = false;
                    if (evr.au(oadVar.D)) {
                        oadVar.o.c();
                    } else {
                        oadVar.q.m(oadVar.r);
                    }
                    oadVar.l.k(r0);
                    oas oasVar = oadVar.j;
                    if (evr.au(oasVar.k)) {
                        oasVar.i.c();
                    } else {
                        oasVar.j.m(oasVar);
                    }
                    if (oadVar.w) {
                        oadVar.g.removeCallbacks(oadVar.s);
                        oadVar.g.setSelected(false);
                    }
                    oadVar.p.c();
                    oadVar.k.c(r0);
                    oadVar.m.j(r0);
                }
            }
            ejo ejoVar2 = this.f164J;
            wtt wttVar2 = ejoVar2.a;
            ejn ejnVar3 = ejoVar2.b;
            ejn ejnVar4 = wttVar2.a;
            if (ejnVar4 != null && !amkq.b(ejnVar4, ejnVar3)) {
                whu whuVar3 = wttVar2.b;
                whu.l(null, "Received mismatching unregistration request for adsEngagementPanelApi");
            }
            wttVar2.a = null;
            wpe wpeVar2 = this.K;
            woo wooVar3 = wpeVar2.a;
            if (wooVar3 != null) {
                wtu wtuVar2 = wpeVar2.b;
                woo wooVar4 = wtuVar2.a;
                if (wooVar4 != null && !amkq.b(wooVar4, wooVar3)) {
                    whu whuVar4 = wtuVar2.b;
                    whu.l(null, "Received mismatching unregistration request for companionApi");
                }
                wtuVar2.a = null;
            }
        }
        boolean h = ofe.h(i2);
        if (ofe.h(i) != h) {
            if (!h) {
                this.U.j(this);
            } else {
                this.U.i(this);
                j(this.a.getResources().getConfiguration());
                oQ(this.U.g());
                wmz wmzVar = this.v.b;
                if (wmzVar != null) {
                    wmzVar.a();
                }
            }
        }
        boolean f = ofe.f(i2);
        if (ofe.f(i) != f) {
            if (!f) {
                this.D.b();
                this.v.c();
                Iterator it = this.aQ.b.iterator();
                while (it.hasNext()) {
                    ((wxm) it.next()).a = null;
                }
                this.ad.a();
                ohj ohjVar = this.X;
                ohjVar.a();
                ohjVar.c = null;
                this.ay.j();
                ofa ofaVar = this.ai.a;
                if (ofaVar != null) {
                    this.R.d(ofaVar.h.c());
                }
                if (this.U.g().b()) {
                    this.ac.X();
                    return;
                }
                return;
            }
            aoae aoaeVar = this.aQ;
            oii oiiVar = this.Q;
            Iterator it2 = aoaeVar.b.iterator();
            while (it2.hasNext()) {
                ((wxm) it2.next()).a = oiiVar;
            }
            wmw wmwVar = this.ah;
            wnc wncVar2 = this.v;
            wncVar2.getClass();
            wmwVar.a = wncVar2;
        }
    }

    @Override // defpackage.nqn
    public final void h(nqg nqgVar) {
        this.n.d(8, this.f.a(nqgVar));
        this.m = nqgVar;
    }

    @Override // defpackage.nqn
    public final void i(nqg nqgVar) {
        this.n.e(8);
        this.n.g(8, this.e.h().i);
        this.m = nqgVar;
    }

    @Override // defpackage.ofc
    public final void j(Configuration configuration) {
        this.y = configuration;
        r();
        this.r.F(configuration);
        ajti ajtiVar = this.s;
        if (ajtiVar != null) {
            ajtiVar.b();
        }
        oil oilVar = this.ax;
        if (oilVar != null) {
            oilVar.a(configuration);
        }
        off offVar = this.ay;
        offVar.e = etx.t(configuration.orientation);
        offVar.k();
    }

    @Override // defpackage.ojb
    public final int k() {
        if (this.ao.isEmpty()) {
            afsi.b(1, 25, "Missing LoadingFrameLayout in DefaultWatchPanelViewController.");
            return 0;
        }
        return ((LoadingFrameLayout) this.ao.get(0)).e;
    }

    @Override // defpackage.ojb
    public final ofa l() {
        return this.ai.a;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.ai.e(null);
        ajwi ajwiVar = this.r;
        if (ajwiVar != null) {
            ajwiVar.j();
        }
        this.K.a = null;
        aokVar.getLifecycle().c(this);
        Object obj = this.aC;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.aC = null;
        }
        Object obj2 = this.aD;
        if (obj2 != null) {
            azqb.f((AtomicReference) obj2);
            this.aD = null;
        }
        oha ohaVar = this.u;
        if (ohaVar != null) {
            ohaVar.d.c();
        }
        ActiveStateScrollSelectionController activeStateScrollSelectionController = this.aa;
        if (activeStateScrollSelectionController != null) {
            activeStateScrollSelectionController.i(null);
        }
        ohb ohbVar = this.az;
        if (ohbVar != null) {
            ohbVar.d();
        }
        if (this.as != null) {
            this.e.g().b(this.as);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ojb
    public final ojb m(View view, ViewGroup viewGroup, fyz fyzVar, ahe aheVar, nzc nzcVar, oam oamVar) {
        int i;
        Boolean bool;
        LayoutInflater from = LayoutInflater.from(this.a);
        final int i2 = 0;
        this.o = (CoordinatorLayout) from.inflate(R.layout.watch_panel, viewGroup, false);
        oan a = oamVar != null ? this.ae.a(oamVar) : null;
        this.j = a;
        if (a != null) {
            this.ai.d(a);
            this.ai.c(this.j);
        }
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) this.o.findViewById(R.id.video_info_loading_layout);
        v(loadingFrameLayout);
        this.an.add(this.aK.d(loadingFrameLayout, false));
        this.at = (TextView) loadingFrameLayout.d.b.findViewById(R.id.title);
        this.p = (RecyclerView) loadingFrameLayout.findViewById(R.id.watch_list);
        from.getContext();
        ScrollToTopLinearLayoutManager scrollToTopLinearLayoutManager = new ScrollToTopLinearLayoutManager();
        this.q = scrollToTopLinearLayoutManager;
        this.p.af(scrollToTopLinearLayoutManager);
        this.aa.m(loadingFrameLayout);
        this.aa.i(new ogc(this));
        this.au = this.o.findViewById(R.id.set_bar);
        this.av = this.o.findViewById(R.id.set_content);
        this.aw = this.o.findViewById(R.id.playlist_entry_point_container);
        if ((view instanceof NextGenWatchLayout) && !evr.aI(this.aE)) {
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.a).inflate(R.layout.engagement_panel_lower_view, (ViewGroup) null);
            RelativeLayout relativeLayout2 = (RelativeLayout) LayoutInflater.from(this.a).inflate(R.layout.engagement_panel_root_view, (ViewGroup) null);
            ((NextGenWatchLayout) view).v(relativeLayout2, relativeLayout);
            this.e.j(relativeLayout2, relativeLayout);
            this.e.g().a(this.ab);
            this.e.t(this);
        }
        ogt x = muf.x(new yzr(this.o.findViewById(R.id.scrim)));
        x.a(this.e);
        oip oipVar = new oip(loadingFrameLayout, this.au, this.av, this.aw, this.e, x, this.V);
        this.n = oipVar;
        boolean aI = evr.aI(this.aE);
        oipVar.f = new oin(oipVar);
        final int i3 = 1;
        if (aI) {
            oipVar.a.a.X(new oim(oipVar, i3));
        } else {
            oipVar.j(oipVar.e);
        }
        this.aG.b(this.n);
        this.n.a(this.aG.b);
        wnc wncVar = new wnc(this.a, this.C, this.I, this.L, new ArrayList(), new ArrayList());
        this.v = wncVar;
        this.K.a = wncVar;
        oid oidVar = this.Y;
        int i4 = 0;
        while (true) {
            aeb aebVar = oidVar.b;
            if (i4 >= aebVar.b) {
                break;
            }
            wncVar.b((wmy) aebVar.b(i4));
            i4++;
        }
        int i5 = 0;
        while (true) {
            aeb aebVar2 = oidVar.a;
            if (i5 >= aebVar2.b) {
                break;
            }
            wncVar.a.add((wnb) aebVar2.b(i5));
            i5++;
        }
        wncVar.b(new mee(wncVar.i, wncVar.j, wncVar.h, wncVar.k));
        ajos ajosVar = (ajos) this.O.get();
        ajosVar.f(frp.class, new frq(this.a, this.ah, this.aP, null, null, null, null));
        this.s = new ajti(new Supplier(this) { // from class: ofu
            public final /* synthetic */ DefaultWatchPanelViewController a;

            {
                this.a = this;
            }

            @Override // j$.util.function.Supplier
            public final Object get() {
                if (i3 != 0) {
                    DefaultWatchPanelViewController defaultWatchPanelViewController = this.a;
                    if (!defaultWatchPanelViewController.u(defaultWatchPanelViewController.a.getResources().getConfiguration())) {
                        if (defaultWatchPanelViewController.h) {
                            r1 = mcy.C(defaultWatchPanelViewController.a);
                        } else {
                            r1 = defaultWatchPanelViewController.a.getResources().getInteger(R.integer.horizontal_shelf_num_columns);
                        }
                    }
                    return Integer.valueOf(r1);
                }
                DefaultWatchPanelViewController defaultWatchPanelViewController2 = this.a;
                return Integer.valueOf(defaultWatchPanelViewController2.u(defaultWatchPanelViewController2.a.getResources().getConfiguration()) ? 1 : defaultWatchPanelViewController2.a.getResources().getInteger(R.integer.grid_shelf_num_columns));
            }
        });
        ajti ajtiVar = new ajti(new Supplier(this) { // from class: ofu
            public final /* synthetic */ DefaultWatchPanelViewController a;

            {
                this.a = this;
            }

            @Override // j$.util.function.Supplier
            public final Object get() {
                if (i2 != 0) {
                    DefaultWatchPanelViewController defaultWatchPanelViewController = this.a;
                    if (!defaultWatchPanelViewController.u(defaultWatchPanelViewController.a.getResources().getConfiguration())) {
                        if (defaultWatchPanelViewController.h) {
                            r1 = mcy.C(defaultWatchPanelViewController.a);
                        } else {
                            r1 = defaultWatchPanelViewController.a.getResources().getInteger(R.integer.horizontal_shelf_num_columns);
                        }
                    }
                    return Integer.valueOf(r1);
                }
                DefaultWatchPanelViewController defaultWatchPanelViewController2 = this.a;
                return Integer.valueOf(defaultWatchPanelViewController2.u(defaultWatchPanelViewController2.a.getResources().getConfiguration()) ? 1 : defaultWatchPanelViewController2.a.getResources().getInteger(R.integer.grid_shelf_num_columns));
            }
        });
        this.t = ajtiVar;
        oic oicVar = this.S;
        ajti ajtiVar2 = this.s;
        Context context = (Context) oicVar.a.get();
        context.getClass();
        jas jasVar = (jas) oicVar.b.get();
        jasVar.getClass();
        ypa ypaVar = (ypa) oicVar.c.get();
        ypaVar.getClass();
        ajvb ajvbVar = (ajvb) oicVar.d.get();
        ajvbVar.getClass();
        zaw zawVar = (zaw) oicVar.e.get();
        zawVar.getClass();
        acra acraVar = (acra) oicVar.f.get();
        acraVar.getClass();
        azrw azrwVar = oicVar.g;
        azrw azrwVar2 = oicVar.h;
        azrw azrwVar3 = oicVar.i;
        ohx ohxVar = (ohx) oicVar.j.get();
        ohxVar.getClass();
        agqo agqoVar = (agqo) oicVar.k.get();
        agqoVar.getClass();
        ajyw ajywVar = (ajyw) oicVar.l.get();
        ajywVar.getClass();
        ajyw ajywVar2 = (ajyw) oicVar.m.get();
        ajywVar2.getClass();
        ajfh ajfhVar = (ajfh) oicVar.n.get();
        ajfhVar.getClass();
        ajfh ajfhVar2 = (ajfh) oicVar.o.get();
        ajfhVar2.getClass();
        ammv ammvVar = (ammv) oicVar.p.get();
        ammvVar.getClass();
        c cVar = (c) oicVar.q.get();
        cVar.getClass();
        ajyw ajywVar3 = (ajyw) oicVar.r.get();
        ajywVar3.getClass();
        ajtiVar2.getClass();
        oib oibVar = new oib(context, jasVar, ypaVar, ajvbVar, zawVar, acraVar, azrwVar, azrwVar2, azrwVar3, ohxVar, agqoVar, ajywVar, ajywVar2, ajfhVar, ajfhVar2, ammvVar, cVar, ajywVar3, ajtiVar2, ajtiVar, null, null, null, null, null);
        this.E.c = ammv.i(this.e);
        lwk lwkVar = this.aJ;
        ajlx ajlxVar = this.aj;
        RecyclerView recyclerView = this.p;
        jas jasVar2 = this.E;
        acra acraVar2 = this.d;
        ajxa ajxaVar = ajxa.WI;
        ajwk ajwkVar = ajwk.d;
        ajhb ajhbVar = ajhb.WATCH;
        sxw sxwVar = this.am;
        Activity activity = this.a;
        fot a2 = fou.a();
        a2.a = this.aa;
        fou a3 = a2.a();
        ajoy ajoyVar = (ajoy) lwkVar.g.get();
        ajoyVar.getClass();
        ajvq ajvqVar = (ajvq) lwkVar.j.get();
        ajvqVar.getClass();
        ypa ypaVar2 = (ypa) lwkVar.e.get();
        ypaVar2.getClass();
        zaw zawVar2 = (zaw) lwkVar.f.get();
        zawVar2.getClass();
        ((aadw) lwkVar.h.get()).getClass();
        aaea aaeaVar = (aaea) lwkVar.b.get();
        aaeaVar.getClass();
        sqq sqqVar = (sqq) lwkVar.c.get();
        sqqVar.getClass();
        ((syd) lwkVar.d.get()).getClass();
        ajgq ajgqVar = (ajgq) lwkVar.i.get();
        ajgqVar.getClass();
        azrw azrwVar4 = lwkVar.l;
        aypn aypnVar = (aypn) lwkVar.k.get();
        aypnVar.getClass();
        ejq ejqVar = (ejq) lwkVar.a.get();
        ejqVar.getClass();
        recyclerView.getClass();
        acraVar2.getClass();
        ajosVar.getClass();
        ajhbVar.getClass();
        sxwVar.getClass();
        gmk gmkVar = new gmk(ajoyVar, ajvqVar, ypaVar2, zawVar2, aaeaVar, sqqVar, ajgqVar, azrwVar4, aypnVar, ejqVar, null, ajlxVar, recyclerView, jasVar2, oibVar, acraVar2, ajosVar, ajxaVar, ajwkVar, 0, ajhbVar, sxwVar, ajhj.a, activity, a3, new ArrayDeque());
        this.r = gmkVar;
        etx.b(gmkVar);
        this.r.u(fav.m());
        this.r.u(new ogd(this, 0));
        this.r.u(new ldg(2));
        this.r.u(new ogd(this, 1, null));
        this.p.aD(this.Y.c.a);
        ajpd ajpdVar = this.Q.a;
        this.r.L(ajpdVar);
        ajpdVar.lX(new oge(this, ajpdVar));
        this.v.f.add(this.Q);
        this.r.s = this.ax;
        if (TextUtils.isEmpty(this.g)) {
            ohh ohhVar = new ohh(this.n);
            ohg ohgVar = this.P;
            oip oipVar2 = this.n;
            View view2 = this.au;
            View view3 = this.av;
            acra b = this.d.b(ohhVar);
            Activity activity2 = (Activity) ohgVar.a.get();
            activity2.getClass();
            ahey aheyVar = (ahey) ohgVar.b.get();
            aheyVar.getClass();
            oiy oiyVar = (oiy) ohgVar.c.get();
            oiyVar.getClass();
            aadw aadwVar = (aadw) ohgVar.d.get();
            aadwVar.getClass();
            ahey aheyVar2 = (ahey) ohgVar.e.get();
            aheyVar2.getClass();
            aoae aoaeVar = (aoae) ohgVar.f.get();
            aoaeVar.getClass();
            aaea aaeaVar2 = (aaea) ohgVar.g.get();
            aaeaVar2.getClass();
            oipVar2.getClass();
            view2.getClass();
            view3.getClass();
            b.getClass();
            this.az = new ohf(activity2, aheyVar, oiyVar, aadwVar, aheyVar2, aoaeVar, aaeaVar2, oipVar2, view2, view3, b, null, null, null, null, null);
            ohhVar.b(new acry() { // from class: ofx
                @Override // defpackage.acry
                public final void a() {
                    DefaultWatchPanelViewController defaultWatchPanelViewController = DefaultWatchPanelViewController.this;
                    defaultWatchPanelViewController.r();
                    defaultWatchPanelViewController.c.a(defaultWatchPanelViewController.d);
                }
            });
        } else {
            ohx ohxVar2 = this.aF;
            oip oipVar3 = this.n;
            View view4 = this.aw;
            String str = this.g;
            aahd aahdVar = (aahd) ohxVar2.d.get();
            aahdVar.getClass();
            ogx ogxVar = (ogx) ohxVar2.f.get();
            ogxVar.getClass();
            azrw azrwVar5 = ohxVar2.e;
            azrw azrwVar6 = ohxVar2.b;
            ahey aheyVar3 = (ahey) ohxVar2.k.get();
            aheyVar3.getClass();
            acra acraVar3 = (acra) ohxVar2.h.get();
            acraVar3.getClass();
            nqp nqpVar = (nqp) ohxVar2.g.get();
            nqpVar.getClass();
            fgq fgqVar = (fgq) ohxVar2.i.get();
            fgqVar.getClass();
            gpe gpeVar = (gpe) ohxVar2.j.get();
            gpeVar.getClass();
            ahqr ahqrVar = (ahqr) ohxVar2.c.get();
            ahqrVar.getClass();
            acrt acrtVar = (acrt) ohxVar2.a.get();
            acrtVar.getClass();
            oipVar3.getClass();
            view4.getClass();
            str.getClass();
            this.az = new ogn(aahdVar, ogxVar, azrwVar5, azrwVar6, aheyVar3, acraVar3, nqpVar, fgqVar, gpeVar, ahqrVar, acrtVar, oipVar3, view4, str, null, null);
            this.u = new oha(this.aw, this.e);
        }
        off offVar = new off(this.a.getResources().getDimensionPixelSize(R.dimen.autonav_scroll_cancel_padding), this.e, this.ai, this.U, this.n, this.Q, this.Z, this.p, this.r);
        this.ay = offVar;
        offVar.d.aD(offVar);
        offVar.b.d(offVar);
        if (ofe.h(offVar.b.b)) {
            offVar.c.i(offVar);
        }
        offVar.a.g().a(offVar);
        ajyw ajywVar4 = this.aM;
        Activity activity3 = this.a;
        ViewStub viewStub = (ViewStub) this.o.findViewById(R.id.info_cards_drawer);
        ofe ofeVar = this.ai;
        Activity activity4 = (Activity) ajywVar4.a.get();
        activity4.getClass();
        aabq aabqVar = (aabq) ajywVar4.b.get();
        aabqVar.getClass();
        aabn aabnVar = (aabn) ajywVar4.c.get();
        aabnVar.getClass();
        viewStub.getClass();
        ofeVar.getClass();
        this.aA = new oik(activity4, aabqVar, aabnVar, activity3, viewStub, ofeVar);
        this.aC = this.al.a.A(nxb.t).n().X(new ofs(this, 0));
        if (fyzVar != null) {
            if (fyzVar.d()) {
                q((ViewGroup) ((fxu) fyzVar).a);
            } else {
                fyzVar.b(new fyy() { // from class: ofr
                    @Override // defpackage.fyy
                    public final void a(View view5) {
                        DefaultWatchPanelViewController.this.q((ViewGroup) view5);
                    }
                });
            }
        }
        if (aheVar != null) {
            int childCount = this.o.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = this.o.getChildAt(childCount);
                if (childAt.getLayoutParams() instanceof ahh) {
                    ((ahh) childAt.getLayoutParams()).b(aheVar);
                }
            }
        }
        if (nzcVar != null) {
            this.i = nzcVar;
            adlt adltVar = (adlt) this.aO.a.get();
            adltVar.getClass();
            this.ap = new nzm(adltVar, nzcVar);
            c cVar2 = this.aH;
            fgq fgqVar2 = (fgq) cVar2.b.get();
            fgqVar2.getClass();
            gjz gjzVar = (gjz) cVar2.a.get();
            gjzVar.getClass();
            view.getClass();
            int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.flexy_minimum_metadata_view_height);
            i = R.id.set_bar;
            this.aq = new nyy(fgqVar2, gjzVar, view, dimensionPixelOffset, nzcVar);
            this.ai.d(this.ap);
            this.ai.c(this.ap);
            this.ai.d(this.aq);
            akht akhtVar = this.aL;
            fku fkuVar = (fku) akhtVar.a.get();
            fkuVar.getClass();
            xjl xjlVar = (xjl) akhtVar.b.get();
            xjlVar.getClass();
            PlaybackLifecycleMonitor playbackLifecycleMonitor = (PlaybackLifecycleMonitor) akhtVar.e.get();
            playbackLifecycleMonitor.getClass();
            aadw aadwVar2 = (aadw) akhtVar.d.get();
            aadwVar2.getClass();
            nze nzeVar = (nze) akhtVar.c.get();
            nzeVar.getClass();
            final nzl nzlVar = (nzl) nzcVar;
            nyw nywVar = new nyw(fkuVar, xjlVar, playbackLifecycleMonitor, aadwVar2, nzeVar, nzlVar);
            this.k = nywVar;
            this.ai.d(nywVar);
            this.ai.c(this.k);
            nzlVar.g = new gnc(view);
            aqvj aqvjVar = this.aI.b.b().C;
            if (aqvjVar == null) {
                aqvjVar = aqvj.a;
            }
            if (aqvjVar.a(45352688L)) {
                aoot aootVar = aqvjVar.b;
                if (!aootVar.containsKey(45352688L)) {
                    throw new IllegalArgumentException();
                }
                aqvk aqvkVar = (aqvk) aootVar.get(45352688L);
                bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
            } else {
                bool = false;
            }
            if (bool.booleanValue()) {
                final int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.watch_panel_playlist_entry_point_height);
                this.aD = this.n.d.n().X(new ayrs() { // from class: ogb
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        nzl nzlVar2 = nzl.this;
                        int i6 = dimensionPixelSize;
                        if (true != ((Boolean) obj).booleanValue()) {
                            i6 = 0;
                        }
                        if (nzlVar2.n == i6) {
                            return;
                        }
                        nzlVar2.n = i6;
                        nzlVar2.D(nzlVar2.p, nzlVar2.o);
                        nzlVar2.F(nzlVar2.c.isRunning() ? nzlVar2.p / nzlVar2.q : nzlVar2.i, true, false);
                    }
                });
            }
            nyu nyuVar = new nyu(nzcVar, this.aE);
            this.l = nyuVar;
            this.ai.c(nyuVar);
            this.as = new nun() { // from class: ofv
                @Override // defpackage.nun
                public final void g(nqg nqgVar) {
                    aqts l;
                    DefaultWatchPanelViewController defaultWatchPanelViewController = DefaultWatchPanelViewController.this;
                    nyu nyuVar2 = defaultWatchPanelViewController.l;
                    if (nyuVar2 != null) {
                        nyuVar2.b = nqgVar;
                        nyuVar2.b();
                    }
                    boolean z = false;
                    if (nqgVar != null && (l = nqgVar.l()) != null && !TextUtils.isEmpty(defaultWatchPanelViewController.g) && defaultWatchPanelViewController.g.equals(oba.i(l))) {
                        z = true;
                    }
                    nyw nywVar2 = defaultWatchPanelViewController.k;
                    if (nywVar2 != null) {
                        nywVar2.b = z;
                    }
                }
            };
            this.e.g().a(this.as);
            oir oirVar = new oir() { // from class: ofw
                @Override // defpackage.oir
                public final void a(boolean z) {
                    nyu nyuVar2 = DefaultWatchPanelViewController.this.l;
                    if (nyuVar2 != null) {
                        nyuVar2.a = z;
                        nyuVar2.b();
                    }
                }
            };
            this.ar = oirVar;
            this.aG.b(oirVar);
        } else {
            i = R.id.set_bar;
        }
        this.w = new gna((StickyHeaderContainer) this.o.findViewById(R.id.sticky_header_container), (vw) this.r.g, new ohz(this.r.f));
        if (Build.VERSION.SDK_INT >= 22) {
            this.p.setAccessibilityTraversalAfter(i);
        }
        return this;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (!this.U.g().b()) {
            abic abicVar = (abic) this.T.get();
            if (abicVar.e != null) {
                ((abht) abicVar.a.get()).w(abicVar.e.b());
                ((abhc) abicVar.b.get()).c(abicVar.e.a());
            }
        }
        r();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.oex
    public final void oY(ofa ofaVar, ofa ofaVar2) {
        if (ofaVar != null) {
            this.R.d(ofaVar.h.c());
            ofaVar.j(this);
            ofaVar.i((this.ao.isEmpty() || ((LoadingFrameLayout) this.ao.get(0)).e != 2 || this.q.J() <= 0) ? null : this.r.p());
        }
        if (ofaVar2 != null) {
            ofaVar2.g(this);
        }
        C(ofaVar2 != null ? ofaVar2.h : null);
        g(ofaVar2, 127);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }

    @Override // defpackage.ojb
    public final void p(ofa ofaVar) {
        this.ai.e(ofaVar);
    }

    public final void q(ViewGroup viewGroup) {
        WatchNextResponseModel b;
        ofz ofzVar;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setBackgroundColor(wbs.W(this.a, R.attr.ytBrandBackgroundSolid).orElse(0));
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) viewGroup;
        oif d = this.aK.d(loadingFrameLayout, true);
        ajoy ajoyVar = this.aN;
        RecyclerView recyclerView = (RecyclerView) loadingFrameLayout.findViewById(R.id.watch_info_watch_list);
        azrw azrwVar = this.O;
        ajoy ajoyVar2 = this.W;
        acra acraVar = this.d;
        ajwi ajwiVar = this.r;
        ohy ohyVar = (ohy) ajoyVar.a.get();
        ohyVar.getClass();
        recyclerView.getClass();
        azrwVar.getClass();
        acraVar.getClass();
        ajwiVar.getClass();
        recyclerView.getContext();
        this.ax = new ofq(recyclerView, new LinearLayoutManager(), ohyVar, azrwVar, ajoyVar2, acraVar, ajwiVar, viewGroup);
        ofa ofaVar = this.ai.a;
        if (ofaVar == null) {
            loadingFrameLayout.e();
        } else {
            aigr aigrVar = ofaVar.f;
            if (aigrVar != null) {
                if (ofa.k(aigrVar)) {
                    flh flhVar = this.N;
                    flhVar.getClass();
                    ofzVar = new ofz(flhVar, 0);
                } else {
                    flh flhVar2 = this.N;
                    flhVar2.getClass();
                    ofzVar = new ofz(flhVar2, 1);
                }
                loadingFrameLayout.f(ofzVar);
                d.a = ofzVar;
                d.a(aigrVar);
            } else {
                if (!this.ao.isEmpty()) {
                    int i = ((LoadingFrameLayout) this.ao.get(0)).e;
                    if (i == 1) {
                        loadingFrameLayout.c();
                    } else if (i == 2) {
                        loadingFrameLayout.a();
                    }
                }
                loadingFrameLayout.e();
            }
            if (ofaVar.c() != null) {
                b = ofaVar.c();
            } else {
                b = ofaVar.b();
            }
            this.ax.b(b);
        }
        v(loadingFrameLayout);
        this.an.add(d);
        Configuration configuration = this.y;
        if (configuration != null) {
            this.ax.a(configuration);
        }
        ajwi ajwiVar2 = this.r;
        if (ajwiVar2 != null) {
            ajwiVar2.s = this.ax;
        }
    }

    public final void r() {
        this.M.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0193 A[EDGE_INSN: B:80:0x0193->B:71:0x0193 BREAK  A[LOOP:5: B:57:0x014f->B:78:0x014f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel r6, defpackage.acsm r7) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController.s(com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel, acsm):void");
    }

    public final void t() {
        Runnable runnable;
        if ((this.x.a(ahqo.LOGGED_ATTACH_WATCH_NEXT) || this.aB == null) && (runnable = this.aB) != null) {
            runnable.run();
            this.aB = null;
        }
    }

    public final boolean u(Configuration configuration) {
        return configuration != null && yjk.aa(this.a) && configuration.orientation == 2 && !this.z;
    }

    @Override // defpackage.nvc
    public final void x(boolean z, zcg zcgVar) {
        if (z) {
            this.n.g(8, zcgVar);
        } else {
            this.n.d(8, zcgVar);
        }
    }

    @Override // defpackage.nvc
    public final void y(nqg nqgVar) {
        h(nqgVar);
    }

    @Override // defpackage.nvc
    public final void z(nqg nqgVar) {
        i(nqgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a4  */
    @Override // defpackage.oez
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.ofa r8, int r9) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController.g(ofa, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [xjj, oan, adue, fgp] */
    private final void B() {
        ?? r1 = this.j;
        if (r1 != 0) {
            final oad oadVar = (oad) r1;
            final int i = 2;
            boolean z = false;
            Object[] objArr = 0;
            if (!oadVar.C) {
                final int i2 = 1;
                oadVar.C = true;
                if (evr.au(oadVar.D)) {
                    oadVar.o.c();
                    oadVar.o.g(oadVar.r.kI(oadVar.n));
                } else {
                    oadVar.q.g(oadVar.r);
                }
                oadVar.l.b(r1);
                oas oasVar = oadVar.j;
                if (evr.au(oasVar.k)) {
                    oasVar.i.c();
                    oasVar.i.g(oasVar.kI(oasVar.h));
                } else {
                    oasVar.j.g(oasVar);
                }
                oadVar.p.d(oadVar.n.G().f.X(new ayrs() { // from class: nzw
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int i3 = i2;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                oadVar.v.c(Boolean.valueOf(ahbl.d(((aigr) obj).i)));
                                return;
                            }
                            oad oadVar2 = oadVar;
                            int intValue = ((Integer) obj).intValue();
                            if (intValue != -1) {
                                oadVar2.i.e(intValue);
                                return;
                            }
                            return;
                        }
                        oad oadVar3 = oadVar;
                        int intValue2 = ((Integer) obj).intValue();
                        int i4 = oadVar3.b;
                        if (intValue2 != i4) {
                            if (i4 == 1) {
                                oadVar3.B = null;
                            }
                            oadVar3.b = intValue2;
                            if (intValue2 == 0) {
                                oadVar3.j.i(ControlsOverlayStyle.a);
                                oadVar3.E.a(false, true);
                                oadVar3.d();
                            } else {
                                if (intValue2 != 1) {
                                    return;
                                }
                                oadVar3.j.i(ControlsOverlayStyle.i);
                                oadVar3.E.a(true, true);
                                oadVar3.f(oadVar3.B);
                                oadVar3.h.b(null);
                            }
                        }
                    }
                }));
                ayqw ayqwVar = oadVar.p;
                aypn n = aypn.sm(oadVar.u, oadVar.t, oadVar.v, gii.l).n();
                final Object[] objArr2 = objArr == true ? 1 : 0;
                ayqwVar.d(n.Y(new ayrs() { // from class: nzw
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int i3 = objArr2;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                oadVar.v.c(Boolean.valueOf(ahbl.d(((aigr) obj).i)));
                                return;
                            }
                            oad oadVar2 = oadVar;
                            int intValue = ((Integer) obj).intValue();
                            if (intValue != -1) {
                                oadVar2.i.e(intValue);
                                return;
                            }
                            return;
                        }
                        oad oadVar3 = oadVar;
                        int intValue2 = ((Integer) obj).intValue();
                        int i4 = oadVar3.b;
                        if (intValue2 != i4) {
                            if (i4 == 1) {
                                oadVar3.B = null;
                            }
                            oadVar3.b = intValue2;
                            if (intValue2 == 0) {
                                oadVar3.j.i(ControlsOverlayStyle.a);
                                oadVar3.E.a(false, true);
                                oadVar3.d();
                            } else {
                                if (intValue2 != 1) {
                                    return;
                                }
                                oadVar3.j.i(ControlsOverlayStyle.i);
                                oadVar3.E.a(true, true);
                                oadVar3.f(oadVar3.B);
                                oadVar3.h.b(null);
                            }
                        }
                    }
                }, nua.k));
                oadVar.p.d(aypn.e(oadVar.n.G().i, oadVar.t, new ayro() { // from class: nzv
                    @Override // defpackage.ayro
                    public final Object a(Object obj, Object obj2) {
                        int i3;
                        oad oadVar2 = oad.this;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        switch (((ahej) obj).a()) {
                            case 2:
                            case 5:
                                i3 = 1;
                                break;
                            case 3:
                            case 4:
                            case 6:
                                i3 = oadVar2.c(false, booleanValue);
                                break;
                            case 7:
                                i3 = 3;
                                break;
                            case 8:
                                i3 = 2;
                                break;
                            default:
                                i3 = -1;
                                break;
                        }
                        return Integer.valueOf(i3);
                    }
                }).n().Y(new ayrs() { // from class: nzw
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int i3 = i;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                oadVar.v.c(Boolean.valueOf(ahbl.d(((aigr) obj).i)));
                                return;
                            }
                            oad oadVar2 = oadVar;
                            int intValue = ((Integer) obj).intValue();
                            if (intValue != -1) {
                                oadVar2.i.e(intValue);
                                return;
                            }
                            return;
                        }
                        oad oadVar3 = oadVar;
                        int intValue2 = ((Integer) obj).intValue();
                        int i4 = oadVar3.b;
                        if (intValue2 != i4) {
                            if (i4 == 1) {
                                oadVar3.B = null;
                            }
                            oadVar3.b = intValue2;
                            if (intValue2 == 0) {
                                oadVar3.j.i(ControlsOverlayStyle.a);
                                oadVar3.E.a(false, true);
                                oadVar3.d();
                            } else {
                                if (intValue2 != 1) {
                                    return;
                                }
                                oadVar3.j.i(ControlsOverlayStyle.i);
                                oadVar3.E.a(true, true);
                                oadVar3.f(oadVar3.B);
                                oadVar3.h.b(null);
                            }
                        }
                    }
                }, nua.k));
                oadVar.k.a(r1);
                oadVar.m.i(r1);
            }
            oad oadVar2 = (oad) this.j;
            if (TextUtils.isEmpty(oadVar2.g.getText()) && ((ainy) oadVar2.c.get()).o() != null) {
                ainy ainyVar = (ainy) oadVar2.c.get();
                aixh o = ainyVar.o();
                PlayerResponseModel c = o != null ? o.c() : null;
                if (c != null) {
                    oadVar2.j.j(o.b(), 0L, TimeUnit.SECONDS.toMillis(c.a()), o.a());
                    oadVar2.f(c.x());
                    if (oadVar2.x.j == 2) {
                        oadVar2.h.b(c.w());
                    }
                    z = c.F();
                }
                oadVar2.i.e(oadVar2.c(ainyVar.d(), z));
            }
        }
    }
}
