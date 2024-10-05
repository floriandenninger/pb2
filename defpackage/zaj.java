package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zaj extends Drawable implements Drawable.Callback {
    public Drawable a;
    private final Paint b;
    private final Paint c;
    private final float d;
    private int h;
    private int i;
    private float j;
    private float k;
    private float l;
    private Bitmap m;
    private Bitmap n;
    private int o;
    private int p;
    private int q;
    private BitmapShader r;
    private final Canvas e = new Canvas();
    private boolean f = false;
    private boolean g = false;
    private final Matrix s = new Matrix();

    public zaj(Drawable drawable, float f, int i) {
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        this.d = f;
        if (f > 0.0f) {
            Paint paint2 = new Paint();
            this.c = paint2;
            paint2.setAntiAlias(true);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(i);
            paint2.setStrokeWidth(f);
        } else {
            this.c = null;
        }
        a(drawable);
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null && drawable2.getCallback() == this) {
            this.a.setCallback(null);
        }
        if (drawable != null) {
            drawable.setCallback(this);
        } else {
            this.e.setBitmap(null);
            Bitmap bitmap = this.n;
            if (bitmap != null) {
                bitmap.recycle();
                this.n = null;
            }
        }
        this.a = drawable;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.g) {
            return;
        }
        this.g = true;
        this.f = false;
        Drawable drawable = this.a;
        if (this.h <= 0 || this.i <= 0) {
            this.b.setShader(null);
        } else {
            if (drawable != null) {
                this.q = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i = this.q;
                if (i <= 0) {
                    i = this.h;
                }
                this.o = i;
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = this.i;
                }
                this.p = intrinsicHeight;
                if (intrinsicHeight == 0 || i == 0) {
                    this.m = null;
                } else {
                    Bitmap bitmap = this.n;
                    if (bitmap == null || bitmap.isRecycled() || this.n.getWidth() != i || this.n.getHeight() != intrinsicHeight) {
                        Bitmap createBitmap = Bitmap.createBitmap(i, intrinsicHeight, Bitmap.Config.ARGB_8888);
                        this.n = createBitmap;
                        this.e.setBitmap(createBitmap);
                    } else {
                        this.n.eraseColor(0);
                    }
                    this.m = this.n;
                    drawable.setBounds(0, 0, this.o, this.p);
                    drawable.draw(this.e);
                }
            } else {
                this.m = null;
            }
            Bitmap bitmap2 = this.m;
            if (bitmap2 == null || bitmap2.getHeight() <= 0 || this.m.getWidth() <= 0) {
                this.b.setShader(null);
            } else {
                this.s.reset();
                if (this.m.getWidth() != this.h || this.m.getHeight() != this.i) {
                    int min = Math.min(this.m.getWidth(), this.m.getHeight());
                    float f = this.l;
                    float f2 = (f + f) / min;
                    this.s.postScale(f2, f2);
                }
                Matrix matrix = this.s;
                float f3 = this.j;
                float f4 = this.l;
                matrix.postTranslate(f3 - f4, this.k - f4);
                BitmapShader bitmapShader = new BitmapShader(this.m, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                this.r = bitmapShader;
                bitmapShader.setLocalMatrix(this.s);
                this.b.setShader(this.r);
            }
        }
        if (this.b.getShader() != null) {
            canvas.drawCircle(this.j, this.k, this.l, this.b);
            Paint paint = this.c;
            if (paint != null) {
                canvas.drawCircle(this.j, this.k, this.l - (this.d / 2.0f), paint);
            }
        }
        this.g = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f) {
            return;
        }
        this.f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.h = rect.width();
        this.i = rect.height();
        this.j = rect.exactCenterX();
        this.k = rect.exactCenterY();
        this.l = Math.min(this.j - rect.left, this.k - rect.top);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
