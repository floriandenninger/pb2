package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class absf {
    private final int a;
    private final Map b;
    private final Map c;
    private final dsm d;
    private final dsm e;

    public absf(absg absgVar) {
        dsm dsmVar = new dsm(absgVar.a, 35633);
        dsm dsmVar2 = new dsm(absgVar.b, 35632);
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = dsmVar;
        this.e = dsmVar2;
        int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        amkq.N(glCreateProgram != 0);
        GLES20.glAttachShader(glCreateProgram, dsmVar.c);
        GLES20.glAttachShader(glCreateProgram, dsmVar2.c);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return;
        }
        GLES20.glDeleteProgram(glCreateProgram);
        throw new absh("Program link failed");
    }

    public static final void g(int i, int i2) {
        GLES20.glActiveTexture(33984);
        adyu.cW("glActiveTexture");
        GLES20.glBindTexture(i, i2);
        adyu.cW("glBindTexture");
    }

    public static final void h() {
        GLES20.glBindTexture(36197, 0);
        adyu.cW("glBindTexture");
        GLES20.glUseProgram(0);
        adyu.cW("glUseProgram");
    }

    private final int i(String str) {
        if (this.c.containsKey(str)) {
            return ((Integer) this.c.get(str)).intValue();
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.a, str);
        adyu.cX(glGetAttribLocation, str);
        adyu.cW("glGetAttribLocation");
        this.c.put(str, Integer.valueOf(glGetAttribLocation));
        return glGetAttribLocation;
    }

    private final int j(String str) {
        if (this.b.containsKey(str)) {
            return ((Integer) this.b.get(str)).intValue();
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.a, str);
        adyu.cX(glGetUniformLocation, str);
        adyu.cW("glGetUniformLocation");
        this.b.put(str, Integer.valueOf(glGetUniformLocation));
        return glGetUniformLocation;
    }

    public final void a(int i, int i2) {
        GLES20.glUseProgram(this.a);
        adyu.cW("glUseProgram");
        GLES20.glBindTexture(i, i2);
        adyu.cW("glBindTexture");
    }

    public final void b(String str) {
        GLES20.glDisableVertexAttribArray(i(str));
        adyu.cW("glDisableVertexAttribArray");
    }

    public final void c(String str, FloatBuffer floatBuffer) {
        int i = i(str);
        GLES20.glEnableVertexAttribArray(i);
        adyu.cW("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, (Buffer) floatBuffer);
        adyu.cW("glVertexAttribPointer");
    }

    public final void d() {
        GLES20.glDeleteProgram(this.a);
        this.d.b();
        this.e.b();
    }

    public final void e(String str, float f) {
        GLES20.glUniform1f(j(str), f);
    }

    public final void f(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(j(str), 1, false, fArr, 0);
    }
}
