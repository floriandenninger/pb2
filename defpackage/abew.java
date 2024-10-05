package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abew implements abex {
    @Override // defpackage.abex
    public final Map a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.put(((abez) it.next()).c(), anaf.M());
        }
        return hashMap;
    }
}
