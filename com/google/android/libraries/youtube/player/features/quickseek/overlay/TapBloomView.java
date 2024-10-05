package com.google.android.libraries.youtube.player.features.quickseek.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import defpackage.aicl;
import defpackage.yjk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TapBloomView extends View {
    private int a;
    public int b;
    public int c;
    private int d;
    private int e;
    private int f;
    private float[] g;
    private float[] h;
    private float[] i;
    private int j;
    private int k;
    private Paint l;

    public TapBloomView(Context context) {
        super(context);
        a(context, null);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        int i3;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i4 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aicl.a);
            int color = obtainStyledAttributes.getColor(2, 2146365166);
            int color2 = obtainStyledAttributes.getColor(0, 16777215);
            i3 = obtainStyledAttributes.getDimensionPixelSize(3, (int) yjk.I(displayMetrics, 40.0f));
            i2 = obtainStyledAttributes.getDimensionPixelSize(1, (int) yjk.I(displayMetrics, 400.0f));
            obtainStyledAttributes.recycle();
            i = color2;
            i4 = color;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        Paint paint = new Paint();
        this.l = paint;
        paint.setStyle(Paint.Style.FILL);
        this.g = new float[3];
        this.h = new float[3];
        this.i = new float[3];
        this.a = Color.alpha(i4);
        this.d = Color.alpha(i);
        Color.colorToHSV(i4, this.g);
        Color.colorToHSV(i, this.h);
        this.e = i3;
        this.f = i2;
        b(0.0f);
    }

    public final void b(float f) {
        int i = this.a;
        int i2 = this.d;
        float[] fArr = this.i;
        float[] fArr2 = this.g;
        float f2 = fArr2[0];
        float[] fArr3 = this.h;
        fArr[0] = f2 + ((fArr3[0] - f2) * f);
        float f3 = fArr2[1];
        fArr[1] = f3 + ((fArr3[1] - f3) * f);
        float f4 = fArr2[2];
        fArr[2] = f4 + ((fArr3[2] - f4) * f);
        this.j = Color.HSVToColor(i + ((int) ((i2 - i) * f)), fArr);
        this.k = this.e + ((int) ((this.f - r0) * f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.l.setColor(this.j);
        canvas.drawCircle(this.b, this.c, this.k, this.l);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(Math.max(1, View.MeasureSpec.getSize(i)), Math.max(1, View.MeasureSpec.getSize(i2)));
    }

    public TapBloomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public TapBloomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public TapBloomView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }
}
