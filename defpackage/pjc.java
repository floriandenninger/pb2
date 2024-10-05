package defpackage;

import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pjc implements piu {
    public int A;
    public int B;
    public long C;
    public long D;
    public int E;
    public int F;
    public int[] G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f267J;
    public int K;
    public boolean L;
    public bik M;
    private final piy P;
    private pis Q;
    private pir R;
    private final pth S;
    private final pth T;
    private final pth U;
    private final pth V;
    private final pth W;
    private final pth X;
    private final pth Y;
    private ByteBuffer Z;
    private long aa;
    private boolean ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private int aj;
    private byte ak;
    private boolean al;
    public final pje c;
    public final SparseArray d;
    public final boolean e;
    public piv f;
    public final pth g;
    public final pth h;
    public final pth i;
    public byte[] j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public pja p;
    public boolean q;
    public int r;
    public long s;
    public boolean t;
    public long u;
    public long v;
    public psw w;
    public psw x;
    public boolean y;
    public int z;
    private static final byte[] N = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a = pts.Z("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] O = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final UUID b = new UUID(72057594037932032L, -9223371306706625679L);

    public pjc() {
        this(0);
    }

    public static int[] l(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    private final int m() {
        int i = this.ae;
        o();
        return i;
    }

    private final int n(pit pitVar, bjc bjcVar, int i) {
        int a2 = this.V.a();
        if (a2 > 0) {
            int min = Math.min(i, a2);
            bjcVar.t(this.V, min);
            return min;
        }
        return bjcVar.e(pitVar, i, false);
    }

    private final void o() {
        this.ad = 0;
        this.ae = 0;
        this.af = 0;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = 0;
        this.ak = (byte) 0;
        this.al = false;
        this.V.C(0);
        byte[] bArr = this.T.a;
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
    }

    private final boolean p(pit pitVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = i + 32;
        if (this.W.b() < i2) {
            this.W.D(Arrays.copyOf(bArr, i2 + i));
        } else {
            System.arraycopy(bArr, 0, this.W.a, 0, 32);
        }
        if (!pitVar.i(this.W.a, 32, i)) {
            return false;
        }
        this.W.G(0);
        this.W.F(i2);
        return true;
    }

    private static byte[] q(long j, String str, long j2) {
        pse.e(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return pts.Z(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    @Override // defpackage.piu
    public final void a(ByteBuffer byteBuffer, long j) {
        if (this.R == null) {
            this.R = new pir();
        }
        this.R.d(byteBuffer, j);
        while (!this.R.h()) {
            long remaining = byteBuffer.remaining();
            this.ab = false;
            while (true) {
                if (this.ab) {
                    break;
                }
                try {
                    if (!this.P.a(this.R)) {
                        for (int i = 0; i < this.d.size(); i++) {
                            ((pja) this.d.valueAt(i)).c();
                        }
                    }
                } catch (IOException e) {
                    throw pnr.a(null, e);
                }
            }
            if (remaining == byteBuffer.remaining()) {
                throw pnr.a("Extractor failed to make progress.", null);
            }
        }
        this.R.c();
    }

    public final int b(pit pitVar, pja pjaVar, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(pjaVar.b)) {
            if (p(pitVar, N, i)) {
                return m();
            }
            return -6;
        }
        if ("S_TEXT/ASS".equals(pjaVar.b)) {
            if (p(pitVar, O, i)) {
                return m();
            }
            return -6;
        }
        bjc bjcVar = pjaVar.V;
        if (!this.ag) {
            if (pjaVar.g) {
                this.f267J &= -1073741825;
                if (!this.ah) {
                    if (!pitVar.i(this.g.a, 0, 1)) {
                        return -6;
                    }
                    this.ad++;
                    byte b2 = this.g.a[0];
                    if ((b2 & 128) == 128) {
                        throw pnr.a("Extension bit is set in signal byte", null);
                    }
                    this.ak = b2;
                    this.ah = true;
                }
                byte b3 = this.ak;
                if ((b3 & 1) == 1) {
                    int i3 = b3 & 2;
                    this.f267J |= 1073741824;
                    if (!this.al) {
                        if (!pitVar.i(this.X.a, 0, 8)) {
                            return -6;
                        }
                        this.ad += 8;
                        this.al = true;
                        pth pthVar = this.g;
                        pthVar.a[0] = (byte) ((i3 != 2 ? 0 : 128) | 8);
                        pthVar.G(0);
                        bjcVar.t(this.g, 1);
                        this.ae++;
                        this.X.G(0);
                        bjcVar.t(this.X, 8);
                        this.ae += 8;
                    }
                    if (i3 == 2) {
                        if (!this.ai) {
                            if (!pitVar.i(this.g.a, 0, 1)) {
                                return -6;
                            }
                            this.ad++;
                            this.g.G(0);
                            this.aj = this.g.i();
                            this.ai = true;
                        }
                        int i4 = this.aj * 4;
                        this.g.z(i4);
                        if (!pitVar.i(this.g.a, 0, i4)) {
                            return -6;
                        }
                        this.g.G(0);
                        this.g.F(i4);
                        this.ad += i4;
                        int i5 = (this.aj >> 1) + 1;
                        int i6 = (i5 * 6) + 2;
                        ByteBuffer byteBuffer = this.Z;
                        if (byteBuffer == null || byteBuffer.capacity() < i6) {
                            this.Z = ByteBuffer.allocate(i6);
                        }
                        this.Z.putShort((short) i5);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            i2 = this.aj;
                            if (i7 >= i2) {
                                break;
                            }
                            int l = this.g.l();
                            if (i7 % 2 == 0) {
                                this.Z.putShort((short) (l - i8));
                            } else {
                                this.Z.putInt(l - i8);
                            }
                            i7++;
                            i8 = l;
                        }
                        int i9 = (i - this.ad) - i8;
                        if ((i2 & 1) == 1) {
                            this.Z.putInt(i9);
                        } else {
                            this.Z.putShort((short) i9);
                            this.Z.putInt(0);
                        }
                        this.Y.E(this.Z.array(), i6);
                        bjcVar.t(this.Y, i6);
                        this.ae += i6;
                    }
                }
            } else {
                byte[] bArr = pjaVar.h;
                if (bArr != null) {
                    this.V.E(bArr, bArr.length);
                }
            }
            if (pjaVar.f > 0) {
                this.f267J |= 268435456;
                this.i.C(0);
                this.g.C(4);
                pth pthVar2 = this.g;
                byte[] bArr2 = pthVar2.a;
                bArr2[0] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
                bArr2[1] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
                bArr2[2] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
                bArr2[3] = (byte) (i & PrivateKeyType.INVALID);
                bjcVar.t(pthVar2, 4);
                this.ae += 4;
            }
            this.ag = true;
        }
        int i10 = i + this.V.c;
        if ("V_MPEG4/ISO/AVC".equals(pjaVar.b) || "V_MPEGH/ISO/HEVC".equals(pjaVar.b)) {
            byte[] bArr3 = this.T.a;
            int i11 = pjaVar.W;
            int i12 = 4 - i11;
            while (this.ad < i10) {
                int i13 = this.af;
                if (i13 == 0) {
                    int min = Math.min(i11, this.V.a());
                    if (!pitVar.i(bArr3, i12 + min, i11 - min)) {
                        return -6;
                    }
                    if (min > 0) {
                        this.V.B(bArr3, i12, min);
                    }
                    this.ad += i11;
                    this.T.G(0);
                    this.af = this.T.l();
                    this.S.G(0);
                    bjcVar.t(this.S, 4);
                    this.ae += 4;
                } else {
                    int n = n(pitVar, bjcVar, i13);
                    if (n == 0) {
                        return -6;
                    }
                    this.ad += n;
                    this.ae += n;
                    this.af -= n;
                }
            }
        } else {
            if (pjaVar.R != null) {
                pse.g(this.V.c == 0);
                pjb pjbVar = pjaVar.R;
                if (!pjbVar.b) {
                    if (!pitVar.k(pjbVar.a, 10)) {
                        return -6;
                    }
                    pitVar.f();
                    if (bhr.b(pjbVar.a) != 0) {
                        pjbVar.b = true;
                    }
                }
            }
            while (true) {
                int i14 = this.ad;
                if (i14 >= i10) {
                    break;
                }
                int n2 = n(pitVar, bjcVar, i10 - i14);
                if (n2 == 0) {
                    return -6;
                }
                this.ad += n2;
                this.ae += n2;
            }
        }
        if ("A_VORBIS".equals(pjaVar.b)) {
            this.U.G(0);
            bjcVar.t(this.U, 4);
            this.ae += 4;
        }
        return m();
    }

    public final long c(long j) {
        long j2 = this.m;
        if (j2 == -9223372036854775807L) {
            throw pnr.a("Can't scale timecode prior to timecodeScale being set.", null);
        }
        return pts.s(j, j2, 1000L);
    }

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        this.M = bikVar;
    }

    @Override // defpackage.bih
    public final void e() {
    }

    @Override // defpackage.bih
    public final void f(long j, long j2) {
        this.v = -9223372036854775807L;
        this.B = 0;
        this.z = 0;
        this.A = 0;
        this.ac = 0;
        piw piwVar = (piw) this.P;
        piwVar.d = 0;
        piwVar.a.clear();
        piwVar.b.d();
        this.c.d();
        o();
        for (int i = 0; i < this.d.size(); i++) {
            pjb pjbVar = ((pja) this.d.valueAt(i)).R;
            if (pjbVar != null) {
                pjbVar.b = false;
                pjbVar.c = 0;
            }
        }
        pir pirVar = this.R;
        if (pirVar != null) {
            pirVar.e();
        }
    }

    @Override // defpackage.bih
    public final boolean g(bii biiVar) {
        pjd pjdVar = new pjd();
        long j = ((bid) biiVar).b;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        biiVar.j(pjdVar.a.a, 0, 4);
        long p = pjdVar.a.p();
        pjdVar.b = 4;
        while (true) {
            if (p != 440786851) {
                int i2 = pjdVar.b + 1;
                pjdVar.b = i2;
                if (i2 == i) {
                    break;
                }
                biiVar.j(pjdVar.a.a, 0, 1);
                p = ((p << 8) & (-256)) | (pjdVar.a.a[0] & 255);
            } else {
                long a2 = pjdVar.a(biiVar);
                long j3 = pjdVar.b;
                if (a2 != Long.MIN_VALUE && (j == -1 || j3 + a2 < j)) {
                    while (true) {
                        long j4 = pjdVar.b;
                        long j5 = j3 + a2;
                        if (j4 < j5) {
                            if (pjdVar.a(biiVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long a3 = pjdVar.a(biiVar);
                            if (a3 < 0) {
                                break;
                            }
                            if (a3 != 0) {
                                int i3 = (int) a3;
                                biiVar.f(i3);
                                pjdVar.b += i3;
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

    @Override // defpackage.bih
    public final int h(bii biiVar, tfq tfqVar) {
        if (this.Q == null) {
            this.Q = new pis();
        }
        this.Q.a = biiVar;
        this.ab = false;
        while (!this.ab) {
            if (this.P.a(this.Q)) {
                long b2 = this.Q.b();
                if (this.t) {
                    this.aa = b2;
                    tfqVar.a = this.u;
                    this.t = false;
                    return 1;
                }
                if (this.q) {
                    long j = this.aa;
                    if (j != -1) {
                        tfqVar.a = j;
                        this.aa = -1L;
                        return 1;
                    }
                }
            } else {
                for (int i = 0; i < this.d.size(); i++) {
                    ((pja) this.d.valueAt(i)).c();
                }
                return -1;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.pja r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjc.i(pja, long, int, int, int):void");
    }

    public final boolean j(pit pitVar, int i) {
        if (this.ac == 0) {
            this.j = new byte[i];
            this.ac = 1;
        }
        if (!pitVar.i(this.j, 0, i)) {
            return false;
        }
        this.ac = 0;
        return true;
    }

    public final boolean k(pit pitVar, int i) {
        pth pthVar = this.g;
        if (pthVar.c >= i) {
            return true;
        }
        if (pthVar.b() < i) {
            pth pthVar2 = this.g;
            byte[] bArr = pthVar2.a;
            int length = bArr.length;
            pthVar2.E(Arrays.copyOf(bArr, Math.max(length + length, i)), this.g.c);
        }
        pth pthVar3 = this.g;
        byte[] bArr2 = pthVar3.a;
        int i2 = pthVar3.c;
        if (!pitVar.i(bArr2, i2, i - i2)) {
            return false;
        }
        this.g.F(i);
        return true;
    }

    public pjc(int i) {
        piw piwVar = new piw();
        this.l = -1L;
        this.m = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.o = -9223372036854775807L;
        this.u = -1L;
        this.aa = -1L;
        this.v = -9223372036854775807L;
        this.P = piwVar;
        piwVar.c = new piz(this);
        this.e = 1 == (i ^ 1);
        this.c = new pje();
        this.d = new SparseArray();
        this.g = new pth(4);
        this.U = new pth(ByteBuffer.allocate(4).putInt(-1).array());
        this.h = new pth(4);
        this.S = new pth(ptb.a);
        this.T = new pth(4);
        this.V = new pth();
        this.W = new pth();
        this.X = new pth(8);
        this.Y = new pth();
        this.i = new pth();
        this.G = new int[1];
        this.j = pts.f;
    }
}
