package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bct {
    public final int a;
    public final pth b;
    public bcs c;
    public bcs d;
    public bcs e;
    public long f;
    public final bfg g;

    public bct(bfg bfgVar) {
        this.g = bfgVar;
        int i = bfgVar.a;
        this.a = i;
        this.b = new pth(32);
        bcs bcsVar = new bcs(0L, i);
        this.c = bcsVar;
        this.d = bcsVar;
        this.e = bcsVar;
    }

    public static bcs b(bcs bcsVar, asw aswVar, bcu bcuVar, pth pthVar) {
        if (aswVar.d()) {
            long j = bcuVar.b;
            int i = 1;
            pthVar.C(1);
            bcs h = h(bcsVar, j, pthVar.a, 1);
            long j2 = j + 1;
            byte b = pthVar.a[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            ass assVar = aswVar.a;
            byte[] bArr = assVar.a;
            if (bArr == null) {
                assVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            bcsVar = h(h, j2, assVar.a, i3);
            long j3 = j2 + i3;
            if (i2 != 0) {
                pthVar.C(2);
                bcsVar = h(bcsVar, j3, pthVar.a, 2);
                j3 += 2;
                i = pthVar.m();
            }
            int[] iArr = assVar.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = assVar.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (i2 != 0) {
                int i4 = i * 6;
                pthVar.C(i4);
                bcsVar = h(bcsVar, j3, pthVar.a, i4);
                j3 += i4;
                pthVar.G(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr[i5] = pthVar.m();
                    iArr2[i5] = pthVar.l();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bcuVar.a - ((int) (j3 - bcuVar.b));
            }
            bjb bjbVar = bcuVar.c;
            int i6 = pts.a;
            byte[] bArr2 = bjbVar.b;
            byte[] bArr3 = assVar.a;
            int i7 = bjbVar.a;
            int i8 = bjbVar.c;
            int i9 = bjbVar.d;
            assVar.f = i;
            assVar.d = iArr;
            assVar.e = iArr2;
            assVar.b = bArr2;
            assVar.c = i7;
            assVar.g = i8;
            assVar.h = i9;
            assVar.i.numSubSamples = i;
            assVar.i.numBytesOfClearData = iArr;
            assVar.i.numBytesOfEncryptedData = iArr2;
            assVar.i.key = bArr2;
            assVar.i.iv = bArr3;
            assVar.i.mode = i7;
            if (pts.a >= 24) {
                asr asrVar = assVar.j;
                pse.c(asrVar);
                asrVar.b.set(i8, i9);
                asrVar.a.setPattern(asrVar.b);
            }
            long j4 = bcuVar.b;
            int i10 = (int) (j3 - j4);
            bcuVar.b = j4 + i10;
            bcuVar.a -= i10;
        }
        if (aswVar.hasSupplementalData()) {
            pthVar.C(4);
            bcs h2 = h(bcsVar, bcuVar.b, pthVar.a, 4);
            int l = pthVar.l();
            bcuVar.b += 4;
            bcuVar.a -= 4;
            aswVar.b(l);
            bcs g = g(h2, bcuVar.b, aswVar.b, l);
            bcuVar.b += l;
            int i11 = bcuVar.a - l;
            bcuVar.a = i11;
            ByteBuffer byteBuffer = aswVar.e;
            if (byteBuffer == null || byteBuffer.capacity() < i11) {
                aswVar.e = ByteBuffer.allocate(i11);
            }
            return g(g, bcuVar.b, aswVar.e, bcuVar.a);
        }
        aswVar.b(bcuVar.a);
        return g(bcsVar, bcuVar.b, aswVar.b, bcuVar.a);
    }

    private static bcs f(bcs bcsVar, long j) {
        while (j >= bcsVar.b) {
            bcsVar = bcsVar.d;
        }
        return bcsVar;
    }

    private static bcs g(bcs bcsVar, long j, ByteBuffer byteBuffer, int i) {
        bcs f = f(bcsVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (f.b - j));
            byteBuffer.put(f.e.b, f.a(j), min);
            i -= min;
            j += min;
            if (j == f.b) {
                f = f.d;
            }
        }
        return f;
    }

    private static bcs h(bcs bcsVar, long j, byte[] bArr, int i) {
        bcs f = f(bcsVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (f.b - j));
            System.arraycopy(f.e.b, f.a(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == f.b) {
                f = f.d;
            }
        }
        return f;
    }

    public final int a(int i) {
        bcs bcsVar = this.e;
        if (!bcsVar.c) {
            pdp e = this.g.e();
            bcs bcsVar2 = new bcs(this.e.b, this.a);
            bcsVar.e = e;
            bcsVar.d = bcsVar2;
            bcsVar.c = true;
        }
        return Math.min(i, (int) (this.e.b - this.f));
    }

    public final void c(bcs bcsVar) {
        if (bcsVar.c) {
            bcs bcsVar2 = this.e;
            boolean z = bcsVar2.c;
            int i = (z ? 1 : 0) + (((int) (bcsVar2.a - bcsVar.a)) / this.a);
            pdp[] pdpVarArr = new pdp[i];
            for (int i2 = 0; i2 < i; i2++) {
                pdpVarArr[i2] = bcsVar.e;
                bcsVar = bcsVar.b();
            }
            this.g.g(pdpVarArr);
        }
    }

    public final void d(long j) {
        bcs bcsVar;
        if (j != -1) {
            while (true) {
                bcsVar = this.c;
                if (j < bcsVar.b) {
                    break;
                }
                this.g.f(bcsVar.e);
                this.c = this.c.b();
            }
            if (this.d.a < bcsVar.a) {
                this.d = bcsVar;
            }
        }
    }

    public final void e(int i) {
        long j = this.f + i;
        this.f = j;
        bcs bcsVar = this.e;
        if (j == bcsVar.b) {
            this.e = bcsVar.d;
        }
    }
}
