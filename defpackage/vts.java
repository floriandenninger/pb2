package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.google.cardboard.sdk.R;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vts {
    private final vrx A;
    private final int B;
    private final vyo C;
    public final float b;
    public final vtr c;
    public final long d;
    public vti e;
    public vtt f;
    public vtu g;
    public Handler h;
    Looper i;
    public long k;
    public long l;
    public long m;
    public int p;
    public int q;
    public final vys r;
    public final hft s;
    private final int t;
    private final int u;
    private final int v;
    private final float w;
    private final vum x;
    private final vth y;
    private final EGLContext z;
    public int a = 0;
    public boolean j = false;
    public SurfaceTexture n = null;
    public int o = -1;

    public vts(int i, int i2, int i3, int i4, float f, float f2, vum vumVar, vth vthVar, EGLContext eGLContext, vtr vtrVar, vyo vyoVar, vrx vrxVar, vys vysVar, hft hftVar) {
        this.t = i;
        this.u = i2;
        this.v = i3;
        this.B = i4;
        this.w = f;
        this.d = f > 0.0f ? ((float) TimeUnit.SECONDS.toNanos(1L)) / f : 0L;
        this.b = f2;
        this.x = vumVar;
        this.y = vthVar;
        this.z = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
        this.c = vtrVar;
        this.C = vyoVar;
        this.A = vrxVar;
        this.r = vysVar;
        this.s = hftVar;
    }

    private final float m() {
        float f = this.w;
        if (f > 0.0f) {
            return f;
        }
        return 30.0f;
    }

    public final long a() {
        return c(this.l);
    }

    public final long b() {
        return ((float) TimeUnit.SECONDS.toNanos(1L)) / m();
    }

    public final long c(long j) {
        if (this.k < 0) {
            return 0L;
        }
        return TimeUnit.NANOSECONDS.toMillis((((float) (j - this.k)) / this.b) + b());
    }

    public final void d(SurfaceTexture surfaceTexture, int i, vtu vtuVar) {
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        vyo vyoVar = this.C;
        if (vyoVar != null) {
            vyp vypVar = vyoVar.a;
            Matrix.setRotateM(fArr2, 0, 90.0f, 0.0f, 0.0f, 1.0f);
            if (vypVar.a != null) {
                Matrix.translateM(fArr, 0, r2.centerX() - 0.5f, vypVar.a.centerY() - 0.5f, 0.0f);
                Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
                Matrix.scaleM(fArr, 0, vypVar.a.width(), vypVar.a.height(), 1.0f);
                Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
            }
        } else {
            int i2 = this.B;
            int i3 = i2 - 1;
            if (i2 != 0) {
                Matrix.setRotateM(fArr2, 0, i3, 0.0f, 0.0f, 1.0f);
            } else {
                throw null;
            }
        }
        vtuVar.a(i, fArr2, fArr);
    }

    public final void e(vtt vttVar) {
        vttVar.c(((float) (this.l - this.k)) / this.b);
        vttVar.d();
        this.m = this.l;
    }

    public final synchronized void f() {
        int i = this.a;
        if (i != 0 && i != 5) {
            vtv.b("VideoEncoder: Released while still running");
        }
        vti vtiVar = this.e;
        if (vtiVar != null) {
            vtiVar.h();
            this.e.e();
            this.e = null;
        }
        i();
    }

    public final synchronized void g() {
        new Thread(new vtq(this, 0), "encodeVideo").start();
    }

    public final synchronized void h() {
        vur a = this.x.a("video/avc", true);
        if (a != null) {
            int i = this.u;
            int i2 = this.v;
            float m = m();
            int i3 = this.t;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", i3);
            createVideoFormat.setFloat("frame-rate", m);
            createVideoFormat.setInteger("i-frame-interval", 2);
            vti vtiVar = new vti(a, createVideoFormat);
            this.e = vtiVar;
            vtiVar.a = this.y;
            vtt vttVar = new vtt(this.z, vtiVar.a());
            this.f = vttVar;
            vttVar.a();
            this.g = new vtu();
            vti vtiVar2 = this.e;
            if (vtiVar2 == null) {
                throw new IOException("Video encoder not initialized while starting");
            }
            vtiVar2.g();
            this.k = -1L;
            this.l = -1L;
            this.j = true;
            final vys vysVar = this.r;
            if (vysVar != null) {
                Handler handler = this.h;
                if (handler != null) {
                    final vyt vytVar = vysVar.a;
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    vlu.d("Couldn't generate textures.");
                    GLES20.glBindTexture(36197, iArr[0]);
                    vlu.d("Couldn't bind texture.");
                    GLES20.glTexParameterf(36197, 10241, 9729.0f);
                    GLES20.glTexParameterf(36197, 10240, 9729.0f);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    vlu.d("Couldn't set texture parameters.");
                    int i4 = iArr[0];
                    vytVar.f = i4;
                    vytVar.e = new SurfaceTexture(i4);
                    vytVar.e.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: vyq
                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                        public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
                            String sb;
                            vyt vytVar2 = vyt.this;
                            surfaceTexture.updateTexImage();
                            Long c = vytVar2.h.c(surfaceTexture.getTimestamp());
                            if (c == null) {
                                vytVar2.b.b(new IOException("Timestamp not found for frame"));
                                return;
                            }
                            vtf vtfVar = vytVar2.c;
                            if (vtfVar != null) {
                                final int i5 = vytVar2.f;
                                final long longValue = c.longValue() * 1000;
                                vtn vtnVar = (vtn) vtfVar;
                                final vts vtsVar = vtnVar.c;
                                if (vtsVar == null) {
                                    vtnVar.c(new IOException("Frame sent to unstarted Encoder"));
                                    return;
                                }
                                synchronized (vtsVar) {
                                    Handler handler2 = vtsVar.h;
                                    final vti vtiVar3 = vtsVar.e;
                                    final vtu vtuVar = vtsVar.g;
                                    final vtt vttVar2 = vtsVar.f;
                                    if (handler2 != null && vtiVar3 != null && vtuVar != null && vttVar2 != null && vtsVar.k() && surfaceTexture.getTimestamp() > 0) {
                                        vtsVar.p++;
                                        vtsVar.n = surfaceTexture;
                                        vtsVar.o = i5;
                                        handler2.post(new Runnable() { // from class: vtp
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                vts vtsVar2;
                                                long j;
                                                SurfaceTexture surfaceTexture2;
                                                int i6;
                                                SurfaceTexture surfaceTexture3;
                                                int i7;
                                                vts vtsVar3 = vts.this;
                                                vti vtiVar4 = vtiVar3;
                                                long j2 = longValue;
                                                vtt vttVar3 = vttVar2;
                                                SurfaceTexture surfaceTexture4 = surfaceTexture;
                                                int i8 = i5;
                                                vtu vtuVar2 = vtuVar;
                                                vtiVar4.b(0L);
                                                long j3 = vtsVar3.k;
                                                if (j3 < 0) {
                                                    vtsVar3.k = j2;
                                                    vtsVar3.m = -1L;
                                                    vtsVar2 = vtsVar3;
                                                    j = j2;
                                                    surfaceTexture3 = surfaceTexture4;
                                                    i7 = i8;
                                                } else {
                                                    long j4 = vtsVar3.d;
                                                    if (j4 > 0) {
                                                        long j5 = vtsVar3.m;
                                                        float f = vtsVar3.b;
                                                        long j6 = ((float) (j5 - j3)) / f;
                                                        surfaceTexture2 = surfaceTexture4;
                                                        i6 = i8;
                                                        long j7 = ((float) (vtsVar3.l - j3)) / f;
                                                        long j8 = j7 - j6;
                                                        long j9 = (((float) (j2 - j3)) / f) - j6;
                                                        long abs = Math.abs(j8 - j4);
                                                        vtsVar2 = vtsVar3;
                                                        long abs2 = Math.abs(j9 - vtsVar2.d);
                                                        j = j2;
                                                        if (j7 != 0 && (vtsVar2.l < vtsVar2.k || abs >= abs2)) {
                                                            StringBuilder sb2 = new StringBuilder(R.styleable.AppCompatTheme_windowFixedWidthMinor);
                                                            sb2.append("VideoEncoder: Drop frame at: ");
                                                            sb2.append(j7);
                                                            sb2.append(" with delta: ");
                                                            sb2.append(j8);
                                                            sb2.append(". Prefer next delta: ");
                                                            sb2.append(j9);
                                                            vtv.d(sb2.toString());
                                                            surfaceTexture3 = surfaceTexture2;
                                                            i7 = i6;
                                                        }
                                                    } else {
                                                        vtsVar2 = vtsVar3;
                                                        j = j2;
                                                        surfaceTexture2 = surfaceTexture4;
                                                        i6 = i8;
                                                    }
                                                    vtsVar2.e(vttVar3);
                                                    surfaceTexture3 = surfaceTexture2;
                                                    i7 = i6;
                                                }
                                                vtsVar2.d(surfaceTexture3, i7, vtuVar2);
                                                vtsVar2.l = j;
                                                hft hftVar = vtsVar2.s;
                                                if (hftVar != null) {
                                                    long a2 = vtsVar2.a();
                                                    final hqw hqwVar = hftVar.a.a;
                                                    vsy vsyVar = hqwVar.ao.d;
                                                    final int k = (int) ((a2 * 100) / (vsyVar.k() - vsyVar.m()));
                                                    ci C = hqwVar.C();
                                                    if (C != null) {
                                                        C.runOnUiThread(new Runnable() { // from class: hqr
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                hqw hqwVar2 = hqw.this;
                                                                int i9 = k;
                                                                hfy hfyVar = hqwVar2.at;
                                                                if (hfyVar != null) {
                                                                    hfyVar.b(i9);
                                                                }
                                                            }
                                                        });
                                                    }
                                                }
                                                vtsVar2.i();
                                            }
                                        });
                                        return;
                                    }
                                    if (!vtsVar.l()) {
                                        sb = "VideoEncoder not prepared.";
                                    } else if (vtsVar.k()) {
                                        long timestamp = surfaceTexture.getTimestamp();
                                        StringBuilder sb2 = new StringBuilder(47);
                                        sb2.append("Invalid Surface timestamp: ");
                                        sb2.append(timestamp);
                                        sb = sb2.toString();
                                    } else {
                                        sb = "VideoEncoder not accepting input.";
                                    }
                                    String valueOf = String.valueOf(sb);
                                    vtv.d(valueOf.length() != 0 ? "VideoEncoder: Rejecting frame: ".concat(valueOf) : new String("VideoEncoder: Rejecting frame: "));
                                    vtsVar.i();
                                    vtsVar.q++;
                                    return;
                                }
                            }
                            vytVar2.b.b(new IllegalStateException("GlManager uninitialized while handling frames"));
                        }
                    }, handler);
                    vysVar.a.a.post(new Runnable() { // from class: vyr
                        @Override // java.lang.Runnable
                        public final void run() {
                            SurfaceTexture surfaceTexture;
                            vyt vytVar2 = vys.this.a;
                            vsr vsrVar = vytVar2.d;
                            if (vsrVar == null || (surfaceTexture = vytVar2.e) == null) {
                                vytVar2.b.b(new IllegalStateException("GlManager uninitialized at Decode start"));
                                return;
                            }
                            Surface surface = new Surface(surfaceTexture);
                            vtv.a("TransformerSource: start");
                            vsw vswVar = (vsw) vsrVar;
                            vswVar.d = new vsu(vswVar);
                            vsu vsuVar = vswVar.d;
                            plj pljVar = new plj();
                            int i5 = vsw.a;
                            int i6 = vsw.a;
                            pse.g(!pljVar.f);
                            plk.d(250, 0, "bufferForPlaybackMs", "0");
                            plk.d(250, 0, "bufferForPlaybackAfterRebufferMs", "0");
                            plk.d(i5, 250, "minBufferMs", "bufferForPlaybackMs");
                            plk.d(i5, 250, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                            plk.d(i6, i5, "maxBufferMs", "minBufferMs");
                            pljVar.b = i5;
                            pljVar.c = i6;
                            pljVar.d = 250;
                            pljVar.e = 250;
                            pse.g(!pljVar.f);
                            pljVar.f = true;
                            if (pljVar.a == null) {
                                pljVar.a = new bfg(true, 65536);
                            }
                            plk plkVar = new plk(pljVar.a, pljVar.b, pljVar.c, pljVar.d, pljVar.e);
                            vswVar.e = new bej(vswVar.i);
                            bej bejVar = vswVar.e;
                            bef befVar = new bef(vswVar.i);
                            befVar.o = true;
                            bee b = befVar.b();
                            bejVar.c(b);
                            bef befVar2 = new bef((bee) bejVar.c.get());
                            befVar2.c(b);
                            bejVar.c(befVar2.b());
                            Context context = vswVar.i;
                            poj pojVar = new poj(context, new vsv(context, vswVar.k, vswVar.m, vswVar.o), new bie());
                            pse.g(!pojVar.p);
                            pojVar.d = bejVar;
                            muf.J(plkVar, pojVar);
                            vswVar.c = muf.I(pojVar);
                            vswVar.c.u(vsuVar);
                            vswVar.c.L(vswVar.a());
                            vswVar.c.f(vswVar.j);
                            vswVar.c.N(surface);
                            vswVar.c.v();
                            vswVar.f = 0;
                        }
                    });
                    return;
                }
                throw new IOException("Video handler not initialized while creating surfaces");
            }
            return;
        }
        throw new IOException("Failed to create video encoder.");
    }

    public final void i() {
        vrx vrxVar = this.A;
        if (vrxVar != null) {
            vrxVar.b(false);
        }
    }

    public final void j(int i) {
        synchronized (this) {
            this.a = i;
            notifyAll();
        }
    }

    public final boolean k() {
        return l() && this.j && this.a == 3;
    }

    public final boolean l() {
        vti vtiVar = this.e;
        return vtiVar != null && vtiVar.c == 2;
    }
}
