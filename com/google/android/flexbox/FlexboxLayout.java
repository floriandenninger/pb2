package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.jw;
import defpackage.pph;
import defpackage.ptu;
import defpackage.ptv;
import defpackage.ptw;
import defpackage.ptx;
import defpackage.pty;
import defpackage.pub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FlexboxLayout extends ViewGroup implements ptu {
    private int a;
    public int b;
    public List c;
    private int d;
    private int e;
    private int f;
    private int g;
    private Drawable h;
    private Drawable i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int[] n;
    private SparseIntArray o;
    private pty p;
    private ptw q;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator CREATOR = new pph(17);
        private int a;
        private float b;
        private float c;
        private int d;
        private float e;
        private int f;
        private int g;
        private int h;
        private int i;
        private boolean j;

        public LayoutParams(int i) {
            super(new ViewGroup.LayoutParams(i, -1));
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float a() {
            return this.e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float b() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float c() {
            return this.c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int d() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int e() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f() {
            return this.bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int g() {
            return this.leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int h() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int i() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int k() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int l() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int m() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int n() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean p() {
            return this.j;
        }

        public final void q() {
            this.c = 0.0f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d);
            parcel.writeFloat(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pub.b);
            this.a = obtainStyledAttributes.getInt(8, 1);
            this.b = obtainStyledAttributes.getFloat(2, 0.0f);
            this.c = obtainStyledAttributes.getFloat(3, 1.0f);
            this.d = obtainStyledAttributes.getInt(0, -1);
            this.e = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.g = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.h = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.i = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.j = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            this.a = parcel.readInt();
            this.b = parcel.readFloat();
            this.c = parcel.readFloat();
            this.d = parcel.readInt();
            this.e = parcel.readFloat();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            this.a = layoutParams.a;
            this.b = layoutParams.b;
            this.c = layoutParams.c;
            this.d = layoutParams.d;
            this.e = layoutParams.e;
            this.f = layoutParams.f;
            this.g = layoutParams.g;
            this.h = layoutParams.h;
            this.i = layoutParams.i;
            this.j = layoutParams.j;
        }
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    private final boolean A(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View d = d(i - i3);
            if (d != null && d.getVisibility() != 8) {
                return K() ? (this.k & 2) != 0 : (this.j & 2) != 0;
            }
        }
        return K() ? (this.k & 1) != 0 : (this.j & 1) != 0;
    }

    private final boolean B(int i) {
        if (i >= 0 && i < this.c.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((ptv) this.c.get(i2)).a() > 0) {
                    return K() ? (this.j & 2) != 0 : (this.k & 2) != 0;
                }
            }
            if (K()) {
                return (this.j & 1) != 0;
            }
            if ((this.k & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean C(int i) {
        if (i >= 0 && i < this.c.size()) {
            for (int i2 = i + 1; i2 < this.c.size(); i2++) {
                if (((ptv) this.c.get(i2)).a() > 0) {
                    return false;
                }
            }
            if (K()) {
                return (this.j & 4) != 0;
            }
            if ((this.k & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private final void h(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            ptv ptvVar = (ptv) this.c.get(i3);
            for (int i4 = 0; i4 < ptvVar.h; i4++) {
                int i5 = ptvVar.o + i4;
                View d = d(i5);
                if (d != null && d.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) d.getLayoutParams();
                    if (A(i5, i4)) {
                        if (z) {
                            left = d.getRight() + layoutParams.rightMargin;
                        } else {
                            left = (d.getLeft() - layoutParams.leftMargin) - this.m;
                        }
                        s(canvas, left, ptvVar.b, ptvVar.g);
                    }
                    if (i4 == ptvVar.h - 1 && (this.k & 4) > 0) {
                        if (z) {
                            right = (d.getLeft() - layoutParams.leftMargin) - this.m;
                        } else {
                            right = d.getRight() + layoutParams.rightMargin;
                        }
                        s(canvas, right, ptvVar.b, ptvVar.g);
                    }
                }
            }
            if (B(i3)) {
                if (z2) {
                    i2 = ptvVar.d;
                } else {
                    i2 = ptvVar.b - this.l;
                }
                o(canvas, paddingLeft, i2, max);
            }
            if (C(i3) && (this.j & 4) > 0) {
                if (z2) {
                    i = ptvVar.b - this.l;
                } else {
                    i = ptvVar.d;
                }
                o(canvas, paddingLeft, i, max);
            }
        }
    }

    private final void n(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            ptv ptvVar = (ptv) this.c.get(i3);
            for (int i4 = 0; i4 < ptvVar.h; i4++) {
                int i5 = ptvVar.o + i4;
                View d = d(i5);
                if (d != null && d.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) d.getLayoutParams();
                    if (A(i5, i4)) {
                        if (z2) {
                            top = d.getBottom() + layoutParams.bottomMargin;
                        } else {
                            top = (d.getTop() - layoutParams.topMargin) - this.l;
                        }
                        o(canvas, ptvVar.a, top, ptvVar.g);
                    }
                    if (i4 == ptvVar.h - 1 && (this.j & 4) > 0) {
                        if (z2) {
                            bottom = (d.getTop() - layoutParams.topMargin) - this.l;
                        } else {
                            bottom = d.getBottom() + layoutParams.bottomMargin;
                        }
                        o(canvas, ptvVar.a, bottom, ptvVar.g);
                    }
                }
            }
            if (B(i3)) {
                if (z) {
                    i2 = ptvVar.c;
                } else {
                    i2 = ptvVar.a - this.m;
                }
                s(canvas, i2, paddingTop, max);
            }
            if (C(i3) && (this.k & 4) > 0) {
                if (z) {
                    i = ptvVar.a - this.m;
                } else {
                    i = ptvVar.c;
                }
                s(canvas, i, paddingTop, max);
            }
        }
    }

    private final void o(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.l + i2);
        this.h.draw(canvas);
    }

    private final void s(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.i;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.m + i, i3 + i2);
        this.i.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.v(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void x(boolean r29, boolean r30, int r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.x(boolean, boolean, int, int, int, int):void");
    }

    private final void y(int i, int i2, int i3, int i4) {
        int r;
        int p;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            r = r() + getPaddingTop() + getPaddingBottom();
            p = p();
        } else if (i == 2 || i == 3) {
            r = p();
            p = r() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + i);
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < p) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = p;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(p, i2, i4);
        } else if (mode == 1073741824) {
            if (size < p) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < r) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = r;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(r, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < r) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // defpackage.ptu
    public final void G(View view, int i, int i2, ptv ptvVar) {
        int i3;
        int i4;
        if (A(i, i2)) {
            if (K()) {
                i3 = ptvVar.e;
                i4 = this.m;
            } else {
                i3 = ptvVar.e;
                i4 = this.l;
            }
            ptvVar.e = i3 + i4;
            ptvVar.f += i4;
        }
    }

    @Override // defpackage.ptu
    public final void H(ptv ptvVar) {
        int i;
        int i2;
        if (K()) {
            if ((this.k & 4) <= 0) {
                return;
            }
            i = ptvVar.e;
            i2 = this.m;
        } else {
            if ((this.j & 4) <= 0) {
                return;
            }
            i = ptvVar.e;
            i2 = this.l;
        }
        ptvVar.e = i + i2;
        ptvVar.f += i2;
    }

    @Override // defpackage.ptu
    public final void I(List list) {
        this.c = list;
    }

    @Override // defpackage.ptu
    public final void J(int i, View view) {
    }

    @Override // defpackage.ptu
    public final boolean K() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    @Override // defpackage.ptu
    public final int a() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.o == null) {
            this.o = new SparseIntArray(getChildCount());
        }
        pty ptyVar = this.p;
        SparseIntArray sparseIntArray = this.o;
        int l = ptyVar.a.l();
        List a = ptyVar.a(l);
        ptx ptxVar = new ptx();
        if (view != null && (layoutParams instanceof FlexItem)) {
            ptxVar.b = ((FlexItem) layoutParams).n();
        } else {
            ptxVar.b = 1;
        }
        if (i == -1 || i == l) {
            ptxVar.a = l;
        } else if (i < ptyVar.a.l()) {
            ptxVar.a = i;
            for (int i2 = i; i2 < l; i2++) {
                ((ptx) a.get(i2)).a++;
            }
        } else {
            ptxVar.a = l;
        }
        a.add(ptxVar);
        this.n = pty.r(l + 1, a, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // defpackage.ptu
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ptu
    public final int c(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final View d(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.n;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public final void e(Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        this.l = drawable.getIntrinsicHeight();
        z();
        requestLayout();
    }

    public final void f(Drawable drawable) {
        if (drawable == this.i) {
            return;
        }
        this.i = drawable;
        this.m = drawable.getIntrinsicWidth();
        z();
        requestLayout();
    }

    @Override // defpackage.ptu
    public final int g(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.ptu
    public final int i(View view) {
        return 0;
    }

    @Override // defpackage.ptu
    public final int j(View view, int i, int i2) {
        int i3;
        int i4;
        if (K()) {
            i3 = A(i, i2) ? this.m : 0;
            if ((this.k & 4) > 0) {
                i4 = this.m;
                return i3 + i4;
            }
            return i3;
        }
        i3 = A(i, i2) ? this.l : 0;
        if ((this.j & 4) > 0) {
            i4 = this.l;
            return i3 + i4;
        }
        return i3;
    }

    @Override // defpackage.ptu
    public final int k() {
        return this.a;
    }

    @Override // defpackage.ptu
    public final int l() {
        return getChildCount();
    }

    @Override // defpackage.ptu
    public final int m() {
        return this.b;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.i == null && this.h == null) {
            return;
        }
        if (this.j == 0 && this.k == 0) {
            return;
        }
        int e = jw.e(this);
        int i = this.a;
        if (i == 0) {
            h(canvas, e == 1, this.b == 2);
            return;
        }
        if (i == 1) {
            h(canvas, e != 1, this.b == 2);
            return;
        }
        if (i == 2) {
            boolean z = e != 1;
            boolean z2 = e == 1;
            if (this.b != 2) {
                z = z2;
            }
            n(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z3 = e != 1;
        boolean z4 = e == 1;
        if (this.b != 2) {
            z3 = z4;
        }
        n(canvas, z3, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int e = jw.e(this);
        int i5 = this.a;
        if (i5 == 0) {
            v(e == 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            v(e != 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            boolean z3 = e != 1;
            z2 = e == 1;
            if (this.b != 2) {
                z3 = z2;
            }
            x(z3, false, i, i2, i3, i4);
            return;
        }
        if (i5 == 3) {
            boolean z4 = e != 1;
            z2 = e == 1;
            if (this.b != 2) {
                z4 = z2;
            }
            x(z4, true, i, i2, i3, i4);
            return;
        }
        throw new IllegalStateException("Invalid flex direction is set: " + this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onMeasure(int, int):void");
    }

    @Override // defpackage.ptu
    public final int p() {
        Iterator it = this.c.iterator();
        int i = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        while (it.hasNext()) {
            i = Math.max(i, ((ptv) it.next()).e);
        }
        return i;
    }

    @Override // defpackage.ptu
    public final int q() {
        return this.g;
    }

    @Override // defpackage.ptu
    public final int r() {
        int size = this.c.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ptv ptvVar = (ptv) this.c.get(i2);
            if (B(i2)) {
                i += K() ? this.l : this.m;
            }
            if (C(i2)) {
                i += K() ? this.l : this.m;
            }
            i += ptvVar.g;
        }
        return i;
    }

    @Override // defpackage.ptu
    public final View t(int i) {
        return getChildAt(i);
    }

    @Override // defpackage.ptu
    public final View u(int i) {
        return d(i);
    }

    @Override // defpackage.ptu
    public final List w() {
        return this.c;
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void z() {
        if (this.h == null && this.i == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = -1;
        this.p = new pty(this);
        this.c = new ArrayList();
        this.q = new ptw();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pub.a, i, 0);
        this.a = obtainStyledAttributes.getInt(5, 0);
        this.b = obtainStyledAttributes.getInt(6, 0);
        this.d = obtainStyledAttributes.getInt(7, 0);
        this.e = obtainStyledAttributes.getInt(1, 4);
        this.f = obtainStyledAttributes.getInt(0, 5);
        this.g = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            e(drawable);
            f(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            e(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            f(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.k = i2;
            this.j = i2;
        }
        int i3 = obtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.k = i3;
        }
        int i4 = obtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.j = i4;
        }
        obtainStyledAttributes.recycle();
    }
}
