package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class srh extends ImageSpan {
    private final Paint.FontMetricsInt a;

    public srh(Drawable drawable) {
        super(drawable, 0);
        this.a = new Paint.FontMetricsInt();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        paint.getFontMetricsInt(this.a);
        Rect bounds = drawable.getBounds();
        canvas.translate(f, (((i4 + this.a.bottom) - ((this.a.bottom - this.a.top) / 2)) - (bounds.height() / 2)) + 1);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        paint.getFontMetricsInt(this.a);
        int i3 = this.a.ascent - this.a.top;
        int i4 = this.a.bottom - this.a.descent;
        int i5 = this.a.bottom - ((this.a.bottom - this.a.top) / 2);
        int height = bounds.height() / 2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = i5 - height;
            fontMetricsInt.descent = i5 + height;
            fontMetricsInt.top = fontMetricsInt.ascent - i3;
            fontMetricsInt.bottom = fontMetricsInt.descent + i4;
        }
        return bounds.right;
    }
}
