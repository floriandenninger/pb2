package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pci {
    public int d;
    public int e;
    public int f;
    public int g;
    public int a = 1000;
    public long[] b = new long[1000];
    private long[] i = new long[1000];
    private int[] h = new int[1000];
    public int[] c = new int[1000];
    private byte[][] j = new byte[1000];

    public final int a() {
        return this.e + this.d;
    }

    public final synchronized long b() {
        int i;
        int i2;
        int i3;
        i = this.d - 1;
        this.d = i;
        i2 = this.f;
        i3 = i2 + 1;
        this.f = i3;
        this.e++;
        if (i3 == this.a) {
            this.f = 0;
            i3 = 0;
        }
        return i > 0 ? this.b[i3] : this.c[i2] + this.b[i2];
    }

    public final synchronized long c(long j) {
        if (this.d != 0) {
            long[] jArr = this.i;
            int i = this.f;
            if (j >= jArr[i]) {
                int i2 = this.g;
                if (i2 == 0) {
                    i2 = this.a;
                }
                if (j > jArr[i2 - 1]) {
                    return -1L;
                }
                int i3 = 0;
                int i4 = -1;
                while (i != this.g && this.i[i] <= j) {
                    if (1 == (this.h[i] & 1)) {
                        i4 = i3;
                    }
                    i = (i + 1) % this.a;
                    i3++;
                }
                if (i4 == -1) {
                    return -1L;
                }
                this.d -= i4;
                int i5 = (this.f + i4) % this.a;
                this.f = i5;
                this.e += i4;
                return this.b[i5];
            }
        }
        return -1L;
    }

    public final synchronized void d(long j, int i, long j2, int i2, byte[] bArr) {
        long[] jArr = this.i;
        int i3 = this.g;
        jArr[i3] = j;
        long[] jArr2 = this.b;
        jArr2[i3] = j2;
        this.c[i3] = i2;
        this.h[i3] = i;
        this.j[i3] = bArr;
        int i4 = this.d + 1;
        this.d = i4;
        int i5 = this.a;
        if (i4 != i5) {
            int i6 = i3 + 1;
            this.g = i6;
            if (i6 == i5) {
                this.g = 0;
                return;
            }
            return;
        }
        int i7 = i5 + 1000;
        long[] jArr3 = new long[i7];
        long[] jArr4 = new long[i7];
        int[] iArr = new int[i7];
        int[] iArr2 = new int[i7];
        byte[][] bArr2 = new byte[i7];
        int i8 = this.f;
        int i9 = i5 - i8;
        System.arraycopy(jArr2, i8, jArr3, 0, i9);
        System.arraycopy(this.i, this.f, jArr4, 0, i9);
        System.arraycopy(this.h, this.f, iArr, 0, i9);
        System.arraycopy(this.c, this.f, iArr2, 0, i9);
        System.arraycopy(this.j, this.f, bArr2, 0, i9);
        int i10 = this.f;
        System.arraycopy(this.b, 0, jArr3, i9, i10);
        System.arraycopy(this.i, 0, jArr4, i9, i10);
        System.arraycopy(this.h, 0, iArr, i9, i10);
        System.arraycopy(this.c, 0, iArr2, i9, i10);
        System.arraycopy(this.j, 0, bArr2, i9, i10);
        this.b = jArr3;
        this.i = jArr4;
        this.h = iArr;
        this.c = iArr2;
        this.j = bArr2;
        this.f = 0;
        int i11 = this.a;
        this.g = i11;
        this.d = i11;
        this.a = i7;
    }

    public final synchronized boolean e(oyp oypVar, pcj pcjVar) {
        if (this.d == 0) {
            return false;
        }
        long[] jArr = this.i;
        int i = this.f;
        oypVar.e = jArr[i];
        oypVar.c = this.c[i];
        oypVar.d = this.h[i];
        pcjVar.a = this.b[i];
        pcjVar.b = this.j[i];
        return true;
    }
}
