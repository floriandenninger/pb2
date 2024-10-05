package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alkp extends alku {
    private final alkr a;

    public alkp(alkr alkrVar) {
        this.a = alkrVar;
    }

    @Override // defpackage.alku
    public final void a(Matrix matrix, aljy aljyVar, int i, Canvas canvas) {
        alkr alkrVar = this.a;
        float f = alkrVar.e;
        float f2 = alkrVar.f;
        RectF rectF = new RectF(alkrVar.a, alkrVar.b, alkrVar.c, alkrVar.d);
        Path path = aljyVar.k;
        if (f2 < 0.0f) {
            aljy.c[0] = 0;
            aljy.c[1] = aljyVar.j;
            aljy.c[2] = aljyVar.i;
            aljy.c[3] = aljyVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            aljy.c[0] = 0;
            aljy.c[1] = aljyVar.h;
            aljy.c[2] = aljyVar.i;
            aljy.c[3] = aljyVar.j;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        aljy.d[1] = f4;
        aljy.d[2] = f4 + ((1.0f - f4) / 2.0f);
        aljyVar.f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, aljy.c, aljy.d, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (f2 >= 0.0f) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aljyVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, aljyVar.f);
        canvas.restore();
    }
}
