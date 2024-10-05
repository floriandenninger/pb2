package com.google.android.libraries.youtube.share.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.akhh;
import defpackage.jw;
import defpackage.yjk;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConversationIconView extends ViewGroup {
    private final SparseArray a;
    private final SparseArray b;
    private final HashSet c;
    private final Paint d;
    private final Paint e;
    private final int f;
    private int g;
    private int h;
    private int i;
    private Canvas j;

    public ConversationIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new SparseArray();
        this.c = new HashSet();
        this.d = new Paint(1);
        Paint paint = new Paint();
        this.e = paint;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, akhh.b);
        obtainStyledAttributes.getColor(1, -1);
        obtainStyledAttributes.getColor(0, -1728053248);
        obtainStyledAttributes.getDimensionPixelSize(2, yjk.K(displayMetrics, 12));
        this.f = obtainStyledAttributes.getDimensionPixelSize(4, yjk.K(displayMetrics, 1));
        int color = obtainStyledAttributes.getColor(3, -1);
        obtainStyledAttributes.recycle();
        paint.setColor(color);
        setWillNotDraw(false);
    }

    private final int a(int i, int i2, boolean z) {
        return Math.round(((i + i2) * 0.5f) + (this.f * 0.5f * (true == z ? -1 : 1)));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        this.j.drawColor(0, PorterDuff.Mode.CLEAR);
        super.dispatchDraw(this.j);
        canvas.drawCircle(this.g, this.h, this.i, this.d);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (this.b.get(intValue) != null) {
                canvas.drawPath((Path) this.b.get(intValue), this.e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        for (int i5 = 0; i5 < this.a.size(); i5++) {
            View view = (View) this.a.valueAt(i5);
            int keyAt = this.a.keyAt(i5);
            int e = jw.e(this);
            if (keyAt == 0) {
                view.layout(paddingLeft, paddingTop, paddingRight, paddingBottom);
            } else if (keyAt == 1) {
                view.layout(e == 1 ? a(paddingLeft, paddingRight, false) : paddingLeft, paddingTop, e == 1 ? paddingRight : a(paddingLeft, paddingRight, true), paddingBottom);
            } else if (keyAt == 2) {
                view.layout(e == 1 ? paddingLeft : a(paddingLeft, paddingRight, false), paddingTop, e == 1 ? a(paddingLeft, paddingRight, true) : paddingRight, paddingBottom);
            } else if (keyAt == 3) {
                view.layout(e == 1 ? a(paddingLeft, paddingRight, false) : paddingLeft, paddingTop, e == 1 ? paddingRight : a(paddingLeft, paddingRight, true), a(paddingTop, paddingBottom, true));
            } else if (keyAt == 4) {
                view.layout(e == 1 ? a(paddingLeft, paddingRight, false) : paddingLeft, a(paddingTop, paddingBottom, false), e == 1 ? paddingRight : a(paddingLeft, paddingRight, true), paddingBottom);
            }
            int keyAt2 = this.b.keyAt(i5);
            int e2 = jw.e(this);
            Path path = (Path) this.b.get(keyAt2);
            if (keyAt2 == 1 || keyAt2 == 2) {
                path.addRect(a(paddingLeft, paddingRight, true), paddingTop, a(paddingLeft, paddingRight, false), paddingBottom, Path.Direction.CW);
            } else if (keyAt2 == 3) {
                path.addRect(a(paddingLeft, paddingRight, true), paddingTop, a(paddingLeft, paddingRight, false), a(paddingTop, paddingBottom, false), Path.Direction.CW);
                path.addRect(e2 == 1 ? a(paddingLeft, paddingRight, true) : paddingLeft, a(paddingTop, paddingBottom, true), e2 == 1 ? paddingRight : a(paddingLeft, paddingRight, false), a(paddingTop, paddingBottom, false), Path.Direction.CW);
            } else if (keyAt2 == 4) {
                path.addRect(a(paddingLeft, paddingRight, true), a(paddingTop, paddingBottom, true), a(paddingLeft, paddingRight, false), paddingBottom, Path.Direction.CW);
                path.addRect(e2 == 1 ? a(paddingLeft, paddingRight, true) : paddingLeft, a(paddingTop, paddingBottom, true), e2 == 1 ? paddingRight : a(paddingLeft, paddingRight, false), a(paddingTop, paddingBottom, false), Path.Direction.CW);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            View view = (View) this.a.valueAt(i3);
            int keyAt = this.a.keyAt(i3);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = keyAt == 0 ? measuredWidth : a(0, measuredWidth, true);
            layoutParams.height = (keyAt == 0 || keyAt == 1 || keyAt == 2) ? measuredHeight : a(0, measuredHeight, true);
        }
        measureChildren(i, i2);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i / 2;
        this.g = i5;
        int i6 = i2 / 2;
        this.h = i6;
        this.i = Math.min(i5, i6);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.j = new Canvas(createBitmap);
        this.d.setShader(new BitmapShader(createBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
    }
}
