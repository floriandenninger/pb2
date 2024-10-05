package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class blo extends blm {
    private bln a;
    private int o;
    private boolean p;
    private bjf q;
    private bje r;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blm
    public final long a(pth pthVar) {
        byte b = pthVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        bln blnVar = this.a;
        pse.d(blnVar);
        int i = !blnVar.d[(b >> 1) & (PrivateKeyType.INVALID >>> (8 - blnVar.c))].a ? blnVar.a.e : blnVar.a.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        int b2 = pthVar.b();
        int i2 = pthVar.c + 4;
        if (b2 >= i2) {
            pthVar.F(i2);
        } else {
            pthVar.D(Arrays.copyOf(pthVar.a, i2));
        }
        byte[] bArr = pthVar.a;
        int i3 = pthVar.c;
        bArr[i3 - 4] = (byte) (j & 255);
        bArr[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blm
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.a = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blm
    public final boolean c(pth pthVar, long j, blk blkVar) {
        bln blnVar;
        int i;
        boolean z;
        if (this.a == null) {
            bjf bjfVar = this.q;
            if (bjfVar == null) {
                jf.g(1, pthVar, false);
                pthVar.f();
                int i2 = pthVar.i();
                int f = pthVar.f();
                int e = pthVar.e();
                int i3 = e <= 0 ? -1 : e;
                int e2 = pthVar.e();
                int i4 = e2 <= 0 ? -1 : e2;
                pthVar.e();
                int i5 = pthVar.i();
                double pow = Math.pow(2.0d, i5 & 15);
                double pow2 = Math.pow(2.0d, (i5 & 240) >> 4);
                pthVar.i();
                this.q = new bjf(i2, f, i3, i4, (int) pow, (int) pow2, Arrays.copyOf(pthVar.a, pthVar.c));
            } else if (this.r == null) {
                this.r = jf.f(pthVar, true, true);
            } else {
                int i6 = pthVar.c;
                byte[] bArr = new byte[i6];
                System.arraycopy(pthVar.a, 0, bArr, 0, i6);
                int i7 = bjfVar.a;
                int i8 = 5;
                jf.g(5, pthVar, false);
                int i9 = pthVar.i() + 1;
                bjd bjdVar = new bjd(pthVar.a);
                bjdVar.b(pthVar.b * 8);
                int i10 = 0;
                while (true) {
                    int i11 = 16;
                    if (i10 < i9) {
                        if (bjdVar.a(24) != 5653314) {
                            int i12 = bjdVar.a;
                            int i13 = bjdVar.b;
                            StringBuilder sb = new StringBuilder(66);
                            sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb.append((i12 * 8) + i13);
                            throw pnr.a(sb.toString(), null);
                        }
                        int a = bjdVar.a(16);
                        int a2 = bjdVar.a(24);
                        long[] jArr = new long[a2];
                        long j2 = 0;
                        if (!bjdVar.c()) {
                            boolean c = bjdVar.c();
                            int i14 = 0;
                            while (i14 < a2) {
                                if (c) {
                                    if (bjdVar.c()) {
                                        z = c;
                                        jArr[i14] = bjdVar.a(i8) + 1;
                                    } else {
                                        z = c;
                                        jArr[i14] = 0;
                                    }
                                } else {
                                    z = c;
                                    jArr[i14] = bjdVar.a(i8) + 1;
                                }
                                i14++;
                                c = z;
                            }
                        } else {
                            int a3 = bjdVar.a(i8) + 1;
                            int i15 = 0;
                            while (i15 < a2) {
                                int a4 = bjdVar.a(jf.e(a2 - i15));
                                int i16 = 0;
                                while (i16 < a4 && i15 < a2) {
                                    jArr[i15] = a3;
                                    i15++;
                                    i16++;
                                    i9 = i9;
                                }
                                a3++;
                                i9 = i9;
                            }
                        }
                        int i17 = i9;
                        int a5 = bjdVar.a(4);
                        if (a5 <= 2) {
                            if (a5 != 1) {
                                if (a5 == 2) {
                                    a5 = 2;
                                } else {
                                    i10++;
                                    i9 = i17;
                                    i8 = 5;
                                }
                            }
                            bjdVar.b(32);
                            bjdVar.b(32);
                            int a6 = bjdVar.a(4) + 1;
                            bjdVar.b(1);
                            if (a5 != 1) {
                                j2 = a2 * a;
                            } else if (a != 0) {
                                double d = a;
                                Double.isNaN(d);
                                j2 = (long) Math.floor(Math.pow(a2, 1.0d / d));
                            }
                            bjdVar.b((int) (a6 * j2));
                            i10++;
                            i9 = i17;
                            i8 = 5;
                        } else {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("lookup type greater than 2 not decodable: ");
                            sb2.append(a5);
                            throw pnr.a(sb2.toString(), null);
                        }
                    } else {
                        int i18 = 6;
                        int a7 = bjdVar.a(6) + 1;
                        for (int i19 = 0; i19 < a7; i19++) {
                            if (bjdVar.a(16) != 0) {
                                throw pnr.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i20 = 1;
                        int a8 = bjdVar.a(6) + 1;
                        int i21 = 0;
                        while (true) {
                            int i22 = 3;
                            if (i21 < a8) {
                                int a9 = bjdVar.a(i11);
                                if (a9 == 0) {
                                    int i23 = 8;
                                    bjdVar.b(8);
                                    bjdVar.b(16);
                                    bjdVar.b(16);
                                    bjdVar.b(6);
                                    bjdVar.b(8);
                                    int a10 = bjdVar.a(4) + 1;
                                    int i24 = 0;
                                    while (i24 < a10) {
                                        bjdVar.b(i23);
                                        i24++;
                                        i23 = 8;
                                    }
                                } else if (a9 == i20) {
                                    int a11 = bjdVar.a(5);
                                    int[] iArr = new int[a11];
                                    int i25 = -1;
                                    for (int i26 = 0; i26 < a11; i26++) {
                                        int a12 = bjdVar.a(4);
                                        iArr[i26] = a12;
                                        if (a12 > i25) {
                                            i25 = a12;
                                        }
                                    }
                                    int i27 = i25 + 1;
                                    int[] iArr2 = new int[i27];
                                    int i28 = 0;
                                    while (i28 < i27) {
                                        iArr2[i28] = bjdVar.a(i22) + 1;
                                        int a13 = bjdVar.a(2);
                                        if (a13 > 0) {
                                            i = 8;
                                            bjdVar.b(8);
                                        } else {
                                            i = 8;
                                        }
                                        int i29 = 0;
                                        for (int i30 = 1; i29 < (i30 << a13); i30 = 1) {
                                            bjdVar.b(i);
                                            i29++;
                                            i = 8;
                                        }
                                        i28++;
                                        i22 = 3;
                                    }
                                    bjdVar.b(2);
                                    int a14 = bjdVar.a(4);
                                    int i31 = 0;
                                    int i32 = 0;
                                    for (int i33 = 0; i33 < a11; i33++) {
                                        i31 += iArr2[iArr[i33]];
                                        while (i32 < i31) {
                                            bjdVar.b(a14);
                                            i32++;
                                        }
                                    }
                                } else {
                                    StringBuilder sb3 = new StringBuilder(52);
                                    sb3.append("floor type greater than 1 not decodable: ");
                                    sb3.append(a9);
                                    throw pnr.a(sb3.toString(), null);
                                }
                                i21++;
                                i18 = 6;
                                i11 = 16;
                                i20 = 1;
                            } else {
                                int i34 = 1;
                                int a15 = bjdVar.a(i18) + 1;
                                int i35 = 0;
                                while (i35 < a15) {
                                    if (bjdVar.a(16) <= 2) {
                                        bjdVar.b(24);
                                        bjdVar.b(24);
                                        bjdVar.b(24);
                                        int a16 = bjdVar.a(i18) + i34;
                                        int i36 = 8;
                                        bjdVar.b(8);
                                        int[] iArr3 = new int[a16];
                                        for (int i37 = 0; i37 < a16; i37++) {
                                            iArr3[i37] = ((bjdVar.c() ? bjdVar.a(5) : 0) * 8) + bjdVar.a(3);
                                        }
                                        int i38 = 0;
                                        while (i38 < a16) {
                                            int i39 = 0;
                                            while (i39 < i36) {
                                                if ((iArr3[i38] & (1 << i39)) != 0) {
                                                    bjdVar.b(i36);
                                                }
                                                i39++;
                                                i36 = 8;
                                            }
                                            i38++;
                                            i36 = 8;
                                        }
                                        i35++;
                                        i18 = 6;
                                        i34 = 1;
                                    } else {
                                        throw pnr.a("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int a17 = bjdVar.a(i18) + 1;
                                for (int i40 = 0; i40 < a17; i40++) {
                                    int a18 = bjdVar.a(16);
                                    if (a18 != 0) {
                                        StringBuilder sb4 = new StringBuilder(52);
                                        sb4.append("mapping type other than 0 not supported: ");
                                        sb4.append(a18);
                                        Log.e("VorbisUtil", sb4.toString());
                                    } else {
                                        int a19 = bjdVar.c() ? bjdVar.a(4) + 1 : 1;
                                        if (bjdVar.c()) {
                                            int a20 = bjdVar.a(8) + 1;
                                            for (int i41 = 0; i41 < a20; i41++) {
                                                int i42 = i7 - 1;
                                                bjdVar.b(jf.e(i42));
                                                bjdVar.b(jf.e(i42));
                                            }
                                        }
                                        if (bjdVar.a(2) != 0) {
                                            throw pnr.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (a19 > 1) {
                                            for (int i43 = 0; i43 < i7; i43++) {
                                                bjdVar.b(4);
                                            }
                                        }
                                        for (int i44 = 0; i44 < a19; i44++) {
                                            bjdVar.b(8);
                                            bjdVar.b(8);
                                            bjdVar.b(8);
                                        }
                                    }
                                }
                                int a21 = bjdVar.a(6) + 1;
                                ansv[] ansvVarArr = new ansv[a21];
                                for (int i45 = 0; i45 < a21; i45++) {
                                    boolean c2 = bjdVar.c();
                                    bjdVar.a(16);
                                    bjdVar.a(16);
                                    bjdVar.a(8);
                                    ansvVarArr[i45] = new ansv(c2);
                                }
                                if (bjdVar.c()) {
                                    blnVar = new bln(bjfVar, bArr, ansvVarArr, jf.e(a21 - 1), null, null, null, null);
                                } else {
                                    throw pnr.a("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
            blnVar = null;
            this.a = blnVar;
            if (blnVar == null) {
                return true;
            }
            bjf bjfVar2 = blnVar.a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(bjfVar2.g);
            arrayList.add(blnVar.b);
            pmr pmrVar = new pmr();
            pmrVar.k = "audio/vorbis";
            pmrVar.f = bjfVar2.d;
            pmrVar.g = bjfVar2.c;
            pmrVar.x = bjfVar2.a;
            pmrVar.y = bjfVar2.b;
            pmrVar.m = arrayList;
            blkVar.a = pmrVar.a();
            return true;
        }
        pse.c(blkVar.a);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blm
    public final void f(long j) {
        this.h = j;
        this.p = j != 0;
        bjf bjfVar = this.q;
        this.o = bjfVar != null ? bjfVar.e : 0;
    }
}
