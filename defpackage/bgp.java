package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import androidx.media3.exoplayer.video.DummySurface;
import com.google.cardboard.sdk.EglFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgp extends HandlerThread implements Handler.Callback {
    public psl a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public DummySurface e;

    public bgp() {
        super("ExoPlayer:DummySurface");
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        psl pslVar;
        EGLDisplay eglGetDisplay;
        EGLConfig eGLConfig;
        EGLSurface eglCreatePbufferSurface;
        int i2 = message.what;
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    return true;
                }
                try {
                    pse.c(this.a);
                    psl pslVar2 = this.a;
                    pslVar2.b.removeCallbacks(pslVar2);
                    try {
                        SurfaceTexture surfaceTexture = pslVar2.g;
                        if (surfaceTexture != null) {
                            surfaceTexture.release();
                            GLES20.glDeleteTextures(1, pslVar2.c, 0);
                        }
                        EGLDisplay eGLDisplay = pslVar2.d;
                        if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglMakeCurrent(pslVar2.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                        }
                        EGLSurface eGLSurface = pslVar2.f;
                        if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                            EGL14.eglDestroySurface(pslVar2.d, pslVar2.f);
                        }
                        EGLContext eGLContext = pslVar2.e;
                        if (eGLContext != null) {
                            EGL14.eglDestroyContext(pslVar2.d, eGLContext);
                        }
                        int i3 = pts.a;
                        EGL14.eglReleaseThread();
                        EGLDisplay eGLDisplay2 = pslVar2.d;
                        if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglTerminate(pslVar2.d);
                        }
                        pslVar2.d = null;
                        pslVar2.e = null;
                        pslVar2.f = null;
                        pslVar2.g = null;
                    } catch (Throwable th) {
                        EGLDisplay eGLDisplay3 = pslVar2.d;
                        if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglMakeCurrent(pslVar2.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                        }
                        EGLSurface eGLSurface2 = pslVar2.f;
                        if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                            EGL14.eglDestroySurface(pslVar2.d, pslVar2.f);
                        }
                        EGLContext eGLContext2 = pslVar2.e;
                        if (eGLContext2 != null) {
                            EGL14.eglDestroyContext(pslVar2.d, eGLContext2);
                        }
                        int i4 = pts.a;
                        EGL14.eglReleaseThread();
                        EGLDisplay eGLDisplay4 = pslVar2.d;
                        if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglTerminate(pslVar2.d);
                        }
                        pslVar2.d = null;
                        pslVar2.e = null;
                        pslVar2.f = null;
                        pslVar2.g = null;
                        throw th;
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            try {
                i = message.arg1;
                pse.c(this.a);
                pslVar = this.a;
                eglGetDisplay = EGL14.eglGetDisplay(0);
            } catch (Error e) {
                prh.j("DummySurface", "Failed to initialize dummy surface", e);
                this.c = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                prh.j("DummySurface", "Failed to initialize dummy surface", e2);
                this.d = e2;
                synchronized (this) {
                    notify();
                }
            }
            if (eglGetDisplay == null) {
                throw new psk("eglGetDisplay failed");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                throw new psk("eglInitialize failed");
            }
            pslVar.d = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean eglChooseConfig = EGL14.eglChooseConfig(pslVar.d, psl.a, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (!eglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                throw new psk(pts.D("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
            }
            EGLContext eglCreateContext = EGL14.eglCreateContext(pslVar.d, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, 2, 12344} : new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, 2, 12992, 1, 12344}, 0);
            if (eglCreateContext == null) {
                throw new psk("eglCreateContext failed");
            }
            pslVar.e = eglCreateContext;
            EGLDisplay eGLDisplay5 = pslVar.d;
            EGLContext eGLContext3 = pslVar.e;
            if (i == 1) {
                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay5, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                if (eglCreatePbufferSurface == null) {
                    throw new psk("eglCreatePbufferSurface failed");
                }
            }
            if (!EGL14.eglMakeCurrent(eGLDisplay5, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext3)) {
                throw new psk("eglMakeCurrent failed");
            }
            pslVar.f = eglCreatePbufferSurface;
            GLES20.glGenTextures(1, pslVar.c, 0);
            int i5 = 0;
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    break;
                }
                String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                Log.e("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
                i5 = glGetError;
            }
            if (i5 != 0) {
                String valueOf2 = String.valueOf(GLU.gluErrorString(i5));
                Log.e("GlUtil", valueOf2.length() != 0 ? "glError ".concat(valueOf2) : new String("glError "));
            }
            pslVar.g = new SurfaceTexture(pslVar.c[0]);
            pslVar.g.setOnFrameAvailableListener(pslVar);
            SurfaceTexture surfaceTexture2 = this.a.g;
            pse.c(surfaceTexture2);
            this.e = new DummySurface(this, surfaceTexture2, i != 0);
            synchronized (this) {
                notify();
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
