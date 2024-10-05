package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crv {
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile crt d;
    public csr e;
    private final boolean f;

    public crv(boolean z) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new cus(1));
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        this.f = z;
        newSingleThreadExecutor.execute(new crs(this));
    }

    public final synchronized csx a(cqi cqiVar) {
        cru cruVar = (cru) this.a.get(cqiVar);
        if (cruVar == null) {
            return null;
        }
        csx csxVar = (csx) cruVar.get();
        if (csxVar == null) {
            c(cruVar);
        }
        return csxVar;
    }

    public final synchronized void b(cqi cqiVar, csx csxVar) {
        cru cruVar = (cru) this.a.put(cqiVar, new cru(cqiVar, csxVar, this.b, this.f));
        if (cruVar != null) {
            cruVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(cru cruVar) {
        synchronized (this) {
            this.a.remove(cruVar.a);
            if (cruVar.b && cruVar.c != null) {
                this.e.c(cruVar.a, new csx(cruVar.c, true, false, cruVar.a, this.e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(cqi cqiVar) {
        cru cruVar = (cru) this.a.remove(cqiVar);
        if (cruVar != null) {
            cruVar.a();
        }
    }
}
