package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bnc implements bnd {
    private static final int[] a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final bik c;
    private final bjc d;
    private final bng e;
    private final int f;
    private final byte[] g;
    private final pth h;
    private final int i;
    private final pms j;
    private int k;
    private long l;
    private int m;
    private long n;

    public bnc(bik bikVar, bjc bjcVar, bng bngVar) {
        this.c = bikVar;
        this.d = bjcVar;
        this.e = bngVar;
        int max = Math.max(1, bngVar.c / 10);
        this.i = max;
        pth pthVar = new pth(bngVar.f);
        pthVar.g();
        int g = pthVar.g();
        this.f = g;
        int i = bngVar.b;
        int i2 = (((bngVar.d - (i * 4)) * 8) / (bngVar.e * i)) + 1;
        if (g != i2) {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(g);
            throw pnr.a(sb.toString(), null);
        }
        int b2 = pts.b(max, g);
        this.g = new byte[bngVar.d * b2];
        this.h = new pth(b2 * (g + g) * i);
        int i3 = ((bngVar.c * bngVar.d) * 8) / g;
        pmr pmrVar = new pmr();
        pmrVar.k = "audio/raw";
        pmrVar.f = i3;
        pmrVar.g = i3;
        pmrVar.l = (max + max) * i;
        pmrVar.x = bngVar.b;
        pmrVar.y = bngVar.c;
        pmrVar.z = 2;
        this.j = pmrVar.a();
    }

    private final int d(int i) {
        int i2 = this.e.b;
        return i / (i2 + i2);
    }

    private final int e(int i) {
        return (i + i) * this.e.b;
    }

    private final void f(int i) {
        long j = this.l;
        long s = pts.s(this.n, 1000000L, this.e.c);
        int e = e(i);
        this.d.v(j + s, 1, e, this.m - e, null);
        this.n += i;
        this.m -= e;
    }

    @Override // defpackage.bnd
    public final void a(int i, long j) {
        this.c.w(new bnh(this.e, this.f, i, j));
        this.d.rp(this.j);
    }

    @Override // defpackage.bnd
    public final void b(long j) {
        this.k = 0;
        this.l = j;
        this.m = 0;
        this.n = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003b -> B:3:0x001f). Please report as a decompilation issue!!! */
    @Override // defpackage.bnd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.bii r20, long r21) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnc.c(bii, long):boolean");
    }
}
