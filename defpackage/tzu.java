package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tzu {
    private final tzq a;
    private final ucj b;
    private final shf c;
    private final tzh d;

    public tzu(tzq tzqVar, tzh tzhVar, ucj ucjVar, shf shfVar) {
        this.a = tzqVar;
        this.d = tzhVar;
        this.b = ucjVar;
        this.c = shfVar;
    }

    public final void a(twu twuVar, List list, twd twdVar, tzg tzgVar, boolean z) {
        long d = this.c.d();
        boolean z2 = false;
        if (twuVar != null) {
            try {
                this.b.b(twuVar.b);
            } catch (IOException unused) {
                Object[] objArr = new Object[0];
                if (tzk.b.d(3)) {
                    nbm.c("BlockingNotificationReceiver", "IOException getting auth token.", objArr);
                }
            } catch (Exception e) {
                tzk.c("BlockingNotificationReceiver", e, "Error getting auth token.", new Object[0]);
            }
        }
        z2 = true;
        tzgVar.d = Long.valueOf(this.c.d() - d);
        if (!z2) {
            tzf c = this.d.c(26);
            c.d(twuVar);
            c.f(list);
            ((tzj) c).t = tzgVar;
            c.i();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aokh aokhVar = (aokh) it.next();
            aokhVar.getClass();
            tws b = txb.b();
            b.e(aokhVar.d);
            aokv aokvVar = aokhVar.f;
            if (aokvVar == null) {
                aokvVar = aokv.a;
            }
            int t = aobq.t(aokvVar.b);
            if (t == 0) {
                t = 1;
            }
            b.i(t);
            aokv aokvVar2 = aokhVar.f;
            if (aokvVar2 == null) {
                aokvVar2 = aokv.a;
            }
            int w = aobq.w(aokvVar2.c);
            if (w == 0) {
                w = 1;
            }
            b.h(w);
            aokv aokvVar3 = aokhVar.f;
            if (aokvVar3 == null) {
                aokvVar3 = aokv.a;
            }
            int z3 = aobq.z(aokvVar3.d);
            if (z3 == 0) {
                z3 = 1;
            }
            b.g(z3);
            aokv aokvVar4 = aokhVar.f;
            if (aokvVar4 == null) {
                aokvVar4 = aokv.a;
            }
            int o = aobq.o(aokvVar4.e);
            if (o == 0) {
                o = 1;
            }
            b.k(o);
            b.a = Long.valueOf(aokhVar.h);
            b.b = Long.valueOf(aokhVar.i);
            b.c(aokhVar.b == 12 ? (aokd) aokhVar.c : aokd.a);
            b.f(aokhVar.g);
            b.c = Long.valueOf(aokhVar.e);
            b.d = aokhVar.j;
            aols aolsVar = aokhVar.k;
            if (aolsVar == null) {
                aolsVar = aols.a;
            }
            b.e = aolsVar;
            b.f = aokhVar.l;
            b.g = Long.valueOf(aokhVar.m);
            int s = aobq.s(aokhVar.n);
            if (s == 0) {
                s = 1;
            }
            b.j(s);
            aoky aokyVar = aokhVar.o;
            if (aokyVar == null) {
                aokyVar = aoky.a;
            }
            b.i = aokyVar;
            if (!TextUtils.isEmpty((aokhVar.b == 12 ? (aokd) aokhVar.c : aokd.a).n)) {
                b.d((aokhVar.b == 12 ? (aokd) aokhVar.c : aokd.a).n);
            }
            aoka aokaVar = (aokhVar.b == 12 ? (aokd) aokhVar.c : aokd.a).i;
            if (aokaVar == null) {
                aokaVar = aoka.a;
            }
            if (!aokaVar.e.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                aoka aokaVar2 = (aokhVar.b == 12 ? (aokd) aokhVar.c : aokd.a).i;
                if (aokaVar2 == null) {
                    aokaVar2 = aoka.a;
                }
                Iterator it2 = aokaVar2.e.iterator();
                while (it2.hasNext()) {
                    ammv a = twy.a((aojx) it2.next());
                    if (a.h()) {
                        arrayList2.add((twy) a.c());
                    }
                }
                b.b(arrayList2);
            }
            arrayList.add(b.a());
        }
        this.a.a(twuVar, arrayList, twdVar, tzgVar, z);
    }
}
