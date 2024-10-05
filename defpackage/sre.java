package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sre {
    private final String a;
    private final int b;
    private final boolean c;

    public sre() {
    }

    public sre(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sre) {
            sre sreVar = (sre) obj;
            if (this.a.equals(sreVar.a) && this.b == sreVar.b && this.c == sreVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 52);
        sb.append("FontKey{fontName=");
        sb.append(str);
        sb.append(", weight=");
        sb.append(i);
        sb.append(", italic=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
