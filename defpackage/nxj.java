package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nxj {
    public final nxh a;
    public final ammv b;

    public nxj(nxh nxhVar, ammv ammvVar) {
        if (nxhVar == null) {
            throw new NullPointerException("Null sizeState");
        }
        this.a = nxhVar;
        this.b = ammvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nxj a(nxh nxhVar) {
        return b(nxhVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nxj b(nxh nxhVar, aypn aypnVar) {
        return new nxj(nxhVar, ammv.i(aypnVar));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nxj) {
            nxj nxjVar = (nxj) obj;
            if (this.a.equals(nxjVar.a) && this.b.equals(nxjVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("SizeStateRequest{sizeState=");
        sb.append(valueOf);
        sb.append(", customAnimation=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public nxj() {
    }
}
