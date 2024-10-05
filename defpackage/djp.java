package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class djp {
    final Map a = DesugarCollections.synchronizedMap(new HashMap());
    public final Map b = new HashMap();
    final Set c = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(dlr dlrVar) {
        this.c.add(dlrVar);
    }

    public final synchronized void b(dlr dlrVar) {
        this.c.remove(dlrVar);
        if (this.c.isEmpty()) {
            this.b.clear();
            this.a.clear();
        }
    }
}
