package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anqb implements anjh {
    private static final ThreadLocal a = new anpz();
    private static final ThreadLocal b = new anqa();
    private final byte[] c;
    private final byte[] d;
    private final SecretKeySpec e;
    private final int f;

    public anqb(byte[] bArr, int i) {
        if (!aobq.af(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i == 12 || i == 16) {
            this.f = i;
            anrp.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.e = secretKeySpec;
            Cipher cipher = (Cipher) a.get();
            cipher.init(1, secretKeySpec);
            byte[] b2 = b(cipher.doFinal(new byte[16]));
            this.c = b2;
            this.d = b(b2);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    private static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b2 = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b2 + b2) ^ ((bArr[i2] & 255) >>> 7)) & PrivateKeyType.INVALID);
            i = i2;
        }
        byte b3 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b3 + b3));
        return bArr2;
    }

    private final byte[] c(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(d(bArr3, this.c));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = d(copyOfRange, this.c);
        } else {
            byte[] copyOf = Arrays.copyOf(this.d, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(d(doFinal, bArr2));
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // defpackage.anjh
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f;
        if (length > (Integer.MAX_VALUE - i) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i + length + 16];
        byte[] a2 = anrj.a(i);
        System.arraycopy(a2, 0, bArr3, 0, this.f);
        Cipher cipher = (Cipher) a.get();
        cipher.init(1, this.e);
        byte[] c = c(cipher, 0, a2, 0, a2.length);
        byte[] c2 = c(cipher, 1, bArr2, 0, 0);
        Cipher cipher2 = (Cipher) b.get();
        cipher2.init(1, this.e, new IvParameterSpec(c));
        cipher2.doFinal(bArr, 0, length, bArr3, this.f);
        byte[] c3 = c(cipher, 2, bArr3, this.f, length);
        int i2 = length + this.f;
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i2 + i3] = (byte) ((c2[i3] ^ c[i3]) ^ c3[i3]);
        }
        return bArr3;
    }
}
