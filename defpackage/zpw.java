package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.google.mediapipe.framework.MediaPipeException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zpw implements SurfaceTexture.OnFrameAvailableListener, zqk {
    public static final /* synthetic */ int L = 0;
    public zpv A;
    public zpu B;
    public zqs C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* renamed from: J, reason: collision with root package name */
    public zrp f282J;
    public int K;
    private int M;
    private int N;
    private zpd O;
    private zpd Q;
    private int R;
    private int S;
    private int T;
    private final boolean U;
    public final Thread a;
    public final Handler b;
    public final zpk c;
    public boolean d;
    public boolean e;
    public boolean f;
    public zpe g;
    public long h;
    public volatile boolean j;
    public arz l;
    public SurfaceTexture m;
    public boolean n;
    public arz q;
    public Surface s;
    public SurfaceTexture t;
    public volatile zpe u;
    public int v;
    public int w;
    public final zsc x;
    public zpo y;
    public long z;
    public final zpt k = new zpt(this);
    private final float[] P = new float[16];
    final List r = new ArrayList();
    public final Runnable I = new zpl(this, 1);
    public int i = Integer.MAX_VALUE;
    public int o = 0;
    public float p = 0.0f;

    public zpw(zsc zscVar, Looper looper, final EGLContext eGLContext, boolean z) {
        this.E = true;
        this.x = zscVar;
        Thread thread = looper.getThread();
        thread.getClass();
        this.a = thread;
        this.E = z;
        this.U = z;
        d(2);
        zpn zpnVar = new zpn(looper, this);
        this.b = zpnVar;
        this.c = new zpk(this);
        zpnVar.post(new Runnable() { // from class: zpm
            @Override // java.lang.Runnable
            public final void run() {
                zpw zpwVar = zpw.this;
                EGLContext eGLContext2 = eGLContext;
                Thread.currentThread().getId();
                synchronized (zpwVar.a) {
                    if (eGLContext2 != null) {
                        zpwVar.g = zpe.l(1, 1, eGLContext2);
                    } else {
                        zpwVar.g = zpe.m(1, 1);
                    }
                    zpwVar.g.e();
                    zpe.h(zpwVar.g);
                    if (eGLContext2 == null) {
                        eGLContext2 = EGL14.eglGetCurrentContext();
                    }
                    zpwVar.h = eGLContext2.getNativeHandle();
                    zpwVar.a.notifyAll();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(zpe zpeVar) {
        if (zpeVar != null) {
            try {
                zpeVar.g();
            } catch (RuntimeException e) {
                zga.d("PresetFilterDebug, releaseRenderTargetSafe: release failed: ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(arz arzVar) {
        if (arzVar != null) {
            try {
                arzVar.d();
            } catch (RuntimeException e) {
                zga.d("releaseTextureSourceSafe: release failed: ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r() {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        String hexString = Integer.toHexString(eglGetError);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 63);
        sb.append("Error executing eglMakeCurrent (internalRedraw)! EGL error = 0x");
        sb.append(hexString);
        throw new RuntimeException(sb.toString());
    }

    static final long s() {
        return TimeUnit.MICROSECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a() {
        if (!this.a.isAlive()) {
            return 0L;
        }
        synchronized (this.a) {
            while (this.a.isAlive() && this.h == 0) {
                try {
                    this.a.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return this.h;
    }

    public final void b() {
        if (this.G) {
            this.G = false;
            this.b.removeCallbacks(this.I);
        }
    }

    public final void c() {
        if (!this.b.hasMessages(14, true)) {
            Handler handler = this.b;
            handler.sendMessage(handler.obtainMessage(14, true));
        } else {
            if (this.d) {
                return;
            }
            this.b.removeMessages(14);
            Handler handler2 = this.b;
            handler2.sendMessage(handler2.obtainMessage(14, true));
        }
    }

    public final void d(int i) {
        if (i >= this.r.size()) {
            while (this.r.size() < i) {
                this.r.add(null);
            }
            return;
        }
        int size = this.r.size();
        StringBuilder sb = new StringBuilder(79);
        sb.append("DrishtiGlThread: Cannot reduce buffer pool size from ");
        sb.append(size);
        sb.append(" to ");
        sb.append(i);
        zga.l(sb.toString());
    }

    public final void e(String str) {
        if (this.H) {
            zga.c("PresetFilterDebug", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        zpu zpuVar = this.B;
        if (zpuVar != null) {
            abse abseVar = (abse) zpuVar;
            abseVar.f = false;
            abseVar.i = true;
            abseVar.d.a();
            abseVar.n.c();
        }
    }

    public final void g() {
        i(this.u);
        this.u = null;
        this.t = null;
        this.s = null;
    }

    public final void h() {
        g();
        this.v = 0;
        this.w = 0;
    }

    @Override // defpackage.zqk
    public final void k() {
        if (this.F) {
            this.b.post(new zpl(this, 0));
        } else {
            c();
        }
    }

    public final void l() {
        this.b.sendEmptyMessage(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z) {
        zpk zpkVar = this.c;
        long s = s();
        if (z) {
            zpkVar.b = s;
        } else {
            zpkVar.c = s;
        }
    }

    public final void n(int i, int i2) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(10, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(zqs zqsVar, zpq zpqVar) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(1, new zpr(zqsVar, zpqVar)));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.d) {
            surfaceTexture.updateTexImage();
            if (!this.b.hasMessages(13)) {
                this.b.sendEmptyMessage(13);
            }
            zpv zpvVar = this.A;
            if (zpvVar != null) {
                abse abseVar = (abse) zpvVar;
                abseVar.g++;
                abseVar.n.b();
            }
        }
    }

    public final void p() {
        EGLSurface eGLSurface;
        amkq.N((this.t == null && this.s == null) ? false : true);
        amkq.N(this.v > 0 && this.w > 0);
        try {
            i(this.u);
            SurfaceTexture surfaceTexture = this.t;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(this.v, this.w);
                this.u = zpe.a().b(this.t);
                e("DrishtiGlThread::setupOutputRenderTarget, created outputRenderTarget from SurfaceTexture.");
                return;
            }
            if (this.s != null) {
                zpe a = zpe.a();
                Surface surface = this.s;
                synchronized (zpe.a) {
                    EGLSurface eGLSurface2 = (EGLSurface) zpe.a.get(surface);
                    if (eGLSurface2 == null) {
                        eGLSurface2 = EGL14.eglCreateWindowSurface(a.d, a.c, surface, new int[]{12344}, 0);
                        zpe.a.put(surface, eGLSurface2);
                    }
                    eGLSurface = eGLSurface2;
                }
                zpe.c("eglCreateWindowSurface");
                zpe.d(eGLSurface);
                zpe zpeVar = new zpe(a.d, a.c, a.e, eGLSurface, 0, false, true);
                zpeVar.b = surface;
                zpe.j(eGLSurface);
                this.u = zpeVar;
                return;
            }
            throw new RuntimeException("Cannot create RenderTarget. No output surface provided.");
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
            sb.append("DrishtiGlThread::setupOutputRenderTarget: forSurfaceTexture failed: ");
            sb.append(valueOf);
            e(sb.toString());
            zga.d("setupOutputRenderTarget: forSurfaceTexture failed: ", e);
            this.u = null;
        }
    }

    public final boolean q(boolean z) {
        zpe zpeVar;
        int i;
        zpp zppVar;
        int i2;
        zql zqlVar;
        zpd zpdVar;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        double max;
        if (!this.d) {
            zga.l("internalRedraw: Not running");
            return false;
        }
        if (this.E) {
            if (this.r.get(this.R) == null && (i3 = this.v) != 0 && (i4 = this.w) != 0) {
                int i5 = this.M;
                double d = i5;
                int i6 = this.N;
                double d2 = i6;
                if (i5 == 0 || i6 == 0) {
                    double d3 = i3;
                    double d4 = i4;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    double d5 = d3 / d4;
                    int max2 = Math.max(this.i, 4);
                    Double.isNaN(d3);
                    max = Math.max(Math.round(d3 / 4.0d) * 4, 4L);
                    double d6 = max2;
                    if (d6 < max) {
                        Double.isNaN(d6);
                        max = Math.max(Math.floor(d6 / 4.0d) * 4.0d, 4.0d);
                    }
                    double d7 = max / d5;
                    if (d6 < d7) {
                        Double.isNaN(d6);
                        max = Math.max(Math.round((d5 * d6) / 4.0d) * 4, 4L);
                        d2 = d6;
                    } else {
                        d2 = d7;
                    }
                } else {
                    max = d;
                }
                int round = (int) Math.round(max);
                int round2 = (int) Math.round(d2);
                if (round % 4 != 0) {
                    float f = round;
                    int max3 = Math.max(Math.round(f / 4.0f) * 4, 4);
                    round2 = Math.max(Math.round(max3 / (f / round2)), 2);
                    round = max3;
                }
                int i7 = this.M;
                if ((i7 > 0 || this.N > 0) && (i7 != round || this.N != round2)) {
                    if (this.r.get(0) == null || this.z == 0) {
                        for (int i8 = 0; i8 < this.r.size(); i8++) {
                            zpp zppVar2 = (zpp) this.r.get(i8);
                            if (zppVar2 != null) {
                                zppVar2.a();
                            }
                            this.r.set(i8, null);
                        }
                    } else {
                        int i9 = this.M;
                        int i10 = this.N;
                        StringBuilder sb = new StringBuilder(116);
                        sb.append("DrishtiGlThread: Cannot change resolution to ");
                        sb.append(round);
                        sb.append(" x ");
                        sb.append(round2);
                        sb.append(". Already processing ");
                        sb.append(i9);
                        sb.append(" x ");
                        sb.append(i10);
                        zga.l(sb.toString());
                        round = this.M;
                        round2 = this.N;
                    }
                }
                this.M = round;
                this.N = round2;
                for (int i11 = 0; i11 < this.r.size(); i11++) {
                    zpp zppVar3 = (zpp) this.r.get(i11);
                    if (zppVar3 == null) {
                        this.r.set(i11, new zpp(this, this.M, this.N));
                    } else if (zppVar3.d != this.M || zppVar3.e != this.N) {
                        throw new RuntimeException("Processing resolution is not allowed to change while buffers are in-use");
                    }
                }
            }
            zpp zppVar4 = (zpp) this.r.get(this.R);
            if (!this.e || zppVar4 == null) {
                if (!this.D) {
                    e("DrishtiGlThread: internalRedraw: Graph not setup yet. Bypass mode.");
                }
                zpeVar = this.u;
                i = this.v;
                zppVar = null;
                i2 = this.w;
            } else {
                zpeVar = zppVar4.a;
                i = this.M;
                i2 = this.N;
                zppVar = zppVar4;
            }
            zpt zptVar = this.k;
            Bitmap bitmap = zptVar.a;
            Bitmap bitmap2 = bitmap != null ? bitmap : zptVar.b;
            if (bitmap2 != null) {
                zqlVar = zql.a(bitmap2, this.q, this.P, zppVar, zpeVar, i, i2);
            } else {
                SurfaceTexture surfaceTexture = this.m;
                if (surfaceTexture == null || !this.n) {
                    zqlVar = null;
                } else {
                    arz arzVar = this.l;
                    float f2 = this.p;
                    int i12 = this.o;
                    float[] fArr = this.P;
                    surfaceTexture.getTransformMatrix(zql.a);
                    Matrix.setIdentityM(zql.b, 0);
                    Matrix.translateM(zql.b, 0, 0.5f, 0.5f, 0.0f);
                    Matrix.rotateM(zql.b, 0, i12, 0.0f, 0.0f, 1.0f);
                    Matrix.translateM(zql.b, 0, -0.5f, -0.5f, 0.0f);
                    Matrix.multiplyMM(fArr, 0, zql.a, 0, zql.b, 0);
                    zqlVar = new zql(arzVar, f2, fArr, zppVar, zpeVar, i, i2);
                }
            }
            if (zqlVar == null) {
                return false;
            }
            zqs zqsVar = this.C;
            if (zqlVar.g == null) {
                zga.l("DrishtiGlThread: internalRedraw: RenderTarget not set");
            } else {
                b();
                aogi aogiVar = zqlVar.f;
                if (aogiVar != null) {
                    int i13 = this.K;
                    if (i13 == 2 || i13 == 3) {
                        try {
                            aogiVar.c();
                            if (this.f || !this.d) {
                                zga.b("internalRedraw: not running after waitUntilReleased");
                            }
                        } catch (InterruptedException e) {
                            zga.d("internalRedraw: interrupted", e);
                            Thread.currentThread().interrupt();
                        }
                    } else {
                        synchronized (aogiVar) {
                            z3 = aogiVar.g;
                        }
                        if (z3) {
                            if (z) {
                                this.j = true;
                            }
                        }
                    }
                }
                float[] fArr2 = zqlVar.e;
                float f3 = zqlVar.d;
                float f4 = zqlVar.h / zqlVar.i;
                if (f3 > 0.0f) {
                    float f5 = f3 / f4;
                    Matrix.translateM(fArr2, 0, 0.5f, 0.5f, 0.0f);
                    Matrix.scaleM(fArr2, 0, Math.min(1.0f, 1.0f / f5), Math.min(1.0f, f5), 1.0f);
                    Matrix.translateM(fArr2, 0, -0.5f, -0.5f, 0.0f);
                }
                int i14 = zqlVar.c.b;
                try {
                    if (i14 == 36197) {
                        if (this.Q == null) {
                            this.Q = new zpd("#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
                        }
                        zpdVar = this.Q;
                    } else {
                        if (this.O == null) {
                            this.O = zpd.a();
                        }
                        zpdVar = this.O;
                    }
                    zpdVar.d(fArr2);
                    zqlVar.g.e();
                    r();
                    zpdVar.c(zqlVar.c, zqlVar.g, zqlVar.h, zqlVar.i);
                    zqlVar.g.i();
                    if (zqlVar.f == null || zqsVar == null) {
                        f();
                    } else {
                        long s = s();
                        this.z = s;
                        zpk zpkVar = this.c;
                        aogi aogiVar2 = zqlVar.f;
                        GLES20.glFinish();
                        aogiVar2.f = s;
                        aogiVar2.b();
                        try {
                            if (zpkVar.d != null && zpkVar.e == -1) {
                                zpkVar.e = s;
                            }
                            zqsVar.a(aogiVar2);
                        } catch (MediaPipeException e2) {
                            zga.n("addGpuPacket: frame input not sent into graph", e2);
                            zpkVar.e = -1L;
                        }
                    }
                    if (!this.D) {
                        this.D = true;
                    }
                    if (this.S < 30) {
                        this.S = 0;
                    }
                    z2 = true;
                } catch (RuntimeException e3) {
                    if (i14 == 36197) {
                        zga.d("internalRedraw: copyExternalSourceShaderWithTransform failed: ", e3);
                        this.Q = null;
                    } else {
                        zga.d("internalRedraw: copyPreviewBitmapShaderWithTransform failed: ", e3);
                        this.O = null;
                    }
                    int i15 = this.S + 1;
                    this.S = i15;
                    int i16 = this.T + 1;
                    this.T = i16;
                    if (i15 == 30) {
                        boolean z4 = this.U;
                        StringBuilder sb2 = new StringBuilder(102);
                        sb2.append("Consecutive error threshold reached for frame draw. Current total count is ");
                        sb2.append(i16);
                        sb2.append(" Init SPF: ");
                        sb2.append(z4);
                        afsi.c(2, 9, sb2.toString(), e3);
                    } else if (i16 == 30) {
                        boolean z5 = this.U;
                        StringBuilder sb3 = new StringBuilder(97);
                        sb3.append("Total error threshold reached for frame draw. Current consec count is ");
                        sb3.append(i15);
                        sb3.append(" Init SPF: ");
                        sb3.append(z5);
                        afsi.c(2, 9, sb3.toString(), e3);
                    }
                    k();
                }
                if (z2 || zppVar == null) {
                    return z2;
                }
                e("DrishtiGlThread: internalRedraw add frame.");
                this.R = (this.R + 1) % this.r.size();
                return true;
            }
            z2 = false;
            if (z2) {
            }
            return z2;
        }
        zga.l("internalRedraw: Not ready to process input frames");
        return false;
    }
}
