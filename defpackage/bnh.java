package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bnh implements biz {
    private final bng a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public bnh(bng bngVar, int i, long j, long j2) {
        this.a = bngVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / bngVar.d;
        this.d = j3;
        this.e = d(j3);
    }

    private final long d(long j) {
        return pts.s(j * this.b, 1000000L, this.a.c);
    }

    @Override // defpackage.biz
    public final long a() {
        return this.e;
    }

    @Override // defpackage.biz
    public final bix b(long j) {
        long m = pts.m((this.a.c * j) / (this.b * 1000000), 0L, this.d - 1);
        long j2 = this.c;
        int i = this.a.d;
        long d = d(m);
        bja bjaVar = new bja(d, j2 + (i * m));
        if (d >= j || m == this.d - 1) {
            return new bix(bjaVar, bjaVar);
        }
        long j3 = m + 1;
        return new bix(bjaVar, new bja(d(j3), this.c + (j3 * this.a.d)));
    }

    @Override // defpackage.biz
    public final boolean c() {
        return true;
    }
}
