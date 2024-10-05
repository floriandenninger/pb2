package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class srk extends slo {
    srl g;
    aoam h;
    private final Paint i;
    private final float j;
    private final float k;
    private final boolean l;
    private final int m;
    private final BitmapShader n;
    private final Path o;

    public srk(Bitmap bitmap, ImageView.ScaleType scaleType, float f, int i, float f2, boolean z, syd sydVar) {
        super(bitmap, scaleType, sydVar);
        this.o = new Path();
        this.l = z;
        this.j = f;
        this.k = f2;
        Paint paint = new Paint();
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(f);
        this.m = (int) (f * 0.5f);
        this.n = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.slo
    public final void a(Rect rect) {
        Rect rect2 = new Rect(rect);
        int i = this.m;
        rect2.inset(i, i);
        super.a(rect2);
        srl srlVar = this.g;
        if (srlVar != null) {
            srlVar.d(this.c);
        }
        if (c()) {
            return;
        }
        b();
    }

    public final void b() {
        if (this.h == null) {
            return;
        }
        float[] fArr = new float[8];
        int layoutDirection = getLayoutDirection();
        this.o.reset();
        if (this.h.al() || ((layoutDirection != 1 && this.h.an()) || (layoutDirection == 1 && this.h.ak()))) {
            float f = this.k;
            fArr[0] = f;
            fArr[1] = f;
        }
        if (this.h.am() || ((layoutDirection != 1 && this.h.ak()) || (layoutDirection == 1 && this.h.an()))) {
            float f2 = this.k;
            fArr[2] = f2;
            fArr[3] = f2;
        }
        if (this.h.ai() || ((layoutDirection != 1 && this.h.ag()) || (layoutDirection == 1 && this.h.aj()))) {
            float f3 = this.k;
            fArr[4] = f3;
            fArr[5] = f3;
        }
        if (this.h.ah() || ((layoutDirection != 1 && this.h.aj()) || (layoutDirection == 1 && this.h.ag()))) {
            float f4 = this.k;
            fArr[6] = f4;
            fArr[7] = f4;
        }
        this.o.addRoundRect(this.c, fArr, Path.Direction.CW);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        aoam aoamVar = this.h;
        if (aoamVar == null) {
            return true;
        }
        if (!aoaj.r(aoamVar, 4) && !aoaj.r(this.h, 6) && !aoaj.r(this.h, 10) && !aoaj.r(this.h, 8) && !aoaj.r(this.h, 12) && !aoaj.r(this.h, 14) && !aoaj.r(this.h, 16) && !aoaj.r(this.h, 18)) {
            return true;
        }
        if (this.h.al() && this.h.am() && this.h.ai() && this.h.ah()) {
            return true;
        }
        return this.h.an() && this.h.ak() && this.h.aj() && this.h.ag();
    }

    @Override // defpackage.slo, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        LinearGradient linearGradient;
        LinearGradient linearGradient2;
        LinearGradient linearGradient3;
        LinearGradient linearGradient4;
        this.n.setLocalMatrix(this.a);
        this.b.setShader(this.n);
        if (this.l) {
            float min = Math.min(this.c.width() * 0.5f, this.c.height() * 0.5f);
            canvas.drawCircle(this.c.centerX(), this.c.centerY(), min, this.b);
            srl srlVar = this.g;
            if (srlVar != null && (linearGradient4 = srlVar.a) != null) {
                this.b.setShader(linearGradient4);
                canvas.drawCircle(this.c.centerX(), this.c.centerY(), min, this.b);
            }
            canvas.drawCircle(this.c.centerX(), this.c.centerY(), min, this.i);
            return;
        }
        if (this.k > 0.5f) {
            if (c()) {
                RectF rectF = this.c;
                float f = this.k;
                canvas.drawRoundRect(rectF, f, f, this.b);
                srl srlVar2 = this.g;
                if (srlVar2 != null && (linearGradient3 = srlVar2.a) != null) {
                    this.b.setShader(linearGradient3);
                    RectF rectF2 = this.c;
                    float f2 = this.k;
                    canvas.drawRoundRect(rectF2, f2, f2, this.b);
                }
                if (this.j > 0.5f) {
                    RectF rectF3 = this.c;
                    float f3 = this.k;
                    canvas.drawRoundRect(rectF3, f3, f3, this.i);
                    return;
                }
                return;
            }
            canvas.drawPath(this.o, this.b);
            srl srlVar3 = this.g;
            if (srlVar3 != null && (linearGradient2 = srlVar3.a) != null) {
                this.b.setShader(linearGradient2);
                canvas.drawPath(this.o, this.b);
            }
            if (this.j > 0.5f) {
                canvas.drawPath(this.o, this.i);
                return;
            }
            return;
        }
        canvas.drawRect(this.c, this.b);
        srl srlVar4 = this.g;
        if (srlVar4 != null && (linearGradient = srlVar4.a) != null) {
            this.b.setShader(linearGradient);
            canvas.drawRect(this.c, this.b);
        }
        if (this.j > 0.5f) {
            canvas.drawRect(this.c, this.i);
        }
    }

    @Override // defpackage.slo, android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.k > 0.0f) {
            return -3;
        }
        return super.getOpacity();
    }
}
