package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ree {
    public BitSet a;
    final /* synthetic */ rej b;
    private String c;
    private boolean d;
    private rlf e;
    private BitSet f;
    private Map g;
    private Map h;

    public ree(rej rejVar, String str) {
        this.b = rejVar;
        this.c = str;
        this.d = true;
        this.a = new BitSet();
        this.f = new BitSet();
        this.g = new adz();
        this.h = new adz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rkw a(int i) {
        ArrayList arrayList;
        List list;
        aone createBuilder = rkw.a.createBuilder();
        createBuilder.copyOnWrite();
        rkw rkwVar = (rkw) createBuilder.instance;
        rkwVar.b |= 1;
        rkwVar.c = i;
        boolean z = this.d;
        createBuilder.copyOnWrite();
        rkw rkwVar2 = (rkw) createBuilder.instance;
        rkwVar2.b |= 8;
        rkwVar2.f = z;
        rlf rlfVar = this.e;
        if (rlfVar != null) {
            createBuilder.copyOnWrite();
            rkw rkwVar3 = (rkw) createBuilder.instance;
            rkwVar3.e = rlfVar;
            rkwVar3.b |= 4;
        }
        aone createBuilder2 = rlf.a.createBuilder();
        createBuilder2.u(rkj.l(this.a));
        createBuilder2.v(rkj.l(this.f));
        Object obj = this.g;
        if (obj == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(((aeg) obj).j);
            Iterator it = this.g.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                Long l = (Long) this.g.get(Integer.valueOf(intValue));
                if (l != null) {
                    aone createBuilder3 = rkx.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    rkx rkxVar = (rkx) createBuilder3.instance;
                    rkxVar.b |= 1;
                    rkxVar.c = intValue;
                    long longValue = l.longValue();
                    createBuilder3.copyOnWrite();
                    rkx rkxVar2 = (rkx) createBuilder3.instance;
                    rkxVar2.b |= 2;
                    rkxVar2.d = longValue;
                    arrayList2.add((rkx) createBuilder3.build());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            createBuilder2.copyOnWrite();
            rlf rlfVar2 = (rlf) createBuilder2.instance;
            rlfVar2.a();
            aolo.addAll((Iterable) arrayList, (List) rlfVar2.d);
        }
        Object obj2 = this.h;
        if (obj2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(((aeg) obj2).j);
            for (Integer num : this.h.keySet()) {
                aone createBuilder4 = rlg.a.createBuilder();
                int intValue2 = num.intValue();
                createBuilder4.copyOnWrite();
                rlg rlgVar = (rlg) createBuilder4.instance;
                rlgVar.b |= 1;
                rlgVar.c = intValue2;
                List list2 = (List) this.h.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    createBuilder4.copyOnWrite();
                    rlg rlgVar2 = (rlg) createBuilder4.instance;
                    aonx aonxVar = rlgVar2.d;
                    if (!aonxVar.c()) {
                        rlgVar2.d = aonm.mutableCopy(aonxVar);
                    }
                    aolo.addAll((Iterable) list2, (List) rlgVar2.d);
                }
                arrayList3.add((rlg) createBuilder4.build());
            }
            list = arrayList3;
        }
        createBuilder2.copyOnWrite();
        rlf rlfVar3 = (rlf) createBuilder2.instance;
        rlfVar3.b();
        aolo.addAll((Iterable) list, (List) rlfVar3.e);
        createBuilder.copyOnWrite();
        rkw rkwVar4 = (rkw) createBuilder.instance;
        rlf rlfVar4 = (rlf) createBuilder2.build();
        rlfVar4.getClass();
        rkwVar4.d = rlfVar4;
        rkwVar4.b |= 2;
        return (rkw) createBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(reh rehVar) {
        int a = rehVar.a();
        Boolean bool = rehVar.d;
        if (bool != null) {
            this.f.set(a, bool.booleanValue());
        }
        Boolean bool2 = rehVar.e;
        if (bool2 != null) {
            this.a.set(a, bool2.booleanValue());
        }
        if (rehVar.f != null) {
            Map map = this.g;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = rehVar.f.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.g.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (rehVar.g != null) {
            Map map2 = this.h;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.h.put(valueOf2, list);
            }
            if (rehVar.c()) {
                list.clear();
            }
            axus.b();
            if (this.b.J().p(this.c, rfd.Z) && rehVar.b()) {
                list.clear();
            }
            axus.b();
            if (!this.b.J().p(this.c, rfd.Z)) {
                list.add(Long.valueOf(rehVar.g.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(rehVar.g.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public ree(rej rejVar, String str, rlf rlfVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.b = rejVar;
        this.c = str;
        this.a = bitSet;
        this.f = bitSet2;
        this.g = map;
        this.h = new adz();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.h.put(num, arrayList);
        }
        this.d = false;
        this.e = rlfVar;
    }
}
