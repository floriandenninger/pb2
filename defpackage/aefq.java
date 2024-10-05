package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aefq {
    public static final aefq a = a(-1, -1, 0, 0, -1, null);
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final String g;

    public aefq() {
    }

    public aefq(long j, long j2, long j3, long j4, int i, String str) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = i;
        this.g = str;
    }

    public static aefq a(long j, long j2, long j3, long j4, int i, String str) {
        return new aefq(j, j2, j3, j4, i, zhq.h(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aefq) {
            aefq aefqVar = (aefq) obj;
            if (this.b == aefqVar.b && this.c == aefqVar.c && this.d == aefqVar.d && this.e == aefqVar.e && this.f == aefqVar.f && this.g.equals(aefqVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        long j4 = this.e;
        return this.g.hashCode() ^ ((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f) * 1000003);
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        long j4 = this.e;
        int i = this.f;
        String str = this.g;
        StringBuilder sb = new StringBuilder(str.length() + 236);
        sb.append("MedialibPlayerTimeInfo{currentPositionMillis=");
        sb.append(j);
        sb.append(", currentUtcTimeMillis=");
        sb.append(j2);
        sb.append(", durationMillis=");
        sb.append(j3);
        sb.append(", bufferedPositionMillis=");
        sb.append(j4);
        sb.append(", liveEndToEndLatencyMillis=");
        sb.append(i);
        sb.append(", cpn=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
