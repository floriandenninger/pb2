package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abjx extends ReplacementSpan {
    private final List a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final Paint g;
    private final RectF h;
    private float i = -1.0f;
    private float j = -1.0f;

    public abjx(Context context, int i, int i2, List list) {
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(i2);
        this.b = i;
        this.h = new RectF();
        this.a = list;
        this.c = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_background_highlight_corner_radius);
        this.d = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_background_highlight_horizontal_padding);
        this.e = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_background_highlight_horizontal_padding);
        this.f = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_background_highlight_text_icon_gap);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.j < 0.0f) {
            this.j = paint.measureText(charSequence.subSequence(i, i2).toString());
        }
        int i6 = this.b;
        if (i6 != 0) {
            paint.setColor(i6);
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = i4;
        this.h.set(f, Math.max(i3, fontMetrics.ascent + f2), this.j + f, Math.min(i5, fontMetrics.descent + f2));
        RectF rectF = this.h;
        float f3 = this.c;
        canvas.drawRoundRect(rectF, f3, f3, this.g);
        canvas.drawText(charSequence, i, i2, f + this.d, f2, paint);
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Drawable c = gl.c((Drawable) it.next());
                c.mutate();
                c.setTint(this.b);
                c.setBounds(0, 0, c.getIntrinsicWidth(), c.getIntrinsicHeight());
                int intrinsicHeight = c.getIntrinsicHeight();
                canvas.save();
                canvas.translate(this.i + f + i7 + this.f, Math.max(((i5 - i3) - intrinsicHeight) / 2, 0) + i3);
                c.draw(canvas);
                canvas.restore();
                i7 += c.getIntrinsicWidth();
            }
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f = this.i;
        if (f < 0.0f) {
            f = paint.measureText(charSequence.subSequence(i, i2).toString());
            this.i = f;
        }
        this.j = f + this.d + this.e;
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.j += ((Drawable) it.next()).getIntrinsicWidth();
            }
        }
        return (int) this.j;
    }
}
