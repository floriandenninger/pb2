package defpackage;

import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zga {
    private static String a = "YT";

    private zga() {
    }

    public static String a(String str) {
        return p(String.format("%s.%s", "YT", str), true);
    }

    public static void b(String str) {
        q(6, str, null);
    }

    public static void c(String str, String str2) {
        r(str, 6, str2, null);
    }

    public static void d(String str, Throwable th) {
        q(6, str, th);
    }

    public static void e(String str, Object[] objArr) {
        b(String.format(Locale.US, str, objArr));
    }

    public static void f(String str, String str2, Throwable th) {
        r(str, 6, str2, th);
    }

    public static void g(String str) {
        q(4, str, null);
    }

    public static void h(String str, String str2) {
        r(str, 4, str2, null);
    }

    public static void i(String str, Throwable th) {
        q(4, str, th);
    }

    public static void j(String str, String str2, Throwable th) {
        r(str, 4, str2, th);
    }

    public static void k(String str) {
        a = p(str, false);
    }

    public static void l(String str) {
        q(5, str, null);
    }

    public static void m(String str, String str2) {
        r(str, 5, str2, null);
    }

    public static void n(String str, Throwable th) {
        q(5, str, th);
    }

    public static void o(String str, String str2, Throwable th) {
        r(str, 5, str2, th);
    }

    private static String p(String str, boolean z) {
        if (str.length() <= 23) {
            return str;
        }
        String substring = str.substring(0, 23);
        if (!z) {
            r(substring, 5, String.format("Tag [%s] is too long; truncated to [%s]", str, substring), null);
        }
        return substring;
    }

    private static void q(int i, String str, Throwable th) {
        r(a, i, str, th);
    }

    private static void r(String str, int i, String str2, Throwable th) {
        if (str2 == null) {
            str2 = "null";
        }
        if (i != 4) {
            if (i != 5) {
                Log.e(str, str2, th);
            } else {
                Log.w(str, str2, th);
            }
        }
    }
}
