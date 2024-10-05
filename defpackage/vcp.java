package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class vcp {
    static String a(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append(str.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(a(str, objArr));
        }
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void f(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(a(str, objArr));
        }
    }

    public static void g(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(i < 0 ? a("%s (%s) must not be negative", "index", Integer.valueOf(i)) : a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void h(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(i < 0 ? a("%s (%s) must not be negative", "index", Integer.valueOf(i)) : a("%s (%s) must not be greater than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }
}
