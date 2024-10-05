package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class banm extends bajn {
    private static final long serialVersionUID = 6941492635554961361L;
    final int e;
    final banp f;
    final banp g;

    public banm(String str, int i, banp banpVar, banp banpVar2) {
        super(str);
        this.e = i;
        this.f = banpVar;
        this.g = banpVar2;
    }

    private final banp o(long j) {
        long j2;
        int i = this.e;
        banp banpVar = this.f;
        banp banpVar2 = this.g;
        try {
            j2 = banpVar.a(j, i, banpVar2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
            j2 = j;
        }
        try {
            j = banpVar2.a(j, i, banpVar.c);
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return j2 > j ? banpVar : banpVar2;
    }

    @Override // defpackage.bajn
    public final int a(long j) {
        return this.e + o(j).c;
    }

    @Override // defpackage.bajn
    public final int c(long j) {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r5 < 0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[RETURN] */
    @Override // defpackage.bajn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(long r9) {
        /*
            r8 = this;
            int r0 = r8.e
            banp r1 = r8.f
            banp r2 = r8.g
            r3 = 0
            int r5 = r2.c     // Catch: java.lang.Throwable -> L16
            long r5 = r1.a(r9, r0, r5)     // Catch: java.lang.Throwable -> L16
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 <= 0) goto L17
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L17
        L16:
            r5 = r9
        L17:
            int r1 = r1.c     // Catch: java.lang.Throwable -> L28
            long r0 = r2.a(r9, r0, r1)     // Catch: java.lang.Throwable -> L28
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto L26
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L26
            goto L29
        L26:
            r9 = r0
            goto L29
        L28:
        L29:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L2e
            return r9
        L2e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.banm.e(long):long");
    }

    @Override // defpackage.bajn
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof banm) {
            banm banmVar = (banm) obj;
            if (this.c.equals(banmVar.c) && this.e == banmVar.e && this.f.equals(banmVar.f) && this.g.equals(banmVar.g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r5 > 0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @Override // defpackage.bajn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(long r9) {
        /*
            r8 = this;
            r0 = 1
            long r9 = r9 + r0
            int r0 = r8.e
            banp r1 = r8.f
            banp r2 = r8.g
            r3 = 0
            int r5 = r2.c     // Catch: java.lang.Throwable -> L19
            long r5 = r1.b(r9, r0, r5)     // Catch: java.lang.Throwable -> L19
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 >= 0) goto L1a
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L1a
        L19:
            r5 = r9
        L1a:
            int r1 = r1.c     // Catch: java.lang.Throwable -> L2b
            long r0 = r2.b(r9, r0, r1)     // Catch: java.lang.Throwable -> L2b
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 >= 0) goto L29
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L29
            goto L2c
        L29:
            r9 = r0
            goto L2c
        L2b:
        L2c:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L31
            goto L32
        L31:
            r5 = r9
        L32:
            r9 = -1
            long r5 = r5 + r9
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.banm.f(long):long");
    }

    @Override // defpackage.bajn
    public final String g(long j) {
        return o(j).b;
    }

    @Override // defpackage.bajn
    public final boolean l() {
        return false;
    }
}
