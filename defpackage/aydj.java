package defpackage;

import io.grpc.Status;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aydj {
    public final /* synthetic */ axzl a;
    final /* synthetic */ aydm b;

    public aydj(aydm aydmVar, axzl axzlVar) {
        this.b = aydmVar;
        this.a = axzlVar;
    }

    public final void a(Map map) {
        aycd aycdVar;
        try {
            synchronized (this.b) {
                aydm aydmVar = this.b;
                Map map2 = aydmVar.e;
                if (map2 == null || map2 != map) {
                    aycd aycdVar2 = new aycd();
                    for (String str : map.keySet()) {
                        if (str.endsWith("-bin")) {
                            ayca e = ayca.e(str, aycd.e);
                            Iterator it = ((List) map.get(str)).iterator();
                            while (it.hasNext()) {
                                aycdVar2.f(e, anbp.d.j((String) it.next()));
                            }
                        } else {
                            ayca c = ayca.c(str, aycd.a);
                            Iterator it2 = ((List) map.get(str)).iterator();
                            while (it2.hasNext()) {
                                aycdVar2.f(c, (String) it2.next());
                            }
                        }
                    }
                    aydmVar.d = aycdVar2;
                    this.b.e = map;
                }
                aycdVar = this.b.d;
            }
            axzk axzkVar = this.a.a;
            aylr aylrVar = (aylr) axzkVar;
            amkq.O(!aylrVar.h, "apply() or fail() already called");
            aycdVar.getClass();
            aylrVar.c.e(aycdVar);
            ayai a = aylrVar.e.a();
            try {
                aygd l = ((aylr) axzkVar).a.l(((aylr) axzkVar).b, ((aylr) axzkVar).c, ((aylr) axzkVar).d, ((aylr) axzkVar).j);
                aylrVar.e.c(a);
                aylrVar.b(l);
            } catch (Throwable th) {
                aylrVar.e.c(a);
                throw th;
            }
        } catch (Throwable th2) {
            this.a.a(Status.i.withDescription("Failed to convert credential metadata").c(th2));
        }
    }
}
