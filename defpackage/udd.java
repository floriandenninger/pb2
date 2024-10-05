package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udd {
    public final boolean a;
    public final udc b;

    public udd() {
    }

    public udd(boolean z, udc udcVar) {
        this.a = z;
        this.b = udcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udd) {
            udd uddVar = (udd) obj;
            if (this.a == uddVar.a) {
                udc udcVar = this.b;
                udc udcVar2 = uddVar.b;
                if (udcVar != null ? udcVar.equals(udcVar2) : udcVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        udc udcVar = this.b;
        return i ^ (udcVar == null ? 0 : udcVar.hashCode());
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("InterceptionResult{isIntercepted=");
        sb.append(z);
        sb.append(", dropReason=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
