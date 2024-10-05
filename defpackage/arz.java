package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arz {
    public int a;
    public final int b;
    private final boolean c;

    public arz(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public static arz a(int i) {
        return new arz(i, 3553, false);
    }

    public static arz b() {
        return new arz(art.b(), 3553, true);
    }

    public final void c(int i, int i2) {
        int i3 = this.a;
        int i4 = this.b;
        GLES20.glBindTexture(i4, i3);
        GLES20.glTexImage2D(i4, 0, 6408, i, i2, 0, 6408, 5121, null);
        art.d("glTexImage2D");
        art.e();
    }

    public final void d() {
        if (GLES20.glIsTexture(this.a) && this.c) {
            int[] iArr = {this.a};
            art.c("glDeleteTextures");
            GLES20.glDeleteTextures(1, iArr, 0);
            art.d("glDeleteTextures");
        }
        this.a = 0;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(49);
        sb.append("TextureSource(id=");
        sb.append(i);
        sb.append(", target=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
