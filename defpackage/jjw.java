package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jjw extends jhk {
    private static awia g(agni agniVar) {
        agnb agnbVar = agniVar.a.c;
        if (agnbVar != null) {
            return evr.bJ(agnbVar);
        }
        return null;
    }

    @Override // defpackage.jhk
    protected final amsx a(agsl agslVar) {
        amsv i = amsx.i();
        Iterator it = agslVar.j().iterator();
        while (it.hasNext()) {
            awia g = g((agni) it.next());
            if (g != null) {
                i.c(g);
            }
        }
        return i.g();
    }

    @Override // defpackage.jhk
    protected final void c(aalc aalcVar, agni agniVar) {
        awia g = g(agniVar);
        if (g != null) {
            aalcVar.k(g);
        }
    }
}
