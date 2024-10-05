package com.google.android.apps.youtube.app.common.ui.chipcloud;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.gds;
import defpackage.jw;
import defpackage.yjk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ChipCloudView extends ViewGroup {
    private List a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public ChipCloudView(Context context) {
        super(context);
        c(context, null);
    }

    private final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArray;
        this.a = new ArrayList();
        this.b = 3;
        this.c = Integer.MAX_VALUE;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, gds.a, 0, 0);
            try {
                this.f = typedArray.getInteger(0, 0);
                this.d = yjk.K(context.getResources().getDisplayMetrics(), (int) typedArray.getDimension(2, 8.0f));
                this.e = yjk.K(context.getResources().getDisplayMetrics(), (int) typedArray.getDimension(1, 8.0f));
                if (typedArray != null) {
                    typedArray.recycle();
                }
            } catch (Throwable th) {
                th = th;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
        }
    }

    private final void d(int i, int i2, int i3) {
        if (i >= i2) {
            return;
        }
        int i4 = i3 - ((Rect) this.a.get(i2 - 1)).right;
        while (i < i2) {
            Rect rect = (Rect) this.a.get(i);
            rect.set(rect.left + i4, rect.top, rect.right + i4, rect.bottom);
            i++;
        }
    }

    private final boolean e() {
        return this.f == 8388613;
    }

    private static final void f(View view, int i) {
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    public final void a(int i, int i2) {
        if (this.d == i || this.e == i2) {
            return;
        }
        this.d = i;
        this.e = i2;
        requestLayout();
    }

    public final void b(int i) {
        if (i != this.b) {
            this.b = i;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int childCount = getChildCount();
        int size = this.a.size();
        int i7 = i3 - i;
        for (int i8 = 0; i8 < size; i8++) {
            View childAt = getChildAt(i8);
            f(childAt, 0);
            Rect rect = (Rect) this.a.get(i8);
            if (jw.e(this) == 1) {
                i5 = i7 - rect.right;
                i6 = i7 - rect.left;
            } else {
                i5 = rect.left;
                i6 = rect.right;
            }
            childAt.layout(i5, rect.top, i6, rect.bottom);
        }
        while (size < childCount) {
            f(getChildAt(size), 8);
            size++;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == 0) {
            size = Integer.MAX_VALUE;
        }
        int min = Math.min(getChildCount(), this.c);
        int i8 = 0;
        if (this.b > 0) {
            int paddingEnd = size - getPaddingEnd();
            int paddingStart = getPaddingStart();
            int paddingTop = getPaddingTop();
            int i9 = paddingStart;
            int i10 = 0;
            boolean z = false;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i10 >= min) {
                    break;
                }
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() == 8) {
                    i6 = min;
                    i7 = paddingStart;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, i8), View.MeasureSpec.makeMeasureSpec(i8, i8));
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i15 = z ? this.e : 0;
                    int i16 = i12 > 0 ? this.d : 0;
                    if (i9 + measuredWidth + i15 > paddingEnd) {
                        if (i12 >= this.b - 1) {
                            min = i10;
                            break;
                        }
                        paddingTop += i11 + i16;
                        int i17 = paddingStart + measuredWidth + i15;
                        i4 = paddingTop + this.d;
                        i12++;
                        boolean z2 = i13 == i10 + (-1);
                        if (e()) {
                            d(i13, i10, paddingEnd);
                        }
                        i9 = i17;
                        i13 = i10;
                        z = z2;
                        i11 = 0;
                        i5 = paddingStart;
                    } else {
                        i5 = i9 + i15;
                        i4 = i16 + paddingTop;
                        i9 += i15 + measuredWidth;
                        z = true;
                    }
                    i14 = Math.max(i14, i9);
                    i11 = Math.max(i11, measuredHeight);
                    int i18 = measuredWidth + i5;
                    int i19 = measuredHeight + i4;
                    i6 = min;
                    if (this.a.size() <= i10) {
                        int size2 = this.a.size();
                        while (size2 <= i10) {
                            this.a.add(new Rect());
                            size2++;
                            paddingStart = paddingStart;
                            paddingTop = paddingTop;
                        }
                    }
                    i7 = paddingStart;
                    ((Rect) this.a.get(i10)).set(i5, i4, i18, i19);
                    paddingTop = paddingTop;
                }
                i10++;
                min = i6;
                paddingStart = i7;
                i8 = 0;
            }
            if (e()) {
                d(i13, min, paddingEnd);
            }
            size = (i12 <= 0 ? getPaddingEnd() : 0) + i14;
            i3 = (i12 > 0 ? this.d : 0) + paddingTop + i11;
        } else {
            i3 = 0;
        }
        if (min > 0) {
            i3 += getPaddingBottom();
        }
        int size3 = this.a.size();
        while (true) {
            size3--;
            if (size3 >= min) {
                this.a.remove(size3);
            } else {
                setMeasuredDimension(resolveSize(size, i), resolveSize(i3, i2));
                return;
            }
        }
    }

    public ChipCloudView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public ChipCloudView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet);
    }

    public ChipCloudView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c(context, attributeSet);
    }
}
