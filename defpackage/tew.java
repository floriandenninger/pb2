package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tew {
    public Rect a;
    public Rect b;
    public Integer c;
    private Double d;
    private Double e;
    private Double f;
    private Double g;
    private Double h;
    private Double i;
    private Double j;
    private Double k;
    private Double l;
    private amru m;

    public final tex a() {
        Double d = this.d;
        if (d == null || this.e == null || this.f == null || this.g == null || this.h == null || this.i == null || this.j == null || this.k == null || this.l == null || this.m == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" exposure");
            }
            if (this.e == null) {
                sb.append(" maxExposure");
            }
            if (this.f == null) {
                sb.append(" minExposure");
            }
            if (this.g == null) {
                sb.append(" volume");
            }
            if (this.h == null) {
                sb.append(" maxVolume");
            }
            if (this.i == null) {
                sb.append(" minVolume");
            }
            if (this.j == null) {
                sb.append(" screenShare");
            }
            if (this.k == null) {
                sb.append(" maxScreenShare");
            }
            if (this.l == null) {
                sb.append(" minScreenShare");
            }
            if (this.m == null) {
                sb.append(" mtosBuckets");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new tex(d.doubleValue(), this.e.doubleValue(), this.f.doubleValue(), this.g.doubleValue(), this.h.doubleValue(), this.i.doubleValue(), this.j.doubleValue(), this.k.doubleValue(), this.l.doubleValue(), this.a, this.b, this.c, this.m);
    }

    public final void b(double d) {
        this.d = Double.valueOf(d);
    }

    public final void c(double d) {
        this.e = Double.valueOf(d);
    }

    public final void d(double d) {
        this.k = Double.valueOf(d);
    }

    public final void e(double d) {
        this.h = Double.valueOf(d);
    }

    public final void f(double d) {
        this.f = Double.valueOf(d);
    }

    public final void g(double d) {
        this.l = Double.valueOf(d);
    }

    public final void h(double d) {
        this.i = Double.valueOf(d);
    }

    public final void i(amru amruVar) {
        if (amruVar == null) {
            throw new NullPointerException("Null mtosBuckets");
        }
        this.m = amruVar;
    }

    public final void j(double d) {
        this.j = Double.valueOf(d);
    }

    public final void k(double d) {
        this.g = Double.valueOf(d);
    }
}
