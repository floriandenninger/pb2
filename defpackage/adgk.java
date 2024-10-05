package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgk {
    public final String a;
    public final String b;
    public final String c;
    public final amsx d;
    private final String e;

    public adgk(String str, String str2, String str3, String str4, amsx amsxVar) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            this.e = str3;
            this.c = str4;
            if (amsxVar != null) {
                this.d = amsxVar;
                return;
            }
            throw new NullPointerException("Null capabilities");
        }
        throw new NullPointerException("Null id");
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adgk) {
            adgk adgkVar = (adgk) obj;
            if (this.a.equals(adgkVar.a) && this.b.equals(adgkVar.b) && ((str = this.e) != null ? str.equals(adgkVar.e) : adgkVar.e == null) && this.c.equals(adgkVar.c) && this.d.equals(adgkVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.e;
        return ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.e;
        String str4 = this.c;
        String valueOf = String.valueOf(this.d);
        int length = str.length();
        int length2 = str2.length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 94 + length2 + length3 + str4.length() + String.valueOf(valueOf).length());
        sb.append("SessionMemberInternal{type=");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", encryptionKey=");
        sb.append(str3);
        sb.append(", receiverIdentityMatchStatus=");
        sb.append(str4);
        sb.append(", capabilities=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public adgk() {
    }
}
