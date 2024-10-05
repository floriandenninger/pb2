package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agmj implements agoy {
    private static final agox a = new agow(1);
    private final agrn b;
    private final agof c;

    public agmj(agof agofVar, agrn agrnVar) {
        this.c = agofVar;
        this.b = agrnVar;
    }

    private static amru d(int i) {
        amrp f = amru.f();
        for (int i2 = 0; i2 < i; i2++) {
            f.h(agou.b);
        }
        return f.g();
    }

    private static aong e(atpo atpoVar) {
        aong aongVar = (aong) atpo.b.createBuilder();
        int i = atpoVar.d;
        aongVar.copyOnWrite();
        atpo atpoVar2 = (atpo) aongVar.instance;
        atpoVar2.c |= 1;
        atpoVar2.d = i;
        aongVar.cp(new aonw(atpoVar.e, atpo.a));
        return aongVar;
    }

    @Override // defpackage.agoy
    public final agox a(atpq atpqVar) {
        int bU = anaf.bU(atpqVar.c);
        return (bU != 0 && bU == 4) ? a : agox.a;
    }

    @Override // defpackage.agoy
    public final anhy b(afsx afsxVar, atpq atpqVar) {
        agou agouVar;
        String g = aalt.g(atpqVar.d);
        if (g.isEmpty()) {
            return anaf.O(agou.c);
        }
        int bU = anaf.bU(atpqVar.c);
        if (bU == 0) {
            bU = 1;
        }
        int i = bU - 1;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    agsn a2 = this.c.a();
                    if (!afsxVar.d().equals(a2.q())) {
                        agouVar = agou.b;
                    } else if (this.b.c(a2, amsx.r(g)) != null) {
                        agouVar = agou.a;
                    } else {
                        agouVar = agou.b;
                    }
                    return anaf.O(agouVar);
                }
                Object[] objArr = new Object[2];
                int bU2 = anaf.bU(atpqVar.c);
                if (bU2 == 0) {
                    bU2 = 1;
                }
                objArr[0] = Integer.valueOf(bU2 - 1);
                objArr[1] = 155;
                zga.e("Could not handle action: %s for type %s", objArr);
                return anaf.O(agou.c);
            }
            atpo atpoVar = atpqVar.e;
            if (atpoVar == null) {
                atpoVar = atpo.b;
            }
            amrp f = amru.f();
            aone createBuilder = atpq.a.createBuilder();
            createBuilder.copyOnWrite();
            atpq atpqVar2 = (atpq) createBuilder.instance;
            atpqVar2.c = 2;
            atpqVar2.b |= 1;
            String f2 = aalt.f(atxc.b.a(), g);
            createBuilder.copyOnWrite();
            atpq atpqVar3 = (atpq) createBuilder.instance;
            f2.getClass();
            atpqVar3.b |= 2;
            atpqVar3.d = f2;
            createBuilder.copyOnWrite();
            atpq atpqVar4 = (atpq) createBuilder.instance;
            atpoVar.getClass();
            atpqVar4.e = atpoVar;
            atpqVar4.b |= 4;
            atpq atpqVar5 = (atpq) createBuilder.build();
            aone createBuilder2 = atpq.a.createBuilder();
            createBuilder2.copyOnWrite();
            atpq atpqVar6 = (atpq) createBuilder2.instance;
            atpqVar6.c = 2;
            atpqVar6.b = 1 | atpqVar6.b;
            String f3 = aalt.f(awjq.b.a(), g);
            createBuilder2.copyOnWrite();
            atpq atpqVar7 = (atpq) createBuilder2.instance;
            f3.getClass();
            atpqVar7.b |= 2;
            atpqVar7.d = f3;
            createBuilder2.copyOnWrite();
            atpq atpqVar8 = (atpq) createBuilder2.instance;
            atpoVar.getClass();
            atpqVar8.e = atpoVar;
            atpqVar8.b |= 4;
            createBuilder2.aG(atpqVar5);
            f.h((atpq) createBuilder2.build());
            agot a3 = agou.a();
            a3.a = 2;
            a3.b(f.g());
            return anaf.O(a3.a());
        }
        atpo atpoVar2 = atpqVar.e;
        if (atpoVar2 == null) {
            atpoVar2 = atpo.b;
        }
        amrp f4 = amru.f();
        aone createBuilder3 = atpq.a.createBuilder();
        createBuilder3.copyOnWrite();
        atpq atpqVar9 = (atpq) createBuilder3.instance;
        atpqVar9.c = 1;
        atpqVar9.b |= 1;
        String f5 = aalt.f(atxc.b.a(), g);
        createBuilder3.copyOnWrite();
        atpq atpqVar10 = (atpq) createBuilder3.instance;
        f5.getClass();
        atpqVar10.b |= 2;
        atpqVar10.d = f5;
        awii awiiVar = (awii) atpoVar2.pX(awii.b);
        aong e = e(atpoVar2);
        if (!new aonw(((atpo) e.instance).e, atpo.a).contains(atpl.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK)) {
            e.cq(atpl.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
        }
        aonk aonkVar = atwy.b;
        aone createBuilder4 = atwy.a.createBuilder();
        atrx b = atrx.b(awiiVar.e);
        if (b == null) {
            b = atrx.UNKNOWN_FORMAT_TYPE;
        }
        createBuilder4.copyOnWrite();
        atwy atwyVar = (atwy) createBuilder4.instance;
        atwyVar.e = b.k;
        atwyVar.c |= 2;
        String str = awiiVar.h;
        createBuilder4.copyOnWrite();
        atwy atwyVar2 = (atwy) createBuilder4.instance;
        str.getClass();
        atwyVar2.c |= 8;
        atwyVar2.f = str;
        aomf aomfVar = awiiVar.d;
        createBuilder4.copyOnWrite();
        atwy atwyVar3 = (atwy) createBuilder4.instance;
        aomfVar.getClass();
        atwyVar3.c |= 1;
        atwyVar3.d = aomfVar;
        e.e(aonkVar, (atwy) createBuilder4.build());
        atpo atpoVar3 = (atpo) e.build();
        createBuilder3.copyOnWrite();
        atpq atpqVar11 = (atpq) createBuilder3.instance;
        atpoVar3.getClass();
        atpqVar11.e = atpoVar3;
        atpqVar11.b |= 4;
        atpq atpqVar12 = (atpq) createBuilder3.build();
        aone createBuilder5 = atpq.a.createBuilder();
        createBuilder5.copyOnWrite();
        atpq atpqVar13 = (atpq) createBuilder5.instance;
        atpqVar13.c = 1;
        atpqVar13.b |= 1;
        String f6 = aalt.f(awjq.b.a(), g);
        createBuilder5.copyOnWrite();
        atpq atpqVar14 = (atpq) createBuilder5.instance;
        f6.getClass();
        atpqVar14.b |= 2;
        atpqVar14.d = f6;
        awii awiiVar2 = (awii) atpoVar2.pX(awii.b);
        aone createBuilder6 = awjk.a.createBuilder();
        atrx b2 = atrx.b(awiiVar2.e);
        if (b2 == null) {
            b2 = atrx.UNKNOWN_FORMAT_TYPE;
        }
        createBuilder6.copyOnWrite();
        awjk awjkVar = (awjk) createBuilder6.instance;
        awjkVar.e = b2.k;
        awjkVar.c |= 2;
        aomf aomfVar2 = awiiVar2.d;
        createBuilder6.copyOnWrite();
        awjk awjkVar2 = (awjk) createBuilder6.instance;
        aomfVar2.getClass();
        awjkVar2.c = 1 | awjkVar2.c;
        awjkVar2.d = aomfVar2;
        String str2 = awiiVar2.h;
        createBuilder6.copyOnWrite();
        awjk awjkVar3 = (awjk) createBuilder6.instance;
        str2.getClass();
        awjkVar3.c |= 16;
        awjkVar3.h = str2;
        int i2 = awiiVar2.c;
        if ((i2 & 8) != 0 && (i2 & 16) != 0) {
            awjq awjqVar = awiiVar2.f;
            if (awjqVar == null) {
                awjqVar = awjq.a;
            }
            createBuilder6.copyOnWrite();
            awjk awjkVar4 = (awjk) createBuilder6.instance;
            awjqVar.getClass();
            awjkVar4.f = awjqVar;
            awjkVar4.c |= 4;
            awid awidVar = awiiVar2.g;
            if (awidVar == null) {
                awidVar = awid.a;
            }
            createBuilder6.copyOnWrite();
            awjk awjkVar5 = (awjk) createBuilder6.instance;
            awidVar.getClass();
            awjkVar5.g = awidVar;
            awjkVar5.c |= 8;
        }
        aong e2 = e(atpoVar2);
        e2.e(awjk.b, (awjk) createBuilder6.build());
        atpo atpoVar4 = (atpo) e2.build();
        createBuilder5.copyOnWrite();
        atpq atpqVar15 = (atpq) createBuilder5.instance;
        atpoVar4.getClass();
        atpqVar15.e = atpoVar4;
        atpqVar15.b |= 4;
        createBuilder5.aG(atpqVar12);
        f4.h((atpq) createBuilder5.build());
        agot a4 = agou.a();
        a4.a = 2;
        a4.b(f4.g());
        return anaf.O(a4.a());
    }

    @Override // defpackage.agoy
    public final anhy c(afsx afsxVar, amru amruVar) {
        amru g;
        int bU = anaf.bU(((atpq) amruVar.get(0)).c);
        if (bU == 0 || bU != 4) {
            int bU2 = anaf.bU(((atpq) amruVar.get(0)).c);
            String str = (bU2 == 0 || bU2 == 1) ? "OFFLINE_ORCHESTRATION_ACTION_TYPE_UNKNOWN" : bU2 != 2 ? bU2 != 3 ? bU2 != 4 ? "OFFLINE_ORCHESTRATION_ACTION_TYPE_UPDATE" : "OFFLINE_ORCHESTRATION_ACTION_TYPE_REFRESH" : "OFFLINE_ORCHESTRATION_ACTION_TYPE_DELETE" : "OFFLINE_ORCHESTRATION_ACTION_TYPE_ADD";
            throw new UnsupportedOperationException(str.length() != 0 ? "Cannot handle batched type: ".concat(str) : new String("Cannot handle batched type: "));
        }
        agsn a2 = this.c.a();
        if (!afsxVar.d().equals(a2.q())) {
            g = d(((amvj) amruVar).c);
        } else {
            amvj amvjVar = (amvj) amruVar;
            ArrayList arrayList = new ArrayList(amvjVar.c);
            int i = amvjVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(aalt.g(((atpq) amruVar.get(i2)).d));
            }
            arxp c = this.b.c(a2, amsx.p(arrayList));
            if (c == null) {
                g = d(amvjVar.c);
            } else {
                HashSet hashSet = new HashSet();
                Iterator it = c.d.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((arxv) it.next()).c.iterator();
                    while (it2.hasNext()) {
                        hashSet.add(((arxw) it2.next()).d);
                    }
                }
                amrp f = amru.f();
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    f.h(hashSet.contains((String) arrayList.get(i3)) ? agou.a : agou.b);
                }
                g = f.g();
            }
        }
        return anaf.O(g);
    }
}
