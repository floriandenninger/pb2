package defpackage;

import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anqk implements ankf {
    private final ECPublicKey a;
    private final String b;
    private final int c;

    public anqk(ECPublicKey eCPublicKey, int i, int i2) {
        if (!aobq.af(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        aocz.al(eCPublicKey);
        this.b = aobq.N(i);
        this.a = eCPublicKey;
        this.c = i2;
    }

    @Override // defpackage.ankf
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i;
        if (this.c == 1) {
            EllipticCurve curve = this.a.getParams().getCurve();
            int length = bArr.length;
            int ah = aocz.ah(curve);
            if (length != ah + ah) {
                throw new GeneralSecurityException("Invalid signature");
            }
            if ((length & 1) != 0 || length == 0 || length > 132) {
                throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
            }
            int i2 = length >> 1;
            byte[] an = aocz.an(Arrays.copyOf(bArr, i2));
            byte[] an2 = aocz.an(Arrays.copyOfRange(bArr, i2, length));
            int length2 = an.length;
            int length3 = an2.length;
            int i3 = length2 + 4 + length3;
            if (i3 >= 128) {
                bArr3 = new byte[i3 + 3];
                bArr3[0] = 48;
                bArr3[1] = -127;
                bArr3[2] = (byte) i3;
                i = 3;
            } else {
                bArr3 = new byte[i3 + 2];
                bArr3[0] = 48;
                bArr3[1] = (byte) i3;
                i = 2;
            }
            int i4 = i + 1;
            bArr3[i] = 2;
            int i5 = i4 + 1;
            bArr3[i4] = (byte) length2;
            System.arraycopy(an, 0, bArr3, i5, length2);
            int i6 = i5 + length2;
            int i7 = i6 + 1;
            bArr3[i6] = 2;
            bArr3[i7] = (byte) length3;
            System.arraycopy(an2, 0, bArr3, i7 + 1, length3);
            bArr = bArr3;
        }
        if (!aocz.am(bArr)) {
            throw new GeneralSecurityException("Invalid signature");
        }
        Signature signature = (Signature) anqy.c.a(this.b);
        signature.initVerify(this.a);
        signature.update(bArr2);
        try {
            if (signature.verify(bArr)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
