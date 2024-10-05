package com.google.android.apps.youtube.app.common.ui.playlist;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.glr;
import defpackage.gly;
import defpackage.jw;
import defpackage.psy;
import defpackage.yjk;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaylistHeaderActionBarView extends ViewGroup {
    private static final psy e = new psy(0, 0, null, null);
    int a;
    private boolean b;
    private View c;
    private int d;

    public PlaylistHeaderActionBarView(Context context) {
        super(context);
        a(context, null);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        this.d = yjk.K(getResources().getDisplayMetrics(), 8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gly.a);
        this.a = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    private final psy b(View view, int i, int i2) {
        if (view == null || view.getVisibility() == 8) {
            return e;
        }
        measureChildWithMargins(view, i, 0, i2, 0);
        glr glrVar = (glr) view.getLayoutParams();
        return new psy(view.getMeasuredWidth() + (glrVar != null ? glrVar.leftMargin + glrVar.rightMargin : 0), view.getMeasuredHeight() + (glrVar != null ? glrVar.topMargin + glrVar.bottomMargin : 0), null, null);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof glr;
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new glr();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new glr(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int measuredWidth;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingRight = (i3 - i) - getPaddingRight();
        int e2 = jw.e(this);
        View view = this.c;
        if (view != null && view.getVisibility() != 8 && this.b) {
            glr glrVar = (glr) this.c.getLayoutParams();
            int i9 = paddingBottom - glrVar.bottomMargin;
            int measuredHeight = i9 - this.c.getMeasuredHeight();
            int i10 = (measuredHeight - glrVar.topMargin) - this.d;
            if (e2 == 1) {
                measuredWidth = paddingRight - glrVar.rightMargin;
                i8 = measuredWidth - this.c.getMeasuredWidth();
            } else {
                i8 = paddingLeft + glrVar.leftMargin;
                measuredWidth = this.c.getMeasuredWidth() + i8;
            }
            this.c.layout(i8, measuredHeight, measuredWidth, i9);
            paddingBottom = i10;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && (childAt != this.c || !this.b)) {
                glr glrVar2 = (glr) childAt.getLayoutParams();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i12 = (((((paddingBottom - paddingTop) - measuredHeight2) / 2) + paddingTop) + glrVar2.topMargin) - glrVar2.bottomMargin;
                int i13 = measuredHeight2 + i12;
                if (e2 == 1) {
                    i6 = paddingRight - glrVar2.rightMargin;
                    i5 = i6 - childAt.getMeasuredWidth();
                    i7 = i5 - glrVar2.leftMargin;
                } else {
                    i5 = glrVar2.leftMargin + paddingLeft;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i5;
                    int i14 = paddingRight;
                    i6 = measuredWidth2;
                    paddingLeft = glrVar2.rightMargin + measuredWidth2;
                    i7 = i14;
                }
                childAt.layout(i5, i12, i6, i13);
                paddingRight = i7;
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int max;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int size = (View.MeasureSpec.getSize(i) - paddingLeft) - paddingRight;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        psy b = b(this.c, makeMeasureSpec, makeMeasureSpec2);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt != this.c) {
                psy b2 = b(childAt, makeMeasureSpec, makeMeasureSpec2);
                i4 += b2.a;
                i3 = Math.max(i3, b2.b);
            }
        }
        View view = this.c;
        if (view == null || view.getVisibility() == 8 || size >= b.a + i4) {
            max = Math.max(i3, b.b);
            this.b = false;
        } else {
            max = i3 + this.d + b.b;
            this.b = true;
        }
        setMeasuredDimension(Math.min(size, i4 + b.a) + paddingLeft + paddingRight, max + paddingTop + paddingBottom);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view != null && view.getId() == this.a) {
            this.c = view;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view != null && view.getId() == this.a) {
            this.c = null;
        }
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new glr(layoutParams);
    }

    public PlaylistHeaderActionBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public PlaylistHeaderActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public PlaylistHeaderActionBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }
}
