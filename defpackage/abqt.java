package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abqt {
    private static final FloatBuffer a = c(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer b = c(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private final absg c;
    private final float[] f;
    private int h;
    private absf i;
    private final float[] d = new float[16];
    private final float[] e = new float[16];
    private final float[] g = new float[16];

    public abqt(absg absgVar) {
        float[] fArr = new float[16];
        this.f = fArr;
        this.c = absgVar;
        Matrix.setIdentityM(fArr, 0);
    }

    private static FloatBuffer c(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        return asFloatBuffer;
    }

    public final synchronized void a() {
        this.h = 0;
        absf absfVar = this.i;
        if (absfVar != null) {
            absfVar.d();
            this.i = null;
        }
    }

    public final synchronized void b(int i, int i2, int i3, int i4, int i5) {
        if (i == 0) {
            return;
        }
        if (this.h != i) {
            GLES20.glBindTexture(3553, i);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            adyu.cW("glTexParameter");
            this.h = i;
            amkq.N(i != 0);
            this.i = new absf(this.c);
        }
        float f = i4 >= 0 ? 1.0f : -1.0f;
        int abs = Math.abs(i4);
        float f2 = (i2 / i3) / (abs / i5);
        Matrix.setIdentityM(this.g, 0);
        Matrix.translateM(this.g, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(this.g, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(this.g, 0, -0.5f, -0.5f, 0.0f);
        Matrix.setIdentityM(this.f, 0);
        Matrix.translateM(this.f, 0, 0.0f, 0.0f, 0.0f);
        Matrix.scaleM(this.f, 0, 1.0f, 1.0f, 1.0f);
        Matrix.setIdentityM(this.d, 0);
        Matrix.multiplyMM(this.e, 0, this.d, 0, this.g, 0);
        Matrix.translateM(this.e, 0, 0.5f, 0.5f, 0.0f);
        Matrix.scaleM(this.e, 0, f * Math.min(1.0f, 1.0f / f2), Math.min(1.0f, f2), 1.0f);
        Matrix.translateM(this.e, 0, -0.5f, -0.5f, 0.0f);
        this.i.a(3553, i);
        absf.g(3553, i);
        this.i.f("u_MVPMatrix", this.f);
        this.i.f("u_TextureMatrix", this.e);
        this.i.c("a_Position", a);
        this.i.c("a_TextureCoord", b);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glGetError();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glEnable(3089);
        GLES20.glScissor(0, 0, abs, 1);
        GLES20.glClear(16384);
        GLES20.glDisable(3089);
        this.i.b("a_Position");
        this.i.b("a_TextureCoord");
        absf.h();
    }
}
