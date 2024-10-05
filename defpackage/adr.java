package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adr extends Drawable {
    public float a;
    public float b;
    private final RectF f;
    private final Rect g;
    private ColorStateList h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    public boolean c = false;
    public boolean d = true;
    private PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    private final Paint e = new Paint(5);

    public adr(ColorStateList colorStateList, float f) {
        this.a = f;
        a(colorStateList);
        this.f = new RectF();
        this.g = new Rect();
    }

    private final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.h = colorStateList;
        this.e.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f.set(rect.left, rect.top, rect.right, rect.bottom);
        this.g.set(rect);
        if (this.c) {
            this.g.inset((int) Math.ceil(ads.a(this.b, this.a, this.d)), (int) Math.ceil(ads.b(this.b, this.a, this.d)));
            this.f.set(this.g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.e;
        boolean z = false;
        if (this.i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.i);
            z = true;
        }
        RectF rectF = this.f;
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.g, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.e.getColor();
        if (z) {
            this.e.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z;
        }
        this.i = c(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = c(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = c(this.j, mode);
        invalidateSelf();
    }
}
