package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agts implements aguh {
    private final aais a;
    private final aajb b;
    private final afsy c;

    public agts(aais aaisVar, aajb aajbVar, afsy afsyVar) {
        this.a = aaisVar;
        this.b = aajbVar;
        this.c = afsyVar;
    }

    private static agtu h(afsx afsxVar, avjs avjsVar, aaku aakuVar) {
        return new agtu(afsxVar, avjsVar.d(), new agmw(aakuVar), new agmw(aakuVar).a("transferFailureCount"), avjsVar.getTransferState(), avjsVar.getFailureReason());
    }

    @Override // defpackage.aguh
    public final ammv a(String str) {
        afsx c = this.c.c();
        aair a = this.a.a(c);
        avjs avjsVar = (avjs) a.f(str).g(avjs.class).X();
        return avjsVar == null ? amlr.a : ammv.j(h(c, avjsVar, (aaku) a.j(str).X()));
    }

    @Override // defpackage.aguh
    public final List b(afsx afsxVar) {
        aair a = this.a.a(afsxVar);
        aajb aajbVar = this.b;
        ArrayList arrayList = new ArrayList();
        whl.E(agkj.d, 2, Long.valueOf(avjo.TRANSFER_STATE_FAILED.i), aajbVar, arrayList);
        final aajc aajcVar = agkj.d;
        final Long valueOf = Long.valueOf(avjo.TRANSFER_STATE_COMPLETE.i);
        aajbVar.c(aajcVar);
        arrayList.add(new aaiy() { // from class: aaiv
            @Override // defpackage.aaiy
            public final void a(vin vinVar) {
                aajc aajcVar2 = aajc.this;
                Long l = valueOf;
                vinVar.b(" AND ");
                aajcVar2.a(vinVar);
                whl.B(vinVar, 2);
                vinVar.b("?");
                aajcVar2.c(vinVar, l);
            }
        });
        amru amruVar = (amru) a.e(whl.D(aajbVar, arrayList)).X();
        ArrayList arrayList2 = new ArrayList(amruVar.size());
        int size = amruVar.size();
        for (int i = 0; i < size; i++) {
            String str = (String) amruVar.get(i);
            arrayList2.add(h(afsxVar, (avjs) a.f(str).g(avjs.class).X(), (aaku) a.j(str).X()));
        }
        return arrayList2;
    }

    @Override // defpackage.aguh
    public final void c(agtu agtuVar) {
    }

    @Override // defpackage.aguh
    public final void d() {
    }

    @Override // defpackage.aguh
    public final void e(agtu agtuVar) {
    }

    @Override // defpackage.aguh
    public final void f(String str) {
    }

    @Override // defpackage.aguh
    public final void g(agtu agtuVar) {
        aair a = this.a.a(agtuVar.l);
        avjs avjsVar = (avjs) a.f(agtuVar.a).g(avjs.class).X();
        if (avjsVar == null) {
            return;
        }
        avjq e = avjsVar.e();
        e.d(agtuVar.j);
        aone aoneVar = e.a;
        aoneVar.copyOnWrite();
        avjt avjtVar = (avjt) aoneVar.instance;
        avjt avjtVar2 = avjt.a;
        avjtVar.c &= -5;
        avjtVar.g = 0;
        avjp avjpVar = agtuVar.k;
        if (avjpVar != null) {
            e.c(avjpVar);
        }
        aalc c = a.c();
        c.d(e.a(a));
        agmx agmxVar = agtuVar.f;
        if (agmxVar instanceof agmw) {
            agmxVar.i("transferFailureCount", agtuVar.i);
            c.f(avjsVar.d(), ((agmw) agtuVar.f).e());
        }
        c.b().T();
    }
}
