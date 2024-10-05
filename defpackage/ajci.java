package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajci extends ReplacementSpan {
    public final Paint a;
    public boolean b;
    private float c;

    public ajci() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.b = false;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(charSequence, i, i2, f, i4, paint);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f2 = (fontMetricsInt.bottom - fontMetricsInt.ascent) / 2.0f;
        if (!this.b) {
            this.a.setColor(paint.getColor());
        }
        float f3 = i5 - f2;
        canvas.drawLine(f, f3, f + this.c, f3, this.a);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.leading = fontMetricsInt2.leading;
            fontMetricsInt.top = fontMetricsInt2.top;
        }
        float measureText = paint.measureText(charSequence, i, i2);
        this.c = measureText;
        return Math.round(measureText);
    }
}
