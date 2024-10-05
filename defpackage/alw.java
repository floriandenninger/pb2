package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alw extends ReplacementSpan {
    public final als a;
    private final Paint.FontMetricsInt b = new Paint.FontMetricsInt();
    private short c = -1;
    private float d = 1.0f;

    public alw(als alsVar) {
        gn.h(alsVar, "metadata cannot be null");
        this.a = alsVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        alr.b();
        als alsVar = this.a;
        Typeface typeface = alsVar.b.c;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i6 = alsVar.a;
        canvas.drawText(alsVar.b.a, i6 + i6, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.b);
        this.d = Math.abs(this.b.descent - this.b.ascent) / this.a.d();
        this.a.d();
        this.c = (short) ((this.a.e().a(12) != 0 ? r1.b.getShort(r2 + r1.a) : (short) 0) * this.d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.b.ascent;
            fontMetricsInt.descent = this.b.descent;
            fontMetricsInt.top = this.b.top;
            fontMetricsInt.bottom = this.b.bottom;
        }
        return this.c;
    }
}
