package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.exoplayer.video.DummySurface;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bgt extends bac {
    private static final int[] b = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean c;
    private static boolean q;
    private boolean A;
    private boolean B;
    private DummySurface C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private long I;

    /* renamed from: J, reason: collision with root package name */
    private long f150J;
    private long K;
    private int L;
    private int M;
    private int N;
    private long O;
    private long P;
    private long Q;
    private int R;
    private int S;
    private int T;
    private float U;
    private aso V;
    private int W;
    private bgw X;
    private dkb Y;
    public Surface a;
    private final Context u;
    private final bhd v;
    private final bhm w;
    private final long x;
    private final int y;
    private final boolean z;

    public bgt(Context context, azx azxVar, bae baeVar, long j, Handler handler, bhn bhnVar, int i) {
        super(2, azxVar, baeVar, 30.0f);
        this.x = j;
        this.y = i;
        Context applicationContext = context.getApplicationContext();
        this.u = applicationContext;
        this.v = new bhd(applicationContext);
        this.w = new bhm(handler, bhnVar);
        this.z = "NVIDIA".equals(pts.c);
        this.f150J = -9223372036854775807L;
        this.S = -1;
        this.T = -1;
        this.U = -1.0f;
        this.E = 1;
        this.W = 0;
        aF();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int aC(baa baaVar, pms pmsVar) {
        char c2;
        int i;
        int intValue;
        int i2 = pmsVar.s;
        int i3 = pmsVar.t;
        if (i2 == -1 || i3 == -1) {
            return -1;
        }
        String str = pmsVar.n;
        int i4 = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair a = bao.a(pmsVar);
            str = (a == null || !((intValue = ((Integer) a.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0 && c2 != 1) {
            if (c2 != 2) {
                if (c2 != 3) {
                    if (c2 != 4 && c2 != 5) {
                        return -1;
                    }
                    i = i2 * i3;
                    i4 = 4;
                }
            } else {
                if ("BRAVIA 4K 2015".equals(pts.d) || ("Amazon".equals(pts.c) && ("KFSOWI".equals(pts.d) || ("AFTS".equals(pts.d) && baaVar.f)))) {
                    return -1;
                }
                i = pts.b(i2, 16) * pts.b(i3, 16) * 256;
            }
            return (i * 3) / (i4 + i4);
        }
        i = i2 * i3;
        return (i * 3) / (i4 + i4);
    }

    private static List aD(bae baeVar, pms pmsVar, boolean z, boolean z2) {
        Pair a;
        String str = pmsVar.n;
        if (str == null) {
            return Collections.emptyList();
        }
        List d = bao.d(baeVar.a(str, z, z2), pmsVar);
        if ("video/dolby-vision".equals(str) && (a = bao.a(pmsVar)) != null) {
            int intValue = ((Integer) a.first).intValue();
            if (intValue == 16 || intValue == 256) {
                d.addAll(baeVar.a("video/hevc", z, z2));
            } else if (intValue == 512) {
                d.addAll(baeVar.a("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(d);
    }

    private final void aE() {
        this.F = false;
        int i = pts.a;
    }

    private final void aF() {
        this.V = null;
    }

    private final void aG() {
        if (this.L > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.w.d(this.L, elapsedRealtime - this.K);
            this.L = 0;
            this.K = elapsedRealtime;
        }
    }

    private final void aH() {
        aso asoVar = this.V;
        if (asoVar != null) {
            this.w.i(asoVar);
        }
    }

    private final void aI(long j, long j2, pms pmsVar) {
        bgw bgwVar = this.X;
        if (bgwVar != null) {
            bgwVar.a(j, j2, pmsVar, ((bac) this).g);
        }
    }

    private final void aJ() {
        this.f150J = this.x > 0 ? SystemClock.elapsedRealtime() + this.x : -9223372036854775807L;
    }

    private static boolean aK(long j) {
        return j < -30000;
    }

    private final boolean aL(baa baaVar) {
        return pts.a >= 23 && !V(baaVar.a) && (!baaVar.f || DummySurface.b(this.u));
    }

    protected static int f(baa baaVar, pms pmsVar) {
        if (pmsVar.o != -1) {
            int size = pmsVar.p.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) pmsVar.p.get(i2)).length;
            }
            return pmsVar.o + i;
        }
        return aC(baaVar, pmsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac
    public void A(asw aswVar) {
        this.N++;
        int i = pts.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac, defpackage.ple
    public final void B() {
        try {
            super.B();
        } finally {
            DummySurface dummySurface = this.C;
            if (dummySurface != null) {
                if (this.a == dummySurface) {
                    this.a = null;
                }
                dummySurface.release();
                this.C = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r13.c[defpackage.bgq.a(r11 - 1)] == false) goto L23;
     */
    @Override // defpackage.bac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D(long r28, long r30, defpackage.azy r32, java.nio.ByteBuffer r33, int r34, int r35, int r36, long r37, boolean r39, boolean r40, defpackage.pms r41) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgt.D(long, long, azy, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, pms):boolean");
    }

    @Override // defpackage.bac
    protected final azz G(Throwable th, baa baaVar) {
        return new bgs(th, baaVar, this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac
    public void H(asw aswVar) {
        if (this.B) {
            ByteBuffer byteBuffer = aswVar.e;
            pse.c(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    azy azyVar = ((bac) this).e;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    azyVar.k(bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac
    public void J(long j) {
        super.J(j);
        this.N--;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac
    public final void M() {
        super.M();
        this.N = 0;
    }

    @Override // defpackage.bac, defpackage.ple, defpackage.poe
    public final void O(float f, float f2) {
        super.O(f, f2);
        bhd bhdVar = this.v;
        bhdVar.g = f;
        bhdVar.b();
        bhdVar.d(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac
    public boolean Q(baa baaVar) {
        return this.a != null || aL(baaVar);
    }

    protected final void U(long j) {
        auj aujVar = this.o;
        aujVar.j += j;
        aujVar.k++;
        this.Q += j;
        this.R++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0355, code lost:
    
        if (r1.equals("602LV") != false) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0751, code lost:
    
        if (r7 != 2) goto L491;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean V(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 2782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgt.V(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean W(long j, boolean z) {
        int ag = ag(j);
        if (ag == 0) {
            return false;
        }
        auj aujVar = this.o;
        aujVar.i++;
        int i = this.N + ag;
        if (z) {
            aujVar.f += i;
        } else {
            q(i);
        }
        T();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean X(long j, long j2, boolean z) {
        return j < -500000 && !z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean Y(long j, long j2, boolean z) {
        return aK(j) && !z;
    }

    protected boolean Z(long j, long j2) {
        return aK(j) && j2 > 100000;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void aa(defpackage.azy r5, int r6, long r7) {
        /*
            r4 = this;
            int r0 = r4.S
            r1 = -1
            if (r0 != r1) goto La
            int r0 = r4.T
            if (r0 == r1) goto L30
            r0 = -1
        La:
            aso r1 = r4.V
            if (r1 == 0) goto L20
            int r2 = r1.a
            if (r2 != r0) goto L20
            int r2 = r1.b
            int r3 = r4.T
            if (r2 != r3) goto L20
            float r1 = r1.d
            float r2 = r4.U
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L30
        L20:
            aso r1 = new aso
            int r2 = r4.T
            float r3 = r4.U
            r1.<init>(r0, r2, r3)
            r4.V = r1
            bhm r0 = r4.w
            r0.i(r1)
        L30:
            int r0 = defpackage.pts.a
            r5.i(r6, r7)
            long r5 = android.os.SystemClock.elapsedRealtime()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            r4.P = r5
            auj r5 = r4.o
            int r6 = r5.e
            r7 = 1
            int r6 = r6 + r7
            r5.e = r6
            r5 = 0
            r4.M = r5
            r4.H = r7
            boolean r5 = r4.F
            if (r5 != 0) goto L5b
            r4.F = r7
            bhm r5 = r4.w
            android.view.Surface r6 = r4.a
            r5.g(r6)
            r4.D = r7
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgt.aa(azy, int, long):void");
    }

    protected final void ab(azy azyVar, int i) {
        int i2 = pts.a;
        azyVar.p(i);
        this.o.f++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dkb ac(baa baaVar, pms pmsVar, pms[] pmsVarArr) {
        Point point;
        int i;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int aC;
        pms pmsVar2 = pmsVar;
        int i2 = pmsVar2.s;
        int i3 = pmsVar2.t;
        int f = f(baaVar, pmsVar);
        int length = pmsVarArr.length;
        if (length != 1) {
            int i4 = 0;
            boolean z = false;
            for (int i5 = 0; i5 < length; i5++) {
                pms pmsVar3 = pmsVarArr[i5];
                if (pmsVar2.z != null && pmsVar3.z == null) {
                    pmr b2 = pmsVar3.b();
                    b2.w = pmsVar2.z;
                    pmsVar3 = b2.a();
                }
                if (baaVar.b(pmsVar2, pmsVar3).d != 0) {
                    int i6 = pmsVar3.s;
                    z |= i6 == -1 || pmsVar3.t == -1;
                    i2 = Math.max(i2, i6);
                    i3 = Math.max(i3, pmsVar3.t);
                    f = Math.max(f, f(baaVar, pmsVar3));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i2);
                sb.append("x");
                sb.append(i3);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                int i7 = pmsVar2.t;
                int i8 = pmsVar2.s;
                int i9 = i7 > i8 ? i7 : i8;
                int i10 = i7 <= i8 ? i7 : i8;
                float f2 = i10 / i9;
                int[] iArr = b;
                while (i4 < 9) {
                    int i11 = iArr[i4];
                    int i12 = (int) (i11 * f2);
                    if (i11 <= i9 || i12 <= i10) {
                        break;
                    }
                    if (i7 <= i8) {
                        i = i12;
                        i12 = i11;
                    } else {
                        i = i12;
                    }
                    if (i7 <= i8) {
                        i11 = i;
                    }
                    int i13 = pts.a;
                    int i14 = i7;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = baaVar.d;
                    point = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? null : baa.a(videoCapabilities, i12, i11);
                    int i15 = i8;
                    if (baaVar.e(point.x, point.y, pmsVar2.u)) {
                        break;
                    }
                    i4++;
                    pmsVar2 = pmsVar;
                    i8 = i15;
                    i7 = i14;
                }
                point = null;
                if (point != null) {
                    i2 = Math.max(i2, point.x);
                    i3 = Math.max(i3, point.y);
                    pmr b3 = pmsVar.b();
                    b3.p = i2;
                    b3.q = i3;
                    f = Math.max(f, aC(baaVar, b3.a()));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i2);
                    sb2.append("x");
                    sb2.append(i3);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            return new dkb(i2, i3, f, null);
        }
        if (f != -1 && (aC = aC(baaVar, pmsVar)) != -1) {
            f = Math.min((int) (f * 1.5f), aC);
        }
        return new dkb(i2, i3, f, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac
    public float b(float f, pms pmsVar, pms[] pmsVarArr) {
        float f2 = -1.0f;
        for (pms pmsVar2 : pmsVarArr) {
            float f3 = pmsVar2.u;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // defpackage.bac
    protected final int c(bae baeVar, pms pmsVar) {
        int i = 0;
        if (!psz.l(pmsVar.n)) {
            return 0;
        }
        boolean z = pmsVar.q != null;
        List aD = aD(baeVar, pmsVar, z, false);
        if (z && aD.isEmpty()) {
            aD = aD(baeVar, pmsVar, false, false);
        }
        if (aD.isEmpty()) {
            return 1;
        }
        if (!R(pmsVar)) {
            return 2;
        }
        baa baaVar = (baa) aD.get(0);
        boolean c2 = baaVar.c(pmsVar);
        int i2 = true != baaVar.d(pmsVar) ? 8 : 16;
        if (c2) {
            List aD2 = aD(baeVar, pmsVar, z, true);
            if (!aD2.isEmpty()) {
                baa baaVar2 = (baa) aD2.get(0);
                if (baaVar2.c(pmsVar) && baaVar2.d(pmsVar)) {
                    i = 32;
                }
            }
        }
        return (true != c2 ? 3 : 4) | i2 | i;
    }

    @Override // defpackage.poe, defpackage.pof
    public final String d() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac
    public auk e(baa baaVar, pms pmsVar, pms pmsVar2) {
        int i;
        int i2;
        auk b2 = baaVar.b(pmsVar, pmsVar2);
        int i3 = b2.e;
        int i4 = pmsVar2.s;
        dkb dkbVar = this.Y;
        if (i4 > dkbVar.c || pmsVar2.t > dkbVar.a) {
            i3 |= 256;
        }
        if (f(baaVar, pmsVar2) > this.Y.b) {
            i3 |= 64;
        }
        String str = baaVar.a;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = b2.d;
            i2 = 0;
        }
        return new auk(str, pmsVar, pmsVar2, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac
    public final auk g(pmt pmtVar) {
        auk g = super.g(pmtVar);
        this.w.f(pmtVar.b, g);
        return g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(azy azyVar, Surface surface) {
        azyVar.j(surface);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac, defpackage.ple
    public final void k() {
        aF();
        aE();
        this.D = false;
        bhd bhdVar = this.v;
        bgz bgzVar = bhdVar.b;
        if (bgzVar != null) {
            bgzVar.a();
            bhc bhcVar = bhdVar.c;
            pse.c(bhcVar);
            bhcVar.c.sendEmptyMessage(2);
        }
        try {
            super.k();
        } finally {
            this.w.c(this.o);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac, defpackage.ple
    public void l(boolean z, boolean z2) {
        super.l(z, z2);
        aB();
        pse.g(true);
        this.w.e(this.o);
        bhd bhdVar = this.v;
        if (bhdVar.b != null) {
            bhc bhcVar = bhdVar.c;
            pse.c(bhcVar);
            bhcVar.c.sendEmptyMessage(1);
            bhdVar.b.b(new bgx(bhdVar));
        }
        this.G = z2;
        this.H = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac, defpackage.ple
    public void m(long j, boolean z) {
        super.m(j, z);
        aE();
        this.v.b();
        this.O = -9223372036854775807L;
        this.I = -9223372036854775807L;
        this.M = 0;
        if (z) {
            aJ();
        } else {
            this.f150J = -9223372036854775807L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ple
    public void n() {
        this.L = 0;
        this.K = SystemClock.elapsedRealtime();
        this.P = SystemClock.elapsedRealtime() * 1000;
        this.Q = 0L;
        this.R = 0;
        bhd bhdVar = this.v;
        bhdVar.d = true;
        bhdVar.b();
        bhdVar.d(false);
    }

    @Override // defpackage.ple
    protected final void o() {
        this.f150J = -9223372036854775807L;
        aG();
        int i = this.R;
        if (i != 0) {
            bhm bhmVar = this.w;
            long j = this.Q;
            Handler handler = bhmVar.a;
            if (handler != null) {
                handler.post(new bhe(bhmVar, j, i, 0));
            }
            this.Q = 0L;
            this.R = 0;
        }
        bhd bhdVar = this.v;
        bhdVar.d = false;
        bhdVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(int i) {
        auj aujVar = this.o;
        aujVar.g += i;
        this.L += i;
        int i2 = this.M + i;
        this.M = i2;
        aujVar.h = Math.max(i2, aujVar.h);
        int i3 = this.y;
        if (i3 <= 0 || this.L < i3) {
            return;
        }
        aG();
    }

    @Override // defpackage.bac, defpackage.poe
    public boolean s() {
        DummySurface dummySurface;
        if (super.s() && (this.F || (((dummySurface = this.C) != null && this.a == dummySurface) || ((bac) this).e == null))) {
            this.f150J = -9223372036854775807L;
            return true;
        }
        if (this.f150J == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f150J) {
            return true;
        }
        this.f150J = -9223372036854775807L;
        return false;
    }

    @Override // defpackage.bac
    protected final azw t(baa baaVar, pms pmsVar, MediaCrypto mediaCrypto, float f) {
        Pair a;
        DummySurface dummySurface = this.C;
        if (dummySurface != null && dummySurface.a != baaVar.f) {
            dummySurface.release();
            this.C = null;
        }
        String str = baaVar.c;
        dkb ac = ac(baaVar, pmsVar, aA());
        this.Y = ac;
        boolean z = this.z;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", pmsVar.s);
        mediaFormat.setInteger("height", pmsVar.t);
        prh.i(mediaFormat, pmsVar.p);
        float f2 = pmsVar.u;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        prh.h(mediaFormat, "rotation-degrees", pmsVar.v);
        asf asfVar = pmsVar.z;
        if (asfVar != null) {
            prh.h(mediaFormat, "color-transfer", asfVar.d);
            prh.h(mediaFormat, "color-standard", asfVar.b);
            prh.h(mediaFormat, "color-range", asfVar.c);
            byte[] bArr = asfVar.e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(pmsVar.n) && (a = bao.a(pmsVar)) != null) {
            prh.h(mediaFormat, "profile", ((Integer) a.first).intValue());
        }
        mediaFormat.setInteger("max-width", ac.c);
        mediaFormat.setInteger("max-height", ac.a);
        prh.h(mediaFormat, "max-input-size", ac.b);
        if (pts.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.a == null) {
            if (aL(baaVar)) {
                if (this.C == null) {
                    this.C = DummySurface.a(this.u, baaVar.f);
                }
                this.a = this.C;
            } else {
                throw new IllegalStateException();
            }
        }
        return azw.a(baaVar, mediaFormat, pmsVar, this.a, mediaCrypto);
    }

    @Override // defpackage.bac
    protected final List u(bae baeVar, pms pmsVar, boolean z) {
        return aD(baeVar, pmsVar, z, false);
    }

    @Override // defpackage.bac
    protected final void v(Exception exc) {
        prh.j("MediaCodecVideoRenderer", "Video codec error", exc);
        this.w.h(exc);
    }

    @Override // defpackage.bac
    protected final void w(String str, long j, long j2) {
        this.w.a(str, j, j2);
        this.A = V(str);
        baa baaVar = ((bac) this).h;
        pse.c(baaVar);
        boolean z = false;
        if (pts.a >= 29 && "video/x-vnd.on2.vp9".equals(baaVar.b)) {
            MediaCodecInfo.CodecProfileLevel[] f = baaVar.f();
            int length = f.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (f[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.B = z;
    }

    @Override // defpackage.bac
    protected final void x(String str) {
        this.w.b(str);
    }

    @Override // defpackage.bac
    protected final void y(pms pmsVar, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        azy azyVar = ((bac) this).e;
        if (azyVar != null) {
            azyVar.l(this.E);
        }
        pse.c(mediaFormat);
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.S = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.T = integer2;
        float f = pmsVar.w;
        this.U = f;
        int i = pts.a;
        int i2 = pmsVar.v;
        if (i2 == 90 || i2 == 270) {
            int i3 = this.S;
            this.S = integer2;
            this.T = i3;
            this.U = 1.0f / f;
        }
        bhd bhdVar = this.v;
        bhdVar.f = pmsVar.u;
        bgr bgrVar = bhdVar.a;
        bgrVar.a.d();
        bgrVar.b.d();
        bgrVar.c = false;
        bgrVar.d = -9223372036854775807L;
        bgrVar.e = 0;
        bhdVar.c();
    }

    @Override // defpackage.bac
    protected final void z() {
        aE();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [bac, ple, bgt] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.view.Surface] */
    @Override // defpackage.ple, defpackage.poc
    public void rk(int i, Object obj) {
        if (i != 1) {
            if (i == 7) {
                this.X = (bgw) obj;
                return;
            }
            if (i == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.W != intValue) {
                    this.W = intValue;
                    return;
                }
                return;
            }
            if (i == 4) {
                int intValue2 = ((Integer) obj).intValue();
                this.E = intValue2;
                azy azyVar = this.e;
                if (azyVar != null) {
                    azyVar.l(intValue2);
                    return;
                }
                return;
            }
            if (i != 5) {
                return;
            }
            bhd bhdVar = this.v;
            int intValue3 = ((Integer) obj).intValue();
            if (bhdVar.h != intValue3) {
                bhdVar.h = intValue3;
                bhdVar.d(true);
                return;
            }
            return;
        }
        DummySurface dummySurface = obj instanceof Surface ? (Surface) obj : null;
        if (dummySurface == null) {
            DummySurface dummySurface2 = this.C;
            if (dummySurface2 != null) {
                dummySurface = dummySurface2;
            } else {
                baa baaVar = this.h;
                if (baaVar != null && aL(baaVar)) {
                    dummySurface = DummySurface.a(this.u, baaVar.f);
                    this.C = dummySurface;
                }
            }
        }
        if (this.a != dummySurface) {
            this.a = dummySurface;
            bhd bhdVar2 = this.v;
            Surface surface = true != (dummySurface instanceof DummySurface) ? dummySurface : null;
            if (bhdVar2.e != surface) {
                bhdVar2.a();
                bhdVar2.e = surface;
                bhdVar2.d(true);
            }
            this.D = false;
            int i2 = this.s;
            azy azyVar2 = this.e;
            if (azyVar2 != null) {
                if (pts.a < 23 || dummySurface == null || this.A) {
                    L();
                    I();
                } else {
                    h(azyVar2, dummySurface);
                }
            }
            if (dummySurface == null || dummySurface == this.C) {
                aF();
                aE();
                return;
            }
            aH();
            aE();
            if (i2 == 2) {
                aJ();
                return;
            }
            return;
        }
        if (dummySurface == null || dummySurface == this.C) {
            return;
        }
        aH();
        if (this.D) {
            this.w.g(this.a);
        }
    }

    public bgt(Context context, bae baeVar, long j, Handler handler, bhn bhnVar, int i) {
        this(context, azx.a, baeVar, j, handler, bhnVar, i);
    }
}
