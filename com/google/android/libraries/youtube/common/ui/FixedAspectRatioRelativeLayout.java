package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import defpackage.zbm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FixedAspectRatioRelativeLayout extends RelativeLayout {
    public float a;
    private boolean b;
    private int c;
    private int d;

    public FixedAspectRatioRelativeLayout(Context context) {
        super(context);
        this.a = 1.0f;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
    }

    public final void a(int i) {
        this.d = i;
        requestLayout();
    }

    public final void b(int i) {
        this.c = i;
        requestLayout();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.b) {
            super.onMeasure(i, i2);
            return;
        }
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int min = Math.min(this.c, View.MeasureSpec.getSize(i));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (min / this.a), 1073741824));
        } else if (View.MeasureSpec.getMode(i2) == 1073741824) {
            int min2 = Math.min(this.d, View.MeasureSpec.getSize(i2));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (min2 * this.a), 1073741824), View.MeasureSpec.makeMeasureSpec(min2, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public FixedAspectRatioRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zbm.d);
        this.a = obtainStyledAttributes.getFraction(0, 1, 1, 1.0f);
        this.b = obtainStyledAttributes.getBoolean(1, false);
        this.c = obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE);
        this.d = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE);
        obtainStyledAttributes.recycle();
    }
}
