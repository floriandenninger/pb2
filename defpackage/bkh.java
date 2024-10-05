package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bkh implements bkf {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    public bkh(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    private final long d(int i) {
        return (this.c * i) / 100;
    }

    @Override // defpackage.biz
    public final long a() {
        return this.c;
    }

    @Override // defpackage.biz
    public final bix b(long j) {
        if (!c()) {
            bja bjaVar = new bja(0L, this.a + this.b);
            return new bix(bjaVar, bjaVar);
        }
        long m = pts.m(j, 0L, this.c);
        double d = m;
        Double.isNaN(d);
        double d2 = this.c;
        Double.isNaN(d2);
        double d3 = (d * 100.0d) / d2;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d4 = 256.0d;
            } else {
                int i = (int) d3;
                double d5 = ((long[]) pse.d(this.f))[i];
                double d6 = i == 99 ? 256.0d : r3[i + 1];
                double d7 = i;
                Double.isNaN(d7);
                Double.isNaN(d5);
                Double.isNaN(d5);
                d4 = d5 + ((d3 - d7) * (d6 - d5));
            }
        }
        double d8 = this.d;
        Double.isNaN(d8);
        bja bjaVar2 = new bja(m, this.a + pts.m(Math.round((d4 / 256.0d) * d8), this.b, this.d - 1));
        return new bix(bjaVar2, bjaVar2);
    }

    @Override // defpackage.biz
    public final boolean c() {
        return this.f != null;
    }

    @Override // defpackage.bkf
    public final long e() {
        return this.e;
    }

    @Override // defpackage.bkf
    public final long f(long j) {
        double d;
        long j2 = j - this.a;
        if (!c() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = (long[]) pse.d(this.f);
        double d2 = j2;
        Double.isNaN(d2);
        double d3 = this.d;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int an = pts.an(jArr, (long) d4, true);
        long d5 = d(an);
        long j3 = jArr[an];
        int i = an + 1;
        long d6 = d(i);
        long j4 = an == 99 ? 256L : jArr[i];
        if (j3 == j4) {
            d = 0.0d;
        } else {
            double d7 = j3;
            Double.isNaN(d7);
            double d8 = j4 - j3;
            Double.isNaN(d8);
            d = (d4 - d7) / d8;
        }
        double d9 = d6 - d5;
        Double.isNaN(d9);
        return d5 + Math.round(d * d9);
    }
}
