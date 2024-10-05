package defpackage;

import com.google.android.exoplayer.MediaFormat;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pdm implements pbz, pcm {
    private static final int a = pgz.c("qt  ");
    private int g;
    private int h;
    private long i;
    private int j;
    private pgx k;
    private int l;
    private int m;
    private int n;
    private pca o;
    private pdl[] p;
    private boolean q;
    private final pgx d = new pgx(16);
    private final Stack e = new Stack();
    private final pgx b = new pgx(pgv.a);
    private final pgx c = new pgx(4);

    public pdm() {
        g();
    }

    private final void g() {
        this.g = 1;
        this.j = 0;
    }

    private final void h(long j) {
        pdo b;
        pda pdaVar;
        while (!this.e.isEmpty() && ((pda) this.e.peek()).a == j) {
            pda pdaVar2 = (pda) this.e.pop();
            if (pdaVar2.aQ == pdc.E) {
                ArrayList arrayList = new ArrayList();
                pdb b2 = pdaVar2.b(pdc.aB);
                pch a2 = b2 != null ? pdi.a(b2, this.q) : null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                while (i < pdaVar2.c.size()) {
                    pda pdaVar3 = (pda) pdaVar2.c.get(i);
                    if (pdaVar3.aQ == pdc.G && (b = pdi.b(pdaVar3, pdaVar2.b(pdc.F), -1L, this.q)) != null) {
                        pdr c = pdi.c(b, pdaVar3.a(pdc.H).a(pdc.I).a(pdc.f263J));
                        if (c.a != 0) {
                            pdl pdlVar = new pdl(b, c, this.o.pH(i));
                            int i2 = c.d;
                            MediaFormat mediaFormat = b.k;
                            int i3 = i2 + 30;
                            pdaVar = pdaVar2;
                            MediaFormat mediaFormat2 = new MediaFormat(mediaFormat.a, mediaFormat.b, mediaFormat.c, i3, mediaFormat.e, mediaFormat.h, mediaFormat.i, mediaFormat.l, mediaFormat.m, mediaFormat.q, mediaFormat.r, mediaFormat.v, mediaFormat.w, mediaFormat.f, mediaFormat.g, mediaFormat.j, mediaFormat.k, mediaFormat.s, mediaFormat.t, mediaFormat.u, mediaFormat.o, mediaFormat.n, mediaFormat.p);
                            pdlVar.c.d(a2 != null ? mediaFormat2.a(a2.a, a2.b) : mediaFormat2);
                            arrayList.add(pdlVar);
                            long j3 = c.b[0];
                            if (j3 < j2) {
                                j2 = j3;
                            }
                            i++;
                            pdaVar2 = pdaVar;
                        }
                    }
                    pdaVar = pdaVar2;
                    i++;
                    pdaVar2 = pdaVar;
                }
                this.p = (pdl[]) arrayList.toArray(new pdl[0]);
                this.o.pJ();
                this.o.pK(this);
                this.e.clear();
                this.g = 3;
            } else if (!this.e.isEmpty()) {
                ((pda) this.e.peek()).c(pdaVar2);
            }
        }
        if (this.g != 3) {
            g();
        }
    }

    @Override // defpackage.pbz
    public final void a(pca pcaVar) {
        this.o = pcaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[SYNTHETIC] */
    @Override // defpackage.pcm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(long r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
        L7:
            pdl[] r4 = r8.p
            int r5 = r4.length
            if (r3 >= r5) goto L51
            r4 = r4[r3]
            pdr r4 = r4.b
            long[] r5 = r4.e
            int r5 = defpackage.pgz.s(r5, r9, r0)
        L16:
            r6 = -1
            if (r5 < 0) goto L24
            int[] r7 = r4.f
            r7 = r7[r5]
            r7 = r7 & 1
            if (r7 != 0) goto L25
            int r5 = r5 + (-1)
            goto L16
        L24:
            r5 = -1
        L25:
            if (r5 != r6) goto L3e
            long[] r5 = r4.e
            int r5 = defpackage.pgz.r(r5, r9, r0)
        L2d:
            long[] r7 = r4.e
            int r7 = r7.length
            if (r5 >= r7) goto L3f
            int[] r7 = r4.f
            r7 = r7[r5]
            r7 = r7 & 1
            if (r7 == 0) goto L3b
            goto L3e
        L3b:
            int r5 = r5 + 1
            goto L2d
        L3e:
            r6 = r5
        L3f:
            pdl[] r5 = r8.p
            r5 = r5[r3]
            r5.d = r6
            long[] r4 = r4.b
            r5 = r4[r6]
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L4e
            r1 = r5
        L4e:
            int r3 = r3 + 1
            goto L7
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdm.b(long):long");
    }

    @Override // defpackage.pcm
    public final boolean c() {
        return true;
    }

    @Override // defpackage.pbz
    public final void d() {
        this.e.clear();
        this.j = 0;
        this.m = 0;
        this.n = 0;
        this.g = 0;
    }

    @Override // defpackage.pbz
    public final boolean e(pbw pbwVar) {
        return pdn.a(pbwVar, false);
    }

    @Override // defpackage.pbz
    public final int f(pbw pbwVar, tfq tfqVar) {
        pdl[] pdlVarArr;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        while (true) {
            int i4 = this.g;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (this.j == 0) {
                        if (!pbwVar.m(this.d.a, 0, 8, true)) {
                            return -1;
                        }
                        this.j = 8;
                        this.d.z(0);
                        this.i = this.d.n();
                        this.h = this.d.c();
                    }
                    if (this.i == 1) {
                        pbwVar.h(this.d.a, 8, 8);
                        this.j += 8;
                        this.i = this.d.o();
                    }
                    int i5 = this.h;
                    if (i5 == pdc.E || i5 == pdc.G || i5 == pdc.H || i5 == pdc.I || i5 == pdc.f263J || i5 == pdc.S) {
                        long j = (pbwVar.c + this.i) - this.j;
                        this.e.add(new pda(this.h, j));
                        if (this.i == this.j) {
                            h(j);
                        } else {
                            g();
                        }
                    } else {
                        int i6 = this.h;
                        if (i6 == pdc.U || i6 == pdc.F || i6 == pdc.V || i6 == pdc.W || i6 == pdc.ao || i6 == pdc.ap || i6 == pdc.aq || i6 == pdc.T || i6 == pdc.ar || i6 == pdc.as || i6 == pdc.at || i6 == pdc.au || i6 == pdc.av || i6 == pdc.R || i6 == pdc.d || i6 == pdc.aB) {
                            opn.k(this.j == 8);
                            opn.k(this.i <= 2147483647L);
                            this.k = new pgx((int) this.i);
                            System.arraycopy(this.d.a, 0, this.k.a, 0, 8);
                        } else {
                            this.k = null;
                        }
                        this.g = 2;
                    }
                } else {
                    if (i4 != 2) {
                        long j2 = Long.MAX_VALUE;
                        int i7 = 0;
                        int i8 = -1;
                        while (true) {
                            pdlVarArr = this.p;
                            if (i7 >= pdlVarArr.length) {
                                break;
                            }
                            pdl pdlVar = pdlVarArr[i7];
                            int i9 = pdlVar.d;
                            pdr pdrVar = pdlVar.b;
                            if (i9 != pdrVar.a) {
                                long j3 = pdrVar.b[i9];
                                if (j3 < j2) {
                                    i8 = i7;
                                    j2 = j3;
                                }
                            }
                            i7++;
                        }
                        if (i8 == -1) {
                            return -1;
                        }
                        pdl pdlVar2 = pdlVarArr[i8];
                        pcn pcnVar = pdlVar2.c;
                        int i10 = pdlVar2.d;
                        long j4 = pdlVar2.b.b[i10];
                        long j5 = (j4 - pbwVar.c) + this.m;
                        if (j5 < 0 || j5 >= 262144) {
                            tfqVar.a = j4;
                            return 1;
                        }
                        pbwVar.j((int) j5);
                        this.l = pdlVar2.b.c[i10];
                        int i11 = pdlVar2.a.o;
                        if (i11 == -1) {
                            while (true) {
                                int i12 = this.m;
                                i3 = this.l;
                                if (i12 >= i3) {
                                    break;
                                }
                                int j6 = pcnVar.j(pbwVar, i3 - i12, false);
                                this.m += j6;
                                this.n -= j6;
                            }
                            i2 = i3;
                        } else {
                            byte[] bArr = this.c.a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i13 = 4 - i11;
                            while (true) {
                                int i14 = this.m;
                                i = this.l;
                                if (i14 >= i) {
                                    break;
                                }
                                int i15 = this.n;
                                if (i15 == 0) {
                                    pbwVar.h(this.c.a, i13, i11);
                                    this.c.z(0);
                                    this.n = this.c.j();
                                    this.b.z(0);
                                    pcnVar.f(this.b, 4);
                                    this.m += 4;
                                    this.l += i13;
                                } else {
                                    int j7 = pcnVar.j(pbwVar, i15, false);
                                    this.m += j7;
                                    this.n -= j7;
                                }
                            }
                            i2 = i;
                        }
                        pdr pdrVar2 = pdlVar2.b;
                        pcnVar.g(pdrVar2.e[i10], pdrVar2.f[i10], i2, 0, null);
                        pdlVar2.d++;
                        this.m = 0;
                        this.n = 0;
                        return 0;
                    }
                    long j8 = this.i;
                    int i16 = this.j;
                    long j9 = j8 - i16;
                    long j10 = pbwVar.c + j9;
                    pgx pgxVar = this.k;
                    if (pgxVar != null) {
                        pbwVar.h(pgxVar.a, i16, (int) j9);
                        if (this.h == pdc.d) {
                            pgx pgxVar2 = this.k;
                            pgxVar2.z(8);
                            if (pgxVar2.c() != a) {
                                pgxVar2.A(4);
                                while (pgxVar2.a() > 0) {
                                    if (pgxVar2.c() == a) {
                                    }
                                }
                                z2 = false;
                                this.q = z2;
                            }
                            z2 = true;
                            this.q = z2;
                        } else if (!this.e.isEmpty()) {
                            ((pda) this.e.peek()).d(new pdb(this.h, this.k));
                        }
                    } else if (j9 >= 262144) {
                        tfqVar.a = j10;
                        z = true;
                        h(j10);
                        if (z && this.g != 3) {
                            return 1;
                        }
                    } else {
                        pbwVar.j((int) j9);
                    }
                    z = false;
                    h(j10);
                    if (z) {
                        return 1;
                    }
                    continue;
                }
            } else if (pbwVar.c == 0) {
                g();
            } else {
                this.g = 3;
            }
        }
    }
}
