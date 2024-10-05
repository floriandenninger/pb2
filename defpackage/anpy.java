package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anpy implements anrd {
    private static final ThreadLocal a = new anpx();
    private final SecretKeySpec b;
    private final int c;
    private final int d;

    public anpy(byte[] bArr, int i) {
        if (!aobq.af(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        anrp.a(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) a.get()).getBlockSize();
        this.d = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.c = i;
    }

    @Override // defpackage.anrd
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = this.c;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("plaintext length can not exceed ");
            sb.append(i2);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[i + length];
        byte[] a2 = anrj.a(i);
        System.arraycopy(a2, 0, bArr2, 0, this.c);
        int i3 = this.c;
        Cipher cipher = (Cipher) a.get();
        byte[] bArr3 = new byte[this.d];
        System.arraycopy(a2, 0, bArr3, 0, this.c);
        cipher.init(1, this.b, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length, bArr2, i3) == length) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
