package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaec {
    public static final aseb a;
    private static final aper b;
    private static final amru c;

    static {
        aone createBuilder = aper.a.createBuilder();
        createBuilder.copyOnWrite();
        aper aperVar = (aper) createBuilder.instance;
        aperVar.b |= 1;
        aperVar.c = true;
        createBuilder.copyOnWrite();
        aper aperVar2 = (aper) createBuilder.instance;
        aperVar2.b |= 2;
        aperVar2.d = true;
        b = (aper) createBuilder.build();
        amru A = amru.A(1000L, 1000L, 1000L, 1000L, 15000L, 15000L, 15000L, 15000L, 60000L, 60000L, 60000L, 60000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L);
        c = A;
        aone createBuilder2 = aseb.a.createBuilder();
        createBuilder2.copyOnWrite();
        aseb asebVar = (aseb) createBuilder2.instance;
        asebVar.b = 1 | asebVar.b;
        asebVar.c = "innertube_android";
        createBuilder2.copyOnWrite();
        aseb asebVar2 = (aseb) createBuilder2.instance;
        asebVar2.b |= 2;
        asebVar2.d = "https://upload.youtube.com/upload/youtubei";
        createBuilder2.copyOnWrite();
        aseb asebVar3 = (aseb) createBuilder2.instance;
        aonx aonxVar = asebVar3.e;
        if (!aonxVar.c()) {
            asebVar3.e = aonm.mutableCopy(aonxVar);
        }
        aolo.addAll((Iterable) A, (List) asebVar3.e);
        createBuilder2.copyOnWrite();
        aseb asebVar4 = (aseb) createBuilder2.instance;
        aonx aonxVar2 = asebVar4.g;
        if (!aonxVar2.c()) {
            asebVar4.g = aonm.mutableCopy(aonxVar2);
        }
        aolo.addAll((Iterable) A, (List) asebVar4.g);
        createBuilder2.copyOnWrite();
        aseb asebVar5 = (aseb) createBuilder2.instance;
        aonx aonxVar3 = asebVar5.h;
        if (!aonxVar3.c()) {
            asebVar5.h = aonm.mutableCopy(aonxVar3);
        }
        aolo.addAll((Iterable) A, (List) asebVar5.h);
        createBuilder2.copyOnWrite();
        aseb asebVar6 = (aseb) createBuilder2.instance;
        aonx aonxVar4 = asebVar6.i;
        if (!aonxVar4.c()) {
            asebVar6.i = aonm.mutableCopy(aonxVar4);
        }
        aolo.addAll((Iterable) A, (List) asebVar6.i);
        createBuilder2.copyOnWrite();
        aseb asebVar7 = (aseb) createBuilder2.instance;
        aonx aonxVar5 = asebVar7.j;
        if (!aonxVar5.c()) {
            asebVar7.j = aonm.mutableCopy(aonxVar5);
        }
        aolo.addAll((Iterable) A, (List) asebVar7.j);
        createBuilder2.copyOnWrite();
        aseb asebVar8 = (aseb) createBuilder2.instance;
        aonx aonxVar6 = asebVar8.k;
        if (!aonxVar6.c()) {
            asebVar8.k = aonm.mutableCopy(aonxVar6);
        }
        aolo.addAll((Iterable) A, (List) asebVar8.k);
        a = (aseb) createBuilder2.build();
    }

    public static aseb a(aadw aadwVar) {
        atej atejVar = aadwVar.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        if ((atejVar.b & 8) == 0) {
            return a;
        }
        aseb asebVar = atejVar.f;
        return asebVar == null ? aseb.a : asebVar;
    }

    public static boolean b(aadw aadwVar) {
        aper aperVar;
        atej atejVar = aadwVar.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        if ((atejVar.c & 8) != 0) {
            aperVar = atejVar.v;
            if (aperVar == null) {
                aperVar = aper.a;
            }
        } else {
            aperVar = b;
        }
        return aperVar.c;
    }
}
