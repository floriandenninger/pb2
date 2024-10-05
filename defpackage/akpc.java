package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akpc {
    public final String a;
    public final arjp b;

    public akpc(String str, arjp arjpVar) {
        if (str == null) {
            throw new NullPointerException("Null filterChipBarId");
        }
        this.a = str;
        if (arjpVar != null) {
            this.b = arjpVar;
            return;
        }
        throw new NullPointerException("Null browseFormData");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akpc) {
            akpc akpcVar = (akpc) obj;
            if (this.a.equals(akpcVar.a) && this.b.equals(akpcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 46 + String.valueOf(valueOf).length());
        sb.append("FilterState{filterChipBarId=");
        sb.append(str);
        sb.append(", browseFormData=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public akpc() {
    }
}
