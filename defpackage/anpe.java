package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anpe extends anjs {
    public anpe(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (annw) aonm.parseFrom(annw.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        byte[] a = anrj.a(32);
        if (a.length != 32) {
            throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
        }
        byte[] f = anqs.f(anqs.e(a));
        aone createBuilder = anny.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anny) createBuilder.instance).b = 0;
        aomf x = aomf.x(Arrays.copyOf(f, 32));
        createBuilder.copyOnWrite();
        ((anny) createBuilder.instance).c = x;
        anny annyVar = (anny) createBuilder.build();
        aone createBuilder2 = annx.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((annx) createBuilder2.instance).b = 0;
        aomf x2 = aomf.x(Arrays.copyOf(a, 32));
        createBuilder2.copyOnWrite();
        ((annx) createBuilder2.instance).c = x2;
        createBuilder2.copyOnWrite();
        annx annxVar = (annx) createBuilder2.instance;
        annyVar.getClass();
        annxVar.d = annyVar;
        return (annx) createBuilder2.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ED25519", new anjr(annw.a, 1));
        hashMap.put("ED25519_RAW", new anjr(annw.a, 3));
        hashMap.put("ED25519WithRawOutput", new anjr(annw.a, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
    }
}
