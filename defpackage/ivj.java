package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_TransformAlphaActionBarColor;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.navigation.HomePageMonitor;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.u;
import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.EngagementPanelSectionListRendererOuterClass;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ivj extends ivn implements nlo, nlm, ajxa, gek, nln, yfi, ito, ypd {
    public static final /* synthetic */ int cs = 0;
    private static final amsx ct = amsx.t("FEnotifications_inbox", "FEactivity", "FEhistory");
    private static final amsx cu = amsx.s("FEpremium_member_hub", "FEconnections");
    ajmi a;
    public fzr aA;
    public gnf aC;
    gng aD;
    public aaue aE;
    public izr aF;
    public axpg aG;
    public ajjz aH;
    public zaw aI;
    public shf aJ;
    public azrw aK;
    public ypa aL;
    public ajvb aM;
    public afzq aN;
    public Handler aO;
    public azrw aP;
    public afzp aQ;
    public AppTabsBar aR;
    public nmc aS;
    public Set aT;
    public nko aU;
    public aahd aV;
    public azrw aW;
    public mad aX;
    public zbi aY;
    public aaea aZ;
    public gfi ae;
    public CharSequence af;
    public boolean ag;
    public boolean ah;
    public int aj;
    protected long ak;
    public axpg al;
    public lza am;
    public boolean az;
    public Resources b;
    public mbn bA;
    public mbb bB;
    public mdq bC;
    public sxw bD;
    public ajti bE;
    public ajzi bF;
    public aksl bG;
    public gni bH;
    public its bI;
    public nqp bJ;
    public mfr bK;
    public axpg bL;
    public zgi bM;
    public HomePageMonitor bN;
    public boolean bQ;
    public acra bT;
    public lso bU;
    public aadw bV;
    public fab bW;
    public rxm bX;
    public axzg bY;
    public aifh bZ;
    public InlinePlaybackLifecycleController ba;
    public ajxj bb;
    public ActiveStateScrollSelectionController bc;
    public ajxj bd;
    public mgs be;
    public mgs bf;
    public jei bg;
    public zki bh;
    public aamb bi;
    public ajoy bj;
    public akcp bk;
    public jsk bl;
    public fjm bm;
    public acpl bn;
    public azrw bo;
    public ScheduledExecutorService bp;
    public gdz bq;
    public gej br;
    public azrw bs;
    public azrw bt;
    public Optional bu;
    public azrw bv;
    public nka bw;
    public acsy bx;
    public fgz by;
    public LayerableFilterEntityController bz;
    private ajvd cA;
    private BrowseResponseModel cC;
    private aveh cD;
    private String cE;
    private luc cG;
    private ajxe cH;
    private ayqx cI;
    private boolean cM;
    private boolean cO;
    private ive cP;
    private boolean cQ;
    private ajpd cR;
    private ayqx cS;
    private ivm cT;
    private Set cU;
    private acsx cV;
    private long cW;
    private ScheduledFuture cY;
    private ViewGroup cZ;
    public abwz ca;
    public oiy cb;
    public agqo cc;
    public ohg cd;
    public ogx ce;
    public akht cf;
    public akht cg;
    public akht ch;
    public akht ci;
    public ajyw cj;
    public ajyw ck;
    public ajyw cl;
    public aoae cm;
    public ajoy cn;
    public ajoy co;
    public ajoy cp;
    public aoae cq;
    public ajoy cr;
    private itq cv;
    private Context cw;
    private ivf cx;
    protected gab d;
    private String da;
    protected nmq e;
    private final azrs cy = azrl.e().aT();
    private final azrs cz = azrh.aN(Optional.empty()).aT();
    public Optional c = Optional.empty();
    private Optional cB = Optional.empty();
    public apxf ai = apxf.a;
    private final List cF = new ArrayList();
    private final ayqw cJ = new ayqw();
    private final List cK = new ArrayList();
    private ayqx cL = aynu.d();
    private byte[] cN = new byte[0];
    public ActionBarColor an = gfw.k(R.attr.ytBrandBackgroundSolid);
    public ActionBarColor ao = gfw.k(R.attr.ytStatusBarBackground);
    public ActionBarColor aw = gfw.k(R.attr.ytTextPrimary);
    public ActionBarColor ax = gfw.k(R.attr.ytTextSecondary);
    public ActionBarColor ay = gfw.k(R.attr.ytIconActiveOther);
    public boolean aB = true;
    private final AtomicBoolean cX = new AtomicBoolean(false);
    public apxf bO = apxf.a;
    public Optional bP = Optional.empty();
    public int bR = 0;
    public int bS = 0;
    private final View.OnLayoutChangeListener db = new View.OnLayoutChangeListener() { // from class: itt
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ivj ivjVar = ivj.this;
            ivjVar.bR = view.getWidth();
            ivjVar.bS = view.getHeight();
        }
    };
    private final gaa dc = new ivc(this, 1);

    public static final nlf bB() {
        nle a = nlf.a();
        a.d(gfw.i(R.color.theme_main_tab_text_color_activated));
        a.e(gfw.i(R.color.theme_main_tab_text_color_normal));
        a.b(gfw.i(R.color.yt_grey3));
        a.f(gfw.i(R.color.yt_grey4));
        a.c(gfw.i(R.color.theme_main_tab_text_color_activated));
        return a.a();
    }

    private static int bG(Bundle bundle, String str, final Context context) {
        return ((Integer) Optional.ofNullable(bundle.getParcelable(str)).filter(ghv.l).map(ham.u).map(new Function() { // from class: ium
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                Context context2 = context;
                int i = ivj.cs;
                return Integer.valueOf(((ActionBarColor) obj).le(context2));
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).orElse(0)).intValue();
    }

    private final lij bH() {
        lij e;
        lza lzaVar = this.am;
        return (lzaVar == null || (e = lzaVar.e()) == null) ? this.cc.b(this, this.ci.g(null, null), null, mM()) : e;
    }

    private static nlf bI(asnf asnfVar) {
        nle a = nlf.a();
        a.d(gfw.j(asnfVar.e));
        a.e(gfw.j(asnfVar.f));
        a.b(gfw.j(asnfVar.b));
        a.f(gfw.j(asnfVar.c));
        a.c(gfw.j(asnfVar.e));
        return a.a();
    }

    private final nlf bJ() {
        nle a = nlf.a();
        a.d(this.as.m);
        a.e(this.as.o);
        a.b(this.as.j);
        a.f(this.as.k);
        a.c(this.as.a.d);
        return a.a();
    }

    private final aamd bK() {
        aveh g = this.e.g();
        if (g == null) {
            return null;
        }
        aved avedVar = g.k;
        if (avedVar == null) {
            avedVar = aved.a;
        }
        if ((avedVar.b & 1) == 0) {
            return null;
        }
        aved avedVar2 = g.k;
        if (avedVar2 == null) {
            avedVar2 = aved.a;
        }
        auov auovVar = avedVar2.c;
        if (auovVar == null) {
            auovVar = auov.a;
        }
        return new aamd(auovVar);
    }

    private final acsc bL() {
        String T = whu.T(s());
        if (T == null) {
            return acsb.b(6827);
        }
        aswb aswbVar = this.aZ.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if (!aswbVar.az || !bX()) {
            if (((T.hashCode() == 714505897 && T.equals("FEred_originals_home")) ? (char) 0 : (char) 65535) == 0) {
                return acsb.b(34388);
            }
            return acsb.b(6827);
        }
        return acsb.b(3854);
    }

    private final Object bM() {
        return this.cB.map(iup.o).orElse(null);
    }

    private final void bN() {
        mbn mbnVar = this.bA;
        if (mbnVar != null) {
            mbnVar.h();
        }
        this.cJ.c();
        ayqx ayqxVar = this.cI;
        if (ayqxVar != null) {
            ayqxVar.qc();
        }
        this.bC.f();
        ajwi f = this.e.f();
        if (f != null) {
            f.h();
        }
    }

    private final void bO() {
        atgn atgnVar;
        atvy atvyVar;
        atgn atgnVar2;
        apxf apxfVar = this.ai;
        mM().e(bL(), acrs.DEFAULT, apxfVar, adyu.cg(apxfVar, asit.b), adyu.cg(apxfVar, asit.a));
        mM().n(new acqx(acsb.c(22156)));
        lza lzaVar = this.am;
        final fzs a = lzaVar == null ? null : lzaVar.a();
        if (a != null) {
            Optional.ofNullable(mM().c()).map(iur.b).ifPresent(new Consumer() { // from class: iug
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    fzs.this.e((String) obj);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
            a.f();
        }
        mM().n(new acqx(acsb.c(10349)));
        this.da = mM().k();
        arss arssVar = ((oor) this.bv.get()).d().a;
        if (arssVar != null && (arssVar.b & 16) != 0) {
            mM().D(new acqx(arssVar.e.I()));
            if (arssVar.d.size() != 0) {
                for (arst arstVar : arssVar.d) {
                    if (arstVar.b == 123267149) {
                        atgnVar = (atgn) arstVar.c;
                    } else {
                        atgnVar = atgn.a;
                    }
                    if ((atgnVar.b & 4) != 0) {
                        acra mM = mM();
                        if (arstVar.b == 123267149) {
                            atgnVar2 = (atgn) arstVar.c;
                        } else {
                            atgnVar2 = atgn.a;
                        }
                        mM.u(new acqx(atgnVar2.c), null);
                    }
                    if (arstVar.b == 117866661) {
                        atvyVar = (atvy) arstVar.c;
                    } else {
                        atvyVar = atvy.a;
                    }
                    Collection.EL.stream(atvyVar.b).map(iur.d).filter(ghv.k).map(iur.f).map(iur.g).forEach(new iuh(this, 7));
                }
            }
        }
        lij bH = bH();
        if (evr.aa(this.aZ)) {
            Optional.ofNullable(mM().c()).map(iur.b).ifPresent(new iuj(bH));
            bH.j = bL().a;
        }
        this.bT = mM();
    }

    private final void bP() {
        Optional.ofNullable(this.cY).ifPresent(iwu.b);
        this.cY = null;
    }

    private final void bQ(boolean z, Optional optional) {
        boolean l;
        ivf ivfVar;
        mgr q = q();
        Cfor p = p();
        ajxe ajxeVar = null;
        if (z && (ivfVar = this.cx) != null) {
            ajxeVar = ivfVar.r;
        }
        aamd bK = bK();
        final mbn mbnVar = this.bA;
        if (bK == null || mbnVar == null || p == null || q == null || !bx(q, p)) {
            return;
        }
        acra mM = mM();
        fzb fzbVar = (fzb) this.al.get();
        if (mM == null) {
            mM = acra.l;
        }
        String T = whu.T(s());
        fzbVar.getClass();
        if (ajxeVar != null) {
            l = mbnVar.q(ajxeVar, q, mM);
        } else {
            l = mbnVar.l(bK, q, mM);
        }
        if (!l) {
            fzbVar.i();
            if (mcy.f(T) || mcy.e(T)) {
                mcy.b(fzbVar, mbnVar, q, p, mM, T);
                return;
            }
            return;
        }
        fzm a = mcy.a(mbnVar, q, p);
        a.a = T;
        a.e(((Boolean) optional.map(new Function() { // from class: mcg
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(mbn.this.c().contains((String) obj));
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue());
        fzbVar.m(a.a());
        mcy.b(fzbVar, mbnVar, q, p, mM, T);
    }

    private final void bR(boolean z) {
        mgr q = q();
        Cfor p = p();
        if (q == null || p == null) {
            return;
        }
        acra r = r();
        this.cJ.c();
        this.cJ.d(p.c.L(gsv.t).ax(new itu(this, 0)));
        this.cJ.d(this.bC.c().ax(new itu(this, 6)));
        q.y(new iuw(this, q));
        aamd bK = bK();
        boolean i = this.bC.i();
        ajxe ajxeVar = (ajxe) Optional.ofNullable(this.cx).map(iup.g).orElse(null);
        if (z) {
            if (ajxeVar != null) {
                this.bC.m(ajxeVar, q, r);
            }
        } else if (bK != null && mcy.D(bK)) {
            this.bC.l(bK, q, r);
        }
        if (i != this.bC.i()) {
            bm();
        }
    }

    private final void bS() {
        aveh g = this.e.g();
        if (this.e == null || g == null) {
            return;
        }
        mbb mbbVar = this.bB;
        avef avefVar = g.i;
        if (avefVar == null) {
            avefVar = avef.a;
        }
        if ((avefVar.b & 64) != 0) {
            avef avefVar2 = g.i;
            if (avefVar2 == null) {
                avefVar2 = avef.a;
            }
            avea aveaVar = avefVar2.e;
            if (aveaVar == null) {
                aveaVar = avea.a;
            }
            aulq aulqVar = aveaVar.c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aqrf aqrfVar = (aqrf) aulqVar.pX(ElementRendererOuterClass.elementRenderer);
            fzw fzwVar = new fzw();
            if (aqrfVar != null) {
                fzwVar.a = aqrfVar;
                if ((aveaVar.b & 2) == 0) {
                    mbbVar.a.c(Optional.empty());
                } else {
                    String str = aveaVar.d;
                    fzwVar.b = str;
                    mbbVar.a.c(Optional.of(str));
                }
                aqrf aqrfVar2 = fzwVar.a;
                if (aqrfVar2 == null) {
                    throw new IllegalStateException("Missing required properties: elementRenderer");
                }
                mbbVar.b = new fzx(aqrfVar2, fzwVar.b);
                bm();
                if (this.cS == null) {
                    final mbb mbbVar2 = this.bB;
                    this.cS = mbbVar2.a.aj(new ayrv() { // from class: maz
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            final akpa akpaVar = mbb.this.c;
                            akpaVar.getClass();
                            return (ayqb) ((Optional) obj).map(new Function() { // from class: mba
                                @Override // j$.util.function.Function
                                public final /* synthetic */ Function andThen(Function function) {
                                    return Function.CC.$default$andThen(this, function);
                                }

                                @Override // j$.util.function.Function
                                public final Object apply(Object obj2) {
                                    return akpa.this.a.a.L(new nsg((String) obj2, 5)).Y(afly.t);
                                }

                                @Override // j$.util.function.Function
                                public final /* synthetic */ Function compose(Function function) {
                                    return Function.CC.$default$compose(this, function);
                                }
                            }).orElse(aypy.I());
                        }
                    }).ax(new itu(this, 5));
                    return;
                }
                return;
            }
            throw new NullPointerException("Null elementRenderer");
        }
        mbbVar.b = null;
        mbbVar.a.c(Optional.empty());
    }

    private final void bT(boolean z) {
        if (z) {
            this.cO = this.bi.a();
            nko nkoVar = this.aU;
            fwh fwhVar = nkoVar.d;
            if (fwhVar != null) {
                fwhVar.a = null;
            }
            fwh fwhVar2 = nkoVar.e;
            if (fwhVar2 != null) {
                fwhVar2.a = null;
            }
            fwh fwhVar3 = nkoVar.f;
            if (fwhVar3 != null) {
                fwhVar3.a = null;
            }
            fwh fwhVar4 = nkoVar.g;
            if (fwhVar4 != null) {
                fwhVar4.a = null;
            }
            fwh fwhVar5 = nkoVar.h;
            if (fwhVar5 != null) {
                fwhVar5.a = null;
            }
            nkoVar.b.a(null);
            gnv gnvVar = nkoVar.c;
            if (gnvVar != null) {
                gnvVar.a(null);
            }
            Iterator it = this.cU.iterator();
            while (it.hasNext()) {
                this.bk.g((String) it.next());
            }
            this.cU.clear();
        }
        this.az = false;
        this.cQ = false;
        this.e.k();
        ((fzb) this.al.get()).g();
        mbn mbnVar = this.bA;
        if (mbnVar != null) {
            mbnVar.h();
        }
        this.cJ.c();
        ayqx ayqxVar = this.cI;
        if (ayqxVar != null) {
            ayqxVar.qc();
        }
        this.bC.f();
        ((SpecificNetworkErrorViewLoadingFrameLayout) this.c.get()).g();
        gfi gfiVar = this.ae;
        gfiVar.e();
        gfiVar.b();
        gfh gfhVar = gfiVar.c;
        gfhVar.a.clear();
        gfhVar.b.clear();
        gfiVar.e = null;
        gfiVar.f = null;
        Optional.ofNullable(gfiVar.i).ifPresent(gfd.a);
        Optional.ofNullable(gfiVar.j).ifPresent(gfd.c);
        Iterator it2 = this.cF.iterator();
        while (it2.hasNext()) {
            ((Cfor) it2.next()).b();
        }
        this.cF.clear();
        bm();
    }

    private final void bU() {
        if (TextUtils.equals(whu.T(s()), "FEwhat_to_watch")) {
            bP();
            long d = this.ak - this.aJ.d();
            ScheduledExecutorService scheduledExecutorService = this.bp;
            iuc iucVar = new iuc(this, 3);
            if (d <= 0) {
                d = 0;
            }
            this.cY = scheduledExecutorService.schedule(iucVar, d, TimeUnit.MILLISECONDS);
        }
    }

    private final void bV() {
        nlf bJ;
        apra apraVar;
        atdc atdcVar;
        atdc atdcVar2;
        asnf asnfVar;
        atdc atdcVar3;
        atdc atdcVar4;
        Object bM = bM();
        BrowseResponseModel browseResponseModel = this.cC;
        if (bM instanceof apna) {
            apna apnaVar = (apna) bM;
            apmy apmyVar = apnaVar.u;
            if (apmyVar == null) {
                apmyVar = apmy.a;
            }
            if (apmyVar.b == 66439850) {
                atdcVar2 = (atdc) apmyVar.c;
            } else {
                atdcVar2 = atdc.a;
            }
            if (atdcVar2.c.size() > 0) {
                apmy apmyVar2 = apnaVar.u;
                if (apmyVar2 == null) {
                    apmyVar2 = apmy.a;
                }
                if (apmyVar2.b == 66439850) {
                    atdcVar3 = (atdc) apmyVar2.c;
                } else {
                    atdcVar3 = atdc.a;
                }
                if ((((atda) atdcVar3.c.get(0)).b & 1) != 0 && !this.cQ) {
                    mad madVar = this.aX;
                    apmy apmyVar3 = apnaVar.u;
                    if (apmyVar3 == null) {
                        apmyVar3 = apmy.a;
                    }
                    if (apmyVar3.b == 66439850) {
                        atdcVar4 = (atdc) apmyVar3.c;
                    } else {
                        atdcVar4 = atdc.a;
                    }
                    madVar.c(atdcVar4);
                    this.cQ = true;
                }
            }
            ml mlVar = this.ap;
            apmv apmvVar = apnaVar.h;
            if (apmvVar == null) {
                apmvVar = apmv.a;
            }
            if (apmvVar.b != 131084815) {
                avgg avggVar = apnaVar.i;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                if (!ahbw.L(avggVar) || mlVar == null) {
                    br(bB());
                    return;
                }
                if (this.cP == null) {
                    this.cP = new ive(this);
                }
                ajjz ajjzVar = this.aH;
                avgg avggVar2 = apnaVar.i;
                if (avggVar2 == null) {
                    avggVar2 = avgg.a;
                }
                ajjzVar.l(ahbw.E(avggVar2), yki.c(mlVar, this.cP));
                return;
            }
            apmv apmvVar2 = apnaVar.h;
            if (apmvVar2 == null) {
                apmvVar2 = apmv.a;
            }
            if (apmvVar2.b == 131084815) {
                asnfVar = (asnf) apmvVar2.c;
            } else {
                asnfVar = asnf.a;
            }
            br(bI(asnfVar));
            return;
        }
        if (browseResponseModel != null) {
            arjq arjqVar = browseResponseModel.a.d;
            if (arjqVar == null) {
                arjqVar = arjq.a;
            }
            if (arjqVar.b == 361905772) {
                arjq arjqVar2 = browseResponseModel.a.d;
                if (arjqVar2 == null) {
                    arjqVar2 = arjq.a;
                }
                if (arjqVar2.b == 361905772) {
                    apraVar = (apra) arjqVar2.c;
                } else {
                    apraVar = apra.a;
                }
                apqz apqzVar = apraVar.d;
                if (apqzVar == null) {
                    apqzVar = apqz.a;
                }
                if (apqzVar.b == 66439850) {
                    atdcVar = (atdc) apqzVar.c;
                } else {
                    atdcVar = atdc.a;
                }
                if (atdcVar.c.size() > 0 && (((atda) atdcVar.c.get(0)).b & 1) != 0 && !this.cQ) {
                    this.aX.c(atdcVar);
                    this.cQ = true;
                }
                br(bJ());
                return;
            }
        }
        if (bM instanceof aubg) {
            aubg aubgVar = (aubg) bM;
            if ((aubgVar.b & 256) != 0) {
                asnf asnfVar2 = aubgVar.l;
                if (asnfVar2 == null) {
                    asnfVar2 = asnf.a;
                }
                bJ = bI(asnfVar2);
            } else {
                bJ = bJ();
            }
        } else if (bM instanceof avjy) {
            avjy avjyVar = (avjy) bM;
            if (bD() == 3) {
                nle a = nlf.a();
                a.d(this.as.m);
                a.e(this.as.o);
                ActionBarColor actionBarColor = this.as.j;
                actionBarColor.getClass();
                amkq.H(true, "alpha value must be between 0 and 255 inclusive, was %s", 179);
                a.b(new AutoValue_ActionBarColor_TransformAlphaActionBarColor(actionBarColor, 179));
                a.f(this.as.k);
                a.c(this.as.m);
                bJ = a.a();
            } else {
                nle a2 = nlf.a();
                a2.d(gfw.j(avjyVar.e));
                a2.e(gfw.j(avjyVar.f));
                a2.b(gfw.j(avjyVar.c));
                a2.f(gfw.j(avjyVar.d));
                a2.c(gfw.j(avjyVar.e));
                bJ = a2.a();
            }
        } else if (bM instanceof avzc) {
            nle a3 = nlf.a();
            a3.d(gfw.k(R.attr.ytTextPrimary));
            a3.e(gfw.k(R.attr.ytTextSecondary));
            a3.b(gfw.k(R.attr.ytBrandBackgroundSolid));
            a3.f(gfw.k(R.attr.ytIconDisabled));
            a3.c(gfw.k(R.attr.ytIconActiveOther));
            bJ = a3.a();
        } else {
            bJ = bJ();
        }
        br(bJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x053a  */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [byte[], luc] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bW(java.util.List r55, java.lang.Object r56, int r57) {
        /*
            Method dump skipped, instructions count: 2103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivj.bW(java.util.List, java.lang.Object, int):void");
    }

    private final boolean bX() {
        return amkq.b(whu.T(s()), "FEwhat_to_watch");
    }

    private final boolean bY() {
        return ((Boolean) this.cB.map(iup.n).orElse(false)).booleanValue();
    }

    private final boolean bZ() {
        return yjk.aa(qW()) && evr.aN(this.bV) && bX();
    }

    private final nky ca(BrowseResponseModel browseResponseModel) {
        apra apraVar;
        auvc auvcVar;
        apna apnaVar;
        arjq arjqVar = browseResponseModel.a.d;
        if (arjqVar == null) {
            arjqVar = arjq.a;
        }
        if ((browseResponseModel.a.b & 2) == 0) {
            return null;
        }
        int i = arjqVar.b;
        if (i == 46407682) {
            oiy oiyVar = this.cb;
            acra mM = mM();
            if (arjqVar.b == 46407682) {
                apnaVar = (apna) arjqVar.c;
            } else {
                apnaVar = apna.a;
            }
            apna apnaVar2 = apnaVar;
            aahd aahdVar = (aahd) oiyVar.b.get();
            aahdVar.getClass();
            ohg ohgVar = (ohg) oiyVar.c.get();
            ohgVar.getClass();
            ajyw ajywVar = (ajyw) oiyVar.d.get();
            akvq akvqVar = (akvq) oiyVar.f.get();
            akvqVar.getClass();
            Executor executor = (Executor) oiyVar.e.get();
            executor.getClass();
            hak hakVar = (hak) oiyVar.a.get();
            hakVar.getClass();
            mM.getClass();
            browseResponseModel.getClass();
            apnaVar2.getClass();
            return new nli(aahdVar, ohgVar, ajywVar, akvqVar, executor, hakVar, mM, browseResponseModel, apnaVar2, null, null, null, null);
        }
        if (i == 50236216) {
            akht akhtVar = this.cg;
            acra mM2 = mM();
            aahd aahdVar2 = (aahd) akhtVar.a.get();
            aahdVar2.getClass();
            ypa ypaVar = (ypa) akhtVar.d.get();
            ypaVar.getClass();
            mda mdaVar = (mda) akhtVar.b.get();
            mdaVar.getClass();
            ohg ohgVar2 = (ohg) akhtVar.c.get();
            ohgVar2.getClass();
            ajyw ajywVar2 = (ajyw) akhtVar.e.get();
            mM2.getClass();
            browseResponseModel.getClass();
            return new nlt(aahdVar2, ypaVar, mdaVar, ohgVar2, ajywVar2, mM2, browseResponseModel, null, null, null, null);
        }
        if (i == 156098381) {
            akht akhtVar2 = this.cf;
            acra mM3 = mM();
            aahd aahdVar3 = (aahd) akhtVar2.a.get();
            aahdVar3.getClass();
            ypa ypaVar2 = (ypa) akhtVar2.d.get();
            ypaVar2.getClass();
            mda mdaVar2 = (mda) akhtVar2.b.get();
            mdaVar2.getClass();
            ohg ohgVar3 = (ohg) akhtVar2.c.get();
            ohgVar3.getClass();
            ajyw ajywVar3 = (ajyw) akhtVar2.e.get();
            mM3.getClass();
            browseResponseModel.getClass();
            return new nmr(aahdVar3, ypaVar2, mdaVar2, ohgVar3, ajywVar3, mM3, browseResponseModel, null, null, null, null);
        }
        if (i == 53272665) {
            return this.aS.a((aubg) arjqVar.c, browseResponseModel);
        }
        if (i == 101397128) {
            ajyw ajywVar4 = this.cj;
            acra mM4 = mM();
            if (arjqVar.b == 101397128) {
                auvcVar = (auvc) arjqVar.c;
            } else {
                auvcVar = auvc.a;
            }
            auvc auvcVar2 = auvcVar;
            aahd aahdVar4 = (aahd) ajywVar4.a.get();
            aahdVar4.getClass();
            ohg ohgVar4 = (ohg) ajywVar4.c.get();
            ohgVar4.getClass();
            ajyw ajywVar5 = (ajyw) ajywVar4.b.get();
            mM4.getClass();
            browseResponseModel.getClass();
            auvcVar2.getClass();
            return new nme(aahdVar4, ohgVar4, ajywVar5, mM4, browseResponseModel, auvcVar2, null, null, null, null);
        }
        if (i == 102883021) {
            akht akhtVar3 = this.ch;
            acra mM5 = mM();
            aahd aahdVar5 = (aahd) akhtVar3.a.get();
            aahdVar5.getClass();
            mda mdaVar3 = (mda) akhtVar3.b.get();
            mdaVar3.getClass();
            ypa ypaVar3 = (ypa) akhtVar3.d.get();
            ypaVar3.getClass();
            ohg ohgVar5 = (ohg) akhtVar3.c.get();
            ohgVar5.getClass();
            ajyw ajywVar6 = (ajyw) akhtVar3.e.get();
            mM5.getClass();
            browseResponseModel.getClass();
            return new nll(aahdVar5, mdaVar3, ypaVar3, ohgVar5, ajywVar6, mM5, browseResponseModel, null, null, null, null);
        }
        if (i == 155144651) {
            arfn arfnVar = (arfn) arjqVar.c;
            arfnVar.getClass();
            return new nlk(arfnVar);
        }
        if (i == 155554693) {
            ajoy ajoyVar = this.cn;
            avjy avjyVar = (avjy) arjqVar.c;
            mad madVar = (mad) ajoyVar.a.get();
            madVar.getClass();
            avjyVar.getClass();
            return new nmg(madVar, avjyVar);
        }
        if (i == 126869174) {
            auzf auzfVar = (auzf) arjqVar.c;
            auzfVar.getClass();
            return new nmf(auzfVar);
        }
        if (i == 217771576) {
            aqbd aqbdVar = (aqbd) arjqVar.c;
            aqbdVar.getClass();
            return new nlj(aqbdVar);
        }
        if (i == 188799247) {
            ajoy ajoyVar2 = this.co;
            asiw asiwVar = (asiw) arjqVar.c;
            mad madVar2 = (mad) ajoyVar2.a.get();
            madVar2.getClass();
            asiwVar.getClass();
            return new nlu(madVar2, asiwVar);
        }
        if (i != 361905772) {
            return null;
        }
        ohg ohgVar6 = this.cd;
        acra mM6 = mM();
        if (arjqVar.b == 361905772) {
            apraVar = (apra) arjqVar.c;
        } else {
            apraVar = apra.a;
        }
        apra apraVar2 = apraVar;
        aahd aahdVar6 = (aahd) ohgVar6.a.get();
        aahdVar6.getClass();
        ohg ohgVar7 = (ohg) ohgVar6.g.get();
        ohgVar7.getClass();
        ajyw ajywVar7 = (ajyw) ohgVar6.f.get();
        akvq akvqVar2 = (akvq) ohgVar6.b.get();
        akvqVar2.getClass();
        Executor executor2 = (Executor) ohgVar6.e.get();
        executor2.getClass();
        hak hakVar2 = (hak) ohgVar6.c.get();
        hakVar2.getClass();
        ((ajfh) ohgVar6.d.get()).getClass();
        mM6.getClass();
        browseResponseModel.getClass();
        apraVar2.getClass();
        return new nls(aahdVar6, ohgVar7, ajywVar7, akvqVar2, executor2, hakVar2, mM6, browseResponseModel, apraVar2, null, null, null, null);
    }

    private final void cb(nky nkyVar) {
        this.cB.ifPresent(gfd.t);
        Optional ofNullable = Optional.ofNullable(nkyVar);
        this.cB = ofNullable;
        ofNullable.ifPresent(new iuh(this, 6));
    }

    private final void cc(nky nkyVar) {
        if (nkyVar != null) {
            this.af = nkyVar.c();
            this.ag = nkyVar.i();
            this.ah = nkyVar.h();
        } else {
            this.af = null;
            this.ag = false;
            this.ah = false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Optional.ofNullable(this.O).ifPresent(new iuh(this, 1));
        }
    }

    @Override // defpackage.ce
    public final void T(int i, int i2, Intent intent) {
        if (!evr.aa(this.aZ) || intent == null) {
            return;
        }
        int i3 = 1000;
        if (i == 1000) {
            if (i2 == -1) {
                bH().b(intent);
                return;
            }
            i = 1000;
        }
        if (i != 1000) {
            i3 = i;
        } else if (i2 == 1) {
            String stringExtra = intent.getStringExtra("AssistantCsn");
            String str = this.da;
            aone createBuilder = atmc.a.createBuilder();
            createBuilder.copyOnWrite();
            atmc atmcVar = (atmc) createBuilder.instance;
            atmcVar.b |= 2;
            atmcVar.d = 22156;
            if (stringExtra != null) {
                createBuilder.copyOnWrite();
                atmc atmcVar2 = (atmc) createBuilder.instance;
                atmcVar2.b = 1 | atmcVar2.b;
                atmcVar2.c = stringExtra;
            }
            if (!str.isEmpty()) {
                createBuilder.copyOnWrite();
                atmc atmcVar3 = (atmc) createBuilder.instance;
                str.getClass();
                atmcVar3.b |= 32;
                atmcVar3.f = str;
            }
            aong aongVar = (aong) this.ai.toBuilder();
            aongVar.e(atmb.b, (atmc) createBuilder.build());
            apxf apxfVar = (apxf) aongVar.build();
            mM().e(bL(), acrs.DEFAULT, apxfVar, adyu.cg(apxfVar, asit.b), adyu.cg(apxfVar, asit.a));
            mM().n(new acqx(acsb.c(22156)));
            this.da = mM().k();
            if (evr.aa(this.aZ)) {
                bH();
                lij bH = bH();
                Optional.ofNullable(mM().c()).map(iur.b).ifPresent(new iuj(bH));
                bH.j = bL().a;
            }
        }
        this.bx.m(asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        super.T(i3, i2, intent);
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        Iterator it = this.cF.iterator();
        while (it.hasNext()) {
            ((Cfor) it.next()).b();
        }
        this.bC.e();
    }

    @Override // defpackage.ce
    public final void Y(int i, String[] strArr, int[] iArr) {
        if (evr.aa(this.aZ)) {
            bH().a(i, strArr, iArr);
        }
    }

    @Override // defpackage.gir, defpackage.ce
    public final void Z() {
        this.bZ.a.d(new fdn());
        super.Z();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01f5 A[Catch: all -> 0x027a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0013, B:7:0x0158, B:9:0x015c, B:11:0x0164, B:13:0x016b, B:14:0x0170, B:17:0x021e, B:19:0x022e, B:22:0x0237, B:24:0x0178, B:26:0x0182, B:27:0x0184, B:29:0x0188, B:31:0x0192, B:32:0x0194, B:35:0x01eb, B:37:0x01f5, B:38:0x01f7, B:39:0x01a9, B:40:0x01ae, B:51:0x01b2, B:54:0x01bc, B:57:0x01c6, B:60:0x01d0, B:63:0x023a, B:66:0x0248, B:67:0x024f, B:69:0x0258, B:71:0x025c, B:72:0x0260, B:74:0x026c, B:75:0x026e, B:81:0x001c, B:83:0x0071, B:84:0x0073, B:86:0x0082, B:88:0x0092, B:90:0x00a0, B:93:0x00ad, B:94:0x00ba, B:96:0x00c9, B:97:0x00cb, B:99:0x00d6, B:101:0x00da, B:102:0x00dc, B:103:0x00e5, B:105:0x00f4, B:106:0x00f7, B:108:0x00fd, B:110:0x0105, B:112:0x0109, B:114:0x010d, B:115:0x012d, B:117:0x013f, B:119:0x0143, B:120:0x0145, B:122:0x014d, B:123:0x0151, B:124:0x0155, B:125:0x00e1), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void aF(defpackage.iuz r18) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivj.aF(iuz):void");
    }

    public final void aG(boolean z) {
        this.ae.c(z);
    }

    public final void aH(boolean z) {
        aI(this.ai, z);
    }

    public final void aI(apxf apxfVar, boolean z) {
        apxfVar.getClass();
        if (this.O == null) {
            return;
        }
        this.cy.c(izr.p(this.aE.e(), apxfVar, z, this.bh, this.bV, this.bs, this.bt, this.aZ));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void aJ(boolean r12, boolean r13, long r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivj.aJ(boolean, boolean, long):void");
    }

    @Override // defpackage.gir
    public final gad aM(gad gadVar) {
        return (gad) ayqj.F(gadVar).G(new itw(this, 0)).G(new itw(this, 1)).G(new itw(this, 2)).X();
    }

    @Override // defpackage.gir
    public final aypy aO() {
        return this.cz.Y(ism.u);
    }

    @Override // defpackage.gir
    public final aypy aP() {
        return aypy.R(new iuf(this, 1));
    }

    @Override // defpackage.gir
    public final aypy aQ() {
        return aypy.R(new iuf(this, 0));
    }

    @Override // defpackage.gir
    public final CharSequence aS() {
        return this.af;
    }

    @Override // defpackage.gir
    public final Object aT() {
        if (this.cM) {
            return null;
        }
        amru amruVar = (amru) Collection.EL.stream((List) Optional.ofNullable(this.e).map(iup.s).orElse(amru.q())).map(iup.r).collect(ampm.a);
        gab gabVar = this.d;
        return new ivf(amruVar, gabVar != null ? gabVar.a() : 0, this.cN, this.cC, this.af, this.ag, this.ah, this.ak, this.an, this.ao, this.aw, this.ax, this.ay, this.cO, this.bO, this.bP, (ajxe) Optional.ofNullable(this.cG).map(iup.h).orElse(null), (ajxe) Optional.ofNullable(this.bA).map(iup.i).orElse(null), this.bC.b(), (amru) Optional.ofNullable(this.bK).map(iup.j).orElse(amru.q()), amru.o(this.cK));
    }

    @Override // defpackage.gir
    public final String aU() {
        return this.cE;
    }

    @Override // defpackage.gir, defpackage.gka
    public final void aV(int i) {
        new yqw(this.X).c().L(gsv.u).Y(new itw(this, 4)).L(iub.a).Y(ism.s).ax(new u(i, 1));
    }

    @Override // defpackage.gir
    public final void aW() {
        mbn mbnVar;
        if (!bX() || (mbnVar = this.bA) == null) {
            return;
        }
        mbnVar.p();
    }

    @Override // defpackage.gir
    public final void aX() {
        aH(true);
    }

    @Override // defpackage.gir
    public final void aY(Object obj) {
        if (obj instanceof ivf) {
            this.cx = (ivf) obj;
        }
    }

    @Override // defpackage.gir
    public final void aZ(boolean z) {
        ajpd ajpdVar;
        fzr fzrVar;
        this.aB = z;
        if (!ba() || (ajpdVar = this.cR) == null || (fzrVar = this.aA) == null) {
            return;
        }
        if (!this.aB) {
            ajpdVar.remove(fzrVar);
        } else {
            if (ajpdVar.contains(fzrVar)) {
                return;
            }
            this.cR.add(0, this.aA);
        }
    }

    public final boolean bA() {
        return bD() == 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bC() {
        Iterator it = this.cF.iterator();
        while (it.hasNext()) {
            ((Cfor) it.next()).c(1);
        }
    }

    final int bD() {
        return evr.bW(s(), this.aZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gir
    public final boolean be() {
        Boolean bool;
        gab gabVar = this.d;
        if (gabVar == null || !gabVar.i()) {
            return false;
        }
        this.d.h();
        aqvj aqvjVar = this.bY.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45359224L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45359224L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45359224L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            Optional.ofNullable(p()).ifPresent(gfd.r);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r0.b.d == false) goto L6;
     */
    @Override // defpackage.gir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean bf() {
        /*
            r4 = this;
            ivm r0 = r4.cT
            mwt r1 = r0.b
            boolean r1 = r1.j()
            r2 = 1
            if (r1 == 0) goto L16
            mwt r1 = r0.b
            r1.a()
            mwt r1 = r0.b
            boolean r1 = r1.d
            if (r1 != 0) goto L23
        L16:
            gnx r1 = r0.e
            boolean r1 = r1.d()
            if (r1 == 0) goto L24
            gnx r0 = r0.e
            r0.a()
        L23:
            return r2
        L24:
            nqp r0 = r4.bJ
            boolean r0 = r0.x()
            if (r0 == 0) goto L32
            nqp r0 = r4.bJ
            r0.l()
            return r2
        L32:
            mbn r0 = r4.bA
            if (r0 == 0) goto L3e
            boolean r0 = r0.p()
            if (r0 != 0) goto L3d
            goto L3e
        L3d:
            return r2
        L3e:
            mdq r0 = r4.bC
            boolean r0 = r0.j()
            if (r0 == 0) goto L47
            return r2
        L47:
            nmq r0 = r4.e
            mjq r1 = defpackage.mjq.p
            java.lang.Object r0 = r0.h(r1)
            lxu r0 = (defpackage.lxu) r0
            if (r0 == 0) goto L64
            boolean r1 = r0.g
            if (r1 != 0) goto L58
            goto L64
        L58:
            aone r1 = r0.i
            if (r1 == 0) goto L64
            boolean r3 = r0.h
            if (r3 == 0) goto L64
            r0.s(r1)
            return r2
        L64:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivj.bf():boolean");
    }

    @Override // defpackage.nlm
    public final void bg() {
        bN();
    }

    @Override // defpackage.nlo
    public final void bh() {
        aH(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bi(cnq cnqVar) {
        String str;
        bO();
        if (this.bQ) {
            str = "Initial request failed.";
        } else {
            zfl a = this.aI.a(cnqVar);
            if (cnqVar instanceof cng) {
                bu();
            } else {
                boolean z = cnqVar instanceof cnb;
                int i = R.drawable.quantum_ic_error_outline_grey600_48;
                if (!z) {
                    if (1 == a.c) {
                        i = R.drawable.quantum_ic_cloud_off_grey600_48;
                    }
                    SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout) this.c.get();
                    String str2 = a.a;
                    fgw fgwVar = specificNetworkErrorViewLoadingFrameLayout.c;
                    fgwVar.getClass();
                    fgwVar.e(str2);
                    specificNetworkErrorViewLoadingFrameLayout.c.d(true);
                    specificNetworkErrorViewLoadingFrameLayout.c.b(false);
                    specificNetworkErrorViewLoadingFrameLayout.c.c(i);
                    specificNetworkErrorViewLoadingFrameLayout.h(3);
                } else if (((cnb) cnqVar).getCause() instanceof IOException) {
                    bu();
                } else {
                    SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout2 = (SpecificNetworkErrorViewLoadingFrameLayout) this.c.get();
                    String string = this.b.getString(R.string.auth_error_help_message);
                    fgw fgwVar2 = specificNetworkErrorViewLoadingFrameLayout2.c;
                    fgwVar2.getClass();
                    fgwVar2.e(string);
                    specificNetworkErrorViewLoadingFrameLayout2.c.c(R.drawable.quantum_ic_error_outline_grey600_48);
                    specificNetworkErrorViewLoadingFrameLayout2.c.d(false);
                    specificNetworkErrorViewLoadingFrameLayout2.c.b(true);
                    specificNetworkErrorViewLoadingFrameLayout2.h(3);
                }
            }
            evr.bX(mM(), a.b);
            str = "Logged VE for an initial request failure.";
        }
        this.bZ.a.d(new fdk());
        String valueOf = String.valueOf(cnqVar);
        StringBuilder sb = new StringBuilder(str.length() + 8 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(" Error: ");
        sb.append(valueOf);
        this.bM.b(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bj(apxf apxfVar) {
        acsx b;
        bT(true);
        this.cX.set(false);
        bw();
        this.bZ.a.d(new fdu());
        if (apxfVar == null || !apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint) || !((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).c.startsWith("VL")) {
            b = this.bI.k(PaneDescriptor.b(this)) ? this.bx.b(asmn.LATENCY_ACTION_LIBRARY) : null;
        } else {
            b = this.bx.b(asmn.LATENCY_ACTION_VIDEO_LIST);
        }
        if (b != null) {
            b.c("br_s");
        }
        this.cV = b;
        aJ(this.aJ.d() > this.ak, true, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bk(iuz iuzVar) {
        boolean z = iuzVar.e;
        this.bQ = z;
        if (iuzVar.c) {
            if (!z) {
                BrowseResponseModel browseResponseModel = iuzVar.b;
                bO();
                this.cN = (byte[]) Optional.ofNullable(browseResponseModel.d()).orElse(new byte[0]);
                this.by.a(mM(), browseResponseModel.a);
            }
            this.bZ.a.d(new fdp());
            acsx acsxVar = this.cV;
            if (acsxVar != null) {
                acsxVar.c(true != iuzVar.e ? "br_r" : "br_lrr");
            }
        }
        bT(false);
        bq(iuzVar.b.a);
    }

    protected void bl(ajwx ajwxVar) {
    }

    public final void bm() {
        this.aq = null;
        ((fzb) this.al.get()).j();
    }

    public final void bn(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aulq aulqVar = (aulq) it.next();
            if (aulqVar.pY(EngagementPanelSectionListRendererOuterClass.engagementPanelSectionListRenderer)) {
                this.bJ.p((aqts) aulqVar.pX(EngagementPanelSectionListRendererOuterClass.engagementPanelSectionListRenderer));
                this.cK.add(aulqVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bo() {
        this.d.e(new ivc(this, 0));
    }

    @Override // defpackage.nln
    public final void bp(Object obj, Object obj2) {
        ajpd ajpdVar = this.cR;
        if (ajpdVar != null) {
            ajpdVar.o(obj, obj2);
        }
    }

    public final void bq(arjv arjvVar) {
        aahd aahdVar = this.aV;
        amrp f = amru.f();
        f.j(arjvVar.n);
        f.j(arjvVar.o);
        aahdVar.b(f.g());
    }

    public final void br(nlf nlfVar) {
        this.an = gfw.j(nlfVar.c.le(qW()));
        this.ao = gfw.j(nlfVar.d.le(qW()));
        this.ay = gfw.j(nlfVar.e.le(qW()));
        this.aw = gfw.j(nlfVar.a.le(qW()));
        this.ax = gfw.j(nlfVar.b.le(qW()));
        bm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bs(apxf apxfVar) {
        apxfVar.getClass();
        this.ai = apxfVar;
    }

    public final void bt() {
        aqeq aqeqVar;
        if (av()) {
            gfi gfiVar = this.ae;
            gfb gfbVar = null;
            gfb gfbVar2 = (gfb) this.cB.filter(ghv.m).map(iup.l).map(iup.q).orElse(null);
            if (gfbVar2 == null) {
                mgr q = q();
                if (q != null && (aqeqVar = q.c) != null) {
                    gfbVar = new gez(aqeqVar);
                }
            } else {
                gfbVar = gfbVar2;
            }
            acra mM = mM();
            mM.getClass();
            gfiVar.k = mM;
            gfiVar.f(gfbVar);
        }
    }

    protected final void bu() {
        SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout) this.c.get();
        specificNetworkErrorViewLoadingFrameLayout.f = this.bT;
        specificNetworkErrorViewLoadingFrameLayout.h(5);
    }

    public final void bv() {
        Optional.ofNullable(this.a).ifPresent(gfd.u);
        this.a = null;
    }

    public final void bw() {
        if (C() == null) {
            return;
        }
        this.bE.b();
    }

    public final boolean bx(ajwi ajwiVar, Cfor cfor) {
        if (this.bA == null || ajwiVar == null || cfor == null) {
            return false;
        }
        if (this.e.i().size() == 1) {
            return true;
        }
        this.e.i().size();
        return false;
    }

    final boolean by() {
        apxf apxfVar = this.ai;
        if ((TextUtils.equals(whu.T(apxfVar), "FEactivity") && this.aQ.a("FEactivity") > 0) || TextUtils.equals(whu.T(apxfVar), "FEmy_videos")) {
            return true;
        }
        if (apxfVar == null || (((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).b & 64) == 0) {
            return this.ak != 0 && evr.aj(this.bV) != 0 && TextUtils.equals(whu.T(s()), "FEwhat_to_watch") && this.aJ.d() > this.ak;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean bz() {
        return (this.e == null || TextUtils.equals("FEactivity", whu.T(this.ai))) ? false : true;
    }

    @Override // defpackage.gek
    public final void d(boolean z) {
        Optional.ofNullable(this.br).ifPresent(new knr(z, 1));
    }

    @Override // defpackage.yfi
    public final void g() {
        aH(true);
    }

    @Override // defpackage.yfi
    public final void h() {
        aH(true);
    }

    @Override // defpackage.ito
    public void l() {
        if (n() == 5 || this.bQ) {
            lo();
        }
    }

    @Override // defpackage.gir, defpackage.ce
    public final void lZ() {
        lo loVar;
        super.lZ();
        ViewGroup viewGroup = this.cZ;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this.db);
            this.cZ = null;
        }
        this.c = Optional.empty();
        this.cL.qc();
        this.aF.j();
        gej gejVar = this.br;
        if (gejVar != null) {
            RecyclerView recyclerView = gejVar.c;
            if (recyclerView != null && (loVar = gejVar.d) != null) {
                recyclerView.aF(loVar);
            }
            gejVar.d = null;
            gejVar.c = null;
        }
        gdz gdzVar = this.bq;
        if (gdzVar.a.h()) {
            gdzVar.a();
        }
        gdzVar.d = null;
        gdzVar.e = null;
        gdzVar.c = acra.l;
        gdzVar.a.f();
        mbn mbnVar = this.bA;
        if (mbnVar != null) {
            mbnVar.i();
            this.cq.b.remove(this.bA);
        }
        this.cJ.c();
        ayqx ayqxVar = this.cI;
        if (ayqxVar != null) {
            ayqxVar.qc();
        }
        this.bC.f();
        nmq nmqVar = this.e;
        if (nmqVar != null) {
            nmqVar.j();
        }
        Object obj = this.cS;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.cS = null;
        }
    }

    @Override // defpackage.ajxa
    public void lo() {
        if (this.O == null) {
            return;
        }
        bN();
        bC();
        this.aO.post(new iuc(this, 0));
    }

    @Override // defpackage.ajxa
    public final boolean lp() {
        return true;
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        bP();
        this.aL.m(this);
        this.cB.ifPresent(gfd.t);
        nmq nmqVar = this.e;
        if (nmqVar != null) {
            afzp afzpVar = nmqVar.b;
            yjk.f();
            afzpVar.b.remove(nmqVar);
            ajwi f = nmqVar.f();
            if (f != null) {
                f.E();
            }
        }
        bv();
        gab gabVar = this.d;
        if (gabVar != null) {
            gabVar.g(this.dc);
        }
        ive iveVar = this.cP;
        if (iveVar != null) {
            iveVar.c();
        }
        this.aL.m(this.bg);
        bs(s());
        this.aL.m(this.aK.get());
        this.aL.m(this.bl);
        this.aL.m(this.bm);
        this.ae.f(null);
        this.cm.p(this);
    }

    @Override // defpackage.yfi
    public final void mJ(asfw asfwVar) {
        asjh asjhVar;
        Spanned spanned;
        avmv avmvVar;
        awhc awhcVar;
        aqyg aqygVar;
        awhc awhcVar2;
        aqzh aqzhVar;
        if (asfwVar != null) {
            ivm ivmVar = this.cT;
            if ((asfwVar.b & 2) != 0) {
                asfo asfoVar = asfwVar.d;
                if (asfoVar == null) {
                    asfoVar = asfo.a;
                }
                if (asfoVar.b == 162801955) {
                    aqzhVar = (aqzh) asfoVar.c;
                } else {
                    aqzhVar = aqzh.a;
                }
                if (ivmVar.c(aqzhVar)) {
                    return;
                }
            }
            asfo asfoVar2 = asfwVar.d;
            if (asfoVar2 == null) {
                asfoVar2 = asfo.a;
            }
            if (asfoVar2.b == 86135402) {
                asfo asfoVar3 = asfwVar.d;
                if (asfoVar3 == null) {
                    asfoVar3 = asfo.a;
                }
                if (asfoVar3.b == 86135402) {
                    asjhVar = (asjh) asfoVar3.c;
                } else {
                    asjhVar = asjh.a;
                }
            } else {
                asjhVar = null;
            }
            if (asjhVar == null) {
                asfo asfoVar4 = asfwVar.d;
                if (asfoVar4 == null) {
                    asfoVar4 = asfo.a;
                }
                if (asfoVar4.b == 62441981) {
                    asfo asfoVar5 = asfwVar.d;
                    if (asfoVar5 == null) {
                        asfoVar5 = asfo.a;
                    }
                    if (asfoVar5.b == 62441981) {
                        awhcVar = (awhc) asfoVar5.c;
                    } else {
                        awhcVar = awhc.a;
                    }
                    if ((awhcVar.b & 1) != 0) {
                        asfo asfoVar6 = asfwVar.d;
                        if (asfoVar6 == null) {
                            asfoVar6 = asfo.a;
                        }
                        if (asfoVar6.b == 62441981) {
                            awhcVar2 = (awhc) asfoVar6.c;
                        } else {
                            awhcVar2 = awhc.a;
                        }
                        aqygVar = awhcVar2.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    spanned = ajcq.b(aqygVar);
                } else {
                    spanned = null;
                }
                if (!TextUtils.isEmpty(spanned)) {
                    ivmVar.a.d(spanned.toString());
                }
                asfo asfoVar7 = asfwVar.d;
                if (asfoVar7 == null) {
                    asfoVar7 = asfo.a;
                }
                if (asfoVar7.b == 127387931) {
                    asfo asfoVar8 = asfwVar.d;
                    if (asfoVar8 == null) {
                        asfoVar8 = asfo.a;
                    }
                    if (asfoVar8.b == 127387931) {
                        avmvVar = (avmv) asfoVar8.c;
                    } else {
                        avmvVar = avmv.a;
                    }
                } else {
                    avmvVar = null;
                }
                if (avmvVar != null) {
                    ivmVar.c.mM().D(new acqx(asfwVar.g.I()));
                    yjj yjjVar = ivmVar.f;
                    yjj.i(avmvVar).qh(this.z, null);
                    return;
                }
            } else {
                if ((asfwVar.b & 16) != 0) {
                    ivmVar.c.mM().D(new acqx(asfwVar.g.I()));
                }
                ivmVar.e.b(asjhVar, new Pair("overlay_controller_param", new ajyc() { // from class: ivk
                    @Override // defpackage.ajyc
                    public final void oC(aong aongVar) {
                        ivj ivjVar = ivj.this;
                        int i = ((apmg) aongVar.instance).b;
                        if ((32768 & i) == 0 && (i & 16384) == 0 && (i & 8192) == 0) {
                            ivjVar.aH(true);
                        }
                    }
                }));
                return;
            }
        }
        aH(true);
    }

    @Override // defpackage.ce
    public void mQ(Bundle bundle) {
        bundle.putByteArray("navigation_endpoint", s().toByteArray());
        bundle.putParcelable("instance_action_bar_color", this.an);
        bundle.putParcelable("instance_status_bar_color", this.ao);
        bundle.putParcelable("instance_activated_text_color", this.aw);
        bundle.putParcelable("instance_secondary_text_color", this.ax);
        bundle.putInt("PREVIOUS_THEME", this.aD.c);
    }

    @Override // defpackage.gir, defpackage.ce
    public final void mR(Bundle bundle) {
        this.cW = SystemClock.elapsedRealtime();
        super.mR(bundle);
        amxd listIterator = ((amwf) this.aT).listIterator();
        while (listIterator.hasNext()) {
            this.X.b((aoj) listIterator.next());
        }
    }

    @Override // defpackage.gir, defpackage.ce
    public final void mS() {
        this.bZ.a.d(new fdo());
        super.mS();
        this.aL.g(this.aK.get());
        this.aL.g(this.bl);
        this.aL.g(this.bm);
        long d = this.aJ.d();
        long j = this.ak;
        if (this.cM || d > j || this.cO != this.bi.a()) {
            aH(by());
        } else {
            aJ(false, false, this.ak - d);
            if (this.cX.get()) {
                bU();
            }
        }
        this.aL.h(this, ivj.class);
        this.cB.ifPresent(gfd.s);
        nmq nmqVar = this.e;
        if (nmqVar != null) {
            nmqVar.n();
        }
        this.aj = 0;
        this.aO.postDelayed(new iuc(this, 1), 500L);
        this.aL.g(this.bg);
        bt();
        this.cm.o(this);
        Optional ofNullable = Optional.ofNullable(whu.T(s()));
        final LayerableFilterEntityController layerableFilterEntityController = this.bz;
        layerableFilterEntityController.getClass();
        ofNullable.ifPresent(new Consumer() { // from class: iuk
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                LayerableFilterEntityController.this.b = ammv.j((String) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.gir, defpackage.gek
    public final void mT() {
        gab gabVar = this.d;
        if (gabVar != null) {
            gabVar.h();
        }
    }

    @Override // defpackage.ce
    public View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        byte[] bArr;
        LayoutInflater layoutInflater2;
        this.b = qX();
        apxf c = aahg.c((byte[]) Optional.ofNullable(bundle != null ? bundle : this.m).map(iup.b).orElse(null));
        if ((bundle != null || ((atmc) c.pX(atmb.b)).c.isEmpty()) && (bArr = (byte[]) Optional.ofNullable(this.m).map(iup.a).orElse(null)) != null) {
            aone createBuilder = atmc.a.createBuilder();
            try {
                createBuilder.mergeFrom(bArr, aomw.b());
            } catch (aoob unused) {
            }
            aong aongVar = (aong) c.toBuilder();
            aongVar.e(atmb.b, (atmc) createBuilder.build());
            c = (apxf) aongVar.build();
        }
        bs(c);
        mbn mbnVar = this.bA;
        if (mbnVar != null) {
            this.cq.b.add(mbnVar);
        }
        if (bA()) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(qR(), R.style.Theme_YouTube_Dark_Home);
            this.cw = contextThemeWrapper;
            layoutInflater2 = layoutInflater.cloneInContext(contextThemeWrapper);
        } else {
            layoutInflater2 = layoutInflater;
        }
        this.aD = this.bH.a();
        if (viewGroup != null) {
            this.cZ = viewGroup;
            this.bR = viewGroup.getWidth();
            this.bS = viewGroup.getHeight();
            viewGroup.addOnLayoutChangeListener(this.db);
        }
        this.c = Optional.of((SpecificNetworkErrorViewLoadingFrameLayout) layoutInflater2.inflate(R.layout.browse_fragment, viewGroup, false));
        this.bq.c((!evr.aC(this.av) || viewGroup == null) ? (FrameLayout) this.c.get() : (FrameLayout) viewGroup, this, this, mM());
        long j = this.cW;
        if (j > 0) {
            this.bZ.a.d(new fdm(j));
            this.cW = 0L;
        }
        HashSet hashSet = new HashSet();
        this.cU = hashSet;
        abwz abwzVar = this.ca;
        Context context = (Context) abwzVar.j.get();
        context.getClass();
        zaw zawVar = (zaw) abwzVar.m.get();
        zawVar.getClass();
        nko nkoVar = (nko) abwzVar.h.get();
        nkoVar.getClass();
        mwt mwtVar = (mwt) abwzVar.b.get();
        mwtVar.getClass();
        HatsController hatsController = (HatsController) abwzVar.g.get();
        hatsController.getClass();
        MealbarPromoController mealbarPromoController = (MealbarPromoController) abwzVar.n.get();
        mealbarPromoController.getClass();
        acqz acqzVar = (acqz) abwzVar.d.get();
        acqzVar.getClass();
        akcp akcpVar = (akcp) abwzVar.i.get();
        akcpVar.getClass();
        ((evr) abwzVar.o.get()).getClass();
        aahd aahdVar = (aahd) abwzVar.k.get();
        aahdVar.getClass();
        gnx gnxVar = (gnx) abwzVar.c.get();
        gnxVar.getClass();
        fgo fgoVar = (fgo) abwzVar.f.get();
        fgoVar.getClass();
        nnb nnbVar = (nnb) abwzVar.a.get();
        nnbVar.getClass();
        yjj yjjVar = (yjj) abwzVar.l.get();
        yjjVar.getClass();
        ajzf ajzfVar = (ajzf) abwzVar.e.get();
        ajzfVar.getClass();
        this.cT = new ivm(context, zawVar, nkoVar, mwtVar, hatsController, mealbarPromoController, acqzVar, akcpVar, aahdVar, gnxVar, fgoVar, hashSet, nnbVar, yjjVar, ajzfVar, null, null);
        this.cv = new itq(this.aE, this.cT, this.bV, this.bs, this.aZ, this.bt, ammv.i((yfm) this.bu.orElse(null)));
        this.bJ.s();
        this.cK.clear();
        ((SpecificNetworkErrorViewLoadingFrameLayout) this.c.get()).i(new ivg(this));
        this.cA = (bA() ? this.bd : this.bb).a(this.cv, mM());
        this.ag = ((fzb) this.al.get()).p();
        int d = ((fzb) this.al.get()).d();
        int e = ((fzb) this.al.get()).e();
        int color = this.b.getColor(R.color.theme_main_tab_text_color_activated);
        int color2 = this.b.getColor(R.color.theme_main_tab_text_color_normal);
        if (bA()) {
            d = wbs.Q(qW(), R.attr.ytBrandBackgroundSolid);
            e = wbs.Q(qW(), R.attr.ytStatusBarBackground);
            color = wbs.Q(qW(), R.attr.ytTextPrimary);
            color2 = wbs.Q(qW(), R.attr.ytTextSecondary);
        }
        ml mlVar = this.ap;
        if (bundle != null && mlVar != null) {
            d = bG(bundle, "instance_action_bar_color", mlVar);
            e = bG(bundle, "instance_status_bar_color", mlVar);
            color = bG(bundle, "instance_activated_text_color", mlVar);
            color2 = bG(bundle, "instance_secondary_text_color", mlVar);
        }
        this.an = gfw.j(d);
        this.ao = gfw.j(e);
        this.aw = gfw.j(color);
        this.ax = gfw.j(color2);
        this.ay = this.as.a.d;
        this.e = this.ce.a(mM(), O(R.string.tab_with_new_content));
        int i = 3;
        int i2 = 4;
        this.cL = this.cy.G(new itu(this, i)).G(new itu(this, i2)).aj(new itw(this, i)).ax(new itu(this, 2));
        ivf ivfVar = this.cx;
        if (ivfVar == null || ivfVar.a.isEmpty() || by()) {
            this.cM = true;
        } else {
            bO();
            this.cN = this.cx.c;
            mM().D(new acqx(this.cN));
            BrowseResponseModel browseResponseModel = this.cx.d;
            this.cC = browseResponseModel;
            nky ca = browseResponseModel != null ? ca(browseResponseModel) : null;
            if (ca != null) {
                cb(ca);
            }
            cc(ca);
            ivf ivfVar2 = this.cx;
            this.af = ivfVar2.e;
            this.cH = ivfVar2.q;
            bW(ivfVar2.a, bM(), this.cx.b);
            ajwi f = this.e.f();
            if (f != null) {
                f.c();
            }
            ((SpecificNetworkErrorViewLoadingFrameLayout) this.c.get()).f();
            ivf ivfVar3 = this.cx;
            this.ag = ivfVar3.f;
            this.ah = ivfVar3.g;
            this.ak = ivfVar3.h;
            this.cO = ivfVar3.n;
            this.bO = ivfVar3.o;
            this.bP = ivfVar3.p;
            this.an = (ActionBarColor) Optional.ofNullable(ivfVar3.i).orElseGet(ghx.g);
            this.ao = (ActionBarColor) Optional.ofNullable(this.cx.j).orElseGet(ghx.h);
            this.aw = (ActionBarColor) Optional.ofNullable(this.cx.k).orElseGet(ghx.i);
            this.ax = (ActionBarColor) Optional.ofNullable(this.cx.l).orElseGet(ghx.j);
            this.ay = (ActionBarColor) Optional.ofNullable(this.cx.m).orElseGet(ghx.k);
            bV();
            this.cM = false;
            this.cX.set(true);
            this.bw.g((apxf) Optional.ofNullable(this.cC).map(iup.t).filter(ghv.n).map(iur.c).orElse(null));
            bS();
            bQ(true, Optional.empty());
            bR(true);
            ayqx ayqxVar = this.cI;
            if (ayqxVar != null) {
                ayqxVar.qc();
            }
            this.cI = (ayqx) Optional.ofNullable(p()).map(new Function() { // from class: iun
                @Override // j$.util.function.Function
                public final /* synthetic */ Function andThen(Function function) {
                    return Function.CC.$default$andThen(this, function);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    return ((Cfor) obj).c.L(gsv.t).ax(new itu(ivj.this, 1));
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function compose(Function function) {
                    return Function.CC.$default$compose(this, function);
                }
            }).orElse(aynu.d());
            if (bX() && this.bP.isPresent()) {
                Optional.ofNullable(this.br).ifPresent(new iuh(this, i2));
            }
            mfr mfrVar = this.bK;
            if (mfrVar != null) {
                mfrVar.c(this.cx.t);
            }
            bn(this.cx.u);
            if (Build.VERSION.SDK_INT >= 28) {
                ((SpecificNetworkErrorViewLoadingFrameLayout) this.c.get()).setAccessibilityPaneTitle(this.af);
            }
        }
        if (!c.pY(BrowseEndpointOuterClass.browseEndpoint)) {
            zga.b("Browse Fragment was given a navigation endpoint without browse data.");
        }
        if (Build.VERSION.SDK_INT < 28) {
            Optional.ofNullable(C()).map(iup.d).map(iup.e).ifPresent(gfd.o);
        }
        if (bundle != null) {
            gng a = this.bH.a();
            if (a != ((gng) gng.a(bundle.getInt("PREVIOUS_THEME", -1)).e(a))) {
                this.cM = false;
                asvu asvuVar = this.bV.b().e;
                if (asvuVar == null) {
                    asvuVar = asvu.a;
                }
                if (asvuVar.ah) {
                    this.aC.e(a.d);
                }
            }
        }
        return (View) this.c.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int n() {
        return ((Integer) this.c.map(iup.f).orElse(0)).intValue();
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gab gabVar = this.d;
        if (gabVar != null) {
            gabVar.j();
        }
        nmq nmqVar = this.e;
        if (nmqVar != null) {
            for (nmp nmpVar : nmqVar.a) {
                nmpVar.c.F(configuration);
                lxu lxuVar = nmpVar.d;
                if (lxuVar != null && lxuVar.g) {
                    lxuVar.r(configuration.orientation);
                }
            }
        }
        if (n() == 5 || n() == 6) {
            this.c.ifPresent(new iuh(this, 2));
        }
        if (bZ()) {
            View view = this.O;
            RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(R.id.results) : null;
            if (recyclerView != null) {
                double N = yjk.N(qW());
                Double.isNaN(N);
                int i = (int) (N * 0.175d);
                recyclerView.setPadding(i, 0, i, 0);
            }
        }
        if (bX()) {
            Optional.ofNullable(this.br).ifPresent(new iuh(this, 3));
        }
    }

    public final Cfor p() {
        int a;
        nmq nmqVar = this.e;
        if (nmqVar == null || (a = nmqVar.a()) < 0 || a >= this.cF.size()) {
            return null;
        }
        return (Cfor) this.cF.get(a);
    }

    public final mgr q() {
        nmq nmqVar;
        if (this.d == null || (nmqVar = this.e) == null) {
            return null;
        }
        return (mgr) nmqVar.f();
    }

    @Override // defpackage.ivn, defpackage.ce
    public Context qR() {
        Context context = this.cw;
        return context != null ? context : super.qR();
    }

    public final acra r() {
        return (acra) Optional.ofNullable(mM()).orElse(acra.l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final apxf s() {
        aveh g;
        if (!bz() || (g = this.e.g()) == null || (g.b & 2) == 0 || g.equals(this.cD)) {
            return this.ai;
        }
        apxf apxfVar = g.d;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // defpackage.gir
    public final gad lv() {
        lza lzaVar;
        gad gadVar = this.aq;
        if (gadVar != null || (lzaVar = this.am) == null) {
            gadVar.getClass();
            return gadVar;
        }
        gad c = lzaVar.c();
        final amsx amsxVar = c.a.c;
        if (this.cB.isPresent()) {
            amsxVar = ((nky) this.cB.get()).a(amsxVar);
        }
        if (this.az) {
            amsv i = amsx.i();
            i.c((fze) this.aW.get());
            i.j(amsxVar);
            amsxVar = i.g();
        }
        if (this.cQ) {
            amsv i2 = amsx.i();
            i2.j(this.aX.b());
            i2.j(amsxVar);
            amsxVar = i2.g();
        }
        if (cu.contains(whu.T(this.ai))) {
            amsxVar = amvs.a;
        }
        final Object obj = null;
        if (bY() && this.cB.isPresent()) {
            obj = ((nky) this.cB.get()).d();
        }
        int i3 = 1;
        int i4 = 0;
        final boolean z = obj != null && ((Boolean) this.cB.map(iup.p).orElse(false)).booleanValue();
        return (gad) ayqj.F(c).G(new ayrv() { // from class: ity
            @Override // defpackage.ayrv
            public final Object a(Object obj2) {
                final ivj ivjVar = ivj.this;
                final amsx amsxVar2 = amsxVar;
                gac a = ((gad) obj2).a();
                a.m(new amml() { // from class: iui
                    @Override // defpackage.amml
                    public final Object apply(Object obj3) {
                        ivj ivjVar2 = ivj.this;
                        amsx amsxVar3 = amsxVar2;
                        fzf fzfVar = (fzf) obj3;
                        fzfVar.a = ivjVar2.af;
                        fzfVar.d(amsxVar3);
                        fzfVar.b(ivjVar2.ay);
                        return fzfVar;
                    }
                });
                return a.a();
            }
        }).G(new itw(this, i4)).G(new itw(this, i3)).G(new ayrv() { // from class: itz
            @Override // defpackage.ayrv
            public final Object a(Object obj2) {
                ivj ivjVar = ivj.this;
                Object obj3 = obj;
                boolean z2 = z;
                gac a = ((gad) obj2).a();
                a.b(ivjVar.an);
                a.k(ivjVar.ao);
                a.g(ivjVar.aw);
                a.i(ivjVar.ax);
                a.e = obj3;
                a.f(z2);
                a.c(ivjVar.ag);
                a.d(ivjVar.ah);
                return a.a();
            }
        }).X();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        aubg aubgVar;
        BrowseResponseModel browseResponseModel;
        switch (i) {
            case -1:
                return new Class[]{goa.class, gob.class, izi.class, lxl.class, ygd.class, abbc.class, ajtr.class};
            case 0:
                this.cM = true;
                return null;
            case 1:
                aH(true);
                return null;
            case 2:
                izi iziVar = (izi) obj;
                if (!iziVar.c().h()) {
                    return null;
                }
                mad madVar = this.aX;
                atdb atdbVar = (atdb) iziVar.c().c();
                atdc atdcVar = madVar.c;
                if (atdcVar != null && atdcVar.c.size() > 0) {
                    aone builder = madVar.c.toBuilder();
                    aone createBuilder = atda.a.createBuilder();
                    createBuilder.copyOnWrite();
                    atda atdaVar = (atda) createBuilder.instance;
                    atdaVar.c = atdbVar;
                    atdaVar.b |= 1;
                    builder.aF(0, createBuilder);
                    madVar.c((atdc) builder.build());
                }
                bm();
                aH(true);
                return null;
            case 3:
                lxl lxlVar = (lxl) obj;
                String T = whu.T(aN());
                if (T == null || !T.equals(lxlVar.a())) {
                    return null;
                }
                apxf aN = aN();
                aone builder2 = ((aplt) aN.pX(BrowseEndpointOuterClass.browseEndpoint)).toBuilder();
                String b = lxlVar.b();
                builder2.copyOnWrite();
                aplt apltVar = (aplt) builder2.instance;
                b.getClass();
                apltVar.b |= 8;
                apltVar.e = b;
                aplt apltVar2 = (aplt) builder2.build();
                aong aongVar = (aong) aN.toBuilder();
                aongVar.e(BrowseEndpointOuterClass.browseEndpoint, apltVar2);
                apxf apxfVar = (apxf) aongVar.build();
                PaneDescriptor.b(this).i(apxfVar);
                aI(apxfVar, true);
                return null;
            case 4:
                aH(true);
                return null;
            case 5:
                abbc abbcVar = (abbc) obj;
                if ((4 & abbcVar.b.b) == 0) {
                    return null;
                }
                Object bM = bM();
                arzc arzcVar = abbcVar.b.d;
                if (arzcVar == null) {
                    arzcVar = arzc.a;
                }
                if (arzcVar.b == 53272665) {
                    arzc arzcVar2 = abbcVar.b.d;
                    if (arzcVar2 == null) {
                        arzcVar2 = arzc.a;
                    }
                    if (arzcVar2.b == 53272665) {
                        aubgVar = (aubg) arzcVar2.c;
                    } else {
                        aubgVar = aubg.a;
                    }
                } else {
                    aubgVar = null;
                }
                if (aubgVar == null || (browseResponseModel = this.cC) == null) {
                    return null;
                }
                cb(this.aS.a(aubgVar, browseResponseModel));
                if (bM != null) {
                    bp(bM, aubgVar);
                }
                bm();
                return null;
            case 6:
                if (((ajtr) obj).a() == ajcd.NEXT) {
                    return null;
                }
                ((fzb) this.al.get()).n();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
