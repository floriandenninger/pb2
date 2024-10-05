package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.google.mediapipe.framework.TextureFrame;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aogf implements GLSurfaceView.Renderer {
    private int h;
    private int i;
    private int j;
    private int k;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 36197;
    public float e = 0.5f;
    public float f = 0.5f;
    private final float[] l = new float[16];
    public final AtomicReference g = new AtomicReference();

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        TextureFrame textureFrame = null;
        TextureFrame textureFrame2 = (TextureFrame) this.g.getAndSet(null);
        GLES20.glClear(16384);
        aogs.c("glClear");
        if (textureFrame2 != null) {
            GLES20.glActiveTexture(33984);
            aogs.c("glActiveTexture");
            GLES20.glBindTexture(this.d, textureFrame2.getTextureName());
            aogs.c("glBindTexture");
            GLES20.glTexParameteri(this.d, 10241, 9729);
            GLES20.glTexParameteri(this.d, 10240, 9729);
            GLES20.glTexParameteri(this.d, 10242, 33071);
            GLES20.glTexParameteri(this.d, 10243, 33071);
            aogs.c("texture setup");
            GLES20.glUseProgram(this.c);
            GLES20.glUniform1i(this.j, 0);
            GLES20.glUniformMatrix4fv(this.k, 1, false, this.l, 0);
            aogs.c("glUniformMatrix4fv");
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, (Buffer) aogn.a);
            int i = this.a;
            float f = i > 0 ? this.h / i : 1.0f;
            int i2 = this.b;
            float f2 = i2 > 0 ? this.i / i2 : 1.0f;
            float max = Math.max(f, f2);
            float f3 = f / max;
            float f4 = f2 / max;
            float f5 = (1.0f - f3) * this.e;
            float f6 = (1.0f - f4) * this.f;
            float[] fArr = {f5, f5 + f3, f6, f6 + f4};
            float f7 = fArr[0];
            float f8 = fArr[1];
            float f9 = fArr[2];
            float f10 = fArr[3];
            FloatBuffer b = aogs.b(f7, f9, f8, f9, f7, f10, f8, f10);
            GLES20.glEnableVertexAttribArray(2);
            GLES20.glVertexAttribPointer(2, 2, 5126, false, 0, (Buffer) b);
            aogs.c("program setup");
            GLES20.glDrawArrays(5, 0, 4);
            aogs.c("glDrawArrays");
            GLES20.glBindTexture(this.d, 0);
            aogs.c("unbind surfaceTexture");
            textureFrame = textureFrame2;
        }
        GLES20.glFlush();
        if (textureFrame != null) {
            textureFrame.release();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.h = i;
        this.i = i2;
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Matrix.setIdentityM(this.l, 0);
        HashMap hashMap = new HashMap();
        hashMap.put("position", 1);
        hashMap.put("texture_coordinate", 2);
        int d = aogs.d(this.d != 36197 ? "varying mediump vec2 sample_coordinate;\nuniform sampler2D video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}" : "#extension GL_OES_EGL_image_external : require\nvarying mediump vec2 sample_coordinate;\nuniform samplerExternalOES video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}", hashMap);
        this.c = d;
        this.j = GLES20.glGetUniformLocation(d, "video_frame");
        this.k = GLES20.glGetUniformLocation(this.c, "texture_transform");
        aogs.c("glGetUniformLocation");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }
}
