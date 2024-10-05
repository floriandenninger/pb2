package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jzx {
    public final int a;
    public final int b;

    public jzx() {
    }

    public jzx(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jzx) {
            jzx jzxVar = (jzx) obj;
            if (this.a == jzxVar.a && this.b == jzxVar.b) {
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
        String num = Integer.toString(this.b - 1);
        StringBuilder sb = new StringBuilder(num.length() + 76);
        sb.append("DownloadsPageDisclaimerSectionData{expiryDays=");
        sb.append(i);
        sb.append(", backgroundColor=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }
}
