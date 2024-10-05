package com.google.android.apps.youtube.app.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.fyf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ResponsiveShelfLinearLayout extends LinearLayout {
    private final int a;
    private final int b;
    private final int c;

    public ResponsiveShelfLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fyf.b);
        this.a = obtainStyledAttributes.getInteger(0, 1);
        this.b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            size += marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
        }
        int i3 = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(((size - ((i3 + 1) * this.b)) - this.c) / i3, 1073741824), i2);
    }
}
