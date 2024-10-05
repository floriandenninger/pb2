package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tou {
    public final tld a;
    public final tkv b;

    public tou(tld tldVar, tkv tkvVar) {
        if (tldVar == null) {
            throw new NullPointerException("Null groupKey");
        }
        this.a = tldVar;
        this.b = tkvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tou) {
            tou touVar = (tou) obj;
            if (this.a.equals(touVar.a)) {
                tkv tkvVar = this.b;
                tkv tkvVar2 = touVar.b;
                if (tkvVar != null ? tkvVar.equals(tkvVar2) : tkvVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        tkv tkvVar = this.b;
        return hashCode ^ (tkvVar == null ? 0 : tkvVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
        sb.append("GroupKeyAndGroup{groupKey=");
        sb.append(valueOf);
        sb.append(", dataFileGroup=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public tou() {
    }
}
