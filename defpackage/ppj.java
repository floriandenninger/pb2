package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ppj extends ppc {
    public static final ppi a = ppi.a;
    private final ppi b;

    public ppj() {
        this(null);
    }

    public ppj(ppi ppiVar) {
        this.b = ppiVar;
    }

    private static int d(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int e(byte[] bArr, int i, int i2) {
        int f = f(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return f;
        }
        while (true) {
            int length = bArr.length;
            if (f >= length - 1) {
                return length;
            }
            if ((f - i) % 2 == 0 && bArr[f + 1] == 0) {
                return f;
            }
            f = f(bArr, f + 1);
        }
    }

    private static int f(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int g(pth pthVar, int i) {
        byte[] bArr = pthVar.a;
        int i2 = pthVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    private static String h(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    private static String i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String j(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if ((r10 & 128) != 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean k(defpackage.pth r19, int r20, int r21, boolean r22) {
        /*
            r1 = r19
            r0 = r20
            int r2 = r1.b
        L6:
            int r3 = r19.a()     // Catch: java.lang.Throwable -> Lac
            r4 = 1
            r5 = r21
            if (r3 < r5) goto La8
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L20
            int r7 = r19.d()     // Catch: java.lang.Throwable -> Lac
            long r8 = r19.p()     // Catch: java.lang.Throwable -> Lac
            int r10 = r19.m()     // Catch: java.lang.Throwable -> Lac
            goto L2a
        L20:
            int r7 = r19.k()     // Catch: java.lang.Throwable -> Lac
            int r8 = r19.k()     // Catch: java.lang.Throwable -> Lac
            long r8 = (long) r8
            r10 = 0
        L2a:
            r11 = 0
            if (r7 != 0) goto L39
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L39
            if (r10 == 0) goto L35
            goto L39
        L35:
            r1.G(r2)
            return r4
        L39:
            r7 = 4
            if (r0 != r7) goto L68
            if (r22 != 0) goto L68
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4a
            r1.G(r2)
            return r6
        L4a:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r11 = r11 & r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 24
            long r8 = r8 >> r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L68:
            if (r0 != r7) goto L78
            r3 = r10 & 64
            if (r3 == 0) goto L6f
            goto L70
        L6f:
            r4 = 0
        L70:
            r3 = r10 & 1
            r18 = r4
            r4 = r3
            r3 = r18
            goto L88
        L78:
            if (r0 != r3) goto L86
            r3 = r10 & 32
            if (r3 == 0) goto L80
            r3 = 1
            goto L81
        L80:
            r3 = 0
        L81:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L87
            goto L88
        L86:
            r3 = 0
        L87:
            r4 = 0
        L88:
            if (r4 == 0) goto L8c
            int r3 = r3 + 4
        L8c:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L95
            r1.G(r2)
            return r6
        L95:
            int r3 = r19.a()     // Catch: java.lang.Throwable -> Lac
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La2
            r1.G(r2)
            return r6
        La2:
            int r3 = (int) r8
            r1.H(r3)     // Catch: java.lang.Throwable -> Lac
            goto L6
        La8:
            r1.G(r2)
            return r4
        Lac:
            r0 = move-exception
            r1.G(r2)
            goto Lb2
        Lb1:
            throw r0
        Lb2:
            goto Lb1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppj.k(pth, int, int, boolean):boolean");
    }

    private static byte[] l(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return pts.f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x026b, code lost:
    
        if (r9 == 67) goto L141;
     */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0542: MOVE (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:231:0x0540 */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame m(int r34, defpackage.pth r35, boolean r36, int r37, defpackage.ppi r38) {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppj.m(int, pth, boolean, int, ppi):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    @Override // defpackage.ppc
    protected final Metadata b(ppz ppzVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.metadata.Metadata c(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppj.c(byte[], int):com.google.android.exoplayer2.metadata.Metadata");
    }
}
