package defpackage;

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
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class slo extends Drawable {
    protected final Matrix a = new Matrix();
    protected final Paint b = new Paint(3);
    public final RectF c = new RectF();
    protected final ImageView.ScaleType d;
    public final Bitmap e;
    public final syd f;
    private final RectF g;
    private boolean h;
    private boolean i;

    public slo(Bitmap bitmap, ImageView.ScaleType scaleType, syd sydVar) {
        RectF rectF = new RectF();
        this.g = rectF;
        this.h = false;
        this.i = false;
        this.e = bitmap;
        rectF.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        this.d = scaleType;
        this.f = sydVar;
    }

    private final boolean b() {
        boolean z = this.h && getLayoutDirection() == 1;
        if (this.i == z) {
            return false;
        }
        this.i = z;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Rect rect) {
        float f;
        float f2;
        float f3;
        float width = this.e.getWidth();
        float height = this.e.getHeight();
        float width2 = rect.width();
        float height2 = rect.height();
        this.a.reset();
        if (width <= 0.0f || height <= 0.0f || width2 <= 0.0f || height2 <= 0.0f) {
            return;
        }
        ImageView.ScaleType scaleType = this.d;
        if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            if (width > width2 || height > height2) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            } else {
                scaleType = ImageView.ScaleType.CENTER;
            }
        }
        int i = sln.a[scaleType.ordinal()];
        if (i == 1) {
            float centerX = rect.centerX() - this.g.centerX();
            float centerY = rect.centerY() - this.g.centerY();
            this.a.setTranslate(centerX, centerY);
            this.c.set(this.g);
            this.c.offset(centerX, centerY);
            this.c.intersect(rect.left, rect.top, rect.right, rect.bottom);
        } else if (i == 2) {
            if (width * height2 > width2 * height) {
                f = height2 / height;
                f3 = rect.left + ((width2 - (width * f)) * 0.5f);
                f2 = rect.top;
            } else {
                float f4 = width2 / width;
                float f5 = rect.top + ((height2 - (height * f4)) * 0.5f);
                f = f4;
                f2 = f5;
                f3 = rect.left;
            }
            this.a.setScale(f, f);
            this.a.postTranslate(Math.round(f3), Math.round(f2));
            this.c.set(rect);
        } else if (i == 3) {
            this.c.set(rect);
            this.a.setRectToRect(this.g, this.c, Matrix.ScaleToFit.CENTER);
            this.a.mapRect(this.c, this.g);
        } else {
            this.c.set(rect);
            this.a.setRectToRect(this.g, this.c, Matrix.ScaleToFit.FILL);
        }
        if (this.i) {
            this.a.preTranslate(width, 0.0f);
            this.a.preScale(-1.0f, 1.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        BitmapShader bitmapShader = new BitmapShader(this.e, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        bitmapShader.setLocalMatrix(this.a);
        this.b.setShader(bitmapShader);
        canvas.drawRect(this.c, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.b.getAlpha() == 255) {
            return -1;
        }
        return this.b.getAlpha() == 0 ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        b();
        a(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        if (!b()) {
            return false;
        }
        a(getBounds());
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        if (this.h != z) {
            this.h = z;
            if (b()) {
                a(getBounds());
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
