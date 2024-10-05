package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jka extends jhg {
    private final Map a = new ConcurrentHashMap();
    private final azrw b;

    public jka(azrw azrwVar) {
        this.b = azrwVar;
    }

    private final amsx t(agni agniVar) {
        HashSet hashSet = new HashSet(agniVar.b);
        this.a.put(agniVar.a.a, hashSet);
        return s(hashSet);
    }

    private static awij u(agnv agnvVar, boolean z) {
        if (agnvVar.s() && z) {
            return null;
        }
        return evr.bK(agnvVar.m(), agnvVar.i);
    }

    @Override // defpackage.jhg
    protected final amsx a(agsn agsnVar) {
        agsw m = agsnVar.m();
        amsv i = amsx.i();
        Iterator it = m.j().iterator();
        while (it.hasNext()) {
            awij u = u((agnv) it.next(), true);
            if (u != null) {
                i.c(u);
            }
        }
        return i.g();
    }

    @Override // defpackage.jhg
    protected final void c(aalc aalcVar, agni agniVar) {
        amxd listIterator = t(agniVar).listIterator();
        while (listIterator.hasNext()) {
            aalcVar.k((awij) listIterator.next());
        }
    }

    @Override // defpackage.jhg
    protected final void d(aalc aalcVar, String str) {
        this.a.remove(str);
    }

    @Override // defpackage.jhg
    protected final void e(aalc aalcVar, agni agniVar) {
        evr.bT(aalcVar, this.a, agniVar, new amml() { // from class: jjz
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                return jka.this.s((Set) obj);
            }
        }, null);
    }

    @Override // defpackage.jhg
    protected final void f(aalc aalcVar, agnv agnvVar) {
        awij u = u(agnvVar, false);
        if (u != null) {
            aalcVar.k(u);
        }
    }

    @Override // defpackage.jhg
    protected final void g(aalc aalcVar, String str) {
        aalcVar.g(fhe.h(str));
    }

    @Override // defpackage.jhg
    protected final void r(aalc aalcVar, agni agniVar) {
        amxd listIterator = t(agniVar).listIterator();
        while (listIterator.hasNext()) {
            aalcVar.k((awij) listIterator.next());
        }
    }

    public final amsx s(Set set) {
        amsv i = amsx.i();
        agsw m = ((agof) this.b.get()).a().m();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            agnv e = m.e(str);
            if (e != null) {
                i.c(evr.bK(str, e.i));
            }
        }
        return i.g();
    }
}
