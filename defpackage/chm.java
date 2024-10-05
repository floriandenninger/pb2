package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chm extends chp {
    public chm(List list) {
        super(list);
    }

    @Override // defpackage.chk
    public final /* bridge */ /* synthetic */ Object f(clt cltVar, float f) {
        return Float.valueOf(l(cltVar, f));
    }

    public final float k() {
        return l(d(), b());
    }

    final float l(clt cltVar, float f) {
        if (cltVar.b == null || cltVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        clu cluVar = this.d;
        if (cluVar != null) {
            float f2 = cltVar.g;
            cltVar.h.floatValue();
            c();
            Float f3 = (Float) cluVar.a();
            if (f3 != null) {
                return f3.floatValue();
            }
        }
        float f4 = cltVar.i;
        if (f4 == -3987645.8f) {
            f4 = ((Float) cltVar.b).floatValue();
            cltVar.i = f4;
        }
        float f5 = cltVar.j;
        if (f5 == -3987645.8f) {
            f5 = ((Float) cltVar.c).floatValue();
            cltVar.j = f5;
        }
        return cln.c(f4, f5, f);
    }
}
