package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pli {
    public final long e;
    public final long f;
    public final float a = 0.97f;
    public final float b = 1.03f;
    public final long c = 1000;
    public final float d = 1.0E-7f;
    public final float g = 0.999f;
    public long h = -9223372036854775807L;
    private long s = -9223372036854775807L;
    public long j = -9223372036854775807L;
    public long k = -9223372036854775807L;
    public float n = 0.97f;
    public float m = 1.03f;
    public float o = 1.0f;
    public long p = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public long l = -9223372036854775807L;
    public long q = -9223372036854775807L;
    public long r = -9223372036854775807L;

    public pli(long j, long j2) {
        this.e = j;
        this.f = j2;
    }

    public static long c(long j, long j2) {
        return (((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f);
    }

    public final void a() {
        long j = this.h;
        if (j != -9223372036854775807L) {
            long j2 = this.s;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.j;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.k;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.i == j) {
            return;
        }
        this.i = j;
        this.l = j;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.p = -9223372036854775807L;
    }

    public final void b(long j) {
        this.s = j;
        a();
    }
}
