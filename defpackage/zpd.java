package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zpd {
    private int a;
    private HashMap g;
    private int b = 5;
    private int c = 4;
    private int d = 33984;
    private float[] e = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    private float[] f = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    private HashMap h = new HashMap();
    private final List i = new ArrayList();

    public zpd(String str) {
        this.a = 0;
        int e = e(35633, "attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n");
        if (e == 0) {
            throw new RuntimeException("Could not create shader-program as vertex shader could not be compiled!");
        }
        int e2 = e(35632, str);
        if (e2 == 0) {
            throw new RuntimeException("Could not create shader-program as fragment shader could not be compiled!");
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, e);
            wcy.F("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, e2);
            wcy.F("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
                GLES20.glDeleteProgram(glCreateProgram);
                String valueOf = String.valueOf(glGetProgramInfoLog);
                throw new RuntimeException(valueOf.length() != 0 ? "Could not link program: ".concat(valueOf) : new String("Could not link program: "));
            }
        }
        GLES20.glDeleteShader(e);
        GLES20.glDeleteShader(e2);
        this.a = glCreateProgram;
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35718, iArr2, 0);
        int i = iArr2[0];
        if (i > 0) {
            this.g = new HashMap(i);
            for (int i2 = 0; i2 < iArr2[0]; i2++) {
                ammr ammrVar = new ammr(this.a, i2);
                this.g.put(ammrVar.b, ammrVar);
            }
        }
    }

    public static zpd a() {
        return new zpd("precision lowp float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
    }

    private static int e(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
                StringBuilder sb = new StringBuilder(String.valueOf(glGetShaderInfoLog).length() + 37);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                sb.append(glGetShaderInfoLog);
                throw new RuntimeException(sb.toString());
            }
        }
        return glCreateShader;
    }

    private final zpc f(String str) {
        int glGetAttribLocation;
        zpc zpcVar = (zpc) this.h.get(str);
        if (zpcVar != null || (glGetAttribLocation = GLES20.glGetAttribLocation(this.a, str)) < 0) {
            return zpcVar;
        }
        zpc zpcVar2 = new zpc(str, glGetAttribLocation);
        this.h.put(str, zpcVar2);
        return zpcVar2;
    }

    public final String b(int i) {
        while (this.i.size() <= i) {
            List list = this.i;
            int size = list.size();
            StringBuilder sb = new StringBuilder(23);
            sb.append("tex_sampler_");
            sb.append(size);
            list.add(sb.toString());
        }
        return (String) this.i.get(i);
    }

    public final void c(arz arzVar, zpe zpeVar, int i, int i2) {
        arz[] arzVarArr = {arzVar};
        wcy.F("Unknown Operation");
        if (this.a != 0) {
            zpeVar.e();
            GLES20.glViewport(0, 0, i, i2);
            wcy.F("glViewport");
            GLES20.glUseProgram(this.a);
            wcy.F("glUseProgram");
            zpc f = f("a_texcoord");
            float[] fArr = this.e;
            if (fArr != null && f != null) {
                f.a(fArr);
            }
            this.e = null;
            zpc f2 = f("a_position");
            float[] fArr2 = this.f;
            if (fArr2 != null && f2 != null) {
                f2.a(fArr2);
            }
            this.f = null;
            for (zpc zpcVar : this.h.values()) {
                if (zpcVar.e != null) {
                    GLES20.glBindBuffer(34962, 0);
                    GLES20.glVertexAttribPointer(zpcVar.a, zpcVar.c, zpcVar.d, false, zpcVar.b, (Buffer) zpcVar.e);
                } else {
                    GLES20.glBindBuffer(34962, 0);
                    GLES20.glVertexAttribPointer(zpcVar.a, zpcVar.c, zpcVar.d, false, zpcVar.b, 0);
                }
                GLES20.glEnableVertexAttribArray(zpcVar.a);
                wcy.F("Set vertex-attribute values");
            }
            wcy.F("Push Attributes");
            GLES20.glDisable(3042);
            wcy.F("Set render variables");
            for (int i3 = 0; i3 <= 0; i3++) {
                GLES20.glActiveTexture(this.d + i3);
                arz arzVar2 = arzVarArr[i3];
                GLES20.glBindTexture(arzVar2.b, arzVar2.a);
                art.d("glBindTexture");
                int glGetUniformLocation = GLES20.glGetUniformLocation(this.a, b(i3));
                if (glGetUniformLocation >= 0) {
                    GLES20.glUniform1i(glGetUniformLocation, i3);
                    Integer valueOf = Integer.valueOf(i3);
                    int glGetError = GLES20.glGetError();
                    if (glGetError != 0) {
                        String valueOf2 = String.valueOf(valueOf);
                        String hexString = Integer.toHexString(glGetError);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 52 + String.valueOf(hexString).length());
                        sb.append("GL Operation 'Binding input texture ");
                        sb.append(valueOf2);
                        sb.append("' caused error ");
                        sb.append(hexString);
                        sb.append("!");
                        throw new RuntimeException(sb.toString());
                    }
                } else {
                    String b = b(i3);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 87);
                    sb2.append("Shader does not seem to support 1 number of input textures! Missing uniform ");
                    sb2.append(b);
                    sb2.append("!");
                    throw new RuntimeException(sb2.toString());
                }
            }
            GLES20.glDrawArrays(this.b, 0, this.c);
            wcy.F("glDrawArrays");
            return;
        }
        throw new RuntimeException("Attempting to execute invalid shader-program!");
    }

    public final void d(float[] fArr) {
        this.e = Arrays.copyOf(new float[]{fArr[12], fArr[13], fArr[0] + fArr[12], fArr[1] + fArr[13], fArr[4] + fArr[12], fArr[5] + fArr[13], fArr[0] + fArr[4] + fArr[12], fArr[1] + fArr[5] + fArr[13]}, 8);
    }

    protected final void finalize() {
        GLES20.glDeleteProgram(this.a);
    }
}
