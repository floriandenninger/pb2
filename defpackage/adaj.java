package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adaj {
    public final String a;
    public final int b;
    public final int c;

    public adaj() {
    }

    public adaj(int i, String str) {
        this.b = i;
        this.c = 6;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adaj)) {
            return false;
        }
        adaj adajVar = (adaj) obj;
        int i = this.b;
        int i2 = adajVar.b;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            int i3 = this.c;
            int i4 = adajVar.c;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i4 && this.a.equals(adajVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.b;
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        int i2 = this.c;
        String num2 = i2 != 0 ? Integer.toString(i2 - 1) : "null";
        String str = this.a;
        StringBuilder sb = new StringBuilder(num.length() + 61 + num2.length() + String.valueOf(str).length());
        sb.append("MarkHandoffActionModel{actionState=");
        sb.append(num);
        sb.append(", featureType=");
        sb.append(num2);
        sb.append(", actionId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            throw null;
        }
        int i2 = (i ^ 1000003) * 1000003;
        int i3 = this.c;
        if (i3 != 0) {
            return ((i2 ^ i3) * 1000003) ^ this.a.hashCode();
        }
        throw null;
    }
}
