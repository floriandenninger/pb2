package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ujb {
    public final String a;
    public final String b;
    public final boolean c;
    private final String d;
    private final String e;

    public ujb(String str, String str2, String str3, String str4, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null accountIdentifier");
        }
        this.d = str;
        if (str2 != null) {
            this.a = str2;
            this.b = str3;
            this.e = str4;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    public static ujb a(Object obj) {
        String str;
        String X = tyo.X(obj);
        String Y = tyo.Y(obj);
        String aa = tyo.aa(obj);
        str = ((ugh) obj).g;
        return new ujb(X, Y, aa, str, ((ugh) obj).a);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ujb) {
            ujb ujbVar = (ujb) obj;
            if (this.d.equals(ujbVar.d) && this.a.equals(ujbVar.a) && ((str = this.b) != null ? str.equals(ujbVar.b) : ujbVar.b == null) && ((str2 = this.e) != null ? str2.equals(ujbVar.e) : ujbVar.e == null) && this.c == ujbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        return ((((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ 1231) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.a;
        String str3 = this.b;
        String str4 = this.e;
        boolean z = this.c;
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 137 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("OneGoogleAvatarImageLoaderKey{accountIdentifier=");
        sb.append(str);
        sb.append(", accountName=");
        sb.append(str2);
        sb.append(", displayName=");
        sb.append(str3);
        sb.append(", avatarUrl=");
        sb.append(str4);
        sb.append(", isGaiaAccount=true, isMetadataAvailable=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public ujb() {
    }
}
