package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uki {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final int j;
    private final String k;
    private final int l;

    public uki() {
    }

    public uki(String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, boolean z3, int i, String str6, String str7, int i2) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z2;
        this.h = z3;
        this.j = i;
        this.i = str6;
        this.k = str7;
        this.l = i2;
    }

    public static ukh a() {
        ukh ukhVar = new ukh();
        ukhVar.d(false);
        ukhVar.c(false);
        ukhVar.e(true);
        ukhVar.h = 1;
        ukhVar.g = 1;
        return ukhVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uki) {
            uki ukiVar = (uki) obj;
            if (this.a.equals(ukiVar.a) && this.b == ukiVar.b && ((str = this.c) != null ? str.equals(ukiVar.c) : ukiVar.c == null) && ((str2 = this.d) != null ? str2.equals(ukiVar.d) : ukiVar.d == null) && ((str3 = this.e) != null ? str3.equals(ukiVar.e) : ukiVar.e == null) && ((str4 = this.f) != null ? str4.equals(ukiVar.f) : ukiVar.f == null) && this.g == ukiVar.g && this.h == ukiVar.h) {
                int i = this.j;
                int i2 = ukiVar.j;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((str5 = this.i) != null ? str5.equals(ukiVar.i) : ukiVar.i == null) && ((str6 = this.k) != null ? str6.equals(ukiVar.k) : ukiVar.k == null)) {
                    int i3 = this.l;
                    int i4 = ukiVar.l;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        int hashCode5 = (((((hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true == this.h ? 1231 : 1237)) * 1000003;
        int i = this.j;
        if (i == 0) {
            throw null;
        }
        int i2 = (hashCode5 ^ i) * 1000003;
        String str5 = this.i;
        int hashCode6 = (i2 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.k;
        int hashCode7 = (hashCode6 ^ (str6 != null ? str6.hashCode() : 0)) * 1000003;
        int i3 = this.l;
        if (i3 != 0) {
            return hashCode7 ^ i3;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        String z4 = uou.z(this.j);
        String str6 = this.i;
        String str7 = this.k;
        int i = this.l;
        String str8 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "TWENTY_ONE_OR_OLDER" : "EIGHTEEN_TO_TWENTY" : "LESS_THAN_EIGHTEEN" : "UNKNOWN";
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 204 + length2 + length3 + String.valueOf(str4).length() + String.valueOf(str5).length() + z4.length() + String.valueOf(str6).length() + String.valueOf(str7).length() + str8.length());
        sb.append("GoogleOwner{accountName=");
        sb.append(str);
        sb.append(", isMetadataAvailable=");
        sb.append(z);
        sb.append(", displayName=");
        sb.append(str2);
        sb.append(", givenName=");
        sb.append(str3);
        sb.append(", familyName=");
        sb.append(str4);
        sb.append(", obfuscatedGaiaId=");
        sb.append(str5);
        sb.append(", isG1User=");
        sb.append(z2);
        sb.append(", isDasherUser=");
        sb.append(z3);
        sb.append(", isUnicornUser=");
        sb.append(z4);
        sb.append(", avatarUrl=");
        sb.append(str6);
        sb.append(", defaultAvatarUrl=");
        sb.append(str7);
        sb.append(", ageRange=");
        sb.append(str8);
        sb.append("}");
        return sb.toString();
    }
}
