package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jho extends jhk {
    private static final aqmg g(String str) {
        return evr.bF(str, avxt.DOWNLOAD_STATE_PENDING_DOWNLOAD, 0.0f, 0.0f);
    }

    private static final aqmg l(agnh agnhVar) {
        if (agnhVar == null) {
            return null;
        }
        return evr.bF(agnhVar.d(), agnhVar.e() ? avxt.DOWNLOAD_STATE_COMPLETE : avxt.DOWNLOAD_STATE_DOWNLOAD_IN_PROGRESS, agnhVar.d / 100.0f, agnhVar.e / 100.0f);
    }

    @Override // defpackage.jhk
    protected final amsx a(agsl agslVar) {
        aqmg g;
        amsv i = amsx.i();
        Iterator it = agslVar.j().iterator();
        while (it.hasNext()) {
            String str = ((agni) it.next()).a.a;
            agnh d = agslVar.d(str);
            if (d != null) {
                g = l(d);
            } else {
                g = g(str);
            }
            if (g != null) {
                i.c(g);
            }
        }
        return i.g();
    }

    @Override // defpackage.jhk
    protected final void c(aalc aalcVar, agni agniVar) {
        aalcVar.k(g(agniVar.a.a));
    }

    @Override // defpackage.jhk
    protected final void d(aalc aalcVar, String str) {
        aone createBuilder = aqmf.a.createBuilder();
        createBuilder.copyOnWrite();
        aqmf aqmfVar = (aqmf) createBuilder.instance;
        str.getClass();
        aqmfVar.b = 2;
        aqmfVar.c = str;
        aalcVar.g(fhe.e((aqmf) createBuilder.build()));
    }

    @Override // defpackage.jhk
    protected final void e(aalc aalcVar, agni agniVar, agnh agnhVar) {
        aqmg l = l(agnhVar);
        if (l != null) {
            aalcVar.k(l);
        }
    }
}
