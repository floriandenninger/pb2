package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bld implements bli {
    private final bip b;
    private final bio c;
    public long a = -1;
    private long d = -1;

    public bld(bip bipVar, bio bioVar) {
        this.b = bipVar;
        this.c = bioVar;
    }

    @Override // defpackage.bli
    public final long a(bii biiVar) {
        long j = this.d;
        if (j < 0) {
            return -1L;
        }
        this.d = -1L;
        return -(j + 2);
    }

    @Override // defpackage.bli
    public final biz b() {
        pse.g(this.a != -1);
        return new bin(this.b, this.a);
    }

    @Override // defpackage.bli
    public final void c(long j) {
        long[] jArr = this.c.a;
        this.d = jArr[pts.an(jArr, j, true)];
    }
}
