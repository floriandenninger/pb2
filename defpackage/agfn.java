package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agfn implements agje {
    final /* synthetic */ agfp a;

    public agfn(agfp agfpVar) {
        this.a = agfpVar;
    }

    @Override // defpackage.agje
    public final void a(String str, boolean z) {
        if (!z) {
            agfp agfpVar = this.a;
            if (agtw.ah(agfpVar.c, agfpVar.G)) {
                this.a.c().g(str);
                this.a.c().e(str);
                aghj c = this.a.c();
                c.f(c.a(str));
            }
        }
        aghe agheVar = this.a.o;
        zhq.m(str);
        List<phg> list = ((ageh) agheVar.a).get();
        if (list == null) {
            return;
        }
        for (phg phgVar : list) {
            if (phgVar != null) {
                Set<String> g = phgVar.g();
                String concat = String.valueOf(str).concat(".");
                for (String str2 : g) {
                    if (str2 != null && str2.startsWith(concat)) {
                        Iterator it = phgVar.f(str2).iterator();
                        while (it.hasNext()) {
                            try {
                                phgVar.k((phl) it.next());
                            } catch (phe unused) {
                            }
                        }
                    }
                }
            }
        }
    }
}
