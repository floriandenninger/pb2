package defpackage;

import android.graphics.Matrix;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class lo {
    private static Method a;
    private static boolean b;
    private static Field c;
    private static boolean d;

    public static void lG(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }

    public void b(RecyclerView recyclerView, int i) {
    }

    public void c(RecyclerView recyclerView, int i, int i2) {
    }

    public void f(View view, float f) {
        throw null;
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }

    public void i(View view, Matrix matrix) {
        throw null;
    }

    public float lH(View view) {
        throw null;
    }

    public void ow(View view, int i) {
        if (!d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                c.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void pb(View view, int i, int i2, int i3, int i4) {
        if (!b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
