package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pcy implements pcw {
    private final long[] a;
    private final long[] b;
    private final long c;

    public pcy(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
    }

    @Override // defpackage.pcw
    public final long a() {
        return this.c;
    }

    @Override // defpackage.pcm
    public final long b(long j) {
        return this.b[pgz.s(this.a, j, true)];
    }

    @Override // defpackage.pcm
    public final boolean c() {
        return true;
    }

    @Override // defpackage.pcw
    public final long d(long j) {
        return this.a[pgz.s(this.b, j, true)];
    }
}
