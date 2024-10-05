package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gpg {
    private final Set a;
    private final aahd b;

    public gpg(aahd aahdVar, Set set) {
        this.a = set;
        this.b = aahdVar;
    }

    public final void a(apxf apxfVar, Map map) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("triggered_on_ui_ready", true);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((gpf) it.next()).g(apxfVar, hashMap)) {
                return;
            }
        }
        this.b.c(apxfVar, hashMap);
    }
}
