package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afki {
    private static boolean a = true;

    public static Object a(Object obj) {
        if (a) {
            obj.getClass();
        }
        return obj;
    }

    public static void b(boolean z) {
        if (a && !z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(boolean z, Object obj) {
        if (a && !z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void d(boolean z) {
        if (a && !z) {
            throw new IllegalStateException();
        }
    }

    public static void e(boolean z, Object obj) {
        if (a && !z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void f(boolean z) {
        a = !z;
    }
}
