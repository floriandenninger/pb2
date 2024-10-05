package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.google.cardboard.sdk.EglFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abqu {
    public EGLDisplay a;
    public EGLContext b;
    public EGLConfig c;
    public boolean d;

    public abqu() {
        this(null, 0);
    }

    public final int a(EGLSurface eGLSurface, int i) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.a, eGLSurface, i, iArr, 0);
        return iArr[0];
    }

    public final EGLSurface b(Object obj) {
        if (obj instanceof Surface) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.a, this.c, obj, new int[]{12344}, 0);
            adyu.cV("eglCreateWindowSurface");
            if (eglCreateWindowSurface != null) {
                return eglCreateWindowSurface;
            }
            throw new abqz("surface was null");
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("invalid surface: ");
        sb.append(valueOf);
        throw new abqz(sb.toString());
    }

    public final void c(EGLSurface eGLSurface) {
        amkq.b(this.a, EGL14.EGL_NO_DISPLAY);
        if (!EGL14.eglMakeCurrent(this.a, eGLSurface, eGLSurface, this.b)) {
            throw new abqz("eglMakeCurrent failed");
        }
    }

    public final void d() {
        if (!EGL14.eglMakeCurrent(this.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
            throw new abqz("eglMakeCurrent failed");
        }
    }

    public final void e() {
        if (!amkq.b(this.a, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglMakeCurrent(this.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.a, this.b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.a);
        }
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_CONTEXT;
        this.c = null;
        this.d = false;
    }

    public final void f(EGLSurface eGLSurface) {
        EGL14.eglDestroySurface(this.a, eGLSurface);
    }

    protected final void finalize() {
        try {
            if (!amkq.b(this.a, EGL14.EGL_NO_DISPLAY)) {
                zga.l("WARNING: EglCore was not explicitly released -- state may be leaked");
                e();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean g(EGLSurface eGLSurface) {
        return EGL14.eglSwapBuffers(this.a, eGLSurface);
    }

    public abqu(EGLContext eGLContext, int i) {
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_CONTEXT;
        EGLConfig eGLConfig = null;
        this.c = null;
        this.d = true;
        if (amkq.b(this.a, EGL14.EGL_NO_DISPLAY)) {
            eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.a = eglGetDisplay;
            if (amkq.b(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                throw new abqz("unable to get EGL14 display");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(this.a, iArr, 0, iArr, 1)) {
                this.a = null;
                throw new abqz("unable to initialize EGL14");
            }
            if (amkq.b(this.b, EGL14.EGL_NO_CONTEXT)) {
                int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344};
                if (i != 0) {
                    iArr2[10] = 12610;
                    iArr2[11] = 1;
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(this.a, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    zga.l("unable to find RGB8888 / 2 EGLConfig");
                } else {
                    eGLConfig = eGLConfigArr[0];
                }
                if (eGLConfig == null) {
                    throw new abqz("Unable to find a suitable EGLConfig");
                }
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.a, eGLConfig, eGLContext, new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                adyu.cV("eglCreateContext");
                this.c = eGLConfig;
                this.b = eglCreateContext;
            }
            EGL14.eglQueryContext(this.a, this.b, EglFactory.EGL_CONTEXT_CLIENT_VERSION, new int[1], 0);
            this.d = true;
            return;
        }
        throw new abqz("EGL already set up");
    }
}
