package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import com.google.cardboard.sdk.EglFactory;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zpe {
    public static final HashMap a = new HashMap();
    private static final HashMap f = new HashMap();
    private static final ThreadLocal g = new ThreadLocal();
    private static final ThreadLocal h = new ThreadLocal();
    public Object b = null;
    public final EGLConfig c;
    public final EGLDisplay d;
    public EGLContext e;
    private EGLSurface i;
    private final int j;
    private final boolean k;
    private final boolean l;

    static {
        new HashMap();
    }

    public zpe(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, EGLSurface eGLSurface, int i, boolean z, boolean z2) {
        this.d = eGLDisplay;
        this.c = eGLConfig;
        this.e = eGLContext;
        this.i = eGLSurface;
        this.j = i;
        this.k = z;
        this.l = z2;
    }

    public static zpe a() {
        return (zpe) g.get();
    }

    public static void c(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        String hexString = Integer.toHexString(eglGetError);
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(hexString).length());
        sb.append("Error executing ");
        sb.append(str);
        sb.append("! EGL error = 0x");
        sb.append(hexString);
        throw new RuntimeException(sb.toString());
    }

    public static void d(EGLSurface eGLSurface) {
        if (amkq.b(eGLSurface, EGL14.EGL_NO_SURFACE)) {
            String valueOf = String.valueOf(p());
            throw new RuntimeException(valueOf.length() != 0 ? "EGL Error: Bad surface: ".concat(valueOf) : new String("EGL Error: Bad surface: "));
        }
    }

    public static void f() {
        EGL14.eglMakeCurrent(EGL14.eglGetCurrentDisplay(), EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        g.set(null);
        c("eglMakeCurrent");
    }

    public static void h(zpe zpeVar) {
        h.set(zpeVar);
    }

    public static final void j(Object obj) {
        HashMap hashMap = f;
        Integer num = (Integer) hashMap.get(obj);
        if (num != null) {
            hashMap.put(obj, Integer.valueOf(num.intValue() + 1));
        } else {
            hashMap.put(obj, 1);
        }
    }

    public static zpe k(arz arzVar) {
        zpe zpeVar = (zpe) h.get();
        if (zpeVar == null) {
            throw new RuntimeException("Can't call forTexture() without main target set.");
        }
        zpeVar.e();
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        art.d("glGenFramebuffers");
        int i = iArr[0];
        GLES20.glBindFramebuffer(36160, i);
        art.d("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, arzVar.b, arzVar.a, 0);
        art.d("glFramebufferTexture2D");
        return new zpe(zpeVar.d, zpeVar.c, zpeVar.e, zpeVar.i, i, false, false);
    }

    public static zpe l(int i, int i2, EGLContext eGLContext) {
        EGLConfig eGLConfig;
        int i3;
        if (eGLContext == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        } else {
            String.valueOf(String.valueOf(eGLContext)).length();
        }
        EGLContext eGLContext2 = EGL14.EGL_NO_CONTEXT;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (!amkq.b(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig n = n(eglGetDisplay, 2);
                if (n != null) {
                    try {
                        eGLContext2 = o(eglGetDisplay, n, 2, eGLContext);
                    } catch (RuntimeException unused) {
                        eGLContext2 = EGL14.EGL_NO_CONTEXT;
                    }
                }
                if (amkq.b(eGLContext2, EGL14.EGL_NO_CONTEXT)) {
                    EGLConfig n2 = n(eglGetDisplay, 1);
                    if (n2 == null) {
                        throw new RuntimeException("Unable to find a suitable EGLConfig");
                    }
                    eGLConfig = n2;
                    eGLContext2 = o(eglGetDisplay, n2, 1, eGLContext);
                } else {
                    eGLConfig = n;
                }
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
                zpe zpeVar = new zpe(eglGetDisplay, eGLConfig, eGLContext2, eglCreatePbufferSurface, 0, true, true);
                j(eglCreatePbufferSurface);
                zpeVar.e();
                int[] iArr2 = new int[1];
                EGL14.eglQueryContext(eglGetDisplay, eGLContext2, EglFactory.EGL_CONTEXT_CLIENT_VERSION, iArr2, 0);
                int i4 = iArr2[0];
                if (i4 >= 3) {
                    GLES20.glGetIntegerv(33307, iArr2, 0);
                    i4 = iArr2[0];
                    GLES20.glGetIntegerv(33308, iArr2, 0);
                    i3 = iArr2[0];
                } else {
                    i3 = -1;
                }
                StringBuilder sb = new StringBuilder(30);
                sb.append("GL context version ");
                sb.append(i4);
                String sb2 = sb.toString();
                if (i3 >= 0) {
                    String.valueOf(String.valueOf(sb2)).length();
                }
                EGL14.eglQueryString(eglGetDisplay, 12372);
                return zpeVar;
            }
            String valueOf = String.valueOf(p());
            throw new RuntimeException(valueOf.length() != 0 ? "EGL Error: eglInitialize failed ".concat(valueOf) : new String("EGL Error: eglInitialize failed "));
        }
        String valueOf2 = String.valueOf(p());
        throw new RuntimeException(valueOf2.length() != 0 ? "EGL Error: Bad display: ".concat(valueOf2) : new String("EGL Error: Bad display: "));
    }

    public static zpe m(int i, int i2) {
        return l(i, i2, null);
    }

    private static EGLConfig n(EGLDisplay eGLDisplay, int i) {
        int[] iArr = {12352, (i != 1 ? 64 : 0) | 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0) {
            return eGLConfigArr[0];
        }
        return null;
    }

    private static EGLContext o(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, EGLContext eGLContext) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, i != 1 ? 3 : 2, 12344}, 0);
        c("eglCreateContext");
        if (!amkq.b(eglCreateContext, EGL14.EGL_NO_CONTEXT)) {
            return eglCreateContext;
        }
        String valueOf = String.valueOf(p());
        throw new RuntimeException(valueOf.length() != 0 ? "EGL Error: Bad context: ".concat(valueOf) : new String("EGL Error: Bad context: "));
    }

    private static String p() {
        return GLUtils.getEGLErrorString(EGL14.eglGetError());
    }

    public final zpe b(SurfaceTexture surfaceTexture) {
        EGLSurface eGLSurface;
        HashMap hashMap = a;
        synchronized (hashMap) {
            EGLSurface eGLSurface2 = (EGLSurface) hashMap.get(surfaceTexture);
            if (eGLSurface2 == null) {
                eGLSurface2 = EGL14.eglCreateWindowSurface(this.d, this.c, surfaceTexture, new int[]{12344}, 0);
                hashMap.put(surfaceTexture, eGLSurface2);
            }
            eGLSurface = eGLSurface2;
        }
        c("eglCreateWindowSurface");
        d(eGLSurface);
        zpe zpeVar = new zpe(this.d, this.c, this.e, eGLSurface, 0, false, true);
        zpeVar.b = surfaceTexture;
        j(eGLSurface);
        return zpeVar;
    }

    public final void e() {
        ThreadLocal threadLocal = g;
        if (((zpe) threadLocal.get()) != this) {
            EGLDisplay eGLDisplay = this.d;
            EGLSurface eGLSurface = this.i;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.e);
            threadLocal.set(this);
        }
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        int i = iArr[0];
        int i2 = this.j;
        if (i != i2) {
            GLES20.glBindFramebuffer(36160, i2);
            art.d("glBindFramebuffer");
        }
    }

    public final void g() {
        if (this.k) {
            EGL14.eglDestroyContext(this.d, this.e);
            this.e = EGL14.EGL_NO_CONTEXT;
            EGL14.eglTerminate(this.d);
        }
        if (this.l) {
            HashMap hashMap = a;
            synchronized (hashMap) {
                EGLSurface eGLSurface = this.i;
                HashMap hashMap2 = f;
                Integer num = (Integer) hashMap2.get(eGLSurface);
                if (num == null || num.intValue() <= 0) {
                    String valueOf = String.valueOf(eGLSurface);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                    sb.append("Removing reference of already released: ");
                    sb.append(valueOf);
                    sb.append("!");
                    Log.e("RenderTarget", sb.toString());
                } else {
                    Integer valueOf2 = Integer.valueOf(num.intValue() - 1);
                    hashMap2.put(eGLSurface, valueOf2);
                    if (valueOf2.intValue() == 0) {
                        EGL14.eglDestroySurface(this.d, this.i);
                        this.i = EGL14.EGL_NO_SURFACE;
                        hashMap.remove(this.b);
                    }
                }
            }
        }
        int i = this.j;
        if (i != 0) {
            art.c("glDeleteFramebuffers");
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            art.d("glDeleteFramebuffers");
        }
    }

    public final void i() {
        int eglGetError;
        if (this.j != 0 || EGL14.eglSwapBuffers(this.d, this.i) || (eglGetError = EGL14.eglGetError()) == 12288) {
            return;
        }
        String valueOf = String.valueOf(Integer.toHexString(eglGetError));
        throw new RuntimeException(valueOf.length() != 0 ? "Error executing eglSwapBuffers! EGL error = 0x".concat(valueOf) : new String("Error executing eglSwapBuffers! EGL error = 0x"));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.i);
        int i = this.j;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 31 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RenderTarget(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(", ");
        sb.append(valueOf3);
        sb.append(", ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
