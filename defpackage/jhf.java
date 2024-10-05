package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jhf extends jhl {
    private final azrw a;

    public jhf(azrw azrwVar) {
        this.a = azrwVar;
    }

    private final Map h() {
        return ((agof) this.a.get()).a().g().f();
    }

    @Override // defpackage.jhl
    protected final amsx a(agsw agswVar) {
        amsv i = amsx.i();
        Map h = h();
        Collection j = agswVar.j();
        HashSet an = amkq.an();
        Iterator it = j.iterator();
        while (it.hasNext()) {
            an.addAll(evr.bU(h, ((agnv) it.next()).m()));
        }
        amxd listIterator = amsx.p(an).listIterator();
        while (listIterator.hasNext()) {
            i.c(evr.bE((String) listIterator.next()));
        }
        return i.g();
    }

    @Override // defpackage.jhl
    protected final void b(aalc aalcVar, agnv agnvVar) {
        amsx bU = evr.bU(h(), agnvVar.m());
        if (bU.isEmpty()) {
            return;
        }
        amxd listIterator = bU.listIterator();
        while (listIterator.hasNext()) {
            aalcVar.k(evr.bE((String) listIterator.next()));
        }
    }
}
