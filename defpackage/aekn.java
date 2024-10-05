package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aekn {
    private final String a;
    private final int b;
    private final String c;

    public aekn(String str, int i, String str2) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.a = str;
        this.b = i;
        if (str2 != null) {
            this.c = str2;
            return;
        }
        throw new NullPointerException("Null xtags");
    }

    public static aekn a(String str, int i, String str2) {
        return new aekn(str, i, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aekn) {
            aekn aeknVar = (aekn) obj;
            if (this.a.equals(aeknVar.a) && this.b == aeknVar.b && this.c.equals(aeknVar.c)) {
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
        StringBuilder sb = new StringBuilder(str.length() + 45 + str2.length());
        sb.append("FormatKey{videoId=");
        sb.append(str);
        sb.append(", itag=");
        sb.append(i);
        sb.append(", xtags=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public aekn() {
    }
}
