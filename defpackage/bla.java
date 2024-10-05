package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bla {
    public final int a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;
    public final long g;
    public final pjq h;

    public bla(pjq pjqVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j, byte[] bArr) {
        int length = iArr.length;
        int length2 = jArr2.length;
        pse.e(length == length2);
        int length3 = jArr.length;
        pse.e(length3 == length2);
        int length4 = iArr2.length;
        pse.e(length4 == length2);
        this.h = pjqVar;
        this.b = jArr;
        this.c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.g = j;
        this.a = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int a(long j) {
        for (int an = pts.an(this.e, j, false); an >= 0; an--) {
            if ((this.f[an] & 1) != 0) {
                return an;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int ak = pts.ak(this.e, j, true); ak < this.e.length; ak++) {
            if ((this.f[ak] & 1) != 0) {
                return ak;
            }
        }
        return -1;
    }
}
