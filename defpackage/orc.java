package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class orc {
    private final String a;
    private final boolean b;

    public orc(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof orc) {
            orc orcVar = (orc) obj;
            if (this.a.equals(orcVar.a) && this.b == orcVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 35);
        sb.append("WebViewState{url=");
        sb.append(str);
        sb.append(", canGoBack=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public orc() {
    }
}
