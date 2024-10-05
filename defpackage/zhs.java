package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zhs {
    private static Method a;

    static {
        try {
            a = ClassLoader.getSystemClassLoader().loadClass("android.os.SystemProperties").getMethod("get", String.class);
        } catch (Exception unused) {
        }
    }

    public static String a(String str) {
        Method method = a;
        if (method != null) {
            try {
                return (String) method.invoke(null, str);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
