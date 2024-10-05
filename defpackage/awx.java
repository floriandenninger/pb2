package defpackage;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awx implements awh {
    private long A;
    private int B;
    private boolean C;
    private boolean D;
    private long E;
    private float F;
    private avr[] G;
    private ByteBuffer[] H;
    private ByteBuffer I;

    /* renamed from: J, reason: collision with root package name */
    private int f137J;
    private ByteBuffer K;
    private int L;
    private boolean M;
    private boolean N;
    private int O;
    private ase P;
    private boolean Q;
    private boolean R;
    private final awr S;
    public final ConditionVariable a;
    public awe b;
    public AudioTrack c;
    public boolean d;
    public long e;
    private final avo f;
    private final awm g;
    private final axf h;
    private final avr[] i;
    private final avr[] j;
    private final awk k;
    private final ArrayDeque l;
    private final int m;
    private aww n;
    private final awt o;
    private final awt p;
    private awq q;
    private awq r;
    private asd s;
    private aws t;
    private aws u;
    private ByteBuffer v;
    private int w;
    private long x;
    private long y;
    private long z;

    public awx(avo avoVar, awr awrVar, int i) {
        this.f = avoVar;
        this.S = awrVar;
        int i2 = pts.a;
        this.m = pts.a < 29 ? 0 : i;
        this.a = new ConditionVariable(true);
        this.k = new awk(new awu(this));
        awm awmVar = new awm();
        this.g = awmVar;
        axf axfVar = new axf();
        this.h = axfVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new axb(), awmVar, axfVar);
        Collections.addAll(arrayList, awrVar.a);
        this.i = (avr[]) arrayList.toArray(new avr[0]);
        this.j = new avr[]{new awy()};
        this.F = 1.0f;
        this.s = asd.a;
        this.O = 0;
        this.P = new ase();
        this.u = new aws(pnu.a, false, 0L, 0L);
        this.L = -1;
        this.G = new avr[0];
        this.H = new ByteBuffer[0];
        this.l = new ArrayDeque();
        this.o = new awt();
        this.p = new awt();
    }

    private static int A(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair B(defpackage.pms r12, defpackage.avo r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awx.B(pms, avo):android.util.Pair");
    }

    private final aws C() {
        aws awsVar = this.t;
        return awsVar != null ? awsVar : !this.l.isEmpty() ? (aws) this.l.getLast() : this.u;
    }

    private final pnu D() {
        return C().a;
    }

    private final void E(long j) {
        pnu pnuVar;
        boolean z;
        if (P()) {
            awr awrVar = this.S;
            pnuVar = D();
            awrVar.c.i(pnuVar.b);
            axe axeVar = awrVar.c;
            float f = pnuVar.c;
            if (axeVar.d != f) {
                axeVar.d = f;
                axeVar.g = true;
            }
        } else {
            pnuVar = pnu.a;
        }
        pnu pnuVar2 = pnuVar;
        if (P()) {
            awr awrVar2 = this.S;
            boolean z2 = z();
            awrVar2.b.e = z2;
            z = z2;
        } else {
            z = false;
        }
        this.l.add(new aws(pnuVar2, z, Math.max(0L, j), this.r.b(x())));
        avr[] avrVarArr = this.r.i;
        ArrayList arrayList = new ArrayList();
        for (avr avrVar : avrVarArr) {
            if (avrVar.g()) {
                arrayList.add(avrVar);
            } else {
                avrVar.c();
            }
        }
        int size = arrayList.size();
        this.G = (avr[]) arrayList.toArray(new avr[size]);
        this.H = new ByteBuffer[size];
        F();
        awe aweVar = this.b;
        if (aweVar != null) {
            aweVar.f(z);
        }
    }

    private final void F() {
        int i = 0;
        while (true) {
            avr[] avrVarArr = this.G;
            if (i >= avrVarArr.length) {
                return;
            }
            avr avrVar = avrVarArr[i];
            avrVar.c();
            this.H[i] = avrVar.b();
            i++;
        }
    }

    private final void G() {
        if (this.r.d()) {
            this.Q = true;
        }
    }

    private final void H() {
        if (this.N) {
            return;
        }
        this.N = true;
        awk awkVar = this.k;
        long x = x();
        awkVar.x = awkVar.b();
        awkVar.v = SystemClock.elapsedRealtime() * 1000;
        awkVar.y = x;
        this.c.stop();
        this.w = 0;
    }

    private final void I(long j) {
        ByteBuffer byteBuffer;
        int length = this.G.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.H[i - 1];
            } else {
                byteBuffer = this.I;
                if (byteBuffer == null) {
                    byteBuffer = avr.a;
                }
            }
            if (i == length) {
                L(byteBuffer, j);
            } else {
                avr avrVar = this.G[i];
                if (i > this.L) {
                    avrVar.e(byteBuffer);
                }
                ByteBuffer b = avrVar.b();
                this.H[i] = b;
                if (b.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    private final void J(pnu pnuVar, boolean z) {
        aws C = C();
        if (pnuVar.equals(C.a) && z == C.b) {
            return;
        }
        aws awsVar = new aws(pnuVar, z, -9223372036854775807L, -9223372036854775807L);
        if (N()) {
            this.t = awsVar;
        } else {
            this.u = awsVar;
        }
    }

    private final void K() {
        if (N()) {
            int i = pts.a;
            this.c.setVolume(this.F);
        }
    }

    private final void L(ByteBuffer byteBuffer, long j) {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.K;
            if (byteBuffer2 != null) {
                pse.e(byteBuffer2 == byteBuffer);
            } else {
                this.K = byteBuffer;
                int i = pts.a;
            }
            int remaining = byteBuffer.remaining();
            int i2 = pts.a;
            int A = A(this.c, byteBuffer, remaining);
            this.e = SystemClock.elapsedRealtime();
            if (A < 0) {
                if ((pts.a < 24 || A != -6) && A != -32) {
                    r10 = false;
                }
                if (r10) {
                    G();
                }
                awg awgVar = new awg(A, this.r.a, r10);
                awe aweVar = this.b;
                if (aweVar != null) {
                    aweVar.a(awgVar);
                }
                if (awgVar.b) {
                    throw awgVar;
                }
                this.p.b(awgVar);
                return;
            }
            this.p.a();
            if (O(this.c)) {
                long j2 = this.A;
                if (j2 > 0) {
                    this.R = false;
                }
                if (this.d && this.b != null && A < remaining && !this.R) {
                    awk awkVar = this.k;
                    this.b.c(plh.d(awkVar.a(j2 - awkVar.b())));
                }
            }
            int i3 = this.r.c;
            if (i3 == 0) {
                this.z += A;
            }
            if (A == remaining) {
                if (i3 != 0) {
                    pse.g(byteBuffer == this.I);
                    this.A += this.B * this.f137J;
                }
                this.K = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean M() {
        /*
            r9 = this;
            int r0 = r9.L
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.L = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.L
            avr[] r5 = r9.G
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.d()
        L1f:
            r9.I(r7)
            boolean r0 = r4.h()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.L
            int r0 = r0 + r2
            r9.L = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.K
            if (r0 == 0) goto L3b
            r9.L(r0, r7)
            java.nio.ByteBuffer r0 = r9.K
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.L = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awx.M():boolean");
    }

    private final boolean N() {
        return this.c != null;
    }

    private static boolean O(AudioTrack audioTrack) {
        return pts.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean P() {
        if (!"audio/raw".equals(this.r.a.n)) {
            return false;
        }
        int i = this.r.a.C;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005a, code lost:
    
        if (defpackage.pts.d.startsWith("Pixel") != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean Q(defpackage.pms r6, defpackage.asd r7) {
        /*
            r5 = this;
            int r0 = defpackage.pts.a
            r1 = 0
            r2 = 29
            if (r0 < r2) goto L72
            int r0 = r5.m
            if (r0 != 0) goto Lc
            goto L72
        Lc:
            java.lang.String r0 = r6.n
            defpackage.pse.c(r0)
            java.lang.String r2 = r6.k
            int r0 = defpackage.psz.a(r0, r2)
            if (r0 != 0) goto L1a
            return r1
        L1a:
            int r2 = r6.A
            int r2 = defpackage.pts.e(r2)
            if (r2 != 0) goto L23
            return r1
        L23:
            int r3 = r6.B
            android.media.AudioFormat r0 = y(r3, r2, r0)
            android.media.AudioAttributes r7 = r7.a()
            int r2 = defpackage.pts.a
            r3 = 31
            r4 = 1
            if (r2 < r3) goto L46
            int r7 = android.media.AudioManager.getPlaybackOffloadSupport(r0, r7)
            if (r7 == 0) goto L72
            if (r7 == r4) goto L5d
            r6 = 2
            if (r7 != r6) goto L40
            goto L5c
        L40:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L46:
            boolean r7 = android.media.AudioManager.isOffloadedPlaybackSupported(r0, r7)
            if (r7 == 0) goto L72
            int r7 = defpackage.pts.a
            r0 = 30
            if (r7 != r0) goto L5d
            java.lang.String r7 = defpackage.pts.d
            java.lang.String r0 = "Pixel"
            boolean r7 = r7.startsWith(r0)
            if (r7 == 0) goto L5d
        L5c:
            return r4
        L5d:
            int r7 = r6.D
            if (r7 != 0) goto L68
            int r6 = r6.E
            if (r6 == 0) goto L66
            goto L68
        L66:
            r6 = 0
            goto L69
        L68:
            r6 = 1
        L69:
            int r7 = r5.m
            if (r6 == 0) goto L71
            if (r7 == r4) goto L70
            goto L71
        L70:
            return r1
        L71:
            return r4
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awx.Q(pms, asd):boolean");
    }

    public static AudioFormat y(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    @Override // defpackage.awh
    public final int a(pms pmsVar) {
        if (!"audio/raw".equals(pmsVar.n)) {
            return ((this.Q || !Q(pmsVar, this.s)) && B(pmsVar, this.f) == null) ? 0 : 2;
        }
        if (pts.U(pmsVar.C)) {
            return pmsVar.C != 2 ? 1 : 2;
        }
        int i = pmsVar.C;
        StringBuilder sb = new StringBuilder(33);
        sb.append("Invalid PCM encoding: ");
        sb.append(i);
        Log.w("DefaultAudioSink", sb.toString());
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00c3, code lost:
    
        if (r3 != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0211 A[Catch: Exception -> 0x022f, TRY_LEAVE, TryCatch #0 {Exception -> 0x022f, blocks: (B:34:0x01ed, B:36:0x0211), top: B:33:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0261  */
    @Override // defpackage.awh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(boolean r28) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awx.b(boolean):long");
    }

    @Override // defpackage.awh
    public final pnu c() {
        return D();
    }

    @Override // defpackage.awh
    public final void d() {
    }

    @Override // defpackage.awh
    public final void e() {
        if (N()) {
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.R = false;
            this.B = 0;
            this.u = new aws(D(), z(), 0L, 0L);
            this.E = 0L;
            this.t = null;
            this.l.clear();
            this.I = null;
            this.f137J = 0;
            this.K = null;
            this.N = false;
            this.M = false;
            this.L = -1;
            this.v = null;
            this.w = 0;
            this.h.g = 0L;
            F();
            AudioTrack audioTrack = this.k.b;
            pse.c(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.c.pause();
            }
            if (O(this.c)) {
                aww awwVar = this.n;
                pse.c(awwVar);
                this.c.unregisterStreamEventCallback(awwVar.b);
                awwVar.a.removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.c;
            this.c = null;
            int i = pts.a;
            awq awqVar = this.q;
            if (awqVar != null) {
                this.r = awqVar;
                this.q = null;
            }
            awk awkVar = this.k;
            awkVar.d();
            awkVar.b = null;
            awkVar.d = null;
            this.a.close();
            new awp(this, audioTrack2).start();
        }
        this.p.a();
        this.o.a();
    }

    @Override // defpackage.awh
    public final void f() {
        this.C = true;
    }

    @Override // defpackage.awh
    public final void g() {
        this.d = false;
        if (N()) {
            awk awkVar = this.k;
            awkVar.d();
            if (awkVar.v == -9223372036854775807L) {
                awj awjVar = awkVar.d;
                pse.c(awjVar);
                awjVar.d();
                this.c.pause();
            }
        }
    }

    @Override // defpackage.awh
    public final void h() {
        this.d = true;
        if (N()) {
            awj awjVar = this.k.d;
            pse.c(awjVar);
            awjVar.d();
            this.c.play();
        }
    }

    @Override // defpackage.awh
    public final void i() {
        if (!this.M && N() && M()) {
            H();
            this.M = true;
        }
    }

    @Override // defpackage.awh
    public final void j() {
        e();
        for (avr avrVar : this.i) {
            avrVar.f();
        }
        avr[] avrVarArr = this.j;
        int length = avrVarArr.length;
        for (int i = 0; i <= 0; i++) {
            avrVarArr[i].f();
        }
        this.d = false;
        this.Q = false;
    }

    @Override // defpackage.awh
    public final void k(asd asdVar) {
        if (this.s.equals(asdVar)) {
            return;
        }
        this.s = asdVar;
        e();
    }

    @Override // defpackage.awh
    public final void l(int i) {
        if (this.O != i) {
            this.O = i;
            e();
        }
    }

    @Override // defpackage.awh
    public final void m(ase aseVar) {
        if (this.P.equals(aseVar)) {
            return;
        }
        int i = aseVar.a;
        float f = aseVar.b;
        if (this.c != null) {
            int i2 = this.P.a;
        }
        this.P = aseVar;
    }

    @Override // defpackage.awh
    public final void n(awe aweVar) {
        this.b = aweVar;
    }

    @Override // defpackage.awh
    public final void o(pnu pnuVar) {
        J(new pnu(pts.a(pnuVar.b, 0.1f, 8.0f), pts.a(pnuVar.c, 0.1f, 8.0f)), z());
    }

    @Override // defpackage.awh
    public final void p(boolean z) {
        J(D(), z);
    }

    @Override // defpackage.awh
    public final void q(float f) {
        if (this.F != f) {
            this.F = f;
            K();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0102 A[Catch: awd -> 0x0143, TryCatch #1 {awd -> 0x0143, blocks: (B:160:0x007f, B:163:0x0091, B:165:0x0099, B:167:0x009f, B:168:0x00a6, B:169:0x00c1, B:171:0x00ea, B:177:0x00f8, B:179:0x0102, B:180:0x010e, B:185:0x0138, B:187:0x013f, B:188:0x0142, B:162:0x0084), top: B:159:0x007f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0109  */
    @Override // defpackage.awh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(java.nio.ByteBuffer r25, long r26, int r28) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awx.r(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // defpackage.awh
    public final boolean s() {
        return N() && this.k.e(x());
    }

    @Override // defpackage.awh
    public final boolean t() {
        return !N() || (this.M && !s());
    }

    @Override // defpackage.awh
    public final boolean u(pms pmsVar) {
        return a(pmsVar) != 0;
    }

    @Override // defpackage.awh
    public final void v(pms pmsVar, int[] iArr) {
        int i;
        avr[] avrVarArr;
        int intValue;
        int i2;
        int i3;
        int i4;
        int i5 = -1;
        if ("audio/raw".equals(pmsVar.n)) {
            pse.e(pts.U(pmsVar.C));
            int j = pts.j(pmsVar.C, pmsVar.A);
            int i6 = pmsVar.C;
            avr[] avrVarArr2 = this.i;
            axf axfVar = this.h;
            int i7 = pmsVar.D;
            int i8 = pmsVar.E;
            axfVar.e = i7;
            axfVar.f = i8;
            this.g.e = iArr;
            avp avpVar = new avp(pmsVar.B, pmsVar.A, i6);
            for (avr avrVar : avrVarArr2) {
                try {
                    avp a = avrVar.a(avpVar);
                    if (true == avrVar.g()) {
                        avpVar = a;
                    }
                } catch (avq e) {
                    throw new awc(e, pmsVar);
                }
            }
            int i9 = avpVar.d;
            int i10 = avpVar.b;
            int e2 = pts.e(avpVar.c);
            i2 = i9;
            avrVarArr = avrVarArr2;
            i4 = pts.j(i9, avpVar.c);
            i3 = i10;
            i5 = j;
            intValue = e2;
            i = 0;
        } else {
            avr[] avrVarArr3 = new avr[0];
            int i11 = pmsVar.B;
            if (Q(pmsVar, this.s)) {
                String str = pmsVar.n;
                pse.c(str);
                avrVarArr = avrVarArr3;
                i2 = psz.a(str, pmsVar.k);
                intValue = pts.e(pmsVar.A);
                i = 1;
            } else {
                Pair B = B(pmsVar, this.f);
                if (B == null) {
                    String valueOf = String.valueOf(pmsVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                    sb.append("Unable to configure passthrough for: ");
                    sb.append(valueOf);
                    throw new awc(sb.toString(), pmsVar);
                }
                int intValue2 = ((Integer) B.first).intValue();
                i = 2;
                avrVarArr = avrVarArr3;
                intValue = ((Integer) B.second).intValue();
                i2 = intValue2;
            }
            i3 = i11;
            i4 = -1;
        }
        if (i2 == 0) {
            String valueOf2 = String.valueOf(pmsVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 48);
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i);
            sb2.append(") for: ");
            sb2.append(valueOf2);
            throw new awc(sb2.toString(), pmsVar);
        }
        if (intValue != 0) {
            this.Q = false;
            awq awqVar = new awq(pmsVar, i5, i, i4, i3, intValue, i2, avrVarArr);
            if (N()) {
                this.q = awqVar;
                return;
            } else {
                this.r = awqVar;
                return;
            }
        }
        String valueOf3 = String.valueOf(pmsVar);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 54);
        sb3.append("Invalid output channel config (mode=");
        sb3.append(i);
        sb3.append(") for: ");
        sb3.append(valueOf3);
        throw new awc(sb3.toString(), pmsVar);
    }

    public final long w() {
        return this.r.c == 0 ? this.x / r0.b : this.y;
    }

    public final long x() {
        return this.r.c == 0 ? this.z / r0.d : this.A;
    }

    public final boolean z() {
        return C().b;
    }

    public awx(avo avoVar, avr[] avrVarArr) {
        this(avoVar, new awr(avrVarArr), 0);
    }
}
