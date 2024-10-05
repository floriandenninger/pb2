package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjg implements bih {
    private static final int[] b;
    private static final int e;
    private final byte[] f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private long n;
    private bik o;
    private bjc p;
    private biz q;
    private boolean r;
    private static final int[] a = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] c = pts.Z("#!AMR\n");
    private static final byte[] d = pts.Z("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        b = iArr;
        e = iArr[8];
    }

    public bjg() {
        this(null);
    }

    public bjg(byte[] bArr) {
        this.f = new byte[1];
        this.l = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036 A[Catch: EOFException -> 0x0095, TryCatch #0 {EOFException -> 0x0095, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x0036, B:24:0x003f, B:30:0x003b, B:40:0x0059, B:41:0x007c, B:42:0x007d, B:43:0x0094), top: B:12:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[Catch: EOFException -> 0x0095, TryCatch #0 {EOFException -> 0x0095, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x0036, B:24:0x003f, B:30:0x003b, B:40:0x0059, B:41:0x007c, B:42:0x007d, B:43:0x0094), top: B:12:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a(defpackage.bii r10) {
        /*
            r9 = this;
            int r0 = r9.j
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != 0) goto L96
            r10.l()     // Catch: java.io.EOFException -> L95
            byte[] r0 = r9.f     // Catch: java.io.EOFException -> L95
            r10.j(r0, r1, r3)     // Catch: java.io.EOFException -> L95
            byte[] r0 = r9.f     // Catch: java.io.EOFException -> L95
            r0 = r0[r1]     // Catch: java.io.EOFException -> L95
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L7d
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r9.g     // Catch: java.io.EOFException -> L95
            if (r4 == 0) goto L29
            r6 = 10
            if (r0 < r6) goto L34
            r6 = 13
            if (r0 <= r6) goto L29
            goto L34
        L29:
            if (r4 != 0) goto L52
            r6 = 12
            if (r0 < r6) goto L34
            r6 = 14
            if (r0 > r6) goto L34
            goto L52
        L34:
            if (r4 == 0) goto L3b
            int[] r4 = defpackage.bjg.b     // Catch: java.io.EOFException -> L95
            r0 = r4[r0]     // Catch: java.io.EOFException -> L95
            goto L3f
        L3b:
            int[] r4 = defpackage.bjg.a     // Catch: java.io.EOFException -> L95
            r0 = r4[r0]     // Catch: java.io.EOFException -> L95
        L3f:
            r9.i = r0     // Catch: java.io.EOFException -> L95
            r9.j = r0
            int r4 = r9.l
            if (r4 != r2) goto L4a
            r9.l = r0
            r4 = r0
        L4a:
            if (r4 != r0) goto L96
            int r4 = r9.m
            int r4 = r4 + r3
            r9.m = r4
            goto L96
        L52:
            java.lang.String r10 = "WB"
            java.lang.String r1 = "NB"
            if (r3 == r4) goto L59
            r10 = r1
        L59:
            int r1 = r10.length()     // Catch: java.io.EOFException -> L95
            int r1 = r1 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L95
            r3.<init>(r1)     // Catch: java.io.EOFException -> L95
            java.lang.String r1 = "Illegal AMR "
            r3.append(r1)     // Catch: java.io.EOFException -> L95
            r3.append(r10)     // Catch: java.io.EOFException -> L95
            java.lang.String r10 = " frame type "
            r3.append(r10)     // Catch: java.io.EOFException -> L95
            r3.append(r0)     // Catch: java.io.EOFException -> L95
            java.lang.String r10 = r3.toString()     // Catch: java.io.EOFException -> L95
            pnr r10 = defpackage.pnr.a(r10, r5)     // Catch: java.io.EOFException -> L95
            throw r10     // Catch: java.io.EOFException -> L95
        L7d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L95
            r1 = 42
            r10.<init>(r1)     // Catch: java.io.EOFException -> L95
            java.lang.String r1 = "Invalid padding bits for frame header "
            r10.append(r1)     // Catch: java.io.EOFException -> L95
            r10.append(r0)     // Catch: java.io.EOFException -> L95
            java.lang.String r10 = r10.toString()     // Catch: java.io.EOFException -> L95
            pnr r10 = defpackage.pnr.a(r10, r5)     // Catch: java.io.EOFException -> L95
            throw r10     // Catch: java.io.EOFException -> L95
        L95:
            return r2
        L96:
            bjc r4 = r9.p
            int r10 = r4.e(r10, r0, r3)
            if (r10 != r2) goto L9f
            return r2
        L9f:
            int r0 = r9.j
            int r0 = r0 - r10
            r9.j = r0
            if (r0 <= 0) goto La7
            return r1
        La7:
            bjc r2 = r9.p
            long r3 = r9.h
            r5 = 1
            int r6 = r9.i
            r7 = 0
            r8 = 0
            r2.v(r3, r5, r6, r7, r8)
            long r2 = r9.h
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r2 = r2 + r4
            r9.h = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjg.a(bii):int");
    }

    private static boolean b(bii biiVar, byte[] bArr) {
        biiVar.l();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        biiVar.j(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean c(bii biiVar) {
        byte[] bArr = c;
        if (b(biiVar, bArr)) {
            this.g = false;
            biiVar.m(bArr.length);
            return true;
        }
        byte[] bArr2 = d;
        if (!b(biiVar, bArr2)) {
            return false;
        }
        this.g = true;
        biiVar.m(bArr2.length);
        return true;
    }

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        this.o = bikVar;
        this.p = bikVar.n(0, 1);
        bikVar.q();
    }

    @Override // defpackage.bih
    public final void e() {
    }

    @Override // defpackage.bih
    public final void f(long j, long j2) {
        this.h = 0L;
        this.i = 0;
        this.j = 0;
        this.n = 0L;
    }

    @Override // defpackage.bih
    public final boolean g(bii biiVar) {
        return c(biiVar);
    }

    @Override // defpackage.bih
    public final int h(bii biiVar, tfq tfqVar) {
        pse.d(this.p);
        int i = pts.a;
        if (((bid) biiVar).c != 0 || c(biiVar)) {
            if (!this.r) {
                this.r = true;
                boolean z = this.g;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? 8000 : 16000;
                bjc bjcVar = this.p;
                pmr pmrVar = new pmr();
                pmrVar.k = str;
                pmrVar.l = e;
                pmrVar.x = 1;
                pmrVar.y = i2;
                bjcVar.rp(pmrVar.a());
            }
            int a2 = a(biiVar);
            if (this.k) {
                return a2;
            }
            biy biyVar = new biy(-9223372036854775807L);
            this.q = biyVar;
            this.o.w(biyVar);
            this.k = true;
            return a2;
        }
        throw pnr.a("Could not find AMR header.", null);
    }
}
