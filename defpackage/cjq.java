package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjq extends cjp {
    private chk h;
    private final List i;
    private final RectF j;
    private final RectF k;

    public cjq(cfz cfzVar, cjs cjsVar, List list, cfj cfjVar) {
        super(cfzVar, cjsVar);
        cjp cjpVar;
        cjp cjqVar;
        String str;
        this.i = new ArrayList();
        this.j = new RectF();
        this.k = new RectF();
        new Paint();
        cil cilVar = cjsVar.r;
        if (cilVar != null) {
            chk a = cilVar.a();
            this.h = a;
            h(a);
            this.h.g(this);
        } else {
            this.h = null;
        }
        aee aeeVar = new aee(cfjVar.f.size());
        int size = list.size() - 1;
        cjp cjpVar2 = null;
        while (true) {
            if (size >= 0) {
                cjs cjsVar2 = (cjs) list.get(size);
                int i = cjsVar2.u;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    cjqVar = new cjq(cfzVar, cjsVar2, (List) cfjVar.a.get(cjsVar2.f), cfjVar);
                } else if (i2 == 1) {
                    cjqVar = new cjv(cfzVar, cjsVar2);
                } else if (i2 == 2) {
                    cjqVar = new cjr(cfzVar, cjsVar2);
                } else if (i2 == 3) {
                    cjqVar = new cjt(cfzVar, cjsVar2);
                } else if (i2 == 4) {
                    cjqVar = new cju(cfzVar, cjsVar2);
                } else if (i2 != 5) {
                    switch (i) {
                        case 1:
                            str = "PRE_COMP";
                            break;
                        case 2:
                            str = "SOLID";
                            break;
                        case 3:
                            str = "IMAGE";
                            break;
                        case 4:
                            str = "NULL";
                            break;
                        case 5:
                            str = "SHAPE";
                            break;
                        case 6:
                            str = "TEXT";
                            break;
                        default:
                            str = "UNKNOWN";
                            break;
                    }
                    StringBuilder sb = new StringBuilder(str.length() + 19);
                    sb.append("Unknown layer type ");
                    sb.append(str);
                    cll.a(sb.toString());
                    cjqVar = null;
                } else {
                    cjqVar = new cjx(cfzVar, cjsVar2);
                }
                if (cjqVar != null) {
                    aeeVar.k(cjqVar.c.d, cjqVar);
                    if (cjpVar2 != null) {
                        cjpVar2.e = cjqVar;
                        cjpVar2 = null;
                    } else {
                        this.i.add(0, cjqVar);
                        int i3 = cjsVar2.v;
                        int i4 = i3 - 1;
                        if (i3 == 0) {
                            throw null;
                        }
                        if (i4 == 1 || i4 == 2) {
                            cjpVar2 = cjqVar;
                        }
                    }
                }
                size--;
            } else {
                for (int i5 = 0; i5 < aeeVar.c(); i5++) {
                    cjp cjpVar3 = (cjp) aeeVar.f(aeeVar.d(i5));
                    if (cjpVar3 != null && (cjpVar = (cjp) aeeVar.f(cjpVar3.c.e)) != null) {
                        cjpVar3.f = cjpVar;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.cjp, defpackage.cih
    public final void a(Object obj, clu cluVar) {
        super.a(obj, cluVar);
        if (obj == cge.C) {
            chz chzVar = new chz(cluVar);
            this.h = chzVar;
            chzVar.g(this);
            h(this.h);
        }
    }

    @Override // defpackage.cjp, defpackage.cgq
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        int size = this.i.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((cjp) this.i.get(size)).c(this.j, this.a, true);
            rectF.union(this.j);
        }
    }

    @Override // defpackage.cjp
    public final void i(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.k;
        cjs cjsVar = this.c;
        rectF.set(0.0f, 0.0f, cjsVar.n, cjsVar.o);
        matrix.mapRect(this.k);
        canvas.save();
        int size = this.i.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (this.k.isEmpty() || canvas.clipRect(this.k)) {
                    ((cjp) this.i.get(size)).b(canvas, matrix, i);
                }
            } else {
                canvas.restore();
                cfd.a();
                return;
            }
        }
    }

    @Override // defpackage.cjp
    public final void k(cig cigVar, int i, List list, cig cigVar2) {
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            ((cjp) this.i.get(i2)).e(cigVar, i, list, cigVar2);
        }
    }

    @Override // defpackage.cjp
    public final void l(float f) {
        super.l(f);
        if (this.h != null) {
            f = ((((Float) this.h.e()).floatValue() * this.c.b.j) - this.c.b.h) / (this.b.a.b() + 0.01f);
        }
        if (this.h == null) {
            cjs cjsVar = this.c;
            f -= cjsVar.m / cjsVar.b.b();
        }
        cjs cjsVar2 = this.c;
        if (cjsVar2.l != 0.0f && !"__container".equals(cjsVar2.c)) {
            f /= this.c.l;
        }
        int size = this.i.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((cjp) this.i.get(size)).l(f);
            }
        }
    }
}
