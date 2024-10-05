package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afrp implements afrw {
    final HashMap a;
    protected final afrz b;
    final double c;
    private final afrv d;
    private final shf e;
    private final ysy f;
    private Map g = new HashMap();
    private long h;
    private final double i;
    private final boolean j;
    private final ylf k;
    private final afqd l;

    public afrp(afqd afqdVar, afrz afrzVar, afrv afrvVar, ylf ylfVar, shf shfVar, ysy ysyVar) {
        this.l = afqdVar;
        this.b = afrzVar;
        this.d = afrvVar;
        this.k = ylfVar;
        this.e = shfVar;
        this.f = ysyVar;
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        this.j = afqdVar.k();
        this.i = afqdVar.a();
        this.c = afqdVar.b();
        long d = afqdVar.d();
        this.h = shfVar.c() + TimeUnit.SECONDS.toMillis(d <= 0 ? 5L : d);
        hashMap.put(aqjm.DELAYED_EVENT_TIER_DEFAULT, new afsf(this.h, "delayed_event_dispatch_default_tier_one_off_task", afqdVar.g()));
        hashMap.put(aqjm.DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY, new afsf(this.h, "delayed_event_dispatch_dispatch_to_empty_tier_one_off_task", afqdVar.h()));
        hashMap.put(aqjm.DELAYED_EVENT_TIER_FAST, new afsf(this.h, "delayed_event_dispatch_fast_tier_one_off_task", afqdVar.i()));
        hashMap.put(aqjm.DELAYED_EVENT_TIER_IMMEDIATE, new afsf(this.h, "not_applicable_delayed_event_dispatch_immediate_tier_one_off_task", afqdVar.j()));
    }

    private final afsf n(aqjm aqjmVar) {
        if (!s(aqjmVar)) {
            p("Invalid tier is supplied in getInfoByTier. Falls back to default tier.", null);
            aqjmVar = aqjm.DELAYED_EVENT_TIER_DEFAULT;
        }
        return (afsf) this.a.get(aqjmVar);
    }

    private final synchronized void o(aqjm aqjmVar) {
        String valueOf = String.valueOf(aqjmVar.name());
        w(valueOf.length() != 0 ? "Attempt to dispatch for tier ".concat(valueOf) : new String("Attempt to dispatch for tier "));
        yjk.e();
        if (this.g.isEmpty()) {
            String name = aqjmVar.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 89);
            sb.append("Failed delayed event dispatch, no dispatchers in dispatchEventsForcedByTierUntilEmpty.(");
            sb.append(name);
            sb.append(").");
            p(sb.toString(), null);
            return;
        }
        if (!s(aqjmVar)) {
            p("Invalid tier is supplied in dispatchEventsForcedByTierUntilEmpty. Falls back to default tier.", null);
            aqjmVar = aqjm.DELAYED_EVENT_TIER_DEFAULT;
        }
        if (r(new HashMap(), aqjmVar)) {
            o(aqjmVar);
        }
    }

    private final void p(String str, Exception exc) {
        if (exc != null) {
            if (Math.random() < this.c) {
                zga.f("GEL_DELAYED_EVENT_DEBUG", str, exc);
            }
            if (this.j) {
                String valueOf = String.valueOf(str);
                afsi.d(1, 12, valueOf.length() != 0 ? "GEL_DELAYED_EVENT_DEBUG ".concat(valueOf) : new String("GEL_DELAYED_EVENT_DEBUG "), exc, this.i);
                return;
            }
            return;
        }
        if (Math.random() < this.c) {
            zga.c("GEL_DELAYED_EVENT_DEBUG", str);
        }
        if (this.j) {
            String valueOf2 = String.valueOf(str);
            afsi.e(1, 12, valueOf2.length() != 0 ? "GEL_DELAYED_EVENT_MONITORING_ERROR ".concat(valueOf2) : new String("GEL_DELAYED_EVENT_MONITORING_ERROR "), this.i);
        }
    }

    private final void q(aqjm aqjmVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("tier_type", aqjmVar.f);
        this.k.e(n(aqjmVar).a, r10.b.c, false, 1, bundle, null, false);
    }

    private final boolean r(Map map, aqjm aqjmVar) {
        long j;
        int i;
        int i2;
        long c = this.e.c();
        n(aqjmVar).c = c;
        long j2 = c - this.h;
        this.h = c;
        ArrayList arrayList = new ArrayList();
        List b = b();
        HashMap hashMap = new HashMap();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            aone aoneVar = (aone) it.next();
            String str = ((ovz) aoneVar.instance).d;
            afrs afrsVar = (afrs) this.g.get(str);
            if (afrsVar == null) {
                arrayList.add(aoneVar);
                String valueOf = String.valueOf(str);
                p(valueOf.length() != 0 ? "Failed to find delayed event dispatcher for type ".concat(valueOf) : new String("Failed to find delayed event dispatcher for type "), null);
            } else {
                afqq a = afrsVar.a();
                long c2 = this.e.c();
                Iterator it2 = it;
                long j3 = j2;
                if (c2 - ((ovz) aoneVar.instance).f <= TimeUnit.HOURS.toMillis(a.b())) {
                    ovz ovzVar = (ovz) aoneVar.instance;
                    if (ovzVar.i <= 0 || c2 - ovzVar.h <= TimeUnit.MINUTES.toMillis(a.d())) {
                        aqjm aqjmVar2 = aqjm.DELAYED_EVENT_TIER_DEFAULT;
                        ovz ovzVar2 = (ovz) aoneVar.instance;
                        if ((ovzVar2.b & 512) != 0) {
                            aqjm b2 = aqjm.b(ovzVar2.l);
                            if (b2 == null) {
                                b2 = aqjm.DELAYED_EVENT_TIER_UNSPECIFIED;
                            }
                            if (s(b2) && (aqjmVar2 = aqjm.b(((ovz) aoneVar.instance).l)) == null) {
                                aqjmVar2 = aqjm.DELAYED_EVENT_TIER_UNSPECIFIED;
                            }
                        }
                        if (!map.containsKey(afrsVar)) {
                            map.put(afrsVar, new HashMap());
                        }
                        Map map2 = (Map) map.get(afrsVar);
                        if (!map2.containsKey(aqjmVar2)) {
                            map2.put(aqjmVar2, new ArrayList());
                        }
                        ((List) map2.get(aqjmVar2)).add(aoneVar);
                        v(hashMap, str, false);
                        it = it2;
                        j2 = j3;
                    }
                }
                arrayList.add(aoneVar);
                v(hashMap, str, true);
                it = it2;
                j2 = j3;
            }
        }
        long j4 = j2;
        afrv afrvVar = this.d;
        if (afrvVar != null && afrvVar.k()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                this.d.j((String) entry.getKey(), ((Integer) ((hx) entry.getValue()).a).intValue(), ((Integer) ((hx) entry.getValue()).b).intValue());
            }
        }
        Set u = u(aqjmVar, map);
        HashSet hashSet = new HashSet();
        HashMap hashMap2 = new HashMap();
        Iterator it3 = u.iterator();
        while (it3.hasNext()) {
            afrs afrsVar2 = (afrs) it3.next();
            ArrayList arrayList2 = new ArrayList();
            Map map3 = (Map) map.get(afrsVar2);
            ArrayList arrayList3 = new ArrayList(map3.keySet());
            Collections.sort(arrayList3, Collections.reverseOrder());
            if (map3.containsKey(aqjmVar)) {
                arrayList3.remove(aqjmVar);
                arrayList3.add(0, aqjmVar);
            }
            int a2 = afrsVar2.a().a();
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                aqjm aqjmVar3 = (aqjm) arrayList3.get(i3);
                int size2 = a2 - arrayList2.size();
                if (size2 <= 0) {
                    break;
                }
                Iterator it4 = it3;
                List list = (List) map3.get(aqjmVar3);
                ArrayList arrayList4 = arrayList3;
                if (size2 < list.size()) {
                    i = a2;
                    i2 = size;
                    ArrayList arrayList5 = new ArrayList(list.subList(0, size2));
                    arrayList2.addAll(arrayList5);
                    hashSet.addAll(arrayList5);
                    map3.put(aqjmVar3, new ArrayList(list.subList(size2, list.size())));
                } else {
                    i = a2;
                    i2 = size;
                    arrayList2.addAll(list);
                    hashSet.addAll(list);
                    map3.remove(aqjmVar3);
                    if (map3.isEmpty()) {
                        map.remove(afrsVar2);
                    }
                }
                i3++;
                arrayList3 = arrayList4;
                it3 = it4;
                a2 = i;
                size = i2;
            }
            hashMap2.put(afrsVar2, arrayList2);
            it3 = it3;
        }
        hashSet.addAll(arrayList);
        this.b.c(hashSet);
        for (afrs afrsVar3 : hashMap2.keySet()) {
            String b3 = afrsVar3.b();
            w(b3.length() != 0 ? "Start to dispatch events in tier dispatch event type ".concat(b3) : new String("Start to dispatch events in tier dispatch event type "));
            List list2 = (List) hashMap2.get(afrsVar3);
            List<aone> subList = list2.subList(0, Math.min(afrsVar3.a().a(), list2.size()));
            if (!subList.isEmpty()) {
                afrv afrvVar2 = this.d;
                if (afrvVar2 == null || !afrvVar2.k()) {
                    j = j4;
                } else {
                    j = j4;
                    this.d.h(afrsVar3.b(), subList.size(), j);
                }
                HashMap hashMap3 = new HashMap();
                for (aone aoneVar2 : subList) {
                    ovz ovzVar3 = (ovz) aoneVar2.instance;
                    hx hxVar = new hx(ovzVar3.g, ovzVar3.j);
                    if (!hashMap3.containsKey(hxVar)) {
                        hashMap3.put(hxVar, new ArrayList());
                    }
                    ((List) hashMap3.get(hxVar)).add(aoneVar2);
                }
                for (hx hxVar2 : hashMap3.keySet()) {
                    List list3 = (List) hashMap3.get(hxVar2);
                    afrm afrmVar = new afrm(new afsg((String) hxVar2.b, list3.isEmpty() ? false : ((ovz) ((aone) list3.get(0)).instance).k), aqjmVar);
                    String b4 = afrsVar3.b();
                    w(b4.length() != 0 ? "Call dispatcher to dispatch events for each identity in tier dispatch  event type ".concat(b4) : new String("Call dispatcher to dispatch events for each identity in tier dispatch  event type "));
                    afrsVar3.c((String) hxVar2.a, afrmVar, list3);
                }
                j4 = j;
            }
        }
        return !u(aqjmVar, map).isEmpty();
    }

    private final boolean s(aqjm aqjmVar) {
        return this.a.containsKey(aqjmVar);
    }

    private final boolean t() {
        return this.f.o() && !(this.l.l() && this.f.m());
    }

    private static final Set u(aqjm aqjmVar, Map map) {
        HashSet hashSet = new HashSet();
        for (afrs afrsVar : map.keySet()) {
            if (((Map) map.get(afrsVar)).containsKey(aqjmVar)) {
                hashSet.add(afrsVar);
            }
        }
        return hashSet;
    }

    private static final void v(Map map, String str, boolean z) {
        hx hxVar;
        if (!map.containsKey(str)) {
            map.put(str, new hx(0, 0));
        }
        hx hxVar2 = (hx) map.get(str);
        if (z) {
            hxVar = new hx((Integer) hxVar2.a, Integer.valueOf(((Integer) hxVar2.b).intValue() + 1));
        } else {
            hxVar = new hx(Integer.valueOf(((Integer) hxVar2.a).intValue() + 1), (Integer) hxVar2.b);
        }
        map.put(str, hxVar);
    }

    private static final void w(String str) {
        ynm.i(afxc.a(), new afrn(str, 0));
    }

    @Override // defpackage.afrw
    public final double a() {
        if (this.l.k()) {
            return this.l.a();
        }
        return -1.0d;
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        try {
            yok a = this.b.a();
            while (a.hasNext()) {
                arrayList.add((aone) a.next());
            }
            w("Load all message from store for tier dispatch!");
            return arrayList;
        } catch (SQLException e) {
            if (this.l.m() && (e instanceof SQLiteBlobTooBigException)) {
                this.b.d();
            }
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
            sb.append("The DB is deleted since large record > 2MB is encountered: ");
            sb.append(valueOf);
            afro afroVar = new afro(sb.toString());
            p("DB dropped on large record: ", afroVar);
            throw afroVar;
        }
    }

    @Override // defpackage.afrw
    public final void c(Set set) {
        amrw i = amrz.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            afrs afrsVar = (afrs) it.next();
            String b = afrsVar.b();
            if (!TextUtils.isEmpty(b)) {
                i.g(b, afrsVar);
            }
        }
        this.g = i.c();
    }

    @Override // defpackage.afrw
    public final synchronized void d() {
        yjk.e();
        if (this.g.isEmpty()) {
            p("Failed delayed event dispatch, no dispatchers in dispatchAllEvents.", null);
            return;
        }
        if (t()) {
            List<aqjm> asList = Arrays.asList(aqjm.values());
            Collections.sort(asList, Collections.reverseOrder());
            for (aqjm aqjmVar : asList) {
                if (s(aqjmVar)) {
                    o(aqjmVar);
                }
            }
        }
    }

    @Override // defpackage.afrw
    public final synchronized void e(aqjm aqjmVar) {
        yjk.e();
        if (this.e.c() - n(aqjmVar).c < TimeUnit.SECONDS.toMillis(r0.b.c)) {
            String valueOf = String.valueOf(aqjmVar.name());
            w(valueOf.length() != 0 ? "Schedule a dispatch in the future since attempting to dispatch too soon for tier ".concat(valueOf) : new String("Schedule a dispatch in the future since attempting to dispatch too soon for tier "));
            q(aqjmVar);
            return;
        }
        f(aqjmVar);
    }

    public final synchronized void f(aqjm aqjmVar) {
        String valueOf = String.valueOf(aqjmVar.name());
        w(valueOf.length() != 0 ? "Attempt to dispatch for tier ".concat(valueOf) : new String("Attempt to dispatch for tier "));
        yjk.e();
        if (this.g.isEmpty()) {
            String name = aqjmVar.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 78);
            sb.append("Failed delayed event dispatch, no dispatchers in dispatchEventsForcedByTier(");
            sb.append(name);
            sb.append(").");
            p(sb.toString(), null);
            return;
        }
        if (!s(aqjmVar)) {
            p("Invalid tier is supplied in dispatchEventsForcedByTier. Falls back to default tier.", null);
            aqjmVar = aqjm.DELAYED_EVENT_TIER_DEFAULT;
        }
        if (r(new HashMap(), aqjmVar)) {
            int am = aobq.am(n(aqjmVar).b.e);
            if (am != 0 && am == 3) {
                f(aqjmVar);
                return;
            }
            q(aqjmVar);
        }
    }

    @Override // defpackage.afrw
    public final void g(afqq afqqVar, List list, cnq cnqVar) {
        yjk.e();
        if (adyu.A(cnqVar)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aone aoneVar = (aone) it.next();
            if ((((ovz) aoneVar.instance).b & 32) == 0) {
                long c = this.e.c();
                aoneVar.copyOnWrite();
                ovz ovzVar = (ovz) aoneVar.instance;
                ovzVar.b |= 32;
                ovzVar.h = c;
            }
            int i = ((ovz) aoneVar.instance).i;
            if (i >= afqqVar.c()) {
                it.remove();
            } else {
                aoneVar.copyOnWrite();
                ovz ovzVar2 = (ovz) aoneVar.instance;
                ovzVar2.b |= 64;
                ovzVar2.i = i + 1;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        this.b.e(list);
        q(aqjm.DELAYED_EVENT_TIER_DEFAULT);
    }

    @Override // defpackage.afrw
    public final boolean h() {
        return this.l.k();
    }

    @Override // defpackage.afrw
    public final /* synthetic */ List i() {
        throw new RuntimeException("NotImplemented");
    }

    @Override // defpackage.afrw
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.afrw
    public final void k(aone aoneVar) {
        l(aqjm.DELAYED_EVENT_TIER_DEFAULT, aoneVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0076, code lost:
    
        if ((r6.e.c() - r6.h) >= (java.util.concurrent.TimeUnit.SECONDS.toMillis(r8.intValue()) * 3)) goto L17;
     */
    @Override // defpackage.afrw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.aqjm r7, defpackage.aone r8) {
        /*
            r6 = this;
            defpackage.yjk.e()
            aqjm r0 = defpackage.aqjm.DELAYED_EVENT_TIER_IMMEDIATE
            if (r7 != r0) goto L31
            ysy r7 = r6.f
            boolean r7 = r7.o()
            if (r7 == 0) goto L2f
            aqjm r7 = defpackage.aqjm.DELAYED_EVENT_TIER_IMMEDIATE
            r8.copyOnWrite()
            aonm r0 = r8.instance
            ovz r0 = (defpackage.ovz) r0
            ovz r1 = defpackage.ovz.a
            int r7 = r7.f
            r0.l = r7
            int r7 = r0.b
            r7 = r7 | 512(0x200, float:7.17E-43)
            r0.b = r7
            afrz r7 = r6.b
            r7.f(r8)
            aqjm r7 = defpackage.aqjm.DELAYED_EVENT_TIER_IMMEDIATE
            r6.f(r7)
            return
        L2f:
            aqjm r7 = defpackage.aqjm.DELAYED_EVENT_TIER_FAST
        L31:
            r8.copyOnWrite()
            aonm r0 = r8.instance
            ovz r0 = (defpackage.ovz) r0
            ovz r1 = defpackage.ovz.a
            int r1 = r7.f
            r0.l = r1
            int r1 = r0.b
            r1 = r1 | 512(0x200, float:7.17E-43)
            r0.b = r1
            afrz r0 = r6.b
            r0.f(r8)
            afqd r8 = r6.l
            aqji r8 = r8.g()
            int r8 = r8.c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r0 = r8.intValue()
            if (r0 != 0) goto L5c
            goto L79
        L5c:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            int r8 = r8.intValue()
            long r1 = (long) r8
            long r0 = r0.toMillis(r1)
            shf r8 = r6.e
            long r2 = r8.c()
            long r4 = r6.h
            long r2 = r2 - r4
            r4 = 3
            long r0 = r0 * r4
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 < 0) goto L79
            goto L7f
        L79:
            boolean r8 = r6.t()
            if (r8 != 0) goto La0
        L7f:
            java.lang.String r8 = r7.name()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "Schedule a dispatch in the future when cold send or no network for tier "
            int r1 = r8.length()
            if (r1 == 0) goto L94
            java.lang.String r8 = r0.concat(r8)
            goto L99
        L94:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
        L99:
            w(r8)
            r6.q(r7)
            return
        La0:
            r6.e(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afrp.l(aqjm, aone):void");
    }

    @Override // defpackage.afrw
    public final void m(aone aoneVar) {
        this.b.g(aoneVar);
    }
}
