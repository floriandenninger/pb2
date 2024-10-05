package com.google.android.libraries.onegoogle.expresssignin;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import com.google.android.youtube.R;
import defpackage.acqx;
import defpackage.acsb;
import defpackage.adfy;
import defpackage.adgb;
import defpackage.adrv;
import defpackage.adsa;
import defpackage.adsb;
import defpackage.adsh;
import defpackage.adsi;
import defpackage.adsv;
import defpackage.alkd;
import defpackage.alkg;
import defpackage.alkk;
import defpackage.alkl;
import defpackage.amkq;
import defpackage.ammv;
import defpackage.ammx;
import defpackage.amrp;
import defpackage.amru;
import defpackage.anaf;
import defpackage.angq;
import defpackage.anhy;
import defpackage.aosn;
import defpackage.aoso;
import defpackage.aosq;
import defpackage.aosr;
import defpackage.aoss;
import defpackage.aost;
import defpackage.jg;
import defpackage.jw;
import defpackage.tyo;
import defpackage.uge;
import defpackage.ugh;
import defpackage.ugx;
import defpackage.uhu;
import defpackage.uhv;
import defpackage.uhw;
import defpackage.uia;
import defpackage.uie;
import defpackage.uif;
import defpackage.uig;
import defpackage.uih;
import defpackage.uik;
import defpackage.uim;
import defpackage.ujx;
import defpackage.ukd;
import defpackage.uqq;
import defpackage.ywt;
import defpackage.zga;
import defpackage.zv;
import defpackage.zw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ExpressSignInLayout extends FrameLayout implements ukd {
    public static final String a = "ExpressSignInLayout";
    private static final Property s = Property.of(View.class, Float.class, "alpha");
    private static final Interpolator t = jg.o(0.54f, 0.01f, 0.61f, 0.99f);
    private final int A;
    private final int B;
    private final ViewGroup C;
    private final View D;
    private final View E;
    private final alkg F;
    private final alkg G;
    private final uge H;
    private final zw I;

    /* renamed from: J, reason: collision with root package name */
    private final FrameLayout f169J;
    private final TextView K;
    private uge L;
    private ugx M;
    public boolean b;
    public boolean c;
    public boolean d;
    public uik e;
    public final View f;
    public final RecyclerView g;
    public final SelectedAccountView h;
    public final Button i;
    public final Button j;
    public final Button k;
    public final ViewGroup l;
    public final View m;
    public final ViewGroup n;
    public ugx o;
    public Runnable p;
    public AnimatorSet q;
    public final tyo r;
    private boolean u;
    private boolean v;
    private final int w;
    private final float x;
    private final float y;
    private final int z;

    public ExpressSignInLayout(Context context) {
        this(context, null);
    }

    public static aoso c() {
        aosn a2 = aoso.a();
        aosr aosrVar = aosr.EXPRESS_SIGN_IN_COMPONENT;
        a2.copyOnWrite();
        ((aoso) a2.instance).k(aosrVar);
        aosq aosqVar = aosq.BOTTOM_SHEET_COMPONENT_APPEARANCE;
        a2.copyOnWrite();
        ((aoso) a2.instance).l(aosqVar);
        aoss aossVar = aoss.GM_COMPONENT_STYLE;
        a2.copyOnWrite();
        ((aoso) a2.instance).m(aossVar);
        return (aoso) a2.build();
    }

    private final int n() {
        this.l.measure(0, 0);
        w(this.m, this.l.getMeasuredHeight());
        this.C.measure(0, 0);
        return this.C.getMeasuredHeight();
    }

    private static AnimatorSet o(Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(animatorListener);
        return animatorSet;
    }

    private static ObjectAnimator p(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) s, 0.0f, 1.0f);
    }

    private static ObjectAnimator q(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) s, 1.0f, 0.0f);
    }

    private final alkg r() {
        alkg h = alkg.h(getContext(), 0.0f);
        h.t();
        h.o(this.B);
        return h;
    }

    private final alkl s() {
        float dimension = getResources().getDimension(R.dimen.og_express_sign_in_corner_size);
        alkk a2 = alkl.a();
        a2.f(alkd.E(0));
        a2.d(dimension);
        a2.g(alkd.E(0));
        a2.e(dimension);
        return a2.a();
    }

    private final void t() {
        this.h.setVisibility(8);
        this.i.setVisibility(0);
        this.j.setVisibility(8);
        this.K.setVisibility(8);
        j(false);
    }

    private final void u() {
        this.h.setVisibility(0);
        this.i.setVisibility(8);
        this.j.setVisibility(0);
        this.K.setVisibility(true != tyo.N(getContext()) ? 8 : 0);
    }

    private final void v(boolean z) {
        if (this.v == z) {
            return;
        }
        this.v = z;
        this.C.getLayoutParams().height = true != z ? -2 : -1;
        this.D.setVisibility(true != z ? 0 : 8);
        if (z && this.L == null) {
            this.L = new uge(this.g, 0);
        }
        this.g.aw();
        this.g.aB(z ? this.L : this.H);
        l();
    }

    private static void w(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private final void x() {
        if (this.h.getVisibility() == 0) {
            t();
        } else {
            u();
        }
    }

    private static void y(View view, int i) {
        view.getLayoutParams().height = i;
        view.requestLayout();
    }

    @Override // defpackage.ukd
    public final void a(ujx ujxVar) {
        ujxVar.a(this.h, 90572);
        ujxVar.a(this.f, 90573);
        ujxVar.a(this.g, 90574);
        ujxVar.a(this.j, 90570);
        ujxVar.a(this.i, 90771);
        ujxVar.a(this.k, 90571);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount == 0) {
            amkq.O(view.getId() == R.id.express_sign_in_internal_view, "express_sign_in_internal_view must be added first");
            super.addView(view, -1, layoutParams);
        } else {
            amkq.O(childCount == 1, "ExpressSignInLayout must contain a single content view.");
            this.f169J.addView(view, 0, layoutParams);
            FrameLayout frameLayout = this.f169J;
            super.addView(frameLayout, 0, frameLayout.getLayoutParams());
        }
    }

    @Override // defpackage.ukd
    public final void b(ujx ujxVar) {
        ujxVar.c(this.h);
        ujxVar.c(this.f);
        ujxVar.c(this.g);
        ujxVar.c(this.j);
        ujxVar.c(this.i);
        ujxVar.c(this.k);
    }

    public final void d() {
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(int i) {
        boolean z = i > 0 && this.d;
        this.u = z;
        SelectedAccountView selectedAccountView = this.h;
        char c = z ? (char) 1 : (char) 3;
        selectedAccountView.k.setVisibility(8);
        selectedAccountView.j.setVisibility(c == 1 ? 0 : 8);
        selectedAccountView.l.setVisibility(c != 3 ? 0 : 8);
        selectedAccountView.i();
        this.h.setOnClickListener(z ? new View.OnClickListener() { // from class: uhj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aost aostVar;
                ExpressSignInLayout expressSignInLayout = ExpressSignInLayout.this;
                expressSignInLayout.e.f.e(tgc.c(), view);
                if (expressSignInLayout.b) {
                    aostVar = aost.DID_TAP_EXPANDED_ACCOUT_MENU_HEADER;
                } else {
                    aostVar = aost.DID_TAP_COLLAPSED_ACCOUT_MENU_HEADER;
                }
                expressSignInLayout.h(aostVar);
                expressSignInLayout.j(!expressSignInLayout.b);
            }
        } : null);
        this.h.setClickable(z);
        m();
        if (z) {
            return;
        }
        j(false);
    }

    public final void f(uim uimVar, Object obj) {
        aost aostVar;
        anhy O;
        uqq.j();
        if (obj == null) {
            aostVar = aost.DID_CONTINUE_WITHOUT_ACCOUNT_EVENT;
        } else {
            aostVar = aost.DID_CONTINUE_WITH_ACCOUNT_EVENT;
        }
        h(aostVar);
        h(aost.DISMISSED_COMPONENT_EVENT);
        adrv adrvVar = uimVar.b;
        ammv i = ammv.i(obj);
        adsb adsbVar = adrvVar.a;
        adsbVar.d.I(3, new acqx(acsb.c(36381)), null);
        if (!i.h() || adsbVar.a.g() == null || TextUtils.isEmpty(((ugh) i.c()).c)) {
            zga.l("Chosen account or current sign in request is null. Cancelling TV sign in flow.");
            adsbVar.b(adsbVar.h.e != 1);
            O = anaf.O(false);
        } else {
            String str = ((ugh) i.c()).c;
            adsv g = adsbVar.a.g();
            if (g.e == 1) {
                if (g.b() == null) {
                    zga.m("MDX.tvsignin.ExpressTvSignInDrawerController", "When going to getch the Passive auth code, current sign in request has changed to an invalid one.");
                    O = anaf.O(true);
                } else {
                    adsbVar.b.a(g.b, "passive_accepted");
                    adsbVar.d.d(acsb.b(50663), null, null);
                    adsbVar.d.n(new acqx(acsb.c(50662)));
                    adsbVar.j = true;
                    adsi adsiVar = adsbVar.c;
                    adsh adshVar = new adsh(g.d, new adsa(adsbVar, g, str));
                    adgb adgbVar = adshVar.a;
                    if (!(adgbVar instanceof adfy) || ((adfy) adgbVar).b == null) {
                        adsiVar.b(adshVar);
                        O = anaf.O(false);
                    } else {
                        adsiVar.c.set(false);
                        adsiVar.d.set(adsiVar.b.c());
                        O = adsiVar.a(adshVar, 0L);
                    }
                }
            } else {
                adsbVar.a.l(g, str);
                adsbVar.b(false);
                O = anaf.O(true);
            }
        }
        uqq.j();
        AnimatorSet o = o(new uia(this));
        o.playTogether(p(this.n), q(this.m), q(this.l));
        this.q = o;
        o.start();
        anaf.Y(O, new uih(this), angq.a);
    }

    public final void g(boolean z) {
        uqq.j();
        uif uifVar = new uif(this);
        if (z) {
            AnimatorSet o = o(uifVar);
            o.playTogether(q(this.n), p(this.m), p(this.l));
            o.start();
        } else {
            uifVar.onAnimationStart(null);
            uifVar.onAnimationEnd(null);
        }
    }

    public final void h(aost aostVar) {
        aosn aosnVar = (aosn) c().toBuilder();
        aosnVar.copyOnWrite();
        ((aoso) aosnVar.instance).n(aostVar);
        aoso aosoVar = (aoso) aosnVar.build();
        uik uikVar = this.e;
        uikVar.e.a(uikVar.b.a(), aosoVar);
    }

    public final void i(View view) {
        h(aost.WILL_OPEN_USE_ANOTHER_ACCOUNT_EVENT);
        View.OnClickListener onClickListener = this.e.g.b;
        tyo.L(view);
    }

    public final void j(boolean z) {
        ObjectAnimator duration;
        if (this.b == z) {
            return;
        }
        this.b = z;
        this.g.setVisibility(true != z ? 8 : 0);
        SelectedAccountView selectedAccountView = this.h;
        if (z != selectedAccountView.o) {
            selectedAccountView.o = z;
            if (z) {
                selectedAccountView.m.start();
            } else {
                selectedAccountView.m.reverse();
            }
        }
        ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = z ? this.w : 0;
        this.h.requestLayout();
        ViewGroup viewGroup = this.l;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), z ? this.A : 0, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        if (!this.c) {
            if (z) {
                duration = p(this.f).setDuration(150L);
                duration.addListener(new uig(this));
            } else {
                duration = q(this.f).setDuration(150L);
                duration.addListener(new uhu(this));
            }
            duration.start();
        }
        if (tyo.N(getContext())) {
            v(z);
            this.f169J.setVisibility(true != z ? 0 : 4);
            this.K.setVisibility(true != z ? 0 : 8);
        }
        Activity W = tyo.W(getContext());
        if (W == null) {
            throw new IllegalArgumentException("Could not extract activity from context");
        }
        amkq.F(W instanceof zv, "Activity has to be a ComponentActivity");
        zv zvVar = (zv) W;
        if (z) {
            zvVar.getOnBackPressedDispatcher().b(zvVar, this.I);
        } else {
            this.I.c();
            v(false);
            this.g.aa(0);
        }
        m();
    }

    public final void k(amru amruVar, Object obj) {
        String str;
        if (amruVar.isEmpty()) {
            t();
            return;
        }
        if (obj != null) {
            SelectedAccountView selectedAccountView = this.h;
            amkq.O(selectedAccountView.n != null, "Initialize must be called before setting an account.");
            selectedAccountView.n.a(obj);
            u();
            amrp amrpVar = new amrp();
            tyo tyoVar = this.e.g.c;
            str = ((ugh) obj).d;
            if (!ammx.d(str).trim().isEmpty()) {
                amrpVar.h(getResources().getString(R.string.og_continue_as, str));
            }
            amrpVar.h(getResources().getString(R.string.og_continue));
            this.M = new ugx(amrpVar.g());
            this.j.requestLayout();
            m();
        }
    }

    public final void l() {
        float f = 0.0f;
        float min = this.g.getVisibility() == 0 ? this.x * Math.min(1.0f, this.g.computeVerticalScrollOffset() / this.z) : 0.0f;
        jw.S(this.E, min);
        this.F.k(min);
        if (this.g.getVisibility() == 0) {
            float computeVerticalScrollOffset = this.g.computeVerticalScrollOffset();
            float computeVerticalScrollRange = this.g.computeVerticalScrollRange() - this.g.computeVerticalScrollExtent();
            if (computeVerticalScrollOffset < computeVerticalScrollRange) {
                f = this.x * Math.min((computeVerticalScrollRange - computeVerticalScrollOffset) / this.z, 1.0f);
            }
        }
        jw.S(this.l, f);
        this.G.k(f);
    }

    public final void m() {
        String string;
        uqq.j();
        Object obj = this.h.i.g;
        if (obj == null) {
            return;
        }
        Resources resources = getResources();
        tyo tyoVar = this.e.g.c;
        String string2 = resources.getString(R.string.og_selected_account_a11y, tyo.ah(obj));
        String b = this.h.i.b();
        if (!b.isEmpty()) {
            String valueOf = String.valueOf(string2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + b.length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(b);
            string2 = sb.toString();
        }
        if (this.u) {
            String valueOf2 = String.valueOf(string2);
            if (this.b) {
                string = getResources().getString(R.string.og_collapse_account_list_a11y);
            } else {
                string = getResources().getString(R.string.og_expand_account_list_a11y);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(string).length());
            sb2.append(valueOf2);
            sb2.append(" ");
            sb2.append(string);
            string2 = sb2.toString();
        }
        this.h.setContentDescription(string2);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f169J.getLayoutParams().height = 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ugx ugxVar = this.o;
        if (ugxVar != null) {
            ugxVar.a(this.k, this.l.getMeasuredWidth());
        }
        ugx ugxVar2 = this.M;
        if (ugxVar2 != null) {
            ugxVar2.a(this.j, this.l.getMeasuredWidth());
        }
        int measuredHeight = this.l.getMeasuredHeight();
        if (this.m.getPaddingBottom() != measuredHeight) {
            w(this.m, measuredHeight);
            super.onMeasure(i, i2);
        }
        if (this.C.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) this.C.getLayoutParams()).topMargin + ((ViewGroup.MarginLayoutParams) this.C.getLayoutParams()).bottomMargin >= getHeight() && getHeight() > 0 && this.D.getVisibility() == 0) {
            v(true);
            super.onMeasure(i, i2);
        }
        if (jw.aj(this.f169J)) {
            int i3 = this.f169J.getLayoutParams().height;
            int measuredHeight2 = getMeasuredHeight() - this.C.getMeasuredHeight();
            if (i3 != 0) {
                if (this.b || i3 <= measuredHeight2) {
                    return;
                }
                y(this.f169J, measuredHeight2);
                return;
            }
            x();
            int n = n();
            x();
            y(this.f169J, getMeasuredHeight() - Math.max(n, n()));
        }
    }

    public ExpressSignInLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpressSignInLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.I = new uhv(this);
        this.r = new uie(this);
        if (!tyo.Q(context)) {
            throw new IllegalStateException("ExpressSignInLayout has to be used with a Google Material theme");
        }
        LayoutInflater.from(context).inflate(R.layout.express_sign_in_layout, this);
        boolean b = ywt.b(context);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.B = getResources().getColor(b ? R.color.og_elevation_shadow_color_light : R.color.og_elevation_shadow_color_dark);
        this.w = tyo.P(displayMetrics, 8);
        this.x = tyo.O(displayMetrics, true != b ? 5 : 8);
        float O = tyo.O(displayMetrics, true != b ? 3 : 8);
        this.y = O;
        this.z = tyo.P(displayMetrics, 20);
        this.A = tyo.P(displayMetrics, 8);
        this.f = findViewById(R.id.scrim_view);
        SelectedAccountView selectedAccountView = (SelectedAccountView) findViewById(R.id.selected_account);
        this.h = selectedAccountView;
        selectedAccountView.m.setDuration(150L);
        Interpolator interpolator = t;
        selectedAccountView.m.setInterpolator(interpolator);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.account_management_list);
        this.g = recyclerView;
        Resources resources = getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_padding_start);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_margin);
        uge ugeVar = new uge(recyclerView, dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize2 + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_size) + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_title_margin_start) + getResources().getDimensionPixelSize(R.dimen.og_express_sign_in_account_management_extra_horizontal_padding));
        this.H = ugeVar;
        recyclerView.aB(ugeVar);
        recyclerView.af(new LinearLayoutManager());
        this.i = (Button) findViewById(R.id.sign_in_button);
        this.j = (Button) findViewById(R.id.continue_as_button);
        this.k = (Button) findViewById(R.id.secondary_action_button);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content_container);
        this.C = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.footer_container);
        this.l = viewGroup2;
        this.D = findViewById(R.id.header_container);
        View findViewById = findViewById(R.id.selected_account_container);
        this.E = findViewById;
        this.m = findViewById(R.id.accounts_content_container);
        this.n = (ViewGroup) findViewById(R.id.progress_container);
        this.K = (TextView) findViewById(R.id.choose_an_account_a11y);
        alkg r = r();
        r.k(O);
        r.u();
        r.c(s());
        viewGroup.setBackgroundDrawable(r);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.setInterpolator(2, interpolator);
        layoutTransition.setInterpolator(3, interpolator);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        viewGroup.setLayoutTransition(layoutTransition);
        ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.account_management_list_container);
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(150L);
        layoutTransition2.setInterpolator(1, interpolator);
        layoutTransition2.setInterpolator(0, interpolator);
        layoutTransition2.setAnimator(2, null);
        layoutTransition2.setAnimator(3, ValueAnimator.ofInt(0));
        viewGroup3.setLayoutTransition(layoutTransition2);
        alkg r2 = r();
        this.F = r2;
        r2.c(s());
        findViewById.setBackgroundDrawable(r2);
        alkg r3 = r();
        this.G = r3;
        r3.u();
        viewGroup2.setBackgroundDrawable(r3);
        r2.n(O);
        r3.n(O);
        recyclerView.aD(new uhw(this));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f169J = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
    }
}
