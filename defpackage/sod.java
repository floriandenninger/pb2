package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sod implements swt {
    public final Map a = DesugarCollections.synchronizedMap(new HashMap());
    private final amru b;

    public sod(amru amruVar) {
        this.b = amruVar;
    }

    @Override // defpackage.swt
    public final sws a(sws swsVar) {
        amru amruVar = this.b;
        int i = ((amvj) amruVar).c;
        sws swsVar2 = swsVar;
        for (int i2 = 0; i2 < i; i2++) {
            swsVar2 = ((swt) amruVar.get(i2)).a(swsVar);
        }
        synchronized (this.a) {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                swsVar2 = ((swt) it.next()).a(swsVar);
            }
        }
        return swsVar2;
    }

    public final void b(Object obj, swt swtVar) {
        this.a.put(obj, swtVar);
    }
}
