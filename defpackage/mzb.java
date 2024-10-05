package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzb {
    public final boolean a;
    public final apxf b;
    public final ashb c;

    public mzb() {
    }

    public mzb(boolean z, apxf apxfVar, ashb ashbVar) {
        this.a = z;
        this.b = apxfVar;
        this.c = ashbVar;
    }

    public static mzb a(boolean z, apxf apxfVar, ashb ashbVar) {
        return new mzb(z, apxfVar, ashbVar);
    }

    public final boolean equals(Object obj) {
        apxf apxfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzb) {
            mzb mzbVar = (mzb) obj;
            if (this.a == mzbVar.a && ((apxfVar = this.b) != null ? apxfVar.equals(mzbVar.b) : mzbVar.b == null)) {
                ashb ashbVar = this.c;
                ashb ashbVar2 = mzbVar.c;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(valueOf2).length());
        sb.append("InputValidationResult{isValid=");
        sb.append(z);
        sb.append(", errorCommand=");
        sb.append(valueOf);
        sb.append(", validationError=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        apxf apxfVar = this.b;
        int hashCode = (i ^ (apxfVar == null ? 0 : apxfVar.hashCode())) * 1000003;
        ashb ashbVar = this.c;
        return hashCode ^ (ashbVar != null ? ashbVar.hashCode() : 0);
    }
}
