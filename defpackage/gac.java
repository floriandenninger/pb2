package defpackage;

import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gac {
    public fzn a;
    public fzq b;
    public fzv c;
    public fzx d;
    public Object e;
    public Boolean f;
    private fzg g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private ActionBarColor k;
    private ActionBarColor l;
    private Integer m;
    private ActionBarColor n;
    private Integer o;
    private ActionBarColor p;
    private ActionBarColor q;

    public gac() {
    }

    public gac(gad gadVar) {
        this.g = gadVar.a;
        this.a = gadVar.b;
        this.b = gadVar.c;
        this.c = gadVar.d;
        this.d = gadVar.e;
        this.h = Boolean.valueOf(gadVar.f);
        this.i = Boolean.valueOf(gadVar.g);
        this.e = gadVar.h;
        this.j = Boolean.valueOf(gadVar.i);
        this.k = gadVar.j;
        this.l = gadVar.k;
        this.m = Integer.valueOf(gadVar.l);
        this.n = gadVar.m;
        this.o = Integer.valueOf(gadVar.n);
        this.p = gadVar.o;
        this.q = gadVar.p;
        this.f = Boolean.valueOf(gadVar.q);
    }

    public final gad a() {
        Boolean bool;
        fzg fzgVar = this.g;
        if (fzgVar == null || (bool = this.h) == null || this.i == null || this.j == null || this.k == null || this.l == null || this.m == null || this.n == null || this.o == null || this.p == null || this.q == null || this.f == null) {
            StringBuilder sb = new StringBuilder();
            if (this.g == null) {
                sb.append(" actionBarModel");
            }
            if (this.h == null) {
                sb.append(" enableTranslucentActionBar");
            }
            if (this.i == null) {
                sb.append(" hideTitleOnTranslucentActionBar");
            }
            if (this.j == null) {
                sb.append(" isHeaderRendererCollapsible");
            }
            if (this.k == null) {
                sb.append(" backgroundColor");
            }
            if (this.l == null) {
                sb.append(" statusBarColor");
            }
            if (this.m == null) {
                sb.append(" primaryTextStyleResId");
            }
            if (this.n == null) {
                sb.append(" primaryTextColor");
            }
            if (this.o == null) {
                sb.append(" secondaryTextStyleResId");
            }
            if (this.p == null) {
                sb.append(" secondaryTextColor");
            }
            if (this.q == null) {
                sb.append(" indicatorColor");
            }
            if (this.f == null) {
                sb.append(" translucentWhenAccessibilityEnabled");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new gad(fzgVar, this.a, this.b, this.c, this.d, bool.booleanValue(), this.i.booleanValue(), this.e, this.j.booleanValue(), this.k, this.l, this.m.intValue(), this.n, this.o.intValue(), this.p, this.q, this.f.booleanValue());
    }

    public final void b(ActionBarColor actionBarColor) {
        if (actionBarColor == null) {
            throw new NullPointerException("Null backgroundColor");
        }
        this.k = actionBarColor;
    }

    public final void c(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void e(ActionBarColor actionBarColor) {
        if (actionBarColor == null) {
            throw new NullPointerException("Null indicatorColor");
        }
        this.q = actionBarColor;
    }

    public final void f(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    public final void g(ActionBarColor actionBarColor) {
        if (actionBarColor == null) {
            throw new NullPointerException("Null primaryTextColor");
        }
        this.n = actionBarColor;
    }

    public final void h(int i) {
        this.m = Integer.valueOf(i);
    }

    public final void i(ActionBarColor actionBarColor) {
        if (actionBarColor == null) {
            throw new NullPointerException("Null secondaryTextColor");
        }
        this.p = actionBarColor;
    }

    public final void j(int i) {
        this.o = Integer.valueOf(i);
    }

    public final void k(ActionBarColor actionBarColor) {
        if (actionBarColor == null) {
            throw new NullPointerException("Null statusBarColor");
        }
        this.l = actionBarColor;
    }

    public final void l(fzg fzgVar) {
        if (fzgVar == null) {
            throw new NullPointerException("Null actionBarModel");
        }
        this.g = fzgVar;
    }

    public final void m(amml ammlVar) {
        fzg fzgVar = this.g;
        if (fzgVar == null) {
            throw new IllegalStateException("Property \"actionBarModel\" has not been set");
        }
        l(((fzf) ammlVar.apply(new fzf(fzgVar))).a());
    }
}
