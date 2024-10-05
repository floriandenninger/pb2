package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ysq {
    public final int a;
    public final String b;
    public final yse c;
    public final yso d;
    private final String e;

    public ysq() {
    }

    public ysq(String str, int i, String str2, yse yseVar, yso ysoVar) {
        this.e = str;
        this.a = i;
        this.b = str2;
        this.c = yseVar;
        this.d = ysoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ysq) {
            ysq ysqVar = (ysq) obj;
            if (this.e.equals(ysqVar.e) && this.a == ysqVar.a && this.b.equals(ysqVar.b) && this.c.equals(ysqVar.c)) {
                yso ysoVar = this.d;
                yso ysoVar2 = ysqVar.d;
                if (ysoVar != null ? ysoVar.equals(ysoVar2) : ysoVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        yso ysoVar = this.d;
        return hashCode ^ (ysoVar == null ? 0 : ysoVar.hashCode());
    }

    public final String toString() {
        String str = this.e;
        int i = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("HttpResponse{protocol=");
        sb.append(str);
        sb.append(", statusCode=");
        sb.append(i);
        sb.append(", reasonPhrase=");
        sb.append(str2);
        sb.append(", headers=");
        sb.append(valueOf);
        sb.append(", body=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
