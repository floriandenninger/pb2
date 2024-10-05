package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HorizontalScrollViewCompat extends HorizontalScrollView {
    public HorizontalScrollViewCompat(Context context) {
        super(context);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    protected final void measureChild(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            super.measureChild(view, i, i2);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i) - (getPaddingLeft() + getPaddingRight())), 0), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), layoutParams.height));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 24) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i5 = marginLayoutParams.topMargin;
        int childMeasureSpec = getChildMeasureSpec(i3, paddingTop + paddingBottom + i5 + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i6 = marginLayoutParams.leftMargin;
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i) - ((((paddingLeft + paddingRight) + i6) + marginLayoutParams.rightMargin) + i2)), 0), childMeasureSpec);
    }

    public HorizontalScrollViewCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HorizontalScrollViewCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
