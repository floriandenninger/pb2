package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lgv {
    public final boolean a;
    public final String b;
    public final abcb c;
    public final apxf d;
    public final asas e;
    public final asad f;
    public final String g;

    public lgv() {
    }

    public lgv(boolean z, String str, abcb abcbVar, apxf apxfVar, asas asasVar, asad asadVar, String str2) {
        this.a = z;
        this.b = str;
        this.c = abcbVar;
        this.d = apxfVar;
        this.e = asasVar;
        this.f = asadVar;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        apxf apxfVar;
        asas asasVar;
        asad asadVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lgv) {
            lgv lgvVar = (lgv) obj;
            if (this.a == lgvVar.a && this.b.equals(lgvVar.b) && this.c.equals(lgvVar.c) && ((apxfVar = this.d) != null ? apxfVar.equals(lgvVar.d) : lgvVar.d == null) && ((asasVar = this.e) != null ? asasVar.equals(lgvVar.e) : lgvVar.e == null) && ((asadVar = this.f) != null ? asadVar.equals(lgvVar.f) : lgvVar.f == null)) {
                String str = this.g;
                String str2 = lgvVar.g;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        apxf apxfVar = this.d;
        int hashCode2 = (hashCode ^ (apxfVar == null ? 0 : apxfVar.hashCode())) * 1000003;
        asas asasVar = this.e;
        int hashCode3 = (hashCode2 ^ (asasVar == null ? 0 : asasVar.hashCode())) * 1000003;
        asad asadVar = this.f;
        int hashCode4 = (hashCode3 ^ (asadVar == null ? 0 : asadVar.hashCode())) * 1000003;
        String str = this.g;
        return hashCode4 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String str2 = this.g;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 141 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(str2).length());
        sb.append("SearchServiceRequestBuilder{isPrefetch=");
        sb.append(z);
        sb.append(", query=");
        sb.append(str);
        sb.append(", searchService=");
        sb.append(valueOf);
        sb.append(", navigationEndpoint=");
        sb.append(valueOf2);
        sb.append(", searchboxStats=");
        sb.append(valueOf3);
        sb.append(", searchFormData=");
        sb.append(valueOf4);
        sb.append(", currentVideoId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
