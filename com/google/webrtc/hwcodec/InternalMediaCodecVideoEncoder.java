package com.google.webrtc.hwcodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoder;
import defpackage.acnc;
import defpackage.acnd;
import defpackage.acog;
import defpackage.amkq;
import defpackage.amnv;
import defpackage.amny;
import defpackage.amru;
import defpackage.awxs;
import defpackage.axio;
import defpackage.axiq;
import defpackage.axiw;
import defpackage.axix;
import defpackage.axiy;
import defpackage.axjx;
import defpackage.axkb;
import defpackage.axkc;
import defpackage.axki;
import defpackage.baoe;
import defpackage.baog;
import defpackage.baom;
import defpackage.baoy;
import defpackage.baqo;
import defpackage.baqt;
import defpackage.zga;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EncodedImage;
import org.webrtc.Logging;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class InternalMediaCodecVideoEncoder implements VideoEncoder {
    public static final long a = TimeUnit.SECONDS.toMicros(1);
    public int A;
    public int B;
    public VideoCodecStatus C;
    public long D;
    public int E;
    public int F;
    public int G;
    public int H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public int f180J;
    public final axix K;
    public axkc L;
    public final int M;
    public final baoy N = new baoy();
    private final String O;
    private final Integer P;
    private final Integer Q;
    private final boolean R;
    private final axiq S;
    private final int T;
    private final amnv U;
    private final amru V;
    private final baqo W;
    private HandlerThread X;
    private Handler Y;
    private boolean Z;
    private Surface aa;
    private axki ab;
    private int ac;
    private final acnc ad;
    public final axio b;
    public final int c;
    public final long d;
    public final long e;
    public final baqt f;
    public final axjx g;
    public boolean h;
    public ByteBuffer[] i;
    public VideoEncoder.Callback j;
    public boolean k;
    public baom l;
    public axiy m;
    public axki n;
    public final Deque o;
    public int p;
    public int q;
    public boolean r;
    public long s;
    public long t;
    public int u;
    public long v;
    public long w;
    public ByteBuffer x;
    public int y;
    public double z;

    public InternalMediaCodecVideoEncoder(String str, axio axioVar, Integer num, Integer num2, boolean z, axiq axiqVar, axix axixVar, amnv amnvVar, acnc acncVar, amru amruVar, byte[] bArr) {
        int i;
        baqo baqoVar = new baqo();
        this.W = baqoVar;
        this.g = new axjx();
        this.o = new ArrayDeque();
        this.x = null;
        this.C = VideoCodecStatus.OK;
        this.O = str;
        this.b = axioVar;
        this.P = num;
        this.Q = num2;
        int intValue = num2.intValue();
        int i2 = 2;
        if (intValue == 19) {
            i = 1;
        } else {
            if (intValue != 21 && intValue != 2141391872 && intValue != 2141391876) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unsupported colorFormat: ");
                sb.append(intValue);
                throw new IllegalArgumentException(sb.toString());
            }
            i = 2;
        }
        this.M = i;
        this.R = z;
        this.S = axiqVar;
        this.T = axiqVar.f;
        this.d = TimeUnit.SECONDS.toMicros(axiqVar.g);
        this.e = axiqVar.h;
        if ((axiqVar.b & 256) != 0) {
            int i3 = axiqVar.i;
            if (i3 <= 0) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Wrong maxPendingFrames value: ");
                sb2.append(i3);
                Logging.d("IMCVideoEncoder", sb2.toString());
            } else {
                i2 = i3;
            }
        }
        this.c = i2;
        this.K = axixVar;
        this.U = amnvVar;
        this.ad = acncVar;
        this.f = new axiw();
        this.V = amruVar;
        baqoVar.b();
    }

    public static long a(long j) {
        return TimeUnit.MILLISECONDS.convert(j, TimeUnit.MICROSECONDS);
    }

    private final VideoCodecStatus j(final int i, final double d) {
        this.W.a();
        if (this.h) {
            this.Y.post(new Runnable() { // from class: axjs
                @Override // java.lang.Runnable
                public final void run() {
                    InternalMediaCodecVideoEncoder internalMediaCodecVideoEncoder = InternalMediaCodecVideoEncoder.this;
                    int i2 = i;
                    double d2 = d;
                    if (internalMediaCodecVideoEncoder.k) {
                        internalMediaCodecVideoEncoder.A = i2;
                        double cp = aneo.cp(d2);
                        internalMediaCodecVideoEncoder.z = cp;
                        internalMediaCodecVideoEncoder.K.d(internalMediaCodecVideoEncoder.A, cp);
                    }
                }
            });
        }
        return VideoCodecStatus.OK;
    }

    protected final VideoCodecStatus b(Callable callable, String str) {
        return awxs.e(this.Y, callable, str);
    }

    public final VideoCodecStatus c() {
        g();
        int i = this.ac + 1;
        this.ac = i;
        StringBuilder sb = new StringBuilder(21);
        sb.append("HW error #");
        sb.append(i);
        Logging.b("IMCVideoEncoder", sb.toString());
        if (this.ac <= 3) {
            return VideoCodecStatus.ERROR;
        }
        return VideoCodecStatus.FALLBACK_SOFTWARE;
    }

    @Override // org.webrtc.VideoEncoder
    public final /* synthetic */ long createNativeVideoEncoder() {
        return 0L;
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus d(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        return j(bitrateAllocation.a(), i);
    }

    public final VideoCodecStatus e(int i, int i2, boolean z) {
        g();
        this.p = i;
        this.q = i2;
        this.r = z;
        this.s = -1L;
        this.t = System.nanoTime();
        this.u = 0;
        this.v = 0L;
        this.w = 0L;
        this.m = axkb.a(this.b);
        this.B = 0;
        this.C = VideoCodecStatus.OK;
        this.y = this.K.b();
        double a2 = this.K.a();
        int i3 = this.A;
        int i4 = this.y;
        double d = this.z;
        long j = this.d;
        int i5 = this.T;
        long j2 = this.e;
        int i6 = this.c;
        String valueOf = String.valueOf(this.V);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 428 + "null".length());
        sb.append("startEncodeInternal: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        sb.append(". Target bitrate: ");
        sb.append(i3);
        sb.append(". Adjusted bitrate: ");
        sb.append(i4);
        sb.append(". Target framerate: ");
        sb.append(d);
        sb.append(". Adjusted framerate: ");
        sb.append(a2);
        sb.append(". useSurfaceMode: ");
        sb.append(z);
        sb.append(". forcedKeyFrameUs: ");
        sb.append(j);
        sb.append(". keyFrameIntervalSec: ");
        sb.append(i5);
        sb.append(". maxFrameGapBeforeRequestingKeyFrameNs: ");
        sb.append(j2);
        sb.append(". maxPendingFrames: ");
        sb.append(i6);
        sb.append(". Bitrate limits: ");
        sb.append(valueOf);
        sb.append(". videoFadeInController: ");
        sb.append("null");
        Logging.a("IMCVideoEncoder", sb.toString());
        try {
            this.L = awxs.f(this.O);
            int intValue = (z ? this.P : this.Q).intValue();
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(axkb.c(this.b), i, i2);
                createVideoFormat.setInteger("bitrate", this.y);
                createVideoFormat.setInteger("bitrate-mode", 2);
                createVideoFormat.setInteger("color-format", intValue);
                createVideoFormat.setInteger("i-frame-interval", this.T);
                if (this.S.j) {
                    createVideoFormat.setFloat("frame-rate", (float) a2);
                } else {
                    createVideoFormat.setInteger("frame-rate", (int) a2);
                }
                if (this.b == axio.H264 && this.R) {
                    Logging.a("IMCVideoEncoder", "Using H264 HP.");
                    createVideoFormat.setInteger("profile", 8);
                    createVideoFormat.setInteger("level", 256);
                }
                String valueOf2 = String.valueOf(createVideoFormat);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 8);
                sb2.append("Format: ");
                sb2.append(valueOf2);
                Logging.a("IMCVideoEncoder", sb2.toString());
                this.L.j(createVideoFormat, null, 1);
                if (z) {
                    this.l = baoe.d((baog) ((amny) this.U).a, baom.e);
                    Surface createInputSurface = this.L.a.createInputSurface();
                    this.aa = createInputSurface;
                    this.l.d(createInputSurface);
                    this.l.f();
                }
                this.L.f();
                this.i = this.L.i();
                this.o.clear();
                this.k = true;
                this.F = 0;
                this.G = 0;
                h();
                this.n.b();
                this.ab.a(3000L);
                return VideoCodecStatus.OK;
            } catch (Exception e) {
                Logging.c("IMCVideoEncoder", "startEncodeInternal failed", e);
                f();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e2) {
            String valueOf3 = String.valueOf(this.O);
            Logging.c("IMCVideoEncoder", valueOf3.length() != 0 ? "Cannot create media encoder ".concat(valueOf3) : new String("Cannot create media encoder "), e2);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus encode(final VideoFrame videoFrame, final VideoEncoder.EncodeInfo encodeInfo) {
        this.W.a();
        if (!this.h) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        VideoCodecStatus b = b(new Callable() { // from class: axjw
            /* JADX WARN: Can't wrap try/catch for region: R(15:31|(3:33|(2:35|36)(2:38|39)|37)|40|41|(2:43|(4:51|52|(2:114|(1:116)(1:117))(1:55)|(2:57|58)(6:59|(4:61|62|63|64)(5:76|77|78|79|(1:81)(4:82|83|84|(5:86|(2:88|(2:90|(1:92)(2:99|100))(1:101))(2:102|(1:104)(2:105|106))|93|94|95)(1:107)))|65|(1:67)|68|(1:72)(2:70|71))))|118|119|120|121|122|52|(0)|114|(0)(0)|(0)(0)) */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x01b4, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:125:0x01b5, code lost:
            
                org.webrtc.Logging.c("IMCVideoEncoder", "requestKeyFrame failed", r0);
             */
            /* JADX WARN: Removed duplicated region for block: B:116:0x01e2  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x0205  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x020d  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0211  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 1061
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.axjw.call():java.lang.Object");
            }
        }, "encoder.encode");
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.REQUEST_SLI;
        return b;
    }

    public final VideoCodecStatus f() {
        g();
        Logging.a("IMCVideoEncoder", "stopEncodeInternal");
        this.n.b();
        this.ab.b();
        this.x = null;
        this.o.clear();
        this.g.a();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Exception[] excArr = new Exception[1];
        new Thread(new Runnable() { // from class: axjt
            @Override // java.lang.Runnable
            public final void run() {
                InternalMediaCodecVideoEncoder internalMediaCodecVideoEncoder = InternalMediaCodecVideoEncoder.this;
                Exception[] excArr2 = excArr;
                CountDownLatch countDownLatch2 = countDownLatch;
                try {
                    internalMediaCodecVideoEncoder.L.g();
                } catch (Exception e) {
                    Logging.c("IMCVideoEncoder", "Media encoder stop failed", e);
                }
                try {
                    internalMediaCodecVideoEncoder.L.c();
                } catch (Exception e2) {
                    Logging.c("IMCVideoEncoder", "Media encoder release failed", e2);
                    excArr2[0] = e2;
                }
                countDownLatch2.countDown();
            }
        }, "IMCVideoEncoder.release").start();
        try {
            boolean await = countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
            Exception exc = excArr[0];
            if (exc != null) {
                Logging.c("IMCVideoEncoder", "MediaCodec release exception.", exc);
                return VideoCodecStatus.ERROR;
            }
            if (!await) {
                Logging.b("IMCVideoEncoder", "MediaCodec release timed out.");
                acnc acncVar = this.ad;
                if (acncVar != null) {
                    acnd acndVar = acncVar.a;
                    zga.c("PeerConnectionClient", "onCriticalEncodeError");
                    acog acogVar = acndVar.A;
                    if (acogVar != null) {
                        acogVar.a();
                    }
                }
                return VideoCodecStatus.ERROR;
            }
            this.L = null;
            this.i = null;
            this.k = false;
            this.N.c();
            this.f.a();
            baom baomVar = this.l;
            if (baomVar != null) {
                baomVar.g();
                this.l = null;
            }
            Surface surface = this.aa;
            if (surface != null) {
                surface.release();
                this.aa = null;
            }
            axiy axiyVar = this.m;
            if (axiyVar != null) {
                axiyVar.b();
                this.m = null;
            }
            Logging.a("IMCVideoEncoder", "stopEncodeInternal done");
            return VideoCodecStatus.OK;
        } catch (InterruptedException e) {
            Logging.c("IMCVideoEncoder", "Interrupted", e);
            Thread.currentThread().interrupt();
            return VideoCodecStatus.ERROR;
        }
    }

    public final void g() {
        if (Thread.currentThread() != this.X) {
            throw new AssertionError("Not called on the codec thread.");
        }
    }

    @Override // org.webrtc.VideoEncoder
    public final String getImplementationName() {
        String valueOf = String.valueOf(this.O);
        return valueOf.length() != 0 ? "IMC: ".concat(valueOf) : new String("IMC: ");
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return (VideoEncoder.ResolutionBitrateLimits[]) amkq.bo(this.V, VideoEncoder.ResolutionBitrateLimits.class);
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoEncoder.ScalingSettings getScalingSettings() {
        if (!this.Z) {
            return VideoEncoder.ScalingSettings.a;
        }
        axio axioVar = axio.UNKNOWN;
        int ordinal = this.b.ordinal();
        if (ordinal == 1) {
            return new VideoEncoder.ScalingSettings(27, 80);
        }
        if (ordinal != 3) {
            return ordinal != 4 ? VideoEncoder.ScalingSettings.a : new VideoEncoder.ScalingSettings(27, 35);
        }
        return new VideoEncoder.ScalingSettings(23, 33);
    }

    public final void h() {
        this.D = System.currentTimeMillis();
        this.E = this.G;
        this.H = 0;
        this.I = 0L;
        this.f180J = 0;
    }

    public final boolean i() {
        amnv amnvVar = this.U;
        return (amnvVar == null || ((amny) amnvVar).a == null || this.P == null) ? false : true;
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus initEncode(final VideoEncoder.Settings settings, final VideoEncoder.Callback callback) {
        this.W.a();
        this.Z = settings.f;
        if (this.X != null) {
            try {
                Logging.a("IMCVideoEncoder", "codecThread join");
                this.X.join();
                Logging.a("IMCVideoEncoder", "codecThread join done");
            } catch (InterruptedException unused) {
                Logging.b("IMCVideoEncoder", "Interrupted while waiting for old codec to stop.");
                return VideoCodecStatus.ERROR;
            }
        }
        HandlerThread handlerThread = new HandlerThread("IMCVideoEncoder");
        this.X = handlerThread;
        handlerThread.start();
        this.Y = new Handler(this.X.getLooper());
        this.n = new axki(this.Y, new Runnable() { // from class: axjq
            @Override // java.lang.Runnable
            public final void run() {
                final int b;
                ByteBuffer slice;
                Runnable runnable;
                EncodedImage.FrameType frameType;
                final InternalMediaCodecVideoEncoder internalMediaCodecVideoEncoder = InternalMediaCodecVideoEncoder.this;
                internalMediaCodecVideoEncoder.g();
                if (internalMediaCodecVideoEncoder.h) {
                    while (true) {
                        internalMediaCodecVideoEncoder.g();
                        try {
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            b = internalMediaCodecVideoEncoder.L.b(bufferInfo, 0L);
                            if (b < 0) {
                                break;
                            }
                            ByteBuffer byteBuffer = internalMediaCodecVideoEncoder.i[b];
                            if ((bufferInfo.flags & 2) != 0) {
                                internalMediaCodecVideoEncoder.x = ByteBuffer.allocateDirect(bufferInfo.size);
                                internalMediaCodecVideoEncoder.x.put(byteBuffer);
                                StringBuilder sb = new StringBuilder();
                                sb.append("Config frame generated. Offset: ");
                                sb.append(bufferInfo.offset);
                                sb.append(". Size: ");
                                sb.append(bufferInfo.size);
                                sb.append(". Data: ");
                                for (int i = 0; i < Math.min(bufferInfo.size, 8); i++) {
                                    sb.append(Integer.toHexString(internalMediaCodecVideoEncoder.x.get(i) & 255));
                                    sb.append(" ");
                                }
                                Logging.a("IMCVideoEncoder", sb.toString());
                            } else {
                                internalMediaCodecVideoEncoder.K.c(bufferInfo.size);
                                internalMediaCodecVideoEncoder.g();
                                int b2 = internalMediaCodecVideoEncoder.K.b();
                                if (b2 != internalMediaCodecVideoEncoder.y) {
                                    internalMediaCodecVideoEncoder.g();
                                    try {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("video-bitrate", b2);
                                        internalMediaCodecVideoEncoder.L.e(bundle);
                                    } catch (IllegalStateException e) {
                                        Logging.c("IMCVideoEncoder", "updateBitrate failed", e);
                                    }
                                    internalMediaCodecVideoEncoder.y = b2;
                                }
                                int i2 = bufferInfo.flags & 1;
                                if (i2 != 0) {
                                    Logging.a("IMCVideoEncoder", "Sync frame generated");
                                }
                                if (i2 == 0 || (internalMediaCodecVideoEncoder.b != axio.H264 && internalMediaCodecVideoEncoder.b != axio.H265X)) {
                                    slice = byteBuffer.slice();
                                    axjx axjxVar = internalMediaCodecVideoEncoder.g;
                                    synchronized (axjxVar.a) {
                                        axjxVar.b++;
                                    }
                                    runnable = new Runnable() { // from class: axjr
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            InternalMediaCodecVideoEncoder internalMediaCodecVideoEncoder2 = InternalMediaCodecVideoEncoder.this;
                                            internalMediaCodecVideoEncoder2.L.d(b, false);
                                            axjx axjxVar2 = internalMediaCodecVideoEncoder2.g;
                                            synchronized (axjxVar2.a) {
                                                int i3 = axjxVar2.b - 1;
                                                axjxVar2.b = i3;
                                                if (i3 == 0) {
                                                    axjxVar2.a.notifyAll();
                                                }
                                            }
                                        }
                                    };
                                } else {
                                    int capacity = internalMediaCodecVideoEncoder.x.capacity();
                                    int i3 = bufferInfo.offset;
                                    int i4 = bufferInfo.size;
                                    StringBuilder sb2 = new StringBuilder(102);
                                    sb2.append("Prepending config frame of size ");
                                    sb2.append(capacity);
                                    sb2.append(" to output buffer with offset ");
                                    sb2.append(i3);
                                    sb2.append(", size ");
                                    sb2.append(i4);
                                    Logging.a("IMCVideoEncoder", sb2.toString());
                                    slice = ByteBuffer.allocateDirect(bufferInfo.size + internalMediaCodecVideoEncoder.x.capacity());
                                    slice.put(internalMediaCodecVideoEncoder.x);
                                    slice.put(byteBuffer);
                                    internalMediaCodecVideoEncoder.L.d(b, false);
                                    runnable = null;
                                }
                                if (i2 != 0) {
                                    frameType = EncodedImage.FrameType.VideoFrameKey;
                                } else {
                                    frameType = EncodedImage.FrameType.VideoFrameDelta;
                                }
                                axjy axjyVar = (axjy) internalMediaCodecVideoEncoder.o.poll();
                                baow baowVar = axjyVar.a;
                                baowVar.a = slice;
                                baowVar.b = runnable;
                                baowVar.f = frameType;
                                axiy axiyVar = internalMediaCodecVideoEncoder.m;
                                if (axiyVar != null) {
                                    Integer num = axiyVar.a(slice).a;
                                    baowVar.h = num;
                                    if (num != null) {
                                        internalMediaCodecVideoEncoder.f180J += num.intValue();
                                    }
                                }
                                internalMediaCodecVideoEncoder.G++;
                                internalMediaCodecVideoEncoder.H += bufferInfo.size;
                                long nanoTime = System.nanoTime() - axjyVar.b;
                                internalMediaCodecVideoEncoder.I += nanoTime;
                                EncodedImage encodedImage = new EncodedImage(baowVar.a, baowVar.b, baowVar.c, baowVar.d, baowVar.e, baowVar.f, baowVar.g, baowVar.h);
                                internalMediaCodecVideoEncoder.j.a(encodedImage);
                                encodedImage.a.release();
                                int i5 = internalMediaCodecVideoEncoder.G;
                                if (i5 <= 10) {
                                    int i6 = bufferInfo.size;
                                    long a2 = InternalMediaCodecVideoEncoder.a(axjyVar.c);
                                    long j = encodedImage.e;
                                    long convert = TimeUnit.MILLISECONDS.convert(nanoTime, TimeUnit.NANOSECONDS);
                                    StringBuilder sb3 = new StringBuilder(152);
                                    sb3.append("Encoder frame out # ");
                                    sb3.append(i5 - 1);
                                    sb3.append(". Key: ");
                                    sb3.append(1 == i2);
                                    sb3.append(". Size: ");
                                    sb3.append(i6);
                                    sb3.append(". TS: ");
                                    sb3.append(a2);
                                    sb3.append(". Frame TS: ");
                                    sb3.append(j);
                                    sb3.append(". Enc time: ");
                                    sb3.append(convert);
                                    Logging.a("IMCVideoEncoder", sb3.toString());
                                }
                            }
                        } catch (IllegalStateException e2) {
                            Logging.c("IMCVideoEncoder", "deliverOutput failed", e2);
                            internalMediaCodecVideoEncoder.C = internalMediaCodecVideoEncoder.c();
                            internalMediaCodecVideoEncoder.n.b();
                        }
                    }
                    if (b == -3) {
                        internalMediaCodecVideoEncoder.g.a();
                        internalMediaCodecVideoEncoder.i = internalMediaCodecVideoEncoder.L.i();
                    }
                    internalMediaCodecVideoEncoder.g();
                    if (internalMediaCodecVideoEncoder.o.isEmpty()) {
                        internalMediaCodecVideoEncoder.n.a(100L);
                    }
                }
            }
        });
        this.ab = new axki(this.Y, new Runnable() { // from class: axjp
            @Override // java.lang.Runnable
            public final void run() {
                InternalMediaCodecVideoEncoder internalMediaCodecVideoEncoder = InternalMediaCodecVideoEncoder.this;
                internalMediaCodecVideoEncoder.g();
                if (internalMediaCodecVideoEncoder.G == internalMediaCodecVideoEncoder.E) {
                    internalMediaCodecVideoEncoder.h();
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                float f = ((float) (currentTimeMillis - internalMediaCodecVideoEncoder.D)) / 1000.0f;
                float f2 = internalMediaCodecVideoEncoder.G - internalMediaCodecVideoEncoder.E;
                Logging.a("IMCVideoEncoder", String.format(Locale.ENGLISH, "Statistics for last %s ms. Encoded frames: %s. Bitrate: %.0f kbps. Target: %s kbps. FPS: %.1f. Avg. encode time: %.1f ms. QP: %.1f.", Long.valueOf(currentTimeMillis - internalMediaCodecVideoEncoder.D), Integer.valueOf(internalMediaCodecVideoEncoder.G), Float.valueOf(((internalMediaCodecVideoEncoder.H * 8) / f) / 1000.0f), Integer.valueOf(internalMediaCodecVideoEncoder.A / 1000), Float.valueOf(f2 / f), Float.valueOf(((float) TimeUnit.NANOSECONDS.toMillis(internalMediaCodecVideoEncoder.I)) / f2), Float.valueOf(internalMediaCodecVideoEncoder.f180J / f2)));
                internalMediaCodecVideoEncoder.h();
            }
        });
        int i = settings.a;
        int i2 = settings.b;
        int i3 = settings.c;
        int i4 = settings.d;
        boolean i5 = i();
        StringBuilder sb = new StringBuilder(95);
        sb.append("initEncode: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        sb.append(". @ ");
        sb.append(i3);
        sb.append("kbps. Fps: ");
        sb.append(i4);
        sb.append(". Use  surface: ");
        sb.append(i5);
        Logging.a("IMCVideoEncoder", sb.toString());
        if (!i()) {
            Logging.b("IMCVideoEncoder", "No shared EglBase.Context. Encoders will not use texture mode.");
        }
        VideoCodecStatus b = b(new Callable() { // from class: axjv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InternalMediaCodecVideoEncoder internalMediaCodecVideoEncoder = InternalMediaCodecVideoEncoder.this;
                VideoEncoder.Settings settings2 = settings;
                VideoEncoder.Callback callback2 = callback;
                internalMediaCodecVideoEncoder.g();
                internalMediaCodecVideoEncoder.j = callback2;
                int i6 = settings2.e;
                if (i6 > 1) {
                    StringBuilder sb2 = new StringBuilder(75);
                    sb2.append("Falling back to software since ");
                    sb2.append(i6);
                    sb2.append(" simulcast streams are requested.");
                    Logging.a("IMCVideoEncoder", sb2.toString());
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
                internalMediaCodecVideoEncoder.A = 10000000;
                int i7 = settings2.c;
                if (i7 != 0) {
                    internalMediaCodecVideoEncoder.A = i7 * 1000;
                }
                double d = 30.0d;
                internalMediaCodecVideoEncoder.z = 30.0d;
                int i8 = settings2.d;
                if (i8 != 0) {
                    d = aneo.cp(i8);
                    internalMediaCodecVideoEncoder.z = d;
                }
                internalMediaCodecVideoEncoder.K.d(internalMediaCodecVideoEncoder.A, d);
                return internalMediaCodecVideoEncoder.e(settings2.a, settings2.b, internalMediaCodecVideoEncoder.i());
            }
        }, "encoder.init");
        if (b == VideoCodecStatus.OK) {
            this.h = true;
        } else {
            this.X.quit();
        }
        return b;
    }

    @Override // org.webrtc.VideoEncoder
    public final /* synthetic */ boolean isHardwareEncoder() {
        return true;
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus release() {
        this.W.a();
        Logging.a("IMCVideoEncoder", "release");
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.OK;
        if (this.h) {
            videoCodecStatus = b(new Callable() { // from class: axju
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return InternalMediaCodecVideoEncoder.this.f();
                }
            }, "encoder.release");
            this.X.quit();
            this.h = false;
        } else {
            Logging.d("IMCVideoEncoder", "Calling release on non-initialized codec.");
        }
        this.W.b();
        Logging.a("IMCVideoEncoder", "release done");
        return videoCodecStatus;
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        return j(rateControlParameters.a.a(), this.S.j ? rateControlParameters.b : Math.ceil(rateControlParameters.b));
    }
}
