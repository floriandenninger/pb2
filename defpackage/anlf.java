package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anlf extends anjs {
    public anlf(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (annl) aonm.parseFrom(annl.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        aone createBuilder = annk.a.createBuilder();
        createBuilder.copyOnWrite();
        ((annk) createBuilder.instance).b = 0;
        aomf x = aomf.x(anrj.a(32));
        createBuilder.copyOnWrite();
        ((annk) createBuilder.instance).c = x;
        return (annk) createBuilder.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new anjr(annl.a, 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new anjr(annl.a, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
    }
}
