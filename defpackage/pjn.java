package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pjn extends pjm {
    public pjn(List list) {
        super(list);
    }

    @Override // defpackage.pjm
    protected final pjq b(pjq pjqVar) {
        long[] jArr;
        long[] jArr2;
        if (pjqVar == null || pjqVar.b != 1 || (jArr = pjqVar.h) == null || jArr.length != 1 || jArr[0] <= 0 || (jArr2 = pjqVar.i) == null || jArr2.length != 1 || jArr2[0] < 0) {
            return pjqVar;
        }
        return new pjq(pjqVar.a, pjqVar.b, pjqVar.c, pjqVar.d, pjqVar.e, pjqVar.f.d((int) pts.s(jArr2[0], pjqVar.f.B, pjqVar.c), (int) (1024 - (pts.s(pjqVar.i[0] + pjqVar.h[0], pjqVar.f.B, pjqVar.c) % 1024))), pjqVar.g, pjqVar.k, pjqVar.j, pjqVar.h, pjqVar.i);
    }
}
