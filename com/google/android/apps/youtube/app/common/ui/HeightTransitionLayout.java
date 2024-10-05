package com.google.android.apps.youtube.app.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.amkq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HeightTransitionLayout extends FrameLayout {
    public int a;
    private int b;

    public HeightTransitionLayout(Context context) {
        super(context);
        this.b = -1;
        this.a = 0;
    }

    public final void a(int i) {
        this.b = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        amkq.O(getChildCount() == 0, "HeightTransitionLayout only supports a single child.");
        super.addView(view, i, layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (this.b == -1 || childAt == null || childAt.getHeight() >= getHeight()) {
            return;
        }
        childAt.setBottom(childAt.getTop() + getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a = getMeasuredHeight();
        if (this.b != -1) {
            setMeasuredDimension(resolveSize(getMeasuredWidth(), i), resolveSize(this.b, i2));
        }
    }

    public HeightTransitionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        this.a = 0;
    }

    public HeightTransitionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = -1;
        this.a = 0;
    }

    public HeightTransitionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = -1;
        this.a = 0;
    }
}
