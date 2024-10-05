package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgs implements cgq, chf, cgw {
    private final Path a;
    private final Paint b;
    private final cjp c;
    private final String d;
    private final boolean e;
    private final List f;
    private final chk g;
    private final chk h;
    private chk i;
    private final cfz j;

    public cgs(cfz cfzVar, cjp cjpVar, cjj cjjVar) {
        Path path = new Path();
        this.a = path;
        this.b = new cgl(1);
        this.f = new ArrayList();
        this.c = cjpVar;
        this.d = cjjVar.b;
        this.e = cjjVar.e;
        this.j = cfzVar;
        if (cjjVar.c == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(cjjVar.a);
        chk a = cjjVar.c.a();
        this.g = a;
        a.g(this);
        cjpVar.h(a);
        chk a2 = cjjVar.d.a();
        this.h = a2;
        a2.g(this);
        cjpVar.h(a2);
    }

    @Override // defpackage.cih
    public final void a(Object obj, clu cluVar) {
        if (obj == cge.a) {
            this.g.d = cluVar;
            return;
        }
        if (obj == cge.d) {
            this.h.d = cluVar;
            return;
        }
        if (obj == cge.E) {
            chk chkVar = this.i;
            if (chkVar != null) {
                this.c.j(chkVar);
            }
            chz chzVar = new chz(cluVar);
            this.i = chzVar;
            chzVar.g(this);
            this.c.h(this.i);
        }
    }

    @Override // defpackage.cgq
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        this.b.setColor(((chl) this.g).k());
        this.b.setAlpha(cln.k((int) ((((i / 255.0f) * ((Integer) this.h.e()).intValue()) / 100.0f) * 255.0f)));
        chk chkVar = this.i;
        if (chkVar != null) {
            this.b.setColorFilter((ColorFilter) chkVar.e());
        }
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.a.addPath(((cgy) this.f.get(i2)).i(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        cfd.a();
    }

    @Override // defpackage.cgq
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); i++) {
            this.a.addPath(((cgy) this.f.get(i)).i(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.chf
    public final void d() {
        this.j.invalidateSelf();
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
                this.f.add((cgy) cgoVar);
            }
        }
    }

    @Override // defpackage.cgo
    public final String g() {
        return this.d;
    }
}
