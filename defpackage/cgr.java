package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgr implements cgy, chf, cgw {
    private final String b;
    private final cfz c;
    private final chk d;
    private final chk e;
    private final ciy f;
    private boolean g;
    private final Path a = new Path();
    private final vak h = new vak((byte[]) null, (char[]) null, (byte[]) null);

    public cgr(cfz cfzVar, cjp cjpVar, ciy ciyVar) {
        this.b = ciyVar.a;
        this.c = cfzVar;
        chk a = ciyVar.c.a();
        this.d = a;
        chk a2 = ciyVar.b.a();
        this.e = a2;
        this.f = ciyVar;
        cjpVar.h(a);
        cjpVar.h(a2);
        a.g(this);
        a2.g(this);
    }

    @Override // defpackage.cih
    public final void a(Object obj, clu cluVar) {
        chk chkVar;
        if (obj == cge.i) {
            chkVar = this.d;
        } else if (obj != cge.l) {
            return;
        } else {
            chkVar = this.e;
        }
        chkVar.d = cluVar;
    }

    @Override // defpackage.chf
    public final void d() {
        this.g = false;
        this.c.invalidateSelf();
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
                    this.h.q(cheVar);
                    cheVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.cgo
    public final String g() {
        return this.b;
    }

    @Override // defpackage.cgy
    public final Path i() {
        if (this.g) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e) {
            this.g = true;
            return this.a;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.a.reset();
        if (this.f.d) {
            float f5 = -f2;
            this.a.moveTo(0.0f, f5);
            float f6 = -f3;
            float f7 = -f;
            float f8 = -f4;
            this.a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = -f4;
            this.a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = -f3;
            float f16 = -f;
            this.a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        this.a.offset(pointF2.x, pointF2.y);
        this.a.close();
        this.h.r(this.a);
        this.g = true;
        return this.a;
    }
}
