package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ewb {
    public final aotl a;
    public final boolean b;
    public final Optional c;

    public ewb() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ewb) {
            ewb ewbVar = (ewb) obj;
            if (this.a.equals(ewbVar.a) && this.b == ewbVar.b && this.c.equals(ewbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 98 + String.valueOf(valueOf2).length());
        sb.append("AboutThisAdWebViewListenerData{aboutThisAdEndpoint=");
        sb.append(valueOf);
        sb.append(", isAdAlreadyPaused=");
        sb.append(z);
        sb.append(", hideEnclosingEvent=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public ewb(aotl aotlVar, boolean z, Optional optional) {
        if (aotlVar == null) {
            throw new NullPointerException("Null aboutThisAdEndpoint");
        }
        this.a = aotlVar;
        this.b = z;
        if (optional != null) {
            this.c = optional;
            return;
        }
        throw new NullPointerException("Null hideEnclosingEvent");
    }
}
