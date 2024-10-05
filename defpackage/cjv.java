package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjv extends cjp {
    private final RectF h;
    private final Paint i;
    private final float[] j;
    private final Path k;
    private final cjs l;
    private chk m;

    public cjv(cfz cfzVar, cjs cjsVar) {
        super(cfzVar, cjsVar);
        this.h = new RectF();
        cgl cglVar = new cgl();
        this.i = cglVar;
        this.j = new float[8];
        this.k = new Path();
        this.l = cjsVar;
        cglVar.setAlpha(0);
        cglVar.setStyle(Paint.Style.FILL);
        cglVar.setColor(cjsVar.k);
    }

    @Override // defpackage.cjp, defpackage.cih
    public final void a(Object obj, clu cluVar) {
        super.a(obj, cluVar);
        if (obj == cge.E) {
            this.m = new chz(cluVar);
        }
    }

    @Override // defpackage.cjp, defpackage.cgq
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        RectF rectF2 = this.h;
        cjs cjsVar = this.l;
        rectF2.set(0.0f, 0.0f, cjsVar.i, cjsVar.j);
        this.a.mapRect(this.h);
        rectF.set(this.h);
    }

    @Override // defpackage.cjp
    public final void i(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.l.k);
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.g.e == null ? 100 : ((Integer) r1.e()).intValue())) / 100.0f) * 255.0f);
        this.i.setAlpha(intValue);
        chk chkVar = this.m;
        if (chkVar != null) {
            this.i.setColorFilter((ColorFilter) chkVar.e());
        }
        if (intValue > 0) {
            float[] fArr = this.j;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            cjs cjsVar = this.l;
            float f = cjsVar.i;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = cjsVar.j;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            this.k.reset();
            Path path = this.k;
            float[] fArr2 = this.j;
            path.moveTo(fArr2[0], fArr2[1]);
            Path path2 = this.k;
            float[] fArr3 = this.j;
            path2.lineTo(fArr3[2], fArr3[3]);
            Path path3 = this.k;
            float[] fArr4 = this.j;
            path3.lineTo(fArr4[4], fArr4[5]);
            Path path4 = this.k;
            float[] fArr5 = this.j;
            path4.lineTo(fArr5[6], fArr5[7]);
            Path path5 = this.k;
            float[] fArr6 = this.j;
            path5.lineTo(fArr6[0], fArr6[1]);
            this.k.close();
            canvas.drawPath(this.k, this.i);
        }
    }
}
