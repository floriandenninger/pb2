package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anlp extends anjs {
    public anlp(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (anox) aonm.parseFrom(anox.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        aone createBuilder = anow.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anow) createBuilder.instance).b = 0;
        aomf x = aomf.x(anrj.a(32));
        createBuilder.copyOnWrite();
        ((anow) createBuilder.instance).c = x;
        return (anow) createBuilder.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new anjr(anox.a, 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new anjr(anox.a, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
    }
}
