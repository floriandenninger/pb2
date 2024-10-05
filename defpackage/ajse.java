package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajse extends ImageSpan {
    int a;
    private final Paint.FontMetricsInt b;

    public ajse(Context context, Bitmap bitmap) {
        super(context, bitmap, 0);
        this.b = new Paint.FontMetricsInt();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        paint.getFontMetricsInt(this.b);
        Rect bounds = drawable.getBounds();
        int i6 = this.b.bottom;
        int i7 = this.b.top;
        canvas.translate(f + this.a, ((i4 + this.b.bottom) - ((i6 - i7) / 2)) - (bounds.height() / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        paint.getFontMetricsInt(this.b);
        int i3 = this.b.ascent - this.b.top;
        int i4 = this.b.bottom - this.b.descent;
        int i5 = this.b.bottom - ((this.b.bottom - this.b.top) / 2);
        int height = bounds.height() / 2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = i5 - height;
            fontMetricsInt.descent = i5 + height;
            fontMetricsInt.top = fontMetricsInt.ascent - i3;
            fontMetricsInt.bottom = fontMetricsInt.descent + i4;
        }
        int i6 = bounds.right;
        int i7 = this.a;
        return i6 + i7 + i7;
    }

    public ajse(Drawable drawable) {
        super(drawable, 0);
        this.b = new Paint.FontMetricsInt();
    }
}
