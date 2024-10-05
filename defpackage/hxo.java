package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hxo {
    public final Optional a;
    public final Optional b;

    public hxo() {
    }

    public hxo(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hxo) {
            hxo hxoVar = (hxo) obj;
            if (this.a.equals(hxoVar.a) && this.b.equals(hxoVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length());
        sb.append("ServiceResult{result=");
        sb.append(valueOf);
        sb.append(", error=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
