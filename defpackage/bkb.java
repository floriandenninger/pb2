package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bkb {
    private static final long[] b = {128, 64, 32, 16, 8, 4, 2, 1};
    public int a;
    private final byte[] c = new byte[8];
    private int d;

    public static int a(int i) {
        int i2 = 0;
        while (i2 < 8) {
            long j = b[i2] & i;
            i2++;
            if (j != 0) {
                return i2;
            }
        }
        return -1;
    }

    public static long b(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= b[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final long c(bii biiVar, boolean z, boolean z2, int i) {
        if (this.d == 0) {
            if (!biiVar.p(this.c, 0, 1, z)) {
                return -1L;
            }
            int a = a(this.c[0] & 255);
            this.a = a;
            if (a != -1) {
                this.d = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.a;
        if (i2 > i) {
            this.d = 0;
            return -2L;
        }
        if (i2 != 1) {
            biiVar.k(this.c, 1, i2 - 1);
        }
        this.d = 0;
        return b(this.c, this.a, z2);
    }

    public final void d() {
        this.d = 0;
        this.a = 0;
    }
}
