package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.google.cardboard.sdk.EglFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vtt {
    private final Surface a;
    private EGLDisplay b;
    private EGLContext c;
    private EGLSurface d;

    public vtt(EGLContext eGLContext, Surface surface) {
        this.a = surface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.b = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (!EGL14.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                throw new RuntimeException("Choose config failed.");
            }
            e("Failed to choose config.");
            if (iArr2[0] <= 0) {
                throw new RuntimeException("No configs found.");
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = EGL14.eglCreateContext(this.b, eGLConfig, eGLContext, new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
            e("Failed to create context.");
            this.c = eglCreateContext;
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.b, eGLConfig, surface, new int[]{12344}, 0);
            e("Failed to create window surface.");
            this.d = eglCreateWindowSurface;
            return;
        }
        throw new RuntimeException("unable to initialize EGL14");
    }

    private static void e(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        String hexString = Integer.toHexString(eglGetError);
        StringBuilder sb = new StringBuilder(str.length() + 15 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append(": EGL error: 0x");
        sb.append(hexString);
        throw new RuntimeException(sb.toString());
    }

    public final void a() {
        EGLDisplay eGLDisplay = this.b;
        EGLSurface eGLSurface = this.d;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.c);
    }

    public final void b() {
        if (this.b != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglMakeCurrent(this.b, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.b, this.d);
            EGL14.eglDestroyContext(this.b, this.c);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.b);
        }
        this.b = EGL14.EGL_NO_DISPLAY;
        this.c = EGL14.EGL_NO_CONTEXT;
        this.d = EGL14.EGL_NO_SURFACE;
        this.a.release();
    }

    public final void c(long j) {
        EGLExt.eglPresentationTimeANDROID(this.b, this.d, j);
    }

    public final void d() {
        EGL14.eglSwapBuffers(this.b, this.d);
    }
}
