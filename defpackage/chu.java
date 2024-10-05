package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chu extends chp {
    private final clv e;

    public chu(List list) {
        super(list);
        this.e = new clv();
    }

    @Override // defpackage.chk
    public final /* synthetic */ Object f(clt cltVar, float f) {
        Object obj;
        Object obj2 = cltVar.b;
        if (obj2 == null || (obj = cltVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        clv clvVar = (clv) obj2;
        clv clvVar2 = (clv) obj;
        clu cluVar = this.d;
        if (cluVar != null) {
            float f2 = cltVar.g;
            cltVar.h.floatValue();
            c();
            clv clvVar3 = (clv) cluVar.a();
            if (clvVar3 != null) {
                return clvVar3;
            }
        }
        clv clvVar4 = this.e;
        float c = cln.c(clvVar.a, clvVar2.a, f);
        float f3 = clvVar.b;
        float f4 = clvVar2.b;
        clvVar4.a = c;
        clvVar4.b = cln.c(f3, f4, f);
        return this.e;
    }
}
