package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahtd {
    public final CharSequence a;
    public final arfr b;

    public ahtd() {
    }

    public ahtd(CharSequence charSequence, arfr arfrVar) {
        this.a = charSequence;
        this.b = arfrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahtd) {
            ahtd ahtdVar = (ahtd) obj;
            if (this.a.equals(ahtdVar.a) && this.b.equals(ahtdVar.b)) {
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
        sb.append("DefaultMarkerDecoration{label=");
        sb.append(valueOf);
        sb.append(", icon=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
