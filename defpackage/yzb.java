package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yzb implements Runnable {
    final /* synthetic */ yzc a;

    public yzb(yzc yzcVar) {
        this.a = yzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yzc yzcVar = this.a;
        yjk.e();
        ArrayList arrayList = new ArrayList();
        for (yza yzaVar : yzcVar.c.values()) {
            Iterator it = yzaVar.a().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((yze) yzcVar.b.get((String) it.next())).c()) {
                        break;
                    }
                } else {
                    arrayList.add(yzaVar);
                    break;
                }
            }
        }
        Collections.sort(arrayList, yzc.a);
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
