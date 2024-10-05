package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aflk {
    private final String a;
    private final int b;
    private final boolean c;

    public aflk(String str, int i, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null fontName");
        }
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aflk) {
            aflk aflkVar = (aflk) obj;
            if (this.a.equals(aflkVar.a) && this.b == aflkVar.b && this.c == aflkVar.c) {
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

    public aflk() {
    }
}
