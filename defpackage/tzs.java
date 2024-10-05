package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tzs implements tzq {
    private final ubr a;
    private final ucb b;
    private final shf c;
    private final Lock d;
    private final axpg e;
    private final axpg f;
    private final tzh g;

    public tzs(ubr ubrVar, axpg axpgVar, axpg axpgVar2, tzh tzhVar, ucb ucbVar, shf shfVar, Lock lock) {
        this.a = ubrVar;
        this.e = axpgVar;
        this.f = axpgVar2;
        this.g = tzhVar;
        this.b = ucbVar;
        this.c = shfVar;
        this.d = lock;
    }

    private final void d(twu twuVar, List list, tzg tzgVar) {
        tzf a = this.g.a(aoic.DISMISSED_REMOTE);
        a.d(twuVar);
        a.c(list);
        ((tzj) a).t = tzgVar;
        a.i();
    }

    private static boolean e(txb txbVar) {
        return txbVar.r == 3 || txbVar.p == 3;
    }

    @Override // defpackage.tzq
    public final void a(final twu twuVar, final List list, final twd twdVar, final tzg tzgVar, final boolean z) {
        if (axxd.b()) {
            Runnable runnable = new Runnable() { // from class: tzr
                @Override // java.lang.Runnable
                public final void run() {
                    tzs.this.c(twuVar, list, twdVar, tzgVar, z);
                }
            };
            this.d.lock();
            try {
                runnable.run();
                return;
            } finally {
                this.d.unlock();
            }
        }
        c(twuVar, list, twdVar, tzgVar, z);
    }

    @Override // defpackage.tzq
    public final void b(twu twuVar, List list, aokw aokwVar, tys tysVar, aohq aohqVar) {
        int w;
        if (list.isEmpty()) {
            return;
        }
        int o = aobq.o(aokwVar.f);
        if ((o != 0 && o == 3) || ((w = aobq.w(aokwVar.d)) != 0 && w == 3)) {
            List a = this.a.a(twuVar, list, null, aohqVar);
            if (tysVar == tys.SERVER && !a.isEmpty()) {
                d(twuVar, a, null);
            }
        }
        Iterator it = ((Set) this.e.get()).iterator();
        while (it.hasNext()) {
            ((ucp) it.next()).h();
        }
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Throwable, udc] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final void c(twu twuVar, List list, twd twdVar, tzg tzgVar, boolean z) {
        List<txb> list2;
        txb txbVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        txb txbVar2;
        udd uddVar;
        ?? r12 = 0;
        if (axxd.b()) {
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = ((txb) list.get(i)).a;
            }
            List<txc> a = ((txd) this.b.a(twuVar != null ? twuVar.b : null)).a(strArr);
            HashMap hashMap = new HashMap();
            for (txc txcVar : a) {
                hashMap.put(txcVar.b, txcVar);
            }
            amrp h = amru.h(list.size());
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                txb txbVar3 = (txb) it.next();
                txc txcVar2 = (txc) hashMap.get(txbVar3.a);
                if (txcVar2 != null && txcVar2.c > txbVar3.b.longValue()) {
                    tws c = txbVar3.c();
                    c.i(txcVar2.e);
                    c.h(txcVar2.f);
                    c.g(txcVar2.g);
                    c.k(txcVar2.h);
                    txb a2 = c.a();
                    boolean e = e(txbVar3);
                    boolean z2 = !e(a2);
                    if ((!e) && !z2) {
                        arrayList3.add(a2);
                    }
                    txbVar3 = a2;
                }
                h.h(txbVar3);
            }
            if (!arrayList3.isEmpty()) {
                tzf c2 = this.g.c(54);
                c2.d(twuVar);
                c2.c(arrayList3);
                tzj tzjVar = (tzj) c2;
                tzjVar.w = 2;
                tzjVar.t = tzgVar;
                c2.i();
            }
            list2 = h.g();
        } else {
            list2 = list;
        }
        EnumMap enumMap = new EnumMap(udc.class);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (txb txbVar4 : list2) {
            if (!e(txbVar4) && (txbVar4.k.longValue() <= 0 || TimeUnit.MILLISECONDS.convert(txbVar4.k.longValue(), TimeUnit.MICROSECONDS) > this.c.c())) {
                Iterator it2 = ((Set) this.e.get()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        int b = ((ucp) it2.next()).b();
                        if (b == 0) {
                            throw r12;
                        }
                        if (b != 1) {
                            break;
                        }
                    } else {
                        if (((ammv) this.f.get()).h()) {
                            long d = this.c.d();
                            atog atogVar = ((axze) ((ammv) this.f.get()).c()).a.a().p;
                            if (atogVar == null) {
                                atogVar = atog.a;
                            }
                            if (atogVar.o) {
                                uddVar = new udd(false, r12);
                            } else {
                                udc udcVar = udc.INVALID_TARGET_STATE;
                                amkq.F(udcVar != null, "DropReason should not be null.");
                                uddVar = new udd(true, udcVar);
                            }
                            long d2 = this.c.d() - d;
                            if (uddVar.a) {
                                udc udcVar2 = uddVar.b;
                                if (!enumMap.containsKey(udcVar2)) {
                                    enumMap.put((EnumMap) udcVar2, (udc) new ArrayList());
                                }
                                ((List) enumMap.get(udcVar2)).add(txbVar4);
                                txbVar2 = txbVar4;
                                arrayList = arrayList5;
                                arrayList2 = arrayList4;
                                arrayList.add(txbVar2);
                                arrayList5 = arrayList;
                                arrayList4 = arrayList2;
                                r12 = 0;
                            } else {
                                tzgVar.e = Long.valueOf(d2);
                                txbVar = txbVar4;
                                arrayList = arrayList5;
                                arrayList2 = arrayList4;
                                this.a.c(twuVar, txbVar4, false, z, twdVar, null, tzgVar);
                            }
                        } else {
                            txbVar = txbVar4;
                            arrayList = arrayList5;
                            arrayList2 = arrayList4;
                            this.a.c(twuVar, txbVar, false, z, twdVar, null, tzgVar);
                        }
                        txbVar2 = txbVar;
                        arrayList.add(txbVar2);
                        arrayList5 = arrayList;
                        arrayList4 = arrayList2;
                        r12 = 0;
                    }
                }
            } else {
                arrayList4.add(txbVar4.a);
                arrayList5.add(txbVar4);
            }
        }
        ArrayList arrayList6 = arrayList4;
        if (!arrayList5.isEmpty()) {
            Iterator it3 = ((Set) this.e.get()).iterator();
            while (it3.hasNext()) {
                ((ucp) it3.next()).f();
            }
        }
        if (!arrayList6.isEmpty()) {
            List a3 = this.a.a(twuVar, arrayList6, tzgVar, aohq.DISMISSED_REMOTE);
            if (!a3.isEmpty()) {
                d(twuVar, a3, tzgVar);
            }
        }
        for (udc udcVar3 : enumMap.keySet()) {
            List list3 = (List) enumMap.get(udcVar3);
            tzf c3 = this.g.c(4);
            c3.d(twuVar);
            c3.c(list3);
            tzj tzjVar2 = (tzj) c3;
            tzjVar2.w = 2;
            tzjVar2.k = udcVar3;
            tzjVar2.t = tzgVar;
            c3.i();
        }
    }
}
