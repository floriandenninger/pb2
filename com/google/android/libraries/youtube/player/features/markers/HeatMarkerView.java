package com.google.android.libraries.youtube.player.features.markers;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.youtube.R;
import defpackage.ahtg;
import defpackage.ahti;
import defpackage.amvf;
import defpackage.azrw;
import defpackage.umy;
import defpackage.wbs;
import defpackage.yjk;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HeatMarkerView extends View {
    public ValueAnimator a;
    public azrw b;
    public float c;
    public boolean d;
    private final Paint e;
    private final Paint f;
    private final Path g;
    private final PointF h;
    private final PointF i;
    private int j;
    private ahtg k;

    public HeatMarkerView(Context context) {
        this(context, null);
    }

    private static final float c(float f, float f2, PointF pointF) {
        return yjk.y(f2 - (pointF.y * f), 0.0f, f2);
    }

    private static final PointF d(List list, int i) {
        if (i >= list.size() || i < 0) {
            return null;
        }
        return (PointF) list.get(i);
    }

    public final void a(ahtg ahtgVar) {
        this.k = ahtgVar;
        int i = ahtgVar.a - ahtgVar.b;
        this.j = i;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, i).setDuration(ahtgVar.c);
        this.a = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.a.addUpdateListener(new ahti(this));
        requestLayout();
    }

    public final void b() {
        this.a.cancel();
        this.a.start();
        this.d = false;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        List list = (List) this.b.get();
        if (list.isEmpty() || this.k == null) {
            return;
        }
        canvas.save();
        if (this.a.isRunning()) {
            f = ((Float) this.a.getAnimatedValue()).floatValue();
        } else {
            f = this.d ? 0.0f : this.j;
        }
        float f2 = this.j;
        float width = getWidth();
        this.g.reset();
        this.g.moveTo(0.0f, f2);
        int i = 1;
        while (i < list.size()) {
            int i2 = i - 1;
            PointF d = d(list, i2);
            d.getClass();
            PointF d2 = d(list, i - 2);
            PointF pointF = (PointF) list.get(i);
            if (d2 == null) {
                d2 = d;
            }
            if (pointF == null) {
                pointF = d;
            }
            this.h.x = Math.min(d.x + ((pointF.x - d2.x) * 0.2f), 1.0f);
            this.h.y = Math.min(d.y + ((pointF.y - d2.y) * 0.2f), 1.0f);
            PointF pointF2 = (PointF) list.get(i);
            PointF d3 = d(list, i2);
            int i3 = i + 1;
            PointF d4 = d(list, i3);
            if (d3 == null) {
                d3 = pointF2;
            }
            if (d4 == null) {
                d4 = pointF2;
            }
            this.i.x = Math.min(pointF2.x + ((-(d4.x - d3.x)) * 0.2f), 1.0f);
            this.i.y = Math.min(pointF2.y + ((-(d4.y - d3.y)) * 0.2f), 1.0f);
            this.g.cubicTo(this.h.x * width, c(f, f2, this.h), this.i.x * width, c(f, f2, this.i), ((PointF) list.get(i)).x * width, c(f, f2, (PointF) list.get(i)));
            i = i3;
        }
        this.g.lineTo(width, f2);
        this.g.close();
        canvas.drawPath(this.g, this.e);
        canvas.drawRect(0.0f, f2, width, this.k.a, this.e);
        if (this.k.e > 0) {
            float width2 = getWidth() * this.c;
            amvf d5 = amvf.d(Float.valueOf(width2 - (this.k.e / 2.0f)), Float.valueOf(width2 + (this.k.e / 2.0f)));
            canvas.drawRect(((Float) d5.g()).floatValue(), f2 - (((PointF) list.get((int) (list.size() * this.c))).y * f), ((Float) d5.h()).floatValue(), f2, this.f);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.k.a);
    }

    public HeatMarkerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = ahtg.a(context.getResources().getDisplayMetrics());
        this.b = umy.p;
        this.h = new PointF();
        this.i = new PointF();
        Paint paint = new Paint();
        this.f = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        int orElse = wbs.W(context, R.attr.ytStaticWhite).orElse(0);
        paint.setColor(orElse);
        paint.setAlpha(PrivateKeyType.INVALID);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setColor(orElse);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setAlpha(77);
        this.g = new Path();
        ahtg ahtgVar = this.k;
        int i = ahtgVar.a - ahtgVar.b;
        this.j = i;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, i).setDuration(this.k.c);
        this.a = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.a.addUpdateListener(new ahti(this));
    }
}
