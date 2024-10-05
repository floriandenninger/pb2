package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bne implements bnd {
    private final bik a;
    private final bjc b;
    private final bng c;
    private final pms d;
    private final int e;
    private long f;
    private int g;
    private long h;

    public bne(bik bikVar, bjc bjcVar, bng bngVar, String str, int i) {
        this.a = bikVar;
        this.b = bjcVar;
        this.c = bngVar;
        int i2 = (bngVar.b * bngVar.e) / 8;
        int i3 = bngVar.d;
        if (i3 != i2) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(i3);
            throw pnr.a(sb.toString(), null);
        }
        int i4 = bngVar.c * i2;
        int i5 = i4 * 8;
        int max = Math.max(i2, i4 / 10);
        this.e = max;
        pmr pmrVar = new pmr();
        pmrVar.k = str;
        pmrVar.f = i5;
        pmrVar.g = i5;
        pmrVar.l = max;
        pmrVar.x = bngVar.b;
        pmrVar.y = bngVar.c;
        pmrVar.z = i;
        this.d = pmrVar.a();
    }

    @Override // defpackage.bnd
    public final void a(int i, long j) {
        this.a.w(new bnh(this.c, 1, i, j));
        this.b.rp(this.d);
    }

    @Override // defpackage.bnd
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.bnd
    public final boolean c(bii biiVar, long j) {
        long j2;
        int i;
        int i2;
        long j3 = j;
        while (j3 > 0 && (i = this.g) < (i2 = this.e)) {
            int e = this.b.e(biiVar, (int) Math.min(i2 - i, j3), true);
            if (e == -1) {
                j3 = 0;
            } else {
                this.g += e;
                j3 -= e;
            }
        }
        int i3 = this.c.d;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j4 = this.f;
            long s = pts.s(this.h, 1000000L, r6.c);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.v(j4 + s, 1, i5, i6, null);
            this.h += i4;
            this.g = i6;
            j2 = 0;
        } else {
            j2 = 0;
        }
        return j3 <= j2;
    }
}
