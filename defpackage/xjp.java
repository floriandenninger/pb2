package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xjp {
    public xkd a;
    public xkb b;
    public xjs c;
    public xka d;
    public xjw e;
    public xju f;
    public xjy g;
    private Boolean h;
    private Boolean i;
    private Integer j;
    private Integer k;
    private Integer l;
    private aomf m;
    private asht n;

    public final xjq a() {
        Boolean bool = this.h;
        if (bool == null || this.i == null || this.j == null || this.k == null || this.l == null || this.a == null || this.b == null || this.c == null || this.d == null || this.e == null || this.f == null || this.g == null || this.m == null || this.n == null) {
            StringBuilder sb = new StringBuilder();
            if (this.h == null) {
                sb.append(" adOverlayShown");
            }
            if (this.i == null) {
                sb.append(" overflowMenuShown");
            }
            if (this.j == null) {
                sb.append(" currentPositionMillis");
            }
            if (this.k == null) {
                sb.append(" bufferedPositionMillis");
            }
            if (this.l == null) {
                sb.append(" durationMillis");
            }
            if (this.a == null) {
                sb.append(" skipButtonState");
            }
            if (this.b == null) {
                sb.append(" mdxAdOverlayState");
            }
            if (this.c == null) {
                sb.append(" adProgressTextState");
            }
            if (this.d == null) {
                sb.append(" learnMoreOverlayState");
            }
            if (this.e == null) {
                sb.append(" adTitleOverlayState");
            }
            if (this.f == null) {
                sb.append(" adReEngagementState");
            }
            if (this.g == null) {
                sb.append(" brandInteractionState");
            }
            if (this.m == null) {
                sb.append(" overlayTrackingParams");
            }
            if (this.n == null) {
                sb.append(" interactionLoggingClientData");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xjq(bool.booleanValue(), this.i.booleanValue(), this.j.intValue(), this.k.intValue(), this.l.intValue(), this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.m, this.n);
    }

    public final xjs b() {
        xjs xjsVar = this.c;
        if (xjsVar != null) {
            return xjsVar;
        }
        throw new IllegalStateException("Property \"adProgressTextState\" has not been set");
    }

    public final xju c() {
        xju xjuVar = this.f;
        if (xjuVar != null) {
            return xjuVar;
        }
        throw new IllegalStateException("Property \"adReEngagementState\" has not been set");
    }

    public final xjy d() {
        xjy xjyVar = this.g;
        if (xjyVar != null) {
            return xjyVar;
        }
        throw new IllegalStateException("Property \"brandInteractionState\" has not been set");
    }

    public final xka e() {
        xka xkaVar = this.d;
        if (xkaVar != null) {
            return xkaVar;
        }
        throw new IllegalStateException("Property \"learnMoreOverlayState\" has not been set");
    }

    public final xkd f() {
        xkd xkdVar = this.a;
        if (xkdVar != null) {
            return xkdVar;
        }
        throw new IllegalStateException("Property \"skipButtonState\" has not been set");
    }

    public final void g(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void h(int i) {
        this.k = Integer.valueOf(i);
    }

    public final void i(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void j(int i) {
        this.l = Integer.valueOf(i);
    }

    public final void k() {
        g(false);
        m(false);
        i(-1);
        h(-1);
        j(-1);
        this.a = xkd.b().a();
        this.c = xjs.b().a();
        this.d = xka.a().a();
        this.e = xjw.a().a();
        this.f = xju.b().a();
        this.g = xjy.b().a();
        n(aomf.b);
        l(asht.a);
    }

    public final void l(asht ashtVar) {
        if (ashtVar == null) {
            throw new NullPointerException("Null interactionLoggingClientData");
        }
        this.n = ashtVar;
    }

    public final void m(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void n(aomf aomfVar) {
        if (aomfVar == null) {
            throw new NullPointerException("Null overlayTrackingParams");
        }
        this.m = aomfVar;
    }
}
