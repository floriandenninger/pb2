package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xjm {
    private ammv a;
    private ammv b;
    private aomf c;
    private amru d;
    private Long e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private int j;

    public xjm() {
    }

    public xjm(byte[] bArr) {
        this.a = amlr.a;
        this.b = amlr.a;
    }

    public final xjn a() {
        amru amruVar;
        int i;
        Long l;
        aomf aomfVar = this.c;
        if (aomfVar == null || (amruVar = this.d) == null || (i = this.j) == 0 || (l = this.e) == null || this.f == null || this.g == null || this.h == null || this.i == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" trackingParams");
            }
            if (this.d == null) {
                sb.append(" visualStateChangeTriggers");
            }
            if (this.j == 0) {
                sb.append(" visualState");
            }
            if (this.e == null) {
                sb.append(" currentPositionMillis");
            }
            if (this.f == null) {
                sb.append(" animate");
            }
            if (this.g == null) {
                sb.append(" fullscreen");
            }
            if (this.h == null) {
                sb.append(" shownLogged");
            }
            if (this.i == null) {
                sb.append(" visualChanged");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xjn(this.a, this.b, aomfVar, amruVar, i, l.longValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue());
    }

    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void c(long j) {
        this.e = Long.valueOf(j);
    }

    public final void d(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void e(ammv ammvVar) {
        if (ammvVar == null) {
            throw new NullPointerException("Null onClickedRenderer");
        }
        this.b = ammvVar;
    }

    public final void f(ammv ammvVar) {
        if (ammvVar == null) {
            throw new NullPointerException("Null renderer");
        }
        this.a = ammvVar;
    }

    public final void g(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void h(aomf aomfVar) {
        if (aomfVar == null) {
            throw new NullPointerException("Null trackingParams");
        }
        this.c = aomfVar;
    }

    public final void i(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void j(amru amruVar) {
        if (amruVar == null) {
            throw new NullPointerException("Null visualStateChangeTriggers");
        }
        this.d = amruVar;
    }

    public final void k(int i) {
        if (i == 0) {
            throw new NullPointerException("Null visualState");
        }
        this.j = i;
    }
}
