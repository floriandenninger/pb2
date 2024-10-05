package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alcm extends awxr {
    final /* synthetic */ alcn a;
    private final String b;
    private long c = -1;
    private long d;
    private long e;

    public alcm(alcn alcnVar, String str) {
        this.a = alcnVar;
        this.b = str;
    }

    private final void as(axam axamVar) {
        double d;
        awzu c = axamVar.c();
        double c2 = this.a.b.c() - this.e;
        Double.isNaN(c2);
        double d2 = c2 / 1000.0d;
        if (c != null) {
            double e = c.e();
            Double.isNaN(e);
            d = e / 1048576.0d;
        } else {
            d = 0.0d;
        }
        StringBuilder sb = new StringBuilder(101);
        sb.append("Transferred ");
        sb.append(d);
        sb.append("MB in ");
        sb.append(d2);
        sb.append("s (");
        sb.append((d * 8.0d) / d2);
        sb.append(" MBit/s)");
        zga.g(sb.toString());
    }

    @Override // defpackage.awxr
    public final void a(axam axamVar) {
        long c = this.a.b.c();
        double d = Double.NaN;
        if (this.c != -1) {
            awzu c2 = axamVar.c();
            long e = c2 != null ? c2.e() : 0L;
            long j = e - this.c;
            if (j != 0) {
                long a = c2 != null ? c2.a() : 0L;
                if (a != -1) {
                    double d2 = a - e;
                    double d3 = j;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    double d4 = d2 / d3;
                    double d5 = c - this.d;
                    Double.isNaN(d5);
                    d = (d4 * d5) / 1000.0d;
                }
            }
        }
        if (this.c == -1) {
            awzu c3 = axamVar.c();
            this.c = c3 != null ? c3.e() : 0L;
            this.d = c;
        }
        this.a.s(this.b, axamVar, d);
    }

    @Override // defpackage.awxr
    public final void b(axam axamVar) {
        as(axamVar);
    }

    @Override // defpackage.awxr
    public final void c(axam axamVar) {
        as(axamVar);
    }

    @Override // defpackage.awxr
    public final void d() {
        this.e = this.a.b.c();
    }
}
