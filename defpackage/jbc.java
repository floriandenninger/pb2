package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jbc {
    public final fhg a;
    public final boolean b;
    public final asra c;

    public jbc() {
    }

    public jbc(fhg fhgVar, boolean z, asra asraVar) {
        this.a = fhgVar;
        this.b = z;
        this.c = asraVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jbb a() {
        jbb jbbVar = new jbb();
        jbbVar.c(fhg.NONE);
        jbbVar.b(false);
        return jbbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jbc) {
            jbc jbcVar = (jbc) obj;
            if (this.a.equals(jbcVar.a) && this.b == jbcVar.b) {
                asra asraVar = this.c;
                asra asraVar2 = jbcVar.c;
                if (asraVar != null ? asraVar.equals(asraVar2) : asraVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        asra asraVar = this.c;
        return hashCode ^ (asraVar == null ? 0 : asraVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58 + String.valueOf(valueOf2).length());
        sb.append("Model{playerViewMode=");
        sb.append(valueOf);
        sb.append(", isEnabled=");
        sb.append(z);
        sb.append(", liveChatRenderer=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
