package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zb {
    public static Method a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static void a(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    public static boolean b(View view) {
        return jw.e(view) == 1;
    }
}
