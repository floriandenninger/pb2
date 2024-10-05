package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anqs {
    private static final anqp b = new anqp(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final anqr c = new anqr(new anqp(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, null), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, (byte[]) null);
    static final byte[] a = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static int a(long[] jArr) {
        return anrb.g(jArr)[0] & 1;
    }

    public static void b(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    public static boolean c(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        anrb.c(jArr2);
        byte[] g = anrb.g(jArr2);
        for (int i = 0; i < 32; i++) {
            if (g[i] != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        char c2;
        byte b2;
        int i;
        byte b3;
        byte[] bArr4 = bArr2;
        int i2 = 0;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i3 = 31;
        int i4 = 31;
        while (i4 >= 0) {
            int i5 = copyOfRange[i4] & 255;
            int i6 = a[i4] & 255;
            if (i5 != i6) {
                if (i5 >= i6) {
                    return false;
                }
                MessageDigest messageDigest = (MessageDigest) anqy.d.a("SHA-512");
                messageDigest.update(bArr4, i2, 32);
                messageDigest.update(bArr3);
                messageDigest.update(bArr);
                byte[] digest = messageDigest.digest();
                long h = h(digest, i2) & 2097151;
                long i7 = (i(digest, 2) >> 5) & 2097151;
                long h2 = (h(digest, 5) >> 2) & 2097151;
                long i8 = (i(digest, 7) >> 7) & 2097151;
                long i9 = (i(digest, 10) >> 4) & 2097151;
                long h3 = (h(digest, 13) >> 1) & 2097151;
                long i10 = (i(digest, 15) >> 6) & 2097151;
                long h4 = h(digest, 18) >> 3;
                long h5 = h(digest, 21) & 2097151;
                long i11 = (i(digest, 23) >> 5) & 2097151;
                long h6 = (h(digest, 26) >> 2) & 2097151;
                long i12 = (i(digest, 28) >> 7) & 2097151;
                long i13 = (i(digest, i3) >> 4) & 2097151;
                long h7 = (h(digest, 34) >> 1) & 2097151;
                long i14 = (i(digest, 36) >> 6) & 2097151;
                long h8 = h(digest, 39);
                long h9 = h(digest, 42);
                long i15 = i(digest, 44);
                long h10 = (h(digest, 47) >> 2) & 2097151;
                long i16 = (i(digest, 49) >> 7) & 2097151;
                long i17 = (i(digest, 52) >> 4) & 2097151;
                long h11 = (h(digest, 55) >> 1) & 2097151;
                long i18 = (i(digest, 57) >> 6) & 2097151;
                long i19 = i(digest, 60) >> 3;
                long j = (h9 & 2097151) - (i19 * 683901);
                long j2 = ((i14 - (i19 * 997805)) + (i18 * 136657)) - (h11 * 683901);
                long j3 = ((((i13 + (i19 * 470296)) + (i18 * 654183)) - (h11 * 997805)) + (i17 * 136657)) - (i16 * 683901);
                long j4 = i10 + (h10 * 666643);
                long j5 = h5 + (i17 * 666643) + (i16 * 470296) + (h10 * 654183);
                long j6 = ((((h6 + (i18 * 666643)) + (h11 * 470296)) + (i17 * 654183)) - (i16 * 997805)) + (h10 * 136657);
                long j7 = (j4 + 1048576) >> 21;
                long j8 = h4 + (i16 * 666643) + (h10 * 470296) + j7;
                long j9 = (j5 + 1048576) >> 21;
                long j10 = ((((i11 + (h11 * 666643)) + (i17 * 470296)) + (i16 * 654183)) - (h10 * 997805)) + j9;
                long j11 = (j6 + 1048576) >> 21;
                long j12 = ((((((i12 + (i19 * 666643)) + (i18 * 470296)) + (h11 * 654183)) - (i17 * 997805)) + (i16 * 136657)) - (h10 * 683901)) + j11;
                long j13 = (j3 + 1048576) >> 21;
                long j14 = ((((h7 + (i19 * 654183)) - (i18 * 997805)) + (h11 * 136657)) - (i17 * 683901)) + j13;
                long j15 = (j2 + 1048576) >> 21;
                long j16 = (((h8 >> 3) + (i19 * 136657)) - (i18 * 683901)) + j15;
                long j17 = (j + 1048576) >> 21;
                long j18 = ((i15 >> 5) & 2097151) + j17;
                long j19 = (j8 + 1048576) >> 21;
                long j20 = (j10 + 1048576) >> 21;
                long j21 = (j12 + 1048576) >> 21;
                long j22 = (j3 - (j13 << 21)) + j21;
                long j23 = (j14 + 1048576) >> 21;
                long j24 = (j2 - (j15 << 21)) + j23;
                long j25 = j14 - (j23 << 21);
                long j26 = (j16 + 1048576) >> 21;
                long j27 = (j - (j17 << 21)) + j26;
                long j28 = j16 - (j26 << 21);
                long j29 = ((j6 - (j11 << 21)) + j20) - (j18 * 683901);
                long j30 = ((((j5 - (j9 << 21)) + j19) - (j18 * 997805)) + (j27 * 136657)) - (j28 * 683901);
                long j31 = (((((j4 - (j7 << 21)) + (j18 * 470296)) + (j27 * 654183)) - (j28 * 997805)) + (j24 * 136657)) - (j25 * 683901);
                long j32 = h + (j22 * 666643);
                long j33 = h2 + (j24 * 666643) + (j25 * 470296) + (j22 * 654183);
                long j34 = ((((i9 + (j27 * 666643)) + (j28 * 470296)) + (j24 * 654183)) - (j25 * 997805)) + (j22 * 136657);
                long j35 = (j32 + 1048576) >> 21;
                long j36 = i7 + (j25 * 666643) + (j22 * 470296) + j35;
                long j37 = (j33 + 1048576) >> 21;
                long j38 = ((((i8 + (j28 * 666643)) + (j24 * 470296)) + (j25 * 654183)) - (j22 * 997805)) + j37;
                long j39 = (j34 + 1048576) >> 21;
                long j40 = ((((((h3 + (j18 * 666643)) + (j27 * 470296)) + (j28 * 654183)) - (j24 * 997805)) + (j25 * 136657)) - (j22 * 683901)) + j39;
                long j41 = (j31 + 1048576) >> 21;
                long j42 = (((((j8 - (j19 << 21)) + (j18 * 654183)) - (j27 * 997805)) + (j28 * 136657)) - (j24 * 683901)) + j41;
                long j43 = (j30 + 1048576) >> 21;
                long j44 = (((j10 - (j20 << 21)) + (j18 * 136657)) - (j27 * 683901)) + j43;
                long j45 = (j29 + 1048576) >> 21;
                long j46 = (j12 - (j21 << 21)) + j45;
                long j47 = (j36 + 1048576) >> 21;
                long j48 = (j38 + 1048576) >> 21;
                long j49 = (j40 + 1048576) >> 21;
                long j50 = (j42 + 1048576) >> 21;
                long j51 = (j44 + 1048576) >> 21;
                long j52 = (j46 + 1048576) >> 21;
                long j53 = (j32 - (j35 << 21)) + (j52 * 666643);
                long j54 = j53 >> 21;
                long j55 = (j36 - (j47 << 21)) + (j52 * 470296) + j54;
                long j56 = j55 >> 21;
                long j57 = (j33 - (j37 << 21)) + j47 + (j52 * 654183) + j56;
                long j58 = j57 >> 21;
                long j59 = ((j38 - (j48 << 21)) - (j52 * 997805)) + j58;
                long j60 = j59 >> 21;
                long j61 = (j34 - (j39 << 21)) + j48 + (j52 * 136657) + j60;
                long j62 = j61 >> 21;
                long j63 = ((j40 - (j49 << 21)) - (j52 * 683901)) + j62;
                long j64 = j63 >> 21;
                long j65 = (j31 - (j41 << 21)) + j49 + j64;
                long j66 = j65 >> 21;
                long j67 = (j42 - (j50 << 21)) + j66;
                long j68 = j67 >> 21;
                long j69 = (j30 - (j43 << 21)) + j50 + j68;
                long j70 = j69 >> 21;
                long j71 = (j44 - (j51 << 21)) + j70;
                long j72 = j71 >> 21;
                long j73 = (j29 - (j45 << 21)) + j51 + j72;
                long j74 = j73 >> 21;
                long j75 = (j46 - (j52 << 21)) + j74;
                long j76 = j75 >> 21;
                long j77 = (j53 - (j54 << 21)) + (666643 * j76);
                long j78 = j77 >> 21;
                long j79 = (j55 - (j56 << 21)) + (470296 * j76) + j78;
                long j80 = j77 - (j78 << 21);
                long j81 = j79 >> 21;
                long j82 = (j57 - (j58 << 21)) + (654183 * j76) + j81;
                long j83 = j79 - (j81 << 21);
                long j84 = j82 >> 21;
                long j85 = ((j59 - (j60 << 21)) - (997805 * j76)) + j84;
                long j86 = j82 - (j84 << 21);
                long j87 = j85 >> 21;
                long j88 = (j61 - (j62 << 21)) + (136657 * j76) + j87;
                long j89 = j85 - (j87 << 21);
                long j90 = j88 >> 21;
                long j91 = ((j63 - (j64 << 21)) - (683901 * j76)) + j90;
                long j92 = j88 - (j90 << 21);
                long j93 = j91 >> 21;
                long j94 = (j65 - (j66 << 21)) + j93;
                long j95 = j91 - (j93 << 21);
                long j96 = j94 >> 21;
                long j97 = (j67 - (j68 << 21)) + j96;
                long j98 = j94 - (j96 << 21);
                long j99 = j97 >> 21;
                long j100 = (j69 - (j70 << 21)) + j99;
                long j101 = j97 - (j99 << 21);
                long j102 = j100 >> 21;
                long j103 = (j71 - (j72 << 21)) + j102;
                long j104 = j100 - (j102 << 21);
                long j105 = j103 >> 21;
                long j106 = (j73 - (j74 << 21)) + j105;
                long j107 = j103 - (j105 << 21);
                long j108 = j106 >> 21;
                long j109 = (j75 - (j76 << 21)) + j108;
                long j110 = j106 - (j108 << 21);
                digest[0] = (byte) j80;
                digest[1] = (byte) (j80 >> 8);
                digest[2] = (byte) ((j80 >> 16) | (j83 << 5));
                digest[3] = (byte) (j83 >> 3);
                digest[4] = (byte) (j83 >> 11);
                digest[5] = (byte) ((j83 >> 19) | (j86 << 2));
                digest[6] = (byte) (j86 >> 6);
                digest[7] = (byte) ((j86 >> 14) | (j89 << 7));
                digest[8] = (byte) (j89 >> 1);
                digest[9] = (byte) (j89 >> 9);
                digest[10] = (byte) ((j89 >> 17) | (j92 << 4));
                digest[11] = (byte) (j92 >> 4);
                digest[12] = (byte) (j92 >> 12);
                digest[13] = (byte) ((j92 >> 20) | (j95 + j95));
                digest[14] = (byte) (j95 >> 7);
                digest[15] = (byte) ((j95 >> 15) | (j98 << 6));
                digest[16] = (byte) (j98 >> 2);
                digest[17] = (byte) (j98 >> 10);
                digest[18] = (byte) ((j98 >> 18) | (j101 << 3));
                digest[19] = (byte) (j101 >> 5);
                digest[20] = (byte) (j101 >> 13);
                digest[21] = (byte) j104;
                digest[22] = (byte) (j104 >> 8);
                digest[23] = (byte) ((j104 >> 16) | (j107 << 5));
                digest[24] = (byte) (j107 >> 3);
                digest[25] = (byte) (j107 >> 11);
                digest[26] = (byte) ((j107 >> 19) | (j110 << 2));
                digest[27] = (byte) (j110 >> 6);
                digest[28] = (byte) ((j110 >> 14) | (j109 << 7));
                digest[29] = (byte) (j109 >> 1);
                digest[30] = (byte) (j109 >> 9);
                digest[i3] = (byte) (j109 >> 17);
                long[] jArr = new long[10];
                long[] h12 = anrb.h(bArr3);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                anrb.d(jArr4, h12);
                anrb.a(jArr5, jArr4, anqu.a);
                anrb.e(jArr4, jArr4, jArr2);
                anrb.f(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                anrb.d(jArr8, jArr5);
                anrb.a(jArr8, jArr8, jArr5);
                anrb.d(jArr, jArr8);
                anrb.a(jArr, jArr, jArr5);
                anrb.a(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                anrb.d(jArr9, jArr);
                anrb.d(jArr10, jArr9);
                anrb.d(jArr10, jArr10);
                anrb.a(jArr10, jArr, jArr10);
                anrb.a(jArr9, jArr9, jArr10);
                anrb.d(jArr9, jArr9);
                anrb.a(jArr9, jArr10, jArr9);
                anrb.d(jArr10, jArr9);
                byte[] bArr5 = copyOfRange;
                for (int i20 = 1; i20 < 5; i20++) {
                    anrb.d(jArr10, jArr10);
                }
                anrb.a(jArr9, jArr10, jArr9);
                anrb.d(jArr10, jArr9);
                for (int i21 = 1; i21 < 10; i21++) {
                    anrb.d(jArr10, jArr10);
                }
                anrb.a(jArr10, jArr10, jArr9);
                anrb.d(jArr11, jArr10);
                for (int i22 = 1; i22 < 20; i22++) {
                    anrb.d(jArr11, jArr11);
                }
                anrb.a(jArr10, jArr11, jArr10);
                anrb.d(jArr10, jArr10);
                for (int i23 = 1; i23 < 10; i23++) {
                    anrb.d(jArr10, jArr10);
                }
                anrb.a(jArr9, jArr10, jArr9);
                anrb.d(jArr10, jArr9);
                for (int i24 = 1; i24 < 50; i24++) {
                    anrb.d(jArr10, jArr10);
                }
                anrb.a(jArr10, jArr10, jArr9);
                anrb.d(jArr11, jArr10);
                for (int i25 = 1; i25 < 100; i25++) {
                    anrb.d(jArr11, jArr11);
                }
                anrb.a(jArr10, jArr11, jArr10);
                anrb.d(jArr10, jArr10);
                for (int i26 = 1; i26 < 50; i26++) {
                    anrb.d(jArr10, jArr10);
                }
                anrb.a(jArr9, jArr10, jArr9);
                anrb.d(jArr9, jArr9);
                anrb.d(jArr9, jArr9);
                anrb.a(jArr, jArr9, jArr);
                anrb.a(jArr, jArr, jArr8);
                anrb.a(jArr, jArr, jArr4);
                anrb.d(jArr6, jArr);
                anrb.a(jArr6, jArr6, jArr5);
                anrb.e(jArr7, jArr6, jArr4);
                if (c(jArr7)) {
                    anrb.f(jArr7, jArr6, jArr4);
                    if (c(jArr7)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    anrb.a(jArr, jArr, anqu.c);
                }
                if (c(jArr)) {
                    c2 = 31;
                    b2 = 255;
                    i = 7;
                } else {
                    c2 = 31;
                    b2 = 255;
                    i = 7;
                    if (((bArr3[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                }
                if (a(jArr) == ((bArr3[c2] & b2) >> i)) {
                    b(jArr, jArr);
                }
                anrb.a(jArr3, jArr, h12);
                anqr anqrVar = new anqr(new anqp(jArr, h12, jArr2, null), jArr3, (byte[]) null);
                anqq[] anqqVarArr = new anqq[8];
                anqqVarArr[0] = new anqq(anqrVar);
                anqr anqrVar2 = new anqr(new anqp((byte[]) null), new long[10], (byte[]) null);
                m(anqrVar2, anqrVar.b);
                anqr anqrVar3 = new anqr(anqrVar2, null);
                for (int i27 = 1; i27 < 8; i27++) {
                    l(anqrVar2, anqrVar3, anqqVarArr[i27 - 1]);
                    anqqVarArr[i27] = new anqq(new anqr(anqrVar2, null));
                }
                byte[] k = k(digest);
                byte[] k2 = k(bArr5);
                anqr anqrVar4 = new anqr(c, (byte[]) null, (byte[]) null);
                anqr anqrVar5 = new anqr();
                int i28 = PrivateKeyType.INVALID;
                while (i28 >= 0 && k[i28] == 0 && k2[i28] == 0) {
                    i28--;
                }
                while (i28 >= 0) {
                    m(anqrVar4, new anqp(anqrVar4, (byte[]) null));
                    byte b4 = k[i28];
                    if (b4 > 0) {
                        anqr.a(anqrVar5, anqrVar4);
                        b3 = 2;
                        l(anqrVar4, anqrVar5, anqqVarArr[k[i28] / 2]);
                    } else {
                        b3 = 2;
                        if (b4 < 0) {
                            anqr.a(anqrVar5, anqrVar4);
                            n(anqrVar4, anqrVar5, anqqVarArr[(-k[i28]) / 2]);
                        }
                    }
                    byte b5 = k2[i28];
                    if (b5 > 0) {
                        anqr.a(anqrVar5, anqrVar4);
                        l(anqrVar4, anqrVar5, anqu.e[k2[i28] / b3]);
                    } else if (b5 < 0) {
                        anqr.a(anqrVar5, anqrVar4);
                        n(anqrVar4, anqrVar5, anqu.e[(-k2[i28]) / b3]);
                    }
                    i28--;
                }
                byte[] c3 = new anqp(anqrVar4, (byte[]) null).c();
                for (int i29 = 0; i29 < 32; i29++) {
                    if (c3[i29] != bArr2[i29]) {
                        return false;
                    }
                }
                return true;
            }
            i4--;
            bArr4 = bArr2;
            copyOfRange = copyOfRange;
            i2 = 0;
            i3 = 31;
        }
        return false;
    }

    public static byte[] e(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) anqy.d.a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        int i = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) i;
        digest[31] = (byte) (i | 64);
        return digest;
    }

    public static byte[] f(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b2 = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b2;
            int i6 = (b2 + 8) >> 4;
            bArr2[i4] = (byte) (b2 - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        anqr anqrVar = new anqr(c, (byte[]) null, (byte[]) null);
        anqr anqrVar2 = new anqr();
        for (i = 1; i < 64; i += 2) {
            anqp anqpVar = new anqp(b);
            j(anqpVar, i / 2, bArr2[i]);
            anqr.a(anqrVar2, anqrVar);
            l(anqrVar, anqrVar2, anqpVar);
        }
        anqp anqpVar2 = new anqp((byte[]) null);
        anqp.d(anqpVar2, anqrVar);
        m(anqrVar, anqpVar2);
        anqp.d(anqpVar2, anqrVar);
        m(anqrVar, anqpVar2);
        anqp.d(anqpVar2, anqrVar);
        m(anqrVar, anqpVar2);
        anqp.d(anqpVar2, anqrVar);
        m(anqrVar, anqpVar2);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            anqp anqpVar3 = new anqp(b);
            j(anqpVar3, i7 / 2, bArr2[i7]);
            anqr.a(anqrVar2, anqrVar);
            l(anqrVar, anqrVar2, anqpVar3);
        }
        anqp anqpVar4 = new anqp(anqrVar, (byte[]) null);
        long[] jArr = new long[10];
        anrb.d(jArr, anqpVar4.c);
        long[] jArr2 = new long[10];
        anrb.d(jArr2, anqpVar4.b);
        long[] jArr3 = new long[10];
        anrb.d(jArr3, anqpVar4.a);
        long[] jArr4 = new long[10];
        anrb.d(jArr4, jArr3);
        long[] jArr5 = new long[10];
        anrb.e(jArr5, jArr2, jArr);
        anrb.a(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        anrb.a(jArr6, jArr, jArr2);
        anrb.a(jArr6, jArr6, anqu.a);
        anrb.f(jArr6, jArr6, jArr4);
        anrb.b(jArr6, jArr6);
        if (aocz.au(anrb.g(jArr5), anrb.g(jArr6))) {
            return anqpVar4.c();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    private static int g(int i, int i2) {
        int i3 = ((i ^ i2) ^ (-1)) & PrivateKeyType.INVALID;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    private static long h(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static long i(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | h(bArr, i);
    }

    private static void j(anqp anqpVar, int i, byte b2) {
        int i2 = (b2 & 255) >> 7;
        int i3 = (-i2) & b2;
        int i4 = b2 - (i3 + i3);
        anqpVar.a(anqu.d[i][0], g(i4, 1));
        anqpVar.a(anqu.d[i][1], g(i4, 2));
        anqpVar.a(anqu.d[i][2], g(i4, 3));
        anqpVar.a(anqu.d[i][3], g(i4, 4));
        anqpVar.a(anqu.d[i][4], g(i4, 5));
        anqpVar.a(anqu.d[i][5], g(i4, 6));
        anqpVar.a(anqu.d[i][6], g(i4, 7));
        anqpVar.a(anqu.d[i][7], g(i4, 8));
        long[] copyOf = Arrays.copyOf(anqpVar.b, 10);
        long[] copyOf2 = Arrays.copyOf(anqpVar.a, 10);
        long[] copyOf3 = Arrays.copyOf(anqpVar.c, 10);
        b(copyOf3, copyOf3);
        anqpVar.a(new anqp(copyOf, copyOf2, copyOf3), i2);
    }

    private static byte[] k(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b2 = bArr2[i];
                    if (b2 != 0) {
                        byte b3 = bArr2[i3];
                        int i5 = b2 << i4;
                        int i6 = b3 + i5;
                        if (i6 > 15) {
                            int i7 = b3 - i5;
                            if (i7 >= -15) {
                                bArr2[i3] = (byte) i7;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] != 0) {
                                        bArr2[i] = 0;
                                        i++;
                                    } else {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                }
                            }
                        } else {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void l(anqr anqrVar, anqr anqrVar2, anqp anqpVar) {
        long[] jArr = new long[10];
        long[] jArr2 = anqrVar.b.c;
        anqp anqpVar2 = anqrVar2.b;
        anrb.f(jArr2, anqpVar2.b, anqpVar2.c);
        long[] jArr3 = anqrVar.b.b;
        anqp anqpVar3 = anqrVar2.b;
        anrb.e(jArr3, anqpVar3.b, anqpVar3.c);
        long[] jArr4 = anqrVar.b.b;
        anrb.a(jArr4, jArr4, anqpVar.b);
        anqp anqpVar4 = anqrVar.b;
        anrb.a(anqpVar4.a, anqpVar4.c, anqpVar.a);
        anrb.a(anqrVar.a, anqrVar2.a, anqpVar.c);
        anqpVar.b(anqrVar.b.c, anqrVar2.b.a);
        long[] jArr5 = anqrVar.b.c;
        anrb.f(jArr, jArr5, jArr5);
        anqp anqpVar5 = anqrVar.b;
        anrb.e(anqpVar5.c, anqpVar5.a, anqpVar5.b);
        anqp anqpVar6 = anqrVar.b;
        long[] jArr6 = anqpVar6.b;
        anrb.f(jArr6, anqpVar6.a, jArr6);
        anrb.f(anqrVar.b.a, jArr, anqrVar.a);
        long[] jArr7 = anqrVar.a;
        anrb.e(jArr7, jArr, jArr7);
    }

    private static void m(anqr anqrVar, anqp anqpVar) {
        long[] jArr = new long[10];
        anrb.d(anqrVar.b.c, anqpVar.c);
        anrb.d(anqrVar.b.a, anqpVar.b);
        anrb.d(anqrVar.a, anqpVar.a);
        long[] jArr2 = anqrVar.a;
        anrb.f(jArr2, jArr2, jArr2);
        anrb.f(anqrVar.b.b, anqpVar.c, anqpVar.b);
        anrb.d(jArr, anqrVar.b.b);
        anqp anqpVar2 = anqrVar.b;
        anrb.f(anqpVar2.b, anqpVar2.a, anqpVar2.c);
        anqp anqpVar3 = anqrVar.b;
        long[] jArr3 = anqpVar3.a;
        anrb.e(jArr3, jArr3, anqpVar3.c);
        anqp anqpVar4 = anqrVar.b;
        anrb.e(anqpVar4.c, jArr, anqpVar4.b);
        long[] jArr4 = anqrVar.a;
        anrb.e(jArr4, jArr4, anqrVar.b.a);
    }

    private static void n(anqr anqrVar, anqr anqrVar2, anqp anqpVar) {
        long[] jArr = new long[10];
        long[] jArr2 = anqrVar.b.c;
        anqp anqpVar2 = anqrVar2.b;
        anrb.f(jArr2, anqpVar2.b, anqpVar2.c);
        long[] jArr3 = anqrVar.b.b;
        anqp anqpVar3 = anqrVar2.b;
        anrb.e(jArr3, anqpVar3.b, anqpVar3.c);
        long[] jArr4 = anqrVar.b.b;
        anrb.a(jArr4, jArr4, anqpVar.a);
        anqp anqpVar4 = anqrVar.b;
        anrb.a(anqpVar4.a, anqpVar4.c, anqpVar.b);
        anrb.a(anqrVar.a, anqrVar2.a, anqpVar.c);
        anqpVar.b(anqrVar.b.c, anqrVar2.b.a);
        long[] jArr5 = anqrVar.b.c;
        anrb.f(jArr, jArr5, jArr5);
        anqp anqpVar5 = anqrVar.b;
        anrb.e(anqpVar5.c, anqpVar5.a, anqpVar5.b);
        anqp anqpVar6 = anqrVar.b;
        long[] jArr6 = anqpVar6.b;
        anrb.f(jArr6, anqpVar6.a, jArr6);
        anrb.e(anqrVar.b.a, jArr, anqrVar.a);
        long[] jArr7 = anqrVar.a;
        anrb.f(jArr7, jArr, jArr7);
    }
}
