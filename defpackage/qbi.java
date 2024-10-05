package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qbi {
    protected static final amnm a;
    public static final /* synthetic */ int b = 0;

    static {
        amkq.F(true, "The length may not be less than 1");
        a = new amnm(new amnj());
    }

    static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void b(String str) {
        if (!j(3) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : a.f(str)) {
        }
    }

    public static void c(String str) {
        if (j(6)) {
            if (str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : a.f(str)) {
                if (z) {
                    Log.e("Ads", str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void d(Throwable th) {
        e("", th);
    }

    public static void e(String str, Throwable th) {
        if (j(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void f(String str) {
        if (j(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : a.f(str)) {
                if (z) {
                    Log.w("Ads", str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void g(String str, Throwable th) {
        if (j(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void h(String str) {
        i(str, null);
    }

    public static void i(String str, Throwable th) {
        if (j(5)) {
            if (th != null) {
                g(a(str), th);
            } else {
                f(a(str));
            }
        }
    }

    public static boolean j(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
