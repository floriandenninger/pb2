package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;
import com.google.android.apps.youtube.app.ui.actionbar.MainScrollingViewBehavior;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mai extends lyy implements ValueAnimator.AnimatorUpdateListener {
    public final AppTabsBar c;
    public final ConstraintLayout d;
    public final lza e;
    public final alfk f;
    public final maw g;
    public final aaea h;
    public final lyy i;
    public final aadw j;
    public final lkb k;
    private final ValueAnimator l;
    private final AnimatorListenerAdapter m;
    private final AnimatorListenerAdapter n;
    private final MainScrollingViewBehavior o;
    private final gje p;

    public mai(Context context, maw mawVar, AppTabsBar appTabsBar, ConstraintLayout constraintLayout, axpg axpgVar, MainCollapsingToolbarLayout mainCollapsingToolbarLayout, MainScrollingViewBehavior mainScrollingViewBehavior, azrw azrwVar, lza lzaVar, aadw aadwVar, lkb lkbVar, aaea aaeaVar, gje gjeVar, lyy lyyVar, byte[] bArr) {
        super(context, axpgVar);
        AppBarLayout.Behavior behavior;
        this.g = mawVar;
        this.c = appTabsBar;
        this.f = mainCollapsingToolbarLayout;
        this.d = constraintLayout;
        this.o = mainScrollingViewBehavior;
        this.e = lzaVar;
        appTabsBar.d((zau) azrwVar.get());
        this.k = lkbVar;
        this.j = aadwVar;
        this.h = aaeaVar;
        this.p = gjeVar;
        this.i = lyyVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l = ofFloat;
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new LinearInterpolator());
        if (Build.VERSION.SDK_INT >= 22) {
            ofFloat.setCurrentFraction(1.0f);
        } else {
            ofFloat.setCurrentPlayTime(250L);
        }
        ofFloat.addUpdateListener(this);
        this.m = new maf(this);
        this.n = new mag(this);
        ahh ahhVar = (ahh) ((maq) axpgVar).a.getLayoutParams();
        ahe aheVar = ahhVar.a;
        if (aheVar instanceof AppBarLayout.Behavior) {
            behavior = (AppBarLayout.Behavior) aheVar;
        } else {
            behavior = new AppBarLayout.Behavior();
            ahhVar.b(behavior);
        }
        ((AppBarLayout.BaseBehavior) behavior).b = new alfa(this);
    }

    private final int n(ActionBarColor actionBarColor) {
        return actionBarColor.le(this.a);
    }

    private final boolean o() {
        bue f = this.p.f();
        return ((f instanceof gkb) && ((gkb) f).e()) ? false : true;
    }

    private final boolean p() {
        return this.c.j() > 1;
    }

    @Override // defpackage.lyy
    protected final int a() {
        return this.g.c();
    }

    @Override // defpackage.lyy
    protected final ViewGroup c() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lyy
    public final void e() {
        if (((ViewGroup) this.d.getParent()) != d()) {
            super.e();
            ((alfd) this.d.getLayoutParams()).a = 0;
            this.l.cancel();
        }
    }

    @Override // defpackage.lyy
    protected final void f() {
        this.l.addListener(this.n);
        this.l.removeListener(this.m);
        this.l.reverse();
    }

    @Override // defpackage.lyy
    public final void h(gad gadVar) {
        ActionBarColor actionBarColor = gadVar.m;
        ActionBarColor actionBarColor2 = gadVar.o;
        ActionBarColor actionBarColor3 = gadVar.p;
        this.c.p(n(actionBarColor));
        this.c.e(n(actionBarColor), n(actionBarColor2));
        AppTabsBar appTabsBar = this.c;
        ((DefaultTabsBar) appTabsBar).a = n(actionBarColor3);
        appTabsBar.invalidate();
        int n = n(gadVar.j) | (-16777216);
        if (this.g.t()) {
            this.d.setBackgroundColor(n);
        } else {
            this.d.setBackground(null);
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lyy
    public final void i() {
        this.l.addListener(this.m);
        this.l.removeListener(this.n);
        this.l.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lyy
    public final boolean j() {
        if (o()) {
            if (p()) {
                return true;
            }
            if (!zev.e(this.a) && this.e.h() == 1 && !yjk.aa(this.a)) {
                return true;
            }
        }
        return false;
    }

    public final void k(boolean z) {
        this.o.a = z;
    }

    public final void l() {
        d().m(false, false);
        this.g.s();
        k(true);
        this.f.requestLayout();
    }

    public final void m() {
        ConstraintLayout constraintLayout = this.d;
        boolean z = false;
        if (o() && p()) {
            z = true;
        }
        whu.I(constraintLayout, z);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.d.getLayoutParams() == null) {
            return;
        }
        float animatedFraction = this.l.getAnimatedFraction();
        yny.z(this.d, yny.n((int) (this.g.c() * animatedFraction)), ViewGroup.LayoutParams.class);
        this.d.setAlpha(animatedFraction);
        if (animatedFraction == 0.0f) {
            zev.d(d());
        } else if (animatedFraction == 1.0f) {
            zev.d(this.d);
        }
    }
}
