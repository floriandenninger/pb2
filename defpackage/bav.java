package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bav implements bbp, bbo {
    public final bbp a;
    long b;
    long c;
    private bbo d;
    private bau[] e = new bau[0];
    private long f;

    public bav(bbp bbpVar, boolean z, long j, long j2) {
        this.a = bbpVar;
        this.f = true != z ? -9223372036854775807L : j;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.bbp
    public final long a(long j, poi poiVar) {
        long j2 = this.b;
        if (j == j2) {
            return j2;
        }
        long m = pts.m(poiVar.d, 0L, j - j2);
        long j3 = poiVar.e;
        long j4 = this.c;
        long m2 = pts.m(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (m != poiVar.d || m2 != poiVar.e) {
            poiVar = new poi(m, m2);
        }
        return this.a.a(j, poiVar);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long c() {
        long c = this.a.c();
        if (c != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || c < j) {
                return c;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.bbp
    public final long d() {
        if (q()) {
            long j = this.f;
            this.f = -9223372036854775807L;
            long d = d();
            return d != -9223372036854775807L ? d : j;
        }
        long d2 = this.a.d();
        if (d2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        pse.g(d2 >= this.b);
        long j2 = this.c;
        pse.g(j2 == Long.MIN_VALUE || d2 <= j2);
        return d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r8) goto L17;
     */
    @Override // defpackage.bbp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f = r0
            bau[] r0 = r7.e
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            bbp r0 = r7.a
            long r0 = r0.e(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L34
            long r8 = r7.b
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L35
            long r8 = r7.c
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L34
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L35
        L34:
            r2 = 1
        L35:
            defpackage.pse.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bav.e(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        if (r1 > r4) goto L32;
     */
    @Override // defpackage.bbp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(defpackage.bel[] r16, boolean[] r17, defpackage.bcy[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            bau[] r2 = new defpackage.bau[r1]
            r0.e = r2
            bcy[] r10 = new defpackage.bcy[r1]
            r11 = 0
            r1 = 0
        Le:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L23
            bau[] r2 = r0.e
            r3 = r9[r1]
            bau r3 = (defpackage.bau) r3
            r2[r1] = r3
            if (r3 == 0) goto L1e
            bcy r12 = r3.a
        L1e:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Le
        L23:
            bbp r1 = r0.a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.f(r2, r3, r4, r5, r6)
            boolean r3 = r15.q()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L64
            long r6 = r0.b
            int r3 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r3 != 0) goto L64
            r13 = 0
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 == 0) goto L64
            int r3 = r8.length
            r6 = 0
        L4b:
            if (r6 >= r3) goto L64
            r7 = r8[r6]
            if (r7 == 0) goto L61
            pms r7 = r7.p()
            java.lang.String r13 = r7.n
            java.lang.String r7 = r7.k
            boolean r7 = defpackage.psz.i(r13, r7)
            if (r7 != 0) goto L61
            r4 = r1
            goto L64
        L61:
            int r6 = r6 + 1
            goto L4b
        L64:
            r0.f = r4
            r3 = 1
            int r4 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r4 == 0) goto L7f
            long r4 = r0.b
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 < 0) goto L7e
            long r4 = r0.c
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L7f
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 > 0) goto L7e
            goto L7f
        L7e:
            r3 = 0
        L7f:
            defpackage.pse.g(r3)
        L82:
            int r3 = r9.length
            if (r11 >= r3) goto La8
            r3 = r10[r11]
            if (r3 != 0) goto L8e
            bau[] r3 = r0.e
            r3[r11] = r12
            goto L9f
        L8e:
            bau[] r4 = r0.e
            r5 = r4[r11]
            if (r5 == 0) goto L98
            bcy r5 = r5.a
            if (r5 == r3) goto L9f
        L98:
            bau r5 = new bau
            r5.<init>(r15, r3)
            r4[r11] = r5
        L9f:
            bau[] r3 = r0.e
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L82
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bav.f(bel[], boolean[], bcy[], boolean[], long):long");
    }

    @Override // defpackage.bbp
    public final asj g() {
        return this.a.g();
    }

    @Override // defpackage.bbp
    public final void h(long j, boolean z) {
        this.a.h(j, z);
    }

    @Override // defpackage.bbp
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.bcz
    public final /* bridge */ /* synthetic */ void j(bda bdaVar) {
        bbo bboVar = this.d;
        pse.c(bboVar);
        bboVar.j(this);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long jJ() {
        long jJ = this.a.jJ();
        if (jJ != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || jJ < j) {
                return jJ;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.bbo
    public final void k(bbp bbpVar) {
        bbo bboVar = this.d;
        pse.c(bboVar);
        bboVar.k(this);
    }

    @Override // defpackage.bbp
    public final void l(bbo bboVar, long j) {
        this.d = bboVar;
        this.a.l(this, j);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final void m(long j) {
        this.a.m(j);
    }

    public final void n(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean o(long j) {
        return this.a.o(j);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean p() {
        return this.a.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q() {
        return this.f != -9223372036854775807L;
    }
}
