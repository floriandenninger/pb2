package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nab {
    public final boolean a;
    public final aqyg b;
    public final apxf c;
    public final ashb d;

    public nab() {
    }

    public nab(boolean z, aqyg aqygVar, apxf apxfVar, ashb ashbVar) {
        this.a = z;
        this.b = aqygVar;
        this.c = apxfVar;
        this.d = ashbVar;
    }

    public static nab a() {
        return new nab(true, null, null, null);
    }

    public static nab b(aqyg aqygVar, apxf apxfVar, ashb ashbVar) {
        return new nab(false, aqygVar, apxfVar, ashbVar);
    }

    public final boolean equals(Object obj) {
        aqyg aqygVar;
        apxf apxfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof nab) {
            nab nabVar = (nab) obj;
            if (this.a == nabVar.a && ((aqygVar = this.b) != null ? aqygVar.equals(nabVar.b) : nabVar.b == null) && ((apxfVar = this.c) != null ? apxfVar.equals(nabVar.c) : nabVar.c == null)) {
                ashb ashbVar = this.d;
                ashb ashbVar2 = nabVar.d;
                if (ashbVar != null ? ashbVar.equals(ashbVar2) : ashbVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 83 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RulesetValidationResult{isValid=");
        sb.append(z);
        sb.append(", errorText=");
        sb.append(valueOf);
        sb.append(", errorCommand=");
        sb.append(valueOf2);
        sb.append(", validationError=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        aqyg aqygVar = this.b;
        int hashCode = (i ^ (aqygVar == null ? 0 : aqygVar.hashCode())) * 1000003;
        apxf apxfVar = this.c;
        int hashCode2 = (hashCode ^ (apxfVar == null ? 0 : apxfVar.hashCode())) * 1000003;
        ashb ashbVar = this.d;
        return hashCode2 ^ (ashbVar != null ? ashbVar.hashCode() : 0);
    }
}
