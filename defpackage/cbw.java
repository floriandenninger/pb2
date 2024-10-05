package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbw implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ cbx b;

    public cbw(cbx cbxVar, List list) {
        this.b = cbxVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cbf) it.next()).a(this.b.d);
        }
    }
}
