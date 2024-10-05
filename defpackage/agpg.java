package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpg {
    public final afsx a;
    public agpa e;
    private final ysy f;
    private final acpz g;
    private final agoz h;
    private final Queue i = new PriorityQueue(1, new agpf(0));
    final Map b = new HashMap();
    final Map c = new HashMap();
    final Set d = new HashSet();

    public agpg(ysy ysyVar, acpz acpzVar, agoz agozVar, afsx afsxVar) {
        this.f = ysyVar;
        this.g = acpzVar;
        this.h = agozVar;
        this.a = afsxVar;
    }

    private final Set l(agov agovVar, boolean z) {
        agov agovVar2;
        HashSet hashSet = new HashSet();
        if (agovVar.a().h() && (agovVar2 = (agov) this.b.get(agovVar.a().c())) != null) {
            agovVar2.f.remove(agovVar.a);
            if (z) {
                agovVar2.j = true;
            }
            if (!agovVar2.d()) {
                this.b.remove(agovVar2.a);
                if (agovVar2.j) {
                    hashSet.addAll(d(agovVar2));
                } else {
                    hashSet.addAll(e(agovVar2));
                }
            }
        }
        return hashSet;
    }

    private final boolean m(agov agovVar) {
        atpo atpoVar = agovVar.c.e;
        if (atpoVar == null) {
            atpoVar = atpo.b;
        }
        for (atpl atplVar : new aonw(atpoVar.e, atpo.a)) {
            atpl atplVar2 = atpl.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_UNKNOWN;
            int ordinal = atplVar.ordinal();
            if (ordinal != 2) {
                if (ordinal == 3 && (!this.f.p() || !this.f.r())) {
                    return false;
                }
            } else if (!this.f.p()) {
                return false;
            }
        }
        return true;
    }

    private final void n(atpv atpvVar, String str, int i) {
        acpz acpzVar = this.g;
        acpx acpxVar = new acpx(i - 1, 4);
        aone createBuilder = aqwx.a.createBuilder();
        createBuilder.copyOnWrite();
        aqwx aqwxVar = (aqwx) createBuilder.instance;
        atpvVar.getClass();
        aqwxVar.e = atpvVar;
        aqwxVar.b |= 4;
        acpxVar.a = (aqwx) createBuilder.build();
        acpzVar.c(acpxVar, aqxl.FLOW_TYPE_OFFLINE_ORCHESTRATION, str);
    }

    private static aone o(agov agovVar) {
        aone createBuilder = atpv.a.createBuilder();
        aone createBuilder2 = atpw.a.createBuilder();
        String str = agovVar.a;
        createBuilder2.copyOnWrite();
        atpw atpwVar = (atpw) createBuilder2.instance;
        str.getClass();
        atpwVar.b |= 1;
        atpwVar.c = str;
        createBuilder.copyOnWrite();
        atpv atpvVar = (atpv) createBuilder.instance;
        atpw atpwVar2 = (atpw) createBuilder2.build();
        atpwVar2.getClass();
        atpvVar.h = atpwVar2;
        atpvVar.b |= 32;
        int i = agovVar.b;
        createBuilder.copyOnWrite();
        atpv atpvVar2 = (atpv) createBuilder.instance;
        atpvVar2.b |= 1;
        atpvVar2.c = i;
        String g = aalt.g(agovVar.c.d);
        createBuilder.copyOnWrite();
        atpv atpvVar3 = (atpv) createBuilder.instance;
        atpvVar3.b |= 2;
        atpvVar3.d = g;
        int bU = anaf.bU(agovVar.c.c);
        int i2 = bU != 0 ? bU : 1;
        createBuilder.copyOnWrite();
        atpv atpvVar4 = (atpv) createBuilder.instance;
        atpvVar4.e = i2 - 1;
        atpvVar4.b |= 4;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized agov a() {
        agov agovVar;
        agovVar = (agov) this.i.poll();
        while (agovVar != null) {
            if (m(agovVar)) {
                break;
            }
            this.d.add(agovVar);
            agovVar = (agov) this.i.poll();
        }
        return agovVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized amru b(agov agovVar, agox agoxVar) {
        agov agovVar2;
        amrp f = amru.f();
        f.h(agovVar);
        if (agoxVar.a() <= 1) {
            return f.g();
        }
        int a = agoxVar.a();
        while (true) {
            a--;
            if (a <= 0 || (agovVar2 = (agov) this.i.peek()) == null || !m(agovVar2) || agovVar.b != agovVar2.b) {
                break;
            }
            int bU = anaf.bU(agovVar.c.c);
            if (bU == 0) {
                bU = 1;
            }
            int bU2 = anaf.bU(agovVar2.c.c);
            if (bU2 == 0) {
                bU2 = 1;
            }
            if (bU != bU2 || !agoxVar.b().a(agovVar2.c)) {
                break;
            }
            this.i.poll();
            f.h(agovVar2);
        }
        return f.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Set c(List list, agov agovVar) {
        HashSet hashSet = new HashSet();
        if (list.isEmpty()) {
            return hashSet;
        }
        hashSet.addAll(list);
        if (agovVar != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                agov agovVar2 = (agov) it.next();
                if (agovVar2.a().h() && ((String) agovVar2.a().c()).equals(agovVar.a)) {
                    agovVar.f.add(agovVar2.a);
                    hashSet.add(agovVar);
                }
            }
            this.b.put(agovVar.a, agovVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            agov agovVar3 = (agov) it2.next();
            if (agovVar3.b().h()) {
                String str = (String) agovVar3.b().c();
                if (!this.c.containsKey(str)) {
                    this.c.put(str, new HashSet());
                }
                ((Set) this.c.get(str)).add(agovVar3);
            } else {
                arrayList.add(agovVar3);
            }
            k(agovVar3, 2);
        }
        this.i.addAll(arrayList);
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Set d(agov agovVar) {
        HashSet hashSet;
        hashSet = new HashSet();
        agovVar.c();
        hashSet.add(agovVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = agovVar.c.g.iterator();
        while (it.hasNext()) {
            try {
                arrayList.addAll(this.h.a((atpq) it.next(), null));
            } catch (agpe e) {
                int i = agovVar.b;
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 90);
                sb.append("[Offline] Add failedChainAction failed on original action type: ");
                sb.append(i);
                sb.append(" ErrorMessage: ");
                sb.append(message);
                zga.b(sb.toString());
            }
        }
        hashSet.addAll(new HashSet(c(arrayList, null)));
        String str = agovVar.a;
        HashSet hashSet2 = new HashSet();
        Set<agov> set = (Set) this.c.remove(str);
        if (set != null) {
            for (agov agovVar2 : set) {
                k(agovVar2, 5);
                hashSet2.addAll(d(agovVar2));
            }
        }
        hashSet.addAll(hashSet2);
        hashSet.addAll(l(agovVar, true));
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Set e(agov agovVar) {
        HashSet hashSet = new HashSet();
        hashSet.add(agovVar);
        if (agovVar.d()) {
            return hashSet;
        }
        agovVar.c();
        Set set = (Set) this.c.remove(agovVar.a);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((agov) it.next()).h = null;
            }
            j(set);
            hashSet.addAll(set);
        }
        hashSet.addAll(l(agovVar, false));
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        this.e = null;
        this.i.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(agov agovVar, agou agouVar, List list, long j, long j2, boolean z) {
        aone o = o(agovVar);
        boolean z2 = false;
        if (agouVar.d && !z) {
            z2 = true;
        }
        o.copyOnWrite();
        atpv atpvVar = (atpv) o.instance;
        atpv atpvVar2 = atpv.a;
        atpvVar.b |= 16;
        atpvVar.g = z2;
        int i = agouVar.f;
        o.copyOnWrite();
        atpv atpvVar3 = (atpv) o.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        atpvVar3.f = i2;
        atpvVar3.b |= 8;
        o.copyOnWrite();
        atpv atpvVar4 = (atpv) o.instance;
        atpvVar4.b |= 128;
        atpvVar4.k = j;
        long millis = TimeUnit.NANOSECONDS.toMillis(agovVar.d);
        o.copyOnWrite();
        atpv atpvVar5 = (atpv) o.instance;
        atpvVar5.b |= 64;
        atpvVar5.j = j2 - millis;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agov agovVar2 = (agov) it.next();
            aone createBuilder = atpw.a.createBuilder();
            String str = agovVar2.a;
            createBuilder.copyOnWrite();
            atpw atpwVar = (atpw) createBuilder.instance;
            str.getClass();
            atpwVar.b |= 1;
            atpwVar.c = str;
            o.copyOnWrite();
            atpv atpvVar6 = (atpv) o.instance;
            atpw atpwVar2 = (atpw) createBuilder.build();
            atpwVar2.getClass();
            aony aonyVar = atpvVar6.i;
            if (!aonyVar.c()) {
                atpvVar6.i = aonm.mutableCopy(aonyVar);
            }
            atpvVar6.i.add(atpwVar2);
        }
        n((atpv) o.build(), agovVar.g, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h() {
        for (agov agovVar : new HashSet(this.d)) {
            if (m(agovVar)) {
                this.d.remove(agovVar);
                i(agovVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i(agov agovVar) {
        this.i.add(agovVar);
        agpa agpaVar = this.e;
        if (agpaVar != null) {
            agpaVar.a();
        }
    }

    public final void j(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i((agov) it.next());
        }
        agpa agpaVar = this.e;
        if (agpaVar != null) {
            agpaVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(agov agovVar, int i) {
        n((atpv) o(agovVar).build(), agovVar.g, i);
    }
}
