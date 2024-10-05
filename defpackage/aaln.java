package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaln {
    public static final aaln a = a().a();
    public final aakt b;
    public final aaku c;
    public final aoqa d;

    public aaln() {
    }

    public aaln(aakt aaktVar, aaku aakuVar, aoqa aoqaVar) {
        this.b = aaktVar;
        this.c = aakuVar;
        this.d = aoqaVar;
    }

    public static aalm a() {
        aalm aalmVar = new aalm();
        aalmVar.c(aaku.a);
        aalmVar.b(aalj.a);
        return aalmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaln) {
            aaln aalnVar = (aaln) obj;
            aakt aaktVar = this.b;
            if (aaktVar != null ? aaktVar.equals(aalnVar.b) : aalnVar.b == null) {
                if (this.c.equals(aalnVar.c) && this.d.equals(aalnVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("InternalEntityWrapper{wrappedEntity=");
        sb.append(valueOf);
        sb.append(", metadata=");
        sb.append(valueOf2);
        sb.append(", applicability=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        aakt aaktVar = this.b;
        return (((((aaktVar == null ? 0 : aaktVar.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
