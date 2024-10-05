package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aajy {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public aajy(String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            if (str3 != null) {
                this.c = str3;
                if (str4 != null) {
                    this.d = str4;
                    return;
                }
                throw new NullPointerException("Null tableName");
            }
            throw new NullPointerException("Null sql");
        }
        throw new NullPointerException("Null type");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aajy) {
            aajy aajyVar = (aajy) obj;
            if (this.a.equals(aajyVar.a) && this.b.equals(aajyVar.b) && this.c.equals(aajyVar.c) && this.d.equals(aajyVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 46 + length2 + str3.length() + str4.length());
        sb.append("MasterTableRow{name=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(", sql=");
        sb.append(str3);
        sb.append(", tableName=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }

    public aajy() {
    }
}
