package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjp implements agit {
    final /* synthetic */ agjs a;

    public agjp(agjs agjsVar) {
        this.a = agjsVar;
    }

    @Override // defpackage.agit
    public final void a(agng agngVar) {
        int size = this.a.d().size();
        this.a.l(agngVar.a);
        if (size <= 0 || this.a.d().size() != 0) {
            return;
        }
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            agfp agfpVar = ((agfo) it.next()).a;
            agfpVar.f.a(agfpVar.G);
        }
    }

    @Override // defpackage.agit
    public final void b(Collection collection) {
    }

    @Override // defpackage.agit
    public final void c(agng agngVar, Collection collection, HashSet hashSet, atrx atrxVar, int i, byte[] bArr, Set set, agno agnoVar) {
        String str = agngVar.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((agnp) it.next()).f());
        }
        int o = this.a.c.o(str);
        long c = this.a.c.c(str);
        long d = this.a.c.d(agngVar.a);
        this.a.l(str);
        this.a.s(agngVar, arrayList, atrxVar, i, c, d, o);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            agnp agnpVar = (agnp) it2.next();
            String f = agnpVar.f();
            agjs agjsVar = this.a;
            boolean contains = hashSet.contains(f);
            boolean contains2 = set.contains(f);
            if (contains) {
                agjsVar.t(agnpVar, atrxVar, i, bArr, contains2 ? agnf.ACTIVE : agnf.STREAM_DOWNLOAD_PENDING, agnoVar, agjsVar.e.a(agnpVar.f()));
            }
            agjsVar.c().e(str, agnpVar.f());
        }
    }
}
