package com.google.android.libraries.youtube.commerce.offers.presenter;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FractionalHeightLimitingLayout extends FrameLayout {
    private final DisplayMetrics a;
    private float b;

    public FractionalHeightLimitingLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(this.a);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (this.a.heightPixels * this.b), CellularSignalStrengthError.ERROR_NOT_SUPPORTED));
    }

    public FractionalHeightLimitingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new DisplayMetrics();
        this.b = 0.82f;
    }
}
