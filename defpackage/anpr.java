package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anpr extends anjt {
    public anpr(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anou anouVar = (anou) obj;
        KeyFactory keyFactory = (KeyFactory) anqy.g.a("RSA");
        anov anovVar = anouVar.c;
        if (anovVar == null) {
            anovVar = anov.a;
        }
        BigInteger bigInteger = new BigInteger(1, anovVar.d.I());
        anov anovVar2 = anouVar.c;
        if (anovVar2 == null) {
            anovVar2 = anov.a;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, new BigInteger(1, anovVar2.e.I()), new BigInteger(1, anouVar.d.I()), new BigInteger(1, anouVar.e.I()), new BigInteger(1, anouVar.f.I()), new BigInteger(1, anouVar.g.I()), new BigInteger(1, anouVar.h.I()), new BigInteger(1, anouVar.i.I())));
        anov anovVar3 = anouVar.c;
        if (anovVar3 == null) {
            anovVar3 = anov.a;
        }
        anot anotVar = anovVar3.c;
        if (anotVar == null) {
            anotVar = anot.a;
        }
        anov anovVar4 = anouVar.c;
        if (anovVar4 == null) {
            anovVar4 = anov.a;
        }
        BigInteger bigInteger2 = new BigInteger(1, anovVar4.d.I());
        anov anovVar5 = anouVar.c;
        if (anovVar5 == null) {
            anovVar5 = anov.a;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger2, new BigInteger(1, anovVar5.e.I())));
        int V = aobq.V(anotVar.b);
        if (V == 0) {
            V = 1;
        }
        int aF = aocz.aF(V);
        int V2 = aobq.V(anotVar.c);
        if (V2 == 0) {
            V2 = 1;
        }
        anro.c(rSAPrivateCrtKey, rSAPublicKey, aF, aocz.aF(V2), anotVar.d);
        int V3 = aobq.V(anotVar.b);
        if (V3 == 0) {
            V3 = 1;
        }
        int aF2 = aocz.aF(V3);
        int V4 = aobq.V(anotVar.c);
        return new anrm(rSAPrivateCrtKey, aF2, aocz.aF(V4 != 0 ? V4 : 1), anotVar.d);
    }
}
