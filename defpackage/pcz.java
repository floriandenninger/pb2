package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pcz implements pcw {
    private final long a;
    private final long b;
    private final long c;
    private final long[] d;
    private final long e;
    private final int g;

    public pcz(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
        this.e = j4;
        this.g = i;
    }

    private final long e(int i) {
        return (this.b * i) / 100;
    }

    @Override // defpackage.pcw
    public final long a() {
        return this.b;
    }

    @Override // defpackage.pcm
    public final boolean c() {
        return this.d != null;
    }

    @Override // defpackage.pcw
    public final long d(long j) {
        long j2 = 0;
        if (c()) {
            long j3 = this.a;
            if (j >= j3) {
                double d = j - j3;
                Double.isNaN(d);
                double d2 = this.e;
                Double.isNaN(d2);
                double d3 = (d * 256.0d) / d2;
                int s = pgz.s(this.d, (long) d3, false) + 1;
                long e = e(s);
                long j4 = s == 0 ? 0L : this.d[s - 1];
                long j5 = s == 99 ? 256L : this.d[s];
                long e2 = e(s + 1);
                if (j5 != j4) {
                    double d4 = e2 - e;
                    double d5 = j4;
                    Double.isNaN(d5);
                    Double.isNaN(d4);
                    double d6 = d4 * (d3 - d5);
                    double d7 = j5 - j4;
                    Double.isNaN(d7);
                    j2 = (long) (d6 / d7);
                }
                return e + j2;
            }
        }
        return 0L;
    }

    @Override // defpackage.pcm
    public final long b(long j) {
        if (!c()) {
            return this.a;
        }
        float f = (((float) j) * 100.0f) / ((float) this.b);
        if (f <= 0.0f) {
            r0 = 0.0f;
        } else if (f < 100.0f) {
            int i = (int) f;
            float f2 = i != 0 ? (float) this.d[i - 1] : 0.0f;
            r0 = (((i < 99 ? (float) this.d[i] : 256.0f) - f2) * (f - i)) + f2;
        }
        long j2 = this.e;
        double d = r0;
        Double.isNaN(d);
        double d2 = j2;
        Double.isNaN(d2);
        long round = Math.round(d * 0.00390625d * d2) + this.a;
        long j3 = this.c;
        return Math.min(round, j3 != -1 ? j3 - 1 : ((r0 - this.g) + this.e) - 1);
    }
}
