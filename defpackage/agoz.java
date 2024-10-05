package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agoz {
    private final Map a;
    private final shf b;

    public agoz(Map map, shf shfVar) {
        this.a = map;
        this.b = shfVar;
    }

    private final agov b(atpq atpqVar, agov agovVar) {
        int a = aalt.a(atpqVar.d);
        if (!this.a.containsKey(Integer.valueOf(a))) {
            StringBuilder sb = new StringBuilder(63);
            sb.append("Couldn't find registered controller for entityType: ");
            sb.append(a);
            throw new agpe(sb.toString());
        }
        String q = yjk.q();
        return new agov(q, atpqVar, a, this.b.f(), agovVar != null ? agovVar.g : q, agovVar != null ? agovVar.a : null);
    }

    private final List c(agov agovVar, String str, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atpq atpqVar = (atpq) it.next();
            try {
                agov b = b(atpqVar, agovVar);
                b.h = str;
                arrayList.add(b);
                if (!atpqVar.f.isEmpty()) {
                    arrayList2.add(b);
                }
            } catch (agpe e) {
                String valueOf = String.valueOf(e.getMessage());
                zga.b(valueOf.length() != 0 ? "[Offline] One of the chained actions couldn't be created: ".concat(valueOf) : new String("[Offline] One of the chained actions couldn't be created: "));
            }
        }
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            agov agovVar2 = (agov) arrayList2.get(i);
            arrayList.addAll(c(agovVar, agovVar2.a, agovVar2.c.f));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List a(atpq atpqVar, agov agovVar) {
        ArrayList arrayList = new ArrayList();
        agov b = b(atpqVar, agovVar);
        arrayList.add(b);
        if (!atpqVar.f.isEmpty()) {
            arrayList.addAll(c(agovVar, b.a, atpqVar.f));
        }
        return arrayList;
    }
}
