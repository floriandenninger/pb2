package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acza {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public acza() {
    }

    public acza(String str, String str2, String str3) {
        this.d = 3;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static acza a(String str, String str2, String str3) {
        amkq.N(true);
        return new acza(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof acza) {
            acza aczaVar = (acza) obj;
            if (this.d == aczaVar.d && ((str = this.a) != null ? str.equals(aczaVar.a) : aczaVar.a == null) && ((str2 = this.b) != null ? str2.equals(aczaVar.b) : aczaVar.b == null)) {
                String str3 = this.c;
                String str4 = aczaVar.c;
                if (str3 != null ? str3.equals(str4) : str4 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String num = Integer.toString(this.d - 1);
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int length = num.length();
        StringBuilder sb = new StringBuilder(length + 73 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("MdxDeviceInfo{connectionType=");
        sb.append(num);
        sb.append(", manufacturer=");
        sb.append(str);
        sb.append(", modelName=");
        sb.append(str2);
        sb.append(", deviceVersion=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = (this.d ^ 1000003) * 1000003;
        String str = this.a;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        return hashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }
}
