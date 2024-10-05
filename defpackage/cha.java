package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cha implements chf, cgw, cgy {
    private final String c;
    private final boolean d;
    private final cfz e;
    private final chk f;
    private final chk g;
    private final chk h;
    private boolean i;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final vak j = new vak((byte[]) null, (char[]) null, (byte[]) null);

    public cha(cfz cfzVar, cjp cjpVar, cjg cjgVar) {
        this.c = cjgVar.a;
        this.d = cjgVar.e;
        this.e = cfzVar;
        chk a = cjgVar.b.a();
        this.f = a;
        chk a2 = cjgVar.c.a();
        this.g = a2;
        chk a3 = cjgVar.d.a();
        this.h = a3;
        cjpVar.h(a);
        cjpVar.h(a2);
        cjpVar.h(a3);
        a.g(this);
        a2.g(this);
        a3.g(this);
    }

    @Override // defpackage.cih
    public final void a(Object obj, clu cluVar) {
        chk chkVar;
        if (obj == cge.j) {
            chkVar = this.g;
        } else if (obj == cge.l) {
            chkVar = this.f;
        } else if (obj != cge.k) {
            return;
        } else {
            chkVar = this.h;
        }
        chkVar.d = cluVar;
    }

    @Override // defpackage.chf
    public final void d() {
        this.i = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.cih
    public final void e(cig cigVar, int i, List list, cig cigVar2) {
        cln.h(cigVar, i, list, cigVar2, this);
    }

    @Override // defpackage.cgo
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            cgo cgoVar = (cgo) list.get(i);
            if (cgoVar instanceof che) {
                che cheVar = (che) cgoVar;
                if (cheVar.e == 1) {
                    this.j.q(cheVar);
                    cheVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.cgo
    public final String g() {
        return this.c;
    }

    @Override // defpackage.cgy
    public final Path i() {
        if (this.i) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.i = true;
            return this.a;
        }
        PointF pointF = (PointF) this.g.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float k = ((chm) this.h).k();
        float min = Math.min(f, f2);
        if (k > min) {
            k = min;
        }
        PointF pointF2 = (PointF) this.f.e();
        this.a.moveTo(pointF2.x + f, (pointF2.y - f2) + k);
        this.a.lineTo(pointF2.x + f, (pointF2.y + f2) - k);
        if (k > 0.0f) {
            float f3 = k + k;
            this.b.set((pointF2.x + f) - f3, (pointF2.y + f2) - f3, pointF2.x + f, pointF2.y + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x - f) + k, pointF2.y + f2);
        if (k > 0.0f) {
            float f4 = k + k;
            this.b.set(pointF2.x - f, (pointF2.y + f2) - f4, (pointF2.x - f) + f4, pointF2.y + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - f, (pointF2.y - f2) + k);
        if (k > 0.0f) {
            float f5 = k + k;
            this.b.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f5, (pointF2.y - f2) + f5);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x + f) - k, pointF2.y - f2);
        if (k > 0.0f) {
            float f6 = k + k;
            this.b.set((pointF2.x + f) - f6, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + f6);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.j.r(this.a);
        this.i = true;
        return this.a;
    }
}
