package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pbv implements pcm {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;

    public pbv(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = iArr.length;
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
    }

    public final int a(long j) {
        return pgz.s(this.e, j, true);
    }

    @Override // defpackage.pcm
    public final long b(long j) {
        return this.c[a(j)];
    }

    @Override // defpackage.pcm
    public final boolean c() {
        return true;
    }
}
