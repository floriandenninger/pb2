package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acal {
    public static final FloatBuffer a;
    public static final FloatBuffer b;
    public static final int c = 4;
    private static final float[] j;
    private static final float[] k;
    public final float[] d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        j = fArr;
        float[] fArr2 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        k = fArr2;
        a = a(fArr);
        b = a(fArr2);
    }

    public acal() {
        int c2;
        float[] fArr = new float[16];
        this.d = fArr;
        int i = 0;
        Matrix.setIdentityM(fArr, 0);
        int c3 = c(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
        if (c3 != 0 && (c2 = c(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) != 0) {
            int glCreateProgram = GLES20.glCreateProgram();
            adyu.cW("glCreateProgram");
            if (glCreateProgram == 0) {
                Log.e("TextureBlitter", "Could not create program");
                glCreateProgram = 0;
            }
            GLES20.glAttachShader(glCreateProgram, c3);
            adyu.cW("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, c2);
            adyu.cW("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                Log.e("TextureBlitter", "Could not link program: ");
                Log.e("TextureBlitter", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i = glCreateProgram;
            }
        }
        this.i = i;
        if (i == 0) {
            throw new RuntimeException("Unable to create program");
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.e = glGetAttribLocation;
        b(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.i, "aTextureCoord");
        this.f = glGetAttribLocation2;
        b(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.i, "uMVPMatrix");
        this.g = glGetUniformLocation;
        b(glGetUniformLocation, "uMVPMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.i, "uTexMatrix");
        this.h = glGetUniformLocation2;
        b(glGetUniformLocation2, "uTexMatrix");
    }

    private static FloatBuffer a(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        return asFloatBuffer;
    }

    private static final void b(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Unable to locate '");
        sb.append(str);
        sb.append("' in program");
        throw new RuntimeException(sb.toString());
    }

    private static final int c(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        StringBuilder sb = new StringBuilder(31);
        sb.append("glCreateShader type=");
        sb.append(i);
        adyu.cW(sb.toString());
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Could not compile shader ");
        sb2.append(i);
        sb2.append(":");
        Log.e("TextureBlitter", sb2.toString());
        String valueOf = String.valueOf(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e("TextureBlitter", valueOf.length() != 0 ? " ".concat(valueOf) : new String(" "));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
