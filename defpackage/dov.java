package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dov extends Drawable implements dow {
    private static final RectF a = new RectF();
    private static final RectF b = new RectF();
    private static final RectF c = new RectF();
    private final dou d;
    private Paint e;
    private Path f;
    private Path g;
    private boolean h;

    public dov(dou douVar) {
        this.d = douVar;
    }

    private final Path b() {
        if (this.h) {
            return this.f;
        }
        return null;
    }

    private static void c(Canvas canvas, RectF rectF, Path path, float[] fArr, Paint paint) {
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        if (path == null) {
            float min2 = Math.min(min, fArr[0]);
            canvas.drawRoundRect(rectF, min2, min2, paint);
        } else {
            if (path.isEmpty()) {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            canvas.drawPath(path, paint);
        }
    }

    private final void d(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, boolean z) {
        this.e.setStrokeWidth(f);
        this.e.setColor(i);
        RectF rectF = a;
        rectF.set(f2, f3, f4, f5);
        RectF rectF2 = b;
        rectF2.set(getBounds());
        if (z) {
            rectF2.inset(rectF.centerX() - rectF.left, 0.0f);
        } else {
            rectF2.inset(0.0f, rectF.centerY() - rectF.top);
        }
        int save = canvas.save();
        canvas.clipRect(rectF);
        c(canvas, rectF2, b(), this.d.j, this.e);
        canvas.restoreToCount(save);
    }

    @Override // defpackage.dow
    public final boolean a(dow dowVar) {
        return equals(dowVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
    
        if (r8 == r0.d) goto L46;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dov.draw(android.graphics.Canvas):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dov) {
            return did.K(this.d, ((dov) obj).d);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Paint paint = this.e;
        if (paint != null) {
            return paint.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.e;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.e;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }
}
