package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adnj implements ykl {
    final /* synthetic */ adnm a;

    public adnj(adnm adnmVar) {
        this.a = adnmVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        zga.f(adnm.a, "Error loading available screens", exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        List list = (List) obj2;
        CopyOnWriteArrayList copyOnWriteArrayList = this.a.c;
        if (copyOnWriteArrayList.size() == list.size()) {
            for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
                if (((adga) copyOnWriteArrayList.get(i)).equals(list.get(i))) {
                }
            }
            return;
        }
        synchronized (this.a) {
            Iterator it = this.a.c.iterator();
            while (it.hasNext()) {
                adga adgaVar = (adga) it.next();
                if (!list.contains(adgaVar)) {
                    this.a.m(adgaVar);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                this.a.k((adga) it2.next());
            }
        }
    }
}
