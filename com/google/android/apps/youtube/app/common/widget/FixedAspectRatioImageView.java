package com.google.android.apps.youtube.app.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import defpackage.gpt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FixedAspectRatioImageView extends ImageView {
    private float a;

    public FixedAspectRatioImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.a <= 0.0f) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            if (mode2 != 0) {
                float f = this.a;
                StringBuilder sb = new StringBuilder(155);
                sb.append("Aspect ratio not preserved in onMeasure: aspect ratio=");
                sb.append(f);
                sb.append(", width=");
                sb.append(size);
                sb.append(", widthMode=0, height=");
                sb.append(size2);
                sb.append(", heightMode=");
                sb.append(mode2);
                Log.w("FixedAspectRatioImageView", sb.toString());
            }
            super.onMeasure(i, i2);
        }
        int round = Math.round(size / this.a);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(round, size2);
        } else if (mode2 != 1073741824) {
            size2 = round;
        }
        setMeasuredDimension(size, size2);
    }

    public FixedAspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gpt.a);
            try {
                this.a = obtainStyledAttributes.getFraction(0, 1, 1, this.a);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
