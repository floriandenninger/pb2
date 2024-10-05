package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crb {
    private static final cqx a = new cqz();
    private final Map b = new HashMap();

    public final synchronized cqy a(Object obj) {
        cqx cqxVar;
        did.ap(obj);
        cqxVar = (cqx) this.b.get(obj.getClass());
        if (cqxVar == null) {
            Iterator it = this.b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cqx cqxVar2 = (cqx) it.next();
                if (cqxVar2.b().isAssignableFrom(obj.getClass())) {
                    cqxVar = cqxVar2;
                    break;
                }
            }
        }
        if (cqxVar == null) {
            cqxVar = a;
        }
        return cqxVar.a(obj);
    }

    public final synchronized void b(cqx cqxVar) {
        this.b.put(cqxVar.b(), cqxVar);
    }
}
