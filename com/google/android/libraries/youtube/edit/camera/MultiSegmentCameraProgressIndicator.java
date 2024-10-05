package com.google.android.libraries.youtube.edit.camera;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.amkq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MultiSegmentCameraProgressIndicator extends View {
    int a;
    public int b;
    public int c;
    public boolean d;
    public int[] e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final float l;
    private final Paint m;
    private final Paint n;
    private final Paint o;
    private final Paint p;
    private final String q;
    private final String r;

    public MultiSegmentCameraProgressIndicator(Context context) {
        this(context, null, 0);
    }

    private final float h(int i) {
        float width = getWidth();
        return Math.min(width, (i / this.a) * width);
    }

    private static int i(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode == 1073741824 ? size : mode == Integer.MIN_VALUE ? Math.min(i, size) : i;
    }

    private final boolean j() {
        int[] iArr = this.e;
        return iArr != null && iArr.length > 0;
    }

    final float a(float f, int i) {
        float f2 = i;
        float f3 = f - (f2 / 2.0f);
        if (f3 < 0.0f) {
            return 0.0f;
        }
        return f2 + f3 <= ((float) getWidth()) ? f3 : getWidth() - i;
    }

    protected final void b(Canvas canvas, float f) {
        canvas.drawRect(f, 0.0f, f + this.j, this.g, this.m);
    }

    public final void c() {
        this.c = -1;
        postInvalidate();
    }

    public final void d(int i) {
        amkq.E(i >= 0);
        this.b = i;
        postInvalidate();
    }

    public final void e(int i) {
        amkq.E(i > 0);
        this.a = i;
        postInvalidate();
    }

    public final void f(boolean z) {
        this.d = z;
        postInvalidate();
    }

    protected final void g(Canvas canvas, float f, float f2, boolean z, Paint paint) {
        boolean z2 = true;
        if (z && getWidth() - f > this.f) {
            z2 = false;
        }
        float f3 = this.f;
        Path path = new Path();
        float f4 = f3 + f3;
        float f5 = (f + 0.0f) - f4;
        float f6 = (f2 + 0.0f) - f4;
        path.moveTo(f, f3 + 0.0f);
        if (z2) {
            float f7 = -f3;
            path.rQuadTo(0.0f, f7, f7, f7);
        } else {
            float f8 = -f3;
            path.rLineTo(0.0f, f8);
            path.rLineTo(f8, 0.0f);
        }
        path.rLineTo(-f5, 0.0f);
        float f9 = -f3;
        path.rQuadTo(f9, 0.0f, f9, f3);
        path.rLineTo(0.0f, f6);
        path.rQuadTo(0.0f, f3, f3, f3);
        path.rLineTo(f5, 0.0f);
        if (z2) {
            path.rQuadTo(f3, 0.0f, f3, f9);
        } else {
            path.rLineTo(f3, 0.0f);
            path.rLineTo(0.0f, f9);
        }
        path.rLineTo(0.0f, -f6);
        path.close();
        canvas.drawPath(path, paint);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        g(canvas, getWidth(), this.g, false, this.n);
        int i = this.b;
        int i2 = 0;
        if (j()) {
            for (int i3 : this.e) {
                i += i3;
            }
        }
        if (i > 0) {
            g(canvas, h(i), this.g, true, this.o);
            if (j()) {
                int[] iArr = this.e;
                int length = iArr.length;
                int i4 = 0;
                while (i2 < length) {
                    i4 += iArr[i2];
                    b(canvas, h(i4));
                    i2++;
                }
                i2 = i4;
            }
        }
        int i5 = this.c;
        if (i5 != -1) {
            int i6 = i5 + i2;
            float h = h(i2);
            float h2 = h(i6);
            if (i6 < this.a) {
                b(canvas, h2);
            }
            if (this.d) {
                float a = a(h, this.h);
                float a2 = a(h2, this.i);
                canvas.drawText(this.r, a2, this.l, this.p);
                if (this.h + a < a2) {
                    canvas.drawText(this.q, a, this.l, this.p);
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i3 = this.k;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(i(suggestedMinimumWidth + paddingLeft + paddingRight, i), i(i3 + paddingTop + getPaddingBottom(), i2));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.a = bundle.getInt("INSTANCE_STATE_MAX_RECORDING_DURATION_KEY");
            this.b = bundle.getInt("INSTANCE_STATE_IN_PROGRESS_DURATION_KEY");
            this.e = bundle.getIntArray("INSTANCE_STATE_RECORDED_SEGMENT_DURATIONS_KEY");
            this.c = bundle.getInt("INSTANCE_STATE_IN_PROGRESS_RECORDING_LIMIT_KEY");
            this.d = bundle.getBoolean("INSTANCE_STATE_SHOW_TEXT_INDICATORS_KEY");
            super.onRestoreInstanceState(bundle.getParcelable("INSTANCE_STATE_SUPERCLASS_KEY"));
            postInvalidate();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("INSTANCE_STATE_SUPERCLASS_KEY", super.onSaveInstanceState());
        bundle.putInt("INSTANCE_STATE_MAX_RECORDING_DURATION_KEY", this.a);
        bundle.putInt("INSTANCE_STATE_IN_PROGRESS_DURATION_KEY", this.b);
        bundle.putIntArray("INSTANCE_STATE_RECORDED_SEGMENT_DURATIONS_KEY", this.e);
        bundle.putInt("INSTANCE_STATE_IN_PROGRESS_RECORDING_LIMIT_KEY", this.c);
        bundle.putBoolean("INSTANCE_STATE_SHOW_TEXT_INDICATORS_KEY", this.d);
        return bundle;
    }

    public MultiSegmentCameraProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiSegmentCameraProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 30000;
        this.c = -1;
        this.d = true;
        Resources resources = getContext().getResources();
        this.f = resources.getDimensionPixelSize(R.dimen.shorts_multi_segment_progress_bar_corner_radius);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.shorts_multi_segment_progress_bar_height);
        this.g = dimensionPixelSize;
        String string = resources.getString(R.string.shorts_multi_segment_progress_bar_start_label);
        this.q = string;
        String string2 = resources.getString(R.string.shorts_multi_segment_progress_bar_stop_label);
        this.r = string2;
        Paint paint = new Paint();
        this.n = paint;
        paint.setColor(resources.getColor(R.color.shorts_multi_segment_progress_bar_track_color));
        Paint paint2 = new Paint();
        this.o = paint2;
        paint2.setColor(resources.getColor(R.color.shorts_multi_segment_progress_bar_progress_color));
        Paint paint3 = new Paint();
        this.m = paint3;
        paint3.setColor(resources.getColor(R.color.shorts_multi_segment_progress_bar_tick_color));
        this.j = resources.getDimensionPixelSize(R.dimen.shorts_multi_segment_progress_bar_tick_width);
        Paint paint4 = new Paint();
        this.p = paint4;
        paint4.setColor(resources.getColor(R.color.shorts_multi_segment_progress_bar_start_stop_indicator_text_color));
        paint4.setAntiAlias(true);
        paint4.setTextAlign(Paint.Align.LEFT);
        paint4.setTextSize(resources.getDimensionPixelSize(R.dimen.shorts_multi_segment_progress_bar_start_stop_indicator_text_size));
        Rect rect = new Rect();
        paint4.getTextBounds(string, 0, string.length(), rect);
        this.h = rect.width();
        int height = rect.height();
        paint4.getTextBounds(string2, 0, string2.length(), rect);
        this.i = rect.width();
        int height2 = rect.height();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.shorts_multi_segment_progress_bar_bottom_margin);
        this.l = (dimensionPixelSize + dimensionPixelOffset) - paint4.ascent();
        this.k = dimensionPixelSize + dimensionPixelOffset + Math.max(height, height2) + ((int) Math.ceil(paint4.descent()));
    }
}
