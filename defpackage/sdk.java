package defpackage;

import android.opengl.GLSurfaceView;
import com.google.cardboard.sdk.EglFactory;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sdk implements GLSurfaceView.EGLContextFactory {
    final /* synthetic */ aogo a;

    public sdk(aogo aogoVar) {
        this.a = aogoVar;
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        aogo aogoVar = this.a;
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, aogoVar.c, new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, aogoVar.d, 12344});
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            throw new RuntimeException("eglDestroyContext failed");
        }
    }
}
