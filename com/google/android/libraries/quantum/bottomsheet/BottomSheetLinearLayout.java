package com.google.android.libraries.quantum.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.uyt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BottomSheetLinearLayout extends LinearLayout {
    private int a;
    private int b;

    public BottomSheetLinearLayout(Context context) {
        super(context);
        b();
    }

    private final int a(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    private final void b() {
        int aP = uyt.aP(getContext());
        if (aP <= 600) {
            this.b = a(aP);
            this.a = Integer.MAX_VALUE;
        } else if (aP <= 960) {
            this.a = a(832);
            this.b = a(384);
        } else if (aP <= 1280) {
            this.a = a(1024);
            this.b = a(512);
        } else {
            this.a = a(1056);
            this.b = a(576);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size > this.a) {
            i = View.MeasureSpec.makeMeasureSpec(this.a, View.MeasureSpec.getMode(i));
        } else if (size < this.b) {
            i = View.MeasureSpec.makeMeasureSpec(this.b, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    public BottomSheetLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
