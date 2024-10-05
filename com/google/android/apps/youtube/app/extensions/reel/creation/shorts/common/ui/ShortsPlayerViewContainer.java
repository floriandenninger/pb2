package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsPlayerViewContainer extends FrameLayout {
    public boolean a;
    private int b;
    private int c;

    public ShortsPlayerViewContainer(Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.b, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
            return;
        }
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f = measuredWidth;
        float f2 = measuredHeight;
        if (f / f2 < 0.5625f) {
            measuredHeight = Math.round(f / 0.5625f);
        } else {
            measuredWidth = Math.round(f2 * 0.5625f);
        }
        this.b = measuredWidth;
        this.c = measuredHeight;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public ShortsPlayerViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShortsPlayerViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
