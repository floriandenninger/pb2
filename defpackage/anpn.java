package defpackage;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anpn extends anjs {
    public anpn(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (anoo) aonm.parseFrom(anoo.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        anoo anooVar = (anoo) aooyVar;
        anop anopVar = anooVar.b;
        if (anopVar == null) {
            anopVar = anop.a;
        }
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) anqy.f.a("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(anooVar.c, new BigInteger(1, anooVar.d.I())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        aone createBuilder = anor.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anor) createBuilder.instance).b = 0;
        createBuilder.copyOnWrite();
        anor anorVar = (anor) createBuilder.instance;
        anopVar.getClass();
        anorVar.c = anopVar;
        aomf x = aomf.x(rSAPublicKey.getPublicExponent().toByteArray());
        createBuilder.copyOnWrite();
        ((anor) createBuilder.instance).e = x;
        aomf x2 = aomf.x(rSAPublicKey.getModulus().toByteArray());
        createBuilder.copyOnWrite();
        ((anor) createBuilder.instance).d = x2;
        anor anorVar2 = (anor) createBuilder.build();
        aone createBuilder2 = anoq.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anoq) createBuilder2.instance).b = 0;
        createBuilder2.copyOnWrite();
        anoq anoqVar = (anoq) createBuilder2.instance;
        anorVar2.getClass();
        anoqVar.c = anorVar2;
        aomf x3 = aomf.x(rSAPrivateCrtKey.getPrivateExponent().toByteArray());
        createBuilder2.copyOnWrite();
        ((anoq) createBuilder2.instance).d = x3;
        aomf x4 = aomf.x(rSAPrivateCrtKey.getPrimeP().toByteArray());
        createBuilder2.copyOnWrite();
        ((anoq) createBuilder2.instance).e = x4;
        aomf x5 = aomf.x(rSAPrivateCrtKey.getPrimeQ().toByteArray());
        createBuilder2.copyOnWrite();
        ((anoq) createBuilder2.instance).f = x5;
        aomf x6 = aomf.x(rSAPrivateCrtKey.getPrimeExponentP().toByteArray());
        createBuilder2.copyOnWrite();
        ((anoq) createBuilder2.instance).g = x6;
        aomf x7 = aomf.x(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray());
        createBuilder2.copyOnWrite();
        ((anoq) createBuilder2.instance).h = x7;
        aomf x8 = aomf.x(rSAPrivateCrtKey.getCrtCoefficient().toByteArray());
        createBuilder2.copyOnWrite();
        ((anoq) createBuilder2.instance).i = x8;
        return (anoq) createBuilder2.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4", new anjr(anpo.i(5, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", new anjr(anpo.i(5, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", new anjr(anpo.i(5, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4", new anjr(anpo.i(6, 4096, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", new anjr(anpo.i(6, 4096, RSAKeyGenParameterSpec.F4), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
        anoo anooVar = (anoo) aooyVar;
        anop anopVar = anooVar.b;
        if (anopVar == null) {
            anopVar = anop.a;
        }
        aocz.aB(anopVar);
        anrp.b(anooVar.c);
        anrp.c(new BigInteger(1, anooVar.d.I()));
    }
}
