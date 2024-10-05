package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ankz extends anjs {
    public ankz(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (annf) aonm.parseFrom(annf.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        aone createBuilder = anne.a.createBuilder();
        aomf x = aomf.x(anrj.a(((annf) aooyVar).b));
        createBuilder.copyOnWrite();
        ((anne) createBuilder.instance).c = x;
        createBuilder.copyOnWrite();
        ((anne) createBuilder.instance).b = 0;
        return (anne) createBuilder.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", anla.i(16, 1));
        hashMap.put("AES128_GCM_RAW", anla.i(16, 3));
        hashMap.put("AES256_GCM", anla.i(32, 1));
        hashMap.put("AES256_GCM_RAW", anla.i(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
        anrp.a(((annf) aooyVar).b);
    }
}
