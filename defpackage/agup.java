package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agup {
    public ammv a;
    public ammv b;
    public ammv c;
    public agmx d;
    public int e;
    private ammv f;
    private Long g;
    private Long h;
    private Double i;
    private Boolean j;
    private ammv k;
    private ammv l;
    private Integer m;

    public agup() {
    }

    public agup(byte[] bArr) {
        this.a = amlr.a;
        this.f = amlr.a;
        this.k = amlr.a;
        this.l = amlr.a;
        this.b = amlr.a;
        this.c = amlr.a;
    }

    public final aguq a() {
        Long l;
        int i = this.e;
        if (i == 0 || (l = this.g) == null || this.h == null || this.i == null || this.j == null || this.m == null) {
            StringBuilder sb = new StringBuilder();
            if (this.e == 0) {
                sb.append(" type");
            }
            if (this.g == null) {
                sb.append(" transferSize");
            }
            if (this.h == null) {
                sb.append(" bytesTransferred");
            }
            if (this.i == null) {
                sb.append(" transferSpeedBytesPerSecond");
            }
            if (this.j == null) {
                sb.append(" usingDataToDownloadStreams");
            }
            if (this.m == null) {
                sb.append(" statusReason");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aguq(i, this.a, this.f, l.longValue(), this.h.longValue(), this.i.doubleValue(), this.j.booleanValue(), this.k, this.l, this.m.intValue(), this.b, this.c, this.d);
    }

    public final void b(long j) {
        this.h = Long.valueOf(j);
    }

    public final void c(atqs atqsVar) {
        this.l = ammv.j(atqsVar);
    }

    public final void d(agnf agnfVar) {
        this.k = ammv.j(agnfVar);
    }

    public final void e(int i) {
        this.m = Integer.valueOf(i);
    }

    public final void f(String str) {
        this.f = ammv.j(str);
    }

    public final void g(long j) {
        this.g = Long.valueOf(j);
    }

    public final void h(double d) {
        this.i = Double.valueOf(d);
    }

    public final void i(boolean z) {
        this.j = Boolean.valueOf(z);
    }
}
