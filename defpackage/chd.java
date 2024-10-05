package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chd extends cgn {
    private final cjp c;
    private final String d;
    private final boolean e;
    private final chk f;
    private chk g;

    public chd(cfz cfzVar, cjp cjpVar, cjm cjmVar) {
        super(cfzVar, cjpVar, abp.f(cjmVar.i), abp.d(cjmVar.j), cjmVar.g, cjmVar.e, cjmVar.f, cjmVar.c, cjmVar.b);
        this.c = cjpVar;
        this.d = cjmVar.a;
        this.e = cjmVar.h;
        chk a = cjmVar.d.a();
        this.f = a;
        a.g(this);
        cjpVar.h(a);
    }

    @Override // defpackage.cgn, defpackage.cih
    public final void a(Object obj, clu cluVar) {
        super.a(obj, cluVar);
        if (obj == cge.b) {
            this.f.d = cluVar;
            return;
        }
        if (obj == cge.E) {
            chk chkVar = this.g;
            if (chkVar != null) {
                this.c.j(chkVar);
            }
            chz chzVar = new chz(cluVar);
            this.g = chzVar;
            chzVar.g(this);
            this.c.h(this.f);
        }
    }

    @Override // defpackage.cgn, defpackage.cgq
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        this.b.setColor(((chl) this.f).k());
        chk chkVar = this.g;
        if (chkVar != null) {
            this.b.setColorFilter((ColorFilter) chkVar.e());
        }
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.cgo
    public final String g() {
        return this.d;
    }
}
