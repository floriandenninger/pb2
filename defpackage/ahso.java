package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahso extends ahta {
    private final long a;
    private final long b;

    public ahso(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.ahta
    public long a() {
        return this.b;
    }

    @Override // defpackage.ahta
    public long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahta) {
            ahta ahtaVar = (ahta) obj;
            if (this.a == ahtaVar.b() && this.b == ahtaVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(90);
        sb.append("PlaybackLoopRunningEvent{startTimeMs=");
        sb.append(j);
        sb.append(", endTimeMs=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
