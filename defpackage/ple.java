package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ple implements poe, pof {
    private pog b;
    private int c;
    private bcy d;
    private pms[] e;
    private long f;
    private boolean h;
    public final int r;
    public int s;
    public boolean t;
    private final pmt a = new pmt();
    private long g = Long.MIN_VALUE;

    public ple(int i) {
        this.r = i;
    }

    protected void B() {
    }

    public int F() {
        return 0;
    }

    protected void K(pms[] pmsVarArr, long j, long j2) {
    }

    @Override // defpackage.poe
    public /* synthetic */ void O(float f, float f2) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final pms[] aA() {
        return (pms[]) pse.c(this.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aB() {
        pse.c(this.b);
    }

    @Override // defpackage.poe
    public final int ad() {
        return this.s;
    }

    @Override // defpackage.poe, defpackage.pof
    public final int ae() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int af(pmt pmtVar, asw aswVar, int i) {
        bcy bcyVar = this.d;
        pse.c(bcyVar);
        int a = bcyVar.a(pmtVar, aswVar, i);
        if (a == -4) {
            if (aswVar.isEndOfStream()) {
                this.g = Long.MIN_VALUE;
                return this.t ? -4 : -3;
            }
            long j = aswVar.d + this.f;
            aswVar.d = j;
            this.g = Math.max(this.g, j);
        } else if (a == -5) {
            pms pmsVar = pmtVar.b;
            pse.c(pmsVar);
            if (pmsVar.r != Long.MAX_VALUE) {
                pmr b = pmsVar.b();
                b.o = pmsVar.r + this.f;
                pmtVar.b = b.a();
                return -5;
            }
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int ag(long j) {
        bcy bcyVar = this.d;
        pse.c(bcyVar);
        return bcyVar.b(j - this.f);
    }

    @Override // defpackage.poe
    public final long ah() {
        return this.g;
    }

    @Override // defpackage.poe
    public final bcy ai() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final plp aj(Throwable th, pms pmsVar, int i) {
        return ak(th, pmsVar, false, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.plp ak(java.lang.Throwable r14, defpackage.pms r15, boolean r16, int r17) {
        /*
            r13 = this;
            r1 = r13
            r0 = r15
            r2 = 4
            if (r0 == 0) goto L1e
            boolean r3 = r1.h
            if (r3 != 0) goto L1e
            r3 = 1
            r1.h = r3
            r3 = 0
            int r4 = r13.a(r15)     // Catch: java.lang.Throwable -> L18 defpackage.plp -> L1c
            int r4 = defpackage.muf.D(r4)     // Catch: java.lang.Throwable -> L18 defpackage.plp -> L1c
            r1.h = r3
            goto L1f
        L18:
            r0 = move-exception
            r1.h = r3
            throw r0
        L1c:
            r1.h = r3
        L1e:
            r4 = 4
        L1f:
            java.lang.String r7 = r13.d()
            int r8 = r1.c
            if (r0 != 0) goto L29
            r10 = 4
            goto L2a
        L29:
            r10 = r4
        L2a:
            plp r12 = new plp
            r3 = 1
            r5 = 0
            r2 = r12
            r4 = r14
            r6 = r17
            r9 = r15
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ple.ak(java.lang.Throwable, pms, boolean, int):plp");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final pmt al() {
        this.a.a();
        return this.a;
    }

    @Override // defpackage.poe
    public final pof am() {
        return this;
    }

    @Override // defpackage.poe
    public final void an() {
        pse.g(this.s == 1);
        this.a.a();
        this.s = 0;
        this.d = null;
        this.e = null;
        this.t = false;
        k();
    }

    @Override // defpackage.poe
    public final void ao(pog pogVar, pms[] pmsVarArr, bcy bcyVar, long j, boolean z, boolean z2, long j2, long j3) {
        pse.g(this.s == 0);
        this.b = pogVar;
        this.s = 1;
        l(z, z2);
        aq(pmsVarArr, bcyVar, j2, j3);
        m(j, z);
    }

    @Override // defpackage.poe
    public final void ap() {
        bcy bcyVar = this.d;
        pse.c(bcyVar);
        bcyVar.jK();
    }

    @Override // defpackage.poe
    public final void aq(pms[] pmsVarArr, bcy bcyVar, long j, long j2) {
        pse.g(!this.t);
        this.d = bcyVar;
        if (this.g == Long.MIN_VALUE) {
            this.g = j;
        }
        this.e = pmsVarArr;
        this.f = j2;
        K(pmsVarArr, j, j2);
    }

    @Override // defpackage.poe
    public final void ar() {
        pse.g(this.s == 0);
        this.a.a();
        B();
    }

    @Override // defpackage.poe
    public final void as(long j) {
        this.t = false;
        this.g = j;
        m(j, false);
    }

    @Override // defpackage.poe
    public final void at() {
        this.t = true;
    }

    @Override // defpackage.poe
    public final void au(int i) {
        this.c = i;
    }

    @Override // defpackage.poe
    public final void av() {
        pse.g(this.s == 1);
        this.s = 2;
        n();
    }

    @Override // defpackage.poe
    public final void aw() {
        pse.g(this.s == 2);
        this.s = 1;
        o();
    }

    @Override // defpackage.poe
    public final boolean ax() {
        return this.g == Long.MIN_VALUE;
    }

    @Override // defpackage.poe
    public final boolean ay() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean az() {
        if (ax()) {
            return this.t;
        }
        bcy bcyVar = this.d;
        pse.c(bcyVar);
        return bcyVar.d();
    }

    @Override // defpackage.poe
    public psx i() {
        return null;
    }

    protected void k() {
        throw null;
    }

    protected void l(boolean z, boolean z2) {
    }

    protected void m(long j, boolean z) {
        throw null;
    }

    protected void n() {
    }

    protected void o() {
    }

    @Override // defpackage.poc
    public void rk(int i, Object obj) {
    }
}
