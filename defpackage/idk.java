package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class idk extends vq {
    @Override // defpackage.vq, defpackage.wg
    public final int[] c(wd wdVar, View view) {
        if (wdVar.ae()) {
            return super.c(wdVar, view);
        }
        int[] iArr = new int[2];
        iArr[1] = 0;
        if (wdVar.ad()) {
            vo p = vo.p(wdVar);
            iArr[0] = p.d(view) - p.j();
        } else {
            iArr[0] = 0;
        }
        return iArr;
    }
}
