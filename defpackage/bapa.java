package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bapa {
    public int a;
    public int b;
    public int c = 0;
    public int d = 0;
    private final int e;

    public bapa(int i) {
        this.e = i;
    }

    public final void a() {
        GLES20.glDeleteTextures(1, new int[]{this.b}, 0);
        this.b = 0;
        GLES20.glDeleteFramebuffers(1, new int[]{this.a}, 0);
        this.a = 0;
        this.c = 0;
        this.d = 0;
    }

    public final void b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid size: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i == this.c && i2 == this.d) {
            return;
        }
        this.c = i;
        this.d = i2;
        if (this.b == 0) {
            this.b = aynu.q(3553);
        }
        if (this.a == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.a = iArr[0];
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.b);
        int i3 = this.e;
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i3, 5121, null);
        GLES20.glBindTexture(3553, 0);
        aynu.s("GlTextureFrameBuffer setSize");
        GLES20.glBindFramebuffer(36160, this.a);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.b, 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            StringBuilder sb2 = new StringBuilder(45);
            sb2.append("Framebuffer not complete, status: ");
            sb2.append(glCheckFramebufferStatus);
            throw new IllegalStateException(sb2.toString());
        }
        GLES20.glBindFramebuffer(36160, 0);
    }
}
