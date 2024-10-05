package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zwv {
    public final zwt a;
    public final ammv b;
    public final int c;
    public final String d;
    public final ammv e;

    public zwv() {
    }

    public zwv(zwt zwtVar, ammv ammvVar, int i, String str, ammv ammvVar2) {
        this.a = zwtVar;
        this.b = ammvVar;
        this.c = i;
        this.d = str;
        this.e = ammvVar2;
    }

    public static zwu a() {
        return new zwu(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zwv) {
            zwv zwvVar = (zwv) obj;
            if (this.a.equals(zwvVar.a) && this.b.equals(zwvVar.b) && this.c == zwvVar.c && this.d.equals(zwvVar.d) && this.e.equals(zwvVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        String str = this.d;
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(str).length() + String.valueOf(valueOf3).length());
        sb.append("Album{albumType=");
        sb.append(valueOf);
        sb.append(", coverFile=");
        sb.append(valueOf2);
        sb.append(", fileCount=");
        sb.append(i);
        sb.append(", name=");
        sb.append(str);
        sb.append(", directory=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
