package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgu extends cgn {
    private final String c;
    private final boolean d;
    private final aee e;
    private final aee f;
    private final RectF g;
    private final int h;
    private final chk i;
    private final chk j;
    private final chk k;
    private chz l;
    private final int m;

    public cgu(cfz cfzVar, cjp cjpVar, cjc cjcVar) {
        super(cfzVar, cjpVar, abp.f(cjcVar.l), abp.d(cjcVar.m), cjcVar.g, cjcVar.c, cjcVar.f, cjcVar.h, cjcVar.i);
        this.e = new aee();
        this.f = new aee();
        this.g = new RectF();
        this.c = cjcVar.a;
        this.m = cjcVar.k;
        this.d = cjcVar.j;
        this.h = (int) (cfzVar.a.a() / 32.0f);
        chk a = cjcVar.b.a();
        this.i = a;
        a.g(this);
        cjpVar.h(a);
        chk a2 = cjcVar.d.a();
        this.j = a2;
        a2.g(this);
        cjpVar.h(a2);
        chk a3 = cjcVar.e.a();
        this.k = a3;
        a3.g(this);
        cjpVar.h(a3);
    }

    private final int h() {
        int round = Math.round(this.j.c * this.h);
        int round2 = Math.round(this.k.c * this.h);
        int round3 = Math.round(this.i.c * this.h);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private final int[] i(int[] iArr) {
        chz chzVar = this.l;
        if (chzVar != null) {
            Integer[] numArr = (Integer[]) chzVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.cgn, defpackage.cih
    public final void a(Object obj, clu cluVar) {
        super.a(obj, cluVar);
        if (obj == cge.F) {
            chz chzVar = this.l;
            if (chzVar != null) {
                this.a.j(chzVar);
            }
            chz chzVar2 = new chz(cluVar);
            this.l = chzVar2;
            chzVar2.g(this);
            this.a.h(this.l);
        }
    }

    @Override // defpackage.cgn, defpackage.cgq
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (this.d) {
            return;
        }
        c(this.g, matrix, false);
        if (this.m != 1) {
            long h = h();
            shader = (RadialGradient) this.f.f(h);
            if (shader == null) {
                PointF pointF = (PointF) this.j.e();
                PointF pointF2 = (PointF) this.k.e();
                cja cjaVar = (cja) this.i.e();
                int[] i2 = i(cjaVar.b);
                float[] fArr = cjaVar.a;
                RadialGradient radialGradient = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - r9, pointF2.y - r10), i2, fArr, Shader.TileMode.CLAMP);
                this.f.k(h, radialGradient);
                shader = radialGradient;
            }
        } else {
            long h2 = h();
            shader = (LinearGradient) this.e.f(h2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.j.e();
                PointF pointF4 = (PointF) this.k.e();
                cja cjaVar2 = (cja) this.i.e();
                shader = new LinearGradient(pointF3.x, pointF3.y, pointF4.x, pointF4.y, i(cjaVar2.b), cjaVar2.a, Shader.TileMode.CLAMP);
                this.e.k(h2, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        this.b.setShader(shader);
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.cgo
    public final String g() {
        return this.c;
    }
}
