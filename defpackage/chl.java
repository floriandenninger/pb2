package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chl extends chp {
    public chl(List list) {
        super(list);
    }

    @Override // defpackage.chk
    public final /* bridge */ /* synthetic */ Object f(clt cltVar, float f) {
        return Integer.valueOf(l(cltVar, f));
    }

    public final int k() {
        return l(d(), b());
    }

    public final int l(clt cltVar, float f) {
        Object obj = cltVar.b;
        if (obj == null || cltVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) cltVar.c).intValue();
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
        return abu.b(cln.b(f, 0.0f, 1.0f), intValue, intValue2);
    }
}
