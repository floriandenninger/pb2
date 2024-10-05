package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import com.google.cardboard.sdk.EglFactory;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baol implements baoj {
    public static final int a = Build.VERSION.SDK_INT;
    private EGLContext f;
    private EGLConfig g;
    private EGLDisplay h;
    private EGLSurface i = EGL14.EGL_NO_SURFACE;

    public baol(EGLContext eGLContext, int[] iArr) {
        EGLContext eglCreateContext;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            String valueOf = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(valueOf.length() != 0 ? "Unable to get EGL14 display: 0x".concat(valueOf) : new String("Unable to get EGL14 display: 0x"));
        }
        int[] iArr2 = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1)) {
            String valueOf2 = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to initialize EGL14: 0x".concat(valueOf2) : new String("Unable to initialize EGL14: 0x"));
        }
        this.h = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        if (!EGL14.eglChooseConfig(eglGetDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr3, 0)) {
            String valueOf3 = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(valueOf3.length() != 0 ? "eglChooseConfig failed: 0x".concat(valueOf3) : new String("eglChooseConfig failed: 0x"));
        }
        if (iArr3[0] <= 0) {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig == null) {
            throw new RuntimeException("eglChooseConfig returned null");
        }
        this.g = eGLConfig;
        int a2 = baoe.a(iArr);
        StringBuilder sb = new StringBuilder(35);
        sb.append("Using OpenGL ES version ");
        sb.append(a2);
        Logging.a("EglBase14Impl", sb.toString());
        EGLDisplay eGLDisplay = this.h;
        EGLConfig eGLConfig2 = this.g;
        if (eGLContext != null && eGLContext == EGL14.EGL_NO_CONTEXT) {
            throw new RuntimeException("Invalid sharedContext");
        }
        int[] iArr4 = {EglFactory.EGL_CONTEXT_CLIENT_VERSION, a2, 12344};
        eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
        synchronized (baom.b) {
            eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig2, eGLContext, iArr4, 0);
        }
        if (eglCreateContext == EGL14.EGL_NO_CONTEXT) {
            String valueOf4 = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(valueOf4.length() != 0 ? "Failed to create EGL context: 0x".concat(valueOf4) : new String("Failed to create EGL context: 0x"));
        }
        this.f = eglCreateContext;
    }

    private final void m() {
        if (this.h == EGL14.EGL_NO_DISPLAY || this.f == EGL14.EGL_NO_CONTEXT || this.g == null) {
            throw new RuntimeException("This object has been released");
        }
    }

    @Override // defpackage.baom
    public final int a() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.h, this.i, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // defpackage.baom
    public final int b() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.h, this.i, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // defpackage.baom
    public final void c() {
        m();
        if (this.i != EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.h, this.g, new int[]{12375, 1, 12374, 1, 12344}, 0);
        this.i = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        String hexString = Integer.toHexString(EGL14.eglGetError());
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 75);
        sb.append("Failed to create pixel buffer surface with size 1x1: 0x");
        sb.append(hexString);
        throw new RuntimeException(sb.toString());
    }

    @Override // defpackage.baom
    public final void d(Surface surface) {
        if (surface instanceof Surface) {
            m();
            if (this.i != EGL14.EGL_NO_SURFACE) {
                throw new RuntimeException("Already has an EGLSurface");
            }
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.h, this.g, surface, new int[]{12344}, 0);
            this.i = eglCreateWindowSurface;
            if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                String valueOf = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
                throw new RuntimeException(valueOf.length() != 0 ? "Failed to create window surface: 0x".concat(valueOf) : new String("Failed to create window surface: 0x"));
            }
            return;
        }
        throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
    }

    @Override // defpackage.baom
    public final void e() {
        synchronized (baom.b) {
            if (!EGL14.eglMakeCurrent(this.h, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
                String valueOf = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
                throw new RuntimeException(valueOf.length() != 0 ? "eglDetachCurrent failed: 0x".concat(valueOf) : new String("eglDetachCurrent failed: 0x"));
            }
        }
    }

    @Override // defpackage.baom
    public final void f() {
        m();
        if (this.i != EGL14.EGL_NO_SURFACE) {
            synchronized (baom.b) {
                EGLDisplay eGLDisplay = this.h;
                EGLSurface eGLSurface = this.i;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f)) {
                    String valueOf = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
                    throw new RuntimeException(valueOf.length() != 0 ? "eglMakeCurrent failed: 0x".concat(valueOf) : new String("eglMakeCurrent failed: 0x"));
                }
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    @Override // defpackage.baom
    public final void g() {
        m();
        h();
        e();
        synchronized (baom.b) {
            EGL14.eglDestroyContext(this.h, this.f);
        }
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(this.h);
        this.f = EGL14.EGL_NO_CONTEXT;
        this.h = EGL14.EGL_NO_DISPLAY;
        this.g = null;
    }

    @Override // defpackage.baom
    public final void h() {
        if (this.i != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.h, this.i);
            this.i = EGL14.EGL_NO_SURFACE;
        }
    }

    @Override // defpackage.baom
    public final void i() {
        m();
        if (this.i != EGL14.EGL_NO_SURFACE) {
            synchronized (baom.b) {
                EGL14.eglSwapBuffers(this.h, this.i);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    @Override // defpackage.baom
    public final void j(long j) {
        m();
        if (this.i != EGL14.EGL_NO_SURFACE) {
            synchronized (baom.b) {
                EGLExt.eglPresentationTimeANDROID(this.h, this.i, j);
                EGL14.eglSwapBuffers(this.h, this.i);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    @Override // defpackage.baom
    public final boolean k() {
        return this.i != EGL14.EGL_NO_SURFACE;
    }

    public final baok l() {
        return new baok(this.f);
    }
}
