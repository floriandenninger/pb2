package defpackage;

import android.system.ErrnoException;
import android.system.OsConstants;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfn {
    public static boolean a(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }

    public static int b(pth pthVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return pthVar.i() + 1;
            case 7:
                return pthVar.m() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static boolean c(pth pthVar, bip bipVar, boolean z, tfq tfqVar) {
        try {
            long r = pthVar.r();
            if (!z) {
                r *= bipVar.b;
            }
            tfqVar.a = r;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r7 != r18.f) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if ((r17.i() * 1000) == r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r4 == r3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(defpackage.pth r17, defpackage.bip r18, int r19, defpackage.tfq r20) {
        /*
            r0 = r17
            r1 = r18
            int r2 = r0.b
            long r3 = r17.p()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r19
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L17
            return r9
        L17:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L21
            r5 = 1
            goto L22
        L21:
            r5 = 0
        L22:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 15
            long r11 = r11 & r13
            int r12 = (int) r11
            r11 = 8
            long r15 = r3 >> r11
            long r6 = r15 & r13
            int r7 = (int) r6
            r6 = 4
            long r15 = r3 >> r6
            long r13 = r13 & r15
            int r6 = (int) r13
            long r13 = r3 >> r10
            r15 = 7
            long r13 = r13 & r15
            int r8 = (int) r13
            r13 = 1
            long r3 = r3 & r13
            r11 = 7
            r13 = -1
            if (r6 > r11) goto L49
            int r11 = r1.g
            int r11 = r11 + r13
            if (r6 != r11) goto Lab
            goto L52
        L49:
            r11 = 10
            if (r6 > r11) goto Lab
            int r6 = r1.g
            r11 = 2
            if (r6 != r11) goto Lab
        L52:
            if (r8 != 0) goto L57
        L54:
            r14 = 1
            goto L5c
        L57:
            int r6 = r1.i
            if (r8 != r6) goto Lab
            goto L54
        L5c:
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 == 0) goto Lab
            r3 = r20
            boolean r3 = c(r0, r1, r5, r3)
            if (r3 == 0) goto Lab
            int r3 = b(r0, r12)
            if (r3 == r13) goto Lab
            int r4 = r1.b
            if (r3 > r4) goto Lab
            int r3 = r1.e
            if (r7 != 0) goto L77
            goto L9b
        L77:
            r4 = 11
            if (r7 > r4) goto L80
            int r1 = r1.f
            if (r7 == r1) goto L9b
            goto Lab
        L80:
            r1 = 12
            if (r7 != r1) goto L8d
            int r1 = r17.i()
            int r1 = r1 * 1000
            if (r1 != r3) goto Lab
            goto L9b
        L8d:
            r1 = 14
            if (r7 > r1) goto Lab
            int r4 = r17.m()
            if (r7 != r1) goto L99
            int r4 = r4 * 10
        L99:
            if (r4 != r3) goto Lab
        L9b:
            int r1 = r17.i()
            int r3 = r0.b
            byte[] r0 = r0.a
            int r3 = r3 + r13
            int r0 = defpackage.pts.ap(r0, r2, r3)
            if (r1 != r0) goto Lab
            return r10
        Lab:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfn.d(pth, bip, int, tfq):boolean");
    }
}
