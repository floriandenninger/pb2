package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjj implements bih {
    private final byte[] a;
    private final pth b;
    private bik c;
    private bjc d;
    private int e;
    private Metadata f;
    private bip g;
    private int h;
    private int i;
    private int j;
    private long k;
    private bia l;
    private final tfq m;

    public bjj() {
        this(null);
    }

    private final long a(pth pthVar, boolean z) {
        boolean z2;
        pse.c(this.g);
        int i = pthVar.b;
        while (i <= pthVar.c - 16) {
            pthVar.G(i);
            if (bfn.d(pthVar, this.g, this.i, this.m)) {
                pthVar.G(i);
                return this.m.a;
            }
            i++;
        }
        if (!z) {
            pthVar.G(i);
            return -1L;
        }
        while (true) {
            int i2 = pthVar.c;
            if (i <= i2 - this.h) {
                pthVar.G(i);
                try {
                    z2 = bfn.d(pthVar, this.g, this.i, this.m);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (pthVar.b <= pthVar.c && z2) {
                    pthVar.G(i);
                    return this.m.a;
                }
                i++;
            } else {
                pthVar.G(i2);
                return -1L;
            }
        }
    }

    private final void b() {
        long j = this.k;
        bip bipVar = this.g;
        int i = pts.a;
        this.d.v((j * 1000000) / bipVar.e, 1, this.j, 0, null);
    }

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        this.c = bikVar;
        this.d = bikVar.n(0, 1);
        bikVar.q();
    }

    @Override // defpackage.bih
    public final void e() {
    }

    @Override // defpackage.bih
    public final boolean g(bii biiVar) {
        bgy.c(biiVar, false);
        pth pthVar = new pth(4);
        biiVar.j(pthVar.a, 0, 4);
        return pthVar.p() == 1716281667;
    }

    public bjj(byte[] bArr) {
        this.a = new byte[42];
        this.b = new pth(new byte[32768], 0);
        this.m = new tfq(null, null, null);
        this.e = 0;
    }

    @Override // defpackage.bih
    public final void f(long j, long j2) {
        if (j == 0) {
            this.e = 0;
        } else {
            bia biaVar = this.l;
            if (biaVar != null) {
                biaVar.a(j2);
            }
        }
        this.k = j2 != 0 ? -1L : 0L;
        this.j = 0;
        this.b.C(0);
    }

    @Override // defpackage.bih
    public final int h(bii biiVar, tfq tfqVar) {
        biz biyVar;
        long j;
        long j2;
        long j3;
        boolean z;
        int i = this.e;
        if (i == 0) {
            biiVar.l();
            long d = biiVar.d();
            Metadata c = bgy.c(biiVar, true);
            biiVar.m((int) (biiVar.d() - d));
            this.f = c;
            this.e = 1;
            return 0;
        }
        if (i == 1) {
            biiVar.j(this.a, 0, 42);
            biiVar.l();
            this.e = 2;
            return 0;
        }
        int i2 = 3;
        int i3 = 4;
        if (i == 2) {
            pth pthVar = new pth(4);
            biiVar.k(pthVar.a, 0, 4);
            if (pthVar.p() != 1716281667) {
                throw pnr.a("Failed to read FLAC stream marker.", null);
            }
            this.e = 3;
            return 0;
        }
        if (i != 3) {
            if (i == 4) {
                biiVar.l();
                pth pthVar2 = new pth(2);
                biiVar.j(pthVar2.a, 0, 2);
                int m = pthVar2.m();
                if ((m >> 2) != 16382) {
                    biiVar.l();
                    throw pnr.a("First frame does not start with sync code.", null);
                }
                biiVar.l();
                this.i = m;
                bik bikVar = this.c;
                int i4 = pts.a;
                bid bidVar = (bid) biiVar;
                long j4 = bidVar.c;
                long j5 = bidVar.b;
                pse.c(this.g);
                final bip bipVar = this.g;
                if (bipVar.k != null) {
                    biyVar = new bin(bipVar, j4);
                } else if (j5 == -1 || bipVar.j <= 0) {
                    biyVar = new biy(bipVar.a());
                } else {
                    int i5 = this.i;
                    bipVar.getClass();
                    bhx bhxVar = new bhx() { // from class: bjh
                        @Override // defpackage.bhx
                        public final long a(long j6) {
                            return bip.this.b(j6);
                        }
                    };
                    bji bjiVar = new bji(bipVar, i5);
                    long a = bipVar.a();
                    long j6 = bipVar.j;
                    int i6 = bipVar.d;
                    if (i6 > 0) {
                        j = j4;
                        j2 = j6;
                        j3 = ((i6 + bipVar.c) / 2) + 1;
                    } else {
                        j = j4;
                        j2 = j6;
                        int i7 = bipVar.a;
                        long j7 = 4096;
                        if (i7 == bipVar.b && i7 > 0) {
                            j7 = i7;
                        }
                        j3 = (((j7 * bipVar.g) * bipVar.h) / 8) + 64;
                    }
                    bia biaVar = new bia(bhxVar, bjiVar, a, j2, j, j5, j3, Math.max(6, bipVar.c));
                    this.l = biaVar;
                    biyVar = biaVar.a;
                }
                bikVar.w(biyVar);
                this.e = 5;
                return 0;
            }
            pse.c(this.d);
            pse.c(this.g);
            bia biaVar2 = this.l;
            if (biaVar2 != null && biaVar2.b()) {
                return this.l.f(biiVar, tfqVar);
            }
            if (this.k == -1) {
                bip bipVar2 = this.g;
                biiVar.l();
                biiVar.f(1);
                byte[] bArr = new byte[1];
                biiVar.j(bArr, 0, 1);
                int i8 = bArr[0] & 1;
                biiVar.f(2);
                r9 = 1 != i8 ? 6 : 7;
                pth pthVar3 = new pth(r9);
                pthVar3.F(bfa.b(biiVar, pthVar3.a, 0, r9));
                biiVar.l();
                tfq tfqVar2 = new tfq(null, null, null);
                if (!bfn.c(pthVar3, bipVar2, 1 == i8, tfqVar2)) {
                    throw pnr.a(null, null);
                }
                this.k = tfqVar2.a;
                return 0;
            }
            pth pthVar4 = this.b;
            int i9 = pthVar4.c;
            if (i9 < 32768) {
                int g = biiVar.g(pthVar4.a, i9, 32768 - i9);
                z = g == -1;
                if (!z) {
                    this.b.F(i9 + g);
                } else if (this.b.a() == 0) {
                    b();
                    return -1;
                }
            } else {
                z = false;
            }
            pth pthVar5 = this.b;
            int i10 = pthVar5.b;
            int i11 = this.j;
            int i12 = this.h;
            if (i11 < i12) {
                pthVar5.H(Math.min(i12 - i11, pthVar5.a()));
            }
            long a2 = a(this.b, z);
            pth pthVar6 = this.b;
            int i13 = pthVar6.b - i10;
            pthVar6.G(i10);
            this.d.t(this.b, i13);
            this.j += i13;
            if (a2 != -1) {
                b();
                this.j = 0;
                this.k = a2;
            }
            if (this.b.a() >= 16) {
                return 0;
            }
            int a3 = this.b.a();
            pth pthVar7 = this.b;
            byte[] bArr2 = pthVar7.a;
            System.arraycopy(bArr2, pthVar7.b, bArr2, 0, a3);
            this.b.G(0);
            this.b.F(a3);
            return 0;
        }
        bim bimVar = new bim(this.g);
        while (true) {
            biiVar.l();
            ptg ptgVar = new ptg(new byte[i3]);
            biiVar.j(ptgVar.a, 0, i3);
            boolean n = ptgVar.n();
            int d2 = ptgVar.d(r9);
            int d3 = ptgVar.d(24) + i3;
            if (d2 == 0) {
                byte[] bArr3 = new byte[38];
                biiVar.k(bArr3, 0, 38);
                bimVar.a = new bip(bArr3, i3);
            } else {
                bip bipVar3 = bimVar.a;
                if (bipVar3 == null) {
                    throw new IllegalArgumentException();
                }
                if (d2 == i2) {
                    pth pthVar8 = new pth(d3);
                    biiVar.k(pthVar8.a, 0, d3);
                    bimVar.a = bipVar3.c(bgy.b(pthVar8));
                } else if (d2 == i3) {
                    pth pthVar9 = new pth(d3);
                    biiVar.k(pthVar9.a, 0, d3);
                    pthVar9.H(i3);
                    bimVar.a = new bip(bipVar3.a, bipVar3.b, bipVar3.c, bipVar3.d, bipVar3.e, bipVar3.g, bipVar3.h, bipVar3.j, bipVar3.k, bipVar3.f(bip.e(Arrays.asList(jf.f(pthVar9, false, false).a), Collections.emptyList())));
                } else if (d2 == 6) {
                    pth pthVar10 = new pth(d3);
                    biiVar.k(pthVar10.a, 0, d3);
                    pthVar10.H(4);
                    int d4 = pthVar10.d();
                    String w = pthVar10.w(pthVar10.d(), amme.a);
                    String v = pthVar10.v(pthVar10.d());
                    int d5 = pthVar10.d();
                    int d6 = pthVar10.d();
                    int d7 = pthVar10.d();
                    int d8 = pthVar10.d();
                    int d9 = pthVar10.d();
                    byte[] bArr4 = new byte[d9];
                    pthVar10.B(bArr4, 0, d9);
                    bimVar.a = new bip(bipVar3.a, bipVar3.b, bipVar3.c, bipVar3.d, bipVar3.e, bipVar3.g, bipVar3.h, bipVar3.j, bipVar3.k, bipVar3.f(bip.e(Collections.emptyList(), Collections.singletonList(new PictureFrame(d4, w, v, d5, d6, d7, d8, bArr4)))));
                } else {
                    biiVar.m(d3);
                }
            }
            bip bipVar4 = bimVar.a;
            int i14 = pts.a;
            this.g = bipVar4;
            if (n) {
                pse.c(bipVar4);
                this.h = Math.max(this.g.c, 6);
                this.d.rp(this.g.d(this.a, this.f));
                this.e = 4;
                return 0;
            }
            i2 = 3;
            i3 = 4;
            r9 = 7;
        }
    }
}
