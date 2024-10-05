package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgt implements cgq, chf, cgw {
    private final String a;
    private final boolean b;
    private final cjp c;
    private final aee d = new aee();
    private final aee e = new aee();
    private final Path f;
    private final Paint g;
    private final RectF h;
    private final List i;
    private final chk j;
    private final chk k;
    private final chk l;
    private final chk m;
    private chk n;
    private chz o;
    private final cfz p;
    private final int q;
    private final int r;

    public cgt(cfz cfzVar, cjp cjpVar, cjb cjbVar) {
        Path path = new Path();
        this.f = path;
        this.g = new cgl(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.c = cjpVar;
        this.a = cjbVar.f;
        this.b = cjbVar.g;
        this.p = cfzVar;
        this.r = cjbVar.h;
        path.setFillType(cjbVar.a);
        this.q = (int) (cfzVar.a.a() / 32.0f);
        chk a = cjbVar.b.a();
        this.j = a;
        a.g(this);
        cjpVar.h(a);
        chk a2 = cjbVar.c.a();
        this.k = a2;
        a2.g(this);
        cjpVar.h(a2);
        chk a3 = cjbVar.d.a();
        this.l = a3;
        a3.g(this);
        cjpVar.h(a3);
        chk a4 = cjbVar.e.a();
        this.m = a4;
        a4.g(this);
        cjpVar.h(a4);
    }

    private final int h() {
        int round = Math.round(this.l.c * this.q);
        int round2 = Math.round(this.m.c * this.q);
        int round3 = Math.round(this.j.c * this.q);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private final int[] i(int[] iArr) {
        chz chzVar = this.o;
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

    @Override // defpackage.cih
    public final void a(Object obj, clu cluVar) {
        if (obj == cge.d) {
            this.k.d = cluVar;
            return;
        }
        if (obj == cge.E) {
            chk chkVar = this.n;
            if (chkVar != null) {
                this.c.j(chkVar);
            }
            chz chzVar = new chz(cluVar);
            this.n = chzVar;
            chzVar.g(this);
            this.c.h(this.n);
            return;
        }
        if (obj == cge.F) {
            chz chzVar2 = this.o;
            if (chzVar2 != null) {
                this.c.j(chzVar2);
            }
            this.d.j();
            this.e.j();
            chz chzVar3 = new chz(cluVar);
            this.o = chzVar3;
            chzVar3.g(this);
            this.c.h(this.o);
        }
    }

    @Override // defpackage.cgq
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (this.b) {
            return;
        }
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(((cgy) this.i.get(i2)).i(), matrix);
        }
        this.f.computeBounds(this.h, false);
        if (this.r != 1) {
            long h = h();
            shader = (RadialGradient) this.e.f(h);
            if (shader == null) {
                PointF pointF = (PointF) this.l.e();
                PointF pointF2 = (PointF) this.m.e();
                cja cjaVar = (cja) this.j.e();
                int[] i3 = i(cjaVar.b);
                float[] fArr = cjaVar.a;
                float f = pointF.x;
                float f2 = pointF.y;
                float hypot = (float) Math.hypot(pointF2.x - f, pointF2.y - f2);
                shader = new RadialGradient(f, f2, hypot <= 0.0f ? 0.001f : hypot, i3, fArr, Shader.TileMode.CLAMP);
                this.e.k(h, shader);
            }
        } else {
            long h2 = h();
            shader = (LinearGradient) this.d.f(h2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.l.e();
                PointF pointF4 = (PointF) this.m.e();
                cja cjaVar2 = (cja) this.j.e();
                LinearGradient linearGradient = new LinearGradient(pointF3.x, pointF3.y, pointF4.x, pointF4.y, i(cjaVar2.b), cjaVar2.a, Shader.TileMode.CLAMP);
                this.d.k(h2, linearGradient);
                shader = linearGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.g.setShader(shader);
        chk chkVar = this.n;
        if (chkVar != null) {
            this.g.setColorFilter((ColorFilter) chkVar.e());
        }
        this.g.setAlpha(cln.k((int) ((((i / 255.0f) * ((Integer) this.k.e()).intValue()) / 100.0f) * 255.0f)));
        canvas.drawPath(this.f, this.g);
        cfd.a();
    }

    @Override // defpackage.cgq
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f.addPath(((cgy) this.i.get(i)).i(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.chf
    public final void d() {
        this.p.invalidateSelf();
    }

    @Override // defpackage.cih
    public final void e(cig cigVar, int i, List list, cig cigVar2) {
        cln.h(cigVar, i, list, cigVar2, this);
    }

    @Override // defpackage.cgo
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            cgo cgoVar = (cgo) list2.get(i);
            if (cgoVar instanceof cgy) {
                this.i.add((cgy) cgoVar);
            }
        }
    }

    @Override // defpackage.cgo
    public final String g() {
        return this.a;
    }
}
