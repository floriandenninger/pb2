package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import defpackage.jw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SlimMetadataButtonContainerLayout extends ViewGroup {
    public int a;
    public boolean b;
    private int c;
    private boolean d;
    private List e;
    private SparseIntArray f;

    public SlimMetadataButtonContainerLayout(Context context) {
        super(context);
        d(context);
    }

    private final int b(int i, int i2) {
        int size = (this.e.size() + 1) / i2;
        if (i2 == 1 || this.d) {
            size = Math.min(this.e.size(), this.a);
        }
        return (i < i2 - ((size * i2) - this.e.size()) || this.d) ? size : size - 1;
    }

    private final int c() {
        int size = this.e.size();
        if (this.d) {
            size = Math.min(size, this.a);
        }
        return ((size + r1) - 1) / this.a;
    }

    private final void d(Context context) {
        this.e = new ArrayList();
        this.f = new SparseIntArray();
        this.a = 5;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.slim_metadata_button_max_width);
    }

    public final void a(boolean z) {
        this.d = z;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int c = c();
        if (c == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int paddingTop = getPaddingTop();
        int i7 = 0;
        for (int i8 = 0; i8 < c; i8++) {
            int i9 = (i6 - this.f.get(i8)) / 2;
            int b = b(i8, c);
            if (this.d) {
                b = this.e.size();
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < b) {
                View view = (View) this.e.get(i7);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int i12 = measuredWidth + i9;
                if (jw.e(this) == 1) {
                    i5 = i6 - i9;
                    i9 = i6 - i12;
                } else {
                    i5 = i12;
                }
                view.layout(i9, paddingTop, i5, view.getMeasuredHeight() + paddingTop);
                i11 = Math.max(i11, measuredHeight);
                i7++;
                i10++;
                i9 = i12;
            }
            paddingTop += i11;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = this.c * this.a;
        if (View.MeasureSpec.getMode(i) != 0) {
            int size = View.MeasureSpec.getSize(i);
            if (this.b) {
                i3 = Math.min(size, i3);
            } else if (this.e.size() <= 2) {
                int i4 = this.c;
                i3 = i4 + i4;
            } else {
                i3 = size;
            }
        }
        int c = c();
        if (c == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int b = b(0, c);
        int i5 = i3 / this.a;
        if (!this.b && b > 0) {
            i5 = i3 / Math.max(1, b);
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < c; i9++) {
            int b2 = b(i9, c);
            int size2 = this.d ? this.e.size() : b2;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < size2) {
                View view = (View) this.e.get(i8);
                view.setVisibility(i10 >= b2 ? 4 : 0);
                view.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i2);
                if (i10 < b2) {
                    i12 = Math.max(i12, view.getMeasuredHeight());
                    i11 += view.getMeasuredWidth();
                }
                i8++;
                i10++;
            }
            this.f.put(i9, i11);
            i7 += i12;
            i6 = Math.max(i6, i11);
        }
        setMeasuredDimension(i6 + getPaddingLeft() + getPaddingRight(), i7 + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        this.e.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        this.e.remove(view);
    }

    public SlimMetadataButtonContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context);
    }

    public SlimMetadataButtonContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context);
    }

    public SlimMetadataButtonContainerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        d(context);
    }
}
