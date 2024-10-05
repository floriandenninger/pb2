package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxn implements aixx {
    private final long a;
    private final long b;
    private final long c;

    public gxn() {
    }

    public gxn(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public static gxn e(long j, long j2, long j3) {
        return new gxn(j, j2, j3);
    }

    @Override // defpackage.aixx
    public final long a() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aixx
    public final long b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aixx
    public final long c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aixx
    public final long d() {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gxn) {
            gxn gxnVar = (gxn) obj;
            if (this.a == gxnVar.a && this.b == gxnVar.b && this.c == gxnVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aixx
    public final long f() {
        return this.c;
    }

    @Override // defpackage.aixx
    public final long g() {
        return this.a;
    }

    @Override // defpackage.aixx
    public final long h() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        StringBuilder sb = new StringBuilder(146);
        sb.append("VideoTimeInfoSnapshot{lastKnownPositionMillis=");
        sb.append(j);
        sb.append(", startPositionMillis=");
        sb.append(j2);
        sb.append(", durationMillis=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
