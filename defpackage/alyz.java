package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alyz {
    public final String a;
    public final alyx b;

    public alyz() {
    }

    public alyz(String str, alyx alyxVar) {
        this.a = str;
        this.b = alyxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alyz) {
            alyz alyzVar = (alyz) obj;
            if (this.a.equals(alyzVar.a) && this.b.equals(alyzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(valueOf).length());
        sb.append("AccountProviderConfig{type=");
        sb.append(str);
        sb.append(", provider=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
