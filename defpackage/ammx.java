package defpackage;

import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ammx {
    public static final /* synthetic */ int a = 0;

    static {
        Logger.getLogger(ammx.class.getName());
    }

    private ammx() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a() {
        return System.nanoTime();
    }

    public static String b(String str) {
        if (e(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    public static String d(String str) {
        return str == null ? "" : str;
    }

    public static boolean e(String str) {
        return str == null || str.isEmpty();
    }
}
