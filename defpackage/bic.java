package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bic implements biz, bkf {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public bic(long j, long j2, int i, int i2) {
        long g;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            g = -9223372036854775807L;
        } else {
            this.d = j - j2;
            g = g(j, j2, i);
        }
        this.f = g;
    }

    private static long g(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // defpackage.biz
    public final long a() {
        return this.f;
    }

    @Override // defpackage.biz
    public final bix b(long j) {
        long j2 = this.d;
        if (j2 != -1) {
            int i = this.e;
            long j3 = this.c;
            long j4 = (((i * j) / 8000000) / j3) * j3;
            if (j2 != -1) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.b + Math.max(j4, 0L);
            long d = d(max);
            bja bjaVar = new bja(d, max);
            if (this.d != -1 && d < j) {
                long j5 = max + this.c;
                if (j5 < this.a) {
                    return new bix(bjaVar, new bja(d(j5), j5));
                }
            }
            return new bix(bjaVar, bjaVar);
        }
        bja bjaVar2 = new bja(0L, this.b);
        return new bix(bjaVar2, bjaVar2);
    }

    @Override // defpackage.biz
    public final boolean c() {
        return this.d != -1;
    }

    public final long d(long j) {
        return g(j, this.b, this.e);
    }

    @Override // defpackage.bkf
    public final long e() {
        return -1L;
    }

    @Override // defpackage.bkf
    public final long f(long j) {
        return d(j);
    }
}
