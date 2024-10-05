package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tzk {
    public static boolean a = false;
    public static final nbm b = new nbm();

    public static void a(String str, String str2, Object... objArr) {
        if (b.d(3)) {
            nbm.c(str, str2, objArr);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (b.d(6)) {
            Log.e("Notifications", nbm.c(str, str2, objArr));
        }
    }

    public static void c(String str, Throwable th, String str2, Object... objArr) {
        if (b.d(6)) {
            Log.e("Notifications", nbm.c(str, str2, objArr), th);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (b.d(4)) {
            nbm.c(str, str2, objArr);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (b.d(2)) {
            nbm.c(str, str2, objArr);
        }
    }

    public static void f(String str, Throwable th, String str2, Object... objArr) {
        if (b.d(5)) {
            Log.w("Notifications", nbm.c(str, str2, objArr), th);
        }
    }

    public static void g(String str, String str2, Object... objArr) {
        if (b.d(2)) {
            nbm.c(str, str2, objArr);
        }
    }
}
