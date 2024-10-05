package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vtu {
    private static final float[] a = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    private static final float[] b = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private FloatBuffer j;
    private FloatBuffer k;

    public vtu() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.h = c(35633, "attribute vec4 aPos;\nattribute vec4 aTexCoord;\nvarying vec2 vTexCoord;\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nvoid main() {\n  gl_Position = uMVPMatrix * aPos;\n  vTexCoord = (uSTMatrix * aTexCoord).xy;\n}\n");
        this.i = c(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTexCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTexCoord);\n}\n");
        int glCreateProgram = GLES20.glCreateProgram();
        this.g = glCreateProgram;
        if (glCreateProgram == 0) {
            throw new RuntimeException("Failed to initialize shader program.");
        }
        GLES20.glAttachShader(glCreateProgram, this.h);
        vlu.d("Failed to attach vertex shader.");
        GLES20.glAttachShader(this.g, this.i);
        vlu.d("Failed to attach fragment shader.");
        GLES20.glLinkProgram(this.g);
        vlu.d("Failed to link shader program.");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(384).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.j = asFloatBuffer;
        asFloatBuffer.put(a);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(256).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.k = asFloatBuffer2;
        asFloatBuffer2.put(b);
        this.c = GLES20.glGetAttribLocation(this.g, "aPos");
        this.d = GLES20.glGetAttribLocation(this.g, "aTexCoord");
        this.e = GLES20.glGetUniformLocation(this.g, "uMVPMatrix");
        this.f = GLES20.glGetUniformLocation(this.g, "uSTMatrix");
    }

    private static int c(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        vlu.d("Failed to create shader.");
        if (glCreateShader <= 0) {
            throw new RuntimeException("Create shader returned invalid result.");
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        vlu.d("Failed to compile shader.");
        return glCreateShader;
    }

    public final void a(int i, float[] fArr, float[] fArr2) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.g);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glVertexAttribPointer(this.c, 3, 5126, false, 0, (Buffer) this.j);
        vlu.d("Failed to attach vertices.");
        GLES20.glEnableVertexAttribArray(this.c);
        vlu.d("Failed to enable vertex array.");
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) this.k);
        vlu.d("Failed to attach texture coordinates.");
        GLES20.glEnableVertexAttribArray(this.d);
        vlu.d("Failed to enable texture coordinate array.");
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        Matrix.orthoM(fArr3, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
        float[] fArr4 = new float[16];
        Matrix.multiplyMM(fArr4, 0, fArr3, 0, fArr, 0);
        GLES20.glUniformMatrix4fv(this.e, 1, false, fArr4, 0);
        GLES20.glUniformMatrix4fv(this.f, 1, false, fArr2, 0);
        GLES20.glDrawArrays(5, 0, 4);
        vlu.d("Failed to draw texture.");
        GLES20.glBindTexture(36197, 0);
        GLES20.glUseProgram(0);
    }

    public final void b() {
        GLES20.glDeleteProgram(this.g);
        this.g = 0;
        vlu.d("Failed to delete shader program.");
        GLES20.glDeleteShader(this.h);
        this.h = 0;
        vlu.d("Failed to delete vertex shader.");
        GLES20.glDeleteShader(this.i);
        this.i = 0;
        vlu.d("Failed to delete fragment shader.");
    }
}
