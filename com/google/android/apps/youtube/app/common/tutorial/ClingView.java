package com.google.android.apps.youtube.app.common.tutorial;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.fwf;
import defpackage.fwg;
import defpackage.fwj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ClingView extends View {
    public View a;
    public View b;
    public fwg c;
    public final ViewTreeObserver.OnGlobalLayoutListener d;
    private Paint e;
    private Paint f;
    private Paint g;
    private Bitmap h;
    private Canvas i;
    private int j;
    private int[] k;

    public ClingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new fwf(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fwj.a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        int color = resourceId != 0 ? context.getResources().getColor(resourceId) : -872405934;
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.e.setColor(color);
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f.setColor(-1);
        this.f.setAntiAlias(true);
        this.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.g = new Paint(2);
        this.k = new int[2];
    }

    private final void b() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        this.i = null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.b == null) {
            return;
        }
        Rect a = a();
        Bitmap bitmap = this.h;
        if (bitmap == null) {
            int i = a.right - a.left;
            int i2 = a.bottom - a.top;
            int max = Math.max(i, i2);
            if (i <= 0 || i2 <= 0) {
                bitmap = null;
            } else {
                bitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
                this.h = bitmap;
            }
        }
        int i3 = a.top;
        int i4 = a.bottom;
        int i5 = a.left;
        int i6 = a.right;
        if (bitmap != null) {
            if (this.i == null) {
                this.i = new Canvas(bitmap);
            }
            Canvas canvas2 = this.i;
            bitmap.eraseColor(0);
            int width = bitmap.getWidth();
            int i7 = a.right;
            int i8 = a.left;
            i3 -= (bitmap.getHeight() - (a.bottom - a.top)) / 2;
            int height = i3 + bitmap.getHeight();
            i5 -= (width - (i7 - i8)) / 2;
            int width2 = i5 + bitmap.getWidth();
            int max2 = Math.max(bitmap.getHeight(), bitmap.getWidth());
            canvas2.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.e);
            canvas2.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, max2 / 2, this.f);
            canvas.drawBitmap(bitmap, i5, i3, this.g);
            i4 = height;
            i6 = width2;
        }
        float f = i3;
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), f, this.e);
        float f2 = i5;
        canvas.drawRect(0.0f, f, f2, getMeasuredHeight(), this.e);
        float f3 = i6;
        canvas.drawRect(f3, f, getMeasuredWidth(), getMeasuredHeight(), this.e);
        canvas.drawRect(f2, i4, f3, getMeasuredHeight(), this.e);
        if (this.c != null) {
            a.left = i5;
            a.right = i6;
            a.top = i3;
            a.bottom = i4;
            this.c.c(a);
        }
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.b;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.d);
        }
        b();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        b();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        View view2 = this.a;
        if (view2 != null) {
            view2.sendAccessibilityEvent(2048);
        }
    }

    public final Rect a() {
        int[] iArr;
        View view;
        View view2 = this.b;
        if (view2 == null) {
            iArr = null;
        } else {
            view2.getLocationInWindow(r3);
            getLocationInWindow(this.k);
            int i = r3[0];
            int[] iArr2 = this.k;
            int[] iArr3 = {i - iArr2[0], iArr3[1] - iArr2[1]};
            iArr = iArr3;
        }
        if (iArr == null || (view = this.b) == null) {
            return new Rect();
        }
        int i2 = iArr[0];
        int i3 = this.j;
        return new Rect(i2 - i3, iArr[1] - i3, i2 + view.getWidth() + this.j, iArr[1] + this.b.getHeight() + this.j);
    }
}
