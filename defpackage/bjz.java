package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bjz implements bih {
    public static final Map c;
    private final pth A;
    private final pth B;
    private final pth C;
    private final pth D;
    private ByteBuffer E;
    private long F;
    private long G;
    private boolean H;
    private int I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f152J;
    private long K;
    private long L;
    private boolean M;
    private int N;
    private long O;
    private int P;
    private int Q;
    private int[] R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;
    private boolean aa;
    private int ab;
    private byte ac;
    private boolean ad;
    private bik ae;
    private final bjw af;
    public long d;
    public long e;
    public long f;
    public bjy g;
    public long h;
    public long i;
    public psw j;
    public psw k;
    public boolean l;
    public long m;
    public int n;
    public boolean o;
    private final bkb r;
    private final SparseArray s;
    private final boolean t;
    private final pth u;
    private final pth v;
    private final pth w;
    private final pth x;
    private final pth y;
    private final pth z;
    private static final byte[] p = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a = pts.Z("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] q = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final UUID b = new UUID(72057594037932032L, -9223371306706625679L);

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        c = Collections.unmodifiableMap(hashMap);
    }

    public bjz() {
        this(0);
    }

    private final int n() {
        int i = this.W;
        t();
        return i;
    }

    private final int o(bii biiVar, bjy bjyVar, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(bjyVar.b)) {
            u(biiVar, p, i);
            return n();
        }
        if ("S_TEXT/ASS".equals(bjyVar.b)) {
            u(biiVar, q, i);
            return n();
        }
        bjc bjcVar = bjyVar.W;
        if (!this.Y) {
            if (bjyVar.h) {
                this.U &= -1073741825;
                if (!this.Z) {
                    biiVar.k(this.w.a, 0, 1);
                    this.V++;
                    byte b2 = this.w.a[0];
                    if ((b2 & 128) == 128) {
                        throw pnr.a("Extension bit is set in signal byte", null);
                    }
                    this.ac = b2;
                    this.Z = true;
                }
                byte b3 = this.ac;
                if ((b3 & 1) == 1) {
                    int i3 = b3 & 2;
                    this.U |= 1073741824;
                    if (!this.ad) {
                        biiVar.k(this.B.a, 0, 8);
                        this.V += 8;
                        this.ad = true;
                        pth pthVar = this.w;
                        pthVar.a[0] = (byte) ((i3 != 2 ? 0 : 128) | 8);
                        pthVar.G(0);
                        bjcVar.u(this.w, 1, 1);
                        this.W++;
                        this.B.G(0);
                        bjcVar.u(this.B, 8, 1);
                        this.W += 8;
                    }
                    if (i3 == 2) {
                        if (!this.aa) {
                            biiVar.k(this.w.a, 0, 1);
                            this.V++;
                            this.w.G(0);
                            this.ab = this.w.i();
                            this.aa = true;
                        }
                        int i4 = this.ab * 4;
                        this.w.C(i4);
                        biiVar.k(this.w.a, 0, i4);
                        this.V += i4;
                        int i5 = (this.ab >> 1) + 1;
                        int i6 = (i5 * 6) + 2;
                        ByteBuffer byteBuffer = this.E;
                        if (byteBuffer == null || byteBuffer.capacity() < i6) {
                            this.E = ByteBuffer.allocate(i6);
                        }
                        this.E.putShort((short) i5);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            i2 = this.ab;
                            if (i7 >= i2) {
                                break;
                            }
                            int l = this.w.l();
                            if (i7 % 2 == 0) {
                                this.E.putShort((short) (l - i8));
                            } else {
                                this.E.putInt(l - i8);
                            }
                            i7++;
                            i8 = l;
                        }
                        int i9 = (i - this.V) - i8;
                        if ((i2 & 1) == 1) {
                            this.E.putInt(i9);
                        } else {
                            this.E.putShort((short) i9);
                            this.E.putInt(0);
                        }
                        this.C.E(this.E.array(), i6);
                        bjcVar.u(this.C, i6, 1);
                        this.W += i6;
                    }
                }
            } else {
                byte[] bArr = bjyVar.i;
                if (bArr != null) {
                    this.z.E(bArr, bArr.length);
                }
            }
            if (bjyVar.f > 0) {
                this.U |= 268435456;
                this.D.C(0);
                this.w.C(4);
                pth pthVar2 = this.w;
                byte[] bArr2 = pthVar2.a;
                bArr2[0] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
                bArr2[1] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
                bArr2[2] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
                bArr2[3] = (byte) (i & PrivateKeyType.INVALID);
                bjcVar.u(pthVar2, 4, 2);
                this.W += 4;
            }
            this.Y = true;
        }
        int i10 = i + this.z.c;
        if ("V_MPEG4/ISO/AVC".equals(bjyVar.b) || "V_MPEGH/ISO/HEVC".equals(bjyVar.b)) {
            byte[] bArr3 = this.v.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i11 = bjyVar.X;
            int i12 = 4 - i11;
            while (this.V < i10) {
                int i13 = this.X;
                if (i13 == 0) {
                    int min = Math.min(i11, this.z.a());
                    biiVar.k(bArr3, i12 + min, i11 - min);
                    if (min > 0) {
                        this.z.B(bArr3, i12, min);
                    }
                    this.V += i11;
                    this.v.G(0);
                    this.X = this.v.l();
                    this.u.G(0);
                    bjcVar.t(this.u, 4);
                    this.W += 4;
                } else {
                    int p2 = p(biiVar, bjcVar, i13);
                    this.V += p2;
                    this.W += p2;
                    this.X -= p2;
                }
            }
        } else {
            if (bjyVar.Y != null) {
                pse.g(this.z.c == 0);
                pjb pjbVar = bjyVar.Y;
                if (!pjbVar.b) {
                    biiVar.j(pjbVar.a, 0, 10);
                    biiVar.l();
                    if (bhr.b(pjbVar.a) != 0) {
                        pjbVar.b = true;
                    }
                }
            }
            while (true) {
                int i14 = this.V;
                if (i14 >= i10) {
                    break;
                }
                int p3 = p(biiVar, bjcVar, i10 - i14);
                this.V += p3;
                this.W += p3;
            }
        }
        if ("A_VORBIS".equals(bjyVar.b)) {
            this.x.G(0);
            bjcVar.t(this.x, 4);
            this.W += 4;
        }
        return n();
    }

    private final int p(bii biiVar, bjc bjcVar, int i) {
        int a2 = this.z.a();
        if (a2 > 0) {
            int min = Math.min(i, a2);
            bjcVar.t(this.z, min);
            return min;
        }
        return bjcVar.e(biiVar, i, false);
    }

    private final void q() {
        pse.d(this.ae);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd A[EDGE_INSN: B:51:0x00cd->B:50:0x00cd BREAK  A[LOOP:0: B:43:0x00ba->B:47:0x00ca], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r(defpackage.bjy r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjz.r(bjy, long, int, int, int):void");
    }

    private final void s(bii biiVar, int i) {
        pth pthVar = this.w;
        if (pthVar.c >= i) {
            return;
        }
        if (pthVar.b() < i) {
            pth pthVar2 = this.w;
            int b2 = pthVar2.b();
            pthVar2.z(Math.max(b2 + b2, i));
        }
        pth pthVar3 = this.w;
        byte[] bArr = pthVar3.a;
        int i2 = pthVar3.c;
        biiVar.k(bArr, i2, i - i2);
        this.w.F(i);
    }

    private final void t() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.aa = false;
        this.ab = 0;
        this.ac = (byte) 0;
        this.ad = false;
        this.z.C(0);
    }

    private final void u(bii biiVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = i + 32;
        if (this.A.b() < i2) {
            this.A.D(Arrays.copyOf(bArr, i2 + i));
        } else {
            System.arraycopy(bArr, 0, this.A.a, 0, 32);
        }
        biiVar.k(this.A.a, 32, i);
        this.A.G(0);
        this.A.F(i2);
    }

    private static byte[] v(long j, String str, long j2) {
        pse.e(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return pts.Z(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    private static int[] w(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public final long b(long j) {
        long j2 = this.e;
        if (j2 == -9223372036854775807L) {
            throw pnr.a("Can't scale timecode prior to timecodeScale being set.", null);
        }
        return pts.s(j, j2, 1000L);
    }

    public final bjy c(int i) {
        j(i);
        return this.g;
    }

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        this.ae = bikVar;
    }

    @Override // defpackage.bih
    public final void e() {
    }

    @Override // defpackage.bih
    public void f(long j, long j2) {
        this.i = -9223372036854775807L;
        this.N = 0;
        bjw bjwVar = this.af;
        bjwVar.d = 0;
        bjwVar.b.clear();
        bjwVar.c.d();
        this.r.d();
        t();
        for (int i = 0; i < this.s.size(); i++) {
            pjb pjbVar = ((bjy) this.s.valueAt(i)).Y;
            if (pjbVar != null) {
                pjbVar.b = false;
                pjbVar.c = 0;
            }
        }
    }

    @Override // defpackage.bih
    public final boolean g(bii biiVar) {
        bka bkaVar = new bka();
        long j = ((bid) biiVar).b;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        biiVar.j(bkaVar.a.a, 0, 4);
        long p2 = bkaVar.a.p();
        bkaVar.b = 4;
        while (true) {
            if (p2 != 440786851) {
                int i2 = bkaVar.b + 1;
                bkaVar.b = i2;
                if (i2 == i) {
                    break;
                }
                biiVar.j(bkaVar.a.a, 0, 1);
                p2 = ((p2 << 8) & (-256)) | (bkaVar.a.a[0] & 255);
            } else {
                long a2 = bkaVar.a(biiVar);
                long j3 = bkaVar.b;
                if (a2 != Long.MIN_VALUE && (j == -1 || j3 + a2 < j)) {
                    while (true) {
                        long j4 = bkaVar.b;
                        long j5 = j3 + a2;
                        if (j4 < j5) {
                            if (bkaVar.a(biiVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long a3 = bkaVar.a(biiVar);
                            if (a3 < 0) {
                                break;
                            }
                            if (a3 != 0) {
                                int i3 = (int) a3;
                                biiVar.f(i3);
                                bkaVar.b += i3;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03ff, code lost:
    
        throw defpackage.pnr.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x00bc, code lost:
    
        if (r5 == 1) goto L41;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:260:0x0517. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v42, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r30v0, types: [bii] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, byte, boolean] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65, types: [int] */
    /* JADX WARN: Type inference failed for: r3v66, types: [int] */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r5v74, types: [bkb] */
    /* JADX WARN: Type inference failed for: r5v75, types: [bkb] */
    /* JADX WARN: Type inference failed for: r6v22, types: [bkb] */
    /* JADX WARN: Type inference failed for: r6v26, types: [pth] */
    /* JADX WARN: Type inference failed for: r6v47, types: [pth] */
    @Override // defpackage.bih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.bii r30, defpackage.tfq r31) {
        /*
            Method dump skipped, instructions count: 2224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjz.h(bii, tfq):int");
    }

    public final void i(int i) {
        if (this.j == null || this.k == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw pnr.a(sb.toString(), null);
        }
    }

    public final void j(int i) {
        if (this.g != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw pnr.a(sb.toString(), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:105:0x0485. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:114:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(int r21) {
        /*
            Method dump skipped, instructions count: 2750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjz.k(int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(int i, long j, long j2) {
        q();
        if (i == 160) {
            this.o = false;
            return;
        }
        if (i == 174) {
            this.g = new bjy();
            return;
        }
        if (i == 187) {
            this.l = false;
            return;
        }
        if (i == 19899) {
            this.I = -1;
            this.h = -1L;
            return;
        }
        if (i == 20533) {
            c(i).h = true;
            return;
        }
        if (i == 21968) {
            c(i).x = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.d;
            if (j3 != -1 && j3 != j) {
                throw pnr.a("Multiple Segment elements not supported", null);
            }
            this.d = j;
            this.F = j2;
            return;
        }
        if (i == 475249515) {
            this.j = new psw();
            this.k = new psw();
        } else if (i == 524531317 && !this.H) {
            if (this.t && this.K != -1) {
                this.f152J = true;
            } else {
                this.ae.w(new biy(this.G));
                this.H = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(int i, String str) {
        if (i == 134) {
            c(i).b = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                c(i).a = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                c(i).V = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw pnr.a(sb.toString(), null);
    }

    public bjz(int i) {
        bjw bjwVar = new bjw();
        this.d = -1L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.G = -9223372036854775807L;
        this.K = -1L;
        this.L = -1L;
        this.i = -9223372036854775807L;
        this.af = bjwVar;
        bjwVar.g = new bjx(this);
        this.t = 1 == (i ^ 1);
        this.r = new bkb();
        this.s = new SparseArray();
        this.w = new pth(4);
        this.x = new pth(ByteBuffer.allocate(4).putInt(-1).array());
        this.y = new pth(4);
        this.u = new pth(ptb.a);
        this.v = new pth(4);
        this.z = new pth();
        this.A = new pth();
        this.B = new pth(8);
        this.C = new pth();
        this.D = new pth();
        this.R = new int[1];
    }
}
