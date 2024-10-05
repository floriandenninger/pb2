package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Looper;
import android.view.Surface;
import com.google.cardboard.sdk.EglFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vxu implements SurfaceTexture.OnFrameAvailableListener, vxs {
    private static final float[] v = {-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};
    public final int a;
    public final int b;
    public final EGL10 c;
    public EGLDisplay d;
    public EGLContext e;
    public EGLSurface f;
    public FloatBuffer g;
    public final float[] i;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public SurfaceTexture r;
    public Surface s;
    public ByteBuffer u;
    public final float[] h = new float[16];
    public final float[] j = new float[16];
    public final float[] k = new float[16];
    public final AtomicBoolean t = new AtomicBoolean();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v15, types: [int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v24 */
    public vxu(int i, int i2) {
        ?? r11;
        ?? r6;
        int d;
        this.d = EGL10.EGL_NO_DISPLAY;
        this.e = EGL10.EGL_NO_CONTEXT;
        this.f = EGL10.EGL_NO_SURFACE;
        float[] fArr = new float[16];
        this.i = fArr;
        int i3 = 0;
        r11 = 0;
        int i4 = 0;
        vcp.b(i > 0);
        vcp.b(i2 > 0);
        this.a = i;
        this.b = i2;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.c = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.d = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new vxt("unable to get EGL display", new Object[0]);
        }
        if (!egl10.eglInitialize(this.d, new int[2])) {
            throw new vxt("unable to initialize EGL", new Object[0]);
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        if (!egl10.eglChooseConfig(this.d, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344}, eGLConfigArr, 1, iArr)) {
            throw new vxt(String.format("Unable to retrieve list of ES2 frame buffer configurations (EGL error 0x%08x)", Integer.valueOf(egl10.eglGetError())), new Object[0]);
        }
        if (iArr[0] <= 0) {
            throw new vxt("Unable to find RGB888+recordable ES2 EGL config", new Object[0]);
        }
        this.e = egl10.eglCreateContext(this.d, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
        int eglGetError = egl10.eglGetError();
        if (this.e == null || eglGetError != 12288) {
            throw new vxt(String.format("Unable to create context (EGL error 0x%08x)", Integer.valueOf(eglGetError)), new Object[0]);
        }
        this.f = egl10.eglCreatePbufferSurface(this.d, eGLConfigArr[0], new int[]{12375, i, 12374, i2, 12344});
        int eglGetError2 = egl10.eglGetError();
        EGLContext eGLContext = this.e;
        if (eGLContext == null || eglGetError2 != 12288) {
            throw new vxt(String.format("Unable to create surface (EGL error 0x%08x)", Integer.valueOf(eglGetError2)), new Object[0]);
        }
        EGLDisplay eGLDisplay = this.d;
        EGLSurface eGLSurface = this.f;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            float[] fArr2 = v;
            int length = fArr2.length;
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.g = asFloatBuffer;
            try {
                try {
                    d = d(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                } catch (Throwable th) {
                    th = th;
                    r11 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
                    r6 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
                    GLES20.glDeleteShader(r11);
                    GLES20.glDeleteShader(r6);
                    throw th;
                }
                try {
                    int d2 = d(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                    try {
                        int glCreateProgram = GLES20.glCreateProgram();
                        try {
                            if (glCreateProgram == 0) {
                                throw new vxt("Unable to create program", new Object[0]);
                            }
                            GLES20.glAttachShader(glCreateProgram, d);
                            a("glAttachShader - vertexShader");
                            GLES20.glAttachShader(glCreateProgram, d2);
                            a("glAttachShader - pixelShader");
                            GLES20.glLinkProgram(glCreateProgram);
                            int[] iArr2 = new int[1];
                            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                            if (iArr2[0] != 1) {
                                throw new vxt("Could not link program:\n%s", GLES20.glGetProgramInfoLog(glCreateProgram));
                            }
                            GLES20.glDeleteShader(d);
                            GLES20.glDeleteShader(d2);
                            this.l = glCreateProgram;
                            this.p = b(glCreateProgram, "aPosition");
                            this.q = b(this.l, "aTextureCoord");
                            this.n = c(this.l, "uMVPMatrix");
                            this.o = c(this.l, "uSTMatrix");
                            int[] iArr3 = new int[1];
                            GLES20.glGenTextures(1, iArr3, 0);
                            int i5 = iArr3[0];
                            this.m = i5;
                            GLES20.glBindTexture(36197, i5);
                            a("glBindTexture");
                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            a("glTexParameter");
                            int i6 = this.m;
                            vcp.d(Looper.myLooper() == null);
                            SurfaceTexture surfaceTexture = new SurfaceTexture(i6);
                            this.r = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(this);
                            this.s = new Surface(this.r);
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2 * 4);
                            this.u = allocateDirect;
                            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                            Matrix.setIdentityM(fArr, 0);
                            Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
                            Matrix.rotateM(fArr, 0, 0.0f, 0.0f, 0.0f, 1.0f);
                            Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
                        } catch (vxt e) {
                            e = e;
                            i4 = glCreateProgram;
                            GLES20.glDeleteProgram(i4);
                            throw e;
                        }
                    } catch (vxt e2) {
                        e = e2;
                    }
                } catch (vxt e3) {
                    e = e3;
                    GLES20.glDeleteProgram(i4);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    i3 = d;
                    r6 = 0;
                    r11 = i3;
                    GLES20.glDeleteShader(r11);
                    GLES20.glDeleteShader(r6);
                    throw th;
                }
            } catch (vxt e4) {
                e = e4;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new vxt(String.format("eglMakeCurrent failed (EGL error 0x%08x)", Integer.valueOf(egl10.eglGetError())), new Object[0]);
        }
    }

    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw new vxt("Failed: %s, glError: %d", str, Integer.valueOf(glGetError));
        }
    }

    private static int b(int i, String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        if (glGetAttribLocation >= 0) {
            return glGetAttribLocation;
        }
        throw new vxt("Unable to find attribute %s", str);
    }

    private static int c(int i, String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (glGetUniformLocation >= 0) {
            return glGetUniformLocation;
        }
        throw new vxt("Unable to find uniform variable %s", str);
    }

    private static final int d(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            throw new vxt("Unable to create shader. Type: %d", Integer.valueOf(i));
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new vxt("Could not compile shader (Type: %d):\n%s", Integer.valueOf(i), glGetShaderInfoLog);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.t) {
            this.t.set(true);
            this.t.notifyAll();
        }
    }
}
