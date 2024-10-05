package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfb {
    public final long a;
    public final long b;
    final long c;

    public dfb(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dfb dfbVar = (dfb) obj;
        return this.a == dfbVar.a && this.c == dfbVar.c && this.b == dfbVar.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        StringBuilder sb = new StringBuilder(121);
        sb.append("Entry{firstChunk=");
        sb.append(j);
        sb.append(", samplesPerChunk=");
        sb.append(j2);
        sb.append(", sampleDescriptionIndex=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
