package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aapv implements Runnable {
    final /* synthetic */ aooy a;
    final /* synthetic */ aapw b;

    public aapv(aapw aapwVar, aooy aooyVar) {
        this.b = aapwVar;
        this.a = aooyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set = (Set) this.b.c.get();
        if (set == null || set.isEmpty()) {
            return;
        }
        for (Object obj : this.b.b.a(this.a)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((aapu) it.next()).a(obj);
            }
        }
    }
}
