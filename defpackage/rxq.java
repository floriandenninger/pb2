package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxq implements rxu {
    private final /* synthetic */ int a;

    public rxq(int i) {
        this.a = i;
    }

    @Override // defpackage.rxu
    public final List a(List list) {
        boolean z;
        if (this.a == 0) {
            ArrayList z2 = rwh.z(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                z2.add(it.next().toString());
            }
            return z2;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = true;
                break;
            }
            double doubleValue = ((Number) it2.next()).doubleValue();
            if (Math.floor(doubleValue) != doubleValue) {
                z = false;
                break;
            }
        }
        ArrayList z3 = rwh.z(list.size());
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            z3.add(rxv.a((Number) it3.next(), z));
        }
        if (list.size() > 1 && ((Number) list.get(0)).doubleValue() == 0.0d) {
            z3.set(0, "");
        }
        return z3;
    }
}
