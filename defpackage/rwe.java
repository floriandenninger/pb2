package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rwe extends ViewGroup {
    public final rwd D;
    private int WT;
    private int WU;
    private int WV;
    private int WW;
    private final Rect e;
    private final Rect f;
    private final Rect g;

    public rwe(Context context) {
        super(context);
        this.WT = 0;
        this.WU = 0;
        this.WV = 0;
        this.WW = 0;
        this.e = new Rect();
        this.f = new Rect();
        this.g = new Rect();
        dsm dsmVar = new dsm((int) rwq.b(context, 10.0f), (byte[]) null);
        dsm dsmVar2 = new dsm((int) rwq.b(context, 0.0f), (byte[]) null);
        rwd rwdVar = new rwd();
        rwdVar.a = dsmVar;
        rwdVar.b = dsmVar2;
        rwdVar.c = dsmVar;
        rwdVar.d = dsmVar2;
        rwdVar.e = dsmVar;
        rwdVar.f = dsmVar2;
        rwdVar.g = dsmVar;
        rwdVar.h = dsmVar2;
        this.D = rwdVar;
    }

    protected static final void D(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), getChildMeasureSpec(i3, marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
    }

    public static void E(dsm dsmVar) {
        sbt.g(dsmVar, "Margins can not be null");
    }

    private final int b(int i, int i2, int i3, int i4, int i5, byte b) {
        int i6;
        boolean z;
        int i7;
        int i8;
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        int i9 = 0;
        int i10 = 0;
        float f = 0.0f;
        while (true) {
            i6 = -1;
            z = true;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            rwk rwkVar = (rwk) childAt.getLayoutParams();
            int i11 = true != rwkVar.a() ? makeMeasureSpec : i2;
            if (rwkVar.width == -1) {
                i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
            }
            if (rwkVar.b(b)) {
                D(childAt, i11, 0, i3, i10);
                if (childAt.getVisibility() != 8) {
                    f += rwkVar.weight;
                    i10 += Math.max(0, childAt.getMeasuredHeight() + rwkVar.topMargin + rwkVar.bottomMargin);
                }
            }
            i9++;
        }
        if (i5 > 0) {
            i8 = Math.min(i5, i10);
            i7 = i4;
        } else {
            i7 = i4;
            i8 = i10;
        }
        int max = Math.max(i7, i8);
        int i12 = max - i10;
        if (i12 != 0 && f > 0.0f) {
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = getChildAt(i13);
                rwk rwkVar2 = (rwk) childAt2.getLayoutParams();
                float f2 = rwkVar2.weight;
                int i14 = z != rwkVar2.a() ? makeMeasureSpec : i2;
                if (rwkVar2.width == i6) {
                    i14 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i14), 1073741824);
                }
                int childMeasureSpec = getChildMeasureSpec(i14, rwkVar2.topMargin + rwkVar2.bottomMargin, rwkVar2.width);
                if (rwkVar2.b(b) && f2 != 0.0f && childAt2.getVisibility() != 8) {
                    childAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(0, childAt2.getMeasuredHeight() + ((int) ((f2 * i12) / f))), 1073741824));
                    i13++;
                    i6 = -1;
                    z = true;
                }
                i13++;
                i6 = -1;
                z = true;
            }
        }
        return Math.min(max, View.MeasureSpec.getSize(i3));
    }

    private final View c(int i, int i2) {
        return getChildAt(getChildDrawingOrder(i, i2));
    }

    private final void e(View view, Rect rect, Rect rect2) {
        rwk rwkVar = (rwk) view.getLayoutParams();
        int width = rwkVar.width == -1 ? rect.width() : view.getMeasuredWidth() + rwkVar.leftMargin + rwkVar.rightMargin;
        int height = rwkVar.height == -1 ? rect.height() : view.getMeasuredHeight() + rwkVar.topMargin + rwkVar.bottomMargin;
        Rect rect3 = this.f;
        if (rwkVar.gravity != -1) {
            Gravity.apply(rwkVar.gravity, width, height, rect, rect3);
        } else {
            rect3.set(rect.left, rect.top, Math.min(rect.right, rect.left + width), Math.min(rect.bottom, rect.top + height));
        }
        if (rect2 == null) {
            view.layout(rect3.left + rwkVar.leftMargin, rect3.top + rwkVar.topMargin, rect3.right - rwkVar.rightMargin, rect3.bottom - rwkVar.bottomMargin);
            return;
        }
        view.setPadding((rect3.left - rect2.left) + rwkVar.leftMargin, (rect3.top - rect2.top) + rwkVar.topMargin, (rect2.right - rect3.right) + rwkVar.rightMargin, (rect2.bottom - rect3.bottom) + rwkVar.bottomMargin);
        if (view instanceof RelativeLayout) {
            view.measure(View.MeasureSpec.makeMeasureSpec(rect2.right - rect2.left, 1073741824), View.MeasureSpec.makeMeasureSpec(rect2.bottom - rect2.top, 1073741824));
        }
        view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }

    private final void f(int i, int i2, int i3, int i4, boolean z) {
        this.WT = b(Math.max((i3 - this.WW) - this.WU, 0), i, i2, this.D.a.c(i4), this.D.b.c(i4), (byte) 8);
        int b = b(Math.max((i3 - this.WW) - this.WU, 0), i, i2, this.D.e.c(i4), this.D.f.c(i4), (byte) 16);
        this.WV = b;
        this.WU = pW(Math.max((i4 - this.WT) - b, 0), i, i2, this.D.c.c(i3), this.D.d.c(i3), (byte) 4);
        this.WW = pW(Math.max((i4 - this.WT) - this.WV, 0), i, i2, this.D.g.c(i3), this.D.h.c(i3), (byte) 1);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (((rwk) childAt.getLayoutParams()).b((byte) 2)) {
                    D(childAt, i, this.WW + this.WU, i2, this.WT + this.WV);
                }
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (((rwk) childAt2.getLayoutParams()).b((byte) -1)) {
                    D(childAt2, i, 0, i2, 0);
                }
            }
        }
    }

    private final int pW(int i, int i2, int i3, int i4, int i5, byte b) {
        int i6;
        boolean z;
        int i7;
        int i8;
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        int i9 = 0;
        int i10 = 0;
        float f = 0.0f;
        while (true) {
            i6 = -1;
            z = true;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            rwk rwkVar = (rwk) childAt.getLayoutParams();
            int i11 = true != rwkVar.a() ? makeMeasureSpec : i3;
            if (rwkVar.height == -1) {
                i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
            }
            if (rwkVar.b(b)) {
                D(childAt, i2, i10, i11, 0);
                if (childAt.getVisibility() != 8) {
                    f += rwkVar.weight;
                    i10 += Math.max(0, childAt.getMeasuredWidth() + rwkVar.leftMargin + rwkVar.rightMargin);
                }
            }
            i9++;
        }
        if (i5 > 0) {
            i8 = Math.min(i5, i10);
            i7 = i4;
        } else {
            i7 = i4;
            i8 = i10;
        }
        int max = Math.max(i7, i8);
        int i12 = max - i10;
        if (i12 != 0 && f > 0.0f) {
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = getChildAt(i13);
                rwk rwkVar2 = (rwk) childAt2.getLayoutParams();
                float f2 = rwkVar2.weight;
                int i14 = z != rwkVar2.a() ? makeMeasureSpec : i3;
                if (rwkVar2.height == i6) {
                    i14 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i14), 1073741824);
                }
                int childMeasureSpec = getChildMeasureSpec(i14, rwkVar2.leftMargin + rwkVar2.rightMargin, rwkVar2.height);
                if (rwkVar2.b(b) && f2 != 0.0f && childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, childAt2.getMeasuredWidth() + ((int) ((f2 * i12) / f))), 1073741824), childMeasureSpec);
                    i13++;
                    i6 = -1;
                    z = true;
                }
                i13++;
                i6 = -1;
                z = true;
            }
        }
        return Math.min(max, View.MeasureSpec.getSize(i2));
    }

    protected final void B(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, byte b, boolean z) {
        int i13;
        int i14;
        int max;
        Rect rect;
        int i15 = i;
        int i16 = i3;
        int childCount = getChildCount();
        int i17 = 0;
        int i18 = 0;
        while (i17 < childCount) {
            View c = c(childCount, i17);
            rwk rwkVar = (rwk) c.getLayoutParams();
            if (rwkVar.b(b)) {
                int measuredWidth = c.getMeasuredWidth();
                int i19 = rwkVar.leftMargin;
                int i20 = rwkVar.rightMargin;
                int visibility = c.getVisibility();
                if (visibility == 8) {
                    i20 = 0;
                }
                if (visibility == 8) {
                    i19 = 0;
                }
                if (visibility == 8) {
                    measuredWidth = 0;
                }
                boolean a = rwkVar.a();
                int i21 = true != a ? i4 : i8;
                int i22 = true != a ? i2 : i6;
                if (z) {
                    max = i15 + i18;
                    i14 = Math.min(i16, max + measuredWidth + i19 + i20);
                } else {
                    i14 = i16 - i18;
                    max = Math.max(i15, ((i14 - measuredWidth) - i19) - i20);
                }
                Rect rect2 = this.e;
                rect2.set(max, i22, i14, i21);
                if (rwkVar.c) {
                    rect = this.g;
                    rect.set(i5, i6, i7, i8);
                    i13 = childCount;
                } else if (rwkVar.d) {
                    rect = this.g;
                    i13 = childCount;
                    rect.set(i9, i10, i11, i12);
                } else {
                    i13 = childCount;
                    rect = null;
                }
                e(c, rect2, rect);
                i18 += measuredWidth + i19 + i20;
            } else {
                i13 = childCount;
            }
            i17++;
            i15 = i;
            i16 = i3;
            childCount = i13;
        }
    }

    protected final void C(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, byte b, boolean z) {
        int i13;
        int i14;
        int max;
        Rect rect;
        int i15 = i2;
        int i16 = i4;
        int childCount = getChildCount();
        int i17 = 0;
        int i18 = 0;
        while (i17 < childCount) {
            View c = c(childCount, i17);
            rwk rwkVar = (rwk) c.getLayoutParams();
            if (rwkVar.b(b)) {
                int measuredHeight = c.getMeasuredHeight();
                int i19 = rwkVar.topMargin;
                int i20 = rwkVar.bottomMargin;
                int visibility = c.getVisibility();
                if (visibility == 8) {
                    i20 = 0;
                }
                if (visibility == 8) {
                    i19 = 0;
                }
                if (visibility == 8) {
                    measuredHeight = 0;
                }
                boolean a = rwkVar.a();
                int i21 = true != a ? i3 : i7;
                int i22 = true != a ? i : i5;
                if (z) {
                    max = i15 + i18;
                    i14 = Math.min(i16, max + measuredHeight + i19 + i20);
                } else {
                    i14 = i16 - i18;
                    max = Math.max(i15, ((i14 - measuredHeight) - i19) - i20);
                }
                Rect rect2 = this.e;
                rect2.set(i22, max, i21, i14);
                if (rwkVar.c) {
                    rect = this.g;
                    rect.set(i5, i6, i7, i8);
                    i13 = childCount;
                } else if (rwkVar.d) {
                    rect = this.g;
                    i13 = childCount;
                    rect.set(i9, i10, i11, i12);
                } else {
                    i13 = childCount;
                    rect = null;
                }
                e(c, rect2, rect);
                i18 += measuredHeight + i19 + i20;
            } else {
                i13 = childCount;
            }
            i17++;
            i15 = i2;
            i16 = i4;
            childCount = i13;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof rwk;
    }

    protected void d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new rwk();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new rwk(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect;
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        C(paddingLeft + this.WW, paddingTop, paddingRight - this.WU, paddingTop + this.WT, paddingLeft, paddingTop, paddingRight, paddingBottom, paddingLeft, paddingTop, paddingRight, paddingBottom - this.WV, (byte) 8, false);
        C(paddingLeft + this.WW, paddingBottom - this.WV, paddingRight - this.WU, paddingBottom, paddingLeft, paddingTop, paddingRight, paddingBottom, paddingLeft, paddingTop + this.WT, paddingRight, paddingBottom, (byte) 16, true);
        int i9 = paddingBottom;
        B(paddingLeft, paddingTop + this.WT, paddingLeft + this.WW, paddingBottom - this.WV, paddingLeft, paddingTop, paddingRight, paddingBottom, paddingLeft, paddingTop, paddingRight - this.WU, paddingBottom, (byte) 1, false);
        int i10 = paddingLeft;
        int i11 = paddingTop;
        int i12 = paddingRight;
        B(paddingRight - this.WU, paddingTop + this.WT, paddingRight, paddingBottom - this.WV, paddingLeft, paddingTop, paddingRight, paddingBottom, paddingLeft + this.WW, paddingTop, paddingRight, paddingBottom, (byte) 4, true);
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            Rect rect2 = null;
            if (i13 >= childCount) {
                break;
            }
            View c = c(childCount, i13);
            rwk rwkVar = (rwk) c.getLayoutParams();
            if (rwkVar.b((byte) 2)) {
                Rect rect3 = this.e;
                i5 = i10;
                i6 = i11;
                i7 = i12;
                i8 = i9;
                rect3.set(i5 + this.WW, i6 + this.WT, i7 - this.WU, i8 - this.WV);
                if (rwkVar.c || rwkVar.d) {
                    rect2 = this.g;
                    rect2.set(i5, i6, i7, i8);
                }
                e(c, rect3, rect2);
            } else {
                i8 = i9;
                i5 = i10;
                i6 = i11;
                i7 = i12;
            }
            i13++;
            i10 = i5;
            i11 = i6;
            i12 = i7;
            i9 = i8;
        }
        int i14 = i9;
        int i15 = i10;
        int i16 = i11;
        int i17 = i12;
        for (int i18 = 0; i18 < childCount; i18++) {
            View c2 = c(childCount, i18);
            rwk rwkVar2 = (rwk) c2.getLayoutParams();
            if (rwkVar2.b((byte) -1)) {
                Rect rect4 = this.e;
                rect4.set(i15, i16, i17, i14);
                if (rwkVar2.c || rwkVar2.d) {
                    rect = this.g;
                    rect.set(i15, i16, i17, i14);
                } else {
                    rect = null;
                }
                e(c2, rect4, rect);
            }
        }
        d();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int max = Math.max(0, (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft());
        int max2 = Math.max(0, (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        f(makeMeasureSpec, makeMeasureSpec2, max, max2, false);
        f(makeMeasureSpec, makeMeasureSpec2, max, max2, true);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new rwk(layoutParams);
    }
}
