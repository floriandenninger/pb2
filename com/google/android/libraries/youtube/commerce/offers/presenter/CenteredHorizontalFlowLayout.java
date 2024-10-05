package com.google.android.libraries.youtube.commerce.offers.presenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.amkq;
import defpackage.jw;
import defpackage.ybf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CenteredHorizontalFlowLayout extends ViewGroup {
    private final ybf a;

    public CenteredHorizontalFlowLayout(Context context) {
        this(context, null);
    }

    private static int a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new FrameLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ybf ybfVar = this.a;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        getWidth();
        ybfVar.c(paddingLeft, paddingTop, paddingRight, paddingBottom, getWidth(), jw.e(this), true);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                this.a.a(childAt);
            }
        }
        this.a.b();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.a.c(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), mode == 0 ? Integer.MAX_VALUE : size, jw.e(this), false);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                amkq.F(marginLayoutParams.height != -1, "A child view in HorizontalFlowLayout has a layoutParam.height: MATCH_PARENT which is not supported");
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), marginLayoutParams.width), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), marginLayoutParams.height));
                this.a.a(childAt);
            }
        }
        this.a.b();
        int a = a(size, mode, this.a.a.width());
        ybf ybfVar = this.a;
        setMeasuredDimension(a, a(size2, mode2, ybfVar.a.height() + ybfVar.b));
    }

    public CenteredHorizontalFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ybf();
    }
}
