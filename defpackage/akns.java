package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akns {
    public final Object a;
    public final int b;

    public akns(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.a = obj;
        this.b = i;
    }

    public static akns a(Object obj, int i) {
        return new akns(obj, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akns) {
            akns aknsVar = (akns) obj;
            if (this.a.equals(aknsVar.a) && this.b == aknsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? "INVALID" : "STALE" : "VALID" : "UNKNOWN";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + str.length());
        sb.append("CacheEntry{value=");
        sb.append(valueOf);
        sb.append(", state=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public akns() {
    }
}
