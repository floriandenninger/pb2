package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class voj {
    public final ammv a;
    public final ammv b;
    public final int c;

    public voj() {
    }

    public voj(ammv ammvVar, int i, ammv ammvVar2) {
        this.a = ammvVar;
        this.c = i;
        this.b = ammvVar2;
    }

    public static voi a() {
        return new voi(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof voj) {
            voj vojVar = (voj) obj;
            if (this.a.equals(vojVar.a)) {
                int i = this.c;
                int i2 = vojVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(vojVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.c;
        vls.b(i);
        return ((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String a = vls.a(this.c);
        String valueOf2 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 33 + a.length() + String.valueOf(valueOf2).length());
        sb.append("UriResource{uri=");
        sb.append(valueOf);
        sb.append(", state=");
        sb.append(a);
        sb.append(", event=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
