package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anqd implements anjh {
    private static final ThreadLocal a = new anqc();
    private final SecretKey b;

    public anqd(byte[] bArr) {
        if (!aobq.af(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        anrp.a(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
    }

    @Override // defpackage.anjh
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec gCMParameterSpec;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[length + 28];
            byte[] a2 = anrj.a(12);
            System.arraycopy(a2, 0, bArr3, 0, 12);
            int length2 = a2.length;
            if (!aobq.K() || aobq.I() > 19) {
                gCMParameterSpec = new GCMParameterSpec(128, a2, 0, length2);
            } else {
                gCMParameterSpec = new IvParameterSpec(a2, 0, length2);
            }
            ThreadLocal threadLocal = a;
            ((Cipher) threadLocal.get()).init(1, this.b, gCMParameterSpec);
            int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
