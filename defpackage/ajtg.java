package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajtg extends ReplacementSpan {
    public final String a;
    public final String b;
    private final float c;
    private final float d;
    private final float e;
    private final RectF f;
    private final Paint g;

    public ajtg(String str, float f, float f2, float f3, int i) {
        this(str, f, f2, f3, i, null);
    }

    private final float a(Paint paint, CharSequence charSequence, int i, int i2) {
        return Math.min(paint.measureText(TextUtils.substring(charSequence, i, i2)), this.e);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        float a = a(paint, charSequence, i, i2);
        float f2 = this.d;
        this.f.set(f, i3 + 0.0f, ((float) Math.ceil(f2 + f2 + a)) + f, i5);
        RectF rectF = this.f;
        float f3 = this.c;
        canvas.drawRoundRect(rectF, f3, f3, this.g);
        TextPaint textPaint = new TextPaint(paint);
        CharSequence ellipsize = TextUtils.ellipsize(TextUtils.substring(charSequence, i, i2), textPaint, a, TextUtils.TruncateAt.END);
        canvas.drawText(ellipsize, 0, ellipsize.length(), f + this.d, i4, textPaint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (charSequence == null || charSequence.length() == 0) {
            return 0;
        }
        float a = a(paint, charSequence, i, i2);
        float f = this.d;
        return (int) Math.ceil(a + f + f);
    }

    public ajtg(String str, float f, float f2, float f3, int i, byte[] bArr) {
        this.a = str;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.b = UUID.randomUUID().toString();
        this.f = new RectF();
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(i);
    }
}
