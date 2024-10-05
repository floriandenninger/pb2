package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pdr {
    public final int a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;

    public pdr(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        opn.i(iArr.length == length);
        int length2 = jArr.length;
        opn.i(length2 == length);
        opn.i(iArr2.length == length);
        this.b = jArr;
        this.c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.a = length2;
    }
}
