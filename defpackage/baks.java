package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class baks extends bakp {
    private static final int[] G = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] H = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] I = new long[12];

    /* renamed from: J, reason: collision with root package name */
    private static final long[] f145J = new long[12];
    private static final long serialVersionUID = 538276888268L;

    static {
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (i < 11) {
            j += G[i] * 86400000;
            int i2 = i + 1;
            I[i2] = j;
            j2 += H[i] * 86400000;
            f145J[i2] = j2;
            i = i2;
        }
    }

    public baks(bajf bajfVar, int i) {
        super(bajfVar, i);
    }

    @Override // defpackage.bakp
    public final int S(int i, int i2) {
        return ai(i) ? H[i2 - 1] : G[i2 - 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.bakp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int U(long r13, int r15) {
        /*
            r12 = this;
            long r0 = r12.ae(r15)
            long r13 = r13 - r0
            r0 = 10
            long r13 = r13 >> r0
            int r14 = (int) r13
            boolean r13 = r12.ai(r15)
            r15 = 3
            r1 = 2
            r2 = 6
            r3 = 5
            r4 = 9
            r5 = 8
            r6 = 12
            r7 = 11
            r8 = 1
            r9 = 4
            r10 = 7
            r11 = 2615625(0x27e949, float:3.665271E-39)
            if (r13 == 0) goto L61
            r13 = 15356250(0xea515a, float:2.151869E-38)
            if (r14 >= r13) goto L42
            r13 = 7678125(0x7528ad, float:1.0759345E-38)
            if (r14 >= r13) goto L35
            if (r14 >= r11) goto L2e
            goto L6d
        L2e:
            r13 = 5062500(0x4d3f64, float:7.094073E-39)
            if (r14 < r13) goto L34
            goto L74
        L34:
            return r1
        L35:
            r13 = 10209375(0x9bc85f, float:1.4306382E-38)
            if (r14 >= r13) goto L3b
            goto L7c
        L3b:
            r13 = 12825000(0xc3b1a8, float:1.7971653E-38)
            if (r14 < r13) goto L41
            goto L83
        L41:
            return r3
        L42:
            r13 = 23118750(0x160c39e, float:4.128265E-38)
            if (r14 >= r13) goto L54
            r13 = 17971875(0x1123aa3, float:2.6858035E-38)
            if (r14 >= r13) goto L4d
            goto L90
        L4d:
            r13 = 20587500(0x13a23ec, float:3.4188577E-38)
            if (r14 < r13) goto L53
            goto L97
        L53:
            return r5
        L54:
            r13 = 25734375(0x188ace7, float:5.020661E-38)
            if (r14 >= r13) goto L5a
            goto La8
        L5a:
            r13 = 28265625(0x1af4c99, float:6.439476E-38)
            if (r14 < r13) goto L60
            goto La6
        L60:
            return r7
        L61:
            r13 = 15271875(0xe907c3, float:2.1400455E-38)
            if (r14 >= r13) goto L86
            r13 = 7593750(0x73df16, float:1.064111E-38)
            if (r14 >= r13) goto L77
            if (r14 >= r11) goto L6f
        L6d:
            r0 = 1
            goto La8
        L6f:
            r13 = 4978125(0x4bf5cd, float:6.975839E-39)
            if (r14 < r13) goto L76
        L74:
            r0 = 3
            goto La8
        L76:
            return r1
        L77:
            r13 = 10125000(0x9a7ec8, float:1.4188147E-38)
            if (r14 >= r13) goto L7e
        L7c:
            r0 = 4
            goto La8
        L7e:
            r13 = 12740625(0xc26811, float:1.7853418E-38)
            if (r14 < r13) goto L85
        L83:
            r0 = 6
            goto La8
        L85:
            return r3
        L86:
            r13 = 23034375(0x15f7a07, float:4.1046182E-38)
            if (r14 >= r13) goto L9b
            r13 = 17887500(0x110f10c, float:2.6621566E-38)
            if (r14 >= r13) goto L92
        L90:
            r0 = 7
            goto La8
        L92:
            r13 = 20503125(0x138da55, float:3.3952108E-38)
            if (r14 < r13) goto L9a
        L97:
            r0 = 9
            goto La8
        L9a:
            return r5
        L9b:
            r13 = 25650000(0x1876350, float:4.9733674E-38)
            if (r14 >= r13) goto La1
            goto La8
        La1:
            r13 = 28181250(0x1ae0302, float:6.392182E-38)
            if (r14 < r13) goto La9
        La6:
            r0 = 12
        La8:
            return r0
        La9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baks.U(long, int):int");
    }

    @Override // defpackage.bakp
    public final long ac(int i, int i2) {
        return ai(i) ? f145J[i2 - 1] : I[i2 - 1];
    }

    @Override // defpackage.bakp
    public final long ad(long j, long j2) {
        int Z = Z(j);
        int Z2 = Z(j2);
        long ae = j - ae(Z);
        long ae2 = j2 - ae(Z2);
        if (ae2 >= 5097600000L) {
            if (ai(Z2)) {
                if (!ai(Z)) {
                    ae2 -= 86400000;
                }
            } else if (ae >= 5097600000L && ai(Z)) {
                ae -= 86400000;
            }
        }
        int i = Z - Z2;
        if (ae < ae2) {
            i--;
        }
        return i;
    }

    @Override // defpackage.bakp
    public final long ah(long j, int i) {
        int Z = Z(j);
        int Q = Q(j, Z);
        int T = T(j);
        if (Q > 59) {
            if (ai(Z)) {
                if (!ai(i)) {
                    Q--;
                }
            } else if (ai(i)) {
                Q++;
            }
        }
        return af(i, 1, Q) + T;
    }
}
