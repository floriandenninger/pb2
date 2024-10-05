package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeum {
    public final aeeu a;
    public final afjc b;
    public final afjd c;

    public aeum(aeeu aeeuVar, afjc afjcVar, afjd afjdVar) {
        this.a = aeeuVar;
        if (afjcVar == null) {
            throw new NullPointerException("Null candidateAudioItags");
        }
        this.b = afjcVar;
        if (afjdVar != null) {
            this.c = afjdVar;
            return;
        }
        throw new NullPointerException("Null candidateVideoItags");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeum) {
            aeum aeumVar = (aeum) obj;
            if (this.a.equals(aeumVar.a) && this.b.equals(aeumVar.b) && this.c.equals(aeumVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 90 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ItagAndStreamSelection{streamSelectionResult=");
        sb.append(valueOf);
        sb.append(", candidateAudioItags=");
        sb.append(valueOf2);
        sb.append(", candidateVideoItags=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public aeum() {
    }
}
