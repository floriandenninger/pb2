package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uhh {
    public final uik a;
    public final uim b;
    public final ammv c;

    public uhh() {
    }

    public uhh(uik uikVar, uim uimVar, ammv ammvVar) {
        this.a = uikVar;
        this.b = uimVar;
        this.c = ammvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uhh) {
            uhh uhhVar = (uhh) obj;
            if (this.a.equals(uhhVar.a) && this.b.equals(uhhVar.b) && this.c.equals(uhhVar.c)) {
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
        StringBuilder sb = new StringBuilder(length + 84 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ExpressSignInConfiguration{expressSignInManager=");
        sb.append(valueOf);
        sb.append(", expressSignInSpec=");
        sb.append(valueOf2);
        sb.append(", modelUpdater=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
