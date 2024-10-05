package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahno extends ahnt {
    public final int a;
    private final int b;
    private final int d;

    public ahno(String str, String str2) {
        super(str, str2);
        this.b = e("aPosition");
        this.d = f("uMVP");
        this.a = f("uOpacity");
    }

    public void c(ahku ahkuVar) {
        ahkuVar.d.a(this.b);
        GLES20.glDrawArrays(ahkuVar.g, 0, ahkuVar.f);
        Boolean bool = ahkt.a;
    }

    public void d() {
        GLES20.glEnableVertexAttribArray(this.b);
        Boolean bool = ahkt.a;
    }

    public void k() {
        GLES20.glDisableVertexAttribArray(this.b);
        Boolean bool = ahkt.a;
    }

    public final void l(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.d, 1, false, fArr, 0);
        Boolean bool = ahkt.a;
    }
}
