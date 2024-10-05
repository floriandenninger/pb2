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
public final class anls implements anjh {
    private static final ThreadLocal a = new anlr();
    private final SecretKey b;

    public anls(byte[] bArr) {
        anrp.a(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
    }

    @Override // defpackage.anjh
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[length + 28];
            byte[] a2 = anrj.a(12);
            System.arraycopy(a2, 0, bArr3, 0, 12);
            int length2 = a2.length;
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                ivParameterSpec = new GCMParameterSpec(128, a2, 0, length2);
            } catch (ClassNotFoundException unused) {
                if (aobq.K()) {
                    ivParameterSpec = new IvParameterSpec(a2, 0, length2);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal threadLocal = a;
            ((Cipher) threadLocal.get()).init(1, this.b, ivParameterSpec);
            Cipher cipher = (Cipher) threadLocal.get();
            int length3 = bArr.length;
            int doFinal = cipher.doFinal(bArr, 0, length3, bArr3, 12);
            if (doFinal == length3 + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length3)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
