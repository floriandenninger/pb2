package defpackage;

import android.content.res.Resources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fi {
    private static final Object a = new Object();
    private static Method b;
    private static boolean c;

    public static void a(Resources.Theme theme) {
        synchronized (a) {
            if (!c) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                    b = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                c = true;
            }
            Method method = b;
            if (method != null) {
                try {
                    method.invoke(theme, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    b = null;
                }
            }
        }
    }
}
