package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ptq {
    private long a;
    private long b;
    private long c;
    private final ThreadLocal d = new ThreadLocal();

    public ptq(long j) {
        f(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.b == -9223372036854775807L) {
            long j2 = this.a;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.d.get();
                pse.c(l);
                j2 = l.longValue();
            }
            this.b = j2 - j;
            notifyAll();
        }
        this.c = j;
        return j + this.b;
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = (((-1) + j4) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return a((j * 1000000) / 90000);
    }

    public final synchronized long c() {
        long j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long d() {
        long j;
        j = this.c;
        return j != -9223372036854775807L ? j + this.b : c();
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized void f(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }
}
