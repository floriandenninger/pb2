package defpackage;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class pjm implements piu {
    private static final byte[] b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final pms c;
    private pjl A;
    private int B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private bik G;
    private bjc[] H;
    private bjc[] I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f268J;
    public piv a;
    private pir d;
    private pis e;
    private final List f;
    private final SparseArray g;
    private final pth h;
    private final pth i;
    private final pth j;
    private final byte[] k;
    private final pth l;
    private final ppf m;
    private final pth n;
    private final ArrayDeque o;
    private final ArrayDeque p;
    private int q;
    private int r;
    private long s;
    private int t;
    private pth u;
    private long v;
    private int w;
    private long x;
    private long y;
    private long z;

    static {
        pmr pmrVar = new pmr();
        pmrVar.k = "application/x-emsg";
        c = pmrVar.a();
    }

    public pjm() {
        this(Collections.emptyList());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.common.DrmInitData c(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto Lb5
            java.lang.Object r5 = r14.get(r3)
            pjg r5 = (defpackage.pjg) r5
            int r6 = r5.d
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lb1
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            pth r5 = r5.a
            byte[] r5 = r5.a
            pth r6 = new pth
            r6.<init>(r5)
            int r8 = r6.c
            r9 = 32
            if (r8 >= r9) goto L2f
        L2d:
            r6 = r2
            goto L97
        L2f:
            r6.G(r1)
            int r8 = r6.d()
            int r9 = r6.a()
            int r9 = r9 + 4
            if (r8 == r9) goto L3f
            goto L2d
        L3f:
            int r8 = r6.d()
            if (r8 == r7) goto L46
            goto L2d
        L46:
            int r7 = r6.d()
            int r7 = defpackage.pjh.d(r7)
            r8 = 1
            if (r7 <= r8) goto L6a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 37
            r6.<init>(r8)
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L2d
        L6a:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.o()
            long r12 = r6.o()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L82
            int r7 = r6.l()
            int r7 = r7 * 16
            r6.H(r7)
        L82:
            int r7 = r6.l()
            int r8 = r6.a()
            if (r7 == r8) goto L8d
            goto L2d
        L8d:
            byte[] r8 = new byte[r7]
            r6.B(r8, r1, r7)
            pjo r6 = new pjo
            r6.<init>(r9)
        L97:
            if (r6 != 0) goto L9b
            r6 = r2
            goto L9d
        L9b:
            java.util.UUID r6 = r6.a
        L9d:
            if (r6 != 0) goto La7
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lb1
        La7:
            androidx.media3.common.DrmInitData$SchemeData r7 = new androidx.media3.common.DrmInitData$SchemeData
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        Lb1:
            int r3 = r3 + 1
            goto L8
        Lb5:
            if (r4 != 0) goto Lb8
            return r2
        Lb8:
            androidx.media3.common.DrmInitData r14 = new androidx.media3.common.DrmInitData
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjm.c(java.util.List):androidx.media3.common.DrmInitData");
    }

    private final void i() {
        this.q = 0;
        this.t = 0;
    }

    private static void j(pth pthVar, int i, pjs pjsVar) {
        pthVar.G(i + 8);
        int c2 = pjh.c(pthVar.d());
        if ((c2 & 1) != 0) {
            throw pnr.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (c2 & 2) != 0;
        int l = pthVar.l();
        int i2 = pjsVar.e;
        if (l != i2) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(l);
            sb.append(", ");
            sb.append(i2);
            throw pnr.a(sb.toString(), null);
        }
        Arrays.fill(pjsVar.n, 0, l, z);
        pjsVar.b(pthVar.a());
        pth pthVar2 = pjsVar.p;
        pthVar.B(pthVar2.a, 0, pthVar2.c);
        pjsVar.p.G(0);
        pjsVar.q = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(long r50) {
        /*
            Method dump skipped, instructions count: 1851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjm.k(long):void");
    }

    private final void l(pit pitVar) {
        long j;
        String str;
        long s;
        String str2;
        long p;
        long j2;
        long q;
        long q2;
        int i = ((int) this.s) - this.t;
        pth pthVar = this.u;
        if (pthVar != null) {
            if (!pitVar.i(pthVar.a, 8, i)) {
                return;
            }
            pjg pjgVar = new pjg(this.r, this.u);
            long b2 = pitVar.b();
            if (!this.o.isEmpty()) {
                ((pjf) this.o.peek()).b.add(pjgVar);
            } else {
                int i2 = pjgVar.d;
                int i3 = 0;
                if (i2 == 1936286840) {
                    pth pthVar2 = pjgVar.a;
                    pthVar2.G(8);
                    int d = pthVar2.d();
                    pthVar2.H(4);
                    long p2 = pthVar2.p();
                    if (pjh.d(d) == 0) {
                        q = pthVar2.p();
                        q2 = pthVar2.p();
                    } else {
                        q = pthVar2.q();
                        q2 = pthVar2.q();
                    }
                    long j3 = b2 + q2;
                    long j4 = q;
                    long s2 = pts.s(j4, 1000000L, p2);
                    pthVar2.H(2);
                    int m = pthVar2.m();
                    int[] iArr = new int[m];
                    long[] jArr = new long[m];
                    long[] jArr2 = new long[m];
                    long[] jArr3 = new long[m];
                    long j5 = s2;
                    while (i3 < m) {
                        int d2 = pthVar2.d();
                        if ((d2 & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) == 0) {
                            long p3 = pthVar2.p();
                            iArr[i3] = d2 & Integer.MAX_VALUE;
                            jArr[i3] = j3;
                            jArr3[i3] = j5;
                            j4 += p3;
                            long[] jArr4 = jArr3;
                            long[] jArr5 = jArr2;
                            j5 = pts.s(j4, 1000000L, p2);
                            jArr5[i3] = j5 - jArr4[i3];
                            pthVar2.H(4);
                            j3 += iArr[i3];
                            i3++;
                            jArr2 = jArr5;
                            jArr3 = jArr4;
                            jArr = jArr;
                        } else {
                            throw pnr.a("Unhandled indirect reference", null);
                        }
                    }
                    Pair create = Pair.create(Long.valueOf(s2), new bib(iArr, jArr, jArr2, jArr3));
                    this.z = ((Long) create.first).longValue();
                    this.G.w((biz) create.second);
                    this.f268J = true;
                } else if (i2 == 1701671783) {
                    pth pthVar3 = pjgVar.a;
                    bjc[] bjcVarArr = this.H;
                    if (bjcVarArr != null && bjcVarArr.length != 0) {
                        pthVar3.G(8);
                        int d3 = pjh.d(pthVar3.d());
                        if (d3 == 0) {
                            String t = pthVar3.t();
                            pse.c(t);
                            String t2 = pthVar3.t();
                            pse.c(t2);
                            long p4 = pthVar3.p();
                            long s3 = pts.s(pthVar3.p(), 1000000L, p4);
                            long j6 = this.z;
                            j = j6 != -9223372036854775807L ? j6 + s3 : -9223372036854775807L;
                            str = t;
                            s = pts.s(pthVar3.p(), 1000L, p4);
                            str2 = t2;
                            p = pthVar3.p();
                            j2 = s3;
                        } else if (d3 == 1) {
                            long p5 = pthVar3.p();
                            long s4 = pts.s(pthVar3.q(), 1000000L, p5);
                            long s5 = pts.s(pthVar3.p(), 1000L, p5);
                            long p6 = pthVar3.p();
                            String t3 = pthVar3.t();
                            pse.c(t3);
                            String t4 = pthVar3.t();
                            pse.c(t4);
                            str = t3;
                            s = s5;
                            str2 = t4;
                            p = p6;
                            j = s4;
                            j2 = -9223372036854775807L;
                        } else {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append("Skipping unsupported emsg version: ");
                            sb.append(d3);
                            Log.w("FragmentedMp4Extractor", sb.toString());
                        }
                        byte[] bArr = new byte[pthVar3.a()];
                        pthVar3.B(bArr, 0, pthVar3.a());
                        pth pthVar4 = new pth(this.m.a(new EventMessage(str, str2, s, p, bArr)));
                        int a = pthVar4.a();
                        for (bjc bjcVar : this.H) {
                            pthVar4.G(0);
                            bjcVar.t(pthVar4, a);
                        }
                        if (j == -9223372036854775807L) {
                            this.p.addLast(new aeqp(j2, a));
                            this.w += a;
                        } else {
                            bjc[] bjcVarArr2 = this.H;
                            int length = bjcVarArr2.length;
                            while (i3 < length) {
                                bjcVarArr2[i3].v(j, 1, a, 0, null);
                                i3++;
                            }
                        }
                    }
                }
            }
        } else if (!pitVar.j(i)) {
            return;
        }
        k(pitVar.b());
    }

    private final void m(pit pitVar) {
        int size = this.g.size();
        long j = Long.MAX_VALUE;
        pjl pjlVar = null;
        for (int i = 0; i < size; i++) {
            pjs pjsVar = ((pjl) this.g.valueAt(i)).b;
            if (pjsVar.q) {
                long j2 = pjsVar.c;
                if (j2 < j) {
                    pjlVar = (pjl) this.g.valueAt(i);
                    j = j2;
                }
            }
        }
        if (pjlVar == null) {
            this.q = 3;
            return;
        }
        int b2 = (int) (j - pitVar.b());
        if (b2 < 0) {
            throw pnr.a("Offset to encryption data was negative.", null);
        }
        if (pitVar.j(b2)) {
            pjs pjsVar2 = pjlVar.b;
            pth pthVar = pjsVar2.p;
            pitVar.i(pthVar.a, 0, pthVar.c);
            pjsVar2.p.G(0);
            pjsVar2.q = false;
        }
    }

    private final boolean n(pit pitVar) {
        if (this.t == 0) {
            if (pitVar.a() != -1 && pitVar.a() == pitVar.b()) {
                return false;
            }
            try {
                if (pitVar.i(this.n.a, 0, 8)) {
                    this.t = 8;
                    this.n.G(0);
                    this.s = this.n.p();
                    this.r = this.n.d();
                }
            } catch (EOFException unused) {
            }
            return false;
        }
        long j = this.s;
        if (j == 1) {
            if (!pitVar.i(this.n.a, 8, 8)) {
                return false;
            }
            this.t += 8;
            this.s = this.n.q();
        } else if (j == 0) {
            long a = pitVar.a();
            if (a == -1 && !this.o.isEmpty()) {
                a = ((pjf) this.o.peek()).a;
            }
            if (a != -1) {
                this.s = (a - pitVar.b()) + this.t;
            }
        }
        if (this.s < this.t) {
            throw pnr.c("Atom size less than header length (unsupported).");
        }
        long b2 = pitVar.b() - this.t;
        if (this.r == 1836019558) {
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                pjs pjsVar = ((pjl) this.g.valueAt(i)).b;
                pjsVar.c = b2;
                pjsVar.b = b2;
            }
        }
        int i2 = this.r;
        if (i2 == 1835295092) {
            this.A = null;
            this.v = this.s + b2;
            if (!this.f268J) {
                this.G.w(new biy(this.y, b2));
                this.f268J = true;
            }
            this.q = 2;
            return true;
        }
        if (i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227) {
            long b3 = (pitVar.b() + this.s) - 8;
            this.o.push(new pjf(this.r, b3));
            if (this.s == this.t) {
                k(b3);
            } else {
                i();
            }
        } else if (i2 == 1751411826 || i2 == 1835296868 || i2 == 1836476516 || i2 == 1936286840 || i2 == 1937011556 || i2 == 1952867444 || i2 == 1952868452 || i2 == 1953196132 || i2 == 1953654136 || i2 == 1953658222 || i2 == 1886614376 || i2 == 1935763834 || i2 == 1935763823 || i2 == 1936027235 || i2 == 1970628964 || i2 == 1935828848 || i2 == 1936158820 || i2 == 1701606260 || i2 == 1835362404 || i2 == 1701671783) {
            if (this.t == 8) {
                long j2 = this.s;
                if (j2 > 2147483647L) {
                    throw pnr.c("Leaf atom with length > 2147483647 (unsupported).");
                }
                this.u = new pth((int) j2);
                System.arraycopy(this.n.a, 0, this.u.a, 0, 8);
                this.q = 1;
            } else {
                throw pnr.c("Leaf atom defines extended atom size (unsupported).");
            }
        } else {
            if (this.s > 2147483647L) {
                throw pnr.c("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.u = null;
            this.q = 1;
        }
        return true;
    }

    private final boolean o(pit pitVar) {
        int e;
        int i;
        bjb bjbVar;
        int a;
        Throwable th = null;
        int i2 = 1;
        boolean z = false;
        if (this.q == 3) {
            if (this.A == null) {
                SparseArray sparseArray = this.g;
                int size = sparseArray.size();
                long j = Long.MAX_VALUE;
                pjl pjlVar = null;
                for (int i3 = 0; i3 < size; i3++) {
                    pjl pjlVar2 = (pjl) sparseArray.valueAt(i3);
                    int i4 = pjlVar2.h;
                    pjs pjsVar = pjlVar2.b;
                    if (i4 != pjsVar.d) {
                        long j2 = pjsVar.f[i4];
                        if (j2 < j) {
                            pjlVar = pjlVar2;
                            j = j2;
                        }
                    }
                }
                if (pjlVar == null) {
                    int b2 = (int) (this.v - pitVar.b());
                    if (b2 < 0) {
                        throw pnr.a("Offset to end of mdat was negative.", null);
                    }
                    if (!pitVar.j(b2)) {
                        return false;
                    }
                    i();
                    return false;
                }
                int b3 = (int) (pjlVar.b.f[pjlVar.h] - pitVar.b());
                if (b3 < 0) {
                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    b3 = 0;
                }
                if (!pitVar.j(b3)) {
                    return false;
                }
                this.A = pjlVar;
            }
            pjl pjlVar3 = this.A;
            pjs pjsVar2 = pjlVar3.b;
            int[] iArr = pjsVar2.i;
            int i5 = pjlVar3.f;
            this.B = iArr[i5];
            int i6 = pjsVar2.h[i5];
            this.C = i6;
            if (i5 < pjlVar3.i) {
                if (!pitVar.j(i6)) {
                    return false;
                }
                pjl pjlVar4 = this.A;
                pjr b4 = pjlVar4.b();
                if (b4 != null) {
                    pth pthVar = pjlVar4.b.p;
                    int i7 = b4.d;
                    if (i7 != 0) {
                        pthVar.H(i7);
                    }
                    if (pjlVar4.b.c(pjlVar4.f)) {
                        pthVar.H(pthVar.m() * 6);
                    }
                }
                if (!this.A.e()) {
                    this.A = null;
                }
                this.q = 3;
                return true;
            }
            if (pjlVar3.d.g == 1) {
                this.C = i6 - 8;
                if (!pitVar.j(8)) {
                    return false;
                }
            }
            if ("audio/ac4".equals(this.A.d.f.n)) {
                this.D = this.A.a(this.C, 7);
                bhs.b(this.C, this.l);
                this.A.a.t(this.l, 7);
                a = this.D + 7;
                this.D = a;
            } else {
                a = this.A.a(this.C, 0);
                this.D = a;
            }
            this.C += a;
            byte[] bArr = this.i.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            this.q = 4;
            this.E = 0;
        }
        pjl pjlVar5 = this.A;
        pjs pjsVar3 = pjlVar5.b;
        pjq pjqVar = pjlVar5.d;
        bjc bjcVar = pjlVar5.a;
        int i8 = pjlVar5.f;
        long a2 = pjsVar3.a(i8) * 1000;
        int i9 = pjqVar.j;
        if (i9 == 0) {
            while (true) {
                int i10 = this.D;
                int i11 = this.C;
                if (i10 >= i11) {
                    break;
                }
                int e2 = bjcVar.e(pitVar, i11 - i10, false);
                if (e2 == 0) {
                    return false;
                }
                this.D += e2;
            }
        } else {
            byte[] bArr2 = this.i.a;
            int i12 = i9 + 1;
            int i13 = 4 - i9;
            while (this.D < this.C) {
                int i14 = this.E;
                if (i14 == 0) {
                    if (!pitVar.i(bArr2, i13, i12)) {
                        return z;
                    }
                    this.i.G(z ? 1 : 0);
                    int d = this.i.d();
                    if (d > 0) {
                        this.E = d - 1;
                        this.h.G(z ? 1 : 0);
                        bjcVar.t(this.h, 4);
                        bjcVar.t(this.i, i2);
                        this.F = this.I.length > 0 && ptb.e(pjqVar.f.n, bArr2[4]);
                        this.D += 5;
                        this.C += i13;
                        i2 = 1;
                    } else {
                        throw pnr.a("Invalid NAL length", th);
                    }
                } else {
                    if (this.F) {
                        this.j.z(i14);
                        if (!pitVar.i(this.j.a, z ? 1 : 0, this.E)) {
                            return z;
                        }
                        this.j.G(z ? 1 : 0);
                        this.j.F(this.E);
                        bjcVar.t(this.j, this.E);
                        e = this.E;
                        pth pthVar2 = this.j;
                        int b5 = ptb.b(pthVar2.a, pthVar2.c);
                        this.j.G("video/hevc".equals(pjqVar.f.n) ? 1 : 0);
                        this.j.F(b5);
                        azd.b(a2, this.j, this.I);
                    } else {
                        e = bjcVar.e(pitVar, i14, false);
                        if (e == 0) {
                            return false;
                        }
                    }
                    this.D += e;
                    this.E -= e;
                    th = null;
                    i2 = 1;
                    z = false;
                }
            }
        }
        boolean z2 = pjsVar3.l[i8];
        pjr b6 = this.A.b();
        if (b6 != null) {
            int i15 = (z2 ? 1 : 0) | 1073741824;
            bjbVar = b6.c;
            i = i15;
        } else {
            i = z2 ? 1 : 0;
            bjbVar = null;
        }
        bjcVar.v(a2, i, this.C, 0, bjbVar);
        piv pivVar = this.a;
        if (pivVar != null) {
            pivVar.a(a2, (this.B * 1000000) / pjqVar.c);
        }
        while (!this.p.isEmpty()) {
            aeqp aeqpVar = (aeqp) this.p.removeFirst();
            this.w -= aeqpVar.b;
            long j3 = aeqpVar.a + a2;
            for (bjc bjcVar2 : this.H) {
                bjcVar2.v(j3, 1, aeqpVar.b, this.w, null);
            }
        }
        if (!this.A.e()) {
            this.A = null;
        }
        this.q = 3;
        return true;
    }

    private static final pjk p(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (pjk) sparseArray.valueAt(0);
        }
        pjk pjkVar = (pjk) sparseArray.get(i);
        pse.c(pjkVar);
        return pjkVar;
    }

    @Override // defpackage.piu
    public final void a(ByteBuffer byteBuffer, long j) {
        if (this.d == null) {
            this.d = new pir();
        }
        this.d.d(byteBuffer, j);
        while (!this.d.h()) {
            int i = this.q;
            long remaining = byteBuffer.remaining();
            try {
                int i2 = this.q;
                if (i2 == 0) {
                    n(this.d);
                } else if (i2 == 1) {
                    l(this.d);
                } else if (i2 == 2) {
                    m(this.d);
                } else {
                    o(this.d);
                }
                if (i == this.q && remaining == byteBuffer.remaining()) {
                    throw pnr.a("Extractor failed to make progress.", null);
                }
            } catch (IOException e) {
                throw pnr.a(null, e);
            }
        }
        this.d.c();
    }

    protected pjq b(pjq pjqVar) {
        return pjqVar;
    }

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        this.G = bikVar;
    }

    @Override // defpackage.bih
    public final void e() {
    }

    @Override // defpackage.bih
    public final void f(long j, long j2) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            ((pjl) this.g.valueAt(i)).d();
        }
        this.p.clear();
        this.w = 0;
        this.x = j2;
        this.o.clear();
        i();
        pir pirVar = this.d;
        if (pirVar != null) {
            pirVar.e();
        }
    }

    @Override // defpackage.bih
    public final boolean g(bii biiVar) {
        boolean z;
        int i;
        int[] iArr = pjp.a;
        bid bidVar = (bid) biiVar;
        long j = bidVar.b;
        long j2 = 4096;
        long j3 = -1;
        if (j != -1 && j <= 4096) {
            j2 = j;
        }
        int i2 = (int) j2;
        pth pthVar = new pth(64);
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < i2) {
            pthVar.C(8);
            biiVar.j(pthVar.a, i3, 8);
            long p = pthVar.p();
            int d = pthVar.d();
            if (p == 1) {
                biiVar.j(pthVar.a, 8, 8);
                pthVar.F(16);
                p = pthVar.o();
                i = 16;
            } else {
                if (p == 0) {
                    long j4 = bidVar.b;
                    p = j4 != j3 ? (j4 - biiVar.d()) + 8 : p;
                }
                i = 8;
            }
            long j5 = i;
            if (p < j5) {
                return false;
            }
            i4 += i;
            if (d == 1836019574) {
                i2 += (int) p;
                if (j != -1 && i2 > j) {
                    i2 = (int) j;
                }
                j3 = -1;
            } else {
                if (d == 1836019558 || d == 1836475768) {
                    z = true;
                    break;
                }
                if ((i4 + p) - j5 >= i2) {
                    break;
                }
                int i5 = (int) (p - j5);
                i4 += i5;
                if (d == 1718909296) {
                    if (i5 < 8) {
                        return false;
                    }
                    pthVar.C(i5);
                    biiVar.j(pthVar.a, 0, i5);
                    int i6 = i5 >> 2;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (i7 == 1) {
                            pthVar.H(4);
                        } else {
                            int d2 = pthVar.d();
                            if ((d2 >>> 8) != 3368816) {
                                int[] iArr2 = pjp.a;
                                for (int i8 = 0; i8 < 26; i8++) {
                                    if (iArr2[i8] != d2) {
                                    }
                                }
                            }
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2) {
                        return false;
                    }
                } else if (i5 != 0) {
                    biiVar.f(i5);
                }
                j3 = -1;
                i3 = 0;
            }
        }
        z = false;
        return z2 && z;
    }

    public pjm(List list) {
        this.f = Collections.unmodifiableList(list);
        this.m = new ppf();
        this.n = new pth(16);
        this.h = new pth(ptb.a);
        this.i = new pth(5);
        this.j = new pth();
        byte[] bArr = new byte[16];
        this.k = bArr;
        this.l = new pth(bArr);
        this.o = new ArrayDeque();
        this.p = new ArrayDeque();
        this.g = new SparseArray();
        this.y = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = -9223372036854775807L;
        i();
    }

    @Override // defpackage.bih
    public final int h(bii biiVar, tfq tfqVar) {
        if (this.e == null) {
            this.e = new pis();
        }
        this.e.a = biiVar;
        while (true) {
            int i = this.q;
            if (i != 0) {
                if (i == 1) {
                    l(this.e);
                } else if (i == 2) {
                    m(this.e);
                } else if (o(this.e)) {
                    return 0;
                }
            } else if (!n(this.e)) {
                return -1;
            }
        }
    }
}
