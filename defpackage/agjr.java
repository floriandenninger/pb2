package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjr implements agjj {
    final /* synthetic */ agjs a;

    public agjr(agjs agjsVar) {
        this.a = agjsVar;
    }

    @Override // defpackage.agjj
    public final void a(Collection collection) {
    }

    @Override // defpackage.agjj
    public final void b(bagd bagdVar, List list) {
        agjz r = this.a.r(bagdVar.a);
        r.getClass();
        synchronized (r.c.k) {
            r.a = list;
            r.b = null;
        }
    }

    @Override // defpackage.agjj
    public final void c(bagd bagdVar, Collection collection, HashSet hashSet, atrx atrxVar, int i, byte[] bArr, agnf agnfVar, agno agnoVar) {
        List list;
        String str = bagdVar.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((agnp) it.next()).f());
        }
        agjz r = this.a.r(str);
        if (r == null) {
            list = null;
        } else {
            synchronized (r.c.k) {
                list = r.a;
            }
        }
        agka c = this.a.c();
        synchronized (c.k) {
            zhq.m(str);
            c.d.remove(str);
            Set set = (Set) c.i.remove(str);
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    yjj.x(c.h, (String) it2.next(), str);
                }
            }
        }
        this.a.u(bagdVar, arrayList, list, this.a.d.l(str));
        Iterator it3 = collection.iterator();
        while (it3.hasNext()) {
            agnp agnpVar = (agnp) it3.next();
            String f = agnpVar.f();
            if (hashSet.contains(f)) {
                agjs agjsVar = this.a;
                agjsVar.t(agnpVar, atrxVar, i, bArr, agnfVar, agnoVar, agjsVar.e.a(f));
            }
            this.a.i(str, f);
        }
    }

    @Override // defpackage.agjj
    public final void d(bagd bagdVar, agnp agnpVar, atrx atrxVar, byte[] bArr, agnf agnfVar, agno agnoVar) {
        if (this.a.c().j(agnpVar.f()) == null) {
            this.a.c().k(agnpVar, atrxVar, -1, bArr, agnfVar, agnoVar, this.a.e.a(agnpVar.f()));
        }
        this.a.i(bagdVar.a, agnpVar.f());
    }
}
