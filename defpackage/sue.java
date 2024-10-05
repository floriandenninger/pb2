package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sue extends Drawable {
    private static final int[] g = {R.attr.state_pressed};
    private static final int[] h = {R.attr.state_activated};
    public int a;
    public int b;
    public int c;
    public float d;
    public boolean e;
    public aoam f;
    private final Paint i;
    private final RectF j;
    private Path k;

    public sue() {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new RectF();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0.0f;
        this.k = null;
        this.e = false;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
    }

    private final boolean a() {
        aoam aoamVar = this.f;
        if (aoamVar == null) {
            return true;
        }
        if (!aoaj.r(aoamVar, 4) && !aoaj.r(this.f, 6) && !aoaj.r(this.f, 10) && !aoaj.r(this.f, 8) && !aoaj.r(this.f, 12) && !aoaj.r(this.f, 14) && !aoaj.r(this.f, 16) && !aoaj.r(this.f, 18)) {
            return true;
        }
        if (this.f.al() && this.f.am() && this.f.ai() && this.f.ah()) {
            return true;
        }
        return this.f.an() && this.f.ak() && this.f.aj() && this.f.ag();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.d <= 0.5f) {
            canvas.drawRect(this.j, this.i);
            return;
        }
        if (a()) {
            RectF rectF = this.j;
            float f = this.d;
            canvas.drawRoundRect(rectF, f, f, this.i);
        } else {
            Path path = this.k;
            path.getClass();
            canvas.drawPath(path, this.i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.i.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.i.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int alpha = this.i.getAlpha();
        return alpha == 255 ? this.d < 0.5f ? -1 : -3 : alpha == 0 ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return (this.a == 0 && this.b == 0) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Path path;
        this.j.set(rect);
        if (!a() && this.k == null) {
            aoam aoamVar = this.f;
            if (aoamVar == null) {
                path = new Path();
            } else {
                float[] fArr = new float[8];
                if (aoamVar.al() || ((!this.e && this.f.an()) || (this.e && this.f.ak()))) {
                    float f = this.d;
                    fArr[0] = f;
                    fArr[1] = f;
                }
                if (this.f.am() || ((!this.e && this.f.ak()) || (this.e && this.f.an()))) {
                    float f2 = this.d;
                    fArr[2] = f2;
                    fArr[3] = f2;
                }
                if (this.f.ai() || ((!this.e && this.f.ag()) || (this.e && this.f.aj()))) {
                    float f3 = this.d;
                    fArr[4] = f3;
                    fArr[5] = f3;
                }
                if (this.f.ah() || ((!this.e && this.f.aj()) || (this.e && this.f.ag()))) {
                    float f4 = this.d;
                    fArr[6] = f4;
                    fArr[7] = f4;
                }
                path = new Path();
                path.addRoundRect(this.j, fArr, Path.Direction.CW);
            }
            this.k = path;
        }
        if (this.c == 0 || isStateful()) {
            return;
        }
        this.i.setColor(this.c);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int color = this.i.getColor();
        if (StateSet.stateSetMatches(g, iArr)) {
            int i = this.a;
            if (color == i) {
                return false;
            }
            this.i.setColor(i);
            invalidateSelf();
            return true;
        }
        if (StateSet.stateSetMatches(h, iArr)) {
            int i2 = this.b;
            if (color == i2) {
                return false;
            }
            this.i.setColor(i2);
            invalidateSelf();
            return true;
        }
        int i3 = this.c;
        if (i3 != 0) {
            if (color == i3) {
                return false;
            }
            this.i.setColor(i3);
            invalidateSelf();
            return true;
        }
        if (color != 0) {
            this.i.setColor(0);
            invalidateSelf();
            return true;
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.i.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
    }
}
