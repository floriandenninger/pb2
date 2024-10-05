package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akbb extends Drawable {
    public final Paint a;
    public final Paint b;
    private final int c;

    public akbb(int i, int i2, int i3) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setStrokeWidth(i2);
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(i);
        this.c = i3;
        setAlpha(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        this.a.setAlpha(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int min;
        float strokeWidth = this.a.getStrokeWidth();
        RectF rectF = new RectF(getBounds());
        float f = strokeWidth / 2.0f;
        rectF.inset(f, f);
        RectF rectF2 = new RectF(getBounds());
        int i = this.c;
        if (i == -1) {
            min = Math.min(getBounds().width(), getBounds().height());
        } else if (i == -2) {
            min = Math.max(getBounds().width(), getBounds().height());
        } else {
            float f2 = i;
            canvas.drawRoundRect(rectF2, f2, f2, this.b);
            float f3 = this.c;
            canvas.drawRoundRect(rectF, f3, f3, this.a);
            return;
        }
        float f4 = min / 2.0f;
        canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), f4, this.b);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), f4, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        a(i);
        b(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
