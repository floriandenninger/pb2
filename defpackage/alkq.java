package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alkq extends alku {
    private final alks a;
    private final float b;
    private final float d;

    public alkq(alks alksVar, float f, float f2) {
        this.a = alksVar;
        this.b = f;
        this.d = f2;
    }

    @Override // defpackage.alku
    public final void a(Matrix matrix, aljy aljyVar, int i, Canvas canvas) {
        alks alksVar = this.a;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(alksVar.b - this.d, alksVar.a - this.b), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(this.b, this.d);
        matrix2.preRotate(b());
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        aljy.a[0] = aljyVar.j;
        aljy.a[1] = aljyVar.i;
        aljy.a[2] = aljyVar.h;
        aljyVar.g.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, aljy.a, aljy.b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, aljyVar.g);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float b() {
        alks alksVar = this.a;
        return (float) Math.toDegrees(Math.atan((alksVar.b - this.d) / (alksVar.a - this.b)));
    }
}
