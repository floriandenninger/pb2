package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class anqi implements anjh {
    private final anqg a;
    private final anqg b;

    public anqi(byte[] bArr) {
        if (!aobq.af(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.a = b(bArr, 1);
        this.b = b(bArr, 0);
    }

    @Override // defpackage.anjh
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > (Integer.MAX_VALUE - this.a.b()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i = 16;
        ByteBuffer allocate = ByteBuffer.allocate(this.a.b() + length + 16);
        if (allocate.remaining() < length + this.a.b() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = allocate.position();
        this.a.e(allocate, bArr);
        byte[] bArr3 = new byte[this.a.b()];
        allocate.get(bArr3);
        byte b = 0;
        byte[] bArr4 = new byte[32];
        this.b.d(bArr3, 0).get(bArr4);
        int remaining = allocate.remaining();
        int i2 = remaining % 16;
        int i3 = i2 == 0 ? remaining : (remaining + 16) - i2;
        ByteBuffer order = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr2);
        order.put(allocate);
        order.putLong(0L);
        order.putLong(remaining);
        byte[] array = order.array();
        long P = aobq.P(bArr4, 0, 0);
        int i4 = 2;
        long P2 = aobq.P(bArr4, 3, 2) & 67108611;
        long P3 = aobq.P(bArr4, 6, 4) & 67092735;
        long P4 = aobq.P(bArr4, 9, 6) & 66076671;
        long P5 = aobq.P(bArr4, 12, 8) & 1048575;
        long j = P2 * 5;
        long j2 = P3 * 5;
        long j3 = P4 * 5;
        long j4 = P5 * 5;
        int i5 = 17;
        byte[] bArr5 = new byte[17];
        int i6 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        while (true) {
            int length2 = array.length;
            if (i6 < length2) {
                int min = Math.min(i, length2 - i6);
                System.arraycopy(array, i6, bArr5, b, min);
                bArr5[min] = 1;
                if (min != i) {
                    Arrays.fill(bArr5, min + 1, i5, b);
                }
                long P6 = j9 + aobq.P(bArr5, b, b);
                long P7 = j6 + aobq.P(bArr5, 3, i4);
                long P8 = j5 + aobq.P(bArr5, 6, 4);
                long P9 = j7 + aobq.P(bArr5, 9, 6);
                long P10 = j8 + (aobq.P(bArr5, 12, 8) | (bArr5[i] << 24));
                long j10 = (P6 * P) + (P7 * j4) + (P8 * j3) + (P9 * j2) + (P10 * j);
                long j11 = (P6 * P2) + (P7 * P) + (P8 * j4) + (P9 * j3) + (P10 * j2) + (j10 >> 26);
                long j12 = (P6 * P3) + (P7 * P2) + (P8 * P) + (P9 * j4) + (P10 * j3) + (j11 >> 26);
                long j13 = (P6 * P4) + (P7 * P3) + (P8 * P2) + (P9 * P) + (P10 * j4) + (j12 >> 26);
                long j14 = (P6 * P5) + (P7 * P4) + (P8 * P3) + (P9 * P2) + (P10 * P) + (j13 >> 26);
                j8 = j14 & 67108863;
                long j15 = (j10 & 67108863) + ((j14 >> 26) * 5);
                j9 = j15 & 67108863;
                j6 = (j11 & 67108863) + (j15 >> 26);
                i6 += 16;
                j7 = j13 & 67108863;
                j5 = j12 & 67108863;
                i5 = 17;
                i = 16;
                b = 0;
                i4 = 2;
            } else {
                long j16 = j5 + (j6 >> 26);
                long j17 = j16 & 67108863;
                long j18 = j7 + (j16 >> 26);
                long j19 = j18 & 67108863;
                long j20 = j8 + (j18 >> 26);
                long j21 = j20 & 67108863;
                long j22 = j9 + ((j20 >> 26) * 5);
                long j23 = j22 & 67108863;
                long j24 = (j6 & 67108863) + (j22 >> 26);
                long j25 = j23 + 5;
                long j26 = (j25 >> 26) + j24;
                long j27 = j17 + (j26 >> 26);
                long j28 = j19 + (j27 >> 26);
                long j29 = (j21 + (j28 >> 26)) - 67108864;
                long j30 = j29 >> 63;
                long j31 = j30 ^ (-1);
                long j32 = (j24 & j30) | (j26 & 67108863 & j31);
                long j33 = (j17 & j30) | (j27 & 67108863 & j31);
                long j34 = (j19 & j30) | (j28 & 67108863 & j31);
                long Q = (((j23 & j30) | (j25 & 67108863 & j31) | (j32 << 26)) & 4294967295L) + aobq.Q(bArr4, 16);
                long Q2 = (((j32 >> 6) | (j33 << 20)) & 4294967295L) + aobq.Q(bArr4, 20) + (Q >> 32);
                long Q3 = (((j33 >> 12) | (j34 << 14)) & 4294967295L) + aobq.Q(bArr4, 24) + (Q2 >> 32);
                long Q4 = aobq.Q(bArr4, 28);
                byte[] bArr6 = new byte[16];
                aobq.R(bArr6, Q & 4294967295L, 0);
                aobq.R(bArr6, Q2 & 4294967295L, 4);
                aobq.R(bArr6, Q3 & 4294967295L, 8);
                aobq.R(bArr6, ((((j34 >> 18) | (((j21 & j30) | (j29 & j31)) << 8)) & 4294967295L) + Q4 + (Q3 >> 32)) & 4294967295L, 12);
                allocate.put(bArr6);
                return allocate.array();
            }
        }
    }

    public abstract anqg b(byte[] bArr, int i);
}
