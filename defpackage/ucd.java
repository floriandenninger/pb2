package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ucd {
    public static final ucd a = a("Content-Encoding");
    public final String b;

    static {
        a("Content-Type");
    }

    public ucd(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.b = str;
    }

    public static ucd a(String str) {
        amkq.J(amlu.a.f(str), "Only ASCII characters are permitted in header keys: %s", str);
        return new ucd(str.toLowerCase(Locale.US));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucd) {
            return this.b.equals(((ucd) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("GnpHttpHeaderKey{key=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public ucd() {
    }
}
