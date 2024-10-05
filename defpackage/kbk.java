package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kbk {
    public final long a;
    public final long b;

    public kbk() {
    }

    public kbk(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kbk) {
            kbk kbkVar = (kbk) obj;
            if (this.a == kbkVar.a && this.b == kbkVar.b) {
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
        StringBuilder sb = new StringBuilder(101);
        sb.append("SmartDownloadsHeaderData{numBytes=");
        sb.append(j);
        sb.append(", latestUpdateTimestampMs=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
