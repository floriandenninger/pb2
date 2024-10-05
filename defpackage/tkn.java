package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tkn {
    public final String a;
    public final ammv b;
    public final ammv c;
    private final ammv d;
    private final ammv e;
    private final ammv f;
    private final int g;
    private final int h;

    public tkn() {
    }

    public tkn(String str, ammv ammvVar, ammv ammvVar2, ammv ammvVar3, ammv ammvVar4, ammv ammvVar5, int i, int i2) {
        this.a = str;
        this.d = ammvVar;
        this.e = ammvVar2;
        this.f = ammvVar3;
        this.b = ammvVar4;
        this.c = ammvVar5;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tkn) {
            tkn tknVar = (tkn) obj;
            if (this.a.equals(tknVar.a) && this.d.equals(tknVar.d) && this.e.equals(tknVar.e) && this.f.equals(tknVar.f) && this.b.equals(tknVar.b) && this.c.equals(tknVar.c) && this.g == tknVar.g) {
                int i = this.h;
                int i2 = tknVar.h;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g) * 1000003;
        int i = this.h;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.b);
        String valueOf5 = String.valueOf(this.c);
        int i = this.g;
        int i2 = this.h;
        String str2 = i2 != 1 ? i2 != 2 ? "null" : "ALL" : "NONE";
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 195 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + str2.length());
        sb.append("DownloadFileGroupRequest{groupName=");
        sb.append(str);
        sb.append(", accountOptional=");
        sb.append(valueOf);
        sb.append(", contentTitleOptional=");
        sb.append(valueOf2);
        sb.append(", contentTextOptional=");
        sb.append(valueOf3);
        sb.append(", downloadConditionsOptional=");
        sb.append(valueOf4);
        sb.append(", listenerOptional=");
        sb.append(valueOf5);
        sb.append(", groupSizeBytes=");
        sb.append(i);
        sb.append(", showNotifications=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
