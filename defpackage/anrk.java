package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anrk implements anke {
    public final RSAPrivateCrtKey a;
    public final RSAPublicKey b;
    public final String c;

    public anrk(RSAPrivateCrtKey rSAPrivateCrtKey, int i) {
        if (!aobq.af(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = anrp.a;
        anrp.b(rSAPrivateCrtKey.getModulus().bitLength());
        anrp.c(rSAPrivateCrtKey.getPublicExponent());
        this.a = rSAPrivateCrtKey;
        String ag = aocz.ag(i);
        StringBuilder sb = new StringBuilder(ag.length() + 7);
        sb.append(ag);
        sb.append("withRSA");
        this.c = sb.toString();
        this.b = (RSAPublicKey) ((KeyFactory) anqy.g.a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
    }
}
