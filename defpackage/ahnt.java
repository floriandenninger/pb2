package defpackage;

import android.opengl.GLES20;
import android.opengl.GLU;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahnt {
    private final String a;
    private boolean b;
    public int c;

    public ahnt(String str, String str2) {
        String simpleName = getClass().getSimpleName();
        this.a = simpleName;
        String valueOf = String.valueOf(simpleName);
        if (valueOf.length() != 0) {
            "Creating program ".concat(valueOf);
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.c = glCreateProgram;
        ahkt.g(glCreateProgram);
        int a = a(35633, str);
        int a2 = a(35632, str2);
        GLES20.glAttachShader(this.c, a);
        GLES20.glAttachShader(this.c, a2);
        GLES20.glLinkProgram(this.c);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.c, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 27 + String.valueOf(glGetProgramInfoLog).length());
            sb.append("Failed to link GlProgram ");
            sb.append(simpleName);
            sb.append(": ");
            sb.append(glGetProgramInfoLog);
            zga.b(sb.toString());
            StringBuilder sb2 = new StringBuilder(String.valueOf(simpleName).length() + 27 + String.valueOf(glGetProgramInfoLog).length());
            sb2.append("Failed to link GlProgram ");
            sb2.append(simpleName);
            sb2.append(": ");
            sb2.append(glGetProgramInfoLog);
            throw new ahkr(sb2.toString());
        }
        GLES20.glDeleteShader(a);
        GLES20.glDeleteShader(a2);
    }

    private final int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        ahkt.g(glCreateShader);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 41 + String.valueOf(glGetShaderInfoLog).length());
        sb.append("Failed to compile shader for GlProgram ");
        sb.append(str2);
        sb.append(": ");
        sb.append(glGetShaderInfoLog);
        zga.b(sb.toString());
        String str3 = this.a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 41 + String.valueOf(glGetShaderInfoLog).length());
        sb2.append("Failed to compile shader for GlProgram ");
        sb2.append(str3);
        sb2.append(": ");
        sb2.append(glGetShaderInfoLog);
        throw new ahkr(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int e(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.c, str);
        g(glGetAttribLocation, str);
        return glGetAttribLocation;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int f(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.c, str);
        g(glGetUniformLocation, str);
        return glGetUniformLocation;
    }

    protected final void g(int i, String str) {
        if (i != -1) {
            return;
        }
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                String str2 = this.a;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 23 + String.valueOf(str).length());
                sb.append("Invalid GL location: ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str);
                zga.b(sb.toString());
                return;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            zga.b(valueOf.length() != 0 ? "GL error ".concat(valueOf) : new String("GL error "));
        }
    }

    public final void h() {
        if (this.b) {
            return;
        }
        int[] iArr = new int[1];
        GLES20.glValidateProgram(this.c);
        GLES20.glGetProgramiv(this.c, 35715, iArr, 0);
        if (iArr[0] != 1) {
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.c);
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31 + String.valueOf(glGetProgramInfoLog).length());
            sb.append("Failed to validate GlProgram ");
            sb.append(str);
            sb.append(": ");
            sb.append(glGetProgramInfoLog);
            zga.b(sb.toString());
            String str2 = this.a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 31 + String.valueOf(glGetProgramInfoLog).length());
            sb2.append("Failed to validate GlProgram ");
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(glGetProgramInfoLog);
            throw new ahkr(sb2.toString());
        }
        this.b = true;
    }

    public void i() {
        String valueOf = String.valueOf(this.a);
        if (valueOf.length() != 0) {
            "Deleting program ".concat(valueOf);
        }
        int i = this.c;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            Boolean bool = ahkt.a;
            this.c = 0;
        }
    }

    public final void j() {
        GLES20.glUseProgram(this.c);
        Boolean bool = ahkt.a;
    }
}
