package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zmv implements Runnable, vth, zmh {
    long A;
    long B;
    public long C;
    public long D;
    public int E;
    public int F;
    public zog G;
    public final boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public zmt f281J;
    public zmu K;
    public int L;
    public final boolean M;
    public heg N;
    private final int O;
    private final vum P;
    private final boolean Q;
    private int S;
    private int T;
    private MediaFormat U;
    private MediaFormat V;
    private final EGLContext W;
    private vtt X;
    private final int Y;
    private vwa Z;
    vti b;
    vti c;
    public axe d;
    public zmi e;
    public vwb f;
    boolean g;
    public vtu h;
    public final int k;
    public final int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public float q;
    public Thread s;
    public Handler t;
    Looper u;
    public boolean v;
    long x;
    public long y;
    public long z;
    public int a = 0;
    public boolean i = false;
    public float r = 1.0f;
    public boolean w = false;
    private final Object R = new Object();
    public final Object j = new Object();

    public zmv(EGLContext eGLContext, vum vumVar, boolean z, int i, int i2, int i3, int i4, Context context, boolean z2, boolean z3) {
        this.W = eGLContext;
        this.P = vumVar;
        this.H = z;
        this.k = i;
        this.l = i2;
        this.O = i3;
        this.Y = i4;
        this.Q = z2;
        this.M = z3;
        if (context != null && z2 && aih.c(context, "android.permission.RECORD_AUDIO") == 0) {
            n();
        }
    }

    public static boolean k(float f) {
        return Math.abs(f + (-1.0f)) >= 0.01f;
    }

    private final void n() {
        amkq.N(this.e == null);
        int i = this.Y;
        amkq.N(i > 0 && i <= 2);
        zmi zmiVar = new zmi(this.Y);
        this.e = zmiVar;
        zmiVar.a = this;
        zmiVar.c();
    }

    @Override // defpackage.vth
    public final void a(vti vtiVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        byteBuffer.getClass();
        if ((bufferInfo.flags & 2) == 0 && bufferInfo.size != 0) {
            synchronized (this.R) {
                while (true) {
                    z = this.g;
                    if (z || this.a >= 5) {
                        break;
                    } else {
                        try {
                            this.R.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                if (z && this.Z != null) {
                    int i = vtiVar == this.b ? this.S : this.T;
                    amkq.E(i >= 0);
                    try {
                        this.Z.f(i, byteBuffer, bufferInfo);
                        if (vtiVar == this.b) {
                            this.F++;
                        }
                    } catch (IOException e) {
                        zga.b("Failed to write sample data.");
                        throw new IllegalStateException(e);
                    }
                }
            }
        }
    }

    @Override // defpackage.vth
    public final void b(vti vtiVar, MediaFormat mediaFormat) {
        synchronized (this.R) {
            if (vtiVar == this.b) {
                if (this.U != null) {
                    throw new RuntimeException("Multiple video tracks specified.");
                }
                this.U = mediaFormat;
            } else if (this.V == null) {
                this.V = mediaFormat;
                if (k(this.r)) {
                    try {
                        this.d.a(new avp(this.V.getInteger("sample-rate"), this.V.getInteger("channel-count"), 2));
                    } catch (avq unused) {
                        zga.c("SonicAudioProcessor UnhandledAudioFormatException", "The input audio format has to be C.ENCODING_PCM_16BIT.");
                    }
                    this.d.c();
                }
            } else {
                throw new RuntimeException("Multiple audio tracks specified.");
            }
            MediaFormat mediaFormat2 = this.U;
            if (mediaFormat2 != null && this.a != 5 && this.V != null) {
                this.S = this.Z.a(mediaFormat2);
                MediaFormat mediaFormat3 = this.V;
                if (mediaFormat3 != null) {
                    this.T = this.Z.a(mediaFormat3);
                }
                try {
                    this.Z.d();
                    this.g = true;
                    this.R.notifyAll();
                } catch (IOException e) {
                    zga.b("Failed to start media muxer.");
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    public final long c() {
        if (this.x < 0) {
            return 0L;
        }
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        return TimeUnit.NANOSECONDS.toMillis(((float) ((this.A - this.x) + (((float) nanos) / this.q))) / this.r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.X.c(((float) (this.A - this.x)) / this.r);
        this.X.d();
        this.B = this.A;
    }

    public final synchronized void e(int i) {
        this.L = i;
        if (!this.w || (this.v && this.a < 4)) {
            return;
        }
        int i2 = 1;
        this.v = true;
        if (this.a < 4) {
            return;
        }
        this.w = false;
        zmt zmtVar = this.f281J;
        if (zmtVar != null) {
            ((hel) zmtVar).ar.execute(new hdx((hel) zmtVar, i2));
        }
        f();
    }

    public final void f() {
        this.w = false;
        synchronized (this) {
            j(1);
            this.t.post(new Runnable() { // from class: zmr
                @Override // java.lang.Runnable
                public final void run() {
                    zmv zmvVar = zmv.this;
                    if (zmvVar.A > zmvVar.B && !zmvVar.l(zmvVar.c())) {
                        zmvVar.d();
                    }
                    zmvVar.u.quit();
                }
            });
        }
    }

    public final void g() {
        synchronized (this.j) {
            this.i = false;
            this.j.notify();
        }
    }

    public final void h(int i) {
        synchronized (this) {
            this.a = i;
            notifyAll();
        }
    }

    public final void i() {
        h(this.y > 0 ? 3 : 4);
    }

    public final void j(int i) {
        synchronized (this) {
            while (this.a < i) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public final boolean l(long j) {
        long j2 = this.z;
        return j2 != 0 && j >= j2;
    }

    public final boolean m() {
        int i;
        return this.w && ((i = this.a) == 3 || i == 4);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.prepare();
        synchronized (this) {
            this.t = new Handler();
            this.u = Looper.myLooper();
            h(1);
        }
        int i = 0;
        this.g = false;
        vur a = this.P.a("video/avc", true);
        if (a != null) {
            int i2 = this.o;
            int i3 = this.p;
            float f = this.q;
            int i4 = this.O;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i2, i3);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", i4);
            createVideoFormat.setFloat("frame-rate", f);
            createVideoFormat.setInteger("i-frame-interval", 2);
            this.S = -1;
            this.U = null;
            vti vtiVar = new vti(a, createVideoFormat);
            this.b = vtiVar;
            vtiVar.a = this;
            vur a2 = this.P.a("audio/mp4a-latm", true);
            if (a2 != null) {
                this.T = -1;
                this.V = null;
                MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, this.Y);
                createAudioFormat.setInteger("bitrate", 128000);
                createAudioFormat.setInteger("max-input-size", 20000);
                vti vtiVar2 = new vti(a2, createAudioFormat);
                this.c = vtiVar2;
                vtiVar2.a = this;
                if (k(this.r)) {
                    axe axeVar = new axe();
                    this.d = axeVar;
                    axeVar.i(this.r);
                    try {
                        this.d.a(new avp(44100, this.Y, 2));
                    } catch (avq unused) {
                        zga.c("SonicAudioProcessor UnhandledAudioFormatException", "The input audio format has to be C.ENCODING_PCM_16BIT.");
                    }
                    this.d.c();
                }
                vtt vttVar = new vtt(this.W, this.b.a());
                this.X = vttVar;
                vttVar.a();
                this.h = new vtu();
                try {
                    vwa vwaVar = new vwa(((zmg) this.f).a.toString());
                    this.Z = vwaVar;
                    int i5 = (this.m + this.n) % 360;
                    if (i5 >= 180) {
                        vwaVar.c((i5 + 180) % 360);
                    } else {
                        vwaVar.c(i5);
                    }
                    this.b.g();
                    this.c.g();
                    this.x = -1L;
                    this.A = -1L;
                    this.D = 0L;
                    if (this.e == null) {
                        n();
                    }
                    synchronized (this) {
                        h(2);
                        zmt zmtVar = this.f281J;
                        if (zmtVar != null) {
                            if (((hel) zmtVar).al.a() != null) {
                                ((hel) zmtVar).ar.execute(new hdx((hel) zmtVar, i));
                            } else {
                                ((hel) zmtVar).ay.y();
                            }
                        } else {
                            i();
                        }
                        if (this.v) {
                            e(0);
                        }
                    }
                    Looper.loop();
                    h(5);
                    synchronized (this.R) {
                        this.R.notifyAll();
                    }
                    this.t.removeCallbacksAndMessages(null);
                    g();
                    this.e.d();
                    if (k(this.r)) {
                        this.d.d();
                        while (!this.d.h()) {
                            long a3 = this.e.a(this.D);
                            ByteBuffer b = this.d.b();
                            int limit = b.limit();
                            this.c.d(b, limit, a3);
                            this.D += limit;
                        }
                    }
                    long a4 = this.e.a(this.D);
                    if (this.Q) {
                        this.e.c();
                    } else {
                        this.e.b();
                        this.e = null;
                    }
                    synchronized (this.R) {
                        if (this.g) {
                            this.c.c(a4);
                        }
                    }
                    synchronized (this.R) {
                        if (this.g) {
                            this.b.f();
                            while (true) {
                                vti vtiVar3 = this.b;
                                if (vtiVar3.c == 2 || this.c.c == 2) {
                                    vtiVar3.b(10000L);
                                    this.c.b(10000L);
                                } else {
                                    try {
                                        break;
                                    } catch (IOException | IllegalStateException e) {
                                        zga.d("Failed to stop media muxer.", e);
                                    }
                                }
                            }
                            this.Z.e();
                        }
                        try {
                            this.Z.b();
                        } catch (IllegalStateException e2) {
                            zga.d("Failed to release media muxer.", e2);
                        }
                        this.Z = null;
                    }
                    this.b.h();
                    this.b.e();
                    this.b = null;
                    this.c.h();
                    this.c.e();
                    this.c = null;
                    vtt vttVar2 = this.X;
                    if (vttVar2 != null) {
                        vttVar2.a();
                        this.h.b();
                        this.X.b();
                    }
                    this.h = null;
                    this.X = null;
                    if (this.g) {
                        this.G = new zog(this.o, this.p, c(), this.r, 1 != this.I ? 3 : 2);
                    }
                    synchronized (this) {
                        this.t = null;
                        h(6);
                    }
                    zmu zmuVar = this.K;
                    if (zmuVar != null) {
                        zmuVar.aO(this.G, this.L);
                        return;
                    } else {
                        zga.l("RecordingStoppedListener is null! Recording stopped and discarded.");
                        return;
                    }
                } catch (IOException e3) {
                    zga.b("Failed to create media muxer.");
                    throw new IllegalStateException(e3);
                }
            }
            throw new RuntimeException("Failed to create audio encoder.");
        }
        throw new IllegalStateException("Failed to create video encoder.");
    }
}
