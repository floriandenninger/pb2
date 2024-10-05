package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer.ColorInfo;
import com.google.android.exoplayer.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class oyb extends oys {
    private static final byte[] a = pgz.u();
    private boolean A;
    private boolean B;
    private ByteBuffer[] C;
    private ByteBuffer[] D;
    private long E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;

    /* renamed from: J, reason: collision with root package name */
    private int f262J;
    private int K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    public final oxd b;
    public final oya c;
    protected final Handler d;
    public MediaCodec e;
    public int f;
    public boolean g;
    private final oxv i;
    private final pbh j;
    private final boolean k;
    private final oyp l;
    private final oyn m;
    private final List n;
    private final MediaCodec.BufferInfo o;
    private final boolean p;
    private MediaFormat q;
    private pbg r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public oyb(oyr oyrVar, oxv oxvVar, pbh pbhVar, boolean z, Handler handler, oya oyaVar) {
        this(new oyr[]{oyrVar}, oxvVar, pbhVar, z, handler, oyaVar);
    }

    private final void G(MediaCodec.CryptoException cryptoException) {
        Handler handler = this.d;
        if (handler == null || this.c == null) {
            return;
        }
        handler.post(new oxx(this, cryptoException));
    }

    private final void H() {
        if (this.K == 2) {
            C();
            B();
        } else {
            this.g = true;
            u();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean I(long r18, boolean r20) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyb.I(long, boolean):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oys
    public void A(long j, long j2, boolean z) {
        int i;
        int i2;
        int i3;
        boolean y;
        boolean z2 = false;
        if (z) {
            i = this.f;
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        this.f = i;
        if (this.q == null && J(j, this.m, null) == -4) {
            s(this.m);
        }
        B();
        if (this.e != null) {
            int i4 = pgz.a;
            while (true) {
                if (!this.g) {
                    int i5 = this.G;
                    if (i5 < 0) {
                        if (!this.y || !this.M) {
                            i5 = this.e.dequeueOutputBuffer(this.o, z());
                            this.G = i5;
                        } else {
                            try {
                                i5 = this.e.dequeueOutputBuffer(this.o, z());
                                this.G = i5;
                            } catch (IllegalStateException unused) {
                                H();
                                if (this.g) {
                                    C();
                                }
                            }
                        }
                    }
                    if (i5 != -2) {
                        if (i5 != -3) {
                            if (i5 >= 0) {
                                if (this.B) {
                                    this.B = z2;
                                    this.e.releaseOutputBuffer(i5, z2);
                                    this.G = -1;
                                } else if ((this.o.flags & 4) == 0) {
                                    long j3 = this.o.presentationTimeUs;
                                    int size = this.n.size();
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= size) {
                                            i2 = -1;
                                            break;
                                        } else {
                                            if (((Long) this.n.get(i6)).longValue() == j3) {
                                                i2 = i6;
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                    if (this.y && this.M) {
                                        try {
                                            MediaCodec mediaCodec = this.e;
                                            ByteBuffer[] byteBufferArr = this.D;
                                            int i7 = this.G;
                                            i3 = i2;
                                            y = y(j, j2, mediaCodec, byteBufferArr[i7], this.o, i7, i2 != -1);
                                        } catch (IllegalStateException unused2) {
                                            H();
                                            if (this.g) {
                                                C();
                                            }
                                        }
                                    } else {
                                        i3 = i2;
                                        MediaCodec mediaCodec2 = this.e;
                                        ByteBuffer[] byteBufferArr2 = this.D;
                                        int i8 = this.G;
                                        y = y(j, j2, mediaCodec2, byteBufferArr2[i8], this.o, i8, i3 != -1);
                                    }
                                    if (!y) {
                                        break;
                                    }
                                    long j4 = this.o.presentationTimeUs;
                                    if (i3 != -1) {
                                        this.n.remove(i3);
                                    }
                                    this.G = -1;
                                    z2 = false;
                                } else {
                                    H();
                                    break;
                                }
                            } else if (!this.w || (!this.N && this.K != 2)) {
                                break;
                            } else {
                                H();
                            }
                        } else {
                            this.D = this.e.getOutputBuffers();
                            this.b.e++;
                        }
                    } else {
                        android.media.MediaFormat outputFormat = this.e.getOutputFormat();
                        if (this.v && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.B = true;
                        } else {
                            if (this.z) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            t(this.e, outputFormat);
                            this.b.d++;
                        }
                    }
                } else {
                    break;
                }
            }
            if (I(j, true)) {
                do {
                } while (I(j, false));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B() {
        MediaCrypto mediaCrypto;
        boolean z;
        oxf oxfVar;
        if (F()) {
            String str = this.q.b;
            pbg pbgVar = this.r;
            if (pbgVar != null) {
                pbh pbhVar = this.j;
                if (pbhVar != null) {
                    if (!this.H) {
                        pbhVar.d(pbgVar);
                        this.H = true;
                    }
                    int a2 = this.j.a();
                    if (a2 == 0) {
                        throw new oxh(this.j.b());
                    }
                    if (a2 != 3 && a2 != 4) {
                        return;
                    }
                    mediaCrypto = this.j.f().a;
                    z = this.j.e(str);
                } else {
                    throw new oxh("Media requires a DrmSessionManager");
                }
            } else {
                mediaCrypto = null;
                z = false;
            }
            try {
                oxfVar = l(this.i, str, z);
            } catch (oyd e) {
                o(new oxz(this.q, e, -49998));
                oxfVar = null;
            }
            if (oxfVar == null) {
                o(new oxz(this.q, (Throwable) null, -49999));
            }
            String str2 = oxfVar.a;
            this.s = oxfVar.c && !(pgz.a <= 19 && pgz.d.equals("ODROID-XU3") && ("OMX.Exynos.AVC.Decoder".equals(str2) || "OMX.Exynos.AVC.Decoder.secure".equals(str2)));
            this.t = pgz.a < 21 && this.q.f.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            this.u = pgz.a < 18 || (pgz.a == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (pgz.a == 19 && pgz.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
            this.v = pgz.a < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && (pgz.b.equals("flounder") || pgz.b.equals("flounder_lte") || pgz.b.equals("grouper") || pgz.b.equals("tilapia"));
            this.w = pgz.a <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
            this.x = (pgz.a <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (pgz.a <= 19 && (("hb2000".equals(pgz.b) || "stvm8".equals(pgz.b)) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2))));
            this.y = pgz.a == 21 && "OMX.google.aac.decoder".equals(str2);
            this.z = pgz.a <= 18 && this.q.q == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                String.valueOf(str2).length();
                MediaCodec createByCodecName = MediaCodec.createByCodecName(str2);
                this.e = createByCodecName;
                boolean z2 = oxfVar.c;
                MediaFormat mediaFormat = this.q;
                if (mediaFormat.x == null) {
                    android.media.MediaFormat mediaFormat2 = new android.media.MediaFormat();
                    mediaFormat2.setString("mime", mediaFormat.b);
                    String str3 = mediaFormat.v;
                    if (str3 != null) {
                        mediaFormat2.setString("language", str3);
                    }
                    MediaFormat.h(mediaFormat2, "max-input-size", mediaFormat.d);
                    MediaFormat.h(mediaFormat2, "width", mediaFormat.h);
                    MediaFormat.h(mediaFormat2, "height", mediaFormat.i);
                    MediaFormat.h(mediaFormat2, "rotation-degrees", mediaFormat.l);
                    MediaFormat.h(mediaFormat2, "max-width", mediaFormat.j);
                    MediaFormat.h(mediaFormat2, "max-height", mediaFormat.k);
                    MediaFormat.h(mediaFormat2, "channel-count", mediaFormat.q);
                    MediaFormat.h(mediaFormat2, "sample-rate", mediaFormat.r);
                    MediaFormat.h(mediaFormat2, "encoder-delay", mediaFormat.t);
                    MediaFormat.h(mediaFormat2, "encoder-padding", mediaFormat.u);
                    for (int i = 0; i < mediaFormat.f.size(); i++) {
                        StringBuilder sb = new StringBuilder(15);
                        sb.append("csd-");
                        sb.append(i);
                        mediaFormat2.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) mediaFormat.f.get(i)));
                    }
                    long j = mediaFormat.e;
                    if (j != -1) {
                        mediaFormat2.setLong("durationUs", j);
                    }
                    ColorInfo colorInfo = mediaFormat.p;
                    if (colorInfo != null) {
                        MediaFormat.h(mediaFormat2, "color-transfer", colorInfo.c);
                        MediaFormat.h(mediaFormat2, "color-standard", colorInfo.a);
                        MediaFormat.h(mediaFormat2, "color-range", colorInfo.b);
                        byte[] bArr = colorInfo.d;
                        if (bArr != null) {
                            mediaFormat2.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
                        }
                    }
                    mediaFormat.x = mediaFormat2;
                }
                android.media.MediaFormat mediaFormat3 = mediaFormat.x;
                if (this.p) {
                    mediaFormat3.setInteger("auto-frc", 0);
                }
                n(createByCodecName, z2, mediaFormat3, mediaCrypto);
                this.e.start();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime2 - elapsedRealtime;
                Handler handler = this.d;
                if (handler != null && this.c != null) {
                    handler.post(new oxy(this, str2, elapsedRealtime2, j2));
                }
                this.C = this.e.getInputBuffers();
                this.D = this.e.getOutputBuffers();
            } catch (Exception e2) {
                o(new oxz(this.q, e2, str2));
            }
            this.E = this.h == 3 ? SystemClock.elapsedRealtime() : -1L;
            this.F = -1;
            this.G = -1;
            this.P = true;
            this.b.a++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C() {
        if (this.e != null) {
            this.E = -1L;
            this.F = -1;
            this.G = -1;
            this.O = false;
            this.n.clear();
            this.C = null;
            this.D = null;
            this.I = false;
            this.L = false;
            this.s = false;
            this.t = false;
            this.u = false;
            this.v = false;
            this.w = false;
            this.x = false;
            this.z = false;
            this.A = false;
            this.B = false;
            this.M = false;
            this.f262J = 0;
            this.K = 0;
            this.b.b++;
            try {
                this.e.stop();
                try {
                    this.e.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.e.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    protected boolean D(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        return false;
    }

    @Override // defpackage.oys
    protected final boolean E(MediaFormat mediaFormat) {
        return x(this.i, mediaFormat);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean F() {
        return this.e == null && this.q != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public boolean h() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public boolean i() {
        return (this.q == null || this.O || (this.f == 0 && this.G < 0 && SystemClock.elapsedRealtime() >= this.E + 1000)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public oxf l(oxv oxvVar, String str, boolean z) {
        return oxvVar.a(str, z);
    }

    protected abstract void n(MediaCodec mediaCodec, boolean z, android.media.MediaFormat mediaFormat, MediaCrypto mediaCrypto);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oys, defpackage.oyx
    public void q() {
        this.q = null;
        this.r = null;
        try {
            C();
            try {
                if (this.H) {
                    this.j.c();
                    this.H = false;
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                if (this.H) {
                    this.j.c();
                    this.H = false;
                }
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oys
    public void r(long j) {
        this.f = 0;
        this.N = false;
        this.g = false;
        if (this.e != null) {
            this.E = -1L;
            this.F = -1;
            this.G = -1;
            this.P = true;
            this.O = false;
            this.n.clear();
            this.A = false;
            this.B = false;
            if (this.u || (this.x && this.M)) {
                C();
                B();
            } else if (this.K != 0) {
                C();
                B();
            } else {
                this.e.flush();
                this.L = false;
            }
            if (!this.I || this.q == null) {
                return;
            }
            this.f262J = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r6.i == r0.i) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(defpackage.oyn r6) {
        /*
            r5 = this;
            com.google.android.exoplayer.MediaFormat r0 = r5.q
            com.google.android.exoplayer.MediaFormat r1 = r6.a
            r5.q = r1
            pbg r6 = r6.b
            r5.r = r6
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L14
            boolean r6 = r5.H
            if (r6 != 0) goto L14
            r6 = 1
            goto L15
        L14:
            r6 = 0
        L15:
            com.google.android.exoplayer.MediaFormat r3 = r5.q
            boolean r3 = defpackage.pgz.p(r3, r0)
            if (r3 == 0) goto L21
            if (r6 == 0) goto L20
            goto L21
        L20:
            return
        L21:
            android.media.MediaCodec r3 = r5.e
            if (r3 == 0) goto L4c
            if (r6 != 0) goto L4c
            boolean r6 = r5.s
            com.google.android.exoplayer.MediaFormat r4 = r5.q
            boolean r6 = r5.D(r3, r6, r0, r4)
            if (r6 == 0) goto L4c
            r5.I = r1
            r5.f262J = r1
            boolean r6 = r5.v
            if (r6 == 0) goto L48
            com.google.android.exoplayer.MediaFormat r6 = r5.q
            int r3 = r6.h
            int r4 = r0.h
            if (r3 != r4) goto L48
            int r6 = r6.i
            int r0 = r0.i
            if (r6 != r0) goto L48
            goto L49
        L48:
            r1 = 0
        L49:
            r5.A = r1
            return
        L4c:
            boolean r6 = r5.L
            if (r6 == 0) goto L53
            r5.K = r1
            return
        L53:
            r5.C()
            r5.B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyb.s(oyn):void");
    }

    protected void t(MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
    }

    protected void u() {
    }

    @Override // defpackage.oyx
    protected void v() {
    }

    protected abstract boolean x(oxv oxvVar, MediaFormat mediaFormat);

    protected abstract boolean y(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, boolean z);

    protected long z() {
        return 0L;
    }

    public oyb(oyr[] oyrVarArr, oxv oxvVar, pbh pbhVar, boolean z, Handler handler, oya oyaVar) {
        super(oyrVarArr);
        opn.k(pgz.a >= 16);
        opn.h(oxvVar);
        this.i = oxvVar;
        this.j = pbhVar;
        this.k = z;
        this.d = handler;
        this.c = oyaVar;
        this.p = pgz.a <= 22 && "foster".equals(pgz.b) && "NVIDIA".equals(pgz.c);
        this.b = new oxd();
        this.l = new oyp(0);
        this.m = new oyn();
        this.n = new ArrayList();
        this.o = new MediaCodec.BufferInfo();
        this.f262J = 0;
        this.K = 0;
    }

    private final void o(oxz oxzVar) {
        Handler handler = this.d;
        if (handler != null && this.c != null) {
            handler.post(new oxw(this, oxzVar));
        }
        throw new oxh(oxzVar);
    }
}
