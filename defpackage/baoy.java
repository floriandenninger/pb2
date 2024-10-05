package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baoy implements bapq {
    private static final FloatBuffer a = aynu.r(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer b = aynu.r(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private final String c;
    private final baox d;
    private int e;
    private int f;
    private int g;
    private int h;
    private ajbh i;

    public baoy() {
        this("void main() {\n  gl_FragColor = sample(tc);\n}\n", new baoz());
    }

    public baoy(String str, baox baoxVar) {
        this.c = str;
        this.d = baoxVar;
    }

    @Override // defpackage.bapq
    public final void a(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        d(1, fArr, i2);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
    }

    @Override // defpackage.bapq
    public final void b(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        d(2, fArr, i2);
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
            this.h = 0;
        }
    }

    public final void d(int i, float[] fArr, int i2) {
        ajbh ajbhVar;
        if (i == this.h) {
            ajbhVar = this.i;
        } else {
            this.h = 0;
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
            sb.append("precision mediump float;\nvarying vec2 tc;\n");
            if (i == 3) {
                sb.append("uniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nvec4 sample(vec2 p) {\n  float y = texture2D(y_tex, p).r * 1.16438;\n  float u = texture2D(u_tex, p).r;\n  float v = texture2D(v_tex, p).r;\n  return vec4(y + 1.59603 * v - 0.874202,\n    y - 0.391762 * u - 0.812968 * v + 0.531668,\n    y + 2.01723 * u - 1.08563, 1);\n}\n");
                sb.append(str);
            } else {
                String str2 = i == 1 ? "samplerExternalOES" : "sampler2D";
                sb.append("uniform ");
                sb.append(str2);
                sb.append(" tex;\n");
                sb.append(str.replace("sample(", "texture2D(tex, "));
            }
            ajbh ajbhVar3 = new ajbh(sb.toString());
            this.h = i;
            this.i = ajbhVar3;
            ajbhVar3.N();
            if (i == 3) {
                GLES20.glUniform1i(ajbhVar3.L("y_tex"), 0);
                GLES20.glUniform1i(ajbhVar3.L("u_tex"), 1);
                GLES20.glUniform1i(ajbhVar3.L("v_tex"), 2);
            } else {
                GLES20.glUniform1i(ajbhVar3.L("tex"), 0);
            }
            aynu.s("Create shader");
            this.d.b(ajbhVar3);
            this.g = ajbhVar3.L("tex_mat");
            this.e = ajbhVar3.K("in_pos");
            this.f = ajbhVar3.K("in_tc");
            ajbhVar = ajbhVar3;
        }
        ajbhVar.N();
        GLES20.glEnableVertexAttribArray(this.e);
        GLES20.glVertexAttribPointer(this.e, 2, 5126, false, 0, (Buffer) a);
        GLES20.glEnableVertexAttribArray(this.f);
        GLES20.glVertexAttribPointer(this.f, 2, 5126, false, 0, (Buffer) b);
        GLES20.glUniformMatrix4fv(this.g, 1, false, fArr, 0);
        this.d.a(fArr, i2);
        aynu.s("Prepare shader");
    }
}
