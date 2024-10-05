package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aelv {
    public final String a;
    public final String b;

    public aelv(String str) {
        this.a = "oroid";
        if (str == null) {
            throw new NullPointerException("Null value");
        }
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aelv) {
            aelv aelvVar = (aelv) obj;
            if (this.a.equals(aelvVar.a) && this.b.equals(aelvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 33 + str2.length());
        sb.append("GenericKeyValuePair{key=");
        sb.append(str);
        sb.append(", value=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public aelv() {
    }
}
