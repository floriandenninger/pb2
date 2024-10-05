package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjx extends cjp {
    private chk A;
    private final StringBuilder h;
    private final RectF i;
    private final Matrix j;
    private final Paint k;
    private final Paint l;
    private final Map m;
    private final aee n;
    private final chx o;
    private final cfz p;
    private final cfj q;
    private chk r;
    private chk s;
    private chk t;
    private chk u;
    private chk v;
    private chk w;
    private chk x;
    private chk y;
    private chk z;

    public cjx(cfz cfzVar, cjs cjsVar) {
        super(cfzVar, cjsVar);
        cil cilVar;
        cil cilVar2;
        cik cikVar;
        cik cikVar2;
        this.h = new StringBuilder(2);
        this.i = new RectF();
        this.j = new Matrix();
        this.k = new cjw(null);
        this.l = new cjw();
        this.m = new HashMap();
        this.n = new aee();
        this.p = cfzVar;
        this.q = cjsVar.b;
        chx a = cjsVar.p.a();
        this.o = a;
        a.g(this);
        h(a);
        ciu ciuVar = cjsVar.q;
        if (ciuVar != null && (cikVar2 = ciuVar.a) != null) {
            chk a2 = cikVar2.a();
            this.r = a2;
            a2.g(this);
            h(this.r);
        }
        if (ciuVar != null && (cikVar = ciuVar.b) != null) {
            chk a3 = cikVar.a();
            this.t = a3;
            a3.g(this);
            h(this.t);
        }
        if (ciuVar != null && (cilVar2 = ciuVar.c) != null) {
            chk a4 = cilVar2.a();
            this.v = a4;
            a4.g(this);
            h(this.v);
        }
        if (ciuVar == null || (cilVar = ciuVar.d) == null) {
            return;
        }
        chk a5 = cilVar.a();
        this.x = a5;
        a5.g(this);
        h(this.x);
    }

    private static final void q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private static final void r(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private static final List s(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // defpackage.cjp, defpackage.cih
    public final void a(Object obj, clu cluVar) {
        super.a(obj, cluVar);
        if (obj == cge.a) {
            chk chkVar = this.s;
            if (chkVar != null) {
                j(chkVar);
            }
            chz chzVar = new chz(cluVar);
            this.s = chzVar;
            chzVar.g(this);
            h(this.s);
            return;
        }
        if (obj == cge.b) {
            chk chkVar2 = this.u;
            if (chkVar2 != null) {
                j(chkVar2);
            }
            chz chzVar2 = new chz(cluVar);
            this.u = chzVar2;
            chzVar2.g(this);
            h(this.u);
            return;
        }
        if (obj == cge.q) {
            chk chkVar3 = this.w;
            if (chkVar3 != null) {
                j(chkVar3);
            }
            chz chzVar3 = new chz(cluVar);
            this.w = chzVar3;
            chzVar3.g(this);
            h(this.w);
            return;
        }
        if (obj == cge.r) {
            chk chkVar4 = this.y;
            if (chkVar4 != null) {
                j(chkVar4);
            }
            chz chzVar4 = new chz(cluVar);
            this.y = chzVar4;
            chzVar4.g(this);
            h(this.y);
            return;
        }
        if (obj == cge.D) {
            chk chkVar5 = this.z;
            if (chkVar5 != null) {
                j(chkVar5);
            }
            chz chzVar5 = new chz(cluVar);
            this.z = chzVar5;
            chzVar5.g(this);
            h(this.z);
            return;
        }
        if (obj == cge.G) {
            chk chkVar6 = this.A;
            if (chkVar6 != null) {
                j(chkVar6);
            }
            chz chzVar6 = new chz(cluVar);
            this.A = chzVar6;
            chzVar6.g(this);
            h(this.A);
        }
    }

    @Override // defpackage.cjp, defpackage.cgq
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.q.g.width(), this.q.g.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03cd  */
    @Override // defpackage.cjp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjx.i(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    private static final void p(int i, Canvas canvas, float f) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            canvas.translate(-f, 0.0f);
        } else {
            if (i2 != 2) {
                return;
            }
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }
}
