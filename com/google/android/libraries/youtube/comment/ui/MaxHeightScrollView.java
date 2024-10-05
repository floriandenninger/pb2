package com.google.android.libraries.youtube.comment.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import defpackage.xmz;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MaxHeightScrollView extends ScrollView {
    private int a;

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, xmz.a, 0, 0);
        try {
            this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            i2 = Math.min(View.MeasureSpec.makeMeasureSpec(this.a, CellularSignalStrengthError.ERROR_NOT_SUPPORTED), i2);
        }
        super.onMeasure(i, i2);
    }
}
