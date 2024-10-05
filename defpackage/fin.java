package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fin {
    public final String a;
    public final int b;
    public final String c;

    public fin(String str, int i, String str2) {
        if (str == null) {
            throw new NullPointerException("Null entityKey");
        }
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fin) {
            fin finVar = (fin) obj;
            if (this.a.equals(finVar.a) && this.b == finVar.b && this.c.equals(finVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 59 + str2.length());
        sb.append("EntityData{entityKey=");
        sb.append(str);
        sb.append(", fieldNumber=");
        sb.append(i);
        sb.append(", contentId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public fin() {
    }
}
