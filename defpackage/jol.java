package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jol implements agoy {
    private final aais a;

    public jol(aais aaisVar) {
        this.a = aaisVar;
    }

    @Override // defpackage.agoy
    public final agox a(atpq atpqVar) {
        return agox.a;
    }

    @Override // defpackage.agoy
    public final anhy c(afsx afsxVar, amru amruVar) {
        return anaf.O(amru.q());
    }

    @Override // defpackage.agoy
    public final anhy b(afsx afsxVar, atpq atpqVar) {
        agou agouVar;
        int bU = anaf.bU(atpqVar.c);
        if (bU == 0) {
            bU = 1;
        }
        if (bU - 1 == 2) {
            String str = atpqVar.d;
            aair c = this.a.c();
            asxd asxdVar = (asxd) c.f(str).g(asxd.class).X();
            if (asxdVar == null) {
                agouVar = agou.a;
            } else {
                aajl c2 = ((aajv) c).c();
                whu.ae(c2, asxdVar);
                asxi asxiVar = (asxi) c.f(fhe.d()).g(asxi.class).X();
                Iterator it = asxiVar.getItems().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    asxj asxjVar = (asxj) it.next();
                    if ((asxjVar.b == 1 ? (String) asxjVar.c : "").equals(str)) {
                        asxg e = asxiVar.e();
                        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(asxjVar));
                        List<asxj> unmodifiableList = Collections.unmodifiableList(((asxk) e.a.instance).e);
                        aone aoneVar = e.a;
                        aoneVar.copyOnWrite();
                        ((asxk) aoneVar.instance).e = asxk.emptyProtobufList();
                        for (asxj asxjVar2 : unmodifiableList) {
                            if (!linkedHashSet.contains(asxjVar2)) {
                                aone aoneVar2 = e.a;
                                aoneVar2.copyOnWrite();
                                asxk asxkVar = (asxk) aoneVar2.instance;
                                asxjVar2.getClass();
                                aony aonyVar = asxkVar.e;
                                if (!aonyVar.c()) {
                                    asxkVar.e = aonm.mutableCopy(aonyVar);
                                }
                                asxkVar.e.add(asxjVar2);
                            }
                        }
                        c2.k(e);
                    }
                }
                evr.bO(c2, "Error updating when delete a MainRecommendedDownloadVideoEntity.");
                agouVar = agou.a;
            }
            return anaf.O(agouVar);
        }
        Object[] objArr = new Object[2];
        int bU2 = anaf.bU(atpqVar.c);
        if (bU2 == 0) {
            bU2 = 1;
        }
        objArr[0] = Integer.valueOf(bU2 - 1);
        objArr[1] = 137;
        zga.e("Could not handle action: %s for type %s", objArr);
        return anaf.O(agou.c);
    }
}
