package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gdo {
    public Integer a;
    public ammv b;
    public ammv c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Integer m;
    private Integer n;
    private Integer o;
    private Integer p;
    private Integer q;
    private Integer r;
    private Integer s;
    private Integer t;
    private Integer u;
    private Integer v;
    private Integer w;
    private Integer x;
    private Integer y;
    private Integer z;

    public gdo() {
    }

    public gdo(byte[] bArr) {
        this.b = amlr.a;
        this.c = amlr.a;
    }

    public final gdp a() {
        Boolean bool = this.d;
        if (bool == null || this.e == null || this.f == null || this.g == null || this.h == null || this.i == null || this.j == null || this.k == null || this.l == null || this.m == null || this.n == null || this.o == null || this.a == null || this.p == null || this.q == null || this.r == null || this.s == null || this.t == null || this.u == null || this.v == null || this.w == null || this.x == null || this.y == null || this.z == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" hasAvatar");
            }
            if (this.e == null) {
                sb.append(" hasCheckbox");
            }
            if (this.f == null) {
                sb.append(" hasIcon");
            }
            if (this.g == null) {
                sb.append(" hasText");
            }
            if (this.h == null) {
                sb.append(" shouldUseButtonStyleText");
            }
            if (this.i == null) {
                sb.append(" shouldSkipIconTint");
            }
            if (this.j == null) {
                sb.append(" clickable");
            }
            if (this.k == null) {
                sb.append(" useTouchFeedbackCircleAsBackground");
            }
            if (this.l == null) {
                sb.append(" useMultilineTextView");
            }
            if (this.m == null) {
                sb.append(" iconMarginStart");
            }
            if (this.n == null) {
                sb.append(" iconMarginEnd");
            }
            if (this.o == null) {
                sb.append(" iconDimensions");
            }
            if (this.a == null) {
                sb.append(" textPaddingStart");
            }
            if (this.p == null) {
                sb.append(" textPaddingEnd");
            }
            if (this.q == null) {
                sb.append(" textPaddingStartWithImage");
            }
            if (this.r == null) {
                sb.append(" minimumWidth");
            }
            if (this.s == null) {
                sb.append(" cornerRadius");
            }
            if (this.t == null) {
                sb.append(" textViewGravity");
            }
            if (this.u == null) {
                sb.append(" selectedTextColor");
            }
            if (this.v == null) {
                sb.append(" unselectedTextColor");
            }
            if (this.w == null) {
                sb.append(" selectedBackgroundResource");
            }
            if (this.x == null) {
                sb.append(" unselectedBackgroundResource");
            }
            if (this.y == null) {
                sb.append(" selectedRippleColor");
            }
            if (this.z == null) {
                sb.append(" unselectedRippleColor");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new gdp(bool.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.intValue(), this.n.intValue(), this.o.intValue(), this.a.intValue(), this.p.intValue(), this.q.intValue(), this.r.intValue(), this.s.intValue(), this.t.intValue(), this.u.intValue(), this.v.intValue(), this.b, this.w.intValue(), this.x.intValue(), this.c, this.y.intValue(), this.z.intValue());
    }

    public final void b(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    public final void c(int i) {
        this.s = Integer.valueOf(i);
    }

    public final void d(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void g(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void h(int i) {
        this.o = Integer.valueOf(i);
    }

    public final void i(int i) {
        this.n = Integer.valueOf(i);
    }

    public final void j(int i) {
        this.m = Integer.valueOf(i);
    }

    public final void k(int i) {
        this.r = Integer.valueOf(i);
    }

    public final void l(int i) {
        this.w = Integer.valueOf(i);
    }

    public final void m(int i) {
        this.y = Integer.valueOf(i);
    }

    public final void n(int i) {
        this.u = Integer.valueOf(i);
    }

    public final void o(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void p(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void q(int i) {
        this.p = Integer.valueOf(i);
    }

    public final void r(int i) {
        this.q = Integer.valueOf(i);
    }

    public final void s(int i) {
        this.t = Integer.valueOf(i);
    }

    public final void t(int i) {
        this.x = Integer.valueOf(i);
    }

    public final void u(int i) {
        this.z = Integer.valueOf(i);
    }

    public final void v(int i) {
        this.v = Integer.valueOf(i);
    }

    public final void w(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    public final void x(boolean z) {
        this.k = Boolean.valueOf(z);
    }
}
