package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsh {
    public final adgb a;
    public final adsa b;

    public adsh(adgb adgbVar, adsa adsaVar) {
        if (adgbVar == null) {
            throw new NullPointerException("Null mdxScreen");
        }
        this.a = adgbVar;
        this.b = adsaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adsh) {
            adsh adshVar = (adsh) obj;
            if (this.a.equals(adshVar.a) && this.b.equals(adshVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
        sb.append("AuthCodeRequest{mdxScreen=");
        sb.append(valueOf);
        sb.append(", callback=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public adsh() {
    }
}
