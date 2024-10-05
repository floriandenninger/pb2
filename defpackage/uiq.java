package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uiq {
    public final String a;
    public final ammv b;
    private final ammv c;
    private final ammv d;

    public uiq() {
    }

    public uiq(String str, ammv ammvVar, ammv ammvVar2, ammv ammvVar3) {
        this.a = str;
        this.b = ammvVar;
        this.c = ammvVar2;
        this.d = ammvVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uiq) {
            uiq uiqVar = (uiq) obj;
            if (this.a.equals(uiqVar.a) && this.b.equals(uiqVar.b) && this.c.equals(uiqVar.c) && this.d.equals(uiqVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 80 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("CustomHeaderContentFeature{title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append(valueOf);
        sb.append(", titleTypeface=");
        sb.append(valueOf2);
        sb.append(", subtitleTypeface=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
