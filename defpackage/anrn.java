package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anrn implements ankf {
    private final RSAPublicKey a;
    private final int b;
    private final int c;
    private final int d;

    public anrn(RSAPublicKey rSAPublicKey, int i, int i2, int i3) {
        if (!aobq.af(2)) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i4 = anrp.a;
        anrp.b(rSAPublicKey.getModulus().bitLength());
        anrp.c(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.c = i;
        this.d = i2;
        this.b = i3;
    }

    @Override // defpackage.ankf
    public final void a(byte[] bArr, byte[] bArr2) {
        BigInteger publicExponent = this.a.getPublicExponent();
        BigInteger modulus = this.a.getModulus();
        int bitLength = modulus.bitLength();
        int bitLength2 = (modulus.bitLength() + 6) / 8;
        if ((bitLength + 7) / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger J2 = aobq.J(bArr);
        if (J2.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] L = aobq.L(J2.modPow(publicExponent, modulus), bitLength2);
        int bitLength3 = modulus.bitLength() - 1;
        int i = anrp.a;
        MessageDigest messageDigest = (MessageDigest) anqy.d.a(aobq.M(this.c));
        byte[] digest = messageDigest.digest(bArr2);
        int digestLength = messageDigest.getDigestLength();
        int length = L.length;
        if (length < this.b + digestLength + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (L[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] copyOf = Arrays.copyOf(L, i3);
        int length2 = copyOf.length;
        byte[] copyOfRange = Arrays.copyOfRange(L, length2, length2 + digestLength);
        int i4 = 0;
        while (true) {
            int i5 = digestLength;
            long j = (length * 8) - bitLength3;
            if (i4 < j) {
                if (((copyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i4++;
                digestLength = i5;
            } else {
                byte[] O = aobq.O(copyOfRange, i3, this.d);
                int length3 = O.length;
                byte[] bArr3 = new byte[length3];
                for (int i6 = 0; i6 < length3; i6++) {
                    bArr3[i6] = (byte) (O[i6] ^ copyOf[i6]);
                }
                for (int i7 = 0; i7 <= j; i7++) {
                    int i8 = i7 / 8;
                    bArr3[i8] = (byte) (bArr3[i8] & ((1 << (7 - (i7 % 8))) ^ (-1)));
                }
                int i9 = 0;
                while (true) {
                    int i10 = this.b;
                    int i11 = (i2 - i10) - 2;
                    if (i9 < i11) {
                        if (bArr3[i9] != 0) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        i9++;
                    } else {
                        if (bArr3[i11] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr3, length3 - i10, length3);
                        int i12 = i5 + 8;
                        byte[] bArr4 = new byte[this.b + i12];
                        System.arraycopy(digest, 0, bArr4, 8, digest.length);
                        System.arraycopy(copyOfRange2, 0, bArr4, i12, copyOfRange2.length);
                        if (!aocz.au(messageDigest.digest(bArr4), copyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                }
            }
        }
    }
}
