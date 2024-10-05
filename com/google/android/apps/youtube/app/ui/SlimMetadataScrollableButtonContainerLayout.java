package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import defpackage.jw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SlimMetadataScrollableButtonContainerLayout extends ViewGroup {
    private int a;
    private int b;
    private List c;

    public SlimMetadataScrollableButtonContainerLayout(Context context) {
        super(context);
        a(context);
    }

    private final void a(Context context) {
        setHorizontalScrollBarEnabled(false);
        this.c = new ArrayList();
        this.a = context.getResources().getDimensionPixelSize(R.dimen.slim_metadata_button_max_width);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.slim_metadata_button_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int e = jw.e(this);
        int paddingLeft = getPaddingLeft();
        int i6 = -1;
        if (e == 1) {
            i5 = this.c.size() - 1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i7 = 0;
        while (i7 < this.c.size()) {
            View view = (View) this.c.get((i7 * i6) + i5);
            int measuredWidth = view.getMeasuredWidth();
            if (view.getMeasuredHeight() == 0) {
                measuredWidth = 0;
            }
            int i8 = measuredWidth + paddingLeft;
            view.layout(paddingLeft, i2, i8, view.getMeasuredHeight() + i2);
            i7++;
            paddingLeft = i8;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int round;
        double size = (View.MeasureSpec.getSize(i) - getPaddingEnd()) - getPaddingStart();
        double d = this.b;
        Double.isNaN(size);
        Double.isNaN(d);
        if (Math.floor(size / d) >= this.c.size()) {
            double size2 = this.c.size();
            Double.isNaN(size);
            Double.isNaN(size2);
            round = (int) Math.floor(Math.min(size / size2, this.a));
        } else {
            double paddingEnd = getPaddingEnd();
            Double.isNaN(size);
            Double.isNaN(paddingEnd);
            double d2 = size + paddingEnd;
            Double.isNaN(this.b);
            round = (int) Math.round(d2 / (Math.floor((d2 / r2) - 0.5d) + 0.5d));
        }
        int size3 = this.c.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size3; i5++) {
            View view = (View) this.c.get(i5);
            view.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), i2);
            i4 = Math.max(i4, view.getMeasuredHeight());
            i3 += view.getMeasuredHeight() != 0 ? view.getMeasuredWidth() : 0;
        }
        setMeasuredDimension(i3 + getPaddingLeft() + getPaddingRight(), i4 + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        this.c.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        this.c.remove(view);
    }

    public SlimMetadataScrollableButtonContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public SlimMetadataScrollableButtonContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
