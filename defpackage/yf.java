package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yf {
    private static final ThreadLocal f = new ThreadLocal();
    static final int[] a = {-16842910};
    static final int[] b = {R.attr.state_focused};
    static final int[] c = {R.attr.state_pressed};
    static final int[] d = {R.attr.state_checked};
    static final int[] e = new int[0];
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        ColorStateList c2 = c(context, i);
        if (c2 == null || !c2.isStateful()) {
            ThreadLocal threadLocal = f;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
            float f2 = typedValue.getFloat();
            return fm.f(b(context, i), Math.round(Color.alpha(r4) * f2));
        }
        return c2.getColorForState(a, c2.getDefaultColor());
    }

    public static int b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        yk k = yk.k(context, null, iArr);
        try {
            return k.s(0);
        } finally {
            k.o();
        }
    }

    public static ColorStateList c(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        yk k = yk.k(context, null, iArr);
        try {
            return k.g(0);
        } finally {
            k.o();
        }
    }

    public static void d(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(nx.j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
