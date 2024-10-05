package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vye extends Drawable {
    public static final /* synthetic */ int d = 0;
    private static final vyd e = new vyd();
    public vya a;
    public long b;
    public float c;
    private final Paint f;
    private final ObjectAnimator g;
    private final Matrix h;
    private float i;

    public vye() {
        Paint paint = new Paint();
        this.f = paint;
        this.h = new Matrix();
        this.i = 1.0f;
        this.c = 1.0f;
        paint.setFilterBitmap(true);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.g = ObjectAnimator.ofFloat(this, e, this.i);
    }

    private final Bitmap e() {
        vya vyaVar = this.a;
        if (vyaVar != null) {
            return vyaVar.b();
        }
        return null;
    }

    private static final float f(float f, float f2, float f3) {
        vcp.b(f2 > 0.0f);
        vcp.b(f3 < 1.0f);
        if (f <= 0.0f) {
            return f3;
        }
        if (f >= f2) {
            return 1.0f;
        }
        return f3 + (((f + 0.0f) / (f2 + 0.0f)) * (1.0f - f3));
    }

    public final void a(Canvas canvas, int i) {
        int i2 = ((i % 360) + 360) % 360;
        vcp.b(i2 % 90 == 0);
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        int alpha = this.f.getAlpha();
        float f = f(this.c, 0.7f, 0.0f);
        float f2 = f(this.c, 1.0f, 0.5f);
        this.f.setAlpha((int) (alpha * f));
        canvas.save();
        canvas.scale(f2, f2, bounds.exactCenterX(), bounds.exactCenterY());
        Bitmap e2 = e();
        if (e2 != null) {
            Matrix matrix = this.h;
            float width = e2.getWidth();
            float height = e2.getHeight();
            if (i2 == 0) {
                matrix.setScale(bounds.width() / width, bounds.height() / height);
            } else if (i2 == 90) {
                matrix.setRotate(90.0f);
                matrix.postTranslate(height, 0.0f);
                matrix.postScale(bounds.width() / height, bounds.height() / width);
            } else if (i2 == 180) {
                matrix.setRotate(180.0f, width / 2.0f, height / 2.0f);
                matrix.postScale(bounds.width() / width, bounds.height() / height);
            } else if (i2 == 270) {
                matrix.setRotate(270.0f);
                matrix.postTranslate(0.0f, width);
                matrix.postScale(bounds.width() / height, bounds.height() / width);
            }
            matrix.postTranslate(bounds.left, bounds.top);
            canvas.drawBitmap(e2, this.h, this.f);
        } else {
            canvas.drawRect(bounds, this.f);
        }
        canvas.restore();
        this.f.setAlpha(alpha);
    }

    public final void b(vya vyaVar) {
        vya vyaVar2 = this.a;
        if (vyaVar != vyaVar2) {
            if (vyaVar2 != null) {
                vyaVar2.d();
            }
            this.a = vyaVar != null ? vyaVar.c() : null;
            invalidateSelf();
        }
    }

    public final void c(boolean z) {
        float f = true != z ? 0.0f : 1.0f;
        this.g.cancel();
        if (this.c != f) {
            this.c = f;
            invalidateSelf();
        }
        this.i = f;
    }

    public final void d(int i) {
        if (this.i == 1.0f) {
            return;
        }
        this.g.cancel();
        this.g.setFloatValues(1.0f);
        this.g.setStartDelay(i);
        this.g.setDuration(150L);
        this.g.start();
        this.i = 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a(canvas, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap e2 = e();
        if (this.f.getAlpha() < 255 || this.c < 1.0f) {
            return -3;
        }
        return (e2 == null || !e2.hasAlpha()) ? -1 : -3;
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
}
