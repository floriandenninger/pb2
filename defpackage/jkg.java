package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jkg extends jhg {
    private final Map a = new ConcurrentHashMap();
    private final azrw b;
    private final axzg c;

    public jkg(azrw azrwVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        this.b = azrwVar;
        this.c = axzgVar;
    }

    private final awjn t(agnv agnvVar, boolean z) {
        if (agnvVar.s() && z) {
            return null;
        }
        return evr.bM(agnvVar.a, this.c.o().booleanValue());
    }

    @Override // defpackage.jhg
    protected final amsx a(agsn agsnVar) {
        agsw m = agsnVar.m();
        amsv i = amsx.i();
        Iterator it = m.j().iterator();
        while (it.hasNext()) {
            awjn t = t((agnv) it.next(), true);
            if (t != null) {
                i.c(t);
            }
        }
        return i.g();
    }

    @Override // defpackage.jhg
    protected final void c(aalc aalcVar, agni agniVar) {
        HashSet hashSet = new HashSet(agniVar.b);
        this.a.put(agniVar.a.a, hashSet);
        amxd listIterator = s(hashSet).listIterator();
        while (listIterator.hasNext()) {
            aalcVar.k((awjn) listIterator.next());
        }
    }

    @Override // defpackage.jhg
    protected final void d(aalc aalcVar, String str) {
        this.a.remove(str);
    }

    @Override // defpackage.jhg
    protected final void e(aalc aalcVar, agni agniVar) {
        evr.bT(aalcVar, this.a, agniVar, new jkf(this), null);
    }

    @Override // defpackage.jhg
    protected final void f(aalc aalcVar, agnv agnvVar) {
        awjn t = t(agnvVar, false);
        if (t != null) {
            aalcVar.k(t);
        }
    }

    @Override // defpackage.jhg
    protected final void g(aalc aalcVar, String str) {
        aalcVar.g(fhe.y(str));
    }

    @Override // defpackage.jhg
    protected final void r(aalc aalcVar, agni agniVar) {
        evr.bT(aalcVar, this.a, agniVar, new jkf(this), null);
    }

    public final amsx s(Set set) {
        amsv i = amsx.i();
        agsw m = ((agof) this.b.get()).a().m();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            agnv e = m.e((String) it.next());
            if (e != null) {
                i.c(evr.bM(e.a, this.c.o().booleanValue()));
            }
        }
        return i.g();
    }
}
