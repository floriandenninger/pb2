package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dej {
    final dek a;
    public final long b;
    public final long c;
    public final double d;

    public dej(dek dekVar, long j, long j2, double d) {
        this.b = j;
        this.c = j2;
        this.d = d;
        this.a = dekVar;
    }

    public dej(dek dekVar, ByteBuffer byteBuffer) {
        if (dekVar.s() == 1) {
            this.b = did.al(byteBuffer);
            this.c = byteBuffer.getLong();
            this.d = did.ae(byteBuffer);
        } else {
            this.b = did.ak(byteBuffer);
            this.c = byteBuffer.getInt();
            this.d = did.ae(byteBuffer);
        }
        this.a = dekVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dej dejVar = (dej) obj;
        return this.c == dejVar.c && this.b == dejVar.b;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        double d = this.d;
        StringBuilder sb = new StringBuilder(111);
        sb.append("Entry{segmentDuration=");
        sb.append(j);
        sb.append(", mediaTime=");
        sb.append(j2);
        sb.append(", mediaRate=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
