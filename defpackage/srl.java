package defpackage;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class srl {
    public LinearGradient a;
    private final float b;
    private final int[] c;
    private final float[] d;
    private final PointF e;
    private final PointF f;
    private final syd g;
    private final int h;

    public srl(float f, PointF pointF, PointF pointF2, int[] iArr, float[] fArr, int i, syd sydVar) {
        this.b = f;
        this.c = iArr;
        this.d = fArr;
        this.e = pointF;
        this.f = pointF2;
        this.h = i;
        this.g = sydVar;
    }

    static LinearGradient a(float f, float f2, float f3, float f4, int[] iArr, float[] fArr) {
        if (fArr == null || iArr.length != fArr.length) {
            return new LinearGradient(f, f2, f3, f4, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(f, f2, f3, f4, iArr, fArr, Shader.TileMode.CLAMP);
    }

    static PointF b(PointF pointF, double d, float f) {
        double tan = Math.tan(Math.toRadians(f + 90.0f));
        double d2 = pointF.x;
        Double.isNaN(d2);
        double d3 = pointF.y;
        Double.isNaN(d3);
        double pow = (-(((d2 * tan) + (-d3)) + d)) / (Math.pow(tan, 2.0d) + 1.0d);
        PointF pointF2 = new PointF();
        double d4 = pointF.x;
        Double.isNaN(d4);
        pointF2.x = (float) (d4 + (tan * pow));
        double d5 = pointF.y;
        Double.isNaN(d5);
        pointF2.y = (float) (d5 + (-pow));
        return pointF2;
    }

    static PointF c(RectF rectF, int i, syd sydVar) {
        if (i == 0) {
            return new PointF(rectF.left, rectF.bottom);
        }
        if (i == 1) {
            return new PointF(rectF.left, rectF.top);
        }
        if (i == 2) {
            return new PointF(rectF.right, rectF.top);
        }
        if (i == 3) {
            return new PointF(rectF.right, rectF.bottom);
        }
        sydVar.b(22, "ElementsLinearGradientWrapper Quadrant has to be in the range 0 to 3");
        return new PointF(rectF.left, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(RectF rectF) {
        float f;
        float f2;
        float f3;
        float f4;
        if (this.e == null || this.f == null) {
            int i = (int) (this.b / 90.0f);
            float centerX = rectF.centerX();
            double centerY = rectF.centerY();
            double tan = Math.tan(Math.toRadians(this.b + 90.0f));
            double d = centerX;
            Double.isNaN(d);
            Double.isNaN(centerY);
            double d2 = centerY - (tan * d);
            PointF b = b(c(rectF, i % 4, this.g), d2, this.b);
            PointF b2 = b(c(rectF, (i + 2) % 4, this.g), d2, this.b);
            this.a = a(b.x, b.y, b2.x, b2.y, this.c, this.d);
            return;
        }
        if (this.h - 1 == 1) {
            f = rectF.left + this.e.x;
            f2 = rectF.top + this.e.y;
            f3 = rectF.left + this.f.x;
            f4 = this.f.y + rectF.top;
        } else {
            f = rectF.left + (rectF.width() * this.e.x);
            f2 = rectF.top + (rectF.height() * this.e.y);
            f3 = rectF.left + (rectF.width() * this.f.x);
            f4 = rectF.top + (rectF.height() * this.f.y);
        }
        this.a = a(f, f2, f3, f4, this.c, this.d);
    }
}
