package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vcq {
    private static final Method a;
    private static final Method b;
    private static final Method c;

    static {
        Method method;
        Method method2;
        Method method3;
        Class<?> cls;
        try {
            try {
                cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            method = null;
            method3 = null;
        } catch (Throwable th2) {
            th = th2;
            method = null;
            method2 = null;
        }
        try {
            cls.getMethod("getInt", String.class, Integer.TYPE);
            method3 = cls.getMethod("getLong", String.class, Long.TYPE);
            try {
                Method method4 = cls.getMethod("getBoolean", String.class, Boolean.TYPE);
                a = method;
                b = method3;
                c = method4;
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                a = method;
                b = method3;
                c = null;
            }
        } catch (Exception e3) {
            e = e3;
            method3 = null;
        } catch (Throwable th3) {
            th = th3;
            method2 = null;
            a = method;
            b = method2;
            c = null;
            throw th;
        }
    }

    public static String a(String str, String str2) {
        try {
            return (String) a.invoke(null, str, str2);
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
            return str2;
        }
    }

    public static boolean b() {
        try {
            if (b != null) {
                return ((Boolean) c.invoke(null, "lens_standalone_entrypoints", false)).booleanValue();
            }
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
        }
        return false;
    }
}
