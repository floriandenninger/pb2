package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sbt {
    private static final Object[] a = new Object[0];

    public static void a(boolean z, String str) {
        b(z, str, a);
    }

    public static void b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(i(str, objArr));
        }
    }

    public static void c(boolean z, String str) {
        d(z, str, a);
    }

    public static void d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(i(str, objArr));
        }
    }

    public static void e(Object obj, String str, Object... objArr) {
        if (obj == null) {
            throw new NullPointerException(i(str, objArr));
        }
    }

    public static void g(Object obj, String str) {
        e(obj, str, a);
    }

    public static void h(Object obj) {
        g(obj, null);
    }

    private static String i(String str, Object... objArr) {
        return String.format(String.valueOf(str), objArr);
    }

    public static void f(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(i("negative size: %d", Integer.valueOf(i2)));
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(i("%s (%d) must not be negative", "index", Integer.valueOf(i)));
        }
        if (i >= i2) {
            throw new IndexOutOfBoundsException(i("%s (%d) must not be greater than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }
}
