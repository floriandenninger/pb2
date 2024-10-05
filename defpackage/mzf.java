package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mzf {
    public final mzc a;
    public final aqzc b;

    public mzf(mzc mzcVar, aqzc aqzcVar) {
        this.a = mzcVar;
        if (aqzcVar == null) {
            throw new NullPointerException("Null renderer");
        }
        this.b = aqzcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzf) {
            mzf mzfVar = (mzf) obj;
            if (this.a.equals(mzfVar.a) && this.b.equals(mzfVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42 + String.valueOf(valueOf2).length());
        sb.append("InputFieldContainer{presenter=");
        sb.append(valueOf);
        sb.append(", renderer=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public mzf() {
    }
}
