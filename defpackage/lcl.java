package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.provider.SearchRecentSuggestions;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.apps.youtube.app.search.OnlineSearchController;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import defpackage.aod;
import defpackage.aok;
import defpackage.dd;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lcl extends lak implements akdd, laz {
    public axpg a;
    lci aA;
    lcj aB;
    View aC;
    View aD;
    lbb aE;
    ajxe aF;
    zau aG;
    public onf aH;
    public mda aI;
    public rxm aJ;
    public agqo aK;
    public agqo aL;
    public ohx aM;
    public akht aN;
    private String aO;
    private String aP;
    private String aQ;
    private boolean aR;
    private boolean aS;
    private boolean aT;
    private int aU;
    private int aV;
    private LoadingFrameLayout aW;
    private lgt aX;
    private RecyclerView aY;
    private boolean aZ;
    public lhd ae;
    public fzj af;
    public jcm ag;
    public lax ah;
    public acsy ai;
    public aaea aj;
    public afsy ak;
    public fwo al;
    public mak am;
    public Executor an;
    public yzm ao;
    public String aw;
    public TextView ay;
    public lij az;
    public axpg b;
    public SearchRecentSuggestions c;
    public ypa d;
    public azrw e;
    private lcg ba = null;
    public int ax = -1;

    private final zau aF() {
        ci C;
        if (this.aG == null && (C = C()) != null && (C instanceof euc)) {
            this.aG = ((euc) C).mI();
        }
        return this.aG;
    }

    private final void aG() {
        this.aE.d(this.aw);
    }

    public static /* synthetic */ void q(Throwable th) {
        zga.d("Error occurred getting HistoryPausedState", th);
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        this.d.d(new feg());
        this.ao.b(false);
    }

    @Override // defpackage.ce
    public final void Y(int i, String[] strArr, int[] iArr) {
        this.az.a(i, strArr, iArr);
    }

    @Override // defpackage.gir, defpackage.ce
    public final void Z() {
        super.Z();
        this.an.execute(new lcf(this));
    }

    @Override // defpackage.gir
    public final Object aT() {
        lck lckVar = new lck();
        lckVar.a = null;
        lbb lbbVar = this.aE;
        if (lbbVar != null) {
            lckVar.b = lbbVar.ph();
        }
        return lckVar;
    }

    @Override // defpackage.gir
    public final String aU() {
        return this.aE.f232J;
    }

    @Override // defpackage.gir
    public final void aY(Object obj) {
        if (obj instanceof lck) {
            lck lckVar = (lck) obj;
            Object obj2 = lckVar.a;
            this.aF = lckVar.b;
        }
    }

    @Override // defpackage.gir, defpackage.ce
    public final void lZ() {
        super.lZ();
        this.aE.a();
    }

    @Override // defpackage.gir
    public final gad lv() {
        if (this.aq == null) {
            gac a = this.as.a();
            if (evr.L(this.aj)) {
                lbb lbbVar = this.aE;
                if ((lbbVar instanceof OnlineSearchController) && ((OnlineSearchController) lbbVar).s != null) {
                    boolean z = false;
                    if (this.aR && this.aT) {
                        z = true;
                    }
                    this.aS = z;
                    fzu fzuVar = new fzu();
                    fzuVar.a = Boolean.valueOf(this.aS);
                    RecyclerView recyclerView = this.aY;
                    if (recyclerView != null) {
                        fzuVar.b = recyclerView;
                        Boolean bool = fzuVar.a;
                        if (bool == null || fzuVar.b == null) {
                            StringBuilder sb = new StringBuilder();
                            if (fzuVar.a == null) {
                                sb.append(" chipApplied");
                            }
                            if (fzuVar.b == null) {
                                sb.append(" resultsRecyclerView");
                            }
                            String valueOf = String.valueOf(sb);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                            sb2.append("Missing required properties:");
                            sb2.append(valueOf);
                            throw new IllegalStateException(sb2.toString());
                        }
                        a.c = new fzv(bool.booleanValue(), fzuVar.b);
                    } else {
                        throw new NullPointerException("Null resultsRecyclerView");
                    }
                }
            }
            a.m(new amml() { // from class: lce
                /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
                @Override // defpackage.amml
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r17) {
                    /*
                        Method dump skipped, instructions count: 244
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lce.apply(java.lang.Object):java.lang.Object");
                }
            });
            this.aq = a.a();
        }
        return this.aq;
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        this.aE.K = null;
        this.af.d("");
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putString("search_cache_key", this.aO);
        bundle.putString("search_query", this.aw);
        bundle.putBoolean("search_filter_chip_applied", this.aT);
        bundle.putBoolean("search_filter_chip_clicked", this.aR);
        bundle.putInt("search_filter_chip_count", this.aU);
        bundle.putInt("search_chip_bar_selected_position", this.aV);
        lbb lbbVar = this.aE;
        if (lbbVar != null) {
            lbbVar.l(bundle);
        }
    }

    @Override // defpackage.gir, defpackage.ce
    public final void mS() {
        super.mS();
        this.al.c();
        this.af.d(this.aw);
        if (this.aZ) {
            aG();
        }
        this.aZ = false;
        this.aE.K = this;
        if (ar()) {
            final dd mO = mO();
            final String str = lbd.ae;
            final dh dhVar = new dh() { // from class: lca
                @Override // defpackage.dh
                public final void a(String str2, Bundle bundle) {
                    lcl lclVar = lcl.this;
                    if (str2.equals(lbd.ae)) {
                        ammv aF = lbd.aF(bundle);
                        if (aF.h()) {
                            auux auuxVar = (auux) aF.c();
                            lbb lbbVar = lclVar.aE;
                            String str3 = lclVar.aw;
                            if (!auuxVar.equals(lbbVar.G)) {
                                lbbVar.G = auuxVar;
                                lbbVar.F = null;
                                lbbVar.d(str3);
                            }
                            lclVar.r();
                        }
                    }
                }
            };
            final aom aomVar = this.X;
            if (aomVar.b == aoe.DESTROYED) {
                return;
            }
            aoi aoiVar = new aoi() { // from class: android.support.v4.app.FragmentManager$5
                @Override // defpackage.aoi
                public final void a(aok aokVar, aod aodVar) {
                    Bundle bundle;
                    if (aodVar == aod.ON_START && (bundle = (Bundle) dd.this.g.get(str)) != null) {
                        dhVar.a(str, bundle);
                        dd.this.g.remove(str);
                    }
                    if (aodVar == aod.ON_DESTROY) {
                        aomVar.c(this);
                        dd.this.h.remove(str);
                    }
                }
            };
            aomVar.b(aoiVar);
            da daVar = (da) mO.h.put(str, new da(aomVar, dhVar, aoiVar));
            if (daVar != null) {
                daVar.a.c(daVar.c);
            }
            if (dd.W(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting FragmentResultListener with key ");
                sb.append(str);
                sb.append(" lifecycleOwner ");
                sb.append(aomVar);
                sb.append(" and listener ");
                sb.append(dhVar);
            }
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        lcl lclVar = this;
        View inflate = layoutInflater.inflate(R.layout.search_results_fragment, viewGroup, false);
        lclVar.aC = inflate;
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) inflate.findViewById(R.id.loading_layout);
        lclVar.aW = loadingFrameLayout;
        loadingFrameLayout.f(lclVar);
        lclVar.aY = (RecyclerView) lclVar.aW.findViewById(R.id.results);
        if (evr.L(lclVar.aj)) {
            lclVar.ba = new lcg(lclVar);
        }
        Bundle bundle4 = lclVar.m;
        Bundle bundle5 = bundle != null ? bundle : bundle4;
        if (bundle5 != bundle4 && bundle4 != null && bundle4.containsKey("navigation_endpoint_interaction_logging_extension")) {
            bundle5.putByteArray("navigation_endpoint_interaction_logging_extension", bundle4.getByteArray("navigation_endpoint_interaction_logging_extension"));
        }
        if (bundle4 != null && bundle4.containsKey("search_cache_key")) {
            lclVar.aO = bundle4.getString("search_cache_key");
        }
        lclVar.aA = new lci(lclVar);
        lclVar.aB = new lcj(lclVar, lclVar.ap, lclVar.aI);
        if (lclVar.aE != null) {
            bundle2 = bundle5;
        } else if (lclVar.aJ.a) {
            agqo agqoVar = lclVar.aL;
            RecyclerView recyclerView = lclVar.aY;
            LoadingFrameLayout loadingFrameLayout2 = lclVar.aW;
            ci C = C();
            acra mM = mM();
            ajxe ajxeVar = lclVar.aF;
            azrw azrwVar = agqoVar.k;
            aild aildVar = (aild) agqoVar.b.get();
            aildVar.getClass();
            tru truVar = (tru) agqoVar.l.get();
            truVar.getClass();
            azrw azrwVar2 = agqoVar.i;
            ajoy ajoyVar = (ajoy) agqoVar.d.get();
            ajoyVar.getClass();
            Executor executor = (Executor) agqoVar.c.get();
            executor.getClass();
            zaw zawVar = (zaw) agqoVar.a.get();
            zawVar.getClass();
            aadw aadwVar = (aadw) agqoVar.h.get();
            aadwVar.getClass();
            aaea aaeaVar = (aaea) agqoVar.j.get();
            aaeaVar.getClass();
            azrw azrwVar3 = agqoVar.f;
            jsg jsgVar = (jsg) agqoVar.m.get();
            mna mnaVar = (mna) agqoVar.g.get();
            bundle2 = bundle5;
            axzg axzgVar = (axzg) agqoVar.e.get();
            axzgVar.getClass();
            recyclerView.getClass();
            loadingFrameLayout2.getClass();
            C.getClass();
            mM.getClass();
            lclVar = this;
            lclVar.aE = new lan(azrwVar, aildVar, truVar, azrwVar2, ajoyVar, executor, zawVar, aadwVar, aaeaVar, azrwVar3, jsgVar, mnaVar, axzgVar, recyclerView, loadingFrameLayout2, C, mM, bundle2, ajxeVar, null, null, null, null, null);
        } else {
            bundle2 = bundle5;
            lax laxVar = lclVar.ah;
            RecyclerView recyclerView2 = lclVar.aY;
            LoadingFrameLayout loadingFrameLayout3 = lclVar.aW;
            ci C2 = C();
            acra mM2 = mM();
            lci lciVar = lclVar.aA;
            lcj lcjVar = lclVar.aB;
            lcg lcgVar = lclVar.ba;
            ajxe ajxeVar2 = lclVar.aF;
            ((afuh) laxVar.a.get()).getClass();
            azrw azrwVar4 = laxVar.b;
            azrw azrwVar5 = laxVar.c;
            mgs mgsVar = (mgs) laxVar.d.get();
            mgsVar.getClass();
            nrp nrpVar = (nrp) laxVar.e.get();
            ogx ogxVar = (ogx) laxVar.f.get();
            ((Handler) laxVar.g.get()).getClass();
            abcb abcbVar = (abcb) laxVar.h.get();
            abcbVar.getClass();
            HatsController hatsController = (HatsController) laxVar.i.get();
            hatsController.getClass();
            MealbarPromoController mealbarPromoController = (MealbarPromoController) laxVar.j.get();
            mealbarPromoController.getClass();
            akcp akcpVar = (akcp) laxVar.k.get();
            akcpVar.getClass();
            akdz akdzVar = (akdz) laxVar.l.get();
            akdzVar.getClass();
            akec akecVar = (akec) laxVar.m.get();
            akecVar.getClass();
            ypa ypaVar = (ypa) laxVar.n.get();
            ypaVar.getClass();
            zaw zawVar2 = (zaw) laxVar.o.get();
            zawVar2.getClass();
            fzj fzjVar = (fzj) laxVar.p.get();
            fzjVar.getClass();
            lhd lhdVar = (lhd) laxVar.q.get();
            lhdVar.getClass();
            aadw aadwVar2 = (aadw) laxVar.r.get();
            aadwVar2.getClass();
            aaea aaeaVar2 = (aaea) laxVar.s.get();
            aaeaVar2.getClass();
            axpg axpgVar = ((axqv) laxVar.t).get();
            axpgVar.getClass();
            ajjz ajjzVar = (ajjz) laxVar.u.get();
            ajjzVar.getClass();
            ajzi ajziVar = (ajzi) laxVar.v.get();
            ajziVar.getClass();
            acsy acsyVar = (acsy) laxVar.w.get();
            acsyVar.getClass();
            lgs lgsVar = (lgs) laxVar.x.get();
            lgsVar.getClass();
            sxw sxwVar = (sxw) laxVar.y.get();
            sxwVar.getClass();
            aahd aahdVar = (aahd) laxVar.z.get();
            aahdVar.getClass();
            aksl akslVar = (aksl) laxVar.A.get();
            akslVar.getClass();
            ohg ohgVar = (ohg) laxVar.B.get();
            ajoy ajoyVar2 = (ajoy) laxVar.C.get();
            ajoyVar2.getClass();
            azrw azrwVar6 = laxVar.D;
            nqp nqpVar = (nqp) laxVar.E.get();
            nqpVar.getClass();
            axzg axzgVar2 = (axzg) laxVar.F.get();
            axzgVar2.getClass();
            agcm agcmVar = (agcm) laxVar.G.get();
            agcmVar.getClass();
            recyclerView2.getClass();
            loadingFrameLayout3.getClass();
            C2.getClass();
            mM2.getClass();
            OnlineSearchController onlineSearchController = new OnlineSearchController(azrwVar5, mgsVar, nrpVar, ogxVar, abcbVar, hatsController, mealbarPromoController, akcpVar, akdzVar, akecVar, ypaVar, zawVar2, fzjVar, lhdVar, aadwVar2, aaeaVar2, axpgVar, ajjzVar, ajziVar, acsyVar, lgsVar, sxwVar, aahdVar, akslVar, ohgVar, ajoyVar2, azrwVar6, nqpVar, axzgVar2, agcmVar, recyclerView2, loadingFrameLayout3, C2, mM2, lciVar, lcjVar, lcgVar, bundle2, ajxeVar2, null, null, null, null, null);
            lclVar = this;
            lclVar.aE = onlineSearchController;
            lclVar.X.b(onlineSearchController);
        }
        final int i = 1;
        if (lclVar.aw == null && (bundle3 = bundle2) != null) {
            String string = bundle3.getString("search_query");
            boolean z = bundle3.getBoolean("search_filter_chip_clicked");
            String trim = ammx.d(string).trim();
            lclVar.aw = trim;
            lclVar.aR = z;
            if (!TextUtils.isEmpty(trim)) {
                TextView textView = lclVar.ay;
                if (textView != null) {
                    textView.setText(lclVar.aw);
                }
                fzj fzjVar2 = lclVar.af;
                if (fzjVar2 != null) {
                    fzjVar2.d(lclVar.aw);
                }
                if (lclVar.ae.b() && !lclVar.ak.c().g()) {
                    aaxr aaxrVar = (aaxr) lclVar.e.get();
                    aaxp a = aaxrVar.a();
                    a.k();
                    ynm.k(aaxrVar.b(a), lclVar.an, jun.r, new ynl() { // from class: lcd
                        @Override // defpackage.ynl, defpackage.zfi
                        public final void a(Object obj) {
                            lcl lclVar2 = lcl.this;
                            if (((artc) obj).d) {
                                return;
                            }
                            lclVar2.c.saveRecentQuery(lclVar2.aw, null);
                        }
                    });
                }
                if (av()) {
                    aG();
                } else {
                    lclVar.aZ = true;
                }
            }
            lclVar.aT = bundle3.getBoolean("search_filter_chip_applied");
            lclVar.aU = bundle3.getInt("search_filter_chip_count");
            lclVar.aV = bundle3.getInt("search_chip_bar_selected_position");
        }
        apxf apxfVar = lclVar.aE.E;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (apxfVar != null && apxfVar.pY(SearchEndpointOuterClass.searchEndpoint)) {
            aunn aunnVar = (aunn) apxfVar.pX(SearchEndpointOuterClass.searchEndpoint);
            lclVar.aP = aunnVar.d;
            lclVar.aQ = aunnVar.f;
        }
        lgt g = lclVar.aN.g(lclVar.aP, lclVar.aQ);
        lclVar.aX = g;
        lclVar.az = lclVar.aK.b(lclVar, g, lclVar.aP, mM());
        View a2 = lclVar.am.a(LayoutInflater.from(lclVar.ap.getSupportActionBar().b()));
        lclVar.aD = a2;
        TextView textView2 = (TextView) a2.findViewById(R.id.search_query);
        lclVar.ay = textView2;
        textView2.setText(lclVar.aw);
        if (evr.bg(lclVar.av)) {
            lclVar.ay.setOnTouchListener(new View.OnTouchListener() { // from class: lcc
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    lcl lclVar2 = lcl.this;
                    if (motionEvent.getActionMasked() == 0) {
                        lclVar2.ax = lclVar2.ay.getOffsetForPosition(motionEvent.getX(), motionEvent.getY());
                        return false;
                    }
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    lclVar2.ay.performClick();
                    return true;
                }
            });
            lclVar.ay.setOnClickListener(new View.OnClickListener(lclVar) { // from class: lcb
                public final /* synthetic */ lcl a;

                {
                    this.a = lclVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
                
                    if (r0.cD != false) goto L17;
                 */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r3) {
                    /*
                        r2 = this;
                        int r3 = r2
                        if (r3 == 0) goto L67
                        r0 = 1
                        if (r3 == r0) goto L5d
                        r0 = 2
                        if (r3 == r0) goto L4e
                        lcl r3 = r2.a
                        lij r0 = r3.az
                        acra r1 = r3.mM()
                        java.lang.String r1 = r1.k()
                        r0.i = r1
                        lij r0 = r3.az
                        r1 = 64833(0xfd41, float:9.085E-41)
                        r0.j = r1
                        aadw r0 = r3.av
                        boolean r0 = defpackage.evr.be(r0)
                        if (r0 == 0) goto L39
                        aadw r0 = r3.av
                        apwy r0 = r0.b()
                        if (r0 == 0) goto L41
                        asvu r0 = r0.e
                        if (r0 != 0) goto L35
                        asvu r0 = defpackage.asvu.a
                    L35:
                        boolean r0 = r0.cD
                        if (r0 == 0) goto L41
                    L39:
                        aadw r0 = r3.av
                        boolean r0 = defpackage.evr.bd(r0)
                        if (r0 == 0) goto L47
                    L41:
                        fzj r3 = r3.af
                        r3.c()
                        return
                    L47:
                        lij r3 = r3.az
                        r0 = 0
                        r3.c(r0)
                        return
                    L4e:
                        lcl r3 = r2.a
                        fzj r0 = r3.af
                        java.lang.String r1 = ""
                        r0.d(r1)
                        fzj r3 = r3.af
                        r3.a()
                        return
                    L5d:
                        lcl r3 = r2.a
                        fzj r0 = r3.af
                        int r3 = r3.ax
                        r0.b(r3)
                        return
                    L67:
                        lcl r3 = r2.a
                        fzj r3 = r3.af
                        r3.a()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lcb.onClick(android.view.View):void");
                }
            });
        } else {
            final int i2 = 0;
            lclVar.ay.setOnClickListener(new View.OnClickListener(lclVar) { // from class: lcb
                public final /* synthetic */ lcl a;

                {
                    this.a = lclVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        */
                    /*
                        this = this;
                        int r3 = r2
                        if (r3 == 0) goto L67
                        r0 = 1
                        if (r3 == r0) goto L5d
                        r0 = 2
                        if (r3 == r0) goto L4e
                        lcl r3 = r2.a
                        lij r0 = r3.az
                        acra r1 = r3.mM()
                        java.lang.String r1 = r1.k()
                        r0.i = r1
                        lij r0 = r3.az
                        r1 = 64833(0xfd41, float:9.085E-41)
                        r0.j = r1
                        aadw r0 = r3.av
                        boolean r0 = defpackage.evr.be(r0)
                        if (r0 == 0) goto L39
                        aadw r0 = r3.av
                        apwy r0 = r0.b()
                        if (r0 == 0) goto L41
                        asvu r0 = r0.e
                        if (r0 != 0) goto L35
                        asvu r0 = defpackage.asvu.a
                    L35:
                        boolean r0 = r0.cD
                        if (r0 == 0) goto L41
                    L39:
                        aadw r0 = r3.av
                        boolean r0 = defpackage.evr.bd(r0)
                        if (r0 == 0) goto L47
                    L41:
                        fzj r3 = r3.af
                        r3.c()
                        return
                    L47:
                        lij r3 = r3.az
                        r0 = 0
                        r3.c(r0)
                        return
                    L4e:
                        lcl r3 = r2.a
                        fzj r0 = r3.af
                        java.lang.String r1 = ""
                        r0.d(r1)
                        fzj r3 = r3.af
                        r3.a()
                        return
                    L5d:
                        lcl r3 = r2.a
                        fzj r0 = r3.af
                        int r3 = r3.ax
                        r0.b(r3)
                        return
                    L67:
                        lcl r3 = r2.a
                        fzj r3 = r3.af
                        r3.a()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lcb.onClick(android.view.View):void");
                }
            });
        }
        final int i3 = 2;
        a2.findViewById(R.id.search_clear).setOnClickListener(new View.OnClickListener(lclVar) { // from class: lcb
            public final /* synthetic */ lcl a;

            {
                this.a = lclVar;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r3) {
                /*
                    r2 = this;
                    int r3 = r2
                    if (r3 == 0) goto L67
                    r0 = 1
                    if (r3 == r0) goto L5d
                    r0 = 2
                    if (r3 == r0) goto L4e
                    lcl r3 = r2.a
                    lij r0 = r3.az
                    acra r1 = r3.mM()
                    java.lang.String r1 = r1.k()
                    r0.i = r1
                    lij r0 = r3.az
                    r1 = 64833(0xfd41, float:9.085E-41)
                    r0.j = r1
                    aadw r0 = r3.av
                    boolean r0 = defpackage.evr.be(r0)
                    if (r0 == 0) goto L39
                    aadw r0 = r3.av
                    apwy r0 = r0.b()
                    if (r0 == 0) goto L41
                    asvu r0 = r0.e
                    if (r0 != 0) goto L35
                    asvu r0 = defpackage.asvu.a
                L35:
                    boolean r0 = r0.cD
                    if (r0 == 0) goto L41
                L39:
                    aadw r0 = r3.av
                    boolean r0 = defpackage.evr.bd(r0)
                    if (r0 == 0) goto L47
                L41:
                    fzj r3 = r3.af
                    r3.c()
                    return
                L47:
                    lij r3 = r3.az
                    r0 = 0
                    r3.c(r0)
                    return
                L4e:
                    lcl r3 = r2.a
                    fzj r0 = r3.af
                    java.lang.String r1 = ""
                    r0.d(r1)
                    fzj r3 = r3.af
                    r3.a()
                    return
                L5d:
                    lcl r3 = r2.a
                    fzj r0 = r3.af
                    int r3 = r3.ax
                    r0.b(r3)
                    return
                L67:
                    lcl r3 = r2.a
                    fzj r3 = r3.af
                    r3.a()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lcb.onClick(android.view.View):void");
            }
        });
        View findViewById = a2.findViewById(R.id.voice_search);
        if (findViewById != null && lclVar.az.e()) {
            final int i4 = 3;
            findViewById.setOnClickListener(new View.OnClickListener(lclVar) { // from class: lcb
                public final /* synthetic */ lcl a;

                {
                    this.a = lclVar;
                }

                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View r3) {
                    /*
                        r2 = this;
                        int r3 = r2
                        if (r3 == 0) goto L67
                        r0 = 1
                        if (r3 == r0) goto L5d
                        r0 = 2
                        if (r3 == r0) goto L4e
                        lcl r3 = r2.a
                        lij r0 = r3.az
                        acra r1 = r3.mM()
                        java.lang.String r1 = r1.k()
                        r0.i = r1
                        lij r0 = r3.az
                        r1 = 64833(0xfd41, float:9.085E-41)
                        r0.j = r1
                        aadw r0 = r3.av
                        boolean r0 = defpackage.evr.be(r0)
                        if (r0 == 0) goto L39
                        aadw r0 = r3.av
                        apwy r0 = r0.b()
                        if (r0 == 0) goto L41
                        asvu r0 = r0.e
                        if (r0 != 0) goto L35
                        asvu r0 = defpackage.asvu.a
                    L35:
                        boolean r0 = r0.cD
                        if (r0 == 0) goto L41
                    L39:
                        aadw r0 = r3.av
                        boolean r0 = defpackage.evr.bd(r0)
                        if (r0 == 0) goto L47
                    L41:
                        fzj r3 = r3.af
                        r3.c()
                        return
                    L47:
                        lij r3 = r3.az
                        r0 = 0
                        r3.c(r0)
                        return
                    L4e:
                        lcl r3 = r2.a
                        fzj r0 = r3.af
                        java.lang.String r1 = ""
                        r0.d(r1)
                        fzj r3 = r3.af
                        r3.a()
                        return
                    L5d:
                        lcl r3 = r2.a
                        fzj r0 = r3.af
                        int r3 = r3.ax
                        r0.b(r3)
                        return
                    L67:
                        lcl r3 = r2.a
                        fzj r3 = r3.af
                        r3.a()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lcb.onClick(android.view.View):void");
                }
            });
        }
        return lclVar.aC;
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.aE.c(configuration);
        this.an.execute(new lcf(this));
    }

    @Override // defpackage.akdd
    public final void qJ() {
        aG();
    }

    public final void r() {
        lci lciVar;
        if (this.aE.G == null || (lciVar = this.aA) == null || lciVar.a == null || !ar()) {
            return;
        }
        if (!this.aE.q().isEmpty()) {
            lci lciVar2 = this.aA;
            MenuItem menuItem = lciVar2.a;
            lciVar2.a(aF(), qX().getColor(R.color.yt_material_blue_500));
        } else {
            lci lciVar3 = this.aA;
            MenuItem menuItem2 = lciVar3.a;
            lciVar3.a(aF(), gfw.k(R.attr.ytTextPrimary).le(qR()));
        }
    }

    public final void s() {
        auux auuxVar = this.aE.G;
        if (auuxVar == null || auuxVar.b.size() <= 0 || !ar()) {
            return;
        }
        lbd.aH(mO(), this.aE.G);
    }

    @Override // defpackage.ce
    public final void T(int i, int i2, Intent intent) {
        int i3 = 1000;
        if (i == 1000) {
            if (i2 == -1) {
                this.az.b(intent);
                return;
            }
            i = 1000;
        }
        if (i != 1000) {
            i3 = i;
        } else if (i2 == 1 && evr.J(this.aj)) {
            this.aE.b(intent.getStringExtra("AssistantCsn"), mM().k());
        }
        this.ai.m(asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        super.T(i3, i2, intent);
    }
}
