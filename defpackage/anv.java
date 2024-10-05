package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anv {
    public final Map a = new HashMap();
    final Map b;

    public anv(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            aod aodVar = (aod) entry.getValue();
            List list = (List) this.a.get(aodVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(aodVar, list);
            }
            list.add((anw) entry.getKey());
        }
    }

    public static void a(List list, aok aokVar, aod aodVar, Object obj) {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            anw anwVar = (anw) list.get(size);
            try {
                int i = anwVar.a;
                if (i == 0) {
                    anwVar.b.invoke(obj, new Object[0]);
                } else if (i != 1) {
                    anwVar.b.invoke(obj, aokVar, aodVar);
                } else {
                    anwVar.b.invoke(obj, aokVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }
}
