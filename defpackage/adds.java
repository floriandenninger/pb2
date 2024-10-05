package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adds implements Runnable {
    final /* synthetic */ addu a;

    public adds(addu adduVar) {
        this.a = adduVar;
    }

    public static /* synthetic */ void a(Throwable th) {
        String str = addu.a;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("Failed to get route distribution to log routes: ");
        sb.append(valueOf);
        zga.c(str, sb.toString());
    }

    public final void b(List list) {
        this.a.l += addu.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((atai) it.next()).d > 0) {
                aone createBuilder = ataj.a.createBuilder();
                long j = this.a.l;
                createBuilder.copyOnWrite();
                ataj atajVar = (ataj) createBuilder.instance;
                atajVar.b |= 1;
                atajVar.c = j;
                createBuilder.copyOnWrite();
                ataj atajVar2 = (ataj) createBuilder.instance;
                aony aonyVar = atajVar2.d;
                if (!aonyVar.c()) {
                    atajVar2.d = aonm.mutableCopy(aonyVar);
                }
                aolo.addAll((Iterable) list, (List) atajVar2.d);
                ataj atajVar3 = (ataj) createBuilder.build();
                arpn a = arpp.a();
                a.copyOnWrite();
                ((arpp) a.instance).db(atajVar3);
                this.a.d.c((arpp) a.build());
                return;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        addu adduVar = this.a;
        if (!adduVar.h.N) {
            adbx adbxVar = (adbx) adduVar.e;
            adcj adcjVar = new adcj(adbxVar.b, adbxVar.e, adbxVar.d, adbxVar.c, (String) null, adbxVar.g, adbxVar.h);
            ArrayList arrayList = new ArrayList(bpw.i());
            atai[] d = adcj.d();
            adcjVar.b(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                bpv bpvVar = (bpv) arrayList.get(i);
                if (!adeg.i(bpvVar)) {
                    if (adee.d(bpvVar) && adcjVar.b) {
                        c = 4;
                    } else if (adee.e(bpvVar)) {
                        c = 1;
                    } else {
                        c = adeg.g(bpvVar) ? (char) 3 : (char) 6;
                    }
                } else {
                    c = adcjVar.c(bpvVar) ? (char) 5 : (char) 2;
                }
                aone builder = d[c].toBuilder();
                int i2 = d[c].d;
                builder.copyOnWrite();
                atai ataiVar = (atai) builder.instance;
                ataiVar.b = 2 | ataiVar.b;
                ataiVar.d = i2 + 1;
                d[c] = (atai) builder.build();
            }
            b(amru.p(d));
            return;
        }
        adduVar.g.execute(new Runnable() { // from class: addr
            @Override // java.lang.Runnable
            public final void run() {
                final adds addsVar = adds.this;
                adbx adbxVar2 = (adbx) addsVar.a.e;
                adcj adcjVar2 = new adcj(adbxVar2.b, adbxVar2.e, adbxVar2.d, adbxVar2.c, (String) null, adbxVar2.g, adbxVar2.h);
                amru o = amru.o(bpw.i());
                ynm.k(anfq.i(anfq.i(adcjVar2.d.a(o), new adci(adcjVar2, o, 0), adcjVar2.c), ufj.j, adbxVar2.f), addsVar.a.i, abbr.r, new ynl() { // from class: addq
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        adds.this.b((List) obj);
                    }
                });
            }
        });
    }
}
