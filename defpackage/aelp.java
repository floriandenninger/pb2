package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aelp {
    public final long a;
    public final long b;

    public aelp() {
    }

    public aelp(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aelp) {
            aelp aelpVar = (aelp) obj;
            if (this.a == aelpVar.a && this.b == aelpVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(75);
        sb.append("TimeRange{startTimeMs=");
        sb.append(j);
        sb.append(", endTimeMs=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
