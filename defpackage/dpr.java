package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dpr {
    public final Map a = new HashMap();
    public final Map b = new HashMap();

    public static void b(String str, dlp dlpVar, Map map) {
        List list = (List) map.get(str);
        if (list == null) {
            list = new ArrayList();
            map.put(str, list);
        }
        list.add(dlpVar);
    }

    public static void c(Map map, Map map2, String str) {
        List list = (List) map2.get(str);
        List list2 = (List) map.remove(str);
        if (list != null && list2 != null) {
            list2.removeAll(list);
        }
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        map.put(str, list2);
    }

    public final dpr a() {
        dpr a = dpv.a();
        if (this.a.isEmpty()) {
            return a;
        }
        for (String str : this.a.keySet()) {
            a.a.put(str, new ArrayList((Collection) this.a.get(str)));
        }
        for (String str2 : this.b.keySet()) {
            a.b.put(str2, new ArrayList((Collection) this.b.get(str2)));
        }
        return a;
    }
}
