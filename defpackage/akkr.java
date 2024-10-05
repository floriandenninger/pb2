package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import com.google.android.libraries.youtube.share.ui.ActivityIndicatorFrameLayout;
import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class akkr extends akkb implements View.OnClickListener, akiu, akhn, acqz {
    static final long af = TimeUnit.SECONDS.toMillis(2);
    public ajjz aA;
    public aavj aB;
    public cnd aC;
    public SharedPreferences aD;
    public ajoy aE;
    public aahd aF;
    public shf aG;
    public zim aH;
    public aadw aI;
    public aoae aJ;
    private akiv aK;
    private aahd aL;
    private ActivityIndicatorFrameLayout aM;
    private View aN;
    private FloatingActionButton aO;
    private Snackbar aP;
    private Animation aQ;
    private Animation aR;
    private akig aS;
    private ViewTreeObserver.OnGlobalLayoutListener aT;
    private int aU;
    private int aV;
    private Context aW;
    private ci ae;
    public View ag;
    public View ah;
    public AnchorableTopPeekingScrollView ai;
    public ViewGroup aj;
    public RecyclerView ak;
    public RecyclerView al;
    public akkq am;
    public final Runnable an = new Runnable() { // from class: akkf
        @Override // java.lang.Runnable
        public final void run() {
            akkr akkrVar = akkr.this;
            akkrVar.al.E.p(new akke(akkrVar));
        }
    };
    public akmj ao;
    public akkz ap;
    public axpg aq;
    public axpg ar;
    public Handler as;
    public Executor at;
    public ajdh au;
    public acra av;
    public zaw aw;
    public ypa ax;
    public ScheduledExecutorService ay;
    public anib az;

    private static boolean aK(View view) {
        return (view == null || view.getLayoutParams() == null) ? false : true;
    }

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        apxf c = aahg.c(this.m.getByteArray("navigation_endpoint"));
        this.aL = new acrc(this.aF, this);
        Resources qX = qX();
        aavj aavjVar = this.aB;
        acra acraVar = this.av;
        zaw zawVar = this.aw;
        ScheduledExecutorService scheduledExecutorService = this.ay;
        ypa ypaVar = this.ax;
        ajjz ajjzVar = this.aA;
        atej atejVar = this.aI.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        apet apetVar = atejVar.m;
        if (apetVar == null) {
            apetVar = apet.a;
        }
        this.aK = new akiv(c, aavjVar, acraVar, zawVar, scheduledExecutorService, ypaVar, ajjzVar, apetVar, this.aW, this.aL, this.ao, this, this, this.ap, this.aC, this.au, this.aS, this.aD, this.aE, this.aJ, qX.getDimensionPixelSize(R.dimen.share_panel_row_horizontal_padding), qX.getDimensionPixelSize(R.dimen.share_panel_row_first_and_last_vertical_padding), this.at, this.az, null);
        akkq akkqVar = new akkq(this.aK, this.as);
        this.am = akkqVar;
        akkqVar.a(akkp.PEEK);
        final akiv akivVar = this.aK;
        akivVar.n = akivVar.d.submit(new Callable() { // from class: akir
            @Override // java.util.concurrent.Callable
            public final Object call() {
                akiv akivVar2 = akiv.this;
                yjk.e();
                return wbs.aF(akivVar2.g.getPackageManager());
            }
        });
        akivVar.j.a(akivVar.m);
        akivVar.e.g(akivVar);
        akivVar.l.a(akivVar);
        ShareEndpointOuterClass$ShareEntityEndpoint shareEndpointOuterClass$ShareEntityEndpoint = (ShareEndpointOuterClass$ShareEntityEndpoint) akivVar.a.pX(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint);
        if (shareEndpointOuterClass$ShareEntityEndpoint.d.isEmpty()) {
            if (!shareEndpointOuterClass$ShareEntityEndpoint.c.isEmpty()) {
                String str = shareEndpointOuterClass$ShareEntityEndpoint.c;
                akivVar.e.d(new fbp());
                akivVar.h.b(true);
                akivVar.b.d(str, ahbx.J(akivVar.b(), akivVar.f), new akit(akivVar), false);
                return;
            }
            throw new IllegalArgumentException("Invalid share entity endpoint provided.");
        }
        akivVar.h.b(false);
        akivVar.d(new aavq(shareEndpointOuterClass$ShareEntityEndpoint.d));
    }

    @Override // defpackage.ce
    public void X() {
        super.X();
        akkz akkzVar = this.ap;
        yjk.f();
        akkzVar.b.remove(this);
    }

    @Override // defpackage.ce
    public void Z() {
        super.Z();
        akkz akkzVar = this.ap;
        yjk.f();
        akkzVar.b.add(this);
    }

    @Override // defpackage.akhn
    public final void a(arej arejVar, View view, Object obj) {
        if (this.ae == null) {
            zga.g("Did not show hint tooltip because the share panel fragment was not attached to an activity.");
            return;
        }
        akia akiaVar = (akia) this.ar.get();
        akiaVar.b = this.aL;
        if (akiaVar.a(view)) {
            akiaVar.b(arejVar, view, obj);
        } else {
            view.addOnLayoutChangeListener(new akhv(akiaVar, view, arejVar, obj));
        }
    }

    public final void aJ(boolean z) {
        int i;
        int height = this.ak.getHeight();
        int childCount = this.al.getChildCount() - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.al.getChildAt(i3);
            if (aK(childAt)) {
                wd wdVar = this.al.n;
                i2 += wd.bj(childAt);
            }
        }
        View childAt2 = this.al.getChildAt(childCount);
        if (aK(childAt2)) {
            wd wdVar2 = this.al.n;
            i = wd.bj(childAt2);
        } else {
            i = 0;
        }
        int height2 = this.ag.getHeight() - (((height + i2) + ((int) (i * (true != l() ? 0.5f : 0.7f)))) + this.aV);
        int max = Math.max(height2, this.aU);
        if (z) {
            if (max < this.ai.k || !l()) {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(this.ai.k, max);
                valueAnimator.setInterpolator(new DecelerateInterpolator());
                valueAnimator.addUpdateListener(new akkm(this));
                valueAnimator.addListener(new akkn(this));
                valueAnimator.start();
            } else {
                this.am.a(akkp.REVEAL_THIRD_PARTY_NETWORK_SECTION_ANIMATION);
            }
        } else if (max < this.ai.k || !l()) {
            this.ai.h(max);
        }
        if (height2 >= this.aU) {
            this.ai.i(true);
        }
    }

    @Override // defpackage.akiu
    public final void b(boolean z) {
        vw vwVar;
        vw vwVar2 = this.ak.m;
        if ((vwVar2 == null || vwVar2.b() <= 0) && ((vwVar = this.al.m) == null || vwVar.b() <= 0)) {
            if (z) {
                this.aN.setVisibility(0);
                return;
            } else {
                this.aN.setVisibility(8);
                return;
            }
        }
        if (z) {
            ActivityIndicatorFrameLayout activityIndicatorFrameLayout = this.aM;
            activityIndicatorFrameLayout.b = true;
            activityIndicatorFrameLayout.a.start();
            activityIndicatorFrameLayout.invalidate();
            return;
        }
        ActivityIndicatorFrameLayout activityIndicatorFrameLayout2 = this.aM;
        activityIndicatorFrameLayout2.b = false;
        activityIndicatorFrameLayout2.a.stop();
        activityIndicatorFrameLayout2.invalidate();
    }

    @Override // defpackage.akiu
    public final void d(ajox ajoxVar, ajox ajoxVar2) {
        this.aj.setAlpha(0.0f);
        this.aj.setVisibility(0);
        this.aj.setTranslationY(100.0f);
        this.aj.animate().setListener(new akkl(this)).alpha(1.0f).translationY(0.0f).start();
        this.ak.ac(ajoxVar);
        this.al.ac(ajoxVar2);
        this.aj.getViewTreeObserver().addOnGlobalLayoutListener(new akki(this, 2));
    }

    @Override // defpackage.bv
    public final void dismiss() {
        this.ah.animate().alpha(0.0f).setDuration(250L).start();
        this.ai.animate().translationY(this.ag.getHeight()).setDuration(250L).setListener(new akkj(this)).start();
    }

    @Override // defpackage.akiu
    public final void h() {
        dismiss();
    }

    @Override // defpackage.akiu
    public final void i(boolean z) {
        if (z == this.ai.n) {
            return;
        }
        if (z) {
            this.aT = new akki(this, 1);
            this.al.getViewTreeObserver().addOnGlobalLayoutListener(this.aT);
            this.ai.i(true);
        } else {
            if (this.aT != null) {
                this.al.getViewTreeObserver().removeOnGlobalLayoutListener(this.aT);
            }
            this.aT = null;
            this.ai.i(false);
        }
    }

    @Override // defpackage.akiu
    public final void k(aaci aaciVar) {
        ahbx.G(this.aG, this.aP, aaciVar, af, null, null);
    }

    @Override // defpackage.akiu
    public final boolean l() {
        Context qR = qR();
        if (qR == null) {
            return true;
        }
        int O = yjk.O(qR);
        return (O == 3 || O == 4) ? false : true;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void lZ() {
        super.lZ();
        akiv akivVar = this.aK;
        akivVar.o = true;
        akivVar.l.d(akivVar);
        akivVar.j.c(akivVar.m);
        Iterator it = akivVar.i.iterator();
        while (it.hasNext()) {
            ((akii) it.next()).j();
        }
        akivVar.e.m(akivVar);
        akivVar.e.d(new fbq());
        if (akivVar.a.pY(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint)) {
            akivVar.k.e(aavp.d(((ShareEndpointOuterClass$ShareEntityEndpoint) akivVar.a.pX(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint)).c, ahbx.J(akivVar.b(), akivVar.f), null));
        }
    }

    @Override // defpackage.acqz
    public final acra mM() {
        return this.av;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.ae = C();
        o(2, this.aH.a);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        Window window = this.d.getWindow();
        window.addFlags(2);
        window.setDimAmount(0.0f);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aW = layoutInflater.getContext();
        View inflate = layoutInflater.inflate(R.layout.unified_share_panel_fragment, viewGroup, false);
        this.ag = inflate;
        this.ah = inflate.findViewById(R.id.overlay);
        this.ai = (AnchorableTopPeekingScrollView) this.ag.findViewById(R.id.top_peeking_scroll_view);
        this.aM = (ActivityIndicatorFrameLayout) this.ag.findViewById(R.id.progress_linear_bar);
        int dimensionPixelSize = this.ag.getResources().getDimensionPixelSize(R.dimen.share_panel_contents_width);
        if (dimensionPixelSize > 0) {
            yny.z(this.ai, yny.x(dimensionPixelSize), ViewGroup.LayoutParams.class);
        }
        this.aN = this.ag.findViewById(R.id.progress_spinner);
        this.aj = (ViewGroup) this.ag.findViewById(R.id.content);
        this.ak = (RecyclerView) this.ag.findViewById(R.id.header);
        this.al = (RecyclerView) this.ag.findViewById(R.id.list);
        this.aO = (FloatingActionButton) this.ag.findViewById(R.id.send_button);
        this.aP = (Snackbar) this.ag.findViewById(R.id.snackbar);
        this.aS = new akig(this.ae, this.ao, this.aA, this.ag.findViewById(R.id.select_message_view), this.ag.findViewById(R.id.message_input_view));
        Resources resources = this.ae.getResources();
        this.aU = 0;
        this.ah.setOnClickListener(this);
        if (l()) {
            this.aU = resources.getDimensionPixelSize(R.dimen.share_panel_peek_amount);
            this.ai.f(Math.max(qR().getResources().getDisplayMetrics().heightPixels - resources.getDimensionPixelSize(R.dimen.share_panel_default_visible_amount), 0));
        } else {
            this.ai.f(qR().getResources().getDisplayMetrics().heightPixels);
        }
        AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = this.ai;
        ((TopPeekingScrollView) anchorableTopPeekingScrollView).l = this.ah;
        ((TopPeekingScrollView) anchorableTopPeekingScrollView).m = this.al;
        new ColorDrawable(wbs.W(this.aW, R.attr.ytSeparator).orElse(0)).setBounds(0, 0, 1, 1);
        this.ak.af(new LinearLayoutManager());
        akkg akkgVar = new akkg(this);
        akkgVar.A = false;
        this.al.af(akkgVar);
        this.aO.setOnClickListener(this);
        this.aQ = AnimationUtils.loadAnimation(this.ae, R.anim.fab_in);
        this.aR = AnimationUtils.loadAnimation(this.ae, R.anim.fab_out);
        this.ag.getViewTreeObserver().addOnGlobalLayoutListener(new akki(this, 0));
        this.aj.setVisibility(4);
        this.aV = uye.c(this.ae);
        return this.ag;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.ah) {
            dismiss();
        }
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.aK.i.iterator();
        while (it.hasNext()) {
            ((akii) it.next()).lE(configuration);
        }
        akkq akkqVar = this.am;
        akkqVar.b.removeAll(Arrays.asList(akkp.PEEK));
        akkqVar.c = false;
        if (l()) {
            this.ai.h(qX().getDimensionPixelSize(R.dimen.share_panel_peek_amount));
        } else {
            this.ag.addOnLayoutChangeListener(new akkk(this, this.ag.getHeight()));
        }
        this.am.a(akkp.PEEK);
    }
}
