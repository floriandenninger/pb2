package defpackage;

import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import java.nio.Buffer;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acay implements SurfaceTexture.OnFrameAvailableListener, abrr, acap {
    public static final /* synthetic */ int g = 0;
    public SurfaceTexture a;
    public VirtualDisplay c;
    public boolean d;
    public acao e;
    public acan f;
    private final abqu h;
    private final DisplayManager i;
    private final MediaProjectionManager j;
    private final Intent k;
    private int o;
    private int p;
    private Surface q;
    private Handler r;
    private Handler s;
    private MediaProjection t;
    private acal u;
    private boolean v;
    private boolean w;
    private final float[] l = new float[16];
    private final Runnable m = new acau(this, 1);
    private final Runnable n = new acau(this, 0);
    private final MediaProjection.Callback x = new acav(this);
    private final VirtualDisplay.Callback y = new acaw(this);
    private final DisplayManager.DisplayListener z = new acax(this);

    public acay(DisplayManager displayManager, MediaProjectionManager mediaProjectionManager, Intent intent, abqu abquVar, int i, int i2) {
        amkq.N(true);
        displayManager.getClass();
        this.i = displayManager;
        mediaProjectionManager.getClass();
        this.j = mediaProjectionManager;
        intent.getClass();
        this.k = intent;
        abquVar.getClass();
        this.h = abquVar;
        this.o = i;
        this.p = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(final int i) {
        acan acanVar = this.f;
        if (acanVar != null) {
            Handler handler = this.r;
            if (handler != null) {
                handler.post(new Runnable() { // from class: acat
                    @Override // java.lang.Runnable
                    public final void run() {
                        acay acayVar = acay.this;
                        acayVar.f.a(i);
                    }
                });
            } else {
                acanVar.a(i);
            }
        }
    }

    @Override // defpackage.acap
    public final void a(Surface surface, long j) {
    }

    @Override // defpackage.acap
    public final void b(acan acanVar, Handler handler) {
        this.f = acanVar;
        this.r = handler;
    }

    @Override // defpackage.acap
    public final void c(acao acaoVar, Handler handler) {
        this.e = acaoVar;
        this.s = handler;
    }

    @Override // defpackage.acap
    public final void d(Surface surface) {
    }

    @Override // defpackage.acap
    public final boolean e() {
        if (!this.d) {
            Log.e("VirtualDisplaySource", "Cannot pause when virtual display not active.");
            return false;
        }
        if (!this.v) {
            Log.e("VirtualDisplaySource", "Cannot pause when video source not started.");
            return false;
        }
        this.w = true;
        this.c.setSurface(null);
        return true;
    }

    @Override // defpackage.acap
    public final boolean f() {
        if (this.d) {
            Log.e("VirtualDisplaySource", "Virtual display already active");
            return false;
        }
        MediaProjection mediaProjection = this.j.getMediaProjection(-1, this.k);
        this.t = mediaProjection;
        if (mediaProjection == null) {
            Log.e("VirtualDisplaySource", "Could not acquire a media projection");
            return false;
        }
        mediaProjection.registerCallback(this.x, null);
        this.i.registerDisplayListener(this.z, null);
        Display display = this.i.getDisplay(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        VirtualDisplay createVirtualDisplay = this.t.createVirtualDisplay("Virtual Display Video Source", this.o, this.p, displayMetrics.densityDpi, 19, null, this.y, null);
        this.c = createVirtualDisplay;
        if (createVirtualDisplay == null) {
            Log.e("VirtualDisplaySource", "Could not create virtual display");
            return false;
        }
        this.d = true;
        createVirtualDisplay.getDisplay().getRealMetrics(displayMetrics);
        this.o = displayMetrics.widthPixels;
        this.p = displayMetrics.heightPixels;
        Matrix.setIdentityM(this.l, 0);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        adyu.cW("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        StringBuilder sb = new StringBuilder(25);
        sb.append("glBindTexture ");
        sb.append(i);
        adyu.cW(sb.toString());
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        adyu.cW("glTexParameter");
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.a = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.o, this.p);
        this.q = new Surface(this.a);
        abqu abquVar = this.h;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(abquVar.a, abquVar.c, new int[]{12375, this.o, 12374, this.p, 12344}, 0);
        adyu.cV("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface == null) {
            throw new abqz("surface was null");
        }
        abquVar.c(eglCreatePbufferSurface);
        this.u = new acal();
        return true;
    }

    @Override // defpackage.acap
    public final boolean g() {
        if (!this.d) {
            Log.e("VirtualDisplaySource", "Cannot resume when virtual display not active.");
            return false;
        }
        if (!this.v) {
            Log.e("VirtualDisplaySource", "Cannot resume when video source not started.");
            return false;
        }
        this.w = false;
        this.c.setSurface(this.q);
        Handler handler = this.s;
        if (handler != null) {
            handler.post(this.m);
            return true;
        }
        this.m.run();
        return true;
    }

    @Override // defpackage.acap
    public final boolean h() {
        if (!this.d) {
            Log.e("VirtualDisplaySource", "Cannot start when virtual display not active.");
            return false;
        }
        try {
            this.a.setOnFrameAvailableListener(this, this.s);
            this.c.setSurface(this.q);
            this.v = true;
            return true;
        } catch (Exception e) {
            Log.e("VirtualDisplaySource", "Error starting virtual display source", e);
            return false;
        }
    }

    @Override // defpackage.acap
    public final void i() {
        int i;
        j();
        this.d = false;
        this.i.unregisterDisplayListener(this.z);
        VirtualDisplay virtualDisplay = this.c;
        if (virtualDisplay != null) {
            virtualDisplay.setSurface(null);
            this.c.release();
            this.c = null;
        }
        MediaProjection mediaProjection = this.t;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(this.x);
            this.t.stop();
            this.t = null;
        }
        try {
            abqu abquVar = this.h;
            if (abquVar != null && abquVar.d) {
                abquVar.d();
            }
        } catch (Exception e) {
            Log.e("VirtualDisplaySource", "Error clearing EGL context", e);
        }
        try {
            acal acalVar = this.u;
            if (acalVar != null && (i = acalVar.i) >= 0) {
                GLES20.glDeleteProgram(i);
                acalVar.i = -1;
            }
            SurfaceTexture surfaceTexture = this.a;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            Surface surface = this.q;
            if (surface != null) {
                surface.release();
            }
            abqu abquVar2 = this.h;
            if (abquVar2 != null) {
                abquVar2.e();
            }
        } catch (Exception e2) {
            Log.e("VirtualDisplaySource", "Error releasing virtual display source resources", e2);
        }
        this.u = null;
        this.a = null;
        this.q = null;
    }

    @Override // defpackage.acap
    public final void j() {
        if (!this.d) {
            Log.e("VirtualDisplaySource", "Cannot stop when virtual display not active.");
            return;
        }
        if (this.v) {
            this.v = false;
            c(null, null);
            try {
                this.a.setOnFrameAvailableListener(null);
                this.c.setSurface(null);
            } catch (Exception e) {
                Log.e("VirtualDisplaySource", "Error stopping virtual display source", e);
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.v && !this.w && surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (Exception e) {
                Log.e("VirtualDisplaySource", "Error copying frame to display surface", e);
                l(7);
            }
        }
        Handler handler = this.s;
        if (handler != null) {
            handler.post(this.n);
        } else {
            this.n.run();
        }
    }

    @Override // defpackage.abrr
    public final void qQ(boolean z, int i, int i2, Set set) {
        if (this.v) {
            try {
                acal acalVar = this.u;
                float[] fArr = this.l;
                adyu.cW("draw start");
                GLES20.glUseProgram(acalVar.i);
                adyu.cW("glUseProgram");
                GLES20.glUniformMatrix4fv(acalVar.g, 1, false, acalVar.d, 0);
                adyu.cW("glUniformMatrix4fv");
                GLES20.glUniformMatrix4fv(acalVar.h, 1, false, fArr, 0);
                adyu.cW("glUniformMatrix4fv");
                GLES20.glEnableVertexAttribArray(acalVar.e);
                adyu.cW("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(acalVar.e, 2, 5126, false, 8, (Buffer) acal.a);
                adyu.cW("glVertexAttribPointer");
                GLES20.glEnableVertexAttribArray(acalVar.f);
                adyu.cW("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(acalVar.f, 2, 5126, false, 8, (Buffer) acal.b);
                adyu.cW("glVertexAttribPointer");
                GLES20.glDrawArrays(5, 0, acal.c);
                adyu.cW("glDrawArrays");
                GLES20.glDisableVertexAttribArray(acalVar.e);
                GLES20.glDisableVertexAttribArray(acalVar.f);
                GLES20.glUseProgram(0);
            } catch (Exception e) {
                Log.e("VirtualDisplaySource", "Could not copy frame to target surface", e);
                l(7);
            }
        }
    }
}
