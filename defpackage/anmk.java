package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anmk extends anjs {
    public anmk(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (anmu) aonm.parseFrom(anmu.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        anmu anmuVar = (anmu) aooyVar;
        aone createBuilder = anmt.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anmt) createBuilder.instance).b = 0;
        aomf x = aomf.x(anrj.a(anmuVar.b));
        createBuilder.copyOnWrite();
        ((anmt) createBuilder.instance).c = x;
        anmv anmvVar = anmuVar.c;
        if (anmvVar == null) {
            anmvVar = anmv.a;
        }
        createBuilder.copyOnWrite();
        anmt anmtVar = (anmt) createBuilder.instance;
        anmvVar.getClass();
        anmtVar.d = anmvVar;
        return (anmt) createBuilder.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        aone createBuilder = anmu.a.createBuilder();
        createBuilder.copyOnWrite();
        anmu.a((anmu) createBuilder.instance);
        aone createBuilder2 = anmv.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anmv) createBuilder2.instance).b = 16;
        anmv anmvVar = (anmv) createBuilder2.build();
        createBuilder.copyOnWrite();
        anmu anmuVar = (anmu) createBuilder.instance;
        anmvVar.getClass();
        anmuVar.c = anmvVar;
        hashMap.put("AES_CMAC", new anjr((anmu) createBuilder.build(), 1));
        aone createBuilder3 = anmu.a.createBuilder();
        createBuilder3.copyOnWrite();
        anmu.a((anmu) createBuilder3.instance);
        aone createBuilder4 = anmv.a.createBuilder();
        createBuilder4.copyOnWrite();
        ((anmv) createBuilder4.instance).b = 16;
        anmv anmvVar2 = (anmv) createBuilder4.build();
        createBuilder3.copyOnWrite();
        anmu anmuVar2 = (anmu) createBuilder3.instance;
        anmvVar2.getClass();
        anmuVar2.c = anmvVar2;
        hashMap.put("AES256_CMAC", new anjr((anmu) createBuilder3.build(), 1));
        aone createBuilder5 = anmu.a.createBuilder();
        createBuilder5.copyOnWrite();
        anmu.a((anmu) createBuilder5.instance);
        aone createBuilder6 = anmv.a.createBuilder();
        createBuilder6.copyOnWrite();
        ((anmv) createBuilder6.instance).b = 16;
        anmv anmvVar3 = (anmv) createBuilder6.build();
        createBuilder5.copyOnWrite();
        anmu anmuVar3 = (anmu) createBuilder5.instance;
        anmvVar3.getClass();
        anmuVar3.c = anmvVar3;
        hashMap.put("AES256_CMAC_RAW", new anjr((anmu) createBuilder5.build(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
        anmu anmuVar = (anmu) aooyVar;
        anmv anmvVar = anmuVar.c;
        if (anmvVar == null) {
            anmvVar = anmv.a;
        }
        anml.i(anmvVar);
        anml.j(anmuVar.b);
    }
}
