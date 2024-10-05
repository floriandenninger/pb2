package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pef implements pbz {
    private static final int a = pgz.c("ID3");
    private final pgx b = new pgx(200);
    private peg c;
    private boolean d;

    @Override // defpackage.pbz
    public final void a(pca pcaVar) {
        this.c = new peg(pcaVar.pH(0), pcaVar.pH(1));
        pcaVar.pJ();
        pcaVar.pK(pcm.f);
    }

    @Override // defpackage.pbz
    public final void d() {
        this.d = false;
        this.c.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r13.i();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if ((r5 - r4) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        return false;
     */
    @Override // defpackage.pbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.pbw r13) {
        /*
            r12 = this;
            pgx r0 = new pgx
            r1 = 10
            r0.<init>(r1)
            pgw r2 = new pgw
            byte[] r3 = r0.a
            r2.<init>(r3)
            r3 = 0
            r4 = 0
        L10:
            byte[] r5 = r0.a
            r13.g(r5, r3, r1)
            r0.z(r3)
            int r5 = r0.i()
            int r6 = defpackage.pef.a
            r7 = 14
            r8 = 6
            if (r5 == r6) goto L75
            r13.i()
            r13.e(r4)
            r5 = r4
        L2a:
            r1 = 0
            r6 = 0
        L2c:
            byte[] r9 = r0.a
            r10 = 2
            r13.g(r9, r3, r10)
            r0.z(r3)
            int r9 = r0.k()
            r10 = 65526(0xfff6, float:9.1821E-41)
            r9 = r9 & r10
            r10 = 65520(0xfff0, float:9.1813E-41)
            if (r9 == r10) goto L52
            r13.i()
            int r5 = r5 + 1
            int r1 = r5 - r4
            r6 = 8192(0x2000, float:1.148E-41)
            if (r1 < r6) goto L4e
            return r3
        L4e:
            r13.e(r5)
            goto L2a
        L52:
            r9 = 1
            int r1 = r1 + r9
            r10 = 4
            if (r1 < r10) goto L5d
            r11 = 188(0xbc, float:2.63E-43)
            if (r6 > r11) goto L5c
            goto L5d
        L5c:
            return r9
        L5d:
            byte[] r9 = r0.a
            r13.g(r9, r3, r10)
            r2.d(r7)
            r9 = 13
            int r9 = r2.a(r9)
            if (r9 > r8) goto L6e
            return r3
        L6e:
            int r10 = r9 + (-6)
            r13.e(r10)
            int r6 = r6 + r9
            goto L2c
        L75:
            byte[] r5 = r0.a
            r6 = r5[r8]
            r6 = r6 & 127(0x7f, float:1.78E-43)
            int r6 = r6 << 21
            r8 = 7
            r9 = r5[r8]
            r9 = r9 & 127(0x7f, float:1.78E-43)
            int r7 = r9 << 14
            r6 = r6 | r7
            r7 = 8
            r7 = r5[r7]
            r7 = r7 & 127(0x7f, float:1.78E-43)
            int r7 = r7 << r8
            r6 = r6 | r7
            r7 = 9
            r5 = r5[r7]
            r5 = r5 & 127(0x7f, float:1.78E-43)
            r5 = r5 | r6
            int r6 = r5 + 10
            int r4 = r4 + r6
            r13.e(r5)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pef.e(pbw):boolean");
    }

    @Override // defpackage.pbz
    public final int f(pbw pbwVar, tfq tfqVar) {
        int a2 = pbwVar.a(this.b.a, 0, 200);
        if (a2 == -1) {
            return -1;
        }
        this.b.z(0);
        this.b.y(a2);
        if (!this.d) {
            this.c.a = 0L;
            this.d = true;
        }
        this.c.a(this.b);
        return 0;
    }
}
