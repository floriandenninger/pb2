package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajcj extends ReplacementSpan {
    public final Paint a;
    public boolean b;
    private float c;

    public ajcj() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.b = false;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(charSequence, i, i2, f, i4, paint);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f2 = fontMetricsInt.bottom - fontMetricsInt.descent;
        if (!this.b) {
            this.a.setColor(paint.getColor());
        }
        float f3 = i5 - f2;
        canvas.drawLine(f, f3, f + this.c, f3, this.a);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float measureText = paint.measureText(charSequence, i, i2);
        this.c = measureText;
        return Math.round(measureText);
    }
}
