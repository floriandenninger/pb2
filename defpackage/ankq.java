package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ankq extends anjs {
    public ankq(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (anmx) aonm.parseFrom(anmx.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        anmx anmxVar = (anmx) aooyVar;
        anjs a = new anku().a();
        anmz anmzVar = anmxVar.b;
        if (anmzVar == null) {
            anmzVar = anmz.a;
        }
        Object b = a.b(anmzVar);
        anjs a2 = new anmo().a();
        anoa anoaVar = anmxVar.c;
        if (anoaVar == null) {
            anoaVar = anoa.a;
        }
        Object b2 = a2.b(anoaVar);
        aone createBuilder = anmw.a.createBuilder();
        createBuilder.copyOnWrite();
        anmw anmwVar = (anmw) createBuilder.instance;
        b.getClass();
        anmwVar.c = (anmy) b;
        createBuilder.copyOnWrite();
        anmw anmwVar2 = (anmw) createBuilder.instance;
        b2.getClass();
        anmwVar2.d = (annz) b2;
        createBuilder.copyOnWrite();
        ((anmw) createBuilder.instance).b = 0;
        return (anmw) createBuilder.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", ankr.i(16, 16, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", ankr.i(16, 16, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", ankr.i(32, 32, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", ankr.i(32, 32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
        anmx anmxVar = (anmx) aooyVar;
        anjs a = new anku().a();
        anmz anmzVar = anmxVar.b;
        if (anmzVar == null) {
            anmzVar = anmz.a;
        }
        a.d(anmzVar);
        anjs a2 = new anmo().a();
        anoa anoaVar = anmxVar.c;
        if (anoaVar == null) {
            anoaVar = anoa.a;
        }
        a2.d(anoaVar);
        anmz anmzVar2 = anmxVar.b;
        if (anmzVar2 == null) {
            anmzVar2 = anmz.a;
        }
        anrp.a(anmzVar2.c);
    }
}
