package com.google.android.libraries.youtube.studio.elements.charts;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import defpackage.tjj;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WrapWidthBaselineTextView extends tjj {
    public WrapWidthBaselineTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        Layout layout = getLayout();
        if (layout == null) {
            super.onMeasure(i, i2);
            layout = getLayout();
        }
        if (layout != null) {
            int lineCount = layout.getLineCount();
            float f = 0.0f;
            for (int i3 = 0; i3 < lineCount; i3++) {
                f = Math.max(f, layout.getLineWidth(i3));
            }
            i = View.MeasureSpec.makeMeasureSpec(((int) Math.ceil(f)) + getCompoundPaddingLeft() + getCompoundPaddingRight(), CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        }
        super.onMeasure(i, i2);
    }

    public WrapWidthBaselineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WrapWidthBaselineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
