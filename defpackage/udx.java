package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udx implements udw {
    private final ubr a;
    private final twx b;
    private final tzt c;
    private final txq d;
    private final tzh e;

    public udx(ubr ubrVar, txq txqVar, twx twxVar, tzt tztVar, tzh tzhVar) {
        this.a = ubrVar;
        this.d = txqVar;
        this.b = twxVar;
        this.c = tztVar;
        this.e = tzhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.udw
    public final void a(twd twdVar) {
        for (twu twuVar : this.b.c()) {
            amxe it = ((amru) this.d.a(twuVar.b)).iterator();
            while (it.hasNext()) {
                this.a.c(twuVar, (txb) it.next(), true, true, twdVar, null, null);
            }
        }
        amxe it2 = ((amru) this.d.a(null)).iterator();
        while (it2.hasNext()) {
            this.a.c(null, (txb) it2.next(), true, true, twdVar, null, null);
        }
    }

    @Override // defpackage.udw
    public final void b() {
        Iterator it = this.b.c().iterator();
        while (it.hasNext()) {
            c((twu) it.next());
        }
        c(null);
    }

    public final void c(twu twuVar) {
        List a = this.d.a(twuVar == null ? null : twuVar.b);
        if (a.isEmpty()) {
            return;
        }
        tzt tztVar = this.c;
        tyq l = tyr.l();
        l.f(tys.API);
        l.h(1);
        l.a = "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED";
        l.b = twuVar;
        l.b(a);
        aone createBuilder = aokw.a.createBuilder();
        createBuilder.copyOnWrite();
        aokw aokwVar = (aokw) createBuilder.instance;
        aokwVar.f = 2;
        aokwVar.b |= 8;
        createBuilder.copyOnWrite();
        aokw aokwVar2 = (aokw) createBuilder.instance;
        aokwVar2.e = 2;
        aokwVar2.b |= 4;
        l.g((aokw) createBuilder.build());
        l.e(aohq.DISMISSED_BY_API);
        tztVar.b(l.a());
        tzf a2 = this.e.a(aoic.DISMISSED_BY_API);
        a2.d(twuVar);
        a2.c(a);
        a2.i();
    }
}
