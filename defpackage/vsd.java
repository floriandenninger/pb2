package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsd extends Drawable {
    public static final Property a = new vsb(Integer.class);
    public static final Property b = new vsc(Integer.class);
    public final Paint c;
    private final int d;
    private final int e;
    private final Paint f;
    private final Paint.FontMetricsInt g;
    private int i;
    private String h = "";
    private final RectF j = new RectF();

    public vsd(Context context, float f, float f2, int i, int i2) {
        Resources resources = context.getResources();
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(i);
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setColor(i2);
        paint2.setTextAlign(Paint.Align.LEFT);
        paint2.setTextSize(resources.getDimension(R.dimen.callout_drawable_font_size) * f);
        paint2.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.g = paint2.getFontMetricsInt();
        this.d = (int) (f2 * f);
        this.e = (int) (resources.getInteger(R.integer.callout_drawable_corner_radius) * f);
    }

    public final int a() {
        return this.c.getAlpha();
    }

    public final int b() {
        return this.f.getAlpha();
    }

    public final void c(int i) {
        this.c.setAlpha(i);
        invalidateSelf();
    }

    public final void d(int i, int i2, int i3) {
        int intrinsicWidth = getIntrinsicWidth();
        int intrinsicHeight = i2 - getIntrinsicHeight();
        int i4 = i - (intrinsicWidth / 2);
        int i5 = i4 + intrinsicWidth;
        if (i4 < 0) {
            i5 = intrinsicWidth;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > i3) {
            i4 = i3 - intrinsicWidth;
        } else {
            i3 = i5;
        }
        setBounds(i4, intrinsicHeight, i3, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        canvas.translate(bounds.left, bounds.top);
        this.j.set(0.0f, 0.0f, width, height);
        RectF rectF = this.j;
        float f = this.e;
        canvas.drawRoundRect(rectF, f, f, this.c);
        canvas.drawText(this.h, this.d, (r1 + this.g.leading) - this.g.ascent, this.f);
    }

    public final void e(String str) {
        str.getClass();
        if (uqq.p(this.h, str)) {
            return;
        }
        this.h = str;
        this.i = (int) this.f.measureText(str);
        invalidateSelf();
    }

    public final void f(int i) {
        this.f.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.d;
        return (((i + i) + this.g.leading) - this.g.ascent) + this.g.descent;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.d;
        return i + i + this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        f(i);
        c(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
