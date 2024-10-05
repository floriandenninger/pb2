package defpackage;

import androidx.media3.common.DrmInitData;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhs {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static pms a(pth pthVar, String str, String str2, DrmInitData drmInitData) {
        pthVar.H(1);
        int i = 1 != ((pthVar.i() & 32) >> 5) ? 44100 : 48000;
        pmr pmrVar = new pmr();
        pmrVar.a = str;
        pmrVar.k = "audio/ac4";
        pmrVar.x = 2;
        pmrVar.y = i;
        pmrVar.n = drmInitData;
        pmrVar.c = str2;
        return pmrVar.a();
    }

    public static void b(int i, pth pthVar) {
        pthVar.C(7);
        byte[] bArr = pthVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
        bArr[5] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
        bArr[6] = (byte) (i & PrivateKeyType.INVALID);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r10.n() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r3 = r10.d(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r10.n() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r10.d(3) <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r10.l(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (true == r10.n()) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r5 = 44100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r10 = r10.d(4);
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r5 != 44100) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r10 != 13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        r9 = defpackage.bhs.b[13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        return new defpackage.dkb(r5, r0, r9, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r5 != 48000) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r10 >= 14) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        r9 = defpackage.bhs.b[r10];
        r3 = r3 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r3 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r3 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        if (r3 == 3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r3 == 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        if (r10 == 3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r10 == 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
    
        if (r10 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        if (r10 == 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        if (r10 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        if (r10 == 3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        if (r10 != 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0058, code lost:
    
        r5 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r10.d(2) == 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r10.d(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dkb c(defpackage.ptg r10) {
        /*
            r0 = 16
            int r1 = r10.d(r0)
            int r0 = r10.d(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.d(r0)
            r3 = 7
            goto L19
        L18:
            r3 = 4
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r3 = r10.d(r1)
            r4 = 3
            if (r3 != r4) goto L32
        L29:
            r10.d(r1)
            boolean r3 = r10.n()
            if (r3 != 0) goto L29
        L32:
            r3 = 10
            int r3 = r10.d(r3)
            boolean r5 = r10.n()
            if (r5 == 0) goto L47
            int r5 = r10.d(r4)
            if (r5 <= 0) goto L47
            r10.l(r1)
        L47:
            boolean r5 = r10.n()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            r8 = 1
            if (r8 == r5) goto L58
            r5 = 44100(0xac44, float:6.1797E-41)
            goto L5b
        L58:
            r5 = 48000(0xbb80, float:6.7262E-41)
        L5b:
            int r10 = r10.d(r2)
            r9 = 0
            if (r5 != r6) goto L6b
            r6 = 13
            if (r10 != r6) goto L6b
            int[] r10 = defpackage.bhs.b
            r9 = r10[r6]
            goto L96
        L6b:
            if (r5 != r7) goto L96
            r6 = 14
            if (r10 >= r6) goto L96
            int[] r6 = defpackage.bhs.b
            r9 = r6[r10]
            int r3 = r3 % 5
            r6 = 8
            if (r3 == r8) goto L90
            r7 = 11
            if (r3 == r1) goto L8b
            if (r3 == r4) goto L90
            if (r3 == r2) goto L84
            goto L96
        L84:
            if (r10 == r4) goto L94
            if (r10 == r6) goto L94
            if (r10 != r7) goto L96
            goto L94
        L8b:
            if (r10 == r6) goto L94
            if (r10 != r7) goto L96
            goto L94
        L90:
            if (r10 == r4) goto L94
            if (r10 != r6) goto L96
        L94:
            int r9 = r9 + 1
        L96:
            dkb r10 = new dkb
            r1 = 0
            r10.<init>(r5, r0, r9, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhs.c(ptg):dkb");
    }
}
