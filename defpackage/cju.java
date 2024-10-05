package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cju extends cjp {
    private final cgp h;

    public cju(cfz cfzVar, cjs cjsVar) {
        super(cfzVar, cjsVar);
        cgp cgpVar = new cgp(cfzVar, this, new cjk("__container", cjsVar.a, false));
        this.h = cgpVar;
        cgpVar.f(Collections.emptyList(), Collections.emptyList());
    }

    @Override // defpackage.cjp, defpackage.cgq
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.h.c(rectF, this.a, z);
    }

    @Override // defpackage.cjp
    public final void i(Canvas canvas, Matrix matrix, int i) {
        this.h.b(canvas, matrix, i);
    }

    @Override // defpackage.cjp
    public final void k(cig cigVar, int i, List list, cig cigVar2) {
        this.h.e(cigVar, i, list, cigVar2);
    }
}
