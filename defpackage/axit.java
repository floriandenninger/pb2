package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axit implements bapq {
    private static final FloatBuffer a = aynu.r(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer b = aynu.r(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private final String c;
    private int d;
    private int e;
    private int f;
    private int g;
    private final axis h;
    private ajbh i;

    public axit(String str, axis axisVar) {
        this.c = str;
        this.h = axisVar;
    }

    private final void d(int i, float[] fArr, int i2, int i3) {
        ajbh ajbhVar;
        if (i == this.g) {
            ajbhVar = this.i;
            ajbhVar.getClass();
        } else {
            this.g = 0;
            ajbh ajbhVar2 = this.i;
            if (ajbhVar2 != null) {
                ajbhVar2.M();
                this.i = null;
            }
            String str = this.c;
            StringBuilder sb = new StringBuilder();
            if (i == 1) {
                sb.append("#extension GL_OES_EGL_image_external : require\n");
            }
            String str2 = i == 1 ? "samplerExternalOES" : "sampler2D";
            sb.append("precision mediump float;\nvarying vec2 tc;\nuniform ");
            sb.append(str2);
            sb.append(" tex;\n");
            sb.append(str.replace("sample(", "texture2D(tex, "));
            ajbh ajbhVar3 = new ajbh(sb.toString());
            this.g = i;
            this.i = ajbhVar3;
            ajbhVar3.N();
            GLES20.glUniform1i(ajbhVar3.L("tex"), 0);
            aynu.s("Create shader");
            axis axisVar = this.h;
            axisVar.b = ajbhVar3.L("xUnit");
            axisVar.c = ajbhVar3.L("yUnit");
            if (axisVar.a > 2) {
                GLES20.glUniform1i(ajbhVar3.L("samplingFactor"), axisVar.a);
            }
            this.f = ajbhVar3.L("tex_mat");
            this.d = ajbhVar3.K("in_pos");
            this.e = ajbhVar3.K("in_tc");
            ajbhVar = ajbhVar3;
        }
        ajbhVar.N();
        GLES20.glEnableVertexAttribArray(this.d);
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) a);
        GLES20.glEnableVertexAttribArray(this.e);
        GLES20.glVertexAttribPointer(this.e, 2, 5126, false, 0, (Buffer) b);
        GLES20.glUniformMatrix4fv(this.f, 1, false, fArr, 0);
        axis axisVar2 = this.h;
        int i4 = axisVar2.a;
        float f = 1.0f / (i2 * i4);
        float f2 = 1.0f / (i4 * i3);
        GLES20.glUniform2f(axisVar2.b, fArr[0] * f, fArr[1] * f);
        GLES20.glUniform2f(axisVar2.c, fArr[4] * f2, fArr[5] * f2);
        aynu.s("Prepare shader");
    }

    @Override // defpackage.bapq
    public final void a(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        d(1, fArr, i6, i7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
    }

    @Override // defpackage.bapq
    public final void b(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        d(2, fArr, i6, i7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    @Override // defpackage.bapq
    public final void c() {
        ajbh ajbhVar = this.i;
        if (ajbhVar != null) {
            ajbhVar.M();
            this.i = null;
            this.g = 0;
        }
    }
}
