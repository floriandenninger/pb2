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
final class anps extends anjs {
    public anps(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (anos) aonm.parseFrom(anos.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        anos anosVar = (anos) aooyVar;
        anot anotVar = anosVar.b;
        if (anotVar == null) {
            anotVar = anot.a;
        }
        anrp.b(anosVar.c);
        int V = aobq.V(anotVar.b);
        if (V == 0) {
            V = 1;
        }
        aocz.aF(V);
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) anqy.f.a("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(anosVar.c, new BigInteger(1, anosVar.d.I())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        aone createBuilder = anov.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anov) createBuilder.instance).b = 0;
        createBuilder.copyOnWrite();
        anov anovVar = (anov) createBuilder.instance;
        anotVar.getClass();
        anovVar.c = anotVar;
        aomf x = aomf.x(rSAPublicKey.getPublicExponent().toByteArray());
        createBuilder.copyOnWrite();
        ((anov) createBuilder.instance).e = x;
        aomf x2 = aomf.x(rSAPublicKey.getModulus().toByteArray());
        createBuilder.copyOnWrite();
        ((anov) createBuilder.instance).d = x2;
        anov anovVar2 = (anov) createBuilder.build();
        aone createBuilder2 = anou.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anou) createBuilder2.instance).b = 0;
        createBuilder2.copyOnWrite();
        anou anouVar = (anou) createBuilder2.instance;
        anovVar2.getClass();
        anouVar.c = anovVar2;
        aomf x3 = aomf.x(rSAPrivateCrtKey.getPrivateExponent().toByteArray());
        createBuilder2.copyOnWrite();
        ((anou) createBuilder2.instance).d = x3;
        aomf x4 = aomf.x(rSAPrivateCrtKey.getPrimeP().toByteArray());
        createBuilder2.copyOnWrite();
        ((anou) createBuilder2.instance).e = x4;
        aomf x5 = aomf.x(rSAPrivateCrtKey.getPrimeQ().toByteArray());
        createBuilder2.copyOnWrite();
        ((anou) createBuilder2.instance).f = x5;
        aomf x6 = aomf.x(rSAPrivateCrtKey.getPrimeExponentP().toByteArray());
        createBuilder2.copyOnWrite();
        ((anou) createBuilder2.instance).g = x6;
        aomf x7 = aomf.x(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray());
        createBuilder2.copyOnWrite();
        ((anou) createBuilder2.instance).h = x7;
        aomf x8 = aomf.x(rSAPrivateCrtKey.getCrtCoefficient().toByteArray());
        createBuilder2.copyOnWrite();
        ((anou) createBuilder2.instance).i = x8;
        return (anou) createBuilder2.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4", new anjr(anpt.i(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", new anjr(anpt.i(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", new anjr(anpt.i(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4", new anjr(anpt.i(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", new anjr(anpt.i(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", new anjr(anpt.i(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 1));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
        anos anosVar = (anos) aooyVar;
        anot anotVar = anosVar.b;
        if (anotVar == null) {
            anotVar = anot.a;
        }
        aocz.aC(anotVar);
        anrp.b(anosVar.c);
        anrp.c(new BigInteger(1, anosVar.d.I()));
    }
}
