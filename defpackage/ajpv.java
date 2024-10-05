package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajpv {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public ajpv() {
    }

    public ajpv(long j, int i, int i2, int i3, int i4) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpv) {
            ajpv ajpvVar = (ajpv) obj;
            if (this.a == ajpvVar.a && this.b == ajpvVar.b && this.c == ajpvVar.c && this.d == ajpvVar.d && this.e == ajpvVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.e ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        StringBuilder sb = new StringBuilder(122);
        sb.append("MoveAgainParameters{duration=");
        sb.append(j);
        sb.append(", fromX=");
        sb.append(i);
        sb.append(", fromY=");
        sb.append(i2);
        sb.append(", toX=");
        sb.append(i3);
        sb.append(", toY=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
