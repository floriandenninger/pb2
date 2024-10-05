package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tka {
    public final tkf a;
    private final ammv b;

    public tka() {
    }

    public tka(tkf tkfVar, ammv ammvVar) {
        this.a = tkfVar;
        this.b = ammvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tka) {
            tka tkaVar = (tka) obj;
            if (this.a.equals(tkaVar.a) && this.b.equals(tkaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("AddFileGroupRequest{dataFileGroup=");
        sb.append(valueOf);
        sb.append(", accountOptional=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
