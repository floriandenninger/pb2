package com.google.android.apps.youtube.app.common.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.wbs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActiveItemIndicatorView extends View {
    int a;
    public float[] b;
    float[] c;
    public int d;
    public int e;
    private Paint f;
    private Paint g;
    private int h;
    private int i;

    public ActiveItemIndicatorView(Context context) {
        super(context);
        e();
    }

    private final int d() {
        return getPaddingLeft() + this.i + (this.h / 2);
    }

    private final void e() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.carousel_item_indicator_size);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        Paint paint = new Paint();
        this.f = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f.setStrokeWidth(this.h);
        this.f.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.g = paint2;
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.g.setStyle(Paint.Style.FILL_AND_STROKE);
        this.g.setStrokeWidth(this.h);
        this.g.setAntiAlias(true);
        this.c = new float[2];
        b(1);
    }

    public final int a() {
        int i;
        int i2 = this.d;
        if (i2 > 0) {
            int i3 = this.h;
            int i4 = this.i;
            i = (i2 * (i3 + i4)) + i4;
        } else {
            i = 0;
        }
        return i + getPaddingLeft() + getPaddingRight();
    }

    public final void b(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        this.f.setColor(wbs.W(getContext(), i == 2 ? R.attr.ytStaticBrandRed : R.attr.ytStaticWhite).orElse(0));
        this.g.setColor(wbs.W(getContext(), i == 2 ? R.attr.ytIconDisabled : R.attr.ytOverlayButtonInactive).orElse(0));
        invalidate();
    }

    public final void c() {
        this.c[0] = d() + (this.e * (this.h + this.i));
        this.c[1] = getHeight() / 2;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.e >= this.d) {
            return;
        }
        canvas.drawPoints(this.b, this.g);
        canvas.drawPoints(this.c, this.f);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int d = d();
        int height = getHeight() / 2;
        int i5 = 0;
        while (true) {
            float[] fArr = this.b;
            if (i5 < fArr.length) {
                fArr[i5] = d;
                fArr[i5 + 1] = height;
                d += this.h + this.i;
                i5 += 2;
            } else {
                c();
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(a(), this.h + getPaddingTop() + getPaddingBottom());
    }

    public ActiveItemIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public ActiveItemIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    public ActiveItemIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        e();
    }
}
