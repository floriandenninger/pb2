package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anpp extends anjt {
    public anpp(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anor anorVar = (anor) obj;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) anqy.g.a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, anorVar.d.I()), new BigInteger(1, anorVar.e.I())));
        anop anopVar = anorVar.c;
        if (anopVar == null) {
            anopVar = anop.a;
        }
        int V = aobq.V(anopVar.b);
        return new anrl(rSAPublicKey, aocz.aF(V != 0 ? V : 1));
    }
}
