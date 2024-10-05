package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nxk {
    public final nxu a;
    public final nxh b;

    public nxk(nxu nxuVar, nxh nxhVar) {
        if (nxuVar == null) {
            throw new NullPointerException("Null touchReleaseType");
        }
        this.a = nxuVar;
        if (nxhVar != null) {
            this.b = nxhVar;
            return;
        }
        throw new NullPointerException("Null resultingSizeState");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nxk) {
            nxk nxkVar = (nxk) obj;
            if (this.a.equals(nxkVar.a) && this.b.equals(nxkVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74 + String.valueOf(valueOf2).length());
        sb.append("TouchReleaseWithResultingSizeState{touchReleaseType=");
        sb.append(valueOf);
        sb.append(", resultingSizeState=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public nxk() {
    }
}
