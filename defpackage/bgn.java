package defpackage;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgn {
    private final Cipher a;
    private final int b;
    private final byte[] c;
    private final byte[] d;
    private int e;

    public bgn(int i, byte[] bArr, long j, long j2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.a = cipher;
            int blockSize = cipher.getBlockSize();
            this.b = blockSize;
            this.c = new byte[blockSize];
            this.d = new byte[blockSize];
            long j3 = blockSize;
            int i2 = (int) (j2 % j3);
            cipher.init(i, new SecretKeySpec(bArr, pts.ag(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(ByteBuffer.allocate(16).putLong(j).putLong(j2 / j3).array()));
            if (i2 != 0) {
                byte[] bArr2 = new byte[i2];
                a(bArr2, 0, i2, bArr2, 0);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    private final int b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            return this.a.update(bArr, i, i2, bArr2, i3);
        } catch (ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }

    public final void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i;
        do {
            int i5 = this.e;
            if (i5 <= 0) {
                int b = b(bArr, i4, i2, bArr2, i3);
                if (i2 == b) {
                    return;
                }
                int i6 = i2 - b;
                int i7 = 0;
                pse.g(i6 < this.b);
                int i8 = i3 + b;
                int i9 = this.b - i6;
                this.e = i9;
                pse.g(b(this.c, 0, i9, this.d, 0) == this.b);
                while (i7 < i6) {
                    bArr2[i8] = this.d[i7];
                    i7++;
                    i8++;
                }
                return;
            }
            bArr2[i3] = (byte) (bArr[i4] ^ this.d[this.b - i5]);
            i3++;
            i4++;
            this.e = i5 - 1;
            i2--;
        } while (i2 != 0);
    }
}
