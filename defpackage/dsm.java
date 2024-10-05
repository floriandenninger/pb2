package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dsm {
    public final int c;

    public dsm() {
        this.c = 1;
    }

    public dsm(int i) {
        this.c = i;
    }

    public dsm(int i, byte[] bArr) {
        sbt.a(i >= 0, "Margins can not be negative");
        this.c = i;
    }

    public dsm(byte[] bArr) {
        this.c = 6;
    }

    public static boolean d(dsm dsmVar) {
        if (dsmVar == null) {
            return false;
        }
        int i = dsmVar.c;
        return i == 1 || i == 2;
    }

    public static boolean e(dsm dsmVar) {
        return dsmVar != null && dsmVar.c == 2;
    }

    public static dsm f() {
        return new dsm();
    }

    public final boolean a() {
        return (this.c & 2) != 0;
    }

    public final void b() {
        GLES20.glDeleteShader(this.c);
    }

    public final int c(int i) {
        return Math.min(this.c, i);
    }

    public dsm(String str, int i) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        this.c = glCreateShader;
        amkq.N(glCreateShader != 0);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new absh(glGetShaderInfoLog);
    }

    public dsm(Context context, apdb apdbVar) {
        boolean isLowRamDevice = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        float f = isLowRamDevice ? apdbVar.d : apdbVar.c;
        f = f <= 0.0f ? true != isLowRamDevice ? 4.0f : 2.5f : f;
        cul culVar = new cul(context);
        culVar.f = 0;
        culVar.a(0.0f);
        culVar.b(f);
        this.c = culVar.c().c;
    }
}
