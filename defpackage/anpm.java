package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anpm extends anjt {
    public anpm(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anoq anoqVar = (anoq) obj;
        KeyFactory keyFactory = (KeyFactory) anqy.g.a("RSA");
        anor anorVar = anoqVar.c;
        if (anorVar == null) {
            anorVar = anor.a;
        }
        BigInteger bigInteger = new BigInteger(1, anorVar.d.I());
        anor anorVar2 = anoqVar.c;
        if (anorVar2 == null) {
            anorVar2 = anor.a;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, new BigInteger(1, anorVar2.e.I()), new BigInteger(1, anoqVar.d.I()), new BigInteger(1, anoqVar.e.I()), new BigInteger(1, anoqVar.f.I()), new BigInteger(1, anoqVar.g.I()), new BigInteger(1, anoqVar.h.I()), new BigInteger(1, anoqVar.i.I())));
        anor anorVar3 = anoqVar.c;
        if (anorVar3 == null) {
            anorVar3 = anor.a;
        }
        anop anopVar = anorVar3.c;
        if (anopVar == null) {
            anopVar = anop.a;
        }
        anor anorVar4 = anoqVar.c;
        if (anorVar4 == null) {
            anorVar4 = anor.a;
        }
        BigInteger bigInteger2 = new BigInteger(1, anorVar4.d.I());
        anor anorVar5 = anoqVar.c;
        if (anorVar5 == null) {
            anorVar5 = anor.a;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger2, new BigInteger(1, anorVar5.e.I())));
        int V = aobq.V(anopVar.b);
        if (V == 0) {
            V = 1;
        }
        anro.b(rSAPrivateCrtKey, rSAPublicKey, aocz.aF(V));
        int V2 = aobq.V(anopVar.b);
        return new anrk(rSAPrivateCrtKey, aocz.aF(V2 != 0 ? V2 : 1));
    }
}
