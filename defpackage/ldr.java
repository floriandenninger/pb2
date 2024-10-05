package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ldr extends ImageSpan {
    private final int a;

    public ldr(Drawable drawable, int i) {
        super(drawable, 1);
        this.a = i;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        int i6 = i5 - drawable.getBounds().bottom;
        if (this.mVerticalAlignment == 1) {
            i6 -= paint.getFontMetricsInt().descent;
        }
        canvas.translate(f, i6 - this.a);
        drawable.draw(canvas);
        canvas.restore();
    }
}
