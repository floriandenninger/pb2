package defpackage;

import android.util.Log;
import android.util.SparseArray;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmq implements bih {
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private bik h;
    private boolean i;
    private bia j;
    private final ptq a = new ptq(0);
    private final pth c = new pth(4096);
    private final SparseArray b = new SparseArray();
    private final bmv k = new bmv(null);

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        this.h = bikVar;
    }

    @Override // defpackage.bih
    public final void e() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4 != r6) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[LOOP:0: B:13:0x0031->B:15:0x0039, LOOP_END] */
    @Override // defpackage.bih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r4, long r6) {
        /*
            r3 = this;
            ptq r4 = r3.a
            long r4 = r4.e()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L23
            ptq r4 = r3.a
            long r4 = r4.c()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L28
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L28
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L28
        L23:
            ptq r4 = r3.a
            r4.f(r6)
        L28:
            bia r4 = r3.j
            r5 = 0
            if (r4 == 0) goto L30
            r4.a(r6)
        L30:
            r4 = 0
        L31:
            android.util.SparseArray r6 = r3.b
            int r6 = r6.size()
            if (r4 >= r6) goto L4b
            android.util.SparseArray r6 = r3.b
            java.lang.Object r6 = r6.valueAt(r4)
            bmp r6 = (defpackage.bmp) r6
            r6.f = r5
            bly r6 = r6.a
            r6.e()
            int r4 = r4 + 1
            goto L31
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmq.f(long, long):void");
    }

    @Override // defpackage.bih
    public final boolean g(bii biiVar) {
        byte[] bArr = new byte[14];
        biiVar.j(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        biiVar.f(bArr[13] & 7);
        biiVar.j(bArr, 0, 3);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // defpackage.bih
    public final int h(bii biiVar, tfq tfqVar) {
        long j;
        long j2;
        long j3;
        bly bmaVar;
        pse.d(this.h);
        bid bidVar = (bid) biiVar;
        long j4 = bidVar.b;
        long j5 = -9223372036854775807L;
        if (j4 != -1) {
            bmv bmvVar = this.k;
            if (!bmvVar.c) {
                if (!bmvVar.e) {
                    int min = (int) Math.min(20000L, j4);
                    long j6 = j4 - min;
                    if (bidVar.c != j6) {
                        tfqVar.a = j6;
                        return 1;
                    }
                    bmvVar.b.C(min);
                    biiVar.l();
                    biiVar.j(bmvVar.b.a, 0, min);
                    pth pthVar = bmvVar.b;
                    int i = pthVar.b;
                    int i2 = pthVar.c - 4;
                    while (true) {
                        if (i2 < i) {
                            break;
                        }
                        if (bmv.d(pthVar.a, i2) == 442) {
                            pthVar.G(i2 + 4);
                            long b = bmv.b(pthVar);
                            if (b != -9223372036854775807L) {
                                j5 = b;
                                break;
                            }
                        }
                        i2--;
                    }
                    bmvVar.g = j5;
                    bmvVar.e = true;
                } else if (bmvVar.g == -9223372036854775807L) {
                    bmvVar.c(biiVar);
                } else if (bmvVar.d) {
                    long j7 = bmvVar.f;
                    if (j7 == -9223372036854775807L) {
                        bmvVar.c(biiVar);
                    } else {
                        long b2 = bmvVar.a.b(bmvVar.g) - bmvVar.a.b(j7);
                        bmvVar.h = b2;
                        if (b2 < 0) {
                            StringBuilder sb = new StringBuilder(65);
                            sb.append("Invalid duration: ");
                            sb.append(b2);
                            sb.append(". Using TIME_UNSET instead.");
                            Log.w("PsDurationReader", sb.toString());
                            bmvVar.h = -9223372036854775807L;
                        }
                        bmvVar.c(biiVar);
                    }
                } else {
                    int min2 = (int) Math.min(20000L, j4);
                    if (bidVar.c != 0) {
                        tfqVar.a = 0L;
                        return 1;
                    }
                    bmvVar.b.C(min2);
                    biiVar.l();
                    biiVar.j(bmvVar.b.a, 0, min2);
                    pth pthVar2 = bmvVar.b;
                    int i3 = pthVar2.b;
                    int i4 = pthVar2.c;
                    while (true) {
                        if (i3 >= i4 - 3) {
                            break;
                        }
                        if (bmv.d(pthVar2.a, i3) == 442) {
                            pthVar2.G(i3 + 4);
                            long b3 = bmv.b(pthVar2);
                            if (b3 != -9223372036854775807L) {
                                j5 = b3;
                                break;
                            }
                        }
                        i3++;
                    }
                    bmvVar.f = j5;
                    bmvVar.d = true;
                }
                return 0;
            }
        }
        if (this.i) {
            j = 0;
            j2 = j4;
        } else {
            this.i = true;
            bmv bmvVar2 = this.k;
            long j8 = bmvVar2.h;
            if (j8 != -9223372036854775807L) {
                j = 0;
                j2 = j4;
                bia biaVar = new bia(new bhv(), new bmo(bmvVar2.a), j8, j8 + 1, 0L, j4, 188L, 1000);
                this.j = biaVar;
                this.h.w(biaVar.a);
            } else {
                j = 0;
                j2 = j4;
                this.h.w(new biy(j8));
            }
        }
        bia biaVar2 = this.j;
        if (biaVar2 == null || !biaVar2.b()) {
            biiVar.l();
            long d = j2 != -1 ? j2 - biiVar.d() : -1L;
            if ((d != -1 && d < 4) || !biiVar.o(this.c.a, 0, 4, true)) {
                return -1;
            }
            this.c.G(0);
            int d2 = this.c.d();
            if (d2 == 441) {
                return -1;
            }
            if (d2 == 442) {
                biiVar.j(this.c.a, 0, 10);
                this.c.G(9);
                biiVar.m((this.c.i() & 7) + 14);
                return 0;
            }
            if (d2 == 443) {
                biiVar.j(this.c.a, 0, 2);
                this.c.G(0);
                biiVar.m(this.c.m() + 6);
                return 0;
            }
            if ((d2 >> 8) != 1) {
                biiVar.m(1);
                return 0;
            }
            int i5 = d2 & PrivateKeyType.INVALID;
            bmp bmpVar = (bmp) this.b.get(i5);
            if (!this.d) {
                if (bmpVar == null) {
                    bly blyVar = null;
                    if (i5 == 189) {
                        blyVar = new blr();
                        this.e = true;
                        this.g = bidVar.c;
                    } else {
                        if ((i5 & 224) == 192) {
                            bmaVar = new bmk(null);
                            this.e = true;
                            this.g = bidVar.c;
                        } else if ((i5 & 240) == 224) {
                            bmaVar = new bma(null);
                            this.f = true;
                            this.g = bidVar.c;
                        }
                        blyVar = bmaVar;
                    }
                    if (blyVar != null) {
                        blyVar.b(this.h, new bmz(i5, 256));
                        bmpVar = new bmp(blyVar, this.a);
                        this.b.put(i5, bmpVar);
                    }
                }
                long j9 = 1048576;
                if (this.e && this.f) {
                    j9 = this.g + 8192;
                }
                if (bidVar.c > j9) {
                    this.d = true;
                    this.h.q();
                }
            }
            biiVar.j(this.c.a, 0, 2);
            this.c.G(0);
            int m = this.c.m() + 6;
            if (bmpVar == null) {
                biiVar.m(m);
            } else {
                this.c.C(m);
                biiVar.k(this.c.a, 0, m);
                this.c.G(6);
                pth pthVar3 = this.c;
                pthVar3.B(bmpVar.c.a, 0, 3);
                bmpVar.c.j(0);
                bmpVar.c.l(8);
                bmpVar.d = bmpVar.c.n();
                bmpVar.e = bmpVar.c.n();
                bmpVar.c.l(6);
                pthVar3.B(bmpVar.c.a, 0, bmpVar.c.d(8));
                bmpVar.c.j(0);
                if (bmpVar.d) {
                    bmpVar.c.l(4);
                    int d3 = bmpVar.c.d(3);
                    bmpVar.c.l(1);
                    int d4 = bmpVar.c.d(15);
                    bmpVar.c.l(1);
                    long d5 = (d3 << 30) | (d4 << 15) | bmpVar.c.d(15);
                    bmpVar.c.l(1);
                    if (!bmpVar.f && bmpVar.e) {
                        bmpVar.c.l(4);
                        int d6 = bmpVar.c.d(3);
                        bmpVar.c.l(1);
                        int d7 = bmpVar.c.d(15);
                        bmpVar.c.l(1);
                        int d8 = bmpVar.c.d(15);
                        bmpVar.c.l(1);
                        bmpVar.b.b((d6 << 30) | (d7 << 15) | d8);
                        bmpVar.f = true;
                    }
                    j3 = bmpVar.b.b(d5);
                } else {
                    j3 = j;
                }
                bmpVar.a.d(j3, 4);
                bmpVar.a.a(pthVar3);
                bmpVar.a.c();
                pth pthVar4 = this.c;
                pthVar4.F(pthVar4.b());
            }
            return 0;
        }
        return this.j.f(biiVar, tfqVar);
    }
}
