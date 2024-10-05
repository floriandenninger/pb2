package defpackage;

import android.database.Cursor;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agff implements agsl {
    public static final long a = TimeUnit.HOURS.toMillis(1);
    public final shf b;
    public final String c;
    public final azrw d;
    public final agvh e;
    public final azrw f;
    public final azrw g;
    public final agft h;
    public final Executor i;
    public final azrw j;
    public final azrw k;
    public final azrw l;
    public final azrw m;
    public final azrw n;
    public final azrw o;
    public final azrw p;
    public final azrw q;
    final azrw r;
    public final aaea u;
    public final aadw w;
    private final Executor x;
    private final azrw y;
    private final agzz z;
    public volatile long v = 0;
    public final agfe s = new agfe(this);
    public final Map t = new HashMap();

    public agff(shf shfVar, String str, azrw azrwVar, agvh agvhVar, azrw azrwVar2, azrw azrwVar3, agft agftVar, Executor executor, Executor executor2, agiv agivVar, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, agzz agzzVar, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, aadw aadwVar, aaea aaeaVar) {
        this.b = shfVar;
        this.c = str;
        this.d = azrwVar;
        this.e = agvhVar;
        this.f = azrwVar2;
        this.g = azrwVar3;
        this.h = agftVar;
        this.x = executor;
        this.i = executor2;
        this.j = azrwVar4;
        this.k = azrwVar5;
        this.l = azrwVar6;
        this.m = azrwVar7;
        this.n = azrwVar8;
        this.o = azrwVar9;
        this.y = azrwVar10;
        this.z = agzzVar;
        this.p = azrwVar11;
        this.q = azrwVar12;
        this.r = azrwVar13;
        this.w = aadwVar;
        this.u = aaeaVar;
        agivVar.j(new agfb(this));
    }

    @Override // defpackage.agsl
    public final boolean A(final List list, final Map map, final Map map2, final int i, final long j) {
        if (!this.h.z()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (d((String) it.next()) == null) {
                return false;
            }
        }
        this.h.s(new Runnable() { // from class: ager
            /* JADX WARN: Code restructure failed: missing block: B:93:0x028e, code lost:
            
                if (r1.intValue() == 2) goto L81;
             */
            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0176  */
            /* JADX WARN: Type inference failed for: r31v2, types: [java.util.Map] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1516
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ager.run():void");
            }
        });
        return true;
    }

    @Override // defpackage.agsl
    public final boolean B(String str, long j) {
        if (this.h.z()) {
            return A(Collections.singletonList(str), amrz.k(str, Integer.MAX_VALUE), amrz.k(str, 0), 0, j);
        }
        return false;
    }

    @Override // defpackage.agsl
    public final int C(final String str, final atrx atrxVar, final agno agnoVar, final byte[] bArr, final int i, final int i2) {
        zhq.m(str);
        if (!this.h.z()) {
            return 2;
        }
        zhq.m(str);
        this.z.b(true);
        if (((agil) this.j.get()).n(str) != null) {
            return 1;
        }
        this.h.s(new Runnable() { // from class: agey
            @Override // java.lang.Runnable
            public final void run() {
                ajoy ajoyVar;
                List list;
                String str2;
                agff agffVar = agff.this;
                String str3 = str;
                atrx atrxVar2 = atrxVar;
                agno agnoVar2 = agnoVar;
                byte[] bArr2 = bArr;
                int i3 = i;
                int i4 = i2;
                long c = agffVar.b.c();
                yjk.e();
                if (!((ageh) agffVar.k.get()).i()) {
                    agffVar.p(str3, 0);
                    return;
                }
                agil agilVar = (agil) agffVar.j.get();
                if (agilVar.n(str3) != null) {
                    String.valueOf(str3).length();
                    agffVar.h.v(new agkn(str3));
                    return;
                }
                try {
                    agnx b = ((agrq) agffVar.g.get()).b(str3, Integer.MAX_VALUE);
                    if (b == null) {
                        String valueOf = String.valueOf(str3);
                        if (valueOf.length() != 0) {
                            "[Offline] Not adding null playlist ".concat(valueOf);
                        }
                        agffVar.p(str3, 3);
                        return;
                    }
                    int U = ((agsg) agffVar.d.get()).U(atrxVar2);
                    agng agngVar = b.a;
                    agno agnoVar3 = agnoVar2;
                    if (!agilVar.ab(agngVar, atrxVar2, U, i3, bArr2, c, i4)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 48);
                        sb.append("[Offline] Failed inserting playlist ");
                        sb.append(str3);
                        sb.append(" to database");
                        zga.b(sb.toString());
                        agffVar.p(str3, 2);
                        return;
                    }
                    ajoy ajoyVar2 = (ajoy) agffVar.n.get();
                    agnb agnbVar = agngVar.c;
                    if (agnbVar != null) {
                        ajoyVar2.h(agnbVar);
                    }
                    String.valueOf(str3).length();
                    agffVar.h.v(new agkl(str3));
                    List list2 = b.b;
                    Set m = ((aghc) agffVar.o.get()).m(list2);
                    Set set = m;
                    if (agilVar.ae(agngVar, list2, atrxVar2, U, m, agnoVar3, i3, bArr2)) {
                        yjk.e();
                        try {
                            agmm agmmVar = (agmm) agffVar.l.get();
                            agmm.x(agmmVar.h(agngVar.a));
                            agmmVar.s(agngVar);
                            agnb agnbVar2 = agngVar.c;
                            if (agnbVar2 != null) {
                                agmmVar.u(agnbVar2);
                            }
                        } catch (IOException | ExecutionException e) {
                            String str4 = agngVar.a;
                            zga.n(str4.length() != 0 ? "[Offline] Failed saving playlist thumbnail for ".concat(str4) : new String("[Offline] Failed saving playlist thumbnail for "), e);
                        }
                        agil agilVar2 = (agil) agffVar.j.get();
                        String str5 = agngVar.a;
                        agjw p = agilVar2.l.p(str5);
                        if (p != null) {
                            agng a2 = p.a();
                            str2 = str3;
                            ajoyVar = ajoyVar2;
                            list = list2;
                            agng agngVar2 = new agng(a2.a, a2.b, a2.c, a2.d, agilVar2.a.c(str5, p.a().e), a2.f, a2.h, a2.i, a2.j, a2.l, a2.m, a2.n);
                            synchronized (p.c.k) {
                                amkq.E(p.a.a.equals(agngVar2.a));
                                p.a = agngVar2;
                                p.b = null;
                            }
                        } else {
                            ajoyVar = ajoyVar2;
                            list = list2;
                            str2 = str3;
                        }
                        agsx l = ((akgl) agffVar.r.get()).l(agngVar, set);
                        aghc aghcVar = (aghc) agffVar.o.get();
                        agsy agsyVar = (agsy) agffVar.q.get();
                        agsyVar.f(aghcVar.j().size());
                        agsyVar.b().d(set);
                        agngVar.a.length();
                        agffVar.h.v(new agkq(l.c()));
                        aghcVar.v(agsyVar.b().b());
                        List<agnp> list3 = list;
                        ajoyVar.j(list3);
                        aghj aghjVar = (aghj) agffVar.m.get();
                        for (agnp agnpVar : list3) {
                            if (set.remove(agnpVar.f())) {
                                aghjVar.h(agnpVar.f(), str2, null, atrxVar2, null, U, agnoVar3, 0, false, false, false);
                                set = set;
                                agnoVar3 = agnoVar3;
                            }
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 48);
                    sb2.append("[Offline] Failed inserting playlist ");
                    sb2.append(str3);
                    sb2.append(" to database");
                    zga.b(sb2.toString());
                    agffVar.t(str3);
                    agilVar.C(str3);
                    agffVar.q(str3);
                } catch (ExecutionException e2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 49);
                    sb3.append("[Offline] Failed requesting playlist ");
                    sb3.append(str3);
                    sb3.append(" for offline");
                    zga.d(sb3.toString(), e2);
                    agffVar.p(str3, 1);
                }
            }
        });
        return 0;
    }

    @Override // defpackage.agsl
    public final int a(String str) {
        if (this.h.z()) {
            return ((agil) this.j.get()).j(str);
        }
        return 0;
    }

    @Override // defpackage.agsl
    public final int b(final String str, final String str2) {
        Set v;
        zhq.m(str);
        zhq.m(str2);
        if (!this.h.z()) {
            return 2;
        }
        zhq.m(str);
        zhq.m(str2);
        agil agilVar = (agil) this.j.get();
        agni n = agilVar.n(str);
        if (n == null) {
            return 2;
        }
        zhq.m(str2);
        zhq.m(str);
        agka c = agilVar.l.c();
        synchronized (c.k) {
            v = yjj.v(c.g, str);
        }
        if (!v.contains(str2)) {
            return 2;
        }
        aghc aghcVar = (aghc) this.o.get();
        agnv e = aghcVar.e(str2);
        if (e != null && (!e.u() || (e.a() && !e.y() && !e.t() && !e.r()))) {
            return 1;
        }
        this.h.s(new Runnable() { // from class: agez
            @Override // java.lang.Runnable
            public final void run() {
                agff agffVar = agff.this;
                ((aghc) agffVar.o.get()).B(str2, str, agno.OFFLINE_IMMEDIATELY, agnf.ACTIVE);
            }
        });
        agsx k = ((akgl) this.r.get()).k(str);
        if (k == null) {
            k = ((akgl) this.r.get()).l(n.a, amru.r(str2));
        } else {
            k.e(str2);
        }
        k.f();
        r(k.c());
        agsy agsyVar = (agsy) this.q.get();
        agsyVar.f(aghcVar.j().size());
        agsyVar.b().c(str2);
        aghcVar.v(agsyVar.b().b());
        return 0;
    }

    @Override // defpackage.agsl
    public final Pair c(String str) {
        zhq.m(str);
        yjk.e();
        if (this.h.z()) {
            return ((agil) this.j.get()).l(str);
        }
        return null;
    }

    @Override // defpackage.agsl
    public final agnh d(String str) {
        agni n;
        if (this.h.z()) {
            agsx k = ((akgl) this.r.get()).k(str);
            if (k == null && (n = ((agil) this.j.get()).n(str)) != null) {
                k = ((akgl) this.r.get()).l(n.a, null);
            }
            if (k != null) {
                return k.c();
            }
        }
        return null;
    }

    @Override // defpackage.agsl
    public final agni e(String str) {
        if (this.h.z()) {
            return ((agil) this.j.get()).n(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final agno f(String str) {
        HashSet hashSet;
        Set set;
        zhq.m(str);
        if (this.h.z()) {
            agka c = ((agjs) this.y.get()).c();
            synchronized (c.k) {
                zhq.m(str);
                hashSet = new HashSet();
                Set v = yjj.v(c.g, str);
                if (v != null && !v.isEmpty()) {
                    Iterator it = v.iterator();
                    while (it.hasNext()) {
                        agjy agjyVar = (agjy) c.b.get((String) it.next());
                        if (agjyVar != null && agjyVar.e() != null) {
                            hashSet.add(agjyVar.e());
                        }
                    }
                }
            }
            set = hashSet;
        } else {
            set = amvs.a;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (((agnv) it2.next()).m == agno.DEFER_FOR_DISCOUNTED_DATA) {
                return agno.DEFER_FOR_DISCOUNTED_DATA;
            }
        }
        return agno.OFFLINE_IMMEDIATELY;
    }

    public final amru g(String str) {
        agni e = e(str);
        if (e == null) {
            return amru.q();
        }
        ArrayList arrayList = new ArrayList();
        aghc aghcVar = (aghc) this.o.get();
        Iterator it = e.b.iterator();
        while (it.hasNext()) {
            agnv e2 = aghcVar.e((String) it.next());
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        return amru.o(arrayList);
    }

    @Override // defpackage.agsl
    public final anhy h(final String str) {
        return aghv.a(this.h.o(), new Callable() { // from class: aget
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return agff.this.g(str);
            }
        }, amru.q(), this.x);
    }

    @Override // defpackage.agsl
    public final anhy i() {
        return aghv.a(this.h.o(), new Callable() { // from class: ages
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return agff.this.k();
            }
        }, amru.q(), this.x);
    }

    @Override // defpackage.agsl
    public final Collection j() {
        if (!this.h.z()) {
            return amru.q();
        }
        return k();
    }

    public final Collection k() {
        LinkedList linkedList;
        agka c = ((agil) this.j.get()).l.c();
        synchronized (c.k) {
            linkedList = new LinkedList();
            Iterator it = c.c.values().iterator();
            while (it.hasNext()) {
                linkedList.add(((agjw) it.next()).b());
            }
        }
        return linkedList;
    }

    @Override // defpackage.agsl
    public final List l(String str) {
        if (!this.h.z()) {
            return amru.q();
        }
        return g(str);
    }

    @Override // defpackage.agsl
    public final List m() {
        yjk.e();
        if (!this.h.z()) {
            return amru.q();
        }
        return ((agil) this.j.get()).f();
    }

    @Override // defpackage.agsl
    public final Set n(String str) {
        zhq.m(str);
        if (this.h.z()) {
            return ((agil) this.j.get()).t(str);
        }
        return amvs.a;
    }

    @Override // defpackage.agsl
    public final void o(String str) {
        if (this.h.z()) {
            this.h.s(new agex(this, str, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(String str, int i) {
        String.valueOf(str).length();
        this.h.v(new agkm(str, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(String str) {
        String.valueOf(str).length();
        this.h.v(new agko(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(agnh agnhVar) {
        String d = agnhVar.d();
        agnhVar.a();
        agnhVar.c();
        d.length();
        this.h.v(new agkq(agnhVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(String str) {
        String.valueOf(str).length();
        this.h.v(new agkt(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(String str) {
        String.valueOf(str).length();
        this.h.v(new agkp(str));
    }

    @Override // defpackage.agsl
    public final void u(String str) {
        this.h.s(new agex(this, str, 0));
    }

    @Override // defpackage.agsl
    public final void v(final String str, final ykl yklVar) {
        zhq.m(str);
        this.i.execute(new Runnable() { // from class: agew
            @Override // java.lang.Runnable
            public final void run() {
                agff agffVar = agff.this;
                ykl yklVar2 = yklVar;
                String str2 = str;
                if (agffVar.h.z()) {
                    yklVar2.b(null, agffVar.c(str2));
                }
            }
        });
    }

    @Override // defpackage.agsl
    public final void w(String str) {
        this.h.s(new agex(this, str, 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(String str) {
        yjk.e();
        t(str);
        if (((agil) this.j.get()).C(str)) {
            q(str);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append("[Offline] Failed removing playlist ");
        sb.append(str);
        sb.append(" from database");
        zga.b(sb.toString());
    }

    public final void y(String str, String str2) {
        for (agsx agsxVar : ((akgl) this.r.get()).m(str)) {
            if (agsxVar.i(str)) {
                r(agsxVar.c());
            }
        }
        agnf agnfVar = (agnf) this.t.remove(str);
        if (agnfVar == null) {
            return;
        }
        ((agil) this.j.get()).V(str, agnfVar);
        if (!this.t.isEmpty() || str2 == null) {
            return;
        }
        str2.length();
        this.h.v(new agkr(str2));
    }

    @Override // defpackage.agsl
    public final void z() {
        this.i.execute(new Runnable() { // from class: ageu
            @Override // java.lang.Runnable
            public final void run() {
                long j;
                final agff agffVar = agff.this;
                if (agffVar.h.z()) {
                    long d = agffVar.b.d();
                    if (agffVar.v == 0 || d - agffVar.v >= agff.a) {
                        agffVar.v = d;
                        long q = ((agsg) agffVar.d.get()).q(agffVar.c);
                        if (q <= 0) {
                            final agfa agfaVar = new agfa(agffVar);
                            if (agffVar.h.z()) {
                                agffVar.i.execute(new Runnable() { // from class: agev
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        agfaVar.b(null, agff.this.m());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        atoy n = agzr.n(agffVar.w);
                        if (n != null && n.g) {
                            return;
                        }
                        Cursor rawQuery = ((agil) agffVar.j.get()).e.a.a().rawQuery("SELECT min(saved_timestamp) FROM playlistsV13", null);
                        try {
                            if (rawQuery.moveToFirst()) {
                                j = rawQuery.getLong(0);
                            } else {
                                rawQuery.close();
                                j = Long.MAX_VALUE;
                            }
                            if (agffVar.b.c() > j + TimeUnit.SECONDS.toMillis(q)) {
                                ((agtq) agffVar.f.get()).e(agffVar.c);
                            }
                        } finally {
                            rawQuery.close();
                        }
                    }
                }
            }
        });
    }
}
