package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class upc {
    public abstract aooy a(String str, Object obj);

    public abstract aooy b(aooy aooyVar, aooy aooyVar2);

    public abstract String c(aooy aooyVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List d(Map map) {
        aooy a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (a = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List e(List list, List list2) {
        aooy aooyVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aooy aooyVar2 = (aooy) it.next();
            String c = c(aooyVar2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    aooyVar = null;
                    break;
                }
                aooyVar = (aooy) it2.next();
                if (c.equals(c(aooyVar))) {
                    break;
                }
            }
            aooy b = b(aooyVar2, aooyVar);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}
