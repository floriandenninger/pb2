package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class teo implements tej {
    final /* synthetic */ tdu a;
    final /* synthetic */ Set b;
    private final /* synthetic */ int c;

    public teo(tdu tduVar, Set set, int i) {
        this.c = i;
        this.a = tduVar;
        this.b = set;
    }

    @Override // defpackage.tej
    public final String a(Map map) {
        amru O;
        if (this.c == 0) {
            Iterable P = rwh.P(map.get(this.a));
            if (P == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = P.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((Number) it.next()).intValue();
                arrayList.add(Integer.valueOf(i));
            }
            O = rwh.O(arrayList, this.b, true);
            return TextUtils.join(",", O);
        }
        Iterable P2 = rwh.P(map.get(this.a));
        if (P2 == null) {
            return null;
        }
        Set set = this.b;
        if (set != null) {
            P2 = rwh.O(P2, set, true);
        }
        return TextUtils.join(",", P2);
    }
}
