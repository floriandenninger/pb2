package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ori {
    public final amrz a;

    public ori() {
    }

    public ori(amrz amrzVar) {
        this.a = amrzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ori) {
            return this.a.equals(((ori) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("WebViewPrefCookie{keyValues=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
