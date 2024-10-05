package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azul {
    private azul() {
    }

    public static String a(String str, Object obj) {
        return str + obj;
    }

    public static void b() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int d(int i) {
        if (i < 48) {
            return -1;
        }
        return i != 48 ? 1 : 0;
    }

    public static void e(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final String f(azuk azukVar) {
        String obj = azukVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public static boolean g(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            azsk it = new azuw(0, charSequence.length() - 1).iterator();
            while (it.a) {
                if (!l(charSequence.charAt(it.a()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int h(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static boolean i(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        charSequence.getClass();
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (charSequence.charAt(i3) != charSequence2.charAt(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String j(String str) {
        str.getClass();
        str.getClass();
        int lastIndexOf = str.lastIndexOf(46, h(str));
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        substring.getClass();
        return substring;
    }

    public static /* synthetic */ int k(CharSequence charSequence, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ((String) charSequence).indexOf(46, i);
    }

    public static final boolean l(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final int m(char c) {
        return Character.digit((int) c, 10);
    }
}
