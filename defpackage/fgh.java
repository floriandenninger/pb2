package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fgh {
    public final ayqj a;
    public final ayps b;

    public fgh() {
    }

    public fgh(ayqj ayqjVar, ayps aypsVar) {
        this.a = ayqjVar;
        this.b = aypsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fgh) {
            fgh fghVar = (fgh) obj;
            if (this.a.equals(fghVar.a) && this.b.equals(fghVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("MultipleResponses{networkResponse=");
        sb.append(valueOf);
        sb.append(", initialResponse=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
