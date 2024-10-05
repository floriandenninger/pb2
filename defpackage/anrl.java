package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anrl implements ankf {
    private final RSAPublicKey a;
    private final int b;

    public anrl(RSAPublicKey rSAPublicKey, int i) {
        if (!aobq.af(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = anrp.a;
        anrp.b(rSAPublicKey.getModulus().bitLength());
        anrp.c(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = i;
    }

    @Override // defpackage.ankf
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] S;
        BigInteger publicExponent = this.a.getPublicExponent();
        BigInteger modulus = this.a.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger J2 = aobq.J(bArr);
        if (J2.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] L = aobq.L(J2.modPow(publicExponent, modulus), bitLength);
        int i = this.b;
        int i2 = anrp.a;
        MessageDigest messageDigest = (MessageDigest) anqy.d.a(aobq.M(this.b));
        messageDigest.update(bArr2);
        byte[] digest = messageDigest.digest();
        int i3 = i - 1;
        int i4 = 2;
        if (i3 == 2) {
            S = aobq.S("3031300d060960864801650304020105000420");
        } else if (i3 != 3) {
            S = aobq.S("3051300d060960864801650304020305000440");
        } else {
            S = aobq.S("3041300d060960864801650304020205000430");
        }
        if (bitLength >= S.length + digest.length + 11) {
            byte[] bArr3 = new byte[bitLength];
            bArr3[0] = 0;
            bArr3[1] = 1;
            int i5 = 0;
            while (i5 < (bitLength - r4) - 3) {
                bArr3[i4] = -1;
                i5++;
                i4++;
            }
            int i6 = i4 + 1;
            bArr3[i4] = 0;
            int length = S.length;
            System.arraycopy(S, 0, bArr3, i6, length);
            System.arraycopy(digest, 0, bArr3, i6 + length, digest.length);
            if (!aocz.au(L, bArr3)) {
                throw new GeneralSecurityException("invalid signature");
            }
            return;
        }
        throw new GeneralSecurityException("intended encoded message length too short");
    }
}
