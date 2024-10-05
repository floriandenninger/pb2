package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bkd implements bkf {
    private final long[] a;
    private final long[] b;
    private final long c;

    public bkd(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? plh.c(jArr2[jArr2.length - 1]) : j;
    }

    private static Pair d(long j, long[] jArr, long[] jArr2) {
        double d;
        int an = pts.an(jArr, j, true);
        long j2 = jArr[an];
        long j3 = jArr2[an];
        int i = an + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            double d2 = j;
            double d3 = j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = j4 - j2;
            Double.isNaN(d4);
            d = (d2 - d3) / d4;
        }
        Long valueOf = Long.valueOf(j);
        double d5 = j5 - j3;
        Double.isNaN(d5);
        return Pair.create(valueOf, Long.valueOf(((long) (d * d5)) + j3));
    }

    @Override // defpackage.biz
    public final long a() {
        return this.c;
    }

    @Override // defpackage.biz
    public final bix b(long j) {
        Pair d = d(plh.d(pts.m(j, 0L, this.c)), this.b, this.a);
        bja bjaVar = new bja(plh.c(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new bix(bjaVar, bjaVar);
    }

    @Override // defpackage.biz
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bkf
    public final long e() {
        return -1L;
    }

    @Override // defpackage.bkf
    public final long f(long j) {
        return plh.c(((Long) d(j, this.a, this.b).second).longValue());
    }
}
