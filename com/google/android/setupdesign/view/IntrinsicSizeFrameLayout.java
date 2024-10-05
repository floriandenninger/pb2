package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.alta;
import defpackage.altc;
import defpackage.alte;
import defpackage.altp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class IntrinsicSizeFrameLayout extends FrameLayout {
    private int a;
    private int b;
    private Object c;

    public IntrinsicSizeFrameLayout(Context context) {
        super(context);
        this.a = 0;
        this.b = 0;
        b(context, null, 0);
    }

    private final int a(int i, int i2) {
        if (i2 <= 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(this.a, 1073741824);
        }
        return mode == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(Math.min(size, this.a), 1073741824) : i;
    }

    private final void b(Context context, AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, altp.l, i, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        if (alta.f()) {
            if (alte.f(context).l(altc.CONFIG_CARD_VIEW_INTRINSIC_HEIGHT)) {
                this.a = (int) alte.f(context).a(context, altc.CONFIG_CARD_VIEW_INTRINSIC_HEIGHT);
            }
            if (alte.f(context).l(altc.CONFIG_CARD_VIEW_INTRINSIC_WIDTH)) {
                this.b = (int) alte.f(context).a(context, altc.CONFIG_CARD_VIEW_INTRINSIC_WIDTH);
            }
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.c = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c == null) {
            requestApplyInsets();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(a(i, this.b), a(i2, this.a));
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (alta.f() && this.a == 0 && this.b == 0) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        super.setLayoutParams(layoutParams);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0;
        b(context, attributeSet, 0);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
        this.b = 0;
        b(context, attributeSet, i);
    }
}
