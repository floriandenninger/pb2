package defpackage;

import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class antk implements anti {
    public static volatile anti a;
    final rcc b;

    public antk(rcc rccVar) {
        qip.an(rccVar);
        this.b = rccVar;
        new ConcurrentHashMap();
    }

    @Override // defpackage.anti
    public final void a(String str, Bundle bundle) {
        if (!antl.b() || antl.a.contains(str)) {
            return;
        }
        Iterator it = antl.b.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return;
            }
        }
        if (antl.a(str, bundle)) {
            this.b.a.b("fcm", str, bundle);
        }
    }

    @Override // defpackage.anti
    public final void b(Object obj) {
        if (antl.b()) {
            rdq rdqVar = this.b.a;
            rdqVar.c(new rdg(rdqVar, obj));
        }
    }
}
