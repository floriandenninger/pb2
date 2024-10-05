package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ren {
    public static final ren a = new ren(null, null);
    public final Boolean b;
    public final Boolean c;

    public ren(Boolean bool, Boolean bool2) {
        this.b = bool;
        this.c = bool2;
    }

    public static ren a(Bundle bundle) {
        if (bundle == null) {
            return a;
        }
        return new ren(l(bundle.getString("ad_storage")), l(bundle.getString("analytics_storage")));
    }

    public static ren b(String str) {
        Boolean bool;
        if (str != null) {
            Boolean m = str.length() >= 3 ? m(str.charAt(2)) : null;
            bool = str.length() >= 4 ? m(str.charAt(3)) : null;
            r0 = m;
        } else {
            bool = null;
        }
        return new ren(r0, bool);
    }

    static Boolean d(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static String e(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && l(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || l(string2) != null) {
            return null;
        }
        return string2;
    }

    public static boolean i(int i, int i2) {
        return i <= i2;
    }

    static final int k(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean l(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static Boolean m(char c) {
        if (c == '0') {
            return Boolean.FALSE;
        }
        if (c != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    private static final char n(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public final ren c(ren renVar) {
        return new ren(d(this.b, renVar.b), d(this.c, renVar.c));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ren)) {
            return false;
        }
        ren renVar = (ren) obj;
        return k(this.b) == k(renVar.b) && k(this.c) == k(renVar.c);
    }

    public final String f() {
        return "G1" + n(this.b) + n(this.c);
    }

    public final boolean g() {
        Boolean bool = this.b;
        return bool == null || bool.booleanValue();
    }

    public final boolean h() {
        Boolean bool = this.c;
        return bool == null || bool.booleanValue();
    }

    public final int hashCode() {
        return ((k(this.b) + 527) * 31) + k(this.c);
    }

    public final boolean j(ren renVar) {
        if (this.b != Boolean.FALSE || renVar.b == Boolean.FALSE) {
            return this.c == Boolean.FALSE && renVar.c != Boolean.FALSE;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.b;
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? "denied" : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.c;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true == bool2.booleanValue() ? "granted" : "denied");
        }
        return sb.toString();
    }
}
