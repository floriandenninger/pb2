package defpackage;

import android.util.Log;
import com.google.cardboard.sdk.EglFactory;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aogo {
    public final EGL10 a;
    public EGLDisplay b;
    public int d;
    private EGLConfig f = null;
    public EGLContext c = EGL10.EGL_NO_CONTEXT;
    public long e = 0;
    private final int[] g = new int[1];

    public aogo(Object obj) {
        this.b = EGL10.EGL_NO_DISPLAY;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.a = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.b = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        if (egl10.eglInitialize(this.b, new int[2])) {
            obj = obj == null ? EGL10.EGL_NO_CONTEXT : obj;
            try {
                e((EGLContext) obj, 3);
                this.d = 3;
                return;
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                sb.append("could not create GLES 3 context: ");
                sb.append(valueOf);
                Log.w("EglManager", sb.toString());
                e((EGLContext) obj, 2);
                this.d = 2;
                return;
            }
        }
        throw new RuntimeException("eglInitialize failed");
    }

    private final void e(EGLContext eGLContext, int i) {
        EGLConfig eGLConfig;
        int[] iArr = new int[15];
        iArr[0] = 12324;
        iArr[1] = 8;
        iArr[2] = 12323;
        iArr[3] = 8;
        iArr[4] = 12322;
        iArr[5] = 8;
        iArr[6] = 12321;
        iArr[7] = 8;
        iArr[8] = 12325;
        iArr[9] = 16;
        iArr[10] = 12352;
        iArr[11] = i == 3 ? 64 : 4;
        iArr[12] = 12339;
        iArr[13] = 5;
        iArr[14] = 12344;
        int[] iArr2 = this.g;
        if (this.a.eglChooseConfig(this.b, iArr, null, 0, iArr2)) {
            int i2 = iArr2[0];
            if (i2 > 0) {
                EGLConfig[] eGLConfigArr = new EGLConfig[i2];
                if (!this.a.eglChooseConfig(this.b, iArr, eGLConfigArr, i2, iArr2)) {
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        eGLConfig = null;
                        break;
                    }
                    eGLConfig = eGLConfigArr[i3];
                    int f = f(eGLConfig, 12324);
                    int f2 = f(eGLConfig, 12323);
                    int f3 = f(eGLConfig, 12322);
                    int f4 = f(eGLConfig, 12321);
                    if (f == 8 && f2 == 8 && f3 == 8 && f4 == 8) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (eGLConfig == null) {
                    eGLConfig = eGLConfigArr[0];
                }
                this.f = eGLConfig;
                if (eGLConfig == null) {
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                EGLContext eglCreateContext = this.a.eglCreateContext(this.b, eGLConfig, eGLContext, new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, i, 12344});
                this.c = eglCreateContext;
                if (eglCreateContext == null || eglCreateContext == EGL10.EGL_NO_CONTEXT) {
                    int eglGetError = this.a.eglGetError();
                    String hexString = Integer.toHexString(eglGetError);
                    String str = eglGetError == 12294 ? ": parent context uses a different version of OpenGL" : "";
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 42 + str.length());
                    sb.append("Could not create GL context: EGL error: 0x");
                    sb.append(hexString);
                    sb.append(str);
                    throw new RuntimeException(sb.toString());
                }
                return;
            }
            throw new IllegalArgumentException("No configs match requested attributes");
        }
        throw new IllegalArgumentException("eglChooseConfig failed");
    }

    private final int f(EGLConfig eGLConfig, int i) {
        if (this.a.eglGetConfigAttrib(this.b, eGLConfig, i, this.g)) {
            return this.g[0];
        }
        return 0;
    }

    public final void a(EGLSurface eGLSurface, EGLSurface eGLSurface2) {
        if (!this.a.eglMakeCurrent(this.b, eGLSurface, eGLSurface2, this.c)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void b() {
        if (this.b != EGL10.EGL_NO_DISPLAY) {
            this.a.eglMakeCurrent(this.b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            this.a.eglDestroyContext(this.b, this.c);
            this.a.eglTerminate(this.b);
        }
        this.b = EGL10.EGL_NO_DISPLAY;
        this.c = EGL10.EGL_NO_CONTEXT;
        this.f = null;
    }

    public final void c(EGLSurface eGLSurface) {
        this.a.eglDestroySurface(this.b, eGLSurface);
    }

    public final EGLSurface d() {
        EGLSurface eglCreatePbufferSurface = this.a.eglCreatePbufferSurface(this.b, this.f, new int[]{12375, 1, 12374, 1, 12344});
        int eglGetError = this.a.eglGetError();
        if (eglGetError == 12288) {
            if (eglCreatePbufferSurface != null) {
                return eglCreatePbufferSurface;
            }
            throw new RuntimeException("surface was null");
        }
        String hexString = Integer.toHexString(eglGetError);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 38);
        sb.append("eglCreatePbufferSurface: EGL error: 0x");
        sb.append(hexString);
        throw new RuntimeException(sb.toString());
    }
}
