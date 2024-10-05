package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class itc implements ita {
    public final int a;
    public final int b;

    public itc() {
    }

    public itc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static itc a(int i, int i2) {
        return new itc(i, i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof itc) {
            itc itcVar = (itc) obj;
            if (this.a == itcVar.a && this.b == itcVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(63);
        sb.append("ErrorState{uploadsFailed=");
        sb.append(i);
        sb.append(", totalUploads=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
