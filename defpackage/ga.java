package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ga extends Drawable {
    final Bitmap a;
    public float b;
    private int d;
    private final BitmapShader g;
    private boolean k;
    private final int l;
    private final int m;
    private final int e = 119;
    private final Paint f = new Paint(3);
    private final Matrix h = new Matrix();
    final Rect c = new Rect();
    private final RectF i = new RectF();
    private boolean j = true;

    public ga(Resources resources, Bitmap bitmap) {
        BitmapShader bitmapShader;
        this.d = 160;
        if (resources != null) {
            this.d = resources.getDisplayMetrics().densityDpi;
        }
        this.a = bitmap;
        if (bitmap != null) {
            this.l = bitmap.getScaledWidth(this.d);
            this.m = bitmap.getScaledHeight(this.d);
            bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        } else {
            this.m = -1;
            this.l = -1;
            bitmapShader = null;
        }
        this.g = bitmapShader;
    }

    private final void e() {
        this.b = Math.min(this.m, this.l) / 2;
    }

    private static boolean f(float f) {
        return f > 0.05f;
    }

    public void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.j) {
            if (this.k) {
                int min = Math.min(this.l, this.m);
                a(this.e, min, min, getBounds(), this.c);
                int min2 = Math.min(this.c.width(), this.c.height());
                this.c.inset(Math.max(0, (this.c.width() - min2) / 2), Math.max(0, (this.c.height() - min2) / 2));
                this.b = min2 * 0.5f;
            } else {
                a(this.e, this.l, this.m, getBounds(), this.c);
            }
            this.i.set(this.c);
            if (this.g != null) {
                this.h.setTranslate(this.i.left, this.i.top);
                this.h.preScale(this.i.width() / this.a.getWidth(), this.i.height() / this.a.getHeight());
                this.g.setLocalMatrix(this.h);
                this.f.setShader(this.g);
            }
            this.j = false;
        }
    }

    public final void c() {
        this.k = true;
        this.j = true;
        e();
        this.f.setShader(this.g);
        invalidateSelf();
    }

    public final void d() {
        if (this.b == 8.0f) {
            return;
        }
        this.k = false;
        if (f(8.0f)) {
            this.f.setShader(this.g);
        } else {
            this.f.setShader(null);
        }
        this.b = 8.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        b();
        if (this.f.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.c, this.f);
            return;
        }
        RectF rectF = this.i;
        float f = this.b;
        canvas.drawRoundRect(rectF, f, f, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.e != 119 || this.k || (bitmap = this.a) == null || bitmap.hasAlpha() || this.f.getAlpha() < 255 || f(this.b)) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.k) {
            e();
        }
        this.j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.f.getAlpha()) {
            this.f.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f.setFilterBitmap(z);
        invalidateSelf();
    }
}
