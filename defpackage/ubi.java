package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubi implements uau {
    private final tzt a;
    private final twx b;
    private final tzq c;
    private final Set d;
    private final shf e;
    private final txo f;
    private final tzh g;

    public ubi(tzt tztVar, twx twxVar, txo txoVar, tzq tzqVar, tzh tzhVar, Set set, shf shfVar) {
        this.a = tztVar;
        this.b = twxVar;
        this.f = txoVar;
        this.c = tzqVar;
        this.g = tzhVar;
        this.d = set;
        this.e = shfVar;
    }

    @Override // defpackage.uau
    public final void a(String str, aooy aooyVar, Throwable th) {
        tzk.g("FetchLatestThreadsCallback", "Fetched latest threads for account: %s (FAILURE)", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uau
    public final void b(String str, aooy aooyVar, aooy aooyVar2) {
        tzk.e("FetchLatestThreadsCallback", "Fetched latest threads for account: %s (SUCCESS)", str);
        aoiz aoizVar = (aoiz) aooyVar;
        aoja aojaVar = (aoja) aooyVar2;
        try {
            twu b = this.b.b(str);
            twp b2 = b.b();
            b2.c = Long.valueOf(aojaVar.d);
            b2.d = Long.valueOf(aojaVar.c);
            aokf a = aokf.a(aoizVar.g);
            if (a == null) {
                a = aokf.FETCH_REASON_UNSPECIFIED;
            }
            if (a == aokf.GUNS_MIGRATION && b.i.longValue() == 0) {
                b2.f = Long.valueOf(aojaVar.d);
            }
            twu a2 = b2.a();
            this.b.e(a2);
            amxd listIterator = ((amvs) this.d).listIterator();
            while (listIterator.hasNext()) {
                ((ucp) listIterator.next()).e();
            }
            ArrayList arrayList = new ArrayList();
            txo txoVar = this.f;
            uzi b3 = uzi.b();
            b3.c("1");
            amxe it = txoVar.a.a(str, amru.r(b3.a())).iterator();
            while (it.hasNext()) {
                txb txbVar = (txb) it.next();
                if (txbVar.s != 2) {
                    arrayList.add(txbVar.a);
                }
            }
            tzq tzqVar = this.c;
            aone createBuilder = aokw.a.createBuilder();
            createBuilder.copyOnWrite();
            aokw aokwVar = (aokw) createBuilder.instance;
            aokwVar.d = 2;
            aokwVar.b = 2 | aokwVar.b;
            tzqVar.b(a2, arrayList, (aokw) createBuilder.build(), tys.SERVER, aohq.DISMISSED_REMOTE);
            this.f.a.e(str, tyo.c(uzi.b().a(), "thread_id", (String[]) arrayList.toArray(new String[0])));
            if (aojaVar.b.size() > 0) {
                long micros = TimeUnit.MILLISECONDS.toMicros(this.e.c());
                tzf a3 = this.g.a(aoic.FETCHED_LATEST_THREADS);
                a3.d(a2);
                a3.f(aojaVar.b);
                a3.g(micros);
                a3.i();
                tzt tztVar = this.a;
                aony aonyVar = aojaVar.b;
                twd b4 = twd.b();
                tzg tzgVar = new tzg(Long.valueOf(micros), Long.valueOf(this.e.d()), aohm.FETCHED_LATEST_THREADS);
                aokf a4 = aokf.a(aoizVar.g);
                if (a4 == null) {
                    a4 = aokf.FETCH_REASON_UNSPECIFIED;
                }
                tztVar.a(a2, aonyVar, b4, tzgVar, a4 == aokf.INBOX);
            }
        } catch (tww e) {
            tzk.c("FetchLatestThreadsCallback", e, "Account not found in scheduled callback.", new Object[0]);
        }
    }
}
