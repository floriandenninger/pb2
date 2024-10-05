package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class biu implements biz {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final boolean d;

    public biu(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        pse.e(length == length2);
        boolean z = length2 > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.c = j;
    }

    @Override // defpackage.biz
    public final long a() {
        return this.c;
    }

    @Override // defpackage.biz
    public final bix b(long j) {
        if (!this.d) {
            bja bjaVar = bja.a;
            return new bix(bjaVar, bjaVar);
        }
        int an = pts.an(this.b, j, true);
        bja bjaVar2 = new bja(this.b[an], this.a[an]);
        if (bjaVar2.b != j) {
            long[] jArr = this.b;
            if (an != jArr.length - 1) {
                int i = an + 1;
                return new bix(bjaVar2, new bja(jArr[i], this.a[i]));
            }
        }
        return new bix(bjaVar2, bjaVar2);
    }

    @Override // defpackage.biz
    public final boolean c() {
        return this.d;
    }
}
