package com.google.cardboard.sdk;

import android.opengl.GLSurfaceView;
import android.os.Build;
import android.util.Log;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class EglFactory implements GLSurfaceView.EGLContextFactory, GLSurfaceView.EGLWindowSurfaceFactory {
    public static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_CONTEXT_FLAGS_KHR = 12540;
    private static final int EGL_CONTEXT_OPENGL_DEBUG_BIT_KHR = 1;
    private static final int EGL_CONTEXT_OPENGL_NO_ERROR_KHR = 12723;
    private static final int EGL_CONTEXT_PRIORITY_HIGH = 12545;
    private static final int EGL_CONTEXT_PRIORITY_LEVEL = 12544;
    private static final int EGL_PROTECTED_CONTENT_EXT = 12992;
    private static final int MIN_REQUIRED_CONTEXT_CLIENT_VERSION = 2;
    private static final String TAG = "GvrEglFactory";
    private boolean usePriority = false;
    private boolean useProtected = false;
    private boolean useDebug = false;
    private boolean errorReportingEnabled = true;
    private int eglContextClientVersion = 2;
    private EGLContext sharedContext = EGL10.EGL_NO_CONTEXT;

    private boolean supportsProtectedContent(EGL10 egl10, EGLDisplay eGLDisplay) {
        return egl10.eglQueryString(eGLDisplay, 12373).contains("EGL_EXT_protected_content");
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        int i;
        IntBuffer allocate = IntBuffer.allocate(10);
        allocate.put(EGL_CONTEXT_CLIENT_VERSION);
        allocate.put(this.eglContextClientVersion);
        if (this.useDebug) {
            allocate.put(EGL_CONTEXT_FLAGS_KHR);
            allocate.put(1);
        }
        if (this.usePriority) {
            if (Build.FINGERPRINT.contains("generic_x86")) {
                Log.w(TAG, "EGL_CONTEXT_PRIORITY_LEVEL not supported on emulators.");
            } else {
                allocate.put(EGL_CONTEXT_PRIORITY_LEVEL);
                allocate.put(EGL_CONTEXT_PRIORITY_HIGH);
            }
        }
        if (this.useProtected && supportsProtectedContent(egl10, eGLDisplay)) {
            allocate.put(EGL_PROTECTED_CONTENT_EXT);
            allocate.put(1);
        }
        if (!this.errorReportingEnabled && egl10.eglQueryString(eGLDisplay, 12373).contains("EGL_KHR_create_context_no_error")) {
            allocate.put(EGL_CONTEXT_OPENGL_NO_ERROR_KHR);
            allocate.put(1);
        }
        while (allocate.hasRemaining()) {
            allocate.put(12344);
        }
        EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, this.sharedContext, allocate.array());
        if ((eglCreateContext != null && eglCreateContext != EGL10.EGL_NO_CONTEXT) || (i = this.eglContextClientVersion) <= 2) {
            return eglCreateContext;
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("Failed to create EGL context with version ");
        sb.append(i);
        sb.append(", will try 2");
        Log.w(TAG, sb.toString());
        allocate.array()[1] = 2;
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, this.sharedContext, allocate.array());
    }

    @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
    public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        try {
            return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, (this.useProtected && supportsProtectedContent(egl10, eGLDisplay)) ? new int[]{EGL_PROTECTED_CONTENT_EXT, 1, 12344} : null);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "eglCreateWindowSurface", e);
            return null;
        }
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }

    @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
    public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        egl10.eglDestroySurface(eGLDisplay, eGLSurface);
    }

    public void setEGLContextClientVersion(int i) {
        this.eglContextClientVersion = i;
    }

    public void setErrorReportingEnabled(boolean z) {
        this.errorReportingEnabled = z;
    }

    public void setSharedContext(EGLContext eGLContext) {
        this.sharedContext = eGLContext;
    }

    public void setUseDebug(boolean z) {
        this.useDebug = z;
    }

    public void setUsePriorityContext(boolean z) {
        this.usePriority = z;
    }

    public void setUseProtectedBuffers(boolean z) {
        this.useProtected = z;
    }
}
