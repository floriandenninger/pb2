package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhw {
    public final long a;
    public final long b;
    public long c = 0;
    public long d;
    public long e;
    public long f;
    public long g;
    private final long h;

    /* JADX INFO: Access modifiers changed from: protected */
    public bhw(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.h = j6;
        this.g = a(j2, 0L, j3, j4, j5, j6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
        return pts.m(((j4 + j7) - j6) - (j7 / 20), j4, (-1) + j5);
    }

    public final void b() {
        this.g = a(this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
