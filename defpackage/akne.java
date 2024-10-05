package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akne {
    public final String a;
    public final String b;
    public final String c;

    public akne() {
    }

    public akne(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static akne a(String str, String str2, String str3) {
        amkq.J(!"AppGlobalScope".equals(str), "userId cannot be %s. Use createAppGlobalKey to generate an app scoped key.", "AppGlobalScope");
        amkq.J(!"SignedOutID".equals(str), "userId cannot be %s. Use createSignedOutUserKey to generate a key for signed out user.", "SignedOutID");
        return c(str, str2, str3);
    }

    public static akne b(String str, String str2) {
        return c("SignedOutID", str, str2);
    }

    private static akne c(String str, String str2, String str3) {
        String str4;
        String str5;
        aknd akndVar = new aknd();
        akndVar.a = str2;
        if (str3 == null) {
            throw new NullPointerException("Null key");
        }
        akndVar.c = str3;
        akndVar.b = str;
        String str6 = akndVar.a;
        if (str6 == null || (str4 = akndVar.b) == null || (str5 = akndVar.c) == null) {
            StringBuilder sb = new StringBuilder();
            if (akndVar.a == null) {
                sb.append(" namespace");
            }
            if (akndVar.b == null) {
                sb.append(" userId");
            }
            if (akndVar.c == null) {
                sb.append(" key");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        akne akneVar = new akne(str6, str4, str5);
        amkq.F(!akneVar.b.isEmpty(), "userId cannot be empty");
        amkq.F(!akneVar.c.isEmpty(), "Key cannot be empty.");
        amkq.F(!akneVar.a.isEmpty(), "namespace cannot be empty.");
        return akneVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akne) {
            akne akneVar = (akne) obj;
            if (this.a.equals(akneVar.a) && this.b.equals(akneVar.b) && this.c.equals(akneVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 41 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("BlobStorageKey{namespace=");
        sb.append(str);
        sb.append(", userId=");
        sb.append(str2);
        sb.append(", key=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
