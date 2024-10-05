package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qrm {
    public final int a;
    public final int b;

    public qrm(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof qrm) {
            qrm qrmVar = (qrm) obj;
            if (this.a == qrmVar.a && this.b == qrmVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = this.a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
