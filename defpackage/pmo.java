package defpackage;

import android.os.Build;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pmo {
    private static final HashSet a;
    private static String b;

    static {
        String.valueOf(Build.VERSION.RELEASE).length();
        a = new HashSet();
        b = "goog.exo.core";
    }

    public static synchronized String a() {
        String str;
        synchronized (pmo.class) {
            str = b;
        }
        return str;
    }

    public static synchronized void b(String str) {
        synchronized (pmo.class) {
            if (a.add(str)) {
                String str2 = b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                b = sb.toString();
            }
        }
    }
}
