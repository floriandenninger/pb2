package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lyz implements alff {
    private final ml a;
    private final fzc b;
    private fzg c;
    private final Toolbar d;
    private final lu e;
    private final Resources f;
    private final MainCollapsingToolbarLayout g;
    private final azrw h;
    private final maw i;
    private boolean j;
    private int k;
    private int l;
    private final aadw m;

    public lyz(ml mlVar, maw mawVar, fzc fzcVar, Resources resources, Toolbar toolbar, MainCollapsingToolbarLayout mainCollapsingToolbarLayout, AppBarLayout appBarLayout, azrw azrwVar, aadw aadwVar, fzg fzgVar, ActionBarColor actionBarColor, int i, ActionBarColor actionBarColor2, int i2, ActionBarColor actionBarColor3, boolean z) {
        this.a = mlVar;
        this.i = mawVar;
        azrwVar.getClass();
        this.h = azrwVar;
        fzcVar.getClass();
        this.b = fzcVar;
        this.f = resources;
        this.d = toolbar;
        lu supportActionBar = mlVar.getSupportActionBar();
        supportActionBar.getClass();
        this.e = supportActionBar;
        this.m = aadwVar;
        this.g = mainCollapsingToolbarLayout;
        supportActionBar.l(false);
        this.j = z;
        appBarLayout.i(this);
        this.k = 0;
        this.l = 0;
        b(fzgVar, actionBarColor, i, actionBarColor2, i2, actionBarColor3, z);
    }

    private final int c(ActionBarColor actionBarColor) {
        return actionBarColor.le(this.a);
    }

    private final void d(int i) {
        Toolbar toolbar = this.d;
        toolbar.setPaddingRelative(i, toolbar.getPaddingTop(), this.d.getPaddingEnd(), this.d.getPaddingBottom());
    }

    @Override // defpackage.alfb
    public final void a(AppBarLayout appBarLayout, int i) {
        if (this.l == this.k || !(this.d.getBackground() instanceof ColorDrawable)) {
            return;
        }
        this.d.setBackgroundColor(i < 0 ? this.l : this.k);
        boolean z = this.j;
        MainCollapsingToolbarLayout mainCollapsingToolbarLayout = this.g;
        boolean z2 = false;
        if (z && i >= 0) {
            z2 = true;
        }
        mainCollapsingToolbarLayout.l(z2);
    }

    public final void b(fzg fzgVar, ActionBarColor actionBarColor, int i, ActionBarColor actionBarColor2, int i2, ActionBarColor actionBarColor3, boolean z) {
        fzgVar.getClass();
        int c = c(fzgVar.d);
        if (c == wbs.Q(this.e.b(), R.attr.ytIconActiveOther)) {
            c = wbs.Q(this.e.b(), R.attr.ytTextPrimary);
        }
        fzg fzgVar2 = this.c;
        if (fzgVar2 == null || fzgVar2.e != fzgVar.e) {
            e(fzgVar.e, c);
        }
        fzg fzgVar3 = this.c;
        if (fzgVar3 == null || fzgVar3.d != fzgVar.d) {
            e(fzgVar.e, c);
            this.b.d(c);
            zau zauVar = (zau) this.h.get();
            Toolbar toolbar = this.d;
            toolbar.q(zauVar.b(toolbar.e(), c));
            Drawable drawable = this.e.b().getResources().getDrawable(R.drawable.yt_outline_overflow_vertical_black_24);
            Toolbar toolbar2 = this.d;
            Drawable b = zauVar.b(drawable, c);
            toolbar2.j();
            ActionMenuView actionMenuView = toolbar2.a;
            actionMenuView.d();
            sb sbVar = actionMenuView.c;
            ry ryVar = sbVar.g;
            if (ryVar != null) {
                ryVar.setImageDrawable(b);
            } else {
                sbVar.i = true;
                sbVar.h = b;
            }
        }
        this.b.c(fzgVar.c);
        this.c = fzgVar;
        this.j = z;
        if (!this.i.t()) {
            this.d.setBackground(null);
            this.k = 0;
            this.l = 0;
        } else {
            int c2 = c(actionBarColor);
            this.d.setBackgroundColor(c2);
            this.k = c2;
            this.l = c2 | (-16777216);
        }
        fzg fzgVar4 = this.c;
        View view = fzgVar4.b;
        int i3 = 16;
        if (view != null) {
            if (this.e.d() != view || view.getParent() == null) {
                this.e.h(view, new ls(-1, -1));
            }
        } else {
            this.e.p(fzgVar4.a);
            this.g.k(this.c.a);
            i3 = 8;
        }
        this.e.k(i3, 24);
        this.d.y(this.a, i);
        if (c(actionBarColor2) != 0) {
            this.d.z(c(actionBarColor2));
        }
        this.d.u(this.a, i2);
        if (c(actionBarColor3) != 0) {
            this.d.v(ColorStateList.valueOf(c(actionBarColor3)));
        }
    }

    private final void e(int i, int i2) {
        if (i == 0) {
            this.d.q(null);
            this.d.m(this.f.getDimensionPixelSize(R.dimen.keyline_margin_inset_start), 0);
            d(this.a.getResources().getDimensionPixelSize(R.dimen.toolbar_padding_home_action_none));
        } else {
            if (i != 1) {
                return;
            }
            Drawable a = aii.a(this.e.b(), R.drawable.yt_outline_arrow_left_black_24);
            a.mutate().setColorFilter(i2, PorterDuff.Mode.SRC_IN);
            this.d.q(a);
            this.d.o(R.string.abc_action_bar_up_description);
            if (evr.aV(this.m)) {
                Toolbar toolbar = this.d;
                if (toolbar.m != 0) {
                    toolbar.m = 0;
                    if (toolbar.e() != null) {
                        toolbar.requestLayout();
                    }
                }
            } else {
                this.d.m(this.f.getDimensionPixelSize(R.dimen.keyline_content_inset_start), 0);
            }
            d(this.a.getResources().getDimensionPixelSize(R.dimen.toolbar_padding_home_action_up));
        }
    }
}
