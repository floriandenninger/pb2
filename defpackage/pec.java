package defpackage;

import android.util.Log;
import com.google.android.exoplayer.MediaFormat;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pec extends pdz implements pcm {
    private peb e;
    private int g;
    private long h;
    private boolean i;
    private final pdv j = new pdv();
    private long k = -1;
    private ped l;
    private long m;
    private long n;
    private long o;
    private long p;
    private opn q;

    @Override // defpackage.pdz
    public final int a(pbw pbwVar, tfq tfqVar) {
        tfq tfqVar2;
        int i;
        int i2;
        int i3;
        long j;
        pdx pdxVar;
        long j2;
        int i4;
        long j3;
        pbw pbwVar2 = pbwVar;
        int i5 = 24;
        int i6 = 16;
        if (this.o == 0) {
            if (this.e == null) {
                this.m = pbwVar2.b;
                pgx pgxVar = this.a;
                if (this.l == null) {
                    this.b.a(pbwVar2, pgxVar);
                    opn.p(1, pgxVar, false);
                    pgxVar.l();
                    int h = pgxVar.h();
                    long l = pgxVar.l();
                    pgxVar.d();
                    int d = pgxVar.d();
                    pgxVar.d();
                    int h2 = pgxVar.h();
                    double pow = Math.pow(2.0d, h2 & 15);
                    double pow2 = Math.pow(2.0d, (h2 & 240) >> 4);
                    pgxVar.h();
                    this.l = new ped(h, l, d, (int) pow, (int) pow2, Arrays.copyOf(pgxVar.a, pgxVar.c));
                    pgxVar.v();
                }
                if (this.q == null) {
                    this.b.a(pbwVar2, pgxVar);
                    opn.p(3, pgxVar, false);
                    pgxVar.r((int) pgxVar.l()).length();
                    long l2 = pgxVar.l();
                    String[] strArr = new String[(int) l2];
                    for (int i7 = 0; i7 < l2; i7++) {
                        String r = pgxVar.r((int) pgxVar.l());
                        strArr[i7] = r;
                        r.length();
                    }
                    if ((pgxVar.h() & 1) != 0) {
                        this.q = new opn();
                        pgxVar.v();
                    } else {
                        throw new oyo("framing bit expected to be set");
                    }
                }
                this.b.a(pbwVar2, pgxVar);
                int i8 = pgxVar.c;
                byte[] bArr = new byte[i8];
                System.arraycopy(pgxVar.a, 0, bArr, 0, i8);
                int i9 = this.l.a;
                int i10 = 5;
                opn.p(5, pgxVar, false);
                int h3 = pgxVar.h() + 1;
                pea peaVar = new pea(pgxVar.a);
                peaVar.c(pgxVar.b * 8);
                int i11 = 0;
                while (i11 < h3) {
                    if (peaVar.b(i5) == 5653314) {
                        int b = peaVar.b(i6);
                        int b2 = peaVar.b(i5);
                        long[] jArr = new long[b2];
                        if (!peaVar.d()) {
                            boolean d2 = peaVar.d();
                            int i12 = 0;
                            while (i12 < b2) {
                                if (d2) {
                                    if (peaVar.d()) {
                                        jArr[i12] = peaVar.b(i10) + 1;
                                    } else {
                                        jArr[i12] = 0;
                                    }
                                } else {
                                    jArr[i12] = peaVar.b(5) + 1;
                                }
                                i12++;
                                i10 = 5;
                            }
                        } else {
                            int b3 = peaVar.b(5) + 1;
                            int i13 = 0;
                            while (i13 < b2) {
                                int b4 = peaVar.b(opn.o(b2 - i13));
                                for (int i14 = 0; i14 < b4 && i13 < b2; i14++) {
                                    jArr[i13] = b3;
                                    i13++;
                                }
                                b3++;
                            }
                        }
                        int b5 = peaVar.b(4);
                        if (b5 <= 2) {
                            if (b5 != 1) {
                                if (b5 == 2) {
                                    b5 = 2;
                                } else {
                                    i11++;
                                    i5 = 24;
                                    i6 = 16;
                                    i10 = 5;
                                }
                            }
                            peaVar.c(32);
                            peaVar.c(32);
                            int b6 = peaVar.b(4) + 1;
                            peaVar.c(1);
                            if (b5 != 1) {
                                j3 = b2 * b;
                            } else if (b != 0) {
                                double d3 = b;
                                Double.isNaN(d3);
                                j3 = (long) Math.floor(Math.pow(b2, 1.0d / d3));
                            } else {
                                j3 = 0;
                            }
                            peaVar.c((int) (j3 * b6));
                            i11++;
                            i5 = 24;
                            i6 = 16;
                            i10 = 5;
                        } else {
                            StringBuilder sb = new StringBuilder(53);
                            sb.append("lookup type greater than 2 not decodable: ");
                            sb.append(b5);
                            throw new oyo(sb.toString());
                        }
                    } else {
                        int a = peaVar.a();
                        StringBuilder sb2 = new StringBuilder(66);
                        sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sb2.append(a);
                        throw new oyo(sb2.toString());
                    }
                }
                int i15 = 6;
                int b7 = peaVar.b(6) + 1;
                for (int i16 = 0; i16 < b7; i16++) {
                    if (peaVar.b(16) != 0) {
                        throw new oyo("placeholder of time domain transforms not zeroed out");
                    }
                }
                int i17 = 1;
                int b8 = peaVar.b(6) + 1;
                int i18 = 0;
                while (i18 < b8) {
                    int b9 = peaVar.b(16);
                    if (b9 == 0) {
                        int i19 = 8;
                        peaVar.c(8);
                        peaVar.c(16);
                        peaVar.c(16);
                        peaVar.c(6);
                        peaVar.c(8);
                        int b10 = peaVar.b(4) + 1;
                        int i20 = 0;
                        while (i20 < b10) {
                            peaVar.c(i19);
                            i20++;
                            i19 = 8;
                        }
                    } else if (b9 == i17) {
                        int b11 = peaVar.b(5);
                        int[] iArr = new int[b11];
                        int i21 = -1;
                        for (int i22 = 0; i22 < b11; i22++) {
                            int b12 = peaVar.b(4);
                            iArr[i22] = b12;
                            if (b12 > i21) {
                                i21 = b12;
                            }
                        }
                        int i23 = i21 + 1;
                        int[] iArr2 = new int[i23];
                        for (int i24 = 0; i24 < i23; i24++) {
                            int i25 = 1;
                            iArr2[i24] = peaVar.b(3) + 1;
                            int b13 = peaVar.b(2);
                            if (b13 > 0) {
                                i4 = 8;
                                peaVar.c(8);
                            } else {
                                i4 = 8;
                            }
                            int i26 = 0;
                            while (i26 < (i25 << b13)) {
                                peaVar.c(i4);
                                i26++;
                                i25 = 1;
                                i4 = 8;
                            }
                        }
                        peaVar.c(2);
                        int b14 = peaVar.b(4);
                        int i27 = 0;
                        int i28 = 0;
                        for (int i29 = 0; i29 < b11; i29++) {
                            i27 += iArr2[iArr[i29]];
                            while (i28 < i27) {
                                peaVar.c(b14);
                                i28++;
                            }
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder(52);
                        sb3.append("floor type greater than 1 not decodable: ");
                        sb3.append(b9);
                        throw new oyo(sb3.toString());
                    }
                    i18++;
                    i15 = 6;
                    i17 = 1;
                }
                int i30 = 1;
                int b15 = peaVar.b(i15) + 1;
                int i31 = 0;
                while (i31 < b15) {
                    if (peaVar.b(16) <= 2) {
                        peaVar.c(24);
                        peaVar.c(24);
                        peaVar.c(24);
                        int b16 = peaVar.b(i15) + i30;
                        int i32 = 8;
                        peaVar.c(8);
                        int[] iArr3 = new int[b16];
                        for (int i33 = 0; i33 < b16; i33++) {
                            iArr3[i33] = ((peaVar.d() ? peaVar.b(5) : 0) * 8) + peaVar.b(3);
                        }
                        int i34 = 0;
                        while (i34 < b16) {
                            int i35 = 0;
                            while (i35 < i32) {
                                if ((iArr3[i34] & (1 << i35)) != 0) {
                                    peaVar.c(i32);
                                }
                                i35++;
                                i32 = 8;
                            }
                            i34++;
                            i32 = 8;
                        }
                        i31++;
                        i15 = 6;
                        i30 = 1;
                    } else {
                        throw new oyo("residueType greater than 2 is not decodable");
                    }
                }
                int b17 = peaVar.b(i15) + 1;
                for (int i36 = 0; i36 < b17; i36++) {
                    int b18 = peaVar.b(16);
                    if (b18 == 0) {
                        int b19 = peaVar.d() ? peaVar.b(4) + 1 : 1;
                        if (peaVar.d()) {
                            int b20 = peaVar.b(8) + 1;
                            for (int i37 = 0; i37 < b20; i37++) {
                                int i38 = i9 - 1;
                                peaVar.c(opn.o(i38));
                                peaVar.c(opn.o(i38));
                            }
                        }
                        if (peaVar.b(2) != 0) {
                            throw new oyo("to reserved bits must be zero after mapping coupling steps");
                        }
                        if (b19 > 1) {
                            for (int i39 = 0; i39 < i9; i39++) {
                                peaVar.c(4);
                            }
                        }
                        for (int i40 = 0; i40 < b19; i40++) {
                            peaVar.c(8);
                            peaVar.c(8);
                            peaVar.c(8);
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder(52);
                        sb4.append("mapping type other than 0 not supported: ");
                        sb4.append(b18);
                        Log.e("VorbisUtil", sb4.toString());
                    }
                }
                int b21 = peaVar.b(6) + 1;
                ansv[] ansvVarArr = new ansv[b21];
                for (int i41 = 0; i41 < b21; i41++) {
                    boolean d4 = peaVar.d();
                    peaVar.b(16);
                    peaVar.b(16);
                    peaVar.b(8);
                    ansvVarArr[i41] = new ansv(d4);
                }
                if (peaVar.d()) {
                    pgxVar.v();
                    this.e = new peb(this.l, bArr, ansvVarArr, opn.o(b21 - 1), null, null, null);
                    pbwVar2 = pbwVar;
                    this.n = pbwVar2.c;
                    this.d.pK(this);
                    if (this.m != -1) {
                        tfqVar.a = Math.max(0L, pbwVar2.b - 8000);
                        return 1;
                    }
                    tfqVar2 = tfqVar;
                } else {
                    throw new oyo("framing bit after modes not set as expected");
                }
            } else {
                tfqVar2 = tfqVar;
            }
            if (this.m == -1) {
                j2 = -1;
            } else {
                pdu pduVar = this.b;
                opn.i(pbwVar2.b != -1);
                pdy.b(pbwVar);
                pduVar.a.a();
                while (true) {
                    pdxVar = pduVar.a;
                    if ((pdxVar.a & 4) == 4 || pbwVar2.c >= pbwVar2.b) {
                        break;
                    }
                    pdy.c(pbwVar2, pdxVar, pduVar.b, false);
                    pdx pdxVar2 = pduVar.a;
                    pbwVar2.j(pdxVar2.d + pdxVar2.e);
                }
                j2 = pdxVar.b;
            }
            this.o = j2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.e.a.f);
            arrayList.add(this.e.b);
            long j4 = this.m == -1 ? -1L : (this.o * 1000000) / this.e.a.b;
            this.p = j4;
            pcn pcnVar = this.c;
            ped pedVar = this.e.a;
            pcnVar.d(MediaFormat.b(null, "audio/vorbis", pedVar.c, 65025, j4, pedVar.a, (int) pedVar.b, arrayList, null));
            long j5 = this.m;
            if (j5 != -1) {
                pdv pdvVar = this.j;
                long j6 = j5 - this.n;
                long j7 = this.o;
                opn.i(j6 > 0 && j7 > 0);
                pdvVar.c = j6;
                pdvVar.d = j7;
                tfqVar2.a = this.n;
                return 1;
            }
        } else {
            tfqVar2 = tfqVar;
        }
        if (!this.i && this.k > -1) {
            pdy.b(pbwVar);
            pdv pdvVar2 = this.j;
            long j8 = this.k;
            opn.k((pdvVar2.c == -1 || pdvVar2.d == 0) ? false : true);
            pdy.c(pbwVar2, pdvVar2.a, pdvVar2.b, false);
            long j9 = j8 - pdvVar2.a.b;
            if (j9 <= 0 || j9 > 72000) {
                j = ((j9 * pdvVar2.c) / pdvVar2.d) + (pbwVar2.c - ((r7.e + r7.d) * (j9 <= 0 ? 2 : 1)));
            } else {
                pbwVar.i();
                j = -1;
            }
            if (j != -1) {
                tfqVar2.a = j;
                return 1;
            }
            pdu pduVar2 = this.b;
            long j10 = this.k;
            pdy.b(pbwVar);
            pdy.c(pbwVar2, pduVar2.a, pduVar2.b, false);
            while (true) {
                pdx pdxVar3 = pduVar2.a;
                if (pdxVar3.b >= j10) {
                    break;
                }
                pbwVar2.j(pdxVar3.d + pdxVar3.e);
                pdx pdxVar4 = pduVar2.a;
                pduVar2.d = pdxVar4.b;
                pdy.c(pbwVar2, pdxVar4, pduVar2.b, false);
            }
            if (pduVar2.d == 0) {
                throw new oyo();
            }
            pbwVar.i();
            long j11 = pduVar2.d;
            pduVar2.d = 0L;
            pduVar2.c = -1;
            this.h = j11;
            this.g = this.l.d;
            this.i = true;
        }
        if (!this.b.a(pbwVar2, this.a)) {
            return -1;
        }
        byte b22 = this.a.a[0];
        if ((b22 & 1) != 1) {
            peb pebVar = this.e;
            if (!pebVar.d[pdy.d(b22, pebVar.c)].a) {
                i = pebVar.a.d;
            } else {
                i = pebVar.a.e;
            }
            if (this.i) {
                i2 = 4;
                i3 = (this.g + i) / 4;
            } else {
                i2 = 4;
                i3 = 0;
            }
            long j12 = i3;
            if (this.h + j12 >= this.k) {
                pgx pgxVar2 = this.a;
                pgxVar2.y(pgxVar2.c + i2);
                byte[] bArr2 = pgxVar2.a;
                int i42 = pgxVar2.c;
                bArr2[i42 - 4] = (byte) (j12 & 255);
                bArr2[i42 - 3] = (byte) ((j12 >>> 8) & 255);
                bArr2[i42 - 2] = (byte) ((j12 >>> 16) & 255);
                bArr2[i42 - 1] = (byte) (255 & (j12 >>> 24));
                long j13 = (this.h * 1000000) / this.e.a.b;
                pcn pcnVar2 = this.c;
                pgx pgxVar3 = this.a;
                pcnVar2.f(pgxVar3, pgxVar3.c);
                this.c.g(j13, 1, this.a.c, 0, null);
                this.k = -1L;
            }
            this.i = true;
            this.h += j12;
            this.g = i;
        }
        this.a.v();
        return 0;
    }

    @Override // defpackage.pcm
    public final long b(long j) {
        if (j == 0) {
            this.k = -1L;
            return this.n;
        }
        this.k = (this.e.a.b * j) / 1000000;
        return Math.max(this.n, (((this.m - r0) * j) / this.p) - 4000);
    }

    @Override // defpackage.pcm
    public final boolean c() {
        return (this.e == null || this.m == -1) ? false : true;
    }

    @Override // defpackage.pdz
    public final void d() {
        super.d();
        this.g = 0;
        this.h = 0L;
        this.i = false;
    }
}
