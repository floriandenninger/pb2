package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class thw implements tfo {
    public final thk a;
    public final tfu b;
    private final tig c;

    public thw(thk thkVar, tfu tfuVar, tig tigVar) {
        this.a = thkVar;
        this.b = tfuVar;
        this.c = tigVar;
    }

    @Override // defpackage.tfo
    public final anhy a(final tfr tfrVar) {
        final thj thjVar = (thj) tfrVar.a;
        final String e = this.a.e(thjVar);
        if (e.isEmpty()) {
            return anaf.O(null);
        }
        final anhy c = this.a.c(thjVar, tfrVar.b);
        thk thkVar = this.a;
        anhy anhyVar = tfrVar.b;
        final anhy f = thkVar.f();
        final anhy d = this.a.d(thjVar, tfrVar.b);
        tig tigVar = this.c;
        thjVar.b();
        final anhy O = anaf.O(null);
        final tge tgeVar = thjVar.d().a;
        final ArrayList arrayList = new ArrayList();
        tigVar.a.a(tgeVar, tgeVar.d, null, arrayList);
        final ArrayList arrayList2 = new ArrayList();
        tigVar.b.a(tgeVar, tgeVar.d, null, arrayList2);
        final anhy a = anaf.J(amqp.b(arrayList, arrayList2)).a(new Callable() { // from class: tif
            @Override // java.util.concurrent.Callable
            public final Object call() {
                thj thjVar2 = thj.this;
                tge tgeVar2 = tgeVar;
                List list = arrayList;
                List list2 = arrayList2;
                anhy anhyVar2 = O;
                aone createBuilder = ancf.a.createBuilder();
                andp f2 = thjVar2.f();
                createBuilder.copyOnWrite();
                ancf ancfVar = (ancf) createBuilder.instance;
                f2.getClass();
                ancfVar.c = f2;
                ancfVar.b |= 1;
                if (!thjVar2.g()) {
                    andp I = sgf.I(thjVar2, true);
                    amkq.O(I != null, "No Parent Event");
                    createBuilder.copyOnWrite();
                    ancf ancfVar2 = (ancf) createBuilder.instance;
                    I.getClass();
                    ancfVar2.e = I;
                    ancfVar2.b |= 2;
                }
                ando andoVar = thjVar2.e().d;
                if (andoVar == null) {
                    andoVar = ando.a;
                }
                aong aongVar = (aong) ancq.a.createBuilder();
                aongVar.copyOnWrite();
                ancq ancqVar = (ancq) aongVar.instance;
                andoVar.getClass();
                ancqVar.c = andoVar;
                ancqVar.b |= 1;
                int l = anaf.l(tgeVar2.c);
                if (l == 0) {
                    l = 1;
                }
                aongVar.copyOnWrite();
                ancq ancqVar2 = (ancq) aongVar.instance;
                ancqVar2.b |= 16;
                ancqVar2.e = l - 1;
                int l2 = anaf.l(tgeVar2.c);
                if (l2 == 0) {
                    l2 = 1;
                }
                aongVar.copyOnWrite();
                ancq ancqVar3 = (ancq) aongVar.instance;
                ancqVar3.b |= 16;
                ancqVar3.e = l2 - 1;
                Iterator it = tgeVar2.d.iterator();
                while (it.hasNext()) {
                    switch (((Integer) it.next()).intValue()) {
                        case 100000001:
                            int m = anaf.m(((the) tgeVar2.pX(thd.b)).b);
                            if (m == 0) {
                                m = 1;
                            }
                            aongVar.copyOnWrite();
                            ancq ancqVar4 = (ancq) aongVar.instance;
                            ancqVar4.b |= 32;
                            ancqVar4.f = m - 1;
                            break;
                        case 100000002:
                            int n = anaf.n(((anej) tgeVar2.pX(thd.c)).b);
                            if (n == 0) {
                                n = 1;
                            }
                            aongVar.copyOnWrite();
                            ancq ancqVar5 = (ancq) aongVar.instance;
                            ancqVar5.b |= 64;
                            ancqVar5.g = n - 1;
                            break;
                        case 100000003:
                            int i = ((thu) tgeVar2.pX(tih.b)).b;
                            aongVar.copyOnWrite();
                            ancq ancqVar6 = (ancq) aongVar.instance;
                            ancqVar6.b |= 128;
                            ancqVar6.h = i;
                            break;
                    }
                }
                aong aongVar2 = (aong) ance.a.createBuilder();
                aonk aonkVar = anci.b;
                aone createBuilder2 = ancg.a.createBuilder();
                aone createBuilder3 = anch.a.createBuilder();
                long c2 = thjVar2.c();
                createBuilder3.copyOnWrite();
                anch anchVar = (anch) createBuilder3.instance;
                anchVar.b |= 1;
                anchVar.c = c2;
                anch anchVar2 = (anch) createBuilder3.build();
                createBuilder2.copyOnWrite();
                ancg ancgVar = (ancg) createBuilder2.instance;
                anchVar2.getClass();
                ancgVar.c = anchVar2;
                ancgVar.b |= 1;
                aongVar2.e(aonkVar, (ancg) createBuilder2.build());
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((thn) anaf.W((anhy) it2.next())).a(aongVar2);
                    }
                }
                aongVar.copyOnWrite();
                ancq ancqVar7 = (ancq) aongVar.instance;
                ance anceVar = (ance) aongVar2.build();
                anceVar.getClass();
                ancqVar7.j = anceVar;
                ancqVar7.b |= 16384;
                if (!list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ((thn) anaf.W((anhy) it3.next())).a(aongVar);
                    }
                }
                aong[] aongVarArr = (aong[]) anaf.W(anhyVar2);
                if (aongVarArr != null) {
                    for (aong aongVar3 : aongVarArr) {
                        aongVar.copyOnWrite();
                        ancq ancqVar8 = (ancq) aongVar.instance;
                        ancr ancrVar = (ancr) aongVar3.build();
                        ancrVar.getClass();
                        aony aonyVar = ancqVar8.i;
                        if (!aonyVar.c()) {
                            ancqVar8.i = aonm.mutableCopy(aonyVar);
                        }
                        ancqVar8.i.add(ancrVar);
                    }
                }
                ancq ancqVar9 = (ancq) aongVar.build();
                createBuilder.copyOnWrite();
                ancf ancfVar3 = (ancf) createBuilder.instance;
                ancqVar9.getClass();
                ancfVar3.f = ancqVar9;
                ancfVar3.b |= 16;
                return (ancf) createBuilder.build();
            }
        }, angq.a);
        return anaf.K(c, a, f, d).b(amjk.b(new anfy() { // from class: thv
            @Override // defpackage.anfy
            public final anhy a() {
                thw thwVar = thw.this;
                thj thjVar2 = thjVar;
                String str = e;
                anhy anhyVar2 = c;
                anhy anhyVar3 = a;
                anhy anhyVar4 = f;
                anhy anhyVar5 = d;
                tfr tfrVar2 = tfrVar;
                thwVar.a.a(thjVar2);
                tfs a2 = tft.a();
                a2.a = str;
                a2.b((aooy) anaf.W(anhyVar2));
                a2.b = (ancf) anaf.W(anhyVar3);
                a2.c = (int[]) anaf.W(anhyVar4);
                thwVar.a.g(thjVar2);
                a2.c();
                thwVar.a.b(thjVar2);
                int[] iArr = (int[]) anaf.W(anhyVar5);
                if (thjVar2.e().pY(tiy.a) || iArr != null) {
                    HashSet hashSet = new HashSet(((tix) thjVar2.e().pX(tiy.a)).b);
                    if (iArr != null) {
                        hashSet.addAll(anaf.ai(iArr));
                    }
                    a2.d = anaf.aj(hashSet);
                }
                return thwVar.b.b(a2.a(), tfrVar2.b);
            }
        }), angq.a);
    }

    @Override // defpackage.tfo
    public final Set b() {
        return amsx.r(thj.class);
    }
}
