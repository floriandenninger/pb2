package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cjp implements cgq, chf, cih {
    final Matrix a;
    final cfz b;
    final cjs c;
    public chm d;
    public cjp e;
    public cjp f;
    final chy g;
    private final Path h = new Path();
    private final Matrix i = new Matrix();
    private final Paint j = new cgl(1);
    private final Paint k = new cgl(PorterDuff.Mode.DST_IN, null);
    private final Paint l = new cgl(PorterDuff.Mode.DST_OUT, null);
    private final Paint m;
    private final Paint n;
    private final RectF o;
    private final RectF p;
    private final RectF q;
    private final RectF r;
    private chq s;
    private List t;
    private final List u;
    private boolean v;

    public cjp(cfz cfzVar, cjs cjsVar) {
        cgl cglVar = new cgl(1);
        this.m = cglVar;
        this.n = new cgl(PorterDuff.Mode.CLEAR);
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new RectF();
        this.a = new Matrix();
        this.u = new ArrayList();
        this.v = true;
        this.b = cfzVar;
        this.c = cjsVar;
        String.valueOf(cjsVar.c).concat("#draw");
        if (cjsVar.v == 3) {
            cglVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            cglVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        chy b = cjsVar.h.b();
        this.g = b;
        b.d(this);
        List list = cjsVar.g;
        if (list != null && !list.isEmpty()) {
            chq chqVar = new chq(cjsVar.g);
            this.s = chqVar;
            Iterator it = chqVar.a.iterator();
            while (it.hasNext()) {
                ((chk) it.next()).g(this);
            }
            for (chk chkVar : this.s.b) {
                h(chkVar);
                chkVar.g(this);
            }
        }
        if (!this.c.s.isEmpty()) {
            chm chmVar = new chm(this.c.s);
            this.d = chmVar;
            chmVar.b = true;
            chmVar.g(new cjo(this));
            m(((Float) this.d.e()).floatValue() == 1.0f);
            h(this.d);
            return;
        }
        m(true);
    }

    private final void p() {
        if (this.t != null) {
            return;
        }
        if (this.f == null) {
            this.t = Collections.emptyList();
            return;
        }
        this.t = new ArrayList();
        for (cjp cjpVar = this.f; cjpVar != null; cjpVar = cjpVar.f) {
            this.t.add(cjpVar);
        }
    }

    private final void q(Canvas canvas) {
        canvas.drawRect(this.o.left - 1.0f, this.o.top - 1.0f, this.o.right + 1.0f, this.o.bottom + 1.0f, this.n);
        cfd.a();
    }

    private final void r() {
        this.b.invalidateSelf();
    }

    private final void s() {
        abn abnVar = this.b.a.m;
        String str = this.c.c;
    }

    @Override // defpackage.cih
    public void a(Object obj, clu cluVar) {
        this.g.e(obj, cluVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012d  */
    @Override // defpackage.cgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjp.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.cgq
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        p();
        this.a.set(matrix);
        if (z) {
            List list = this.t;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        this.a.preConcat(((cjp) this.t.get(size)).g.a());
                    }
                }
            } else {
                cjp cjpVar = this.f;
                if (cjpVar != null) {
                    this.a.preConcat(cjpVar.g.a());
                }
            }
        }
        this.a.preConcat(this.g.a());
    }

    @Override // defpackage.chf
    public final void d() {
        r();
    }

    @Override // defpackage.cih
    public final void e(cig cigVar, int i, List list, cig cigVar2) {
        cjp cjpVar = this.e;
        if (cjpVar != null) {
            cig b = cigVar2.b(cjpVar.g());
            if (cigVar.d(this.e.g(), i)) {
                list.add(b.c(this.e));
            }
            if (cigVar.f(g(), i)) {
                this.e.k(cigVar, cigVar.a(this.e.g(), i) + i, list, b);
            }
        }
        if (cigVar.e(g(), i)) {
            if (!"__container".equals(g())) {
                cigVar2 = cigVar2.b(g());
                if (cigVar.d(g(), i)) {
                    list.add(cigVar2.c(this));
                }
            }
            if (cigVar.f(g(), i)) {
                k(cigVar, i + cigVar.a(g(), i), list, cigVar2);
            }
        }
    }

    @Override // defpackage.cgo
    public final void f(List list, List list2) {
    }

    @Override // defpackage.cgo
    public final String g() {
        return this.c.c;
    }

    public final void h(chk chkVar) {
        if (chkVar == null) {
            return;
        }
        this.u.add(chkVar);
    }

    public abstract void i(Canvas canvas, Matrix matrix, int i);

    public final void j(chk chkVar) {
        this.u.remove(chkVar);
    }

    public void k(cig cigVar, int i, List list, cig cigVar2) {
    }

    public void l(float f) {
        chy chyVar = this.g;
        chk chkVar = chyVar.e;
        if (chkVar != null) {
            chkVar.i(f);
        }
        chk chkVar2 = chyVar.h;
        if (chkVar2 != null) {
            chkVar2.i(f);
        }
        chk chkVar3 = chyVar.i;
        if (chkVar3 != null) {
            chkVar3.i(f);
        }
        chk chkVar4 = chyVar.a;
        if (chkVar4 != null) {
            chkVar4.i(f);
        }
        chk chkVar5 = chyVar.b;
        if (chkVar5 != null) {
            chkVar5.i(f);
        }
        chk chkVar6 = chyVar.c;
        if (chkVar6 != null) {
            chkVar6.i(f);
        }
        chk chkVar7 = chyVar.d;
        if (chkVar7 != null) {
            chkVar7.i(f);
        }
        chm chmVar = chyVar.f;
        if (chmVar != null) {
            chmVar.i(f);
        }
        chm chmVar2 = chyVar.g;
        if (chmVar2 != null) {
            chmVar2.i(f);
        }
        if (this.s != null) {
            for (int i = 0; i < this.s.a.size(); i++) {
                ((chk) this.s.a.get(i)).i(f);
            }
        }
        chm chmVar3 = this.d;
        if (chmVar3 != null) {
            chmVar3.i(f);
        }
        cjp cjpVar = this.e;
        if (cjpVar != null) {
            cjpVar.l(f);
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            ((chk) this.u.get(i2)).i(f);
        }
    }

    public final void m(boolean z) {
        if (z != this.v) {
            this.v = z;
            r();
        }
    }

    final boolean n() {
        chq chqVar = this.s;
        return (chqVar == null || chqVar.a.isEmpty()) ? false : true;
    }

    final boolean o() {
        return this.e != null;
    }
}
