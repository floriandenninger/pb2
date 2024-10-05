package defpackage;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zgy {
    private static final Method a;

    static {
        Method declaredMethod;
        Class[] clsArr = {String.class};
        if (Build.VERSION.SDK_INT < 23) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = Context.class.getDeclaredMethod("checkSelfPermission", clsArr);
            } catch (NoSuchMethodException e) {
                throw new IllegalStateException("This is meant to be M, but methods aren't here.", e);
            }
        }
        a = declaredMethod;
    }

    public static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            Method method = a;
            if (method != null) {
                try {
                    if (((Integer) method.invoke(context, str)).intValue() == 0) {
                    }
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    zga.d("Exception calling context.checkSelfPermissions().", e);
                }
            }
            return false;
        }
        return true;
    }
}
