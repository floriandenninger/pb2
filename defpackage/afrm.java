package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afrm {
    public final afsg a;
    public final aqjm b;

    public afrm() {
    }

    public afrm(afsg afsgVar, aqjm aqjmVar) {
        this.a = afsgVar;
        this.b = aqjmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afrm) {
            afrm afrmVar = (afrm) obj;
            if (this.a.equals(afrmVar.a)) {
                aqjm aqjmVar = this.b;
                aqjm aqjmVar2 = afrmVar.b;
                if (aqjmVar != null ? aqjmVar.equals(aqjmVar2) : aqjmVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        aqjm aqjmVar = this.b;
        return hashCode ^ (aqjmVar == null ? 0 : aqjmVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("BatchContext{visitorContext=");
        sb.append(valueOf);
        sb.append(", tier=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
