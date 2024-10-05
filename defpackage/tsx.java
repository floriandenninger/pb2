package defpackage;

import android.util.Log;
import java.util.Locale;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tsx {
    public static final /* synthetic */ int a = 0;
    private static final Random b = new Random();

    public static boolean a(long j) {
        return b.nextLong() % j == 0;
    }

    public static void b(String str) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", str);
        }
    }

    public static void c(String str, Object obj) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", k(str, obj));
        }
    }

    public static void d(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", k(str, obj, obj2));
        }
    }

    public static void e(String str, Object... objArr) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", k(str, objArr));
        }
    }

    public static void f(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("MDD", 6)) {
            j(th, k(str, objArr));
        }
    }

    public static void g(String str, Object obj) {
        if (Log.isLoggable("MDD", 5)) {
            Log.w("MDD", k(str, obj));
        }
    }

    public static void h(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 5)) {
            Log.w("MDD", k(str, obj, obj2));
        }
    }

    public static void i(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("MDD", 5)) {
            String k = k(str, objArr);
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 2 + String.valueOf(valueOf).length());
            sb.append(k);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("MDD", sb.toString());
        }
    }

    public static void j(Throwable th, String str) {
        if (Log.isLoggable("MDD", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.e("MDD", sb.toString());
        }
    }

    private static String k(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }
}
