package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.decoder.CryptoConfig;
import androidx.media3.exoplayer.video.VideoDecoderOutputBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bgo extends ple {
    private long A;
    private long B;
    private boolean C;
    private boolean D;
    private boolean E;
    private aso F;
    private long G;
    private int H;
    private int I;

    /* renamed from: J, reason: collision with root package name */
    private int f149J;
    private long K;
    private long L;
    protected auj a;
    private final long b;
    private final int c;
    private final bhm d;
    private final ptp e;
    private final asw f;
    private pms g;
    private pms h;
    private ast i;
    private bgu j;
    private VideoDecoderOutputBuffer k;
    private int l;
    private Object m;
    private Surface n;
    private bgv o;
    private bgw p;
    private ayh q;
    private ayh u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: protected */
    public bgo(long j, Handler handler, bhn bhnVar, int i) {
        super(2);
        this.b = j;
        this.c = i;
        this.B = -9223372036854775807L;
        z();
        this.e = new ptp();
        this.f = asw.a();
        this.d = new bhm(handler, bhnVar);
        this.v = 0;
        this.l = -1;
    }

    private final void A() {
        CryptoConfig cryptoConfig;
        if (this.i != null) {
            return;
        }
        E(this.u);
        ayh ayhVar = this.q;
        if (ayhVar != null) {
            cryptoConfig = ayhVar.b();
            if (cryptoConfig == null && this.q.c() == null) {
                return;
            }
        } else {
            cryptoConfig = null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.i = b(this.g, cryptoConfig);
            f(this.l);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.d.a(this.i.c(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.a.a++;
        } catch (asu e) {
            prh.j("DecoderVideoRenderer", "Video codec error", e);
            this.d.h(e);
            throw aj(e, this.g, 4001);
        } catch (OutOfMemoryError e2) {
            throw aj(e2, this.g, 4001);
        }
    }

    private final void C() {
        if (this.H > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.d.d(this.H, elapsedRealtime - this.G);
            this.H = 0;
            this.G = elapsedRealtime;
        }
    }

    private final void D() {
        aso asoVar = this.F;
        if (asoVar != null) {
            this.d.i(asoVar);
        }
    }

    private final void E(ayh ayhVar) {
        arv.b(this.q, ayhVar);
        this.q = ayhVar;
    }

    private final void G() {
        this.B = this.b > 0 ? SystemClock.elapsedRealtime() + this.b : -9223372036854775807L;
    }

    private final void H(ayh ayhVar) {
        arv.b(this.u, ayhVar);
        this.u = ayhVar;
    }

    private final boolean I() {
        return this.l != -1;
    }

    public static boolean w(long j) {
        return j < -30000;
    }

    private final void y() {
        this.x = false;
    }

    private final void z() {
        this.F = null;
    }

    @Override // defpackage.ple
    protected final void K(pms[] pmsVarArr, long j, long j2) {
        this.L = j2;
    }

    protected abstract ast b(pms pmsVar, CryptoConfig cryptoConfig);

    protected auk c(String str, pms pmsVar, pms pmsVar2) {
        throw null;
    }

    protected abstract void e(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    protected abstract void f(int i);

    protected final void g(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        v(1);
        videoDecoderOutputBuffer.release();
    }

    protected final void h() {
        this.f149J = 0;
        if (this.v != 0) {
            t();
            A();
            return;
        }
        this.j = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.k;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.k = null;
        }
        this.i.d();
        this.w = false;
    }

    @Override // defpackage.ple
    protected final void k() {
        this.g = null;
        z();
        y();
        try {
            H(null);
            t();
        } finally {
            this.d.c(this.a);
        }
    }

    @Override // defpackage.ple
    protected final void l(boolean z, boolean z2) {
        auj aujVar = new auj();
        this.a = aujVar;
        this.d.e(aujVar);
        this.y = z2;
        this.z = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ple
    public void m(long j, boolean z) {
        this.D = false;
        this.E = false;
        y();
        this.A = -9223372036854775807L;
        this.I = 0;
        if (this.i != null) {
            h();
        }
        if (z) {
            G();
        } else {
            this.B = -9223372036854775807L;
        }
        this.e.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ple
    public void n() {
        this.H = 0;
        this.G = SystemClock.elapsedRealtime();
        this.K = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // defpackage.ple
    protected final void o() {
        this.B = -9223372036854775807L;
        C();
    }

    @Override // defpackage.poe
    public final void p(long j, long j2) {
        int ag;
        if (this.E) {
            return;
        }
        if (this.g == null) {
            pmt al = al();
            this.f.clear();
            int af = af(al, this.f, 2);
            if (af != -5) {
                if (af == -4) {
                    pse.g(this.f.isEndOfStream());
                    this.D = true;
                    this.E = true;
                    return;
                }
                return;
            }
            q(al);
        }
        A();
        if (this.i != null) {
            try {
                int i = pts.a;
                while (true) {
                    VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.k;
                    if (videoDecoderOutputBuffer == null) {
                        videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) this.i.b();
                        this.k = videoDecoderOutputBuffer;
                        if (videoDecoderOutputBuffer == null) {
                            break;
                        }
                        this.a.f += videoDecoderOutputBuffer.skippedOutputBufferCount;
                        this.f149J -= videoDecoderOutputBuffer.skippedOutputBufferCount;
                    }
                    if (!videoDecoderOutputBuffer.isEndOfStream()) {
                        if (this.A == -9223372036854775807L) {
                            this.A = j;
                        }
                        long j3 = this.k.timeUs - j;
                        if (!I()) {
                            if (!w(j3)) {
                                break;
                            }
                            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.k;
                            this.a.f++;
                            videoDecoderOutputBuffer2.release();
                        } else {
                            long j4 = this.k.timeUs - this.L;
                            pms pmsVar = (pms) this.e.d(j4);
                            if (pmsVar != null) {
                                this.h = pmsVar;
                            }
                            long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.K;
                            int i2 = this.s;
                            if (!this.z) {
                                if (i2 != 2 && !this.y) {
                                    break;
                                }
                                u(this.k, j4, this.h);
                            } else {
                                if (this.x) {
                                    if (i2 == 2) {
                                        if (!w(j3) || elapsedRealtime <= 100000) {
                                            if (j != this.A) {
                                                if (j3 < -500000 && (ag = ag(j)) != 0) {
                                                    this.a.i++;
                                                    v(this.f149J + ag);
                                                    h();
                                                    break;
                                                }
                                                if (!x(j3, j2)) {
                                                    if (j3 >= 30000) {
                                                        break;
                                                    } else {
                                                        u(this.k, j4, this.h);
                                                    }
                                                } else {
                                                    g(this.k);
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                u(this.k, j4, this.h);
                            }
                        }
                        long j5 = this.k.timeUs;
                        this.f149J--;
                        this.k = null;
                    } else if (this.v == 2) {
                        t();
                        A();
                    } else {
                        this.k.release();
                        this.k = null;
                        this.E = true;
                    }
                }
                while (true) {
                    ast astVar = this.i;
                    if (astVar == null || this.v == 2 || this.D) {
                        break;
                    }
                    bgu bguVar = this.j;
                    if (bguVar == null) {
                        bguVar = (bgu) astVar.a();
                        this.j = bguVar;
                        if (bguVar == null) {
                            break;
                        }
                    }
                    if (this.v != 1) {
                        pmt al2 = al();
                        int af2 = af(al2, this.j, 0);
                        if (af2 == -5) {
                            q(al2);
                        } else {
                            if (af2 != -4) {
                                break;
                            }
                            if (!this.j.isEndOfStream()) {
                                if (this.C) {
                                    this.e.e(this.j.d, this.g);
                                    this.C = false;
                                }
                                this.j.c();
                                bgu bguVar2 = this.j;
                                bguVar2.f = this.g;
                                this.i.e(bguVar2);
                                this.f149J++;
                                this.w = true;
                                this.a.c++;
                                this.j = null;
                            } else {
                                this.D = true;
                                this.i.e(this.j);
                                this.j = null;
                                break;
                            }
                        }
                    } else {
                        bguVar.setFlags(4);
                        this.i.e(this.j);
                        this.j = null;
                        this.v = 2;
                        break;
                    }
                }
                this.a.a();
            } catch (asu e) {
                prh.j("DecoderVideoRenderer", "Video codec error", e);
                this.d.h(e);
                throw aj(e, this.g, 4003);
            }
        }
    }

    protected final void q(pmt pmtVar) {
        auk c;
        this.C = true;
        pms pmsVar = pmtVar.b;
        pse.c(pmsVar);
        H(pmtVar.a);
        pms pmsVar2 = this.g;
        this.g = pmsVar;
        ast astVar = this.i;
        if (astVar == null) {
            A();
            this.d.f(this.g, null);
            return;
        }
        if (this.u != this.q) {
            c = new auk(astVar.c(), pmsVar2, pmsVar, 0, 128);
        } else {
            c = c(astVar.c(), pmsVar2, pmsVar);
        }
        if (c.d == 0) {
            if (this.w) {
                this.v = 1;
            } else {
                t();
                A();
            }
        }
        this.d.f(this.g, c);
    }

    @Override // defpackage.poe
    public final boolean r() {
        return this.E;
    }

    @Override // defpackage.ple, defpackage.poc
    public void rk(int i, Object obj) {
        int i2 = 1;
        if (i != 1) {
            if (i == 7) {
                this.p = (bgw) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.n = (Surface) obj;
            this.o = null;
            this.l = 1;
        } else if (obj instanceof bgv) {
            this.n = null;
            this.o = (bgv) obj;
            this.l = 0;
            i2 = 0;
        } else {
            this.n = null;
            this.o = null;
            this.l = -1;
            obj = null;
            i2 = -1;
        }
        if (this.m == obj) {
            if (obj != null) {
                D();
                if (this.x) {
                    this.d.g(this.m);
                    return;
                }
                return;
            }
            return;
        }
        this.m = obj;
        if (obj == null) {
            z();
            y();
            return;
        }
        if (this.i != null) {
            f(i2);
        }
        D();
        y();
        if (this.s == 2) {
            G();
        }
    }

    @Override // defpackage.poe
    public boolean s() {
        if (this.g != null && ((az() || this.k != null) && (this.x || !I()))) {
            this.B = -9223372036854775807L;
            return true;
        }
        if (this.B == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.B) {
            return true;
        }
        this.B = -9223372036854775807L;
        return false;
    }

    protected final void t() {
        this.j = null;
        this.k = null;
        this.v = 0;
        this.w = false;
        this.f149J = 0;
        ast astVar = this.i;
        if (astVar != null) {
            this.a.b++;
            astVar.f();
            this.d.b(this.i.c());
            this.i = null;
        }
        E(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(androidx.media3.exoplayer.video.VideoDecoderOutputBuffer r8, long r9, defpackage.pms r11) {
        /*
            r7 = this;
            bgw r0 = r7.p
            if (r0 == 0) goto Le
            long r3 = java.lang.System.nanoTime()
            r6 = 0
            r1 = r9
            r5 = r11
            r0.a(r1, r3, r5, r6)
        Le:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r0
            long r9 = defpackage.plh.c(r9)
            r7.K = r9
            int r9 = r8.mode
            r10 = 0
            r11 = 1
            if (r9 != r11) goto L2a
            android.view.Surface r9 = r7.n
            if (r9 == 0) goto L29
            r9 = 1
            r0 = 1
            goto L2b
        L29:
            r9 = 1
        L2a:
            r0 = 0
        L2b:
            if (r9 != 0) goto L33
            bgv r9 = r7.o
            if (r9 == 0) goto L33
            r9 = 1
            goto L34
        L33:
            r9 = 0
        L34:
            if (r9 != 0) goto L3d
            if (r0 == 0) goto L39
            goto L3d
        L39:
            r7.g(r8)
            return
        L3d:
            int r0 = r8.width
            int r1 = r8.height
            aso r2 = r7.F
            if (r2 == 0) goto L4d
            int r3 = r2.a
            if (r3 != r0) goto L4d
            int r2 = r2.b
            if (r2 == r1) goto L59
        L4d:
            aso r2 = new aso
            r2.<init>(r0, r1)
            r7.F = r2
            bhm r0 = r7.d
            r0.i(r2)
        L59:
            if (r9 == 0) goto L61
            bgv r9 = r7.o
            r9.rH(r8)
            goto L66
        L61:
            android.view.Surface r9 = r7.n
            r7.e(r8, r9)
        L66:
            r7.I = r10
            auj r8 = r7.a
            int r9 = r8.e
            int r9 = r9 + r11
            r8.e = r9
            r7.z = r11
            boolean r8 = r7.x
            if (r8 != 0) goto L7e
            r7.x = r11
            bhm r8 = r7.d
            java.lang.Object r9 = r7.m
            r8.g(r9)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgo.u(androidx.media3.exoplayer.video.VideoDecoderOutputBuffer, long, pms):void");
    }

    protected final void v(int i) {
        auj aujVar = this.a;
        aujVar.g += i;
        this.H += i;
        int i2 = this.I + i;
        this.I = i2;
        aujVar.h = Math.max(i2, aujVar.h);
        int i3 = this.c;
        if (i3 <= 0 || this.H < i3) {
            return;
        }
        C();
    }

    protected boolean x(long j, long j2) {
        return w(j);
    }
}
