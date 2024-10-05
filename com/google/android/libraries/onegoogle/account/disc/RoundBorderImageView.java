package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RoundBorderImageView extends AppCompatImageView {
    public final Paint a;
    public int b;
    int c;
    private int d;
    private int e;
    private RectF f;

    public RoundBorderImageView(Context context) {
        this(context, null);
    }

    public final void a() {
        this.b = -1;
        b();
    }

    public final void b() {
        int i;
        int i2;
        if (this.d == -1 || (i = this.e) == -1 || (i2 = this.b) == -1) {
            this.f = null;
        } else {
            this.f = new RectF((r0 - i2) / 2.0f, (i - i2) / 2.0f, (r0 + i2) / 2.0f, (i + i2) / 2.0f);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f;
        if (rectF == null || this.c == -1) {
            return;
        }
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.a);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.d = i;
        this.e = i2;
        b();
    }

    public RoundBorderImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundBorderImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.a = paint;
        this.b = -1;
        this.d = -1;
        this.e = -1;
        this.c = -1;
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.og_border_ring_thickness));
    }
}
