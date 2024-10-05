package defpackage;

import android.opengl.GLSurfaceView;
import android.os.Build;
import android.util.Log;
import com.google.cardboard.sdk.EglFactory;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axfv implements GLSurfaceView.EGLContextFactory, GLSurfaceView.EGLWindowSurfaceFactory {
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public int e = 2;
    public EGLContext f = EGL10.EGL_NO_CONTEXT;

    private static final boolean a(EGL10 egl10, EGLDisplay eGLDisplay) {
        return egl10.eglQueryString(eGLDisplay, 12373).contains("EGL_EXT_protected_content");
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        int i;
        IntBuffer allocate = IntBuffer.allocate(10);
        allocate.put(EglFactory.EGL_CONTEXT_CLIENT_VERSION);
        allocate.put(this.e);
        if (this.c) {
            allocate.put(12540);
            allocate.put(1);
        }
        if (this.a) {
            if (Build.FINGERPRINT.contains("generic_x86")) {
                Log.w("GvrEglFactory", "EGL_CONTEXT_PRIORITY_LEVEL not supported on emulators.");
            } else {
                allocate.put(12544);
                allocate.put(12545);
            }
        }
        if (this.b && a(egl10, eGLDisplay)) {
            allocate.put(12992);
            allocate.put(1);
        }
        if (!this.d && egl10.eglQueryString(eGLDisplay, 12373).contains("EGL_KHR_create_context_no_error")) {
            allocate.put(12723);
            allocate.put(1);
        }
        while (allocate.hasRemaining()) {
            allocate.put(12344);
        }
        EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, this.f, allocate.array());
        if ((eglCreateContext != null && eglCreateContext != EGL10.EGL_NO_CONTEXT) || (i = this.e) <= 2) {
            return eglCreateContext;
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("Failed to create EGL context with version ");
        sb.append(i);
        sb.append(", will try 2");
        Log.w("GvrEglFactory", sb.toString());
        allocate.array()[1] = 2;
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, this.f, allocate.array());
    }

    @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
    public final EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        try {
            return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, (this.b && a(egl10, eGLDisplay)) ? new int[]{12992, 1, 12344} : null);
        } catch (IllegalArgumentException e) {
            Log.e("GvrEglFactory", "eglCreateWindowSurface", e);
            return null;
        }
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }

    @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
    public final void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        egl10.eglDestroySurface(eGLDisplay, eGLSurface);
    }
}
