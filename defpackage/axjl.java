package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EncodedImage;
import org.webrtc.Logging;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axjl implements VideoDecoder {
    public long A;
    public long B;
    private final String F;
    private final axip G;
    private baqo H;
    private boolean I;

    /* renamed from: J, reason: collision with root package name */
    private Looper f139J;
    private int K;
    private int L;
    private int M;
    private axki N;
    private boolean O;
    private int P;
    private int Q;
    private ByteBuffer[] R;
    public final axio a;
    public final amnv b;
    public final int c;
    public final boolean d;
    public Handler e;
    public final Queue g;
    public final Queue h;
    public axiy i;
    public int j;
    public int k;
    public axki l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public ByteBuffer[] s;
    public baqb t;
    public Surface u;
    public axjj v;
    public VideoDecoder.Callback w;
    public long x;
    public int y;
    public int z;
    public volatile boolean f = false;
    VideoCodecStatus r = VideoCodecStatus.OK;
    public axkc E = null;
    public final Object C = new Object();
    public int D = 0;

    public axjl(String str, axio axioVar, int i, axip axipVar, amnv amnvVar, boolean z) {
        if (amnvVar != null || p(i)) {
            this.F = str;
            this.a = axioVar;
            this.K = i;
            axipVar.getClass();
            this.G = axipVar;
            this.b = amnvVar;
            this.d = z;
            this.g = new ArrayDeque();
            this.h = new ArrayDeque();
            int i2 = 3;
            if ((axipVar.b & 8) != 0) {
                int i3 = axipVar.f;
                if (i3 > 0) {
                    i2 = i3;
                    this.c = i2;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Wrong value for maxPendingFrames: ");
                    sb.append(i3);
                    Logging.d("IMCVideoDecoder", sb.toString());
                }
            }
            axio axioVar2 = axio.UNKNOWN;
            int ordinal = axioVar.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                i2 = 1;
            } else if (ordinal != 3) {
                i2 = 2;
            }
            this.c = i2;
            return;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Unsupported color format: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static long b(long j) {
        return TimeUnit.MICROSECONDS.convert(j, TimeUnit.MILLISECONDS);
    }

    public static long c(long j) {
        return TimeUnit.MILLISECONDS.convert(j, TimeUnit.MICROSECONDS);
    }

    private static final boolean p(int i) {
        int[] iArr = axkb.b;
        int length = iArr.length;
        for (int i2 = 0; i2 < 7; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        i();
        try {
            return this.E.a(b(500L));
        } catch (IllegalStateException e) {
            Logging.c("IMCVideoDecoder", "dequeueInputBuffer failed", e);
            return -2;
        }
    }

    @Override // org.webrtc.VideoDecoder
    public final /* synthetic */ long createNativeVideoDecoder() {
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x055d, code lost:
    
        r2 = r27.K;
        r3 = new java.lang.StringBuilder(39);
        r3.append("Non supported color format: ");
        r3.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0575, code lost:
    
        throw new java.lang.IllegalStateException(r3.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0525 A[Catch: IllegalStateException -> 0x060c, TryCatch #2 {IllegalStateException -> 0x060c, blocks: (B:12:0x001a, B:13:0x001d, B:27:0x0436, B:29:0x0450, B:30:0x045b, B:32:0x0469, B:34:0x0471, B:36:0x0479, B:38:0x0481, B:41:0x049d, B:47:0x04bc, B:49:0x04c0, B:51:0x04f6, B:52:0x051f, B:54:0x0525, B:56:0x052d, B:58:0x0547, B:59:0x0551, B:63:0x055d, B:64:0x0575, B:66:0x054c, B:67:0x0576, B:69:0x057e, B:70:0x0586, B:72:0x058e, B:73:0x0596, B:75:0x04c4, B:76:0x04fb, B:77:0x04ab, B:79:0x0455, B:17:0x05de, B:20:0x0603), top: B:11:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0547 A[Catch: IllegalStateException -> 0x060c, TryCatch #2 {IllegalStateException -> 0x060c, blocks: (B:12:0x001a, B:13:0x001d, B:27:0x0436, B:29:0x0450, B:30:0x045b, B:32:0x0469, B:34:0x0471, B:36:0x0479, B:38:0x0481, B:41:0x049d, B:47:0x04bc, B:49:0x04c0, B:51:0x04f6, B:52:0x051f, B:54:0x0525, B:56:0x052d, B:58:0x0547, B:59:0x0551, B:63:0x055d, B:64:0x0575, B:66:0x054c, B:67:0x0576, B:69:0x057e, B:70:0x0586, B:72:0x058e, B:73:0x0596, B:75:0x04c4, B:76:0x04fb, B:77:0x04ab, B:79:0x0455, B:17:0x05de, B:20:0x0603), top: B:11:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x055d A[EDGE_INSN: B:62:0x055d->B:63:0x055d BREAK  A[LOOP:0: B:13:0x001d->B:22:0x001d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x054c A[Catch: IllegalStateException -> 0x060c, TryCatch #2 {IllegalStateException -> 0x060c, blocks: (B:12:0x001a, B:13:0x001d, B:27:0x0436, B:29:0x0450, B:30:0x045b, B:32:0x0469, B:34:0x0471, B:36:0x0479, B:38:0x0481, B:41:0x049d, B:47:0x04bc, B:49:0x04c0, B:51:0x04f6, B:52:0x051f, B:54:0x0525, B:56:0x052d, B:58:0x0547, B:59:0x0551, B:63:0x055d, B:64:0x0575, B:66:0x054c, B:67:0x0576, B:69:0x057e, B:70:0x0586, B:72:0x058e, B:73:0x0596, B:75:0x04c4, B:76:0x04fb, B:77:0x04ab, B:79:0x0455, B:17:0x05de, B:20:0x0603), top: B:11:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x057e A[Catch: IllegalStateException -> 0x060c, TryCatch #2 {IllegalStateException -> 0x060c, blocks: (B:12:0x001a, B:13:0x001d, B:27:0x0436, B:29:0x0450, B:30:0x045b, B:32:0x0469, B:34:0x0471, B:36:0x0479, B:38:0x0481, B:41:0x049d, B:47:0x04bc, B:49:0x04c0, B:51:0x04f6, B:52:0x051f, B:54:0x0525, B:56:0x052d, B:58:0x0547, B:59:0x0551, B:63:0x055d, B:64:0x0575, B:66:0x054c, B:67:0x0576, B:69:0x057e, B:70:0x0586, B:72:0x058e, B:73:0x0596, B:75:0x04c4, B:76:0x04fb, B:77:0x04ab, B:79:0x0455, B:17:0x05de, B:20:0x0603), top: B:11:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x058e A[Catch: IllegalStateException -> 0x060c, TryCatch #2 {IllegalStateException -> 0x060c, blocks: (B:12:0x001a, B:13:0x001d, B:27:0x0436, B:29:0x0450, B:30:0x045b, B:32:0x0469, B:34:0x0471, B:36:0x0479, B:38:0x0481, B:41:0x049d, B:47:0x04bc, B:49:0x04c0, B:51:0x04f6, B:52:0x051f, B:54:0x0525, B:56:0x052d, B:58:0x0547, B:59:0x0551, B:63:0x055d, B:64:0x0575, B:66:0x054c, B:67:0x0576, B:69:0x057e, B:70:0x0586, B:72:0x058e, B:73:0x0596, B:75:0x04c4, B:76:0x04fb, B:77:0x04ab, B:79:0x0455, B:17:0x05de, B:20:0x0603), top: B:11:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.webrtc.VideoCodecStatus d(long r28) {
        /*
            Method dump skipped, instructions count: 1561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axjl.d(long):org.webrtc.VideoCodecStatus");
    }

    @Override // org.webrtc.VideoDecoder
    public final VideoCodecStatus decode(final EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        this.H.a();
        ByteBuffer byteBuffer = encodedImage.b;
        if (byteBuffer == null) {
            Logging.b("IMCVideoDecoder", "decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        if (byteBuffer.remaining() == 0) {
            Logging.b("IMCVideoDecoder", "decode() - input buffer empty");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        if (!this.I) {
            Logging.b("IMCVideoDecoder", "decode() - not initialized");
            return VideoCodecStatus.UNINITIALIZED;
        }
        VideoCodecStatus e = e(new Callable() { // from class: axjf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                VideoCodecStatus f;
                axjl axjlVar = axjl.this;
                EncodedImage encodedImage2 = encodedImage;
                axjlVar.i();
                axkc axkcVar = axjlVar.E;
                if (axkcVar == null || axjlVar.w == null) {
                    String valueOf = String.valueOf(axkcVar);
                    String valueOf2 = String.valueOf(axjlVar.w);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
                    sb.append("decode uninitialized, codec: ");
                    sb.append(valueOf);
                    sb.append(", callback: ");
                    sb.append(valueOf2);
                    Logging.d("IMCVideoDecoder", sb.toString());
                    return VideoCodecStatus.UNINITIALIZED;
                }
                if (!axjlVar.f) {
                    Logging.d("IMCVideoDecoder", "decodeInternal: Decoder is not running.");
                    return VideoCodecStatus.OK;
                }
                if (axjlVar.r != VideoCodecStatus.OK) {
                    String valueOf3 = String.valueOf(axjlVar.r);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 34);
                    sb2.append("decodeInternal: Poll loop not OK: ");
                    sb2.append(valueOf3);
                    Logging.b("IMCVideoDecoder", sb2.toString());
                    return axjlVar.r;
                }
                int i = encodedImage2.c;
                int i2 = encodedImage2.d;
                if (i * i2 > 0 && (i != axjlVar.j || i2 != axjlVar.k)) {
                    Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "Input resolution changed from %s x %s to %s x %s", Integer.valueOf(axjlVar.j), Integer.valueOf(axjlVar.k), Integer.valueOf(encodedImage2.c), Integer.valueOf(encodedImage2.d)));
                    VideoCodecStatus videoCodecStatus = VideoCodecStatus.OK;
                    if (!axjlVar.o()) {
                        int i3 = encodedImage2.c;
                        int i4 = encodedImage2.d;
                        axjlVar.i();
                        VideoCodecStatus h = axjlVar.h();
                        videoCodecStatus = h != VideoCodecStatus.OK ? h : axjlVar.g(i3, i4);
                    } else if (axjlVar.d) {
                        Logging.a("IMCVideoDecoder", "Ignore resolution change - expect INFO_OUTPUT_FORMAT_CHANGED");
                    } else {
                        int i5 = encodedImage2.c;
                        int i6 = encodedImage2.d;
                        axjlVar.i();
                        StringBuilder sb3 = new StringBuilder(43);
                        sb3.append("softReinitDecode: ");
                        sb3.append(i5);
                        sb3.append(" x ");
                        sb3.append(i6);
                        Logging.a("IMCVideoDecoder", sb3.toString());
                        axjlVar.f = false;
                        axjlVar.l.b();
                        try {
                            axjlVar.E.a.flush();
                            axjlVar.j = i5;
                            axjlVar.k = i6;
                            axjlVar.k();
                            axjlVar.f = true;
                            Logging.a("IMCVideoDecoder", "softReinitDecode done.");
                            videoCodecStatus = VideoCodecStatus.OK;
                        } catch (IllegalStateException e2) {
                            Logging.c("IMCVideoDecoder", "codec.flush failed", e2);
                            videoCodecStatus = VideoCodecStatus.FALLBACK_SOFTWARE;
                        }
                    }
                    if (videoCodecStatus != VideoCodecStatus.OK) {
                        Logging.b("IMCVideoDecoder", "reinitDecode fails");
                        return videoCodecStatus;
                    }
                }
                if (!axjlVar.m || encodedImage2.f == EncodedImage.FrameType.VideoFrameKey) {
                    long j = 0;
                    if (axjlVar.n > axjlVar.o + axjlVar.c) {
                        if (axjlVar.a == axio.H264 || axjlVar.a == axio.H265X) {
                            int i7 = axjlVar.n;
                            int i8 = axjlVar.o;
                            StringBuilder sb4 = new StringBuilder(84);
                            sb4.append("Decoder is too far behind. Try to drain. Received: ");
                            sb4.append(i7);
                            sb4.append(". Decoded: ");
                            sb4.append(i8);
                            Logging.d("IMCVideoDecoder", sb4.toString());
                            axjlVar.j();
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        while (true) {
                            if (SystemClock.elapsedRealtime() - elapsedRealtime < 1000) {
                                f = axjlVar.d(j);
                                if (f != VideoCodecStatus.OK) {
                                    int i9 = axjlVar.n;
                                    int i10 = axjlVar.o;
                                    StringBuilder sb5 = new StringBuilder(86);
                                    sb5.append("DeliverPendingOutputs error. Frames received: ");
                                    sb5.append(i9);
                                    sb5.append(". Frames decoded: ");
                                    sb5.append(i10);
                                    Logging.b("IMCVideoDecoder", sb5.toString());
                                    break;
                                }
                                if (axjlVar.o()) {
                                    axjlVar.m();
                                }
                                if (axjlVar.n <= axjlVar.o + axjlVar.c) {
                                    f = VideoCodecStatus.OK;
                                    break;
                                }
                                try {
                                    Thread.sleep(10L);
                                    j = 0;
                                } catch (InterruptedException e3) {
                                    Logging.c("IMCVideoDecoder", "Interrupted while draining decoder.", e3);
                                    f = VideoCodecStatus.ERROR;
                                }
                            } else {
                                int i11 = axjlVar.n;
                                int i12 = axjlVar.o;
                                StringBuilder sb6 = new StringBuilder(88);
                                sb6.append("Output buffer dequeue timeout. Frames received: ");
                                sb6.append(i11);
                                sb6.append(". Frames decoded: ");
                                sb6.append(i12);
                                Logging.b("IMCVideoDecoder", sb6.toString());
                                f = axjlVar.f();
                                break;
                            }
                        }
                        if (f != VideoCodecStatus.OK) {
                            return f;
                        }
                    }
                    int a = axjlVar.a();
                    if (a < 0) {
                        int i13 = axjlVar.n;
                        int i14 = axjlVar.o;
                        StringBuilder sb7 = new StringBuilder(99);
                        sb7.append("Input buffers are not available. Try to deliver output. Received: ");
                        sb7.append(i13);
                        sb7.append(". Decoded: ");
                        sb7.append(i14);
                        Logging.d("IMCVideoDecoder", sb7.toString());
                        if (axjlVar.d(axjl.b(10L)) != VideoCodecStatus.OK) {
                            int i15 = axjlVar.n;
                            int i16 = axjlVar.o;
                            StringBuilder sb8 = new StringBuilder(86);
                            sb8.append("DeliverPendingOutputs error. Frames received: ");
                            sb8.append(i15);
                            sb8.append(". Frames decoded: ");
                            sb8.append(i16);
                            Logging.b("IMCVideoDecoder", sb8.toString());
                            return axjlVar.f();
                        }
                        a = axjlVar.a();
                        if (a < 0) {
                            Logging.b("IMCVideoDecoder", "decode() - no HW input buffers available");
                            return axjlVar.f();
                        }
                    }
                    int remaining = encodedImage2.b.remaining();
                    ByteBuffer byteBuffer2 = axjlVar.s[a];
                    if (byteBuffer2.capacity() < remaining) {
                        int capacity = byteBuffer2.capacity();
                        StringBuilder sb9 = new StringBuilder(68);
                        sb9.append("HW buffer too small. Buffer size ");
                        sb9.append(capacity);
                        sb9.append(". Frame size ");
                        sb9.append(remaining);
                        Logging.b("IMCVideoDecoder", sb9.toString());
                        return axjlVar.f();
                    }
                    byteBuffer2.put(encodedImage2.b);
                    long micros = (axjlVar.n * TimeUnit.SECONDS.toMicros(1L)) / 30;
                    if (axjlVar.p <= axjlVar.q) {
                        Locale locale = Locale.ENGLISH;
                        Object[] objArr = new Object[4];
                        objArr[0] = Integer.valueOf(axjlVar.n);
                        objArr[1] = Boolean.valueOf(encodedImage2.f == EncodedImage.FrameType.VideoFrameKey);
                        objArr[2] = Long.valueOf(axjl.c(micros));
                        objArr[3] = Integer.valueOf(remaining);
                        Logging.a("IMCVideoDecoder", String.format(locale, "Decoder frame in # %s. Key: %s. TS: %s. Size: %s", objArr));
                    }
                    axjlVar.n++;
                    axjlVar.z += remaining;
                    try {
                        axjlVar.E.k(a, remaining, micros);
                        axiy axiyVar = axjlVar.i;
                        axjlVar.g.offer(new axji(SystemClock.elapsedRealtime(), encodedImage2.e, encodedImage2.g, axiyVar != null ? axiyVar.a(encodedImage2.b).a : null));
                        axjlVar.m = false;
                        if (axjlVar.n > axjlVar.o) {
                            axjlVar.l.a(10L);
                        }
                        return axjlVar.d(0L);
                    } catch (IllegalStateException e4) {
                        Logging.c("IMCVideoDecoder", "queueInputBuffer failed", e4);
                        return axjlVar.f();
                    }
                }
                Logging.b("IMCVideoDecoder", "decode() - key frame required first");
                return VideoCodecStatus.NO_OUTPUT;
            }
        }, "decoder.decode");
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.REQUEST_SLI;
        return e;
    }

    protected final VideoCodecStatus e(Callable callable, String str) {
        return awxs.e(this.e, callable, str);
    }

    public final VideoCodecStatus f() {
        i();
        int i = this.Q + 1;
        this.Q = i;
        StringBuilder sb = new StringBuilder(21);
        sb.append("HW error #");
        sb.append(i);
        Logging.b("IMCVideoDecoder", sb.toString());
        if (this.Q <= 3) {
            return VideoCodecStatus.ERROR;
        }
        return VideoCodecStatus.FALLBACK_SOFTWARE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:18:0x0084, B:20:0x008e, B:22:0x0097, B:23:0x009a), top: B:17:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097 A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:18:0x0084, B:20:0x008e, B:22:0x0097, B:23:0x009a), top: B:17:0x0084 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.webrtc.VideoCodecStatus g(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axjl.g(int, int):org.webrtc.VideoCodecStatus");
    }

    @Override // org.webrtc.VideoDecoder
    public final String getImplementationName() {
        String valueOf = String.valueOf(this.F);
        return valueOf.length() != 0 ? "IMC: ".concat(valueOf) : new String("IMC: ");
    }

    public final VideoCodecStatus h() {
        i();
        if (!this.f) {
            Logging.a("IMCVideoDecoder", "stopDecodeInternal: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "stopDecodeInternal. Frames received: %s. Frames decoded: %s. Frames delivered: %s. Decoded frames dropped: %s", Integer.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.P)));
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.OK;
        this.f = false;
        this.l.b();
        this.N.b();
        i();
        synchronized (this.C) {
            while (this.D > 0) {
                Logging.a("IMCVideoDecoder", "Waiting for all frames to be released.");
                try {
                    this.C.wait();
                } catch (InterruptedException e) {
                    Logging.c("IMCVideoDecoder", "Interrupted while waiting for output buffers to be released.", e);
                }
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Exception[] excArr = new Exception[1];
        new Thread(new Runnable() { // from class: axjd
            @Override // java.lang.Runnable
            public final void run() {
                axjl axjlVar = axjl.this;
                Exception[] excArr2 = excArr;
                CountDownLatch countDownLatch2 = countDownLatch;
                try {
                    Logging.a("IMCVideoDecoder", "MediaCodec release on release thread");
                    axjlVar.E.g();
                    axjlVar.E.c();
                    Logging.a("IMCVideoDecoder", "MediaCodec release on release thread done");
                } catch (Exception e2) {
                    Logging.c("IMCVideoDecoder", "MediaCodec release failed", e2);
                    excArr2[0] = e2;
                }
                countDownLatch2.countDown();
            }
        }, "IMCVideoDecoder.release").start();
        try {
            if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                Logging.b("IMCVideoDecoder", "Media decoder release timeout");
                videoCodecStatus = VideoCodecStatus.ERROR;
            }
            Exception exc = excArr[0];
            if (exc != null) {
                Logging.c("IMCVideoDecoder", "Media encoder release error", exc);
                videoCodecStatus = VideoCodecStatus.ERROR;
            }
            if (o()) {
                this.v.a();
            }
            this.g.clear();
            this.h.clear();
            this.E = null;
            Logging.a("IMCVideoDecoder", "stopDecodeInternal done");
            return videoCodecStatus;
        } catch (InterruptedException e2) {
            Logging.c("IMCVideoDecoder", "Interrupted", e2);
            Thread.currentThread().interrupt();
            return VideoCodecStatus.ERROR;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        if (!this.f139J.isCurrentThread()) {
            throw new AssertionError("Not called on the codec thread.");
        }
    }

    @Override // org.webrtc.VideoDecoder
    public final VideoCodecStatus initDecode(final VideoDecoder.Settings settings, final VideoDecoder.Callback callback) {
        this.H = new baqo();
        Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "initDecode: %s: %s x %s. Color: 0x%X. Use surface: %s. Max pending frames: %s.", this.a, Integer.valueOf(settings.a), Integer.valueOf(settings.b), Integer.valueOf(this.K), Boolean.valueOf(o()), Integer.valueOf(this.c)));
        if (this.I) {
            Logging.b("IMCVideoDecoder", "initDecode called without releasing previous decoder");
            return VideoCodecStatus.ERROR;
        }
        if (!o()) {
            Logging.b("IMCVideoDecoder", "No shared EglBase.Context. Decoders will not use texture mode.");
            if (this.K == 0) {
                Logging.b("IMCVideoDecoder", "Color format is not recognized. Only surface decoding is supported.");
                return VideoCodecStatus.ERROR;
            }
        }
        if (this.f139J != null) {
            try {
                Logging.a("IMCVideoDecoder", "codecThread join");
                this.f139J.getThread().join();
                Logging.a("IMCVideoDecoder", "codecThread join done");
            } catch (InterruptedException unused) {
                Logging.b("IMCVideoDecoder", "Interrupted while waiting for old codec to stop.");
                return VideoCodecStatus.ERROR;
            }
        }
        HandlerThread handlerThread = new HandlerThread("IMCVideoDecoder");
        handlerThread.start();
        this.f139J = handlerThread.getLooper();
        this.e = new Handler(this.f139J);
        this.l = new axki(this.e, new axjb(this, 1));
        this.N = new axki(this.e, new axjb(this, 0));
        VideoCodecStatus e = e(new Callable() { // from class: axjg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                axjl axjlVar = axjl.this;
                VideoDecoder.Settings settings2 = settings;
                VideoDecoder.Callback callback2 = callback;
                int i = settings2.a;
                int i2 = settings2.b;
                boolean o = axjlVar.o();
                StringBuilder sb = new StringBuilder(37);
                sb.append("initDecodeInternal. useSurface: ");
                sb.append(o);
                Logging.a("IMCVideoDecoder", sb.toString());
                axjlVar.i();
                axjlVar.i = axkb.a(axjlVar.a);
                axjlVar.w = callback2;
                if (axjlVar.o()) {
                    Logging.a("IMCVideoDecoder", "Create SurfaceTextureHelper");
                    baog baogVar = (baog) ((amny) axjlVar.b).a;
                    bara baraVar = new bara();
                    HandlerThread handlerThread2 = new HandlerThread("decoder-texture-thread");
                    handlerThread2.start();
                    Handler handler = new Handler(handlerThread2.getLooper());
                    axjlVar.t = (baqb) aype.v(handler, new bapz(baogVar, handler, baraVar));
                    axjlVar.u = new Surface(axjlVar.t.b);
                    axjlVar.v = new axjj(axjlVar, axjlVar.t);
                    baqb baqbVar = axjlVar.t;
                    axjj axjjVar = axjlVar.v;
                    if (baqbVar.c != null || baqbVar.j != null) {
                        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
                    }
                    baqbVar.j = axjjVar;
                    baqbVar.a.post(baqbVar.k);
                }
                return axjlVar.g(i, i2);
            }
        }, "decoder.init");
        if (e == VideoCodecStatus.OK) {
            this.I = true;
        } else {
            this.f139J.quit();
        }
        String valueOf = String.valueOf(e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("initDecode done: ");
        sb.append(valueOf);
        Logging.a("IMCVideoDecoder", sb.toString());
        return e;
    }

    public final void j() {
        this.q = Math.max(this.p + 1, 15);
    }

    public final void k() {
        this.L = this.j;
        this.M = this.k;
        this.O = false;
        this.m = true;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.P = 0;
        this.q = 15;
        this.g.clear();
        this.h.clear();
        if (o()) {
            this.v.a();
        }
        this.r = VideoCodecStatus.OK;
        l();
    }

    public final void l() {
        this.x = SystemClock.elapsedRealtime();
        this.y = this.p;
        this.z = 0;
        this.A = 0L;
        this.B = 0L;
    }

    public final boolean m() {
        axjk axjkVar;
        i();
        if (!this.f) {
            return false;
        }
        axjj axjjVar = this.v;
        synchronized (axjjVar.a) {
            axjkVar = null;
            if (axjjVar.e == 3) {
                axjjVar.e = 1;
                VideoFrame videoFrame = axjjVar.c;
                axjjVar.c = null;
                axjh axjhVar = axjjVar.b;
                axjkVar = new axjk(videoFrame, (int) Math.min(200L, axjhVar.e - axjhVar.f.a), axjjVar.b.f);
            }
        }
        if (axjkVar != null) {
            this.p++;
            this.A += axjkVar.b;
            this.B += SystemClock.elapsedRealtime() - axjkVar.c.a;
            this.w.a(axjkVar.a, Integer.valueOf(axjkVar.b), axjkVar.c.d);
            axjkVar.a.release();
            if (this.h.size() > 0) {
                return this.v.b();
            }
        }
        return false;
    }

    public final boolean n(int i, boolean z) {
        try {
            this.E.d(i, z);
            return true;
        } catch (IllegalStateException e) {
            Logging.c("IMCVideoDecoder", "releaseOutputBuffer failed", e);
            return false;
        }
    }

    public final boolean o() {
        amnv amnvVar = this.b;
        return (amnvVar == null || ((amny) amnvVar).a == null) ? false : true;
    }

    @Override // org.webrtc.VideoDecoder
    public final VideoCodecStatus release() {
        Logging.a("IMCVideoDecoder", "release");
        if (!this.I) {
            Logging.d("IMCVideoDecoder", "Calling release for non initialized codec");
            return VideoCodecStatus.OK;
        }
        VideoCodecStatus e = e(new Callable() { // from class: axje
            @Override // java.util.concurrent.Callable
            public final Object call() {
                axjl axjlVar = axjl.this;
                axjlVar.i();
                if (!axjlVar.f) {
                    Logging.a("IMCVideoDecoder", "release: Decoder is not running.");
                    return VideoCodecStatus.OK;
                }
                VideoCodecStatus h = axjlVar.h();
                if (axjlVar.o()) {
                    if (axjlVar.u != null) {
                        Logging.a("IMCVideoDecoder", "Release Surface");
                        axjlVar.u.release();
                        axjlVar.u = null;
                    }
                    if (axjlVar.t != null) {
                        Logging.a("IMCVideoDecoder", "Release surfaceTextureHelper");
                        baqb baqbVar = axjlVar.t;
                        Logging.a("SurfaceTextureHelper", "stopListening()");
                        baqbVar.a.removeCallbacks(baqbVar.k);
                        aype.y(baqbVar.a, new bapw(baqbVar, 2));
                        axjlVar.v.a();
                        baqb baqbVar2 = axjlVar.t;
                        Logging.a("SurfaceTextureHelper", "dispose()");
                        aype.y(baqbVar2.a, new bapw(baqbVar2, 1));
                        axjlVar.t = null;
                        axjlVar.v = null;
                    }
                }
                axiy axiyVar = axjlVar.i;
                if (axiyVar != null) {
                    axiyVar.b();
                    axjlVar.i = null;
                }
                axjlVar.w = null;
                return h;
            }
        }, "decoder.release");
        this.f139J.quit();
        this.I = false;
        Logging.a("IMCVideoDecoder", "release done");
        return e;
    }
}
