package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cgn implements chf, cgw, cgq {
    protected final cjp a;
    final Paint b;
    private final cfz g;
    private final float[] i;
    private final chk j;
    private final chk k;
    private final List l;
    private final chk m;
    private chk n;
    private final PathMeasure c = new PathMeasure();
    private final Path d = new Path();
    private final Path e = new Path();
    private final RectF f = new RectF();
    private final List h = new ArrayList();

    public cgn(cfz cfzVar, cjp cjpVar, Paint.Cap cap, Paint.Join join, float f, cin cinVar, cil cilVar, List list, cil cilVar2) {
        cgl cglVar = new cgl(1);
        this.b = cglVar;
        this.g = cfzVar;
        this.a = cjpVar;
        cglVar.setStyle(Paint.Style.STROKE);
        cglVar.setStrokeCap(cap);
        cglVar.setStrokeJoin(join);
        cglVar.setStrokeMiter(f);
        this.k = cinVar.a();
        this.j = cilVar.a();
        if (cilVar2 == null) {
            this.m = null;
        } else {
            this.m = cilVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(((cil) list.get(i)).a());
        }
        cjpVar.h(this.k);
        cjpVar.h(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            cjpVar.h((chk) this.l.get(i2));
        }
        chk chkVar = this.m;
        if (chkVar != null) {
            cjpVar.h(chkVar);
        }
        this.k.g(this);
        this.j.g(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((chk) this.l.get(i3)).g(this);
        }
        chk chkVar2 = this.m;
        if (chkVar2 != null) {
            chkVar2.g(this);
        }
    }

    @Override // defpackage.cih
    public void a(Object obj, clu cluVar) {
        if (obj == cge.d) {
            this.k.d = cluVar;
            return;
        }
        if (obj == cge.q) {
            this.j.d = cluVar;
            return;
        }
        if (obj == cge.E) {
            chk chkVar = this.n;
            if (chkVar != null) {
                this.a.j(chkVar);
            }
            chz chzVar = new chz(cluVar);
            this.n = chzVar;
            chzVar.g(this);
            this.a.h(this.n);
        }
    }

    @Override // defpackage.cgq
    public void b(Canvas canvas, Matrix matrix, int i) {
        float[] fArr = (float[]) cls.a.get();
        boolean z = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            cfd.a();
            return;
        }
        cho choVar = (cho) this.k;
        float k = (i / 255.0f) * choVar.k(choVar.d(), choVar.b());
        float f = 100.0f;
        this.b.setAlpha(cln.k((int) ((k / 100.0f) * 255.0f)));
        this.b.setStrokeWidth(((chm) this.j).k() * cls.c(matrix));
        if (this.b.getStrokeWidth() > 0.0f) {
            if (this.l.isEmpty()) {
                cfd.a();
            } else {
                float c = cls.c(matrix);
                for (int i2 = 0; i2 < this.l.size(); i2++) {
                    this.i[i2] = ((Float) ((chk) this.l.get(i2)).e()).floatValue();
                    if (i2 % 2 == 0) {
                        float[] fArr2 = this.i;
                        if (fArr2[i2] < 1.0f) {
                            fArr2[i2] = 1.0f;
                        }
                    } else {
                        float[] fArr3 = this.i;
                        if (fArr3[i2] < 0.1f) {
                            fArr3[i2] = 0.1f;
                        }
                    }
                    float[] fArr4 = this.i;
                    fArr4[i2] = fArr4[i2] * c;
                }
                chk chkVar = this.m;
                this.b.setPathEffect(new DashPathEffect(this.i, chkVar == null ? 0.0f : ((Float) chkVar.e()).floatValue() * c));
                cfd.a();
            }
            chk chkVar2 = this.n;
            if (chkVar2 != null) {
                this.b.setColorFilter((ColorFilter) chkVar2.e());
            }
            int i3 = 0;
            while (i3 < this.h.size()) {
                cgm cgmVar = (cgm) this.h.get(i3);
                if (cgmVar.b != null) {
                    this.d.reset();
                    int size = cgmVar.a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else {
                            this.d.addPath(((cgy) cgmVar.a.get(size)).i(), matrix);
                        }
                    }
                    this.c.setPath(this.d, z);
                    float length = this.c.getLength();
                    while (this.c.nextContour()) {
                        length += this.c.getLength();
                    }
                    float floatValue = (((Float) cgmVar.b.d.e()).floatValue() * length) / 360.0f;
                    float floatValue2 = ((((Float) cgmVar.b.b.e()).floatValue() * length) / f) + floatValue;
                    float floatValue3 = ((((Float) cgmVar.b.c.e()).floatValue() * length) / f) + floatValue;
                    int size2 = cgmVar.a.size() - 1;
                    float f2 = 0.0f;
                    while (size2 >= 0) {
                        this.e.set(((cgy) cgmVar.a.get(size2)).i());
                        this.e.transform(matrix);
                        this.c.setPath(this.e, z);
                        float length2 = this.c.getLength();
                        if (floatValue3 > length) {
                            float f3 = floatValue3 - length;
                            if (f3 < f2 + length2 && f2 < f3) {
                                cls.h(this.e, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f3 / length2, 1.0f), 0.0f);
                                canvas.drawPath(this.e, this.b);
                                f2 += length2;
                                size2--;
                                z = false;
                            }
                        }
                        float f4 = f2 + length2;
                        if (f4 >= floatValue2 && f2 <= floatValue3) {
                            if (f4 > floatValue3 || floatValue2 >= f2) {
                                cls.h(this.e, floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2, floatValue3 > f4 ? 1.0f : (floatValue3 - f2) / length2, 0.0f);
                                canvas.drawPath(this.e, this.b);
                            } else {
                                canvas.drawPath(this.e, this.b);
                            }
                        }
                        f2 += length2;
                        size2--;
                        z = false;
                    }
                    cfd.a();
                } else {
                    this.d.reset();
                    int size3 = cgmVar.a.size();
                    while (true) {
                        size3--;
                        if (size3 < 0) {
                            break;
                        } else {
                            this.d.addPath(((cgy) cgmVar.a.get(size3)).i(), matrix);
                        }
                    }
                    cfd.a();
                    canvas.drawPath(this.d, this.b);
                    cfd.a();
                }
                i3++;
                f = 100.0f;
                z = false;
            }
            cfd.a();
            return;
        }
        cfd.a();
    }

    @Override // defpackage.cgq
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.d.reset();
        for (int i = 0; i < this.h.size(); i++) {
            cgm cgmVar = (cgm) this.h.get(i);
            for (int i2 = 0; i2 < cgmVar.a.size(); i2++) {
                this.d.addPath(((cgy) cgmVar.a.get(i2)).i(), matrix);
            }
        }
        this.d.computeBounds(this.f, false);
        float k = ((chm) this.j).k();
        RectF rectF2 = this.f;
        float f = k / 2.0f;
        rectF2.set(rectF2.left - f, this.f.top - f, this.f.right + f, this.f.bottom + f);
        rectF.set(this.f);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        cfd.a();
    }

    @Override // defpackage.chf
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.cih
    public final void e(cig cigVar, int i, List list, cig cigVar2) {
        cln.h(cigVar, i, list, cigVar2, this);
    }

    @Override // defpackage.cgo
    public final void f(List list, List list2) {
        cgm cgmVar = null;
        che cheVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            cgo cgoVar = (cgo) list.get(size);
            if (cgoVar instanceof che) {
                che cheVar2 = (che) cgoVar;
                if (cheVar2.e == 2) {
                    cheVar = cheVar2;
                }
            }
        }
        if (cheVar != null) {
            cheVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            cgo cgoVar2 = (cgo) list2.get(size2);
            if (cgoVar2 instanceof che) {
                che cheVar3 = (che) cgoVar2;
                if (cheVar3.e == 2) {
                    if (cgmVar != null) {
                        this.h.add(cgmVar);
                    }
                    cgm cgmVar2 = new cgm(cheVar3);
                    cheVar3.a(this);
                    cgmVar = cgmVar2;
                }
            }
            if (cgoVar2 instanceof cgy) {
                if (cgmVar == null) {
                    cgmVar = new cgm(cheVar);
                }
                cgmVar.a.add((cgy) cgoVar2);
            }
        }
        if (cgmVar != null) {
            this.h.add(cgmVar);
        }
    }
}
