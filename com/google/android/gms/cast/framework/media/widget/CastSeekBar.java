package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.qgt;
import defpackage.qjv;
import defpackage.qjw;
import defpackage.qjx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CastSeekBar extends View {
    public qjw a;
    public List b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final Paint g;
    private final int h;
    private final int i;
    private final int j;

    public CastSeekBar(Context context) {
        this(context, null);
    }

    private final void b(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        this.g.setColor(i5);
        float f = i3;
        float f2 = i4;
        float f3 = this.e;
        canvas.drawRect((i / f) * f2, -f3, (i2 / f) * f2, f3, this.g);
    }

    public final void a() {
        int i = this.a.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        a();
        int save2 = canvas.save();
        canvas.translate(0.0f, ((measuredHeight - paddingTop) - paddingBottom) / 2);
        qjw qjwVar = this.a;
        boolean z = qjwVar.f;
        int i = qjwVar.c;
        int max = Math.max(0, 0);
        if (max > 0) {
            b(canvas, 0, max, this.a.b, measuredWidth, this.i);
        }
        if (max < 0) {
            b(canvas, max, 0, this.a.b, measuredWidth, this.h);
        }
        if (this.a.b > 0) {
            b(canvas, 0, 1, 1, measuredWidth, this.i);
        }
        canvas.restoreToCount(save2);
        List list = this.b;
        if (list != null && !list.isEmpty()) {
            this.g.setColor(this.j);
            int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight2 = getMeasuredHeight();
            int paddingTop2 = getPaddingTop();
            int paddingBottom2 = getPaddingBottom();
            int save3 = canvas.save();
            canvas.translate(0.0f, ((measuredHeight2 - paddingTop2) - paddingBottom2) / 2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((qjv) it.next()) != null) {
                    int min = Math.min(0, this.a.b);
                    float f = measuredWidth2;
                    float f2 = this.a.b;
                    float f3 = (min * f) / f2;
                    float f4 = ((min + 1) * f) / f2;
                    float f5 = this.f;
                    if (f4 - f3 < f5) {
                        f4 = f3 + f5;
                    }
                    float f6 = f4 > f ? f : f4;
                    float f7 = f6 - f3 < f5 ? f6 - f5 : f3;
                    float f8 = this.e;
                    canvas.drawRect(f7, -f8, f6, f8, this.g);
                }
            }
            canvas.restoreToCount(save3);
        }
        if (isEnabled()) {
            boolean z2 = this.a.f;
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSizeAndState((int) (this.c + getPaddingLeft() + getPaddingRight()), i, 0), resolveSizeAndState((int) (this.d + getPaddingTop() + getPaddingBottom()), i2, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        boolean z = this.a.f;
        return false;
    }

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new ArrayList();
        setAccessibilityDelegate(new qjx(this));
        Paint paint = new Paint(1);
        this.g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.c = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.d = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.e = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size);
        this.f = context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_minimum_width);
        qjw qjwVar = new qjw();
        this.a = qjwVar;
        qjwVar.b = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, qgt.a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        this.h = context.getResources().getColor(resourceId);
        context.getResources().getColor(resourceId2);
        this.i = context.getResources().getColor(resourceId3);
        this.j = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }
}
