package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ysk {
    public final String a;
    public final yse b;
    public final ysi c;
    public final int d;
    public final int e;

    public ysk(int i, String str, yse yseVar, ysi ysiVar) {
        if (i == 0) {
            throw new NullPointerException("Null method");
        }
        this.e = i;
        if (str != null) {
            this.a = str;
            if (yseVar != null) {
                this.b = yseVar;
                this.c = ysiVar;
                this.d = 2;
                return;
            }
            throw new NullPointerException("Null headers");
        }
        throw new NullPointerException("Null url");
    }

    public static ysj a() {
        return new ysj();
    }

    public static ysj b(String str) {
        ysj a = a();
        a.c = 1;
        a.a = str;
        return a;
    }

    public static ysj c(String str) {
        ysj a = a();
        a.c = 2;
        a.a = str;
        a.b = ysh.a;
        return a;
    }

    public final boolean equals(Object obj) {
        ysi ysiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ysk) {
            ysk yskVar = (ysk) obj;
            if (this.e == yskVar.e && this.a.equals(yskVar.a) && this.b.equals(yskVar.b) && ((ysiVar = this.c) != null ? ysiVar.equals(yskVar.c) : yskVar.c == null) && this.d == yskVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.e ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        ysi ysiVar = this.c;
        return (((hashCode ^ (ysiVar == null ? 0 : ysiVar.hashCode())) * 1000003) ^ this.d) * (-721379959);
    }

    public final String toString() {
        int i = this.e;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "HEAD" : "DELETE" : "PUT" : "POST" : "GET";
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(str.length() + 103 + str2.length() + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + "null".length() + "null".length());
        sb.append("HttpRequest{method=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", headers=");
        sb.append(valueOf);
        sb.append(", body=");
        sb.append(valueOf2);
        sb.append(", priority=");
        sb.append(i2);
        sb.append(", readTimeoutMs=");
        sb.append("null");
        sb.append(", connectionTimeoutMs=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }

    public ysk() {
    }
}
