package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fyl extends zav {
    public int a;
    private final Paint b;
    private final Rect c;
    private int d;
    private boolean e;

    public fyl(int i, int i2) {
        this(null, i, i2);
    }

    public final int a() {
        return this.b.getColor();
    }

    public final void b(int i) {
        if (i == this.b.getColor()) {
            return;
        }
        this.b.setColor(i);
        invalidateSelf();
    }

    public final void d(int i) {
        if (i == this.a) {
            return;
        }
        this.a = i;
        f();
    }

    @Override // defpackage.zav, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (!this.e || this.a <= 0 || a() == 0) {
            return;
        }
        canvas.drawRect(this.c, this.b);
    }

    public final void e(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f();
    }

    @Override // defpackage.zav, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.b.setAlpha(i);
    }

    public fyl(Drawable drawable, int i, int i2) {
        super(drawable == null ? new ColorDrawable(0) : drawable);
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = 80;
        this.e = true;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.a = i2;
    }

    public final void c(int i) {
        if (i == this.d) {
            return;
        }
        if (i != 16 && i != 48 && i != 80) {
            throw new IllegalArgumentException("Unsupported gravity value");
        }
        this.d = i;
        f();
    }

    private final void f() {
        Rect rect;
        if (this.a > 0) {
            int i = this.d;
            if (i == 3) {
                rect = new Rect(getBounds());
                rect.right = rect.left + this.a;
            } else if (i == 5) {
                rect = new Rect(getBounds());
                rect.left = rect.right - this.a;
            } else if (i == 16) {
                rect = new Rect(getBounds());
                rect.top = (int) Math.ceil(rect.exactCenterY() - (this.a / 2.0f));
                rect.bottom = rect.top + this.a;
            } else if (i == 48) {
                rect = new Rect(getBounds());
                rect.bottom = rect.top + this.a;
            } else if (i == 80) {
                rect = new Rect(getBounds());
                rect.top = rect.bottom - this.a;
            } else {
                throw new AssertionError("gravity should never be anything other than bottom, top, center_vertical, right, left, start, and end");
            }
            if (this.c.equals(rect)) {
                return;
            }
            this.c.set(rect);
            invalidateSelf();
        }
    }
}
