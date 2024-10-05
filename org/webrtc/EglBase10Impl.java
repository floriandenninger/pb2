package org.webrtc;

import android.view.Surface;
import com.google.cardboard.sdk.EglFactory;
import defpackage.baoe;
import defpackage.baoi;
import defpackage.baom;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class EglBase10Impl implements baom {
    private final EGL10 a;
    private EGLContext f;
    private EGLConfig g;
    private EGLDisplay h;
    private EGLSurface i = EGL10.EGL_NO_SURFACE;

    public EglBase10Impl(EGLContext eGLContext, int[] iArr) {
        EGLContext eglCreateContext;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.a = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            String valueOf = String.valueOf(Integer.toHexString(egl10.eglGetError()));
            throw new RuntimeException(valueOf.length() != 0 ? "Unable to get EGL10 display: 0x".concat(valueOf) : new String("Unable to get EGL10 display: 0x"));
        }
        if (!egl10.eglInitialize(eglGetDisplay, new int[2])) {
            String valueOf2 = String.valueOf(Integer.toHexString(egl10.eglGetError()));
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to initialize EGL10: 0x".concat(valueOf2) : new String("Unable to initialize EGL10: 0x"));
        }
        this.h = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!egl10.eglChooseConfig(eglGetDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            String valueOf3 = String.valueOf(Integer.toHexString(egl10.eglGetError()));
            throw new RuntimeException(valueOf3.length() != 0 ? "eglChooseConfig failed: 0x".concat(valueOf3) : new String("eglChooseConfig failed: 0x"));
        }
        if (iArr2[0] <= 0) {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig == null) {
            throw new RuntimeException("eglChooseConfig returned null");
        }
        this.g = eGLConfig;
        int a = baoe.a(iArr);
        StringBuilder sb = new StringBuilder(35);
        sb.append("Using OpenGL ES version ");
        sb.append(a);
        Logging.a("EglBase10Impl", sb.toString());
        EGLDisplay eGLDisplay = this.h;
        EGLConfig eGLConfig2 = this.g;
        if (eGLContext != null && eGLContext == EGL10.EGL_NO_CONTEXT) {
            throw new RuntimeException("Invalid sharedContext");
        }
        int[] iArr3 = {EglFactory.EGL_CONTEXT_CLIENT_VERSION, a, 12344};
        eGLContext = eGLContext == null ? EGL10.EGL_NO_CONTEXT : eGLContext;
        synchronized (baom.b) {
            eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig2, eGLContext, iArr3);
        }
        if (eglCreateContext == EGL10.EGL_NO_CONTEXT) {
            String valueOf4 = String.valueOf(Integer.toHexString(egl10.eglGetError()));
            throw new RuntimeException(valueOf4.length() != 0 ? "Failed to create EGL context: 0x".concat(valueOf4) : new String("Failed to create EGL context: 0x"));
        }
        this.f = eglCreateContext;
    }

    private final void l() {
        if (this.h == EGL10.EGL_NO_DISPLAY || this.f == EGL10.EGL_NO_CONTEXT || this.g == null) {
            throw new RuntimeException("This object has been released");
        }
    }

    private static native long nativeGetCurrentNativeEGLContext();

    @Override // defpackage.baom
    public final int a() {
        int[] iArr = new int[1];
        this.a.eglQuerySurface(this.h, this.i, 12374, iArr);
        return iArr[0];
    }

    @Override // defpackage.baom
    public final int b() {
        int[] iArr = new int[1];
        this.a.eglQuerySurface(this.h, this.i, 12375, iArr);
        return iArr[0];
    }

    @Override // defpackage.baom
    public final void c() {
        l();
        if (this.i != EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        EGLSurface eglCreatePbufferSurface = this.a.eglCreatePbufferSurface(this.h, this.g, new int[]{12375, 1, 12374, 1, 12344});
        this.i = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface != EGL10.EGL_NO_SURFACE) {
            return;
        }
        String hexString = Integer.toHexString(this.a.eglGetError());
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 75);
        sb.append("Failed to create pixel buffer surface with size 1x1: 0x");
        sb.append(hexString);
        throw new RuntimeException(sb.toString());
    }

    @Override // defpackage.baom
    public final void d(Surface surface) {
        baoi baoiVar = new baoi(surface);
        l();
        if (this.i != EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        EGLSurface eglCreateWindowSurface = this.a.eglCreateWindowSurface(this.h, this.g, baoiVar, new int[]{12344});
        this.i = eglCreateWindowSurface;
        if (eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
            String valueOf = String.valueOf(Integer.toHexString(this.a.eglGetError()));
            throw new RuntimeException(valueOf.length() != 0 ? "Failed to create window surface: 0x".concat(valueOf) : new String("Failed to create window surface: 0x"));
        }
    }

    @Override // defpackage.baom
    public final void e() {
        synchronized (baom.b) {
            if (!this.a.eglMakeCurrent(this.h, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)) {
                String valueOf = String.valueOf(Integer.toHexString(this.a.eglGetError()));
                throw new RuntimeException(valueOf.length() != 0 ? "eglDetachCurrent failed: 0x".concat(valueOf) : new String("eglDetachCurrent failed: 0x"));
            }
        }
    }

    @Override // defpackage.baom
    public final void f() {
        l();
        if (this.i != EGL10.EGL_NO_SURFACE) {
            synchronized (baom.b) {
                EGL10 egl10 = this.a;
                EGLDisplay eGLDisplay = this.h;
                EGLSurface eGLSurface = this.i;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f)) {
                    String valueOf = String.valueOf(Integer.toHexString(this.a.eglGetError()));
                    throw new RuntimeException(valueOf.length() != 0 ? "eglMakeCurrent failed: 0x".concat(valueOf) : new String("eglMakeCurrent failed: 0x"));
                }
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    @Override // defpackage.baom
    public final void g() {
        l();
        h();
        e();
        this.a.eglDestroyContext(this.h, this.f);
        this.a.eglTerminate(this.h);
        this.f = EGL10.EGL_NO_CONTEXT;
        this.h = EGL10.EGL_NO_DISPLAY;
        this.g = null;
    }

    @Override // defpackage.baom
    public final void h() {
        if (this.i != EGL10.EGL_NO_SURFACE) {
            this.a.eglDestroySurface(this.h, this.i);
            this.i = EGL10.EGL_NO_SURFACE;
        }
    }

    @Override // defpackage.baom
    public final void i() {
        l();
        if (this.i != EGL10.EGL_NO_SURFACE) {
            synchronized (baom.b) {
                this.a.eglSwapBuffers(this.h, this.i);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    @Override // defpackage.baom
    public final void j(long j) {
        i();
    }

    @Override // defpackage.baom
    public final boolean k() {
        return this.i != EGL10.EGL_NO_SURFACE;
    }
}
