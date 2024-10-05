package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmq {
    public long a;
    public final int b;

    public axmq(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axmq axmqVar = (axmq) obj;
        return this.b == axmqVar.b && this.a == axmqVar.a;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b;
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(74);
        sb.append("Entry{sampleCount=");
        sb.append(j);
        sb.append(", groupDescriptionIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
