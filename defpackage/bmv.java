package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bmv {
    public boolean c;
    public boolean d;
    public boolean e;
    public final ptq a = new ptq(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final pth b = new pth();

    public bmv(byte[] bArr) {
    }

    public static long b(pth pthVar) {
        int i = pthVar.b;
        if (pthVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        pthVar.B(bArr, 0, 9);
        pthVar.G(i);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = bArr[0];
        byte b = bArr[1];
        long j2 = bArr[2];
        return ((bArr[3] & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((b & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((bArr[4] & 248) >> 3);
    }

    public static final int d(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void a(bii biiVar) {
        this.b.D(pts.f);
        this.c = true;
        biiVar.l();
    }

    public final void c(bii biiVar) {
        this.b.D(pts.f);
        this.c = true;
        biiVar.l();
    }

    public bmv() {
    }
}
