package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chy {
    public chk a;
    public chk b;
    public chk c;
    public chk d;
    public chk e;
    public final chm f;
    public final chm g;
    public final chk h;
    public final chk i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;

    public chy(civ civVar) {
        cio cioVar = civVar.a;
        this.a = cioVar == null ? null : cioVar.a();
        ciw ciwVar = civVar.b;
        this.b = ciwVar == null ? null : ciwVar.a();
        ciq ciqVar = civVar.c;
        this.c = ciqVar == null ? null : ciqVar.a();
        cil cilVar = civVar.d;
        this.d = cilVar == null ? null : cilVar.a();
        cil cilVar2 = civVar.f;
        chm chmVar = (chm) (cilVar2 == null ? null : cilVar2.a());
        this.f = chmVar;
        if (chmVar != null) {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        cil cilVar3 = civVar.g;
        this.g = (chm) (cilVar3 == null ? null : cilVar3.a());
        cin cinVar = civVar.e;
        if (cinVar != null) {
            this.e = cinVar.a();
        }
        cil cilVar4 = civVar.h;
        if (cilVar4 != null) {
            this.h = cilVar4.a();
        } else {
            this.h = null;
        }
        cil cilVar5 = civVar.i;
        if (cilVar5 != null) {
            this.i = cilVar5.a();
        } else {
            this.i = null;
        }
    }

    private final void f() {
        for (int i = 0; i < 9; i++) {
            this.n[i] = 0.0f;
        }
    }

    public final Matrix a() {
        float k;
        this.j.reset();
        chk chkVar = this.b;
        if (chkVar != null) {
            PointF pointF = (PointF) chkVar.e();
            if (pointF.x != 0.0f || pointF.y != 0.0f) {
                this.j.preTranslate(pointF.x, pointF.y);
            }
        }
        chk chkVar2 = this.d;
        if (chkVar2 != null) {
            if (chkVar2 instanceof chz) {
                k = ((Float) chkVar2.e()).floatValue();
            } else {
                k = ((chm) chkVar2).k();
            }
            if (k != 0.0f) {
                this.j.preRotate(k);
            }
        }
        if (this.f != null) {
            float cos = this.g == null ? 0.0f : (float) Math.cos(Math.toRadians((-r0.k()) + 90.0f));
            float sin = this.g == null ? 1.0f : (float) Math.sin(Math.toRadians((-r4.k()) + 90.0f));
            double tan = Math.tan(Math.toRadians(this.f.k()));
            f();
            float[] fArr = this.n;
            fArr[0] = cos;
            fArr[1] = sin;
            float f = -sin;
            fArr[3] = f;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.k.setValues(fArr);
            f();
            float[] fArr2 = this.n;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.l.setValues(fArr2);
            f();
            float[] fArr3 = this.n;
            fArr3[0] = cos;
            fArr3[1] = f;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.m.setValues(fArr3);
            this.l.preConcat(this.k);
            this.m.preConcat(this.l);
            this.j.preConcat(this.m);
        }
        chk chkVar3 = this.c;
        if (chkVar3 != null) {
            clv clvVar = (clv) chkVar3.e();
            float f2 = clvVar.a;
            if (f2 != 1.0f || clvVar.b != 1.0f) {
                this.j.preScale(f2, clvVar.b);
            }
        }
        chk chkVar4 = this.a;
        if (chkVar4 != null) {
            PointF pointF2 = (PointF) chkVar4.e();
            if (pointF2.x != 0.0f || pointF2.y != 0.0f) {
                this.j.preTranslate(-pointF2.x, -pointF2.y);
            }
        }
        return this.j;
    }

    public final void c(cjp cjpVar) {
        cjpVar.h(this.e);
        cjpVar.h(this.h);
        cjpVar.h(this.i);
        cjpVar.h(this.a);
        cjpVar.h(this.b);
        cjpVar.h(this.c);
        cjpVar.h(this.d);
        cjpVar.h(this.f);
        cjpVar.h(this.g);
    }

    public final void d(chf chfVar) {
        chk chkVar = this.e;
        if (chkVar != null) {
            chkVar.g(chfVar);
        }
        chk chkVar2 = this.h;
        if (chkVar2 != null) {
            chkVar2.g(chfVar);
        }
        chk chkVar3 = this.i;
        if (chkVar3 != null) {
            chkVar3.g(chfVar);
        }
        chk chkVar4 = this.a;
        if (chkVar4 != null) {
            chkVar4.g(chfVar);
        }
        chk chkVar5 = this.b;
        if (chkVar5 != null) {
            chkVar5.g(chfVar);
        }
        chk chkVar6 = this.c;
        if (chkVar6 != null) {
            chkVar6.g(chfVar);
        }
        chk chkVar7 = this.d;
        if (chkVar7 != null) {
            chkVar7.g(chfVar);
        }
        chm chmVar = this.f;
        if (chmVar != null) {
            chmVar.g(chfVar);
        }
        chm chmVar2 = this.g;
        if (chmVar2 != null) {
            chmVar2.g(chfVar);
        }
    }

    public final boolean e(Object obj, clu cluVar) {
        chk chkVar;
        chk chkVar2;
        if (obj == cge.e) {
            chk chkVar3 = this.a;
            if (chkVar3 != null) {
                chkVar3.d = cluVar;
                return true;
            }
            new PointF();
            this.a = new chz(cluVar, null);
            return true;
        }
        if (obj == cge.f) {
            chk chkVar4 = this.b;
            if (chkVar4 != null) {
                chkVar4.d = cluVar;
                return true;
            }
            new PointF();
            this.b = new chz(cluVar, null);
            return true;
        }
        if (obj == cge.g) {
            chk chkVar5 = this.b;
            if (chkVar5 instanceof chw) {
                chw chwVar = (chw) chkVar5;
                clu cluVar2 = chwVar.e;
                chwVar.e = cluVar;
                return true;
            }
        }
        if (obj == cge.h) {
            chk chkVar6 = this.b;
            if (chkVar6 instanceof chw) {
                chw chwVar2 = (chw) chkVar6;
                clu cluVar3 = chwVar2.f;
                chwVar2.f = cluVar;
                return true;
            }
        }
        if (obj == cge.m) {
            chk chkVar7 = this.c;
            if (chkVar7 != null) {
                chkVar7.d = cluVar;
                return true;
            }
            new clv();
            this.c = new chz(cluVar, null);
            return true;
        }
        if (obj == cge.n) {
            chk chkVar8 = this.d;
            if (chkVar8 == null) {
                this.d = new chz(cluVar, null);
                return true;
            }
            chkVar8.d = cluVar;
            return true;
        }
        if (obj == cge.c) {
            chkVar = this.e;
            if (chkVar == null) {
                this.e = new chz(cluVar, null);
                return true;
            }
        } else {
            if ((obj == cge.A && (chkVar2 = this.h) != null) || ((obj == cge.B && (chkVar2 = this.i) != null) || (obj == cge.o && (chkVar2 = this.f) != null))) {
                chkVar2.d = cluVar;
                return true;
            }
            if (obj != cge.p || (chkVar = this.g) == null) {
                return false;
            }
        }
        chkVar.d = cluVar;
        return true;
    }

    public final Matrix b(float f) {
        chk chkVar = this.b;
        PointF pointF = chkVar == null ? null : (PointF) chkVar.e();
        chk chkVar2 = this.c;
        clv clvVar = chkVar2 == null ? null : (clv) chkVar2.e();
        this.j.reset();
        if (pointF != null) {
            this.j.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (clvVar != null) {
            double d = f;
            this.j.preScale((float) Math.pow(clvVar.a, d), (float) Math.pow(clvVar.b, d));
        }
        chk chkVar3 = this.d;
        if (chkVar3 != null) {
            float floatValue = ((Float) chkVar3.e()).floatValue();
            chk chkVar4 = this.a;
            PointF pointF2 = chkVar4 != null ? (PointF) chkVar4.e() : null;
            this.j.preRotate(floatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return this.j;
    }
}
