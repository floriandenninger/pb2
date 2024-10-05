package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class olp {
    public final asoj a;
    public final asoi b;

    public olp() {
    }

    public olp(asoj asojVar, asoi asoiVar) {
        this.a = asojVar;
        this.b = asoiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof olp) {
            olp olpVar = (olp) obj;
            if (this.a.equals(olpVar.a) && this.b.equals(olpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52 + String.valueOf(valueOf2).length());
        sb.append("LogAndErrorType{signalLogType=");
        sb.append(valueOf);
        sb.append(", signalLogErrorType=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
