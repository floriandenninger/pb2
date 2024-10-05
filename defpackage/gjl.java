package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.apps.youtube.app.common.ui.navigationbar.NavigationBarDividerLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gjl {
    public static final boolean a;
    public NavigationBarDividerLayout b;
    private final Activity c;

    static {
        a = Build.VERSION.SDK_INT >= 27;
    }

    public gjl(Activity activity) {
        this.c = activity;
    }

    public final void a(TypedArray typedArray) {
        boolean z = a;
        if (z && typedArray != null) {
            int[] iArr = gjm.a;
            if (typedArray.hasValue(0)) {
                int color = typedArray.getColor(0, 0);
                if (z) {
                    Window window = this.c.getWindow();
                    if (window.getNavigationBarColor() != color) {
                        window.setNavigationBarColor(color);
                    }
                }
            }
            if (typedArray.hasValue(1)) {
                if (typedArray.getInt(1, 0) != 1) {
                    if (z) {
                        View decorView = this.c.getWindow().getDecorView();
                        int systemUiVisibility = decorView.getSystemUiVisibility();
                        if ((systemUiVisibility & 16) != 0) {
                            decorView.setSystemUiVisibility(systemUiVisibility & (-17));
                        }
                    }
                } else if (z) {
                    View decorView2 = this.c.getWindow().getDecorView();
                    int systemUiVisibility2 = decorView2.getSystemUiVisibility();
                    if ((systemUiVisibility2 & 16) != 16) {
                        decorView2.setSystemUiVisibility(systemUiVisibility2 | 16);
                    }
                }
            }
            if (typedArray.hasValue(2)) {
                int color2 = typedArray.getColor(2, 0);
                NavigationBarDividerLayout navigationBarDividerLayout = this.b;
                if (navigationBarDividerLayout != null && color2 != navigationBarDividerLayout.c) {
                    navigationBarDividerLayout.c = color2;
                    navigationBarDividerLayout.a.setColor(color2);
                    if (navigationBarDividerLayout.b > 0) {
                        navigationBarDividerLayout.invalidate();
                    }
                }
            }
            if (typedArray.hasValue(3)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(3, 0);
                NavigationBarDividerLayout navigationBarDividerLayout2 = this.b;
                if (navigationBarDividerLayout2 == null || dimensionPixelSize == navigationBarDividerLayout2.b) {
                    return;
                }
                navigationBarDividerLayout2.b = Math.max(0, dimensionPixelSize);
                navigationBarDividerLayout2.requestLayout();
                navigationBarDividerLayout2.invalidate();
            }
        }
    }

    public final void b(Context context, int i) {
        if (a) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, gjm.b, 0, i);
            a(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }
    }
}
