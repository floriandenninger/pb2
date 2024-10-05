package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cho extends chp {
    public cho(List list) {
        super(list);
    }

    @Override // defpackage.chk
    public final /* bridge */ /* synthetic */ Object f(clt cltVar, float f) {
        return Integer.valueOf(k(cltVar, f));
    }

    public final int k(clt cltVar, float f) {
        if (cltVar.b == null || cltVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        clu cluVar = this.d;
        if (cluVar != null) {
            float f2 = cltVar.g;
            cltVar.h.floatValue();
            c();
            Integer num = (Integer) cluVar.a();
            if (num != null) {
                return num.intValue();
            }
        }
        int i = cltVar.k;
        if (i == 784923401) {
            i = ((Integer) cltVar.b).intValue();
            cltVar.k = i;
        }
        int i2 = cltVar.l;
        if (i2 == 784923401) {
            i2 = ((Integer) cltVar.c).intValue();
            cltVar.l = i2;
        }
        return cln.e(i, i2, f);
    }
}
