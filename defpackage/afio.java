package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afio {
    public final int a;
    public final int b;
    public final long c;
    public final boolean d;

    public afio(int i, int i2, long j, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afio)) {
            return false;
        }
        afio afioVar = (afio) obj;
        return afioVar.a == this.a && afioVar.b == this.b && afioVar.c == this.c;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        long j = this.c;
        StringBuilder sb = new StringBuilder(66);
        sb.append("RawBandwidthSample(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
