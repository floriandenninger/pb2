package defpackage;

import android.animation.ArgbEvaluator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.ui.actionbar.ElevatedAppBarLayout;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;
import com.google.android.apps.youtube.app.ui.actionbar.MainScrollingViewBehavior;
import com.google.android.youtube.R;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class maw implements fxr, fzb {
    public static final /* synthetic */ int l = 0;
    private static final int[] m = {R.attr.actionBarSize};
    private final acqz A;
    public final ElevatedAppBarLayout b;
    final mai c;
    final lyy d;
    final lyy e;
    public final lyy f;
    public final zaz g;
    final fxt h;
    final lyz i;
    public int j;
    public boolean k = true;
    private final ml n;
    private final azrw o;
    private final int p;
    private final lyy q;
    private final lza r;
    private final MainScrollingViewBehavior s;
    private final MainCollapsingToolbarLayout t;
    private final fzi u;
    private final gje v;
    private gad w;
    private fza x;
    private View y;
    private alfi z;

    public maw(ml mlVar, AppTabsBar appTabsBar, ViewGroup viewGroup, ConstraintLayout constraintLayout, lza lzaVar, azrw azrwVar, azrw azrwVar2, acqz acqzVar, aadw aadwVar, fzi fziVar, may mayVar, mbl mblVar, mdp mdpVar, ammv ammvVar, ElevatedAppBarLayout elevatedAppBarLayout, fzc fzcVar, lkb lkbVar, final aaea aaeaVar, final ayqi ayqiVar, final obr obrVar, yqw yqwVar, gje gjeVar, final zaz zazVar, byte[] bArr) {
        azrwVar.getClass();
        this.o = azrwVar;
        mlVar.getClass();
        this.n = mlVar;
        acqzVar.getClass();
        this.A = acqzVar;
        elevatedAppBarLayout.getClass();
        this.b = elevatedAppBarLayout;
        lzaVar.getClass();
        this.r = lzaVar;
        gad c = lzaVar.c();
        c.getClass();
        this.w = c;
        this.u = fziVar;
        MainCollapsingToolbarLayout mainCollapsingToolbarLayout = (MainCollapsingToolbarLayout) elevatedAppBarLayout.findViewById(R.id.toolbar_container);
        this.t = mainCollapsingToolbarLayout;
        mainCollapsingToolbarLayout.a = this;
        mainCollapsingToolbarLayout.l(false);
        this.q = mayVar;
        mblVar.getClass();
        this.d = mblVar;
        mdpVar.getClass();
        this.e = mdpVar;
        lyy lyyVar = (lyy) ammvVar.f();
        this.f = lyyVar;
        Toolbar toolbar = (Toolbar) elevatedAppBarLayout.findViewById(R.id.toolbar);
        toolbar.getClass();
        mlVar.setSupportActionBar(toolbar);
        this.v = gjeVar;
        this.g = zazVar;
        yqwVar.f(new Callable() { // from class: mau
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return obrVar.a.X(new mas(maw.this, 0));
            }
        });
        lu supportActionBar = mlVar.getSupportActionBar();
        supportActionBar.getClass();
        Resources resources = supportActionBar.b().getResources();
        gad gadVar = this.w;
        this.i = new lyz(mlVar, this, fzcVar, resources, toolbar, mainCollapsingToolbarLayout, elevatedAppBarLayout, azrwVar2, aadwVar, gadVar.a, gadVar.j, gadVar.l, gadVar.m, gadVar.n, gadVar.o, gadVar.g);
        ahh ahhVar = (ahh) viewGroup.getLayoutParams();
        amkq.N(ahhVar.a instanceof MainScrollingViewBehavior);
        MainScrollingViewBehavior mainScrollingViewBehavior = (MainScrollingViewBehavior) ahhVar.a;
        this.s = mainScrollingViewBehavior;
        TypedArray obtainStyledAttributes = mlVar.getTheme().obtainStyledAttributes(new int[]{android.R.attr.statusBarColor});
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        this.p = color;
        int integer = resources.getInteger(R.integer.anim_time_actionbar_background);
        gad gadVar2 = this.w;
        this.x = y(gadVar2.j, gadVar2.k, gadVar2.q);
        fxt fxtVar = new fxt(this.x, integer);
        this.h = fxtVar;
        elevatedAppBarLayout.setBackground(fxtVar);
        this.c = new mai(mlVar, this, appTabsBar, constraintLayout, new maq(elevatedAppBarLayout), mainCollapsingToolbarLayout, mainScrollingViewBehavior, azrwVar2, lzaVar, aadwVar, lkbVar, aaeaVar, gjeVar, lyyVar, null);
        elevatedAppBarLayout.a = r(evr.af(aaeaVar.a()));
        yqwVar.f(new Callable() { // from class: mao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final maw mawVar = maw.this;
                aaea aaeaVar2 = aaeaVar;
                aypy ab = aaeaVar2.a.Y(luw.h).Y(new ayrv() { // from class: mat
                    @Override // defpackage.ayrv
                    public final Object a(Object obj) {
                        return Float.valueOf(maw.this.r(((Boolean) obj).booleanValue()));
                    }
                }).ab(ayqiVar);
                final ElevatedAppBarLayout elevatedAppBarLayout2 = mawVar.b;
                return ab.ax(new ayrs() { // from class: mar
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        ElevatedAppBarLayout.this.a = ((Float) obj).floatValue();
                    }
                });
            }
        });
        yqwVar.f(new Callable() { // from class: mav
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zazVar.d().X(new mas(maw.this, 1));
            }
        });
    }

    private final void A(ajom ajomVar, Object obj) {
        if (ajomVar != null) {
            ajok o = ahbw.o(ajomVar.a());
            o.a(this.A.mM());
            ajomVar.oB(o, obj);
        }
    }

    private final void B(ActionBarColor actionBarColor, boolean z) {
        ViewGroup viewGroup;
        if (!u() || (viewGroup = (ViewGroup) this.y.getParent()) == null) {
            return;
        }
        viewGroup.removeView(this.y);
        ((ajos) this.o.get()).b(this.y);
        this.y = null;
        F(actionBarColor, z);
        E();
    }

    private final void C(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) this.y.getParent();
        if (viewGroup2 == null || viewGroup2 == viewGroup) {
            return;
        }
        viewGroup2.removeView(this.y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (defpackage.yjk.aa(r0.a) == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void E() {
        /*
            r5 = this;
            mai r0 = r5.c
            maw r1 = r0.g
            boolean r1 = r1.q()
            if (r1 == 0) goto Lc1
            r1 = 0
            r0.k(r1)
            r5.n()
            mai r0 = r5.c
            android.support.constraint.ConstraintLayout r2 = r0.d
            android.view.ViewParent r2 = r2.getParent()
            com.google.android.material.appbar.AppBarLayout r3 = r0.d()
            if (r2 != r3) goto L25
            boolean r2 = r0.j()
            if (r2 != 0) goto Lbd
        L25:
            maw r2 = r0.g
            boolean r2 = r2.u()
            if (r2 != 0) goto Lbd
            android.content.Context r2 = r0.a
            boolean r2 = defpackage.zev.e(r2)
            if (r2 != 0) goto Lb0
            aadw r2 = r0.j
            apwy r2 = r2.b()
            asvu r2 = r2.e
            if (r2 != 0) goto L41
            asvu r2 = defpackage.asvu.a
        L41:
            boolean r2 = r2.bk
            if (r2 != 0) goto L91
            lyy r2 = r0.i
            if (r2 == 0) goto Lb0
            aaea r2 = r0.h
            ammv r2 = defpackage.evr.A(r2)
            boolean r2 = r2.h()
            if (r2 != 0) goto L56
            goto Lb0
        L56:
            aaea r2 = r0.h
            ammv r2 = defpackage.evr.A(r2)
            java.lang.Object r2 = r2.c()
            java.lang.String r3 = "always"
            boolean r2 = r3.equals(r2)
            aaea r3 = r0.h
            ammv r3 = defpackage.evr.A(r3)
            java.lang.Object r3 = r3.c()
            java.lang.String r4 = "chip_bar_present"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L84
            lyy r3 = r0.i
            mec r3 = (defpackage.mec) r3
            boolean r3 = r3.j()
            if (r3 == 0) goto L84
            r3 = 1
            goto L85
        L84:
            r3 = 0
        L85:
            aaea r4 = r0.h
            boolean r4 = defpackage.evr.L(r4)
            if (r4 == 0) goto Lb0
            if (r2 != 0) goto L91
            if (r3 == 0) goto Lb0
        L91:
            lza r2 = r0.e
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r2 = r2.d()
            if (r2 == 0) goto Lb0
            lkb r2 = r0.k
            lza r3 = r0.e
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r3 = r3.d()
            boolean r2 = r2.b(r3)
            if (r2 == 0) goto Lb0
            android.content.Context r0 = r0.a
            boolean r0 = defpackage.yjk.aa(r0)
            if (r0 != 0) goto Lb0
            goto Lbd
        Lb0:
            com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout r0 = r5.t
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            alfd r0 = (defpackage.alfd) r0
            r0.a = r1
            r5.k = r1
            return
        Lbd:
            r5.s()
            return
        Lc1:
            alfk r1 = r0.f
            boolean r1 = defpackage.jw.ak(r1)
            if (r1 != 0) goto Lcd
            r0.l()
            return
        Lcd:
            alfk r1 = r0.f
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            mah r2 = new mah
            r2.<init>(r0, r1)
            r1.addOnGlobalLayoutListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.maw.E():void");
    }

    private final void F(ActionBarColor actionBarColor, boolean z) {
        int x = x(actionBarColor) | (-16777216);
        if (t() || p()) {
            this.t.i(x);
            this.t.a(z);
        } else {
            this.t.h(null);
            this.t.a(false);
        }
    }

    private final void G(gad gadVar) {
        this.d.h(gadVar);
        if (gadVar.b != null) {
            gac a = this.w.a();
            a.a = gadVar.b;
            this.w = a.a();
        }
    }

    private final int w(fxs fxsVar) {
        return fxsVar instanceof fza ? ((fza) fxsVar).c : this.p;
    }

    private final int x(ActionBarColor actionBarColor) {
        return actionBarColor.le(this.n);
    }

    private final fza y(ActionBarColor actionBarColor, ActionBarColor actionBarColor2, boolean z) {
        int x = x(actionBarColor);
        int x2 = x(actionBarColor2);
        if (zev.e(this.n) && !z) {
            x |= -16777216;
        }
        fza fzaVar = this.x;
        return (fzaVar == null || !fzaVar.b(x, x2)) ? new fza(x, x2) : this.x;
    }

    private final gad z(gad gadVar) {
        fzq fzqVar = gadVar.c;
        int i = (fzqVar == null || !fzqVar.a) ? this.j : 1;
        gac a = gadVar.a();
        a.m(new fnz(i, 4));
        gad a2 = a.a();
        this.i.b(a2.a, a2.j, a2.l, a2.m, a2.n, a2.o, a2.g);
        gac a3 = this.w.a();
        a3.l(a2.a);
        this.w = a3.a();
        return a2;
    }

    @Override // defpackage.fxr
    public final void a() {
        this.u.b(fzh.BASE, w(this.x));
    }

    @Override // defpackage.fxr
    public final void b(float f, fxs fxsVar, fxs fxsVar2) {
        this.u.b(fzh.BASE, ((Integer) new ArgbEvaluator().evaluate(f, Integer.valueOf(w(fxsVar)), Integer.valueOf(w(fxsVar2)))).intValue());
    }

    @Override // defpackage.fzb
    public final int c() {
        TypedArray obtainStyledAttributes = this.n.getTheme().obtainStyledAttributes(m);
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        return (int) dimension;
    }

    @Override // defpackage.fzb
    public final int d() {
        return this.x.b;
    }

    @Override // defpackage.fzb
    public final int e() {
        return this.x.c;
    }

    @Override // defpackage.fzb
    public final int f() {
        return this.w.a.e;
    }

    @Override // defpackage.fzb
    public final void g() {
        this.c.c.lf();
    }

    @Override // defpackage.fzb
    public final void h() {
        if (q()) {
            this.b.setVisibility(8);
            E();
        }
    }

    @Override // defpackage.fzb
    public final void i() {
        gac a = this.w.a();
        a.a = null;
        gad a2 = a.a();
        G(a2);
        this.w = a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011c  */
    @Override // defpackage.fzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.maw.j():void");
    }

    @Override // defpackage.fzb
    public final void k(RecyclerView recyclerView) {
        this.t.b(recyclerView);
    }

    @Override // defpackage.fzb
    public final void l() {
        if (q()) {
            return;
        }
        this.b.setVisibility(0);
        E();
    }

    @Override // defpackage.fzb
    public final void m(fzn fznVar) {
        gac a = this.w.a();
        a.a = fznVar;
        G(a.a());
    }

    @Override // defpackage.fzb
    public final void n() {
        if (v()) {
            return;
        }
        boolean z = false;
        if (!p() && !u()) {
            z = true;
        }
        this.b.m(true, z);
    }

    @Override // defpackage.fzb
    public final void o() {
        this.j = this.v.c();
        gac a = this.w.a();
        a.m(new amml() { // from class: map
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                fzf fzfVar = (fzf) obj;
                fzfVar.c(maw.this.j);
                return fzfVar;
            }
        });
        z(a.a());
    }

    @Override // defpackage.fzb
    public final boolean p() {
        return this.s.b;
    }

    @Override // defpackage.fzb
    public final boolean q() {
        return this.b.getVisibility() == 0;
    }

    public final float r(boolean z) {
        return yjk.K(this.n.getResources().getDisplayMetrics(), this.n.getResources().getDimensionPixelSize(true != z ? R.dimen.appbar_layout_elevation : R.dimen.appbar_layout_no_elevation));
    }

    public final void s() {
        ((alfd) this.t.getLayoutParams()).a = true != t() ? 21 : 3;
        this.k = true;
    }

    public final boolean t() {
        return u() && this.y.getParent() == this.t;
    }

    public final boolean u() {
        return this.y != null;
    }

    public final boolean v() {
        if (!t()) {
            return false;
        }
        MainCollapsingToolbarLayout mainCollapsingToolbarLayout = this.t;
        return mainCollapsingToolbarLayout.e != null && mainCollapsingToolbarLayout.b;
    }

    private final void D(ActionBarColor actionBarColor, boolean z, boolean z2) {
        if (!z) {
            C(this.b);
            if (this.y.getParent() == null) {
                this.b.addView(this.y, -1, -2);
                ((alfd) this.y.getLayoutParams()).a = 0;
            }
        } else {
            C(this.t);
            if (this.y.getParent() == null) {
                alfi alfiVar = this.z;
                if (alfiVar == null) {
                    alfiVar = new alfi((byte[]) null);
                    this.z = alfiVar;
                    alfiVar.a = 0;
                }
                this.t.addView(this.y, 0, alfiVar);
            }
        }
        F(actionBarColor, z2);
        E();
    }
}
