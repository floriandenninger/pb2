package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amzj extends amzk {
    private final Map a;

    public amzj(amyt amytVar, amyt amytVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, amytVar);
        d(linkedHashMap, amytVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((amyc) entry.getKey()).b) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = Collections.unmodifiableMap(linkedHashMap);
    }

    private static void d(Map map, amyt amytVar) {
        for (int i = 0; i < amytVar.b(); i++) {
            amyc c = amytVar.c(i);
            Object obj = map.get(c);
            if (c.b) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    map.put(c, list);
                }
                list.add(c.d(amytVar.e(i)));
            } else {
                map.put(c, c.d(amytVar.e(i)));
            }
        }
    }

    @Override // defpackage.amzk
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.amzk
    public final Set b() {
        return this.a.keySet();
    }

    @Override // defpackage.amzk
    public final void c(amza amzaVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            amyc amycVar = (amyc) entry.getKey();
            Object value = entry.getValue();
            if (amycVar.b) {
                amzaVar.b(amycVar, ((List) value).iterator(), obj);
            } else {
                amzaVar.a(amycVar, value, obj);
            }
        }
    }
}
