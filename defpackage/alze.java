package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alze implements anhh {
    final /* synthetic */ alzf a;

    public alze(alzf alzfVar) {
        this.a = alzfVar;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
        Iterator it = ((Set) this.a.d.get()).iterator();
        while (it.hasNext()) {
            amdi amdiVar = ((alzm) it.next()).a;
            anhy O = anaf.O(null);
            amdiVar.a(O);
            amba.b(O, "AvailableAccountsInvalidatedObserver failed", new Object[0]);
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
    }
}
