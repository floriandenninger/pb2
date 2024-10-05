package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class peu {
    private long a;
    private volatile long b = Long.MIN_VALUE;

    public final long a(long j) {
        if (this.b != Long.MIN_VALUE) {
            long j2 = (this.b + 4294967296L) / 8589934592L;
            long j3 = (((-1) + j2) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - this.b) < Math.abs(j - this.b)) {
                j = j3;
            }
        }
        long j4 = (1000000 * j) / 90000;
        if (this.b == Long.MIN_VALUE) {
            this.a = -j4;
        }
        this.b = j;
        return j4 + this.a;
    }

    public final void b() {
        this.b = Long.MIN_VALUE;
    }
}
