package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ansz implements qoz {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.qoz
    public final void a(boolean z) {
        synchronized (antc.a) {
            Iterator it = new ArrayList(antc.b.values()).iterator();
            while (it.hasNext()) {
                antc antcVar = (antc) it.next();
                if (antcVar.d.get()) {
                    Iterator it2 = antcVar.e.iterator();
                    while (it2.hasNext()) {
                        ((ansy) it2.next()).a();
                    }
                }
            }
        }
    }
}
