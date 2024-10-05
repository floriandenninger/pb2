package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anlc extends anjs {
    public anlc(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (annh) aonm.parseFrom(annh.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        aone createBuilder = anng.a.createBuilder();
        aomf x = aomf.x(anrj.a(((annh) aooyVar).b));
        createBuilder.copyOnWrite();
        ((anng) createBuilder.instance).c = x;
        createBuilder.copyOnWrite();
        ((anng) createBuilder.instance).b = 0;
        return (anng) createBuilder.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", anld.j(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", anld.j(16, 3));
        hashMap.put("AES256_GCM_SIV", anld.j(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", anld.j(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
        anrp.a(((annh) aooyVar).b);
    }
}
