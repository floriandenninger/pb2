package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fid {
    public final ammv a;
    public final ammv b;
    public final ammv c;

    public fid() {
    }

    public fid(ammv ammvVar, ammv ammvVar2, ammv ammvVar3) {
        this.a = ammvVar;
        this.b = ammvVar2;
        this.c = ammvVar3;
    }

    public static fib a() {
        return new fib(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fid) {
            fid fidVar = (fid) obj;
            if (this.a.equals(fidVar.a) && this.b.equals(fidVar.b) && this.c.equals(fidVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DownloadsDataRequest{filterType=");
        sb.append(valueOf);
        sb.append(", maxCount=");
        sb.append(valueOf2);
        sb.append(", sortOrder=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
