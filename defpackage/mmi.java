package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mmi extends Drawable {
    private final Paint a = new Paint(1);
    private Path b;
    private Path c;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.setAlpha(128);
        canvas.drawPath(this.b, this.a);
        this.a.setAlpha(204);
        canvas.drawPath(this.c, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Path path = new Path();
        this.c = path;
        float f = i;
        float f2 = i2;
        path.moveTo(f, f2);
        float f3 = i3 - i;
        float f4 = 0.1f * f3;
        this.c.lineTo(Math.round(f4), f2);
        float f5 = 0.35f * f3;
        float f6 = (i4 - i2) * 0.5f;
        this.c.lineTo(Math.round(f5), Math.round(f6));
        float f7 = i4;
        this.c.lineTo(Math.round(f4), f7);
        this.c.lineTo(f, f7);
        this.c.close();
        Path path2 = new Path();
        this.b = path2;
        path2.moveTo(f, f2);
        this.b.lineTo(Math.round(f4), f2);
        this.b.lineTo(Math.round(f5), Math.round(f6));
        this.b.lineTo(Math.round(f3 * 0.6f), f7);
        this.b.lineTo(f, f7);
        this.b.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
