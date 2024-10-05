package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ysm {
    public final yry a;
    public final afvk b;

    public ysm(yry yryVar, afvk afvkVar) {
        if (yryVar == null) {
            throw new NullPointerException("Null httpClientConfig");
        }
        this.a = yryVar;
        this.b = afvkVar;
    }

    public static ysm a(yry yryVar, afvk afvkVar) {
        return new ysm(yryVar, afvkVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ysm) {
            ysm ysmVar = (ysm) obj;
            if (this.a.equals(ysmVar.a)) {
                afvk afvkVar = this.b;
                afvk afvkVar2 = ysmVar.b;
                if (afvkVar != null ? afvkVar.equals(afvkVar2) : afvkVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        afvk afvkVar = this.b;
        return (hashCode ^ (afvkVar == null ? 0 : afvkVar.hashCode())) * (-721379959);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 87 + length2 + "null".length() + "null".length());
        sb.append("VolleyNetworkConfig{httpClientConfig=");
        sb.append(valueOf);
        sb.append(", networkLogger=");
        sb.append(valueOf2);
        sb.append(", interceptor=");
        sb.append("null");
        sb.append(", responseModifier=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }

    public ysm() {
    }
}
