package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gyg extends slo {
    private final BitmapShader g;
    private final int h;
    private final Path i;

    public gyg(Bitmap bitmap, ImageView.ScaleType scaleType, syd sydVar, DisplayMetrics displayMetrics) {
        super(bitmap, scaleType, sydVar);
        this.g = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.h = yjk.K(displayMetrics, 4);
        this.i = new Path();
    }

    private final float b(float f) {
        return ((float) this.h) + f > this.c.bottom ? this.c.bottom - f : this.h;
    }

    private final void c(Path path, float f) {
        float b = b(f);
        if (b > 0.0f) {
            float f2 = f + b;
            path.lineTo(this.c.left + b, f2);
            float b2 = b(f2);
            if (b2 > 0.0f) {
                float f3 = f2 + b2;
                path.lineTo((this.c.left + this.h) - b2, f3);
                c(path, f3);
                path.lineTo((this.c.right - this.h) + b2, f3);
            }
            path.lineTo(this.c.right - b, f2);
        }
    }

    @Override // defpackage.slo, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.g.setLocalMatrix(this.a);
        this.b.setShader(this.g);
        this.i.reset();
        this.i.moveTo(this.c.left, this.c.top);
        c(this.i, this.c.top);
        this.i.lineTo(this.c.right, this.c.top);
        canvas.drawPath(this.i, this.b);
    }
}
