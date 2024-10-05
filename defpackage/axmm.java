package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmm {
    final int a;
    final short b;

    public axmm(int i, short s) {
        this.a = i;
        this.b = s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axmm axmmVar = (axmm) obj;
        return this.a == axmmVar.a && this.b == axmmVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        int i = this.a;
        short s = this.b;
        StringBuilder sb = new StringBuilder(54);
        sb.append("{availableBitrate=");
        sb.append(i);
        sb.append(", targetRateShare=");
        sb.append((int) s);
        sb.append("}");
        return sb.toString();
    }
}
