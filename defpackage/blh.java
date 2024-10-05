package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class blh {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[PrivateKeyType.INVALID];
    private final pth g = new pth(PrivateKeyType.INVALID);

    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean b(bii biiVar, boolean z) {
        a();
        this.g.C(27);
        if (bfa.f(biiVar, this.g.a, 27, z) && this.g.p() == 1332176723) {
            if (this.g.i() != 0) {
                if (z) {
                    return false;
                }
                throw pnr.c("unsupported bit stream revision");
            }
            this.a = this.g.i();
            pth pthVar = this.g;
            byte[] bArr = pthVar.a;
            int i = pthVar.b;
            int i2 = i + 1;
            pthVar.b = i2;
            byte b = bArr[i];
            int i3 = i2 + 1;
            pthVar.b = i3;
            byte b2 = bArr[i2];
            int i4 = i3 + 1;
            pthVar.b = i4;
            byte b3 = bArr[i3];
            int i5 = i4 + 1;
            pthVar.b = i5;
            byte b4 = bArr[i4];
            int i6 = i5 + 1;
            pthVar.b = i6;
            byte b5 = bArr[i5];
            int i7 = i6 + 1;
            pthVar.b = i7;
            byte b6 = bArr[i6];
            int i8 = i7 + 1;
            pthVar.b = i8;
            byte b7 = bArr[i7];
            pthVar.b = i8 + 1;
            this.b = ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((b4 & 255) << 24) | ((b5 & 255) << 32) | ((b6 & 255) << 40) | ((b7 & 255) << 48) | ((bArr[i8] & 255) << 56);
            pthVar.n();
            this.g.n();
            this.g.n();
            int i9 = this.g.i();
            this.c = i9;
            this.d = i9 + 27;
            this.g.C(i9);
            if (bfa.f(biiVar, this.g.a, this.c, z)) {
                for (int i10 = 0; i10 < this.c; i10++) {
                    this.f[i10] = this.g.i();
                    this.e += this.f[i10];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c(bii biiVar) {
        return d(biiVar, -1L);
    }

    public final boolean d(bii biiVar, long j) {
        int b;
        bid bidVar = (bid) biiVar;
        pse.e(bidVar.c == biiVar.d());
        this.g.C(4);
        while (true) {
            if ((j == -1 || bidVar.c + 4 < j) && bfa.f(biiVar, this.g.a, 4, true)) {
                this.g.G(0);
                if (this.g.p() != 1332176723) {
                    biiVar.m(1);
                } else {
                    biiVar.l();
                    return true;
                }
            }
        }
        do {
            if (j != -1 && bidVar.c >= j) {
                break;
            }
            b = bidVar.b(1);
            if (b == 0) {
                b = bidVar.a(bidVar.a, 0, Math.min(1, 4096), 0, true);
            }
            bidVar.h(b);
        } while (b != -1);
        return false;
    }
}
