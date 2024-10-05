package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tna implements anfz {
    public final /* synthetic */ tnj a;
    private final /* synthetic */ int b;

    public /* synthetic */ tna(tnj tnjVar, int i) {
        this.b = i;
        this.a = tnjVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.b;
        if (i == 0) {
            final tnj tnjVar = this.a;
            final ArrayList arrayList = new ArrayList();
            for (tkv tkvVar : (List) obj) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                tku tkuVar = tkvVar.c;
                if (tkuVar == null) {
                    tkuVar = tku.a;
                }
                if (rwh.aS(Math.min(timeUnit.toMillis(tkuVar.c), rwh.aL(tkvVar)), tnjVar.f)) {
                    tnjVar.e.h(1052, tkvVar.d, tkvVar.f, tkvVar.r, tkvVar.s);
                    if (rwh.aT(tkvVar)) {
                        rwh.aQ(tnjVar.a, tnjVar.h, tkvVar, tnjVar.g);
                    }
                } else {
                    arrayList.add(tkvVar);
                }
            }
            return amkq.n(tnjVar.b.k(), new anfz() { // from class: tnb
                @Override // defpackage.anfz
                public final anhy a(Object obj2) {
                    tnj tnjVar2 = tnj.this;
                    return amkq.n(tnjVar2.b.m(arrayList), new tna(tnjVar2, 3), tnjVar2.j);
                }
            }, tnjVar.j);
        }
        int i2 = 1;
        if (i == 1) {
            final tnj tnjVar2 = this.a;
            ArrayList arrayList2 = new ArrayList();
            for (Pair pair : (List) obj) {
                tld tldVar = (tld) pair.first;
                tkv tkvVar2 = (tkv) pair.second;
                Long valueOf = Long.valueOf(rwh.aL(tkvVar2));
                String str = tkvVar2.d;
                int i3 = tsx.a;
                if (rwh.aS(valueOf.longValue(), tnjVar2.f)) {
                    tnjVar2.e.h(1051, tkvVar2.d, tkvVar2.f, tkvVar2.r, tkvVar2.s);
                    String str2 = tkvVar2.d;
                    arrayList2.add(tldVar);
                    if (rwh.aT(tkvVar2)) {
                        rwh.aQ(tnjVar2.a, tnjVar2.h, tkvVar2, tnjVar2.g);
                    }
                }
            }
            return amkq.m(tnjVar2.b.j(arrayList2), new amml() { // from class: tmz
                @Override // defpackage.amml
                public final Object apply(Object obj2) {
                    tnj tnjVar3 = tnj.this;
                    if (((Boolean) obj2).booleanValue()) {
                        return null;
                    }
                    tnjVar3.e.g(1036);
                    tsx.c("%s: Failed to remove expired groups!", "ExpirationHandler");
                    return null;
                }
            }, tnjVar2.j);
        }
        int i4 = 2;
        if (i == 2) {
            final tnj tnjVar3 = this.a;
            final Set set = (Set) obj;
            return amkq.n(tnjVar3.d.c(), new anfz() { // from class: tnd
                @Override // defpackage.anfz
                public final anhy a(Object obj2) {
                    final tnj tnjVar4 = tnj.this;
                    Set set2 = set;
                    final ArrayList arrayList3 = new ArrayList();
                    final ArrayList arrayList4 = new ArrayList();
                    int i5 = 0;
                    final AtomicInteger atomicInteger = new AtomicInteger(0);
                    ArrayList arrayList5 = new ArrayList();
                    for (final tlg tlgVar : (List) obj2) {
                        if (!set2.contains(tlgVar)) {
                            arrayList5.add(amkq.n(tnjVar4.d.e(tlgVar), new anfz() { // from class: tnc
                                @Override // defpackage.anfz
                                public final anhy a(Object obj3) {
                                    final tnj tnjVar5 = tnj.this;
                                    List list = arrayList4;
                                    final tlg tlgVar2 = tlgVar;
                                    final AtomicInteger atomicInteger2 = atomicInteger;
                                    tlh tlhVar = (tlh) obj3;
                                    if (tlhVar != null && tlhVar.e) {
                                        list.add(rwh.aW(tnjVar5.a, tlhVar.g));
                                    }
                                    trf trfVar = tnjVar5.c;
                                    return amkq.m(anfq.i(trfVar.c.e(tlgVar2), new tre(trfVar, tlgVar2, 3), trfVar.k), new amml() { // from class: tnh
                                        @Override // defpackage.amml
                                        public final Object apply(Object obj4) {
                                            tnj tnjVar6 = tnj.this;
                                            AtomicInteger atomicInteger3 = atomicInteger2;
                                            tlg tlgVar3 = tlgVar2;
                                            if (((Boolean) obj4).booleanValue()) {
                                                atomicInteger3.getAndIncrement();
                                                return null;
                                            }
                                            tnjVar6.e.g(1036);
                                            tsx.d("%s: Unsubscribe from file %s failed!", "ExpirationHandler", tlgVar3);
                                            return null;
                                        }
                                    }, tnjVar5.j);
                                }
                            }, tnjVar4.j));
                        } else {
                            arrayList5.add(amkq.m(tnjVar4.c.b(tlgVar), new tni(arrayList3, 1), tnjVar4.j));
                        }
                    }
                    tnjVar4.k.k();
                    final ArrayList arrayList6 = new ArrayList();
                    arrayList5.add(amkq.m(amkq.m(tnjVar4.b.c(), new amml() { // from class: tnf
                        @Override // defpackage.amml
                        public final Object apply(Object obj3) {
                            tnj tnjVar5 = tnj.this;
                            List list = arrayList6;
                            Iterator it = ((List) obj3).iterator();
                            while (it.hasNext()) {
                                tkv tkvVar3 = (tkv) ((Pair) it.next()).second;
                                if (rwh.aT(tkvVar3)) {
                                    Iterator it2 = tkvVar3.n.iterator();
                                    while (it2.hasNext()) {
                                        list.add(rwh.aM(tnjVar5.a, tnjVar5.h, (tkt) it2.next(), tkvVar3));
                                    }
                                }
                            }
                            return list;
                        }
                    }, tnjVar4.j), new tni(arrayList3, i5), tnjVar4.j));
                    return amkq.j(arrayList5).a(new Callable() { // from class: tne
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            tnj tnjVar5 = tnj.this;
                            AtomicInteger atomicInteger2 = atomicInteger;
                            List list = arrayList4;
                            List list2 = arrayList3;
                            if (atomicInteger2.get() > 0) {
                                tnjVar5.e.i(4, atomicInteger2.get());
                            }
                            Uri aV = rwh.aV(tnjVar5.a, tnjVar5.h);
                            Iterator it = list.iterator();
                            int i6 = 0;
                            while (it.hasNext()) {
                                try {
                                    tnjVar5.g.f((Uri) it.next());
                                    i6++;
                                    tnjVar5.e.g(1086);
                                } catch (IOException e) {
                                    tnjVar5.e.g(1076);
                                    tsx.f(e, "%s: Failed to release unaccounted file!", "ExpirationHandler");
                                }
                            }
                            int i7 = tsx.a;
                            int a = tnjVar5.a(aV, list2);
                            if (a > 0) {
                                tnjVar5.e.i(5, a);
                            }
                            if (i6 <= 0) {
                                return null;
                            }
                            tnjVar5.e.i(8, i6);
                            return null;
                        }
                    }, tnjVar4.j);
                }
            }, tnjVar3.j);
        }
        if (i == 3) {
            tnj tnjVar4 = this.a;
            if (!((Boolean) obj).booleanValue()) {
                tnjVar4.e.g(1036);
                tsx.c("%s: Failed to write back stale groups!", "ExpirationHandler");
            }
            return anhv.a;
        }
        int i5 = 4;
        if (i == 4) {
            tnj tnjVar5 = this.a;
            return amkq.n(amkq.n(tnjVar5.b.c(), new tna(tnjVar5, 6), tnjVar5.j), new tna(tnjVar5, i4), tnjVar5.j);
        }
        if (i == 5) {
            tnj tnjVar6 = this.a;
            return amkq.n(amkq.n(tnjVar6.b.c(), new tna(tnjVar6, i2), tnjVar6.j), new tna(tnjVar6, i5), tnjVar6.j);
        }
        final tnj tnjVar7 = this.a;
        final HashSet hashSet = new HashSet();
        final ArrayList arrayList3 = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList3.add((tkv) ((Pair) it.next()).second);
        }
        return amkq.m(tnjVar7.b.e(), new amml() { // from class: tng
            @Override // defpackage.amml
            public final Object apply(Object obj2) {
                tnj tnjVar8 = tnj.this;
                List<tkv> list = arrayList3;
                Set set2 = hashSet;
                list.addAll((List) obj2);
                for (tkv tkvVar3 : list) {
                    for (tkt tktVar : tkvVar3.n) {
                        Context context = tnjVar8.a;
                        int bp = rwh.bp(tkvVar3.i);
                        if (bp == 0) {
                            bp = 1;
                        }
                        tme tmeVar = tnjVar8.i;
                        aone createBuilder = tlg.a.createBuilder();
                        String aP = rwh.aP(tktVar);
                        tpr tprVar = tpr.NEW_FILE_KEY;
                        int ordinal = rwh.bf(context, tmeVar).ordinal();
                        if (ordinal == 0) {
                            String str3 = tktVar.d;
                            createBuilder.copyOnWrite();
                            tlg tlgVar = (tlg) createBuilder.instance;
                            str3.getClass();
                            tlgVar.b = 1 | tlgVar.b;
                            tlgVar.c = str3;
                            int i6 = tktVar.e;
                            createBuilder.copyOnWrite();
                            tlg tlgVar2 = (tlg) createBuilder.instance;
                            tlgVar2.b |= 2;
                            tlgVar2.d = i6;
                            createBuilder.copyOnWrite();
                            tlg tlgVar3 = (tlg) createBuilder.instance;
                            aP.getClass();
                            tlgVar3.b |= 4;
                            tlgVar3.e = aP;
                            createBuilder.copyOnWrite();
                            tlg tlgVar4 = (tlg) createBuilder.instance;
                            tlgVar4.f = bp - 1;
                            tlgVar4.b |= 8;
                        } else if (ordinal == 1) {
                            String str4 = tktVar.d;
                            createBuilder.copyOnWrite();
                            tlg tlgVar5 = (tlg) createBuilder.instance;
                            str4.getClass();
                            tlgVar5.b = 1 | tlgVar5.b;
                            tlgVar5.c = str4;
                            int i7 = tktVar.e;
                            createBuilder.copyOnWrite();
                            tlg tlgVar6 = (tlg) createBuilder.instance;
                            tlgVar6.b = 2 | tlgVar6.b;
                            tlgVar6.d = i7;
                            createBuilder.copyOnWrite();
                            tlg tlgVar7 = (tlg) createBuilder.instance;
                            aP.getClass();
                            tlgVar7.b |= 4;
                            tlgVar7.e = aP;
                            createBuilder.copyOnWrite();
                            tlg tlgVar8 = (tlg) createBuilder.instance;
                            tlgVar8.f = bp - 1;
                            tlgVar8.b |= 8;
                            if ((tktVar.b & 32) != 0) {
                                awzo awzoVar = tktVar.h;
                                if (awzoVar == null) {
                                    awzoVar = awzo.a;
                                }
                                createBuilder.copyOnWrite();
                                tlg tlgVar9 = (tlg) createBuilder.instance;
                                awzoVar.getClass();
                                tlgVar9.g = awzoVar;
                                tlgVar9.b |= 16;
                            }
                        } else if (ordinal == 2) {
                            createBuilder.copyOnWrite();
                            tlg tlgVar10 = (tlg) createBuilder.instance;
                            aP.getClass();
                            tlgVar10.b |= 4;
                            tlgVar10.e = aP;
                            createBuilder.copyOnWrite();
                            tlg tlgVar11 = (tlg) createBuilder.instance;
                            tlgVar11.f = bp - 1;
                            tlgVar11.b |= 8;
                        }
                        set2.add((tlg) createBuilder.build());
                    }
                }
                return set2;
            }
        }, tnjVar7.j);
    }
}
