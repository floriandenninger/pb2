package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abqy implements abrp {
    public int a = 1;
    public int b = 1;
    private final abqx c;
    private int d;
    private int e;

    public abqy(abqx abqxVar) {
        this.c = abqxVar;
    }

    public final void a() {
        int i = this.d;
        if (i != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.d = 0;
        }
        int i2 = this.e;
        if (i2 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.e = 0;
        }
    }

    public final void b(int i, int i2) {
        if (this.a == i && this.b == i2) {
            return;
        }
        this.a = i;
        this.b = i2;
        a();
    }

    @Override // defpackage.abrp
    public final void c(abqu abquVar) {
        a();
    }

    @Override // defpackage.abrp
    public final boolean e(boolean z, abrr abrrVar, abqu abquVar) {
        if (this.d == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.d = iArr[0];
            GLES20.glGenTextures(1, iArr, 0);
            this.e = iArr[0];
            GLES20.glBindFramebuffer(36160, this.d);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.e);
            GLES20.glTexImage2D(3553, 0, 6408, this.a, this.b, 0, 6408, 5121, null);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.e, 0);
            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (glCheckFramebufferStatus != 36053) {
                String valueOf = String.valueOf(this);
                int glGetError = GLES20.glGetError();
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78);
                sb.append(valueOf);
                sb.append(": Failed to set up render buffer with status ");
                sb.append(glCheckFramebufferStatus);
                sb.append(" and error ");
                sb.append(glGetError);
                throw new RuntimeException(sb.toString());
            }
            this.c.a(this.e);
        }
        int[] iArr2 = new int[4];
        GLES20.glGetIntegerv(2978, iArr2, 0);
        GLES20.glBindFramebuffer(36160, this.d);
        GLES20.glViewport(0, 0, this.a, this.b);
        abrrVar.qQ(z, this.a, this.b, abrr.b);
        this.c.b();
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
        return true;
    }
}
