package defpackage;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anoz extends anjs {
    public anoz(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (annm) aonm.parseFrom(annm.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        annn annnVar = ((annm) aooyVar).b;
        if (annnVar == null) {
            annnVar = annn.a;
        }
        int X = aobq.X(annnVar.c);
        if (X == 0) {
            X = 1;
        }
        KeyPair ao = aocz.ao(aocz.aD(X));
        ECPublicKey eCPublicKey = (ECPublicKey) ao.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) ao.getPrivate();
        ECPoint w = eCPublicKey.getW();
        aone createBuilder = annp.a.createBuilder();
        createBuilder.copyOnWrite();
        ((annp) createBuilder.instance).b = 0;
        createBuilder.copyOnWrite();
        annp annpVar = (annp) createBuilder.instance;
        annnVar.getClass();
        annpVar.c = annnVar;
        aomf x = aomf.x(w.getAffineX().toByteArray());
        createBuilder.copyOnWrite();
        ((annp) createBuilder.instance).d = x;
        aomf x2 = aomf.x(w.getAffineY().toByteArray());
        createBuilder.copyOnWrite();
        ((annp) createBuilder.instance).e = x2;
        annp annpVar2 = (annp) createBuilder.build();
        aone createBuilder2 = anno.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anno) createBuilder2.instance).b = 0;
        createBuilder2.copyOnWrite();
        anno annoVar = (anno) createBuilder2.instance;
        annpVar2.getClass();
        annoVar.c = annpVar2;
        aomf x3 = aomf.x(eCPrivateKey.getS().toByteArray());
        createBuilder2.copyOnWrite();
        ((anno) createBuilder2.instance).d = x3;
        return (anno) createBuilder2.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", anpa.i(5, 4, 4, 1));
        hashMap.put("ECDSA_P256_IEEE_P1363", anpa.i(5, 4, 3, 1));
        hashMap.put("ECDSA_P256_RAW", anpa.i(5, 4, 3, 3));
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", anpa.i(5, 4, 3, 3));
        hashMap.put("ECDSA_P384", anpa.i(6, 5, 4, 1));
        hashMap.put("ECDSA_P384_IEEE_P1363", anpa.i(6, 5, 3, 1));
        hashMap.put("ECDSA_P384_SHA512", anpa.i(6, 5, 4, 1));
        hashMap.put("ECDSA_P384_SHA384", anpa.i(4, 5, 4, 1));
        hashMap.put("ECDSA_P521", anpa.i(6, 6, 4, 1));
        hashMap.put("ECDSA_P521_IEEE_P1363", anpa.i(6, 6, 3, 1));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
        annn annnVar = ((annm) aooyVar).b;
        if (annnVar == null) {
            annnVar = annn.a;
        }
        aocz.aA(annnVar);
    }
}
