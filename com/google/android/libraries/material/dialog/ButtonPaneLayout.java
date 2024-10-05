package com.google.android.libraries.material.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.jw;
import defpackage.tjl;
import defpackage.tjm;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ButtonPaneLayout extends ViewGroup {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private int i;
    private int j;
    private final int k;
    private final int l;
    private final int m;
    private final boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private SparseIntArray s;
    private tjl t;

    public ButtonPaneLayout(Context context) {
        this(context, null);
    }

    private final Rect a(int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = i3 - i;
        int i7 = this.l;
        if (i5 > i7 && i6 > i7) {
            return null;
        }
        if (i6 < i7) {
            i -= (i7 - i6) / 2;
            i3 = i + i7;
        }
        if (i5 < i7) {
            i2 -= (i7 - i5) / 2;
            i4 = i2 + i7;
        }
        return new Rect(i, i2, i3, i4);
    }

    private final void b(View view, Rect rect) {
        View view2;
        TouchDelegate touchDelegate;
        tjl tjlVar;
        if (this.t == null) {
            this.t = new tjl(this);
        }
        this.t.a.add(new TouchDelegate(rect, view));
        if ((getParent() instanceof View) && (touchDelegate = (view2 = (View) getParent()).getTouchDelegate()) != (tjlVar = this.t)) {
            tjlVar.b = touchDelegate;
            view2.setTouchDelegate(tjlVar);
        }
    }

    private final void c() {
        tjl tjlVar = this.t;
        if (tjlVar != null) {
            tjlVar.a.clear();
        }
    }

    private final void d(View view, int i) {
        if (this.o || !(view instanceof TextView)) {
            return;
        }
        ((TextView) view).setGravity(i);
    }

    private final void e() {
        this.r = false;
        if (g()) {
            jw.Y(this, this.e, this.f, this.g, this.h);
        } else {
            jw.Y(this, this.a, this.b, this.c, this.d);
        }
    }

    private final boolean f() {
        return jw.e(this) == 1;
    }

    private final boolean g() {
        return this.q || this.p;
    }

    private static final int h(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i : i2;
        }
        return Math.min(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int measuredWidth;
        if (g()) {
            int i7 = i3 - i;
            int i8 = i4 - i2;
            boolean z2 = true;
            if (!f() && !this.n) {
                z2 = false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingBottom = i8 - getPaddingBottom();
            c();
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    if (!z2) {
                        paddingLeft = (i7 - getPaddingRight()) - childAt.getMeasuredWidth();
                    }
                    if (this.n) {
                        measuredWidth = (i7 - getPaddingLeft()) - getPaddingRight();
                    } else {
                        measuredWidth = childAt.getMeasuredWidth();
                    }
                    int measuredHeight = paddingBottom - childAt.getMeasuredHeight();
                    int i10 = measuredWidth + paddingLeft;
                    childAt.layout(paddingLeft, measuredHeight, i10, paddingBottom);
                    Rect a = a(paddingLeft, measuredHeight, i10, paddingBottom);
                    if (a != null) {
                        int i11 = a.bottom;
                        int i12 = a.top;
                        int i13 = this.j;
                        if (i11 - i12 > (paddingBottom - measuredHeight) + i13) {
                            int i14 = i13 / 2;
                            a.top = measuredHeight - i14;
                            a.bottom = paddingBottom + i14;
                        }
                        b(childAt, a);
                    }
                    paddingBottom = measuredHeight - this.j;
                }
            }
            return;
        }
        int i15 = i3 - i;
        boolean f = f();
        int paddingLeft2 = f ? getPaddingLeft() : i15 - getPaddingRight();
        int paddingTop = getPaddingTop();
        c();
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            if (childAt2.getVisibility() != 8) {
                int max = Math.max(this.m, childAt2.getMeasuredWidth());
                if (f) {
                    i6 = paddingLeft2 + max;
                    i5 = max + this.i + paddingLeft2;
                } else {
                    int i16 = paddingLeft2 - max;
                    i5 = paddingLeft2 - (max + this.i);
                    i6 = paddingLeft2;
                    paddingLeft2 = i16;
                }
                int measuredHeight2 = childAt2.getMeasuredHeight() + paddingTop;
                childAt2.layout(paddingLeft2, paddingTop, i6, measuredHeight2);
                Rect a2 = a(paddingLeft2, paddingTop, i6, measuredHeight2);
                if (a2 != null) {
                    int i17 = a2.right;
                    int i18 = a2.left;
                    int i19 = this.i;
                    if (i17 - i18 > (i6 - paddingLeft2) + i19) {
                        int i20 = i19 / 2;
                        a2.left = paddingLeft2 - i20;
                        a2.right = i6 + i20;
                    }
                    b(childAt2, a2);
                }
                paddingLeft2 = i5;
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.k, 1073741824);
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4).getVisibility() != 8) {
                i3++;
            }
        }
        this.s.clear();
        int measuredWidth = (getMeasuredWidth() - this.a) - this.c;
        int i5 = i3 > 0 ? (measuredWidth - ((i3 - 1) * this.i)) / i3 : 0;
        boolean g = g();
        this.q = i5 < this.m;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                if (i7 < childAt.getMeasuredWidth()) {
                    i7 = childAt.getMeasuredWidth();
                }
                this.s.append(i8, childAt.getMeasuredWidth());
                i6 += childAt.getMeasuredWidth() + this.i;
            }
        }
        this.q = measuredWidth < i6;
        if (g != g() || this.r) {
            e();
        }
        if (!g()) {
            int paddingLeft = (getPaddingLeft() + getPaddingRight()) - this.i;
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int i9 = this.k;
            int i10 = paddingTop + paddingBottom + i9;
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt2 = getChildAt(i11);
                if (childAt2.getVisibility() != 8) {
                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(this.s.get(i11), CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
                    d(childAt2, 17);
                    childAt2.measure(makeMeasureSpec4, makeMeasureSpec3);
                    paddingLeft += childAt2.getMeasuredWidth() + this.i;
                }
            }
            setMeasuredDimension(h(paddingLeft, getMeasuredWidth(), i), h(i10, getMeasuredHeight(), i2));
            return;
        }
        if (!this.n) {
            int paddingLeft2 = getPaddingLeft() + getPaddingRight();
            int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - paddingLeft2, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(this.k, 1073741824);
            int paddingTop2 = (getPaddingTop() + getPaddingBottom()) - this.j;
            int i12 = 0;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt3 = getChildAt(i13);
                if (childAt3.getVisibility() != 8) {
                    d(childAt3, 8388629);
                    childAt3.measure(makeMeasureSpec5, makeMeasureSpec6);
                    paddingTop2 += childAt3.getMeasuredHeight() + this.j;
                    if (childAt3.getMeasuredWidth() > i12) {
                        i12 = childAt3.getMeasuredWidth();
                    }
                }
            }
            setMeasuredDimension(h(i12 + paddingLeft2, getMeasuredWidth(), i), h(paddingTop2, getMeasuredHeight(), i2));
            return;
        }
        int makeMeasureSpec7 = View.MeasureSpec.makeMeasureSpec(h(i7, getMeasuredWidth(), i), 1073741824);
        int makeMeasureSpec8 = View.MeasureSpec.makeMeasureSpec(this.k, 1073741824);
        int paddingTop3 = (getPaddingTop() + getPaddingBottom()) - this.j;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt4 = getChildAt(i14);
            if (childAt4.getVisibility() != 8) {
                d(childAt4, 8388629);
                childAt4.measure(makeMeasureSpec7, makeMeasureSpec8);
                paddingTop3 += childAt4.getMeasuredHeight() + this.j;
            }
        }
        setMeasuredDimension(h(i7 + getPaddingLeft() + getPaddingRight(), getMeasuredWidth(), i), h(paddingTop3, getMeasuredHeight(), i2));
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        e();
    }

    public ButtonPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ButtonPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = true;
        this.s = new SparseIntArray();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, tjm.a, i, R.style.Material_ButtonPaneLayout);
        this.n = obtainStyledAttributes.getBoolean(2, true);
        this.o = obtainStyledAttributes.getBoolean(1, false);
        this.p = obtainStyledAttributes.getBoolean(3, false);
        this.m = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        if (dimensionPixelSize == Integer.MIN_VALUE) {
            this.a = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.b = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            this.c = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.d = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        } else {
            this.a = dimensionPixelSize;
            this.b = dimensionPixelSize;
            this.c = dimensionPixelSize;
            this.d = dimensionPixelSize;
        }
        this.j = obtainStyledAttributes.getDimensionPixelSize(16, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(11, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        if (dimensionPixelSize2 == Integer.MIN_VALUE) {
            this.e = obtainStyledAttributes.getDimensionPixelSize(14, 0);
            this.f = obtainStyledAttributes.getDimensionPixelSize(15, 0);
            this.g = obtainStyledAttributes.getDimensionPixelSize(13, 0);
            this.h = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        } else {
            this.e = dimensionPixelSize2;
            this.f = dimensionPixelSize2;
            this.g = dimensionPixelSize2;
            this.h = dimensionPixelSize2;
        }
        obtainStyledAttributes.recycle();
        this.l = getResources().getDimensionPixelSize(R.dimen.mtrl_button_pane_layout_touch_dimen);
    }
}
