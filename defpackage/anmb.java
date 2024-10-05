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
final class anmb extends anjs {
    public anmb(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (annr) aonm.parseFrom(annr.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        annr annrVar = (annr) aooyVar;
        anns annsVar = annrVar.b;
        if (annsVar == null) {
            annsVar = anns.a;
        }
        annv annvVar = annsVar.b;
        if (annvVar == null) {
            annvVar = annv.a;
        }
        int X = aobq.X(annvVar.b);
        if (X == 0) {
            X = 1;
        }
        KeyPair ao = aocz.ao(aobq.ad(X));
        ECPublicKey eCPublicKey = (ECPublicKey) ao.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) ao.getPrivate();
        ECPoint w = eCPublicKey.getW();
        aone createBuilder = annu.a.createBuilder();
        createBuilder.copyOnWrite();
        ((annu) createBuilder.instance).b = 0;
        anns annsVar2 = annrVar.b;
        if (annsVar2 == null) {
            annsVar2 = anns.a;
        }
        createBuilder.copyOnWrite();
        annu annuVar = (annu) createBuilder.instance;
        annsVar2.getClass();
        annuVar.c = annsVar2;
        aomf x = aomf.x(w.getAffineX().toByteArray());
        createBuilder.copyOnWrite();
        ((annu) createBuilder.instance).d = x;
        aomf x2 = aomf.x(w.getAffineY().toByteArray());
        createBuilder.copyOnWrite();
        ((annu) createBuilder.instance).e = x2;
        annu annuVar2 = (annu) createBuilder.build();
        aone createBuilder2 = annt.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((annt) createBuilder2.instance).b = 0;
        createBuilder2.copyOnWrite();
        annt anntVar = (annt) createBuilder2.instance;
        annuVar2.getClass();
        anntVar.c = annuVar2;
        aomf x3 = aomf.x(eCPrivateKey.getS().toByteArray());
        createBuilder2.copyOnWrite();
        ((annt) createBuilder2.instance).d = x3;
        return (annt) createBuilder2.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", anmc.i(3, anaf.y("AES128_GCM"), anmc.c, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", anmc.i(3, anaf.y("AES128_GCM"), anmc.c, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", anmc.i(4, anaf.y("AES128_GCM"), anmc.c, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", anmc.i(4, anaf.y("AES128_GCM"), anmc.c, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", anmc.i(4, anaf.y("AES128_GCM"), anmc.c, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", anmc.i(3, anaf.y("AES128_CTR_HMAC_SHA256"), anmc.c, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", anmc.i(3, anaf.y("AES128_CTR_HMAC_SHA256"), anmc.c, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", anmc.i(4, anaf.y("AES128_CTR_HMAC_SHA256"), anmc.c, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", anmc.i(4, anaf.y("AES128_CTR_HMAC_SHA256"), anmc.c, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
        anns annsVar = ((annr) aooyVar).b;
        if (annsVar == null) {
            annsVar = anns.a;
        }
        aobq.ab(annsVar);
    }
}
