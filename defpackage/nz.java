package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nz {
    private static final ThreadLocal a = new ThreadLocal();
    private static final WeakHashMap b = new WeakHashMap(0);
    private static final Object c = new Object();

    public static ColorStateList a(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ny nyVar;
        if (Build.VERSION.SDK_INT < 23) {
            synchronized (c) {
                SparseArray sparseArray = (SparseArray) b.get(context);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (nyVar = (ny) sparseArray.get(i)) != null) {
                    if (nyVar.b.equals(context.getResources().getConfiguration())) {
                        colorStateList2 = nyVar.a;
                    } else {
                        sparseArray.remove(i);
                    }
                }
                colorStateList2 = null;
            }
            if (colorStateList2 != null) {
                return colorStateList2;
            }
            Resources resources = context.getResources();
            ThreadLocal threadLocal = a;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            resources.getValue(i, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                Resources resources2 = context.getResources();
                try {
                    colorStateList = ey.a(resources2, resources2.getXml(i), context.getTheme());
                } catch (Exception e) {
                    Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateList != null) {
                synchronized (c) {
                    WeakHashMap weakHashMap = b;
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(context);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(context, sparseArray2);
                    }
                    sparseArray2.append(i, new ny(colorStateList, context.getResources().getConfiguration()));
                }
                return colorStateList;
            }
            return aih.f(context, i);
        }
        return context.getColorStateList(i);
    }

    public static Drawable b(Context context, int i) {
        return xc.e().c(context, i);
    }
}
