package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dmj {
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    public final Map c = new LinkedHashMap();
    public final Map d = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object a(dmi dmiVar) {
        return this.d.get(dmiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Collection b() {
        return this.d.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set c() {
        return this.d.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(dmi dmiVar) {
        if (this.d.remove(dmiVar) == null) {
            return;
        }
        int i = dmiVar.a;
        if (i == 1) {
            this.a.remove(dmiVar.b);
            return;
        }
        if (i != 2) {
            this.c.remove(dmiVar.b);
            return;
        }
        String str = dmiVar.c;
        Map map = (Map) this.b.get(str);
        map.remove(dmiVar.b);
        if (map.isEmpty()) {
            this.b.remove(str);
        }
    }
}
