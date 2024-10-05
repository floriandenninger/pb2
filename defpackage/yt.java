package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yt implements ts {
    public final Toolbar a;
    public int b;
    public View c;
    CharSequence d;
    public Window.Callback e;
    boolean f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private boolean j;
    private CharSequence k;
    private CharSequence l;
    private sb m;
    private int n;
    private Drawable o;

    public yt(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.d = toolbar.n;
        this.k = toolbar.o;
        this.j = this.d != null;
        this.i = toolbar.e();
        yk l = yk.l(toolbar.getContext(), null, nx.a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.o = l.h(15);
        if (!z) {
            if (toolbar.e() != null) {
                this.o = toolbar.e();
            } else {
                i = 11;
            }
            this.b = i;
        } else {
            CharSequence m = l.m(27);
            if (!TextUtils.isEmpty(m)) {
                q(m);
            }
            CharSequence m2 = l.m(25);
            if (!TextUtils.isEmpty(m2)) {
                this.k = m2;
                if ((this.b & 8) != 0) {
                    toolbar.t(m2);
                }
            }
            Drawable h = l.h(20);
            if (h != null) {
                l(h);
            }
            Drawable h2 = l.h(17);
            if (h2 != null) {
                this.g = h2;
                H();
            }
            if (this.i == null && (drawable = this.o) != null) {
                p(drawable);
            }
            k(l.c(10, 0));
            int f = l.f(9, 0);
            if (f != 0) {
                j(LayoutInflater.from(toolbar.getContext()).inflate(f, (ViewGroup) toolbar, false));
                k(this.b | 16);
            }
            int e = l.e(13, 0);
            if (e > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = e;
                toolbar.setLayoutParams(layoutParams);
            }
            int a = l.a(7, -1);
            int a2 = l.a(3, -1);
            if (a >= 0 || a2 >= 0) {
                toolbar.m(Math.max(a, 0), Math.max(a2, 0));
            }
            int f2 = l.f(28, 0);
            if (f2 != 0) {
                toolbar.y(toolbar.getContext(), f2);
            }
            int f3 = l.f(26, 0);
            if (f3 != 0) {
                toolbar.u(toolbar.getContext(), f3);
            }
            int f4 = l.f(22, 0);
            if (f4 != 0) {
                toolbar.s(f4);
            }
        }
        l.o();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.h())) {
                o(this.n);
            }
        }
        this.l = toolbar.h();
        toolbar.r(new yr(this));
    }

    private final void E(CharSequence charSequence) {
        this.d = charSequence;
        if ((this.b & 8) != 0) {
            this.a.x(charSequence);
        }
    }

    private final void F() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.l)) {
                this.a.o(this.n);
            } else {
                this.a.p(this.l);
            }
        }
    }

    private final void G() {
        if ((this.b & 4) == 0) {
            this.a.q(null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.i;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.q(drawable);
    }

    private final void H() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.h) == null) {
            drawable = this.g;
        }
        this.a.n(drawable);
    }

    @Override // defpackage.ts
    public final void A() {
    }

    @Override // defpackage.ts
    public final void B() {
    }

    @Override // defpackage.ts
    public final void C() {
    }

    @Override // defpackage.ts
    public final void D() {
        this.a.requestLayout();
    }

    @Override // defpackage.ts
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ts
    public final Context b() {
        return this.a.getContext();
    }

    @Override // defpackage.ts
    public final ka c(int i, long j) {
        ka q = jw.q(this.a);
        q.c(i == 0 ? 1.0f : 0.0f);
        q.d(j);
        q.f(new ys(this, i));
        return q;
    }

    @Override // defpackage.ts
    public final View d() {
        return this.c;
    }

    @Override // defpackage.ts
    public final ViewGroup e() {
        return this.a;
    }

    @Override // defpackage.ts
    public final void f() {
        this.a.i();
    }

    @Override // defpackage.ts
    public final void g() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.e();
        }
    }

    @Override // defpackage.ts
    public final void h() {
    }

    @Override // defpackage.ts
    public final void i() {
    }

    @Override // defpackage.ts
    public final void j(View view) {
        View view2 = this.c;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.c = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    @Override // defpackage.ts
    public final void k(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    F();
                }
                G();
            }
            if ((i2 & 3) != 0) {
                H();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.x(this.d);
                    this.a.t(this.k);
                } else {
                    this.a.x(null);
                    this.a.t(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // defpackage.ts
    public final void l(Drawable drawable) {
        this.h = drawable;
        H();
    }

    @Override // defpackage.ts
    public final void m(Menu menu, rd rdVar) {
        if (this.m == null) {
            this.m = new sb(this.a.getContext());
        }
        sb sbVar = this.m;
        sbVar.e = rdVar;
        Toolbar toolbar = this.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.k();
        qq qqVar = toolbar.a.a;
        if (qqVar == menu) {
            return;
        }
        if (qqVar != null) {
            qqVar.m(toolbar.r);
            qqVar.m(toolbar.s);
        }
        if (toolbar.s == null) {
            toolbar.s = new yo(toolbar);
        }
        sbVar.o();
        if (menu != null) {
            qq qqVar2 = (qq) menu;
            qqVar2.h(sbVar, toolbar.f);
            qqVar2.h(toolbar.s, toolbar.f);
        } else {
            sbVar.b(toolbar.f, null);
            toolbar.s.b(toolbar.f, null);
            sbVar.i();
            toolbar.s.i();
        }
        toolbar.a.g(toolbar.g);
        toolbar.a.h(sbVar);
        toolbar.r = sbVar;
    }

    @Override // defpackage.ts
    public final void n() {
        this.f = true;
    }

    @Override // defpackage.ts
    public final void o(int i) {
        this.l = i == 0 ? null : b().getString(i);
        F();
    }

    @Override // defpackage.ts
    public final void p(Drawable drawable) {
        this.i = drawable;
        G();
    }

    @Override // defpackage.ts
    public final void q(CharSequence charSequence) {
        this.j = true;
        E(charSequence);
    }

    @Override // defpackage.ts
    public final void r(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.ts
    public final void s(Window.Callback callback) {
        this.e = callback;
    }

    @Override // defpackage.ts
    public final void t(CharSequence charSequence) {
        if (this.j) {
            return;
        }
        E(charSequence);
    }

    @Override // defpackage.ts
    public final boolean u() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.ts
    public final boolean v() {
        yo yoVar = this.a.s;
        return (yoVar == null || yoVar.b == null) ? false : true;
    }

    @Override // defpackage.ts
    public final boolean w() {
        return this.a.B();
    }

    @Override // defpackage.ts
    public final boolean x() {
        sb sbVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (sbVar = actionMenuView.c) == null) {
            return false;
        }
        return sbVar.m != null || sbVar.l();
    }

    @Override // defpackage.ts
    public final boolean y() {
        return this.a.C();
    }

    @Override // defpackage.ts
    public final boolean z() {
        return this.a.D();
    }
}
