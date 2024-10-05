package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxw {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public adxw() {
    }

    public adxw(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adxw) {
            adxw adxwVar = (adxw) obj;
            if (this.a == adxwVar.a && this.b == adxwVar.b && this.c == adxwVar.c && this.d == adxwVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        return ((int) ((j4 >>> 32) ^ j4)) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        StringBuilder sb = new StringBuilder(159);
        sb.append("CacheMetrics{currentSizeBytes=");
        sb.append(j);
        sb.append(", maxSizeBytes=");
        sb.append(j2);
        sb.append(", freeDiskSpace=");
        sb.append(j3);
        sb.append(", totalDiskSpace=");
        sb.append(j4);
        sb.append("}");
        return sb.toString();
    }
}
