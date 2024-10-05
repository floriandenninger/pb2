package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import defpackage.altp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Illustration extends FrameLayout {
    private float a;
    private Drawable b;
    private Drawable c;
    private final Rect d;
    private final Rect e;
    private float f;
    private float g;

    public Illustration(Context context) {
        super(context);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 1.0f;
        this.g = 0.0f;
        a(null, 0);
    }

    private final void a(AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, altp.j, i, 0);
            this.g = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
        this.a = getResources().getDisplayMetrics().density * 8.0f;
        setWillNotDraw(false);
    }

    private static final boolean b(Drawable drawable, int i) {
        if (i == 1) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b != null) {
            canvas.save();
            canvas.translate(0.0f, this.e.height());
            float f = this.f;
            canvas.scale(f, f, 0.0f, 0.0f);
            if (b(this.b, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate(-this.b.getBounds().width(), 0.0f);
            }
            this.b.draw(canvas);
            canvas.restore();
        }
        if (this.c != null) {
            canvas.save();
            if (b(this.c, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate(-this.e.width(), 0.0f);
            }
            this.c.draw(canvas);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.c.getIntrinsicHeight();
            this.d.set(0, 0, i5, i6);
            if (this.g != 0.0f) {
                float f = i5 / intrinsicWidth;
                this.f = f;
                intrinsicHeight = (int) (intrinsicHeight * f);
                intrinsicWidth = i5;
            }
            Gravity.apply(55, intrinsicWidth, intrinsicHeight, this.d, this.e);
            this.c.setBounds(this.e);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, (int) Math.ceil(i5 / this.f), (int) Math.ceil((i6 - this.e.height()) / this.f));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.g != 0.0f) {
            float size = (int) (View.MeasureSpec.getSize(i) / this.g);
            setPadding(0, (int) (size - (size % this.a)), 0, 0);
        }
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable == this.b) {
            return;
        }
        this.b = drawable;
        invalidate();
        requestLayout();
    }

    @Override // android.view.View
    @Deprecated
    public final void setForeground(Drawable drawable) {
        if (drawable == this.c) {
            return;
        }
        this.c = drawable;
        invalidate();
        requestLayout();
    }

    public Illustration(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 1.0f;
        this.g = 0.0f;
        a(attributeSet, 0);
    }

    public Illustration(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 1.0f;
        this.g = 0.0f;
        a(attributeSet, i);
    }
}
