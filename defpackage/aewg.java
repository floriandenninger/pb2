package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aewg extends bkt {
    public aewg(List list) {
        super(list, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bkt
    public final pjq a(pjq pjqVar) {
        long[] jArr;
        long[] jArr2;
        if (pjqVar == null || pjqVar.b != 1 || (jArr = pjqVar.h) == null || jArr.length != 1 || jArr[0] <= 0 || (jArr2 = pjqVar.i) == null || jArr2.length != 1 || jArr2[0] < 0) {
            return pjqVar;
        }
        afki.a(jArr2);
        afki.a(pjqVar.h);
        return new pjq(pjqVar.a, pjqVar.b, pjqVar.c, pjqVar.d, pjqVar.e, pjqVar.f.d((int) pts.s(pjqVar.i[0], pjqVar.f.B, pjqVar.c), (int) (1024 - (pts.s(pjqVar.i[0] + pjqVar.h[0], pjqVar.f.B, pjqVar.c) % 1024))), pjqVar.g, pjqVar.k, pjqVar.j, pjqVar.h, pjqVar.i, null);
    }
}
