package com.google.android.apps.youtube.app.common.ui.navigationbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.youtube.R;
import defpackage.gjm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NavigationBarDividerLayout extends ViewGroup {
    public final Paint a;
    public int b;
    public int c;
    private int d;

    public NavigationBarDividerLayout(Context context) {
        super(context);
        this.a = new Paint();
        a(context, null, R.attr.navigationBarStyle, R.style.NavigationBarDivider);
    }

    private final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gjm.a, i, i2);
        this.c = obtainStyledAttributes.getColor(0, 0);
        this.b = Math.max(0, obtainStyledAttributes.getDimensionPixelSize(1, 0));
        obtainStyledAttributes.recycle();
        this.a.setColor(this.c);
    }

    private static final int b(int i, int i2, int i3) {
        if (i != 0) {
            return 1;
        }
        if (i2 != 0) {
            return 2;
        }
        return i3 != 0 ? 3 : 0;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i = this.b;
        if (i == 0) {
            return;
        }
        int i2 = this.d;
        if (i2 == 1) {
            canvas.drawRect(0.0f, 0.0f, i, getHeight(), this.a);
        } else if (i2 == 2) {
            canvas.drawRect(getWidth() - this.b, 0.0f, getWidth(), getHeight(), this.a);
        } else {
            if (i2 != 3) {
                return;
            }
            canvas.drawRect(0.0f, getHeight() - this.b, getWidth(), getHeight(), this.a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i6 = this.d;
        if (i6 != 1) {
            if (i6 == 2) {
                measuredWidth -= this.b;
            } else if (i6 == 3) {
                measuredHeight -= this.b;
            }
            i5 = 0;
        } else {
            i5 = this.b;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).layout(i5, 0, measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsets rootWindowInsets = getRootWindowInsets();
            if (rootWindowInsets.isVisible(WindowInsets.Type.navigationBars())) {
                Insets insets = rootWindowInsets.getInsets(WindowInsets.Type.navigationBars());
                this.d = b(insets.left, insets.right, insets.bottom);
            } else {
                this.d = 0;
            }
        } else if (Build.VERSION.SDK_INT < 23 || (getWindowSystemUiVisibility() & 2) != 0) {
            this.d = 0;
        } else {
            WindowInsets rootWindowInsets2 = getRootWindowInsets();
            this.d = b(rootWindowInsets2.getStableInsetLeft(), rootWindowInsets2.getStableInsetRight(), rootWindowInsets2.getStableInsetBottom());
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = this.d;
        if (i5 == 1 || i5 == 2) {
            i3 = size - this.b;
        } else {
            if (i5 == 3) {
                i4 = size2 - this.b;
                i3 = size;
                setMeasuredDimension(size, size2);
                measureChildren(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            }
            i3 = size;
        }
        i4 = size2;
        setMeasuredDimension(size, size2);
        measureChildren(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }

    public NavigationBarDividerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint();
        a(context, attributeSet, R.attr.navigationBarStyle, R.style.NavigationBarDivider);
    }

    public NavigationBarDividerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint();
        a(context, attributeSet, i, R.style.NavigationBarDivider);
    }

    public NavigationBarDividerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new Paint();
        a(context, attributeSet, i, i2);
    }
}
