package defpackage;

import android.util.Pair;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nyk {
    public final aypn a;
    public final aypn b;

    public nyk(nxv... nxvVarArr) {
        amkq.N(true);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            final nxv nxvVar = nxvVarArr[i];
            arrayList.add(nxvVar.w().A(new ayrv() { // from class: nxs
                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    return Pair.create(nxv.this, (Boolean) obj);
                }
            }));
        }
        aypn h = aypn.B(arrayList).I(amlr.a, nxd.f).h(ntu.j);
        this.a = h.A(nxb.i).n().h(ntu.j);
        this.b = aypn.z(nxvVarArr[0]).j(h.s(niy.s).A(nxb.h)).n().h(ntu.j);
    }

    public nyk(zcq zcqVar, aypn aypnVar) {
        aypn i = zcqVar.a().i(aypg.BUFFER);
        this.a = i;
        this.b = aypn.e(i.A(nxb.p), aypnVar, nxd.i);
    }
}
