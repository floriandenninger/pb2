package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajah {
    public final aryi a;
    public final apxf b;
    public final arya c;
    public final atxz d;
    private final azrw e;
    private final String f;

    public ajah() {
    }

    public ajah(azrw azrwVar, String str, aryi aryiVar, apxf apxfVar, arya aryaVar, atxz atxzVar) {
        this.e = azrwVar;
        this.f = str;
        this.a = aryiVar;
        this.b = apxfVar;
        this.c = aryaVar;
        this.d = atxzVar;
    }

    public final boolean a() {
        return ((Boolean) this.e.get()).booleanValue();
    }

    public final boolean equals(Object obj) {
        aryi aryiVar;
        apxf apxfVar;
        arya aryaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajah) {
            ajah ajahVar = (ajah) obj;
            if (this.e.equals(ajahVar.e) && this.f.equals(ajahVar.f) && ((aryiVar = this.a) != null ? aryiVar.equals(ajahVar.a) : ajahVar.a == null) && ((apxfVar = this.b) != null ? apxfVar.equals(ajahVar.b) : ajahVar.b == null) && ((aryaVar = this.c) != null ? aryaVar.equals(ajahVar.c) : ajahVar.c == null)) {
                atxz atxzVar = this.d;
                atxz atxzVar2 = ajahVar.d;
                if (atxzVar != null ? atxzVar.equals(atxzVar2) : atxzVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003;
        aryi aryiVar = this.a;
        int hashCode2 = (hashCode ^ (aryiVar == null ? 0 : aryiVar.hashCode())) * 1000003;
        apxf apxfVar = this.b;
        int hashCode3 = (hashCode2 ^ (apxfVar == null ? 0 : apxfVar.hashCode())) * 1000003;
        arya aryaVar = this.c;
        int hashCode4 = (hashCode3 ^ (aryaVar == null ? 0 : aryaVar.hashCode())) * 1000003;
        atxz atxzVar = this.d;
        return hashCode4 ^ (atxzVar != null ? atxzVar.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        String str = this.f;
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.c);
        String valueOf5 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 153 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ModularHeartbeatResponseContext{isDeadProvider=");
        sb.append(valueOf);
        sb.append(", videoId=");
        sb.append(str);
        sb.append(", playabilityStatus=");
        sb.append(valueOf2);
        sb.append(", videoTransitionEndpoint=");
        sb.append(valueOf3);
        sb.append(", heartbeatAttestationConfig=");
        sb.append(valueOf4);
        sb.append(", playerAttestation=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
