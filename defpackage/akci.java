package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akci implements akbm {
    public View a;
    public CharSequence b;
    public CharSequence c;
    public apmg d;
    public apmg e;
    public akbl f;
    public View.OnClickListener g;
    public akcs h;
    private Boolean i;
    private Integer j;
    private Boolean k;
    private Integer l;
    private Integer m;
    private Integer n;
    private Integer o;
    private Float p;
    private ammv q;
    private ammv r;

    public akci() {
    }

    public akci(byte[] bArr) {
        this.q = amlr.a;
        this.r = amlr.a;
    }

    public final akcj a() {
        Boolean bool = this.i;
        if (bool == null || this.j == null || this.k == null || this.l == null || this.m == null || this.n == null || this.o == null || this.p == null) {
            StringBuilder sb = new StringBuilder();
            if (this.i == null) {
                sb.append(" counterfactual");
            }
            if (this.j == null) {
                sb.append(" duration");
            }
            if (this.k == null) {
                sb.append(" rateLimited");
            }
            if (this.l == null) {
                sb.append(" tapDismissalType");
            }
            if (this.m == null) {
                sb.append(" targetEffectType");
            }
            if (this.n == null) {
                sb.append(" placement");
            }
            if (this.o == null) {
                sb.append(" alignment");
            }
            if (this.p == null) {
                sb.append(" maxWidthPercentage");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new akcj(bool.booleanValue(), this.j.intValue(), this.k.booleanValue(), this.a, this.b, this.c, this.d, this.e, this.l.intValue(), this.m.intValue(), this.n.intValue(), this.o.intValue(), this.p.floatValue(), this.q, this.r, this.f, this.g, this.h);
    }

    public final void b(ammv ammvVar) {
        if (ammvVar == null) {
            throw new NullPointerException("Null acceptFeedbackOnTargetTapEnabled");
        }
        this.r = ammvVar;
    }

    public final void c(int i) {
        this.o = Integer.valueOf(i);
    }

    @Override // defpackage.akbm
    public final /* bridge */ /* synthetic */ void d(int i) {
        throw null;
    }

    public final void e(ammv ammvVar) {
        if (ammvVar == null) {
            throw new NullPointerException("Null backgroundColor");
        }
        this.q = ammvVar;
    }

    public final void f(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void g(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void h(float f) {
        this.p = Float.valueOf(f);
    }

    public final void i(int i) {
        this.n = Integer.valueOf(i);
    }

    public final void j(int i) {
        this.l = Integer.valueOf(i);
    }

    public final void k(int i) {
        this.m = Integer.valueOf(i);
    }

    public final /* bridge */ /* synthetic */ void l() {
        this.k = false;
    }
}
