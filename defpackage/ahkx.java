package defpackage;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahkx {
    private final int a;
    private final int b;
    private int c;

    public ahkx(float[] fArr, int i) {
        this.c = 0;
        fArr.getClass();
        amkq.E(fArr.length % i == 0);
        this.b = i;
        this.a = i * 4;
        FloatBuffer e = ahkt.e(fArr);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        ahkt.g(iArr[0]);
        int i2 = iArr[0];
        this.c = i2;
        GLES20.glBindBuffer(34962, i2);
        GLES20.glBufferData(34962, e.capacity() * 4, e, 35044);
        GLES20.glBindBuffer(34962, 0);
    }

    public final void a(int i) {
        int i2 = this.c;
        if (i2 != 0) {
            GLES20.glBindBuffer(34962, i2);
            GLES20.glVertexAttribPointer(i, this.b, 5126, false, this.a, 0);
            GLES20.glBindBuffer(34962, 0);
            Boolean bool = ahkt.a;
        }
    }

    public final void b() {
        int i = this.c;
        if (i != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i}, 0);
            this.c = 0;
            Boolean bool = ahkt.a;
        }
    }
}
