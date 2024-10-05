package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jjx extends jhl {
    private static awia h(agnv agnvVar, boolean z) {
        agnb agnbVar = agnvVar.a.a;
        if ((agnvVar.s() && z) || agnbVar == null) {
            return null;
        }
        return evr.bJ(agnbVar);
    }

    @Override // defpackage.jhl
    protected final amsx a(agsw agswVar) {
        amsv i = amsx.i();
        Iterator it = agswVar.j().iterator();
        while (it.hasNext()) {
            awia h = h((agnv) it.next(), true);
            if (h != null) {
                i.c(h);
            }
        }
        return i.g();
    }

    @Override // defpackage.jhl
    protected final void c(aalc aalcVar, agnv agnvVar) {
        awia h = h(agnvVar, false);
        if (h != null) {
            aalcVar.k(h);
        }
    }
}
