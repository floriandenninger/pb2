package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bkg implements bkf {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;

    public bkg(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.biz
    public final long a() {
        return this.c;
    }

    @Override // defpackage.biz
    public final bix b(long j) {
        int an = pts.an(this.a, j, true);
        bja bjaVar = new bja(this.a[an], this.b[an]);
        if (bjaVar.b < j) {
            long[] jArr = this.a;
            if (an != jArr.length - 1) {
                int i = an + 1;
                return new bix(bjaVar, new bja(jArr[i], this.b[i]));
            }
        }
        return new bix(bjaVar, bjaVar);
    }

    @Override // defpackage.biz
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bkf
    public final long e() {
        return this.d;
    }

    @Override // defpackage.bkf
    public final long f(long j) {
        return this.a[pts.an(this.b, j, true)];
    }
}
