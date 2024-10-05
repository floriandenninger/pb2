package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udz {
    public final Object a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final udy g;

    public udz() {
    }

    public udz(Object obj, String str, String str2, String str3, String str4, String str5, udy udyVar) {
        this.a = obj;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = udyVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof udz) {
            udz udzVar = (udz) obj;
            if (this.a.equals(udzVar.a) && ((str = this.b) != null ? str.equals(udzVar.b) : udzVar.b == null) && ((str2 = this.c) != null ? str2.equals(udzVar.c) : udzVar.c == null) && ((str3 = this.d) != null ? str3.equals(udzVar.d) : udzVar.d == null) && ((str4 = this.e) != null ? str4.equals(udzVar.e) : udzVar.e == null) && ((str5 = this.f) != null ? str5.equals(udzVar.f) : udzVar.f == null) && this.g.equals(udzVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        return ((hashCode5 ^ (str5 != null ? str5.hashCode() : 0)) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        String valueOf2 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(str3).length();
        int length5 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 108 + length2 + length3 + length4 + length5 + String.valueOf(str5).length() + String.valueOf(valueOf2).length());
        sb.append("AccountSnapshot{account=");
        sb.append(valueOf);
        sb.append(", accountName=");
        sb.append(str);
        sb.append(", displayName=");
        sb.append(str2);
        sb.append(", givenName=");
        sb.append(str3);
        sb.append(", familyName=");
        sb.append(str4);
        sb.append(", avatarUrl=");
        sb.append(str5);
        sb.append(", gaiaAccountData=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
