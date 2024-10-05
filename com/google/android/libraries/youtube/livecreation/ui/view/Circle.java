package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.acfi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Circle extends View {
    public float a;
    public float b;
    private final Paint c;
    private final RectF d;
    private final int e;
    private final int f;
    private final int g;

    public Circle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, acfi.a, 0, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 100);
            this.e = dimensionPixelSize;
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, 10);
            this.f = dimensionPixelSize2;
            this.a = obtainStyledAttributes.getFloat(1, 0.0f);
            int color = obtainStyledAttributes.getColor(2, -65536);
            this.g = color;
            this.b = obtainStyledAttributes.getFloat(4, 0.0f);
            obtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.c = paint;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(dimensionPixelSize2);
            paint.setColor(color);
            float f = dimensionPixelSize2;
            float f2 = dimensionPixelSize + dimensionPixelSize2;
            this.d = new RectF(f, f, f2, f2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.d, this.a, this.b, false, this.c);
    }
}
