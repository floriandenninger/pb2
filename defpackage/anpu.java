package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anpu extends anjt {
    public anpu(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anov anovVar = (anov) obj;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) anqy.g.a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, anovVar.d.I()), new BigInteger(1, anovVar.e.I())));
        anot anotVar = anovVar.c;
        if (anotVar == null) {
            anotVar = anot.a;
        }
        int V = aobq.V(anotVar.b);
        if (V == 0) {
            V = 1;
        }
        int aF = aocz.aF(V);
        int V2 = aobq.V(anotVar.c);
        return new anrn(rSAPublicKey, aF, aocz.aF(V2 != 0 ? V2 : 1), anotVar.d);
    }
}
