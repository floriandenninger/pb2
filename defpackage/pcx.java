package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pcx implements pbz {
    private static final int a = pgz.c("Xing");
    private static final int b = pgz.c("Info");
    private static final int c = pgz.c("VBRI");
    private pca f;
    private pcn g;
    private int h;
    private pch i;
    private pcw j;
    private long l;
    private int m;
    private final pgx d = new pgx(4);
    private final pgt e = new pgt();
    private long k = -1;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r12 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        r11.j(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        r11.i();
        r11.e(r1 + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean b(defpackage.pbw r11, boolean r12) {
        /*
            r10 = this;
            r11.i()
            long r0 = r11.c
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L1e
            pch r0 = defpackage.pcv.a(r11)
            r10.i = r0
            long r0 = r11.d()
            int r1 = (int) r0
            if (r12 != 0) goto L1c
            r11.j(r1)
        L1c:
            r0 = 0
            goto L20
        L1e:
            r0 = 0
            r1 = 0
        L20:
            r3 = 0
            r4 = 0
        L22:
            if (r12 == 0) goto L2a
            r5 = 4096(0x1000, float:5.74E-42)
            if (r0 == r5) goto L29
            goto L2a
        L29:
            return r2
        L2a:
            if (r12 != 0) goto L39
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r0 == r5) goto L31
            goto L39
        L31:
            oyo r11 = new oyo
            java.lang.String r12 = "Searched too many bytes."
            r11.<init>(r12)
            throw r11
        L39:
            pgx r5 = r10.d
            byte[] r5 = r5.a
            r6 = 4
            r7 = 1
            boolean r5 = r11.l(r5, r2, r6, r7)
            if (r5 != 0) goto L46
            return r2
        L46:
            pgx r5 = r10.d
            r5.z(r2)
            pgx r5 = r10.d
            int r5 = r5.c()
            if (r3 == 0) goto L5b
            r8 = -128000(0xfffffffffffe0c00, float:NaN)
            r9 = r5 & r8
            r8 = r8 & r3
            if (r9 != r8) goto L62
        L5b:
            int r8 = defpackage.pgt.a(r5)
            r9 = -1
            if (r8 != r9) goto L73
        L62:
            int r0 = r0 + 1
            if (r12 == 0) goto L6f
            r11.i()
            int r3 = r1 + r0
            r11.e(r3)
            goto L20
        L6f:
            r11.j(r7)
            goto L20
        L73:
            int r4 = r4 + r7
            if (r4 != r7) goto L7d
            pgt r3 = r10.e
            defpackage.pgt.b(r5, r3)
            r3 = r5
            goto L8c
        L7d:
            if (r4 != r6) goto L8c
            if (r12 == 0) goto L86
            int r1 = r1 + r0
            r11.j(r1)
            goto L89
        L86:
            r11.i()
        L89:
            r10.h = r3
            return r7
        L8c:
            int r8 = r8 + (-4)
            r11.e(r8)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcx.b(pbw, boolean):boolean");
    }

    private final boolean c(pbw pbwVar) {
        try {
            return b(pbwVar, false);
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // defpackage.pbz
    public final void a(pca pcaVar) {
        this.f = pcaVar;
        this.g = pcaVar.pH(0);
        pcaVar.pJ();
    }

    @Override // defpackage.pbz
    public final void d() {
        this.h = 0;
        this.l = 0L;
        this.k = -1L;
        this.m = 0;
    }

    @Override // defpackage.pbz
    public final boolean e(pbw pbwVar) {
        return b(pbwVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0272, code lost:
    
        if (c(r33) == false) goto L107;
     */
    @Override // defpackage.pbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.pbw r33, defpackage.tfq r34) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcx.f(pbw, tfq):int");
    }
}
