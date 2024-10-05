package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jke extends jhk {
    private final Map a = new ConcurrentHashMap();

    public static amsx g(agni agniVar, Set set) {
        amsv i = amsx.i();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i.c(evr.bL(agniVar.a.a, (String) it.next()));
        }
        return i.g();
    }

    public static void l(aalc aalcVar, agni agniVar, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aalcVar.g(fhe.u(agniVar.a.a, (String) it.next()));
        }
    }

    private final amsx m(agni agniVar) {
        amsv i = amsx.i();
        String str = agniVar.a.a;
        Iterator it = agniVar.b.iterator();
        while (it.hasNext()) {
            i.c(evr.bL(str, (String) it.next()));
        }
        this.a.put(str, new HashSet(agniVar.b));
        return i.g();
    }

    @Override // defpackage.jhk
    protected final amsx a(agsl agslVar) {
        amsv i = amsx.i();
        Iterator it = agslVar.j().iterator();
        while (it.hasNext()) {
            i.j(m((agni) it.next()));
        }
        return i.g();
    }

    @Override // defpackage.jhk
    protected final void c(aalc aalcVar, agni agniVar) {
        evr.bS(aalcVar, m(agniVar));
    }

    @Override // defpackage.jhk
    protected final void d(aalc aalcVar, String str) {
        Set set = (Set) this.a.remove(str);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                aalcVar.g(fhe.u(str, (String) it.next()));
            }
        }
    }

    @Override // defpackage.jhk
    protected final void e(aalc aalcVar, agni agniVar, agnh agnhVar) {
        evr.bT(aalcVar, this.a, agniVar, new jiq(agniVar, 2), new jjl(aalcVar, agniVar, 2));
    }

    @Override // defpackage.jhk
    protected final void f(aalc aalcVar, agni agniVar) {
        evr.bT(aalcVar, this.a, agniVar, new jiq(agniVar, 3), new jjl(aalcVar, agniVar, 3));
    }
}
